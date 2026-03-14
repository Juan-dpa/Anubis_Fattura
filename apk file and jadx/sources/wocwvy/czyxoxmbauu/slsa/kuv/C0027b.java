package wocwvy.czyxoxmbauu.slsa.kuv;

import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.kuv.b */
/* JADX INFO: loaded from: classes.dex */
public class C0027b extends Thread {

    /* JADX INFO: renamed from: a */
    private InputStream f438a;

    /* JADX INFO: renamed from: b */
    private OutputStream f439b;

    /* JADX INFO: renamed from: c */
    private int f440c = 102400;

    public C0027b(InputStream inputStream, OutputStream outputStream) {
        this.f438a = inputStream;
        this.f439b = outputStream;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i;
        Exception e;
        byte[] bArr = new byte[this.f440c];
        int i2 = 0;
        while (i2 != -1) {
            try {
                i = this.f438a.read(bArr, 0, this.f440c);
                if (i > 0) {
                    try {
                        this.f439b.write(bArr, 0, i);
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                    }
                }
                this.f439b.flush();
            } catch (Exception e3) {
                i = i2;
                e = e3;
            }
            i2 = i;
        }
    }
}
