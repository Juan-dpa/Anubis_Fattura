package android.support.constraint.p000a;

import android.support.constraint.p000a.C0016g;
import android.support.constraint.p000a.p001a.C0003a;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: android.support.constraint.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0014e {

    /* JADX INFO: renamed from: d */
    private static int f288d = 1000;

    /* JADX INFO: renamed from: c */
    final C0012c f291c;

    /* JADX INFO: renamed from: i */
    private C0011b[] f296i;

    /* JADX INFO: renamed from: a */
    int f289a = 0;

    /* JADX INFO: renamed from: e */
    private HashMap<String, C0016g> f292e = null;

    /* JADX INFO: renamed from: f */
    private C0013d f293f = new C0013d();

    /* JADX INFO: renamed from: g */
    private int f294g = 32;

    /* JADX INFO: renamed from: h */
    private int f295h = this.f294g;

    /* JADX INFO: renamed from: j */
    private boolean[] f297j = new boolean[this.f294g];

    /* JADX INFO: renamed from: b */
    int f290b = 1;

    /* JADX INFO: renamed from: k */
    private int f298k = 0;

    /* JADX INFO: renamed from: l */
    private int f299l = this.f294g;

    /* JADX INFO: renamed from: m */
    private C0016g[] f300m = new C0016g[f288d];

    /* JADX INFO: renamed from: n */
    private int f301n = 0;

    /* JADX INFO: renamed from: o */
    private C0011b[] f302o = new C0011b[this.f294g];

    public C0014e() {
        this.f296i = null;
        this.f296i = new C0011b[this.f294g];
        m186h();
        this.f291c = new C0012c();
    }

    /* JADX INFO: renamed from: a */
    public static C0011b m174a(C0014e c0014e, C0016g c0016g, C0016g c0016g2, int i, float f, C0016g c0016g3, C0016g c0016g4, int i2, boolean z) {
        C0011b c0011bM197b = c0014e.m197b();
        c0011bM197b.m155a(c0016g, c0016g2, i, f, c0016g3, c0016g4, i2);
        if (z) {
            C0016g c0016gM201d = c0014e.m201d();
            C0016g c0016gM201d2 = c0014e.m201d();
            c0016gM201d.f308c = 4;
            c0016gM201d2.f308c = 4;
            c0011bM197b.m153a(c0016gM201d, c0016gM201d2);
        }
        return c0011bM197b;
    }

    /* JADX INFO: renamed from: a */
    public static C0011b m175a(C0014e c0014e, C0016g c0016g, C0016g c0016g2, int i, boolean z) {
        C0011b c0011bM197b = c0014e.m197b();
        c0011bM197b.m154a(c0016g, c0016g2, i);
        if (z) {
            c0014e.m178a(c0011bM197b, 1);
        }
        return c0011bM197b;
    }

    /* JADX INFO: renamed from: a */
    public static C0011b m176a(C0014e c0014e, C0016g c0016g, C0016g c0016g2, C0016g c0016g3, float f, boolean z) {
        C0011b c0011bM197b = c0014e.m197b();
        if (z) {
            c0014e.m181b(c0011bM197b);
        }
        return c0011bM197b.m156a(c0016g, c0016g2, c0016g3, f);
    }

    /* JADX INFO: renamed from: a */
    private C0016g m177a(C0016g.a aVar) {
        C0016g c0016gMo204a = this.f291c.f285b.mo204a();
        if (c0016gMo204a == null) {
            c0016gMo204a = new C0016g(aVar);
        } else {
            c0016gMo204a.m212c();
            c0016gMo204a.m209a(aVar);
        }
        if (this.f301n >= f288d) {
            f288d *= 2;
            this.f300m = (C0016g[]) Arrays.copyOf(this.f300m, f288d);
        }
        C0016g[] c0016gArr = this.f300m;
        int i = this.f301n;
        this.f301n = i + 1;
        c0016gArr[i] = c0016gMo204a;
        return c0016gMo204a;
    }

    /* JADX INFO: renamed from: a */
    private void m178a(C0011b c0011b, int i) {
        c0011b.m166c(m201d(), i);
    }

    /* JADX INFO: renamed from: b */
    private int m179b(C0013d c0013d) {
        for (int i = 0; i < this.f290b; i++) {
            this.f297j[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            i2++;
            C0016g c0016gM172a = c0013d.m172a();
            if (c0016gM172a != null) {
                if (this.f297j[c0016gM172a.f306a]) {
                    c0016gM172a = null;
                } else {
                    this.f297j[c0016gM172a.f306a] = true;
                    i3++;
                    if (i3 >= this.f290b) {
                        z = true;
                    }
                }
            }
            if (c0016gM172a != null) {
                int i4 = -1;
                float f = Float.MAX_VALUE;
                for (int i5 = 0; i5 < this.f298k; i5++) {
                    C0011b c0011b = this.f296i[i5];
                    if (c0011b.f279a.f311f != C0016g.a.UNRESTRICTED && c0011b.m161a(c0016gM172a)) {
                        float fM30c = c0011b.f282d.m30c(c0016gM172a);
                        if (fM30c < 0.0f) {
                            float f2 = (-c0011b.f280b) / fM30c;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0011b c0011b2 = this.f296i[i4];
                    c0011b2.f279a.f307b = -1;
                    c0011b2.m164b(c0016gM172a);
                    c0011b2.f279a.f307b = i4;
                    for (int i6 = 0; i6 < this.f298k; i6++) {
                        this.f296i[i6].m160a(c0011b2);
                    }
                    c0013d.m173a(this);
                    try {
                        m182c(c0013d);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            z = true;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public static C0011b m180b(C0014e c0014e, C0016g c0016g, C0016g c0016g2, int i, boolean z) {
        C0016g c0016gM200c = c0014e.m200c();
        C0011b c0011bM197b = c0014e.m197b();
        c0011bM197b.m157a(c0016g, c0016g2, c0016gM200c, i);
        if (z) {
            c0014e.m178a(c0011bM197b, (int) (c0011bM197b.f282d.m30c(c0016gM200c) * (-1.0f)));
        }
        return c0011bM197b;
    }

    /* JADX INFO: renamed from: b */
    private void m181b(C0011b c0011b) {
        c0011b.m153a(m201d(), m201d());
    }

    /* JADX INFO: renamed from: c */
    private int m182c(C0013d c0013d) {
        boolean z;
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f298k) {
                z = false;
                break;
            }
            if (this.f296i[i2].f279a.f311f != C0016g.a.UNRESTRICTED && this.f296i[i2].f280b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            i = 0;
            while (!z2) {
                i++;
                int i3 = -1;
                int i4 = -1;
                float f = Float.MAX_VALUE;
                int i5 = 0;
                for (int i6 = 0; i6 < this.f298k; i6++) {
                    C0011b c0011b = this.f296i[i6];
                    if (c0011b.f279a.f311f != C0016g.a.UNRESTRICTED && c0011b.f280b < 0.0f) {
                        int i7 = i5;
                        float f2 = f;
                        int i8 = i4;
                        int i9 = i3;
                        for (int i10 = 1; i10 < this.f290b; i10++) {
                            C0016g c0016g = this.f291c.f286c[i10];
                            float fM30c = c0011b.f282d.m30c(c0016g);
                            if (fM30c > 0.0f) {
                                int i11 = i7;
                                float f3 = f2;
                                int i12 = i8;
                                int i13 = i9;
                                for (int i14 = 0; i14 < 6; i14++) {
                                    float f4 = c0016g.f310e[i14] / fM30c;
                                    if ((f4 < f3 && i14 == i11) || i14 > i11) {
                                        f3 = f4;
                                        i13 = i6;
                                        i12 = i10;
                                        i11 = i14;
                                    }
                                }
                                i9 = i13;
                                i8 = i12;
                                f2 = f3;
                                i7 = i11;
                            }
                        }
                        i3 = i9;
                        i4 = i8;
                        f = f2;
                        i5 = i7;
                    }
                }
                if (i3 != -1) {
                    C0011b c0011b2 = this.f296i[i3];
                    c0011b2.f279a.f307b = -1;
                    c0011b2.m164b(this.f291c.f286c[i4]);
                    c0011b2.f279a.f307b = i3;
                    for (int i15 = 0; i15 < this.f298k; i15++) {
                        this.f296i[i15].m160a(c0011b2);
                    }
                    c0013d.m173a(this);
                } else {
                    z2 = true;
                }
            }
        } else {
            i = 0;
        }
        for (int i16 = 0; i16 < this.f298k; i16++) {
            if (this.f296i[i16].f279a.f311f != C0016g.a.UNRESTRICTED && this.f296i[i16].f280b < 0.0f) {
                return i;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: c */
    public static C0011b m183c(C0014e c0014e, C0016g c0016g, C0016g c0016g2, int i, boolean z) {
        C0016g c0016gM200c = c0014e.m200c();
        C0011b c0011bM197b = c0014e.m197b();
        c0011bM197b.m163b(c0016g, c0016g2, c0016gM200c, i);
        if (z) {
            c0014e.m178a(c0011bM197b, (int) (c0011bM197b.f282d.m30c(c0016gM200c) * (-1.0f)));
        }
        return c0011bM197b;
    }

    /* JADX INFO: renamed from: c */
    private void m184c(C0011b c0011b) {
        if (this.f298k > 0) {
            c0011b.f282d.m24a(c0011b, this.f296i);
            if (c0011b.f282d.f126a == 0) {
                c0011b.f283e = true;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    private void m185g() {
        this.f294g *= 2;
        this.f296i = (C0011b[]) Arrays.copyOf(this.f296i, this.f294g);
        this.f291c.f286c = (C0016g[]) Arrays.copyOf(this.f291c.f286c, this.f294g);
        this.f297j = new boolean[this.f294g];
        this.f295h = this.f294g;
        this.f299l = this.f294g;
        this.f293f.f287a.clear();
    }

    /* JADX INFO: renamed from: h */
    private void m186h() {
        for (int i = 0; i < this.f296i.length; i++) {
            C0011b c0011b = this.f296i[i];
            if (c0011b != null) {
                this.f291c.f284a.mo206a(c0011b);
            }
            this.f296i[i] = null;
        }
    }

    /* JADX INFO: renamed from: i */
    private void m187i() {
        for (int i = 0; i < this.f298k; i++) {
            C0011b c0011b = this.f296i[i];
            c0011b.f279a.f309d = c0011b.f280b;
        }
    }

    /* JADX INFO: renamed from: a */
    C0011b m188a(int i) {
        return this.f296i[i];
    }

    /* JADX INFO: renamed from: a */
    public C0016g m189a(Object obj) {
        C0016g c0016gM33a = null;
        if (obj == null) {
            return null;
        }
        if (this.f290b + 1 >= this.f295h) {
            m185g();
        }
        if (obj instanceof C0003a) {
            C0003a c0003a = (C0003a) obj;
            c0016gM33a = c0003a.m33a();
            if (c0016gM33a == null) {
                c0003a.m35a(this.f291c);
                c0016gM33a = c0003a.m33a();
            }
            if (c0016gM33a.f306a == -1 || c0016gM33a.f306a > this.f289a || this.f291c.f286c[c0016gM33a.f306a] == null) {
                if (c0016gM33a.f306a != -1) {
                    c0016gM33a.m212c();
                }
                this.f289a++;
                this.f290b++;
                c0016gM33a.f306a = this.f289a;
                c0016gM33a.f311f = C0016g.a.UNRESTRICTED;
                this.f291c.f286c[this.f289a] = c0016gM33a;
            }
        }
        return c0016gM33a;
    }

    /* JADX INFO: renamed from: a */
    public void m190a() {
        for (int i = 0; i < this.f291c.f286c.length; i++) {
            C0016g c0016g = this.f291c.f286c[i];
            if (c0016g != null) {
                c0016g.m212c();
            }
        }
        this.f291c.f285b.mo205a(this.f300m, this.f301n);
        this.f301n = 0;
        Arrays.fill(this.f291c.f286c, (Object) null);
        if (this.f292e != null) {
            this.f292e.clear();
        }
        this.f289a = 0;
        this.f293f.f287a.clear();
        this.f290b = 1;
        for (int i2 = 0; i2 < this.f298k; i2++) {
            this.f296i[i2].f281c = false;
        }
        m186h();
        this.f298k = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m191a(C0011b c0011b) {
        if (c0011b == null) {
            return;
        }
        if (this.f298k + 1 >= this.f299l || this.f290b + 1 >= this.f295h) {
            m185g();
        }
        if (!c0011b.f283e) {
            m184c(c0011b);
            c0011b.m169e();
            c0011b.m170f();
            if (!c0011b.m165b()) {
                return;
            }
        }
        if (this.f296i[this.f298k] != null) {
            this.f291c.f284a.mo206a(this.f296i[this.f298k]);
        }
        if (!c0011b.f283e) {
            c0011b.m159a();
        }
        this.f296i[this.f298k] = c0011b;
        c0011b.f279a.f307b = this.f298k;
        this.f298k++;
        int i = c0011b.f279a.f313h;
        if (i > 0) {
            while (this.f302o.length < i) {
                this.f302o = new C0011b[this.f302o.length * 2];
            }
            C0011b[] c0011bArr = this.f302o;
            for (int i2 = 0; i2 < i; i2++) {
                c0011bArr[i2] = c0011b.f279a.f312g[i2];
            }
            for (int i3 = 0; i3 < i; i3++) {
                C0011b c0011b2 = c0011bArr[i3];
                if (c0011b2 != c0011b) {
                    c0011b2.f282d.m23a(c0011b2, c0011b);
                    c0011b2.m159a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m192a(C0013d c0013d) {
        c0013d.m173a(this);
        m182c(c0013d);
        m179b(c0013d);
        m187i();
    }

    /* JADX INFO: renamed from: a */
    public void m193a(C0016g c0016g, int i) {
        C0011b c0011bM197b;
        int i2 = c0016g.f307b;
        if (c0016g.f307b != -1) {
            C0011b c0011b = this.f296i[i2];
            if (c0011b.f283e) {
                c0011b.f280b = i;
                return;
            } else {
                c0011bM197b = m197b();
                c0011bM197b.m162b(c0016g, i);
            }
        } else {
            c0011bM197b = m197b();
            c0011bM197b.m152a(c0016g, i);
        }
        m191a(c0011bM197b);
    }

    /* JADX INFO: renamed from: a */
    public void m194a(C0016g c0016g, C0016g c0016g2, int i, float f, C0016g c0016g3, C0016g c0016g4, int i2, int i3) {
        C0011b c0011bM197b = m197b();
        c0011bM197b.m155a(c0016g, c0016g2, i, f, c0016g3, c0016g4, i2);
        C0016g c0016gM201d = m201d();
        C0016g c0016gM201d2 = m201d();
        c0016gM201d.f308c = i3;
        c0016gM201d2.f308c = i3;
        c0011bM197b.m153a(c0016gM201d, c0016gM201d2);
        m191a(c0011bM197b);
    }

    /* JADX INFO: renamed from: a */
    public void m195a(C0016g c0016g, C0016g c0016g2, int i, int i2) {
        C0011b c0011bM197b = m197b();
        C0016g c0016gM200c = m200c();
        c0016gM200c.f308c = i2;
        c0011bM197b.m157a(c0016g, c0016g2, c0016gM200c, i);
        m191a(c0011bM197b);
    }

    /* JADX INFO: renamed from: b */
    public int m196b(Object obj) {
        C0016g c0016gM33a = ((C0003a) obj).m33a();
        if (c0016gM33a != null) {
            return (int) (c0016gM33a.f309d + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public C0011b m197b() {
        C0011b c0011bMo204a = this.f291c.f284a.mo204a();
        if (c0011bMo204a == null) {
            return new C0011b(this.f291c);
        }
        c0011bMo204a.m168d();
        return c0011bMo204a;
    }

    /* JADX INFO: renamed from: b */
    public void m198b(C0016g c0016g, C0016g c0016g2, int i, int i2) {
        C0011b c0011bM197b = m197b();
        C0016g c0016gM200c = m200c();
        c0016gM200c.f308c = i2;
        c0011bM197b.m163b(c0016g, c0016g2, c0016gM200c, i);
        m191a(c0011bM197b);
    }

    /* JADX INFO: renamed from: c */
    public C0011b m199c(C0016g c0016g, C0016g c0016g2, int i, int i2) {
        C0011b c0011bM197b = m197b();
        c0011bM197b.m154a(c0016g, c0016g2, i);
        C0016g c0016gM201d = m201d();
        C0016g c0016gM201d2 = m201d();
        c0016gM201d.f308c = i2;
        c0016gM201d2.f308c = i2;
        c0011bM197b.m153a(c0016gM201d, c0016gM201d2);
        m191a(c0011bM197b);
        return c0011bM197b;
    }

    /* JADX INFO: renamed from: c */
    public C0016g m200c() {
        if (this.f290b + 1 >= this.f295h) {
            m185g();
        }
        C0016g c0016gM177a = m177a(C0016g.a.SLACK);
        this.f289a++;
        this.f290b++;
        c0016gM177a.f306a = this.f289a;
        this.f291c.f286c[this.f289a] = c0016gM177a;
        return c0016gM177a;
    }

    /* JADX INFO: renamed from: d */
    public C0016g m201d() {
        if (this.f290b + 1 >= this.f295h) {
            m185g();
        }
        C0016g c0016gM177a = m177a(C0016g.a.ERROR);
        this.f289a++;
        this.f290b++;
        c0016gM177a.f306a = this.f289a;
        this.f291c.f286c[this.f289a] = c0016gM177a;
        return c0016gM177a;
    }

    /* JADX INFO: renamed from: e */
    public void m202e() {
        m192a(this.f293f);
    }

    /* JADX INFO: renamed from: f */
    public C0012c m203f() {
        return this.f291c;
    }
}
