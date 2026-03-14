package android.support.constraint.p000a;

import android.support.constraint.p000a.C0016g;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.constraint.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0013d {

    /* JADX INFO: renamed from: a */
    ArrayList<C0016g> f287a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    private void m171b(C0014e c0014e) {
        this.f287a.clear();
        for (int i = 1; i < c0014e.f290b; i++) {
            C0016g c0016g = c0014e.f291c.f286c[i];
            for (int i2 = 0; i2 < 6; i2++) {
                c0016g.f310e[i2] = 0.0f;
            }
            c0016g.f310e[c0016g.f308c] = 1.0f;
            if (c0016g.f311f == C0016g.a.ERROR) {
                this.f287a.add(c0016g);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    C0016g m172a() {
        int size = this.f287a.size();
        C0016g c0016g = null;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0016g c0016g2 = this.f287a.get(i2);
            for (int i3 = 5; i3 >= 0; i3--) {
                float f = c0016g2.f310e[i3];
                if (c0016g == null && f < 0.0f && i3 >= i) {
                    c0016g = c0016g2;
                    i = i3;
                }
                if (f > 0.0f && i3 > i) {
                    c0016g = null;
                    i = i3;
                }
            }
        }
        return c0016g;
    }

    /* JADX INFO: renamed from: a */
    void m173a(C0014e c0014e) {
        m171b(c0014e);
        int size = this.f287a.size();
        for (int i = 0; i < size; i++) {
            C0016g c0016g = this.f287a.get(i);
            if (c0016g.f307b != -1) {
                C0002a c0002a = c0014e.m188a(c0016g.f307b).f282d;
                int i2 = c0002a.f126a;
                for (int i3 = 0; i3 < i2; i3++) {
                    C0016g c0016gM19a = c0002a.m19a(i3);
                    if (c0016gM19a != null) {
                        float fM26b = c0002a.m26b(i3);
                        for (int i4 = 0; i4 < 6; i4++) {
                            float[] fArr = c0016gM19a.f310e;
                            fArr[i4] = fArr[i4] + (c0016g.f310e[i4] * fM26b);
                        }
                        if (!this.f287a.contains(c0016gM19a)) {
                            this.f287a.add(c0016gM19a);
                        }
                    }
                }
                c0016g.m207a();
            }
        }
    }

    public String toString() {
        String str = "Goal: ";
        int size = this.f287a.size();
        for (int i = 0; i < size; i++) {
            str = str + this.f287a.get(i).m210b();
        }
        return str;
    }
}
