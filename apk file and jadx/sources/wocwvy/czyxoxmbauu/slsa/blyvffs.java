package wocwvy.czyxoxmbauu.slsa;

import android.app.Service;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class blyvffs extends Service implements SensorEventListener {

    /* JADX INFO: renamed from: j */
    private SensorManager f370j;

    /* JADX INFO: renamed from: k */
    private Sensor f371k;

    /* JADX INFO: renamed from: m */
    private float f373m;

    /* JADX INFO: renamed from: n */
    private float f374n;

    /* JADX INFO: renamed from: o */
    private float f375o;

    /* JADX INFO: renamed from: a */
    C0020b f361a = new C0020b();

    /* JADX INFO: renamed from: b */
    private int f362b = 0;

    /* JADX INFO: renamed from: c */
    private float[] f363c = new float[50];

    /* JADX INFO: renamed from: d */
    private float[] f364d = new float[50];

    /* JADX INFO: renamed from: e */
    private float[] f365e = new float[50];

    /* JADX INFO: renamed from: f */
    private int f366f = 0;

    /* JADX INFO: renamed from: g */
    private float[] f367g = new float[10];

    /* JADX INFO: renamed from: h */
    private long f368h = 0;

    /* JADX INFO: renamed from: i */
    private float f369i = 0.0f;

    /* JADX INFO: renamed from: l */
    private long f372l = 0;

    /* JADX INFO: renamed from: a */
    public void m270a() {
        int i = Integer.parseInt(this.f361a.m251e(this, "step")) + 1;
        this.f361a.m250d(this, "step", "" + i);
        this.f361a.m230a("Step", "+");
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not Yet Implemented");
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f370j = (SensorManager) getSystemService("sensor");
        this.f370j.registerListener(this, this.f371k, 3);
        this.f371k = this.f370j.getDefaultSensor(1);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.f370j.registerListener(this, this.f371k, 3);
        Sensor sensor = sensorEvent.sensor;
        this.f370j.registerListener(this, sensor, 3);
        if (sensor.getType() == 1) {
            float[] fArr = sensorEvent.values;
            float f = fArr[0];
            float f2 = fArr[1];
            float f3 = fArr[2];
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f372l > 100) {
                long j = jCurrentTimeMillis - this.f372l;
                this.f372l = jCurrentTimeMillis;
                if ((Math.abs(((((f + f2) + f3) - this.f373m) - this.f374n) - this.f375o) / j) * 10000.0f > 600.0f) {
                    m270a();
                }
                this.f373m = f;
                this.f374n = f2;
                this.f375o = f3;
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.f370j = (SensorManager) getSystemService("sensor");
        this.f370j.registerListener(this, this.f371k, 3);
        this.f371k = this.f370j.getDefaultSensor(1);
        return 1;
    }
}
