package android.support.constraint.p000a.p001a;

import android.support.constraint.p000a.C0014e;
import android.support.constraint.p000a.C0016g;
import android.support.constraint.p000a.p001a.C0004b;

/* JADX INFO: renamed from: android.support.constraint.a.a.e */
/* JADX INFO: loaded from: classes.dex */
public class C0007e {
    /* JADX INFO: renamed from: a */
    static void m138a(C0005c c0005c, C0014e c0014e, int i, C0004b c0004b) {
        int iM84f;
        float f;
        float f2;
        float fM88h;
        C0004b c0004b2 = c0004b;
        C0004b c0004b3 = null;
        int i2 = 0;
        int iM88h = 0;
        float f3 = 0.0f;
        while (true) {
            if (c0004b2 == null) {
                break;
            }
            if (!(c0004b2.m78d() == 8)) {
                i2++;
                if (c0004b2.f171G != C0004b.a.MATCH_CONSTRAINT) {
                    iM88h = iM88h + c0004b2.m88h() + (c0004b2.f214i.f139c != null ? c0004b2.f214i.m41d() : 0) + (c0004b2.f216k.f139c != null ? c0004b2.f216k.m41d() : 0);
                } else {
                    f3 += c0004b2.f187W;
                }
            }
            C0004b c0004b4 = c0004b2.f216k.f139c != null ? c0004b2.f216k.f139c.f137a : null;
            if (c0004b4 != null && (c0004b4.f214i.f139c == null || (c0004b4.f214i.f139c != null && c0004b4.f214i.f139c.f137a != c0004b2))) {
                c0004b4 = null;
            }
            C0004b c0004b5 = c0004b4;
            c0004b3 = c0004b2;
            c0004b2 = c0004b5;
        }
        if (c0004b3 != null) {
            iM84f = c0004b3.f216k.f139c != null ? c0004b3.f216k.f139c.f137a.m84f() : 0;
            if (c0004b3.f216k.f139c != null && c0004b3.f216k.f139c.f137a == c0005c) {
                iM84f = c0005c.m105t();
            }
        } else {
            iM84f = 0;
        }
        float f4 = (iM84f - 0) - iM88h;
        float f5 = f4 / (i2 + 1);
        if (i == 0) {
            f2 = f5;
            f = f2;
        } else {
            f = f4 / i;
            f2 = 0.0f;
        }
        C0004b c0004b6 = c0004b;
        while (c0004b6 != null) {
            int iM41d = c0004b6.f214i.f139c != null ? c0004b6.f214i.m41d() : 0;
            int iM41d2 = c0004b6.f216k.f139c != null ? c0004b6.f216k.m41d() : 0;
            if (c0004b6.m78d() != 8) {
                float f6 = iM41d;
                float f7 = f2 + f6;
                c0014e.m193a(c0004b6.f214i.f142f, (int) (f7 + 0.5f));
                if (c0004b6.f171G == C0004b.a.MATCH_CONSTRAINT) {
                    fM88h = (f3 == 0.0f ? f - f6 : ((c0004b6.f187W * f4) / f3) - f6) - iM41d2;
                } else {
                    fM88h = c0004b6.m88h();
                }
                float f8 = f7 + fM88h;
                c0014e.m193a(c0004b6.f216k.f142f, (int) (0.5f + f8));
                if (i == 0) {
                    f8 += f;
                }
                f2 = f8 + iM41d2;
            } else {
                int i3 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                c0014e.m193a(c0004b6.f214i.f142f, i3);
                c0014e.m193a(c0004b6.f216k.f142f, i3);
            }
            C0004b c0004b7 = c0004b6.f216k.f139c != null ? c0004b6.f216k.f139c.f137a : null;
            if (c0004b7 != null && c0004b7.f214i.f139c != null && c0004b7.f214i.f139c.f137a != c0004b6) {
                c0004b7 = null;
            }
            c0004b6 = c0004b7 == c0005c ? null : c0004b7;
        }
    }

    /* JADX INFO: renamed from: a */
    static void m139a(C0005c c0005c, C0014e c0014e, C0004b c0004b) {
        if (c0005c.f171G != C0004b.a.WRAP_CONTENT && c0004b.f171G == C0004b.a.MATCH_PARENT) {
            c0004b.f214i.f142f = c0014e.m189a(c0004b.f214i);
            c0004b.f216k.f142f = c0014e.m189a(c0004b.f216k);
            int i = c0004b.f214i.f140d;
            int iH = c0005c.m88h() - c0004b.f216k.f140d;
            c0014e.m193a(c0004b.f214i.f142f, i);
            c0014e.m193a(c0004b.f216k.f142f, iH);
            c0004b.m77c(i, iH);
            c0004b.f191a = 2;
        }
        if (c0005c.f172H == C0004b.a.WRAP_CONTENT || c0004b.f172H != C0004b.a.MATCH_PARENT) {
            return;
        }
        c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
        c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
        int i2 = c0004b.f215j.f140d;
        int iL = c0005c.m96l() - c0004b.f217l.f140d;
        c0014e.m193a(c0004b.f215j.f142f, i2);
        c0014e.m193a(c0004b.f217l.f142f, iL);
        if (c0004b.f166A > 0 || c0004b.m78d() == 8) {
            c0004b.f218m.f142f = c0014e.m189a(c0004b.f218m);
            c0014e.m193a(c0004b.f218m.f142f, c0004b.f166A + i2);
        }
        c0004b.m81d(i2, iL);
        c0004b.f207b = 2;
    }

    /* JADX INFO: renamed from: b */
    static void m140b(C0005c c0005c, C0014e c0014e, int i, C0004b c0004b) {
        int iM84f;
        float f;
        float f2;
        float fM96l;
        C0004b c0004b2 = c0004b;
        C0004b c0004b3 = null;
        int i2 = 0;
        int iM96l = 0;
        float f3 = 0.0f;
        while (true) {
            if (c0004b2 == null) {
                break;
            }
            if (!(c0004b2.m78d() == 8)) {
                i2++;
                if (c0004b2.f172H != C0004b.a.MATCH_CONSTRAINT) {
                    iM96l = iM96l + c0004b2.m96l() + (c0004b2.f215j.f139c != null ? c0004b2.f215j.m41d() : 0) + (c0004b2.f217l.f139c != null ? c0004b2.f217l.m41d() : 0);
                } else {
                    f3 += c0004b2.f188X;
                }
            }
            C0004b c0004b4 = c0004b2.f217l.f139c != null ? c0004b2.f217l.f139c.f137a : null;
            if (c0004b4 != null && (c0004b4.f215j.f139c == null || (c0004b4.f215j.f139c != null && c0004b4.f215j.f139c.f137a != c0004b2))) {
                c0004b4 = null;
            }
            C0004b c0004b5 = c0004b4;
            c0004b3 = c0004b2;
            c0004b2 = c0004b5;
        }
        if (c0004b3 != null) {
            iM84f = c0004b3.f217l.f139c != null ? c0004b3.f217l.f139c.f137a.m84f() : 0;
            if (c0004b3.f217l.f139c != null && c0004b3.f217l.f139c.f137a == c0005c) {
                iM84f = c0005c.m106u();
            }
        } else {
            iM84f = 0;
        }
        float f4 = (iM84f - 0) - iM96l;
        float f5 = f4 / (i2 + 1);
        if (i == 0) {
            f2 = f5;
            f = f2;
        } else {
            f = f4 / i;
            f2 = 0.0f;
        }
        C0004b c0004b6 = c0004b;
        while (c0004b6 != null) {
            int iM41d = c0004b6.f215j.f139c != null ? c0004b6.f215j.m41d() : 0;
            int iM41d2 = c0004b6.f217l.f139c != null ? c0004b6.f217l.m41d() : 0;
            if (c0004b6.m78d() != 8) {
                float f6 = iM41d;
                float f7 = f2 + f6;
                c0014e.m193a(c0004b6.f215j.f142f, (int) (f7 + 0.5f));
                if (c0004b6.f172H == C0004b.a.MATCH_CONSTRAINT) {
                    fM96l = (f3 == 0.0f ? f - f6 : ((c0004b6.f188X * f4) / f3) - f6) - iM41d2;
                } else {
                    fM96l = c0004b6.m96l();
                }
                float f8 = f7 + fM96l;
                c0014e.m193a(c0004b6.f217l.f142f, (int) (0.5f + f8));
                if (i == 0) {
                    f8 += f;
                }
                f2 = f8 + iM41d2;
            } else {
                int i3 = (int) ((f2 - (f / 2.0f)) + 0.5f);
                c0014e.m193a(c0004b6.f215j.f142f, i3);
                c0014e.m193a(c0004b6.f217l.f142f, i3);
            }
            C0004b c0004b7 = c0004b6.f217l.f139c != null ? c0004b6.f217l.f139c.f137a : null;
            if (c0004b7 != null && c0004b7.f215j.f139c != null && c0004b7.f215j.f139c.f137a != c0004b6) {
                c0004b7 = null;
            }
            c0004b6 = c0004b7 == c0005c ? null : c0004b7;
        }
    }

    /* JADX INFO: renamed from: b */
    static void m141b(C0005c c0005c, C0014e c0014e, C0004b c0004b) {
        int iM41d;
        int iM41d2;
        int iM88h;
        int iM88h2;
        if (c0004b.f171G == C0004b.a.MATCH_CONSTRAINT) {
            c0004b.f191a = 1;
            return;
        }
        if (c0005c.f171G != C0004b.a.WRAP_CONTENT && c0004b.f171G == C0004b.a.MATCH_PARENT) {
            c0004b.f214i.f142f = c0014e.m189a(c0004b.f214i);
            c0004b.f216k.f142f = c0014e.m189a(c0004b.f216k);
            int i = c0004b.f214i.f140d;
            int iH = c0005c.m88h() - c0004b.f216k.f140d;
            c0014e.m193a(c0004b.f214i.f142f, i);
            c0014e.m193a(c0004b.f216k.f142f, iH);
            c0004b.m77c(i, iH);
            c0004b.f191a = 2;
            return;
        }
        if (c0004b.f214i.f139c != null && c0004b.f216k.f139c != null) {
            if (c0004b.f214i.f139c.f137a != c0005c || c0004b.f216k.f139c.f137a != c0005c) {
                c0004b.f191a = 1;
                return;
            }
            int iM41d3 = c0004b.f214i.m41d();
            int iM41d4 = c0004b.f216k.m41d();
            if (c0005c.f171G == C0004b.a.MATCH_CONSTRAINT) {
                iM88h2 = c0005c.m88h() - iM41d4;
            } else {
                iM41d3 += (int) (((((c0005c.m88h() - iM41d3) - iM41d4) - c0004b.m88h()) * c0004b.f169E) + 0.5f);
                iM88h2 = c0004b.m88h() + iM41d3;
            }
            c0004b.f214i.f142f = c0014e.m189a(c0004b.f214i);
            c0004b.f216k.f142f = c0014e.m189a(c0004b.f216k);
            c0014e.m193a(c0004b.f214i.f142f, iM41d3);
            c0014e.m193a(c0004b.f216k.f142f, iM88h2);
            c0004b.f191a = 2;
            c0004b.m77c(iM41d3, iM88h2);
            return;
        }
        if (c0004b.f214i.f139c == null || c0004b.f214i.f139c.f137a != c0005c) {
            if (c0004b.f216k.f139c != null && c0004b.f216k.f139c.f137a == c0005c) {
                c0004b.f214i.f142f = c0014e.m189a(c0004b.f214i);
                c0004b.f216k.f142f = c0014e.m189a(c0004b.f216k);
                iM41d = c0005c.m88h() - c0004b.f216k.m41d();
            } else if (c0004b.f214i.f139c != null && c0004b.f214i.f139c.f137a.f191a == 2) {
                C0016g c0016g = c0004b.f214i.f139c.f142f;
                c0004b.f214i.f142f = c0014e.m189a(c0004b.f214i);
                c0004b.f216k.f142f = c0014e.m189a(c0004b.f216k);
                iM41d2 = (int) (c0016g.f309d + c0004b.f214i.m41d() + 0.5f);
                iM88h = c0004b.m88h() + iM41d2;
            } else {
                if (c0004b.f216k.f139c == null || c0004b.f216k.f139c.f137a.f191a != 2) {
                    boolean z = c0004b.f214i.f139c != null;
                    boolean z2 = c0004b.f216k.f139c != null;
                    if (z || z2) {
                        return;
                    }
                    if (!(c0004b instanceof C0006d)) {
                        c0004b.f214i.f142f = c0014e.m189a(c0004b.f214i);
                        c0004b.f216k.f142f = c0014e.m189a(c0004b.f216k);
                        int iM84f = c0004b.m84f();
                        int iM88h3 = c0004b.m88h() + iM84f;
                        c0014e.m193a(c0004b.f214i.f142f, iM84f);
                        c0014e.m193a(c0004b.f216k.f142f, iM88h3);
                        c0004b.f191a = 2;
                        return;
                    }
                    C0006d c0006d = (C0006d) c0004b;
                    if (c0006d.m130D() == 1) {
                        c0004b.f214i.f142f = c0014e.m189a(c0004b.f214i);
                        c0004b.f216k.f142f = c0014e.m189a(c0004b.f216k);
                        int iM132F = (int) ((c0006d.m132F() != -1 ? c0006d.m132F() : c0006d.m133G() != -1 ? c0005c.m88h() - c0006d.m133G() : c0006d.m131E() * c0005c.m88h()) + 0.5f);
                        c0014e.m193a(c0004b.f214i.f142f, iM132F);
                        c0014e.m193a(c0004b.f216k.f142f, iM132F);
                        c0004b.f191a = 2;
                        c0004b.f207b = 2;
                        c0004b.m77c(iM132F, iM132F);
                        c0004b.m81d(0, c0005c.m96l());
                        return;
                    }
                    return;
                }
                C0016g c0016g2 = c0004b.f216k.f139c.f142f;
                c0004b.f214i.f142f = c0014e.m189a(c0004b.f214i);
                c0004b.f216k.f142f = c0014e.m189a(c0004b.f216k);
                iM41d = (int) ((c0016g2.f309d - c0004b.f216k.m41d()) + 0.5f);
            }
            int iM88h4 = iM41d - c0004b.m88h();
            c0014e.m193a(c0004b.f214i.f142f, iM88h4);
            c0014e.m193a(c0004b.f216k.f142f, iM41d);
            c0004b.f191a = 2;
            c0004b.m77c(iM88h4, iM41d);
            return;
        }
        iM41d2 = c0004b.f214i.m41d();
        iM88h = c0004b.m88h() + iM41d2;
        c0004b.f214i.f142f = c0014e.m189a(c0004b.f214i);
        c0004b.f216k.f142f = c0014e.m189a(c0004b.f216k);
        c0014e.m193a(c0004b.f214i.f142f, iM41d2);
        c0014e.m193a(c0004b.f216k.f142f, iM88h);
        c0004b.f191a = 2;
        c0004b.m77c(iM41d2, iM88h);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0198 A[PHI: r0 r8
  0x0198: PHI (r0v74 int) = (r0v62 int), (r0v62 int), (r0v84 int), (r0v84 int) binds: [B:74:0x0253, B:76:0x0259, B:54:0x0190, B:56:0x0196] A[DONT_GENERATE, DONT_INLINE]
  0x0198: PHI (r8v27 int) = (r8v19 int), (r8v19 int), (r8v30 int), (r8v30 int) binds: [B:74:0x0253, B:76:0x0259, B:54:0x0190, B:56:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void m142c(C0005c c0005c, C0014e c0014e, C0004b c0004b) {
        int iM41d;
        int iM96l;
        int iM41d2;
        int iM96l2;
        if (c0004b.f172H == C0004b.a.MATCH_CONSTRAINT) {
            c0004b.f207b = 1;
            return;
        }
        if (c0005c.f172H != C0004b.a.WRAP_CONTENT && c0004b.f172H == C0004b.a.MATCH_PARENT) {
            c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
            c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
            int i = c0004b.f215j.f140d;
            int iL = c0005c.m96l() - c0004b.f217l.f140d;
            c0014e.m193a(c0004b.f215j.f142f, i);
            c0014e.m193a(c0004b.f217l.f142f, iL);
            if (c0004b.f166A > 0 || c0004b.m78d() == 8) {
                c0004b.f218m.f142f = c0014e.m189a(c0004b.f218m);
                c0014e.m193a(c0004b.f218m.f142f, c0004b.f166A + i);
            }
            c0004b.m81d(i, iL);
            c0004b.f207b = 2;
            return;
        }
        if (c0004b.f215j.f139c != null && c0004b.f217l.f139c != null) {
            if (c0004b.f215j.f139c.f137a != c0005c || c0004b.f217l.f139c.f137a != c0005c) {
                c0004b.f207b = 1;
                return;
            }
            int iM41d3 = c0004b.f215j.m41d();
            int iM41d4 = c0004b.f217l.m41d();
            if (c0005c.f172H != C0004b.a.MATCH_CONSTRAINT) {
                iM41d3 = (int) (iM41d3 + ((((c0005c.m96l() - iM41d3) - iM41d4) - c0004b.m96l()) * c0004b.f170F) + 0.5f);
            }
            int iM96l3 = c0004b.m96l() + iM41d3;
            c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
            c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
            c0014e.m193a(c0004b.f215j.f142f, iM41d3);
            c0014e.m193a(c0004b.f217l.f142f, iM96l3);
            if (c0004b.f166A > 0 || c0004b.m78d() == 8) {
                c0004b.f218m.f142f = c0014e.m189a(c0004b.f218m);
                c0014e.m193a(c0004b.f218m.f142f, c0004b.f166A + iM41d3);
            }
            c0004b.f207b = 2;
            c0004b.m81d(iM41d3, iM96l3);
            return;
        }
        if (c0004b.f215j.f139c == null || c0004b.f215j.f139c.f137a != c0005c) {
            if (c0004b.f217l.f139c == null || c0004b.f217l.f139c.f137a != c0005c) {
                if (c0004b.f215j.f139c != null && c0004b.f215j.f139c.f137a.f207b == 2) {
                    C0016g c0016g = c0004b.f215j.f139c.f142f;
                    c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
                    c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
                    iM41d = (int) (c0016g.f309d + c0004b.f215j.m41d() + 0.5f);
                    iM96l = c0004b.m96l() + iM41d;
                    c0014e.m193a(c0004b.f215j.f142f, iM41d);
                    c0014e.m193a(c0004b.f217l.f142f, iM96l);
                    if (c0004b.f166A > 0 || c0004b.m78d() == 8) {
                    }
                } else if (c0004b.f217l.f139c != null && c0004b.f217l.f139c.f137a.f207b == 2) {
                    C0016g c0016g2 = c0004b.f217l.f139c.f142f;
                    c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
                    c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
                    iM41d2 = (int) ((c0016g2.f309d - c0004b.f217l.m41d()) + 0.5f);
                    iM96l2 = iM41d2 - c0004b.m96l();
                    c0014e.m193a(c0004b.f215j.f142f, iM96l2);
                    c0014e.m193a(c0004b.f217l.f142f, iM41d2);
                    if (c0004b.f166A > 0 || c0004b.m78d() == 8) {
                        c0004b.f218m.f142f = c0014e.m189a(c0004b.f218m);
                        c0014e.m193a(c0004b.f218m.f142f, c0004b.f166A + iM96l2);
                    }
                } else {
                    if (c0004b.f218m.f139c == null || c0004b.f218m.f139c.f137a.f207b != 2) {
                        boolean z = c0004b.f218m.f139c != null;
                        boolean z2 = c0004b.f215j.f139c != null;
                        boolean z3 = c0004b.f217l.f139c != null;
                        if (z || z2 || z3) {
                            return;
                        }
                        if (!(c0004b instanceof C0006d)) {
                            c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
                            c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
                            int iM86g = c0004b.m86g();
                            int iM96l4 = c0004b.m96l() + iM86g;
                            c0014e.m193a(c0004b.f215j.f142f, iM86g);
                            c0014e.m193a(c0004b.f217l.f142f, iM96l4);
                            if (c0004b.f166A > 0 || c0004b.m78d() == 8) {
                                c0004b.f218m.f142f = c0014e.m189a(c0004b.f218m);
                                c0014e.m193a(c0004b.f218m.f142f, iM86g + c0004b.f166A);
                            }
                            c0004b.f207b = 2;
                            return;
                        }
                        C0006d c0006d = (C0006d) c0004b;
                        if (c0006d.m130D() == 0) {
                            c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
                            c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
                            int iM132F = (int) ((c0006d.m132F() != -1 ? c0006d.m132F() : c0006d.m133G() != -1 ? c0005c.m96l() - c0006d.m133G() : c0006d.m131E() * c0005c.m96l()) + 0.5f);
                            c0014e.m193a(c0004b.f215j.f142f, iM132F);
                            c0014e.m193a(c0004b.f217l.f142f, iM132F);
                            c0004b.f207b = 2;
                            c0004b.f191a = 2;
                            c0004b.m81d(iM132F, iM132F);
                            c0004b.m77c(0, c0005c.m88h());
                            return;
                        }
                        return;
                    }
                    C0016g c0016g3 = c0004b.f218m.f139c.f142f;
                    c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
                    c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
                    iM41d = (int) ((c0016g3.f309d - c0004b.f166A) + 0.5f);
                    iM96l = c0004b.m96l() + iM41d;
                    c0014e.m193a(c0004b.f215j.f142f, iM41d);
                    c0014e.m193a(c0004b.f217l.f142f, iM96l);
                }
                c0004b.f218m.f142f = c0014e.m189a(c0004b.f218m);
                c0014e.m193a(c0004b.f218m.f142f, c0004b.f166A + iM41d);
            } else {
                c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
                c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
                iM41d2 = c0005c.m96l() - c0004b.f217l.m41d();
                iM96l2 = iM41d2 - c0004b.m96l();
                c0014e.m193a(c0004b.f215j.f142f, iM96l2);
                c0014e.m193a(c0004b.f217l.f142f, iM41d2);
                if (c0004b.f166A > 0 || c0004b.m78d() == 8) {
                }
            }
            c0004b.f207b = 2;
            c0004b.m81d(iM96l2, iM41d2);
            return;
        }
        iM41d = c0004b.f215j.m41d();
        iM96l = c0004b.m96l() + iM41d;
        c0004b.f215j.f142f = c0014e.m189a(c0004b.f215j);
        c0004b.f217l.f142f = c0014e.m189a(c0004b.f217l);
        c0014e.m193a(c0004b.f215j.f142f, iM41d);
        c0014e.m193a(c0004b.f217l.f142f, iM96l);
        if (c0004b.f166A > 0 || c0004b.m78d() == 8) {
            c0004b.f218m.f142f = c0014e.m189a(c0004b.f218m);
            c0014e.m193a(c0004b.f218m.f142f, c0004b.f166A + iM41d);
        }
        c0004b.f207b = 2;
        c0004b.m81d(iM41d, iM96l);
    }
}
