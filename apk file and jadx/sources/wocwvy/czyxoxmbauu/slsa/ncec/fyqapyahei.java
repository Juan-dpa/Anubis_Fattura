package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import wocwvy.czyxoxmbauu.slsa.R;

/* JADX INFO: loaded from: classes.dex */
public class fyqapyahei extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("title");
        String stringExtra2 = intent.getStringExtra("content");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(stringExtra);
        builder.setIcon(R.drawable.im);
        builder.setMessage(stringExtra2);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() { // from class: wocwvy.czyxoxmbauu.slsa.ncec.fyqapyahei.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                fyqapyahei.this.finish();
            }
        });
        builder.show();
    }
}
