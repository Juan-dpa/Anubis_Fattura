package wocwvy.czyxoxmbauu.slsa.oyqwzkyy;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.a */
/* JADX INFO: loaded from: classes.dex */
public class C0046a {

    /* JADX INFO: renamed from: a */
    private int[] f487a;

    /* JADX INFO: renamed from: b */
    private int f488b = 0;

    /* JADX INFO: renamed from: c */
    private int f489c = 0;

    public C0046a(byte[] bArr) {
        this.f487a = m292c(bArr);
    }

    /* JADX INFO: renamed from: a */
    private void m291a(int i, int i2, int[] iArr) {
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
    }

    /* JADX INFO: renamed from: c */
    private int[] m292c(byte[] bArr) {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            i2 = (((i2 + iArr[i3]) + bArr[i3 % bArr.length]) + 256) % 256;
            m291a(i3, i2, iArr);
        }
        return iArr;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m293a(byte[] bArr) {
        return m294b(bArr);
    }

    /* JADX INFO: renamed from: b */
    public byte[] m294b(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            this.f488b = (this.f488b + 1) % 256;
            this.f489c = (this.f489c + this.f487a[this.f488b]) % 256;
            m291a(this.f488b, this.f489c, this.f487a);
            bArr2[i] = (byte) (this.f487a[(this.f487a[this.f488b] + this.f487a[this.f489c]) % 256] ^ bArr[i]);
        }
        return bArr2;
    }
}
