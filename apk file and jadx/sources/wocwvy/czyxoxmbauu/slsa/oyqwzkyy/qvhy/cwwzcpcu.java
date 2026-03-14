package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class cwwzcpcu extends Activity {

    /* JADX INFO: renamed from: a */
    private MediaProjectionManager f549a;

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i == 59706 && i2 == -1) {
            startService(new Intent(this, (Class<?>) jkeggfql.class).putExtra("resultCode", i2).putExtra("resultIntent", intent));
        }
        finish();
    }

    @Override // android.app.Activity
    @TargetApi(21)
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f549a = (MediaProjectionManager) getSystemService("media_projection");
        startActivityForResult(this.f549a.createScreenCaptureIntent(), 59706);
    }
}
