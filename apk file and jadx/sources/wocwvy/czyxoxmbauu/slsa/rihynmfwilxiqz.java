package wocwvy.czyxoxmbauu.slsa;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class rihynmfwilxiqz extends Application {

    /* JADX INFO: renamed from: a */
    private static String f570a = "(BMI:Application)";

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        Log.d(f570a, "Attach to the base context.");
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        Log.e(f570a, "START rihynmfwilxiqz");
    }
}
