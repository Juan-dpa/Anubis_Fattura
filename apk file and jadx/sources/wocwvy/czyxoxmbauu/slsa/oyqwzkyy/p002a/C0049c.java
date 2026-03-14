package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p002a;

import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0049c {

    /* JADX INFO: renamed from: a */
    private Context f492a;

    /* JADX INFO: renamed from: b */
    private DevicePolicyManager f493b;

    /* JADX INFO: renamed from: c */
    private ComponentName f494c;

    public C0049c(Context context) {
        this.f492a = context;
        String name = DeviceAdminReceiverC0047a.class.getName();
        String packageName = this.f492a.getPackageName();
        this.f493b = (DevicePolicyManager) this.f492a.getSystemService("device_policy");
        this.f494c = new ComponentName(packageName, name);
    }

    /* JADX INFO: renamed from: a */
    public ComponentName m295a() {
        return this.f494c;
    }
}
