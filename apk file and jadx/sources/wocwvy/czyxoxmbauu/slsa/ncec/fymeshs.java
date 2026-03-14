package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class fymeshs extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            startActivity(new Intent("android.settings.ACCESSIBILITY_SETTINGS"));
        } catch (Exception unused) {
            finish();
        }
    }
}
