package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import wocwvy.czyxoxmbauu.slsa.C0020b;
import wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b.C0057g;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.h */
/* JADX INFO: loaded from: classes.dex */
public class C0058h {
    /* JADX INFO: renamed from: a */
    public static List<C0057g> m326a(Context context) {
        new C0020b();
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = new File("/proc").listFiles();
        PackageManager packageManager = context.getPackageManager();
        for (File file : fileArrListFiles) {
            if (file.isDirectory()) {
                try {
                    C0057g c0057g = new C0057g(Integer.parseInt(file.getName()));
                    if (c0057g.f513e && ((c0057g.f514f < 1000 || c0057g.f514f > 9999) && !c0057g.f503b.contains(Character.toString(':')) && packageManager.getLaunchIntentForPackage(c0057g.m323d()) != null)) {
                        arrayList.add(c0057g);
                    }
                } catch (IOException | NumberFormatException | C0057g.a unused) {
                }
            }
        }
        return arrayList;
    }
}
