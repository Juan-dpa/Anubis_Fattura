package android.support.constraint.p000a.p001a;

import android.support.constraint.p000a.C0011b;
import android.support.constraint.p000a.C0012c;
import android.support.constraint.p000a.C0014e;
import android.support.constraint.p000a.C0016g;
import android.support.constraint.p000a.p001a.C0003a;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.constraint.a.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0004b {

    /* JADX INFO: renamed from: D */
    public static float f165D = 0.5f;

    /* JADX INFO: renamed from: B */
    protected int f167B;

    /* JADX INFO: renamed from: C */
    protected int f168C;

    /* JADX INFO: renamed from: I */
    int f173I;

    /* JADX INFO: renamed from: J */
    int f174J;

    /* JADX INFO: renamed from: K */
    int f175K;

    /* JADX INFO: renamed from: L */
    int f176L;

    /* JADX INFO: renamed from: M */
    boolean f177M;

    /* JADX INFO: renamed from: N */
    boolean f178N;

    /* JADX INFO: renamed from: O */
    boolean f179O;

    /* JADX INFO: renamed from: P */
    boolean f180P;

    /* JADX INFO: renamed from: Q */
    boolean f181Q;

    /* JADX INFO: renamed from: R */
    boolean f182R;

    /* JADX INFO: renamed from: U */
    boolean f185U;

    /* JADX INFO: renamed from: V */
    boolean f186V;

    /* JADX INFO: renamed from: ai */
    private int f200ai;

    /* JADX INFO: renamed from: aj */
    private int f201aj;

    /* JADX INFO: renamed from: ak */
    private Object f202ak;

    /* JADX INFO: renamed from: a */
    public int f191a = -1;

    /* JADX INFO: renamed from: b */
    public int f207b = -1;

    /* JADX INFO: renamed from: c */
    int f208c = 0;

    /* JADX INFO: renamed from: d */
    int f209d = 0;

    /* JADX INFO: renamed from: e */
    int f210e = 0;

    /* JADX INFO: renamed from: f */
    int f211f = 0;

    /* JADX INFO: renamed from: g */
    int f212g = 0;

    /* JADX INFO: renamed from: h */
    int f213h = 0;

    /* JADX INFO: renamed from: i */
    C0003a f214i = new C0003a(this, C0003a.c.LEFT);

    /* JADX INFO: renamed from: j */
    C0003a f215j = new C0003a(this, C0003a.c.TOP);

    /* JADX INFO: renamed from: k */
    C0003a f216k = new C0003a(this, C0003a.c.RIGHT);

    /* JADX INFO: renamed from: l */
    C0003a f217l = new C0003a(this, C0003a.c.BOTTOM);

    /* JADX INFO: renamed from: m */
    C0003a f218m = new C0003a(this, C0003a.c.BASELINE);

    /* JADX INFO: renamed from: n */
    C0003a f219n = new C0003a(this, C0003a.c.CENTER_X);

    /* JADX INFO: renamed from: o */
    C0003a f220o = new C0003a(this, C0003a.c.CENTER_Y);

    /* JADX INFO: renamed from: p */
    C0003a f221p = new C0003a(this, C0003a.c.CENTER);

    /* JADX INFO: renamed from: q */
    protected ArrayList<C0003a> f222q = new ArrayList<>();

    /* JADX INFO: renamed from: r */
    C0004b f223r = null;

    /* JADX INFO: renamed from: s */
    int f224s = 0;

    /* JADX INFO: renamed from: t */
    int f225t = 0;

    /* JADX INFO: renamed from: u */
    protected float f226u = 0.0f;

    /* JADX INFO: renamed from: v */
    protected int f227v = -1;

    /* JADX INFO: renamed from: aa */
    private int f192aa = 0;

    /* JADX INFO: renamed from: ab */
    private int f193ab = 0;

    /* JADX INFO: renamed from: ac */
    private int f194ac = 0;

    /* JADX INFO: renamed from: ad */
    private int f195ad = 0;

    /* JADX INFO: renamed from: w */
    protected int f228w = 0;

    /* JADX INFO: renamed from: x */
    protected int f229x = 0;

    /* JADX INFO: renamed from: ae */
    private int f196ae = 0;

    /* JADX INFO: renamed from: af */
    private int f197af = 0;

    /* JADX INFO: renamed from: ag */
    private int f198ag = 0;

    /* JADX INFO: renamed from: ah */
    private int f199ah = 0;

    /* JADX INFO: renamed from: y */
    protected int f230y = 0;

    /* JADX INFO: renamed from: z */
    protected int f231z = 0;

    /* JADX INFO: renamed from: A */
    int f166A = 0;

    /* JADX INFO: renamed from: E */
    float f169E = f165D;

    /* JADX INFO: renamed from: F */
    float f170F = f165D;

    /* JADX INFO: renamed from: G */
    a f171G = a.FIXED;

    /* JADX INFO: renamed from: H */
    a f172H = a.FIXED;

    /* JADX INFO: renamed from: al */
    private int f203al = 0;

    /* JADX INFO: renamed from: am */
    private int f204am = 0;

    /* JADX INFO: renamed from: an */
    private String f205an = null;

    /* JADX INFO: renamed from: ao */
    private String f206ao = null;

    /* JADX INFO: renamed from: S */
    int f183S = 0;

    /* JADX INFO: renamed from: T */
    int f184T = 0;

    /* JADX INFO: renamed from: W */
    float f187W = 0.0f;

    /* JADX INFO: renamed from: X */
    float f188X = 0.0f;

    /* JADX INFO: renamed from: Y */
    C0004b f189Y = null;

    /* JADX INFO: renamed from: Z */
    C0004b f190Z = null;

    /* JADX INFO: renamed from: android.support.constraint.a.a.b$a */
    public enum a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C0004b() {
        m48D();
    }

    /* JADX INFO: renamed from: D */
    private void m48D() {
        this.f222q.add(this.f214i);
        this.f222q.add(this.f215j);
        this.f222q.add(this.f216k);
        this.f222q.add(this.f217l);
        this.f222q.add(this.f219n);
        this.f222q.add(this.f220o);
        this.f222q.add(this.f218m);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m49a(C0014e c0014e, boolean z, boolean z2, C0003a c0003a, C0003a c0003a2, int i, int i2, int i3, int i4, float f, boolean z3, boolean z4, int i5, int i6, int i7) {
        boolean z5;
        int i8;
        int i9;
        C0011b c0011bM197b;
        int i10;
        boolean z6;
        C0014e c0014e2;
        C0016g c0016g;
        C0016g c0016g2;
        int i11;
        float f2;
        C0016g c0016g3;
        C0016g c0016g4;
        int i12;
        boolean z7;
        C0011b c0011bM174a;
        C0016g c0016gM189a = c0014e.m189a(c0003a);
        C0016g c0016gM189a2 = c0014e.m189a(c0003a2);
        C0016g c0016gM189a3 = c0014e.m189a(c0003a.m43f());
        C0016g c0016gM189a4 = c0014e.m189a(c0003a2.m43f());
        int iM41d = c0003a.m41d();
        int iM41d2 = c0003a2.m41d();
        if (this.f204am == 8) {
            z5 = true;
            i8 = 0;
        } else {
            z5 = z2;
            i8 = i3;
        }
        if (c0016gM189a3 == null && c0016gM189a4 == null) {
            c0014e.m191a(c0014e.m197b().m162b(c0016gM189a, i));
            if (z3) {
                return;
            }
            if (!z) {
                if (z5) {
                    c0011bM174a = C0014e.m175a(c0014e, c0016gM189a2, c0016gM189a, i8, false);
                }
            }
        } else if (c0016gM189a3 != null && c0016gM189a4 == null) {
            c0014e.m191a(c0014e.m197b().m154a(c0016gM189a, c0016gM189a3, iM41d));
            if (!z) {
                if (z3) {
                    return;
                }
                if (!z5) {
                    c0011bM174a = c0014e.m197b().m162b(c0016gM189a2, i2);
                }
            }
            c0011bM174a = C0014e.m175a(c0014e, c0016gM189a2, c0016gM189a, i4, true);
        } else if (c0016gM189a3 == null && c0016gM189a4 != null) {
            c0014e.m191a(c0014e.m197b().m154a(c0016gM189a2, c0016gM189a4, iM41d2 * (-1)));
            if (z) {
                c0011bM174a = C0014e.m175a(c0014e, c0016gM189a2, c0016gM189a, i4, true);
            } else if (z3) {
                return;
            } else {
                c0011bM174a = z5 ? c0014e.m197b().m154a(c0016gM189a2, c0016gM189a, i8) : c0014e.m197b().m162b(c0016gM189a, i);
            }
        } else if (z5) {
            if (z) {
                c0014e.m191a(C0014e.m175a(c0014e, c0016gM189a2, c0016gM189a, i4, true));
            } else {
                c0014e.m191a(c0014e.m197b().m154a(c0016gM189a2, c0016gM189a, i8));
            }
            if (c0003a.m42e() != c0003a2.m42e()) {
                if (c0003a.m42e() == C0003a.b.STRONG) {
                    c0014e.m191a(c0014e.m197b().m154a(c0016gM189a, c0016gM189a3, iM41d));
                    C0016g c0016gM200c = c0014e.m200c();
                    C0011b c0011bM197b2 = c0014e.m197b();
                    c0011bM197b2.m163b(c0016gM189a2, c0016gM189a4, c0016gM200c, iM41d2 * (-1));
                    c0014e.m191a(c0011bM197b2);
                    return;
                }
                C0016g c0016gM200c2 = c0014e.m200c();
                C0011b c0011bM197b3 = c0014e.m197b();
                c0011bM197b3.m157a(c0016gM189a, c0016gM189a3, c0016gM200c2, iM41d);
                c0014e.m191a(c0011bM197b3);
                c0011bM197b = c0014e.m197b();
                i10 = iM41d2 * (-1);
                c0011bM174a = c0011bM197b.m154a(c0016gM189a2, c0016gM189a4, i10);
            } else if (c0016gM189a3 == c0016gM189a4) {
                i11 = 0;
                f2 = 0.5f;
                i12 = 0;
                z7 = true;
                c0014e2 = c0014e;
                c0016g = c0016gM189a;
                c0016g2 = c0016gM189a3;
                c0016g3 = c0016gM189a4;
                c0016g4 = c0016gM189a2;
                c0011bM174a = C0014e.m174a(c0014e2, c0016g, c0016g2, i11, f2, c0016g3, c0016g4, i12, z7);
            } else {
                if (z4) {
                    return;
                }
                c0014e.m191a(C0014e.m180b(c0014e, c0016gM189a, c0016gM189a3, iM41d, c0003a.m44g() != C0003a.a.STRICT));
                c0014e.m191a(C0014e.m183c(c0014e, c0016gM189a2, c0016gM189a4, iM41d2 * (-1), c0003a2.m44g() != C0003a.a.STRICT));
                z6 = false;
                c0014e2 = c0014e;
                c0016g = c0016gM189a;
                c0016g2 = c0016gM189a3;
                i11 = iM41d;
                f2 = f;
                c0016g3 = c0016gM189a4;
                c0016g4 = c0016gM189a2;
                i12 = iM41d2;
                z7 = z6;
                c0011bM174a = C0014e.m174a(c0014e2, c0016g, c0016g2, i11, f2, c0016g3, c0016g4, i12, z7);
            }
        } else {
            if (!z3) {
                if (z4) {
                    return;
                }
                if (i5 == 1) {
                    int i13 = i6;
                    if (i13 <= i8) {
                        i13 = i8;
                    }
                    i9 = iM41d2;
                    if (i7 > 0) {
                        if (i7 < i13) {
                            i13 = i7;
                        } else {
                            c0014e.m198b(c0016gM189a2, c0016gM189a, i7, 3);
                        }
                    }
                    c0014e.m199c(c0016gM189a2, c0016gM189a, i13, 3);
                } else {
                    i9 = iM41d2;
                    if (i6 == 0 && i7 == 0) {
                        c0014e.m191a(c0014e.m197b().m154a(c0016gM189a, c0016gM189a3, iM41d));
                        c0011bM197b = c0014e.m197b();
                        i10 = i9 * (-1);
                        c0011bM174a = c0011bM197b.m154a(c0016gM189a2, c0016gM189a4, i10);
                    } else if (i7 > 0) {
                        c0014e.m198b(c0016gM189a2, c0016gM189a, i7, 3);
                    }
                }
                c0014e.m195a(c0016gM189a, c0016gM189a3, iM41d, 2);
                c0014e.m198b(c0016gM189a2, c0016gM189a4, -i9, 2);
                c0014e.m194a(c0016gM189a, c0016gM189a3, iM41d, f, c0016gM189a4, c0016gM189a2, i9, 4);
                return;
            }
            c0014e.m195a(c0016gM189a, c0016gM189a3, iM41d, 3);
            c0014e.m198b(c0016gM189a2, c0016gM189a4, iM41d2 * (-1), 3);
            z6 = true;
            c0014e2 = c0014e;
            c0016g = c0016gM189a;
            c0016g2 = c0016gM189a3;
            i11 = iM41d;
            f2 = f;
            c0016g3 = c0016gM189a4;
            c0016g4 = c0016gM189a2;
            i12 = iM41d2;
            z7 = z6;
            c0011bM174a = C0014e.m174a(c0014e2, c0016g, c0016g2, i11, f2, c0016g3, c0016g4, i12, z7);
        }
        c0014e.m191a(c0011bM174a);
    }

    /* JADX INFO: renamed from: A */
    public void m50A() {
        C0004b c0004bM74c = m74c();
        if (c0004bM74c != null && (c0004bM74c instanceof C0005c) && ((C0005c) m74c()).m122G()) {
            return;
        }
        int size = this.f222q.size();
        for (int i = 0; i < size; i++) {
            this.f222q.get(i).m46i();
        }
    }

    /* JADX INFO: renamed from: B */
    public a m51B() {
        return this.f171G;
    }

    /* JADX INFO: renamed from: C */
    public a m52C() {
        return this.f172H;
    }

    /* JADX INFO: renamed from: a */
    public C0003a mo53a(C0003a.c cVar) {
        switch (cVar) {
            case LEFT:
                return this.f214i;
            case TOP:
                return this.f215j;
            case RIGHT:
                return this.f216k;
            case BOTTOM:
                return this.f217l;
            case BASELINE:
                return this.f218m;
            case CENTER_X:
                return this.f219n;
            case CENTER_Y:
                return this.f220o;
            case CENTER:
                return this.f221p;
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo54a() {
        this.f214i.m46i();
        this.f215j.m46i();
        this.f216k.m46i();
        this.f217l.m46i();
        this.f218m.m46i();
        this.f219n.m46i();
        this.f220o.m46i();
        this.f221p.m46i();
        this.f223r = null;
        this.f224s = 0;
        this.f225t = 0;
        this.f226u = 0.0f;
        this.f227v = -1;
        this.f228w = 0;
        this.f229x = 0;
        this.f196ae = 0;
        this.f197af = 0;
        this.f198ag = 0;
        this.f199ah = 0;
        this.f230y = 0;
        this.f231z = 0;
        this.f166A = 0;
        this.f167B = 0;
        this.f168C = 0;
        this.f200ai = 0;
        this.f201aj = 0;
        this.f169E = f165D;
        this.f170F = f165D;
        this.f171G = a.FIXED;
        this.f172H = a.FIXED;
        this.f202ak = null;
        this.f203al = 0;
        this.f204am = 0;
        this.f205an = null;
        this.f206ao = null;
        this.f181Q = false;
        this.f182R = false;
        this.f183S = 0;
        this.f184T = 0;
        this.f185U = false;
        this.f186V = false;
        this.f187W = 0.0f;
        this.f188X = 0.0f;
        this.f191a = -1;
        this.f207b = -1;
    }

    /* JADX INFO: renamed from: a */
    public void m55a(float f) {
        this.f169E = f;
    }

    /* JADX INFO: renamed from: a */
    public void m56a(int i) {
        this.f204am = i;
    }

    /* JADX INFO: renamed from: a */
    public void m57a(int i, int i2) {
        this.f228w = i;
        this.f229x = i2;
    }

    /* JADX INFO: renamed from: a */
    public void m58a(int i, int i2, int i3) {
        this.f208c = i;
        this.f210e = i2;
        this.f211f = i3;
    }

    /* JADX INFO: renamed from: a */
    public void m59a(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        this.f228w = i;
        this.f229x = i2;
        if (this.f204am == 8) {
            this.f224s = 0;
            this.f225t = 0;
            return;
        }
        if (this.f171G == a.FIXED && i5 < this.f224s) {
            i5 = this.f224s;
        }
        if (this.f172H == a.FIXED && i6 < this.f225t) {
            i6 = this.f225t;
        }
        this.f224s = i5;
        this.f225t = i6;
        if (this.f225t < this.f168C) {
            this.f225t = this.f168C;
        }
        if (this.f224s < this.f167B) {
            this.f224s = this.f167B;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m60a(C0003a.c cVar, C0004b c0004b, C0003a.c cVar2, int i, int i2) {
        mo53a(cVar).m37a(c0004b.mo53a(cVar2), i, i2, C0003a.b.STRONG, 0, true);
    }

    /* JADX INFO: renamed from: a */
    public void m61a(a aVar) {
        this.f171G = aVar;
        if (this.f171G == a.WRAP_CONTENT) {
            m80d(this.f200ai);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m62a(C0004b c0004b) {
        this.f223r = c0004b;
    }

    /* JADX INFO: renamed from: a */
    public void mo63a(C0012c c0012c) {
        this.f214i.m35a(c0012c);
        this.f215j.m35a(c0012c);
        this.f216k.m35a(c0012c);
        this.f217l.m35a(c0012c);
        this.f218m.m35a(c0012c);
        this.f221p.m35a(c0012c);
        this.f219n.m35a(c0012c);
        this.f220o.m35a(c0012c);
    }

    /* JADX WARN: Removed duplicated region for block: B:232:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x065c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo64a(C0014e c0014e, int i) {
        boolean z;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        int i4;
        float f;
        boolean z4;
        boolean z5;
        int i5;
        C0016g c0016g;
        C0016g c0016g2;
        C0016g c0016g3;
        C0016g c0016g4;
        int i6;
        C0016g c0016g5;
        int i7;
        int i8;
        C0016g c0016g6;
        C0016g c0016g7;
        C0004b c0004b;
        C0016g c0016g8;
        C0016g c0016g9;
        C0004b c0004b2;
        C0014e c0014e2;
        C0016g c0016g10;
        C0016g c0016g11;
        int i9;
        C0016g c0016g12;
        C0016g c0016g13;
        C0016g c0016g14;
        C0014e c0014e3;
        C0003a c0003a;
        int i10;
        C0016g c0016g15;
        C0014e c0014e4;
        boolean z6;
        boolean z7;
        C0004b c0004b3 = this;
        C0016g c0016gM189a = (i == Integer.MAX_VALUE || c0004b3.f214i.f143g == i) ? c0014e.m189a(c0004b3.f214i) : null;
        C0016g c0016gM189a2 = (i == Integer.MAX_VALUE || c0004b3.f216k.f143g == i) ? c0014e.m189a(c0004b3.f216k) : null;
        C0016g c0016gM189a3 = (i == Integer.MAX_VALUE || c0004b3.f215j.f143g == i) ? c0014e.m189a(c0004b3.f215j) : null;
        C0016g c0016gM189a4 = (i == Integer.MAX_VALUE || c0004b3.f217l.f143g == i) ? c0014e.m189a(c0004b3.f217l) : null;
        C0016g c0016gM189a5 = (i == Integer.MAX_VALUE || c0004b3.f218m.f143g == i) ? c0014e.m189a(c0004b3.f218m) : null;
        if (c0004b3.f223r != null) {
            if ((c0004b3.f214i.f139c == null || c0004b3.f214i.f139c.f139c != c0004b3.f214i) && (c0004b3.f216k.f139c == null || c0004b3.f216k.f139c.f139c != c0004b3.f216k)) {
                z6 = false;
            } else {
                ((C0005c) c0004b3.f223r).m123a(c0004b3, 0);
                z6 = true;
            }
            if ((c0004b3.f215j.f139c == null || c0004b3.f215j.f139c.f139c != c0004b3.f215j) && (c0004b3.f217l.f139c == null || c0004b3.f217l.f139c.f139c != c0004b3.f217l)) {
                z7 = false;
            } else {
                ((C0005c) c0004b3.f223r).m123a(c0004b3, 1);
                z7 = true;
            }
            if (c0004b3.f223r.m51B() == a.WRAP_CONTENT && !z6) {
                if (c0004b3.f214i.f139c == null || c0004b3.f214i.f139c.f137a != c0004b3.f223r) {
                    C0016g c0016gM189a6 = c0014e.m189a(c0004b3.f223r.f214i);
                    C0011b c0011bM197b = c0014e.m197b();
                    c0011bM197b.m157a(c0016gM189a, c0016gM189a6, c0014e.m200c(), 0);
                    c0014e.m191a(c0011bM197b);
                } else if (c0004b3.f214i.f139c != null && c0004b3.f214i.f139c.f137a == c0004b3.f223r) {
                    c0004b3.f214i.m34a(C0003a.a.STRICT);
                }
                if (c0004b3.f216k.f139c == null || c0004b3.f216k.f139c.f137a != c0004b3.f223r) {
                    C0016g c0016gM189a7 = c0014e.m189a(c0004b3.f223r.f216k);
                    C0011b c0011bM197b2 = c0014e.m197b();
                    c0011bM197b2.m157a(c0016gM189a7, c0016gM189a2, c0014e.m200c(), 0);
                    c0014e.m191a(c0011bM197b2);
                } else if (c0004b3.f216k.f139c != null && c0004b3.f216k.f139c.f137a == c0004b3.f223r) {
                    c0004b3.f216k.m34a(C0003a.a.STRICT);
                }
            }
            if (c0004b3.f223r.m52C() == a.WRAP_CONTENT && !z7) {
                if (c0004b3.f215j.f139c == null || c0004b3.f215j.f139c.f137a != c0004b3.f223r) {
                    C0016g c0016gM189a8 = c0014e.m189a(c0004b3.f223r.f215j);
                    C0011b c0011bM197b3 = c0014e.m197b();
                    c0011bM197b3.m157a(c0016gM189a3, c0016gM189a8, c0014e.m200c(), 0);
                    c0014e.m191a(c0011bM197b3);
                } else if (c0004b3.f215j.f139c != null && c0004b3.f215j.f139c.f137a == c0004b3.f223r) {
                    c0004b3.f215j.m34a(C0003a.a.STRICT);
                }
                if (c0004b3.f217l.f139c == null || c0004b3.f217l.f139c.f137a != c0004b3.f223r) {
                    C0016g c0016gM189a9 = c0014e.m189a(c0004b3.f223r.f217l);
                    C0011b c0011bM197b4 = c0014e.m197b();
                    c0011bM197b4.m157a(c0016gM189a9, c0016gM189a4, c0014e.m200c(), 0);
                    c0014e.m191a(c0011bM197b4);
                } else if (c0004b3.f217l.f139c != null && c0004b3.f217l.f139c.f137a == c0004b3.f223r) {
                    c0004b3.f217l.m34a(C0003a.a.STRICT);
                }
            }
            z = z6;
            z2 = z7;
        } else {
            z = false;
            z2 = false;
        }
        int i11 = c0004b3.f224s;
        if (i11 < c0004b3.f167B) {
            i11 = c0004b3.f167B;
        }
        int i12 = c0004b3.f225t;
        if (i12 < c0004b3.f168C) {
            i12 = c0004b3.f168C;
        }
        boolean z8 = c0004b3.f171G != a.MATCH_CONSTRAINT;
        boolean z9 = c0004b3.f172H != a.MATCH_CONSTRAINT;
        if (!z8 && c0004b3.f214i != null && c0004b3.f216k != null && (c0004b3.f214i.f139c == null || c0004b3.f216k.f139c == null)) {
            z8 = true;
        }
        if (!z9 && c0004b3.f215j != null && c0004b3.f217l != null && ((c0004b3.f215j.f139c == null || c0004b3.f217l.f139c == null) && (c0004b3.f166A == 0 || (c0004b3.f218m != null && (c0004b3.f215j.f139c == null || c0004b3.f218m.f139c == null))))) {
            z9 = true;
        }
        int i13 = c0004b3.f227v;
        float f2 = c0004b3.f226u;
        C0016g c0016g16 = c0016gM189a4;
        if (c0004b3.f226u <= 0.0f || c0004b3.f204am == 8) {
            i2 = i11;
            i3 = i12;
            z3 = z9;
            i4 = i13;
            f = f2;
            z4 = false;
            z5 = z8;
        } else if (c0004b3.f171G == a.MATCH_CONSTRAINT && c0004b3.f172H == a.MATCH_CONSTRAINT) {
            if (z8 && !z9) {
                i2 = i11;
                i3 = i12;
                z3 = z9;
                f = f2;
                i4 = 0;
            } else if (z8 || !z9) {
                i2 = i11;
                i3 = i12;
                z3 = z9;
                i4 = i13;
                f = f2;
            } else {
                if (c0004b3.f227v == -1) {
                    i2 = i11;
                    i3 = i12;
                    z3 = z9;
                    f = 1.0f / f2;
                } else {
                    i2 = i11;
                    i3 = i12;
                    z3 = z9;
                    f = f2;
                }
                i4 = 1;
            }
            z4 = true;
            z5 = z8;
        } else if (c0004b3.f171G == a.MATCH_CONSTRAINT) {
            i2 = (int) (c0004b3.f225t * f2);
            i3 = i12;
            z3 = z9;
            f = f2;
            z5 = true;
            i4 = 0;
            z4 = false;
        } else {
            if (c0004b3.f172H == a.MATCH_CONSTRAINT) {
                if (c0004b3.f227v == -1) {
                    f2 = 1.0f / f2;
                }
                i2 = i11;
                i3 = (int) (c0004b3.f224s * f2);
                z5 = z8;
                f = f2;
                i4 = 1;
                z4 = false;
                z3 = true;
            }
            i2 = i11;
            i3 = i12;
            z3 = z9;
            i4 = i13;
            f = f2;
            z4 = false;
            z5 = z8;
        }
        boolean z10 = z4 && (i4 == 0 || i4 == -1);
        boolean z11 = c0004b3.f171G == a.WRAP_CONTENT && (c0004b3 instanceof C0005c);
        if (c0004b3.f191a == 2 || !(i == Integer.MAX_VALUE || (c0004b3.f214i.f143g == i && c0004b3.f216k.f143g == i))) {
            i5 = i3;
            c0016g = c0016gM189a5;
            c0016g2 = c0016gM189a3;
            c0016g3 = c0016gM189a2;
            c0016g4 = c0016gM189a;
            i6 = i4;
            c0016g5 = c0016g16;
        } else if (!z10 || c0004b3.f214i.f139c == null || c0004b3.f216k.f139c == null) {
            i5 = i3;
            c0016g = c0016gM189a5;
            c0016g5 = c0016g16;
            c0016g2 = c0016gM189a3;
            c0016g3 = c0016gM189a2;
            c0016g4 = c0016gM189a;
            i6 = i4;
            c0004b3.m49a(c0014e, z11, z5, c0004b3.f214i, c0004b3.f216k, c0004b3.f228w, c0004b3.f228w + i2, i2, c0004b3.f167B, c0004b3.f169E, z10, z, c0004b3.f208c, c0004b3.f210e, c0004b3.f211f);
            c0004b3 = this;
        } else {
            C0016g c0016gM189a10 = c0014e.m189a(c0004b3.f214i);
            C0016g c0016gM189a11 = c0014e.m189a(c0004b3.f216k);
            C0016g c0016gM189a12 = c0014e.m189a(c0004b3.f214i.m43f());
            C0016g c0016gM189a13 = c0014e.m189a(c0004b3.f216k.m43f());
            c0014e.m195a(c0016gM189a10, c0016gM189a12, c0004b3.f214i.m41d(), 3);
            c0014e.m198b(c0016gM189a11, c0016gM189a13, c0004b3.f216k.m41d() * (-1), 3);
            if (z) {
                i5 = i3;
                c0016g = c0016gM189a5;
                c0016g5 = c0016g16;
            } else {
                i5 = i3;
                c0016g = c0016gM189a5;
                c0016g5 = c0016g16;
                c0014e.m194a(c0016gM189a10, c0016gM189a12, c0004b3.f214i.m41d(), c0004b3.f169E, c0016gM189a13, c0016gM189a11, c0004b3.f216k.m41d(), 4);
            }
            c0016g2 = c0016gM189a3;
            c0016g3 = c0016gM189a2;
            c0016g4 = c0016gM189a;
            i6 = i4;
        }
        if (c0004b3.f207b == 2) {
            return;
        }
        boolean z12 = c0004b3.f172H == a.WRAP_CONTENT && (c0004b3 instanceof C0005c);
        if (z4) {
            i7 = i6;
            boolean z13 = i7 == 1 || i7 == -1;
            if (c0004b3.f166A <= 0) {
                C0003a c0003a2 = c0004b3.f217l;
                if (i == Integer.MAX_VALUE || (c0004b3.f217l.f143g == i && c0004b3.f218m.f143g == i)) {
                    c0016g14 = c0016g2;
                    c0014e3 = c0014e;
                    c0014e3.m199c(c0016g, c0016g14, m108w(), 5);
                } else {
                    c0016g14 = c0016g2;
                    c0014e3 = c0014e;
                }
                if (c0004b3.f218m.f139c != null) {
                    i10 = c0004b3.f166A;
                    c0003a = c0004b3.f218m;
                } else {
                    c0003a = c0003a2;
                    i10 = i5;
                }
                if (i != Integer.MAX_VALUE && (c0004b3.f215j.f143g != i || c0003a.f143g != i)) {
                    i8 = i7;
                    c0016g6 = c0016g5;
                    c0016g7 = c0016g14;
                } else if (!z13 || c0004b3.f215j.f139c == null || c0004b3.f217l.f139c == null) {
                    i8 = i7;
                    c0004b3.m49a(c0014e3, z12, z3, c0004b3.f215j, c0003a, c0004b3.f229x, c0004b3.f229x + i10, i10, c0004b3.f168C, c0004b3.f170F, z13, z2, c0004b3.f209d, c0004b3.f212g, c0004b3.f213h);
                    c0016g6 = c0016g5;
                    c0016g7 = c0016g14;
                    c0014e.m199c(c0016g6, c0016g7, i5, 5);
                } else {
                    C0016g c0016gM189a14 = c0014e3.m189a(c0004b3.f215j);
                    C0016g c0016gM189a15 = c0014e3.m189a(c0004b3.f217l);
                    C0016g c0016gM189a16 = c0014e3.m189a(c0004b3.f215j.m43f());
                    C0016g c0016gM189a17 = c0014e3.m189a(c0004b3.f217l.m43f());
                    c0014e3.m195a(c0016gM189a14, c0016gM189a16, c0004b3.f215j.m41d(), 3);
                    c0014e3.m198b(c0016gM189a15, c0016gM189a17, c0004b3.f217l.m41d() * (-1), 3);
                    if (z2) {
                        c0016g15 = c0016g14;
                        c0014e4 = c0014e3;
                    } else {
                        c0016g15 = c0016g14;
                        c0014e4 = c0014e3;
                        c0014e3.m194a(c0016gM189a14, c0016gM189a16, c0004b3.f215j.m41d(), c0004b3.f170F, c0016gM189a17, c0016gM189a15, c0004b3.f217l.m41d(), 4);
                    }
                    i8 = i7;
                    c0016g6 = c0016g5;
                    c0016g7 = c0016g15;
                }
            } else {
                i8 = i7;
                int i14 = i5;
                c0016g6 = c0016g5;
                c0016g7 = c0016g2;
                if (i != Integer.MAX_VALUE) {
                    c0004b = this;
                    if (c0004b.f215j.f143g != i || c0004b.f217l.f143g != i) {
                    }
                    if (z4) {
                        return;
                    }
                    C0011b c0011bM197b5 = c0014e.m197b();
                    if (i != Integer.MAX_VALUE) {
                        c0004b2 = this;
                        if (c0004b2.f214i.f143g != i || c0004b2.f216k.f143g != i) {
                            return;
                        }
                    } else {
                        c0004b2 = this;
                    }
                    int i15 = i8;
                    if (i15 == 0) {
                        c0011bM197b5 = c0011bM197b5.m158a(c0016g3, c0016g4, c0016g8, c0016g9, f);
                        c0014e2 = c0014e;
                    } else {
                        c0014e2 = c0014e;
                        if (i15 == 1) {
                            c0011bM197b5 = c0011bM197b5.m158a(c0016g8, c0016g9, c0016g3, c0016g4, f);
                        } else {
                            if (c0004b2.f210e > 0) {
                                c0016g10 = c0016g3;
                                c0016g11 = c0016g4;
                                i9 = 3;
                                c0014e2.m195a(c0016g10, c0016g11, c0004b2.f210e, 3);
                            } else {
                                c0016g10 = c0016g3;
                                c0016g11 = c0016g4;
                                i9 = 3;
                            }
                            if (c0004b2.f212g > 0) {
                                c0016g12 = c0016g8;
                                c0016g13 = c0016g9;
                                c0014e2.m195a(c0016g12, c0016g13, c0004b2.f212g, i9);
                            } else {
                                c0016g12 = c0016g8;
                                c0016g13 = c0016g9;
                            }
                            c0011bM197b5.m158a(c0016g10, c0016g11, c0016g12, c0016g13, f);
                            C0016g c0016gM201d = c0014e.m201d();
                            C0016g c0016gM201d2 = c0014e.m201d();
                            c0016gM201d.f308c = 4;
                            c0016gM201d2.f308c = 4;
                            c0011bM197b5.m153a(c0016gM201d, c0016gM201d2);
                        }
                    }
                    c0014e2.m191a(c0011bM197b5);
                    return;
                }
                c0004b = this;
                if (!z13 || c0004b.f215j.f139c == null || c0004b.f217l.f139c == null) {
                    c0016g8 = c0016g6;
                    c0016g9 = c0016g7;
                    c0004b.m49a(c0014e, z12, z3, c0004b.f215j, c0004b.f217l, c0004b.f229x, c0004b.f229x + i14, i14, c0004b.f168C, c0004b.f170F, z13, z2, c0004b.f209d, c0004b.f212g, c0004b.f213h);
                    if (z4) {
                    }
                } else {
                    C0016g c0016gM189a18 = c0014e.m189a(c0004b.f215j);
                    C0016g c0016gM189a19 = c0014e.m189a(c0004b.f217l);
                    C0016g c0016gM189a20 = c0014e.m189a(c0004b.f215j.m43f());
                    C0016g c0016gM189a21 = c0014e.m189a(c0004b.f217l.m43f());
                    c0014e.m195a(c0016gM189a18, c0016gM189a20, c0004b.f215j.m41d(), 3);
                    c0014e.m198b(c0016gM189a19, c0016gM189a21, c0004b.f217l.m41d() * (-1), 3);
                    if (!z2) {
                        c0014e.m194a(c0016gM189a18, c0016gM189a20, c0004b.f215j.m41d(), c0004b.f170F, c0016gM189a21, c0016gM189a19, c0004b.f217l.m41d(), 4);
                    }
                }
            }
            c0016g8 = c0016g6;
            c0016g9 = c0016g7;
            if (z4) {
            }
        } else {
            i7 = i6;
        }
        if (c0004b3.f166A <= 0) {
        }
        c0016g8 = c0016g6;
        c0016g9 = c0016g7;
        if (z4) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m65a(Object obj) {
        this.f202ak = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[PHI: r0
  0x0084: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:45:0x0084, B:35:0x007d, B:23:0x004f, B:25:0x0055, B:27:0x0061, B:29:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0084 -> B:39:0x0085). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m66a(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f226u = 0.0f;
            return;
        }
        int i2 = -1;
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i3 = 0;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (strSubstring.equalsIgnoreCase("W")) {
                i2 = 0;
            } else if (strSubstring.equalsIgnoreCase("H")) {
                i2 = 1;
            }
            i3 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
            String strSubstring2 = str.substring(i3);
            fAbs = strSubstring2.length() > 0 ? Float.parseFloat(strSubstring2) : 0.0f;
        } else {
            String strSubstring3 = str.substring(i3, iIndexOf2);
            String strSubstring4 = str.substring(iIndexOf2 + 1);
            if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                float f = Float.parseFloat(strSubstring3);
                float f2 = Float.parseFloat(strSubstring4);
                if (f > 0.0f && f2 > 0.0f) {
                    fAbs = i2 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                }
            }
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.f226u = fAbs;
            this.f227v = i2;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m67b(float f) {
        this.f170F = f;
    }

    /* JADX INFO: renamed from: b */
    public void m68b(int i) {
        this.f228w = i;
    }

    /* JADX INFO: renamed from: b */
    public void mo69b(int i, int i2) {
        this.f230y = i;
        this.f231z = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m70b(int i, int i2, int i3) {
        this.f209d = i;
        this.f212g = i2;
        this.f213h = i3;
    }

    /* JADX INFO: renamed from: b */
    public void m71b(a aVar) {
        this.f172H = aVar;
        if (this.f172H == a.WRAP_CONTENT) {
            m83e(this.f201aj);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo72b(C0014e c0014e, int i) {
        if (i == Integer.MAX_VALUE) {
            m59a(c0014e.m196b(this.f214i), c0014e.m196b(this.f215j), c0014e.m196b(this.f216k), c0014e.m196b(this.f217l));
            return;
        }
        if (i == -2) {
            m59a(this.f192aa, this.f193ab, this.f194ac, this.f195ad);
            return;
        }
        if (this.f214i.f143g == i) {
            this.f192aa = c0014e.m196b(this.f214i);
        }
        if (this.f215j.f143g == i) {
            this.f193ab = c0014e.m196b(this.f215j);
        }
        if (this.f216k.f143g == i) {
            this.f194ac = c0014e.m196b(this.f216k);
        }
        if (this.f217l.f143g == i) {
            this.f195ad = c0014e.m196b(this.f217l);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m73b() {
        return this.f223r == null;
    }

    /* JADX INFO: renamed from: c */
    public C0004b m74c() {
        return this.f223r;
    }

    /* JADX INFO: renamed from: c */
    public void m75c(float f) {
        this.f187W = f;
    }

    /* JADX INFO: renamed from: c */
    public void m76c(int i) {
        this.f229x = i;
    }

    /* JADX INFO: renamed from: c */
    public void m77c(int i, int i2) {
        this.f228w = i;
        this.f224s = i2 - i;
        if (this.f224s < this.f167B) {
            this.f224s = this.f167B;
        }
    }

    /* JADX INFO: renamed from: d */
    public int m78d() {
        return this.f204am;
    }

    /* JADX INFO: renamed from: d */
    public void m79d(float f) {
        this.f188X = f;
    }

    /* JADX INFO: renamed from: d */
    public void m80d(int i) {
        this.f224s = i;
        if (this.f224s < this.f167B) {
            this.f224s = this.f167B;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m81d(int i, int i2) {
        this.f229x = i;
        this.f225t = i2 - i;
        if (this.f225t < this.f168C) {
            this.f225t = this.f168C;
        }
    }

    /* JADX INFO: renamed from: e */
    public String m82e() {
        return this.f205an;
    }

    /* JADX INFO: renamed from: e */
    public void m83e(int i) {
        this.f225t = i;
        if (this.f225t < this.f168C) {
            this.f225t = this.f168C;
        }
    }

    /* JADX INFO: renamed from: f */
    public int m84f() {
        return this.f228w;
    }

    /* JADX INFO: renamed from: f */
    public void m85f(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f167B = i;
    }

    /* JADX INFO: renamed from: g */
    public int m86g() {
        return this.f229x;
    }

    /* JADX INFO: renamed from: g */
    public void m87g(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f168C = i;
    }

    /* JADX INFO: renamed from: h */
    public int m88h() {
        if (this.f204am == 8) {
            return 0;
        }
        return this.f224s;
    }

    /* JADX INFO: renamed from: h */
    public void m89h(int i) {
        this.f200ai = i;
    }

    /* JADX INFO: renamed from: i */
    public int m90i() {
        int iMax;
        int i = this.f224s;
        if (this.f171G != a.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.f208c == 1) {
            iMax = Math.max(this.f210e, i);
        } else if (this.f210e > 0) {
            iMax = this.f210e;
            this.f224s = iMax;
        } else {
            iMax = 0;
        }
        return (this.f211f <= 0 || this.f211f >= iMax) ? iMax : this.f211f;
    }

    /* JADX INFO: renamed from: i */
    public void m91i(int i) {
        this.f201aj = i;
    }

    /* JADX INFO: renamed from: j */
    public int m92j() {
        int iMax;
        int i = this.f225t;
        if (this.f172H != a.MATCH_CONSTRAINT) {
            return i;
        }
        if (this.f209d == 1) {
            iMax = Math.max(this.f212g, i);
        } else if (this.f212g > 0) {
            iMax = this.f212g;
            this.f225t = iMax;
        } else {
            iMax = 0;
        }
        return (this.f213h <= 0 || this.f213h >= iMax) ? iMax : this.f213h;
    }

    /* JADX INFO: renamed from: j */
    public void m93j(int i) {
        this.f166A = i;
    }

    /* JADX INFO: renamed from: k */
    public int m94k() {
        return this.f200ai;
    }

    /* JADX INFO: renamed from: k */
    public void m95k(int i) {
        this.f183S = i;
    }

    /* JADX INFO: renamed from: l */
    public int m96l() {
        if (this.f204am == 8) {
            return 0;
        }
        return this.f225t;
    }

    /* JADX INFO: renamed from: l */
    public void m97l(int i) {
        this.f184T = i;
    }

    /* JADX INFO: renamed from: m */
    public int m98m() {
        return this.f201aj;
    }

    /* JADX INFO: renamed from: n */
    public int m99n() {
        return this.f196ae + this.f230y;
    }

    /* JADX INFO: renamed from: o */
    public int m100o() {
        return this.f197af + this.f231z;
    }

    /* JADX INFO: renamed from: p */
    public int m101p() {
        return m100o() + this.f199ah;
    }

    /* JADX INFO: renamed from: q */
    public int m102q() {
        return m99n() + this.f198ag;
    }

    /* JADX INFO: renamed from: r */
    protected int m103r() {
        return this.f228w + this.f230y;
    }

    /* JADX INFO: renamed from: s */
    protected int m104s() {
        return this.f229x + this.f231z;
    }

    /* JADX INFO: renamed from: t */
    public int m105t() {
        return m84f() + this.f224s;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (this.f206ao != null) {
            str = "type: " + this.f206ao + " ";
        } else {
            str = "";
        }
        sb.append(str);
        if (this.f205an != null) {
            str2 = "id: " + this.f205an + " ";
        } else {
            str2 = "";
        }
        sb.append(str2);
        sb.append("(");
        sb.append(this.f228w);
        sb.append(", ");
        sb.append(this.f229x);
        sb.append(") - (");
        sb.append(this.f224s);
        sb.append(" x ");
        sb.append(this.f225t);
        sb.append(")");
        sb.append(" wrap: (");
        sb.append(this.f200ai);
        sb.append(" x ");
        sb.append(this.f201aj);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public int m106u() {
        return m86g() + this.f225t;
    }

    /* JADX INFO: renamed from: v */
    public boolean m107v() {
        return this.f166A > 0;
    }

    /* JADX INFO: renamed from: w */
    public int m108w() {
        return this.f166A;
    }

    /* JADX INFO: renamed from: x */
    public Object m109x() {
        return this.f202ak;
    }

    /* JADX INFO: renamed from: y */
    public ArrayList<C0003a> mo110y() {
        return this.f222q;
    }

    /* JADX INFO: renamed from: z */
    public void mo111z() {
        int i = this.f228w;
        int i2 = this.f229x;
        int i3 = this.f228w + this.f224s;
        int i4 = this.f229x + this.f225t;
        this.f196ae = i;
        this.f197af = i2;
        this.f198ag = i3 - i;
        this.f199ah = i4 - i2;
    }
}
