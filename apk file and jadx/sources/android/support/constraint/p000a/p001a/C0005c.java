package android.support.constraint.p000a.p001a;

import android.support.constraint.p000a.C0011b;
import android.support.constraint.p000a.C0014e;
import android.support.constraint.p000a.C0016g;
import android.support.constraint.p000a.p001a.C0003a;
import android.support.constraint.p000a.p001a.C0004b;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: android.support.constraint.a.a.c */
/* JADX INFO: loaded from: classes.dex */
public class C0005c extends C0010h {

    /* JADX INFO: renamed from: ac */
    static boolean f238ac = true;

    /* JADX INFO: renamed from: ad */
    int f241ad;

    /* JADX INFO: renamed from: ae */
    int f242ae;

    /* JADX INFO: renamed from: af */
    int f243af;

    /* JADX INFO: renamed from: ag */
    int f244ag;

    /* JADX INFO: renamed from: ah */
    int f245ah;

    /* JADX INFO: renamed from: ai */
    int f246ai;

    /* JADX INFO: renamed from: ak */
    private C0009g f247ak;

    /* JADX INFO: renamed from: aa */
    protected C0014e f239aa = new C0014e();

    /* JADX INFO: renamed from: ab */
    protected C0014e f240ab = null;

    /* JADX INFO: renamed from: al */
    private int f248al = 0;

    /* JADX INFO: renamed from: am */
    private int f249am = 0;

    /* JADX INFO: renamed from: an */
    private C0004b[] f250an = new C0004b[4];

    /* JADX INFO: renamed from: ao */
    private C0004b[] f251ao = new C0004b[4];

    /* JADX INFO: renamed from: ap */
    private C0004b[] f252ap = new C0004b[4];

    /* JADX INFO: renamed from: aq */
    private int f253aq = 2;

    /* JADX INFO: renamed from: ar */
    private boolean[] f254ar = new boolean[3];

    /* JADX INFO: renamed from: as */
    private C0004b[] f255as = new C0004b[4];

    /* JADX INFO: renamed from: at */
    private boolean f256at = false;

    /* JADX INFO: renamed from: au */
    private boolean f257au = false;

    /* JADX INFO: renamed from: J */
    private void m112J() {
        this.f248al = 0;
        this.f249am = 0;
    }

    /* JADX INFO: renamed from: a */
    private int m113a(C0014e c0014e, C0004b[] c0004bArr, C0004b c0004b, int i, boolean[] zArr) {
        char c;
        char c2;
        zArr[0] = true;
        zArr[1] = false;
        C0004b c0004b2 = null;
        c0004bArr[0] = null;
        c0004bArr[2] = null;
        c0004bArr[1] = null;
        c0004bArr[3] = null;
        float f = 0.0f;
        int i2 = 5;
        int i3 = 8;
        if (i == 0) {
            boolean z = c0004b.f214i.f139c == null || c0004b.f214i.f139c.f137a == this;
            c0004b.f189Y = null;
            C0004b c0004b3 = null;
            C0004b c0004b4 = c0004b.m78d() != 8 ? c0004b : null;
            C0004b c0004b5 = c0004b4;
            int i4 = 0;
            C0004b c0004b6 = c0004b;
            while (c0004b6.f216k.f139c != null) {
                c0004b6.f189Y = c0004b2;
                if (c0004b6.m78d() != 8) {
                    if (c0004b5 == null) {
                        c0004b5 = c0004b6;
                    }
                    if (c0004b4 != null && c0004b4 != c0004b6) {
                        c0004b4.f189Y = c0004b6;
                    }
                    c0004b4 = c0004b6;
                } else {
                    c0014e.m199c(c0004b6.f214i.f142f, c0004b6.f214i.f139c.f142f, 0, 5);
                    c0014e.m199c(c0004b6.f216k.f142f, c0004b6.f214i.f142f, 0, 5);
                }
                if (c0004b6.m78d() != 8 && c0004b6.f171G == C0004b.a.MATCH_CONSTRAINT) {
                    if (c0004b6.f172H == C0004b.a.MATCH_CONSTRAINT) {
                        zArr[0] = false;
                    }
                    if (c0004b6.f226u <= f) {
                        zArr[0] = false;
                        int i5 = i4 + 1;
                        if (i5 >= this.f250an.length) {
                            this.f250an = (C0004b[]) Arrays.copyOf(this.f250an, this.f250an.length * 2);
                        }
                        this.f250an[i4] = c0004b6;
                        i4 = i5;
                    }
                }
                if (c0004b6.f216k.f139c.f137a.f214i.f139c == null || c0004b6.f216k.f139c.f137a.f214i.f139c.f137a != c0004b6 || c0004b6.f216k.f139c.f137a == c0004b6) {
                    break;
                }
                c0004b3 = c0004b6.f216k.f139c.f137a;
                c0004b6 = c0004b3;
                c0004b2 = null;
                f = 0.0f;
            }
            if (c0004b6.f216k.f139c != null && c0004b6.f216k.f139c.f137a != this) {
                z = false;
            }
            if (c0004b.f214i.f139c == null || c0004b3.f216k.f139c == null) {
                c2 = 1;
                zArr[1] = true;
            } else {
                c2 = 1;
            }
            c0004b.f185U = z;
            c0004b3.f189Y = null;
            c0004bArr[0] = c0004b;
            c0004bArr[2] = c0004b5;
            c0004bArr[c2] = c0004b3;
            c0004bArr[3] = c0004b4;
            return i4;
        }
        boolean z2 = c0004b.f215j.f139c == null || c0004b.f215j.f139c.f137a == this;
        C0004b c0004b7 = null;
        c0004b.f190Z = null;
        C0004b c0004b8 = null;
        C0004b c0004b9 = c0004b.m78d() != 8 ? c0004b : null;
        C0004b c0004b10 = c0004b9;
        int i6 = 0;
        C0004b c0004b11 = c0004b;
        while (c0004b11.f217l.f139c != null) {
            c0004b11.f190Z = c0004b7;
            if (c0004b11.m78d() != i3) {
                if (c0004b9 == null) {
                    c0004b9 = c0004b11;
                }
                if (c0004b10 != null && c0004b10 != c0004b11) {
                    c0004b10.f190Z = c0004b11;
                }
                c0004b10 = c0004b11;
            } else {
                c0014e.m199c(c0004b11.f215j.f142f, c0004b11.f215j.f139c.f142f, 0, i2);
                c0014e.m199c(c0004b11.f217l.f142f, c0004b11.f215j.f142f, 0, i2);
            }
            if (c0004b11.m78d() != i3 && c0004b11.f172H == C0004b.a.MATCH_CONSTRAINT) {
                if (c0004b11.f171G == C0004b.a.MATCH_CONSTRAINT) {
                    zArr[0] = false;
                }
                if (c0004b11.f226u <= 0.0f) {
                    zArr[0] = false;
                    int i7 = i6 + 1;
                    if (i7 >= this.f250an.length) {
                        this.f250an = (C0004b[]) Arrays.copyOf(this.f250an, this.f250an.length * 2);
                    }
                    this.f250an[i6] = c0004b11;
                    i6 = i7;
                }
            }
            if (c0004b11.f217l.f139c.f137a.f215j.f139c == null || c0004b11.f217l.f139c.f137a.f215j.f139c.f137a != c0004b11 || c0004b11.f217l.f139c.f137a == c0004b11) {
                break;
            }
            c0004b8 = c0004b11.f217l.f139c.f137a;
            c0004b11 = c0004b8;
            c0004b7 = null;
            i2 = 5;
            i3 = 8;
        }
        int i8 = i6;
        if (c0004b11.f217l.f139c != null && c0004b11.f217l.f139c.f137a != this) {
            z2 = false;
        }
        if (c0004b.f215j.f139c == null || c0004b8.f217l.f139c == null) {
            c = 1;
            zArr[1] = true;
        } else {
            c = 1;
        }
        c0004b.f186V = z2;
        c0004b8.f190Z = null;
        c0004bArr[0] = c0004b;
        c0004bArr[2] = c0004b9;
        c0004bArr[c] = c0004b8;
        c0004bArr[3] = c0004b10;
        return i8;
    }

    /* JADX INFO: renamed from: a */
    private boolean m114a(C0014e c0014e) {
        int size = this.f278aj.size();
        for (int i = 0; i < size; i++) {
            C0004b c0004b = this.f278aj.get(i);
            c0004b.f191a = -1;
            c0004b.f207b = -1;
            if (c0004b.f171G == C0004b.a.MATCH_CONSTRAINT || c0004b.f172H == C0004b.a.MATCH_CONSTRAINT) {
                c0004b.f191a = 1;
                c0004b.f207b = 1;
            }
        }
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (!z) {
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                C0004b c0004b2 = this.f278aj.get(i6);
                if (c0004b2.f191a == -1) {
                    if (this.f171G == C0004b.a.WRAP_CONTENT) {
                        c0004b2.f191a = 1;
                    } else {
                        C0007e.m141b(this, c0014e, c0004b2);
                    }
                }
                if (c0004b2.f207b == -1) {
                    if (this.f172H == C0004b.a.WRAP_CONTENT) {
                        c0004b2.f207b = 1;
                    } else {
                        C0007e.m142c(this, c0014e, c0004b2);
                    }
                }
                if (c0004b2.f207b == -1) {
                    i4++;
                }
                if (c0004b2.f191a == -1) {
                    i5++;
                }
            }
            if ((i4 == 0 && i5 == 0) || (i2 == i4 && i3 == i5)) {
                z = true;
            }
            i2 = i4;
            i3 = i5;
        }
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            C0004b c0004b3 = this.f278aj.get(i9);
            if (c0004b3.f191a == 1 || c0004b3.f191a == -1) {
                i7++;
            }
            if (c0004b3.f207b == 1 || c0004b3.f207b == -1) {
                i8++;
            }
        }
        return i7 == 0 && i8 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:195:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04b6 A[SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m115b(C0014e c0014e) {
        int i;
        C0014e c0014e2;
        C0004b c0004b;
        boolean z;
        C0004b c0004b2;
        boolean z2;
        C0004b c0004b3;
        C0004b c0004b4;
        C0004b c0004b5;
        C0014e c0014e3;
        int i2;
        int iM41d;
        C0016g c0016g;
        C0016g c0016g2;
        C0016g c0016g3;
        int iM99n;
        int i3;
        int iM41d2;
        C0005c c0005c = this;
        C0014e c0014e4 = c0014e;
        int i4 = 0;
        int i5 = 0;
        while (i5 < c0005c.f248al) {
            C0004b c0004b6 = c0005c.f252ap[i5];
            int iM113a = c0005c.m113a(c0014e4, c0005c.f255as, c0005c.f252ap[i5], 0, c0005c.f254ar);
            C0004b c0004b7 = c0005c.f255as[2];
            if (c0004b7 != null) {
                if (!c0005c.f254ar[1]) {
                    boolean z3 = c0004b6.f183S == 0;
                    boolean z4 = c0004b6.f183S == 2;
                    boolean z5 = c0005c.f171G == C0004b.a.WRAP_CONTENT;
                    if ((c0005c.f253aq != 2 && c0005c.f253aq != 8) || !c0005c.f254ar[i4] || !c0004b6.f185U || z4 || z5 || c0004b6.f183S != 0) {
                        char c = 3;
                        if (iM113a != 0 && !z4) {
                            C0004b c0004b8 = null;
                            float f = 0.0f;
                            while (c0004b7 != null) {
                                if (c0004b7.f171G != C0004b.a.MATCH_CONSTRAINT) {
                                    int iM41d3 = c0004b7.f214i.m41d();
                                    if (c0004b8 != null) {
                                        iM41d3 += c0004b8.f216k.m41d();
                                    }
                                    c0014e4.m195a(c0004b7.f214i.f142f, c0004b7.f214i.f139c.f142f, iM41d3, c0004b7.f214i.f139c.f137a.f171G == C0004b.a.MATCH_CONSTRAINT ? 2 : 3);
                                    int iM41d4 = c0004b7.f216k.m41d();
                                    if (c0004b7.f216k.f139c.f137a.f214i.f139c != null && c0004b7.f216k.f139c.f137a.f214i.f139c.f137a == c0004b7) {
                                        iM41d4 += c0004b7.f216k.f139c.f137a.f214i.m41d();
                                    }
                                    c0014e4.m198b(c0004b7.f216k.f142f, c0004b7.f216k.f139c.f142f, -iM41d4, c0004b7.f216k.f139c.f137a.f171G == C0004b.a.MATCH_CONSTRAINT ? 2 : 3);
                                } else {
                                    f += c0004b7.f187W;
                                    if (c0004b7.f216k.f139c != null) {
                                        iM41d2 = c0004b7.f216k.m41d();
                                        if (c0004b7 != c0005c.f255as[3]) {
                                            iM41d2 += c0004b7.f216k.f139c.f137a.f214i.m41d();
                                        }
                                    } else {
                                        iM41d2 = 0;
                                    }
                                    c0014e4.m195a(c0004b7.f216k.f142f, c0004b7.f214i.f142f, i4, 1);
                                    c0014e4.m198b(c0004b7.f216k.f142f, c0004b7.f216k.f139c.f142f, -iM41d2, 1);
                                }
                                c0004b8 = c0004b7;
                                c0004b7 = c0004b7.f189Y;
                            }
                            if (iM113a != 1) {
                                int i6 = 0;
                                while (true) {
                                    int i7 = iM113a - 1;
                                    if (i6 >= i7) {
                                        break;
                                    }
                                    C0004b c0004b9 = c0005c.f250an[i6];
                                    i6++;
                                    C0004b c0004b10 = c0005c.f250an[i6];
                                    C0016g c0016g4 = c0004b9.f214i.f142f;
                                    C0016g c0016g5 = c0004b9.f216k.f142f;
                                    C0016g c0016g6 = c0004b10.f214i.f142f;
                                    C0016g c0016g7 = c0004b10.f216k.f142f;
                                    if (c0004b10 == c0005c.f255as[c]) {
                                        c0016g7 = c0005c.f255as[1].f216k.f142f;
                                    }
                                    int iM41d5 = c0004b9.f214i.m41d();
                                    if (c0004b9.f214i.f139c != null && c0004b9.f214i.f139c.f137a.f216k.f139c != null && c0004b9.f214i.f139c.f137a.f216k.f139c.f137a == c0004b9) {
                                        iM41d5 += c0004b9.f214i.f139c.f137a.f216k.m41d();
                                    }
                                    int i8 = iM113a;
                                    c0014e4.m195a(c0016g4, c0004b9.f214i.f139c.f142f, iM41d5, 2);
                                    int iM41d6 = c0004b9.f216k.m41d();
                                    if (c0004b9.f216k.f139c != null && c0004b9.f189Y != null) {
                                        iM41d6 += c0004b9.f189Y.f214i.f139c != null ? c0004b9.f189Y.f214i.m41d() : 0;
                                    }
                                    c0014e4.m198b(c0016g5, c0004b9.f216k.f139c.f142f, -iM41d6, 2);
                                    if (i6 == i7) {
                                        int iM41d7 = c0004b10.f214i.m41d();
                                        if (c0004b10.f214i.f139c != null && c0004b10.f214i.f139c.f137a.f216k.f139c != null && c0004b10.f214i.f139c.f137a.f216k.f139c.f137a == c0004b10) {
                                            iM41d7 += c0004b10.f214i.f139c.f137a.f216k.m41d();
                                        }
                                        c0014e4.m195a(c0016g6, c0004b10.f214i.f139c.f142f, iM41d7, 2);
                                        C0003a c0003a = c0004b10.f216k;
                                        if (c0004b10 == c0005c.f255as[3]) {
                                            c0003a = c0005c.f255as[1].f216k;
                                        }
                                        int iM41d8 = c0003a.m41d();
                                        if (c0003a.f139c != null && c0003a.f139c.f137a.f214i.f139c != null && c0003a.f139c.f137a.f214i.f139c.f137a == c0004b10) {
                                            iM41d8 += c0003a.f139c.f137a.f214i.m41d();
                                        }
                                        i3 = 2;
                                        c0014e4.m198b(c0016g7, c0003a.f139c.f142f, -iM41d8, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    if (c0004b6.f211f > 0) {
                                        c0014e4.m198b(c0016g5, c0016g4, c0004b6.f211f, i3);
                                    }
                                    C0011b c0011bM197b = c0014e.m197b();
                                    c0011bM197b.m151a(c0004b9.f187W, f, c0004b10.f187W, c0016g4, c0004b9.f214i.m41d(), c0016g5, c0004b9.f216k.m41d(), c0016g6, c0004b10.f214i.m41d(), c0016g7, c0004b10.f216k.m41d());
                                    c0014e4.m191a(c0011bM197b);
                                    iM113a = i8;
                                    c = 3;
                                }
                            } else {
                                C0004b c0004b11 = c0005c.f250an[i4];
                                int iM41d9 = c0004b11.f214i.m41d();
                                if (c0004b11.f214i.f139c != null) {
                                    iM41d9 += c0004b11.f214i.f139c.m41d();
                                }
                                int iM41d10 = c0004b11.f216k.m41d();
                                if (c0004b11.f216k.f139c != null) {
                                    iM41d10 += c0004b11.f216k.f139c.m41d();
                                }
                                C0016g c0016g8 = c0004b6.f216k.f139c.f142f;
                                if (c0004b11 == c0005c.f255as[3]) {
                                    c0016g8 = c0005c.f255as[1].f216k.f139c.f142f;
                                }
                                if (c0004b11.f208c == 1) {
                                    c0014e4.m195a(c0004b6.f214i.f142f, c0004b6.f214i.f139c.f142f, iM41d9, 1);
                                    c0014e4.m198b(c0004b6.f216k.f142f, c0016g8, -iM41d10, 1);
                                    c0014e4.m199c(c0004b6.f216k.f142f, c0004b6.f214i.f142f, c0004b6.m88h(), 2);
                                } else {
                                    c0014e4.m199c(c0004b11.f214i.f142f, c0004b11.f214i.f139c.f142f, iM41d9, 1);
                                    c0014e4.m199c(c0004b11.f216k.f142f, c0016g8, -iM41d10, 1);
                                }
                            }
                        } else {
                            C0004b c0004b12 = c0004b7;
                            C0004b c0004b13 = null;
                            C0004b c0004b14 = null;
                            boolean z6 = false;
                            while (c0004b12 != null) {
                                C0004b c0004b15 = c0004b12.f189Y;
                                if (c0004b15 == null) {
                                    c0004b = c0005c.f255as[1];
                                    z = true;
                                } else {
                                    c0004b = c0004b13;
                                    z = z6;
                                }
                                if (z4) {
                                    C0003a c0003a2 = c0004b12.f214i;
                                    int iM41d11 = c0003a2.m41d();
                                    if (c0004b14 != null) {
                                        iM41d11 += c0004b14.f216k.m41d();
                                    }
                                    c0014e4.m195a(c0003a2.f142f, c0003a2.f139c.f142f, iM41d11, c0004b7 != c0004b12 ? 3 : 1);
                                    if (c0004b12.f171G == C0004b.a.MATCH_CONSTRAINT) {
                                        C0003a c0003a3 = c0004b12.f216k;
                                        if (c0004b12.f208c == 1) {
                                            c0014e4.m199c(c0003a3.f142f, c0003a2.f142f, Math.max(c0004b12.f210e, c0004b12.m88h()), 3);
                                        } else {
                                            c0014e4.m195a(c0003a2.f142f, c0003a2.f139c.f142f, c0003a2.f140d, 3);
                                            c0014e4.m198b(c0003a3.f142f, c0003a2.f142f, c0004b12.f210e, 3);
                                        }
                                    }
                                } else if (z3 || !z || c0004b14 == null) {
                                    if (z3 || z || c0004b14 != null) {
                                        C0003a c0003a4 = c0004b12.f214i;
                                        C0003a c0003a5 = c0004b12.f216k;
                                        int iM41d12 = c0003a4.m41d();
                                        int iM41d13 = c0003a5.m41d();
                                        c0004b2 = c0004b12;
                                        z2 = z3;
                                        c0014e4.m195a(c0003a4.f142f, c0003a4.f139c.f142f, iM41d12, 1);
                                        int i9 = i5;
                                        c0014e4.m198b(c0003a5.f142f, c0003a5.f139c.f142f, -iM41d13, 1);
                                        C0016g c0016g9 = c0003a4.f139c != null ? c0003a4.f139c.f142f : null;
                                        if (c0004b14 == null) {
                                            c0016g9 = c0004b6.f214i.f139c != null ? c0004b6.f214i.f139c.f142f : null;
                                        }
                                        if (c0004b15 == null) {
                                            c0004b15 = c0004b.f216k.f139c != null ? c0004b.f216k.f139c.f137a : null;
                                        }
                                        C0004b c0004b16 = c0004b15;
                                        if (c0004b16 != null) {
                                            C0016g c0016g10 = c0004b16.f214i.f142f;
                                            if (z) {
                                                c0016g10 = c0004b.f216k.f139c != null ? c0004b.f216k.f139c.f142f : null;
                                            }
                                            if (c0016g9 == null || c0016g10 == null) {
                                                c0004b3 = c0004b16;
                                                c0004b4 = c0004b6;
                                                c0004b5 = c0004b;
                                                c0014e3 = c0014e4;
                                                i2 = i9;
                                            } else {
                                                C0016g c0016g11 = c0016g9;
                                                c0004b4 = c0004b6;
                                                C0016g c0016g12 = c0016g10;
                                                i2 = i9;
                                                c0004b5 = c0004b;
                                                c0004b3 = c0004b16;
                                                c0014e3 = c0014e4;
                                                c0014e4.m194a(c0003a4.f142f, c0016g11, iM41d12, 0.5f, c0016g12, c0003a5.f142f, iM41d13, 4);
                                            }
                                            c0004b15 = c0004b3;
                                        }
                                        if (!z) {
                                            c0004b15 = null;
                                        }
                                        c0004b6 = c0004b4;
                                        z6 = z;
                                        c0014e4 = c0014e3;
                                        i5 = i2;
                                        c0004b12 = c0004b15;
                                        c0004b13 = c0004b5;
                                        c0004b14 = c0004b2;
                                        z3 = z2;
                                        c0005c = this;
                                    } else if (c0004b12.f214i.f139c == null) {
                                        c0016g3 = c0004b12.f214i.f142f;
                                        iM99n = c0004b12.m99n();
                                        c0014e4.m193a(c0016g3, iM99n);
                                    } else {
                                        iM41d = c0004b12.f214i.m41d();
                                        c0016g = c0004b12.f214i.f142f;
                                        c0016g2 = c0004b6.f214i.f139c.f142f;
                                        c0014e4.m199c(c0016g, c0016g2, iM41d, 5);
                                    }
                                } else if (c0004b12.f216k.f139c == null) {
                                    c0016g3 = c0004b12.f216k.f142f;
                                    iM99n = c0004b12.m102q();
                                    c0014e4.m193a(c0016g3, iM99n);
                                } else {
                                    int iM41d14 = c0004b12.f216k.m41d();
                                    c0016g = c0004b12.f216k.f142f;
                                    c0016g2 = c0004b.f216k.f139c.f142f;
                                    iM41d = -iM41d14;
                                    c0014e4.m199c(c0016g, c0016g2, iM41d, 5);
                                }
                                c0004b2 = c0004b12;
                                z2 = z3;
                                c0004b4 = c0004b6;
                                i2 = i5;
                                c0004b5 = c0004b;
                                c0014e3 = c0014e4;
                                if (!z) {
                                }
                                c0004b6 = c0004b4;
                                z6 = z;
                                c0014e4 = c0014e3;
                                i5 = i2;
                                c0004b12 = c0004b15;
                                c0004b13 = c0004b5;
                                c0004b14 = c0004b2;
                                z3 = z2;
                                c0005c = this;
                            }
                            C0004b c0004b17 = c0004b6;
                            i = i5;
                            c0014e2 = c0014e4;
                            if (z4) {
                                C0003a c0003a6 = c0004b7.f214i;
                                C0003a c0003a7 = c0004b13.f216k;
                                int iM41d15 = c0003a6.m41d();
                                int iM41d16 = c0003a7.m41d();
                                C0016g c0016g13 = c0004b17.f214i.f139c != null ? c0004b17.f214i.f139c.f142f : null;
                                C0016g c0016g14 = c0004b13.f216k.f139c != null ? c0004b13.f216k.f139c.f142f : null;
                                if (c0016g13 != null && c0016g14 != null) {
                                    c0014e2.m198b(c0003a7.f142f, c0016g14, -iM41d16, 1);
                                    c0014e2.m194a(c0003a6.f142f, c0016g13, iM41d15, c0004b17.f169E, c0016g14, c0003a7.f142f, iM41d16, 4);
                                }
                            }
                        }
                    } else {
                        C0007e.m138a(c0005c, c0014e4, iM113a, c0004b6);
                    }
                } else {
                    int iM99n2 = c0004b6.m99n();
                    while (c0004b7 != null) {
                        c0014e4.m193a(c0004b7.f214i.f142f, iM99n2);
                        C0004b c0004b18 = c0004b7.f189Y;
                        iM99n2 += c0004b7.f214i.m41d() + c0004b7.m88h() + c0004b7.f216k.m41d();
                        c0004b7 = c0004b18;
                    }
                }
                i = i5;
                c0014e2 = c0014e4;
            } else {
                i = i5;
                c0014e2 = c0014e4;
            }
            i5 = i + 1;
            c0014e4 = c0014e2;
            c0005c = this;
            i4 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04d9 A[SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m116c(C0014e c0014e) {
        int i;
        C0014e c0014e2;
        C0004b c0004b;
        boolean z;
        C0004b c0004b2;
        boolean z2;
        C0004b c0004b3;
        C0004b c0004b4;
        C0004b c0004b5;
        C0014e c0014e3;
        int i2;
        int iM41d;
        C0016g c0016g;
        C0016g c0016g2;
        C0016g c0016g3;
        int iM100o;
        C0016g c0016g4;
        C0016g c0016g5;
        int i3;
        int iM41d2;
        C0005c c0005c = this;
        C0014e c0014e4 = c0014e;
        int i4 = 0;
        int i5 = 0;
        while (i5 < c0005c.f249am) {
            C0004b c0004b6 = c0005c.f251ao[i5];
            int iM113a = c0005c.m113a(c0014e4, c0005c.f255as, c0005c.f251ao[i5], 1, c0005c.f254ar);
            C0004b c0004b7 = c0005c.f255as[2];
            if (c0004b7 != null) {
                if (!c0005c.f254ar[1]) {
                    boolean z3 = c0004b6.f184T == 0;
                    boolean z4 = c0004b6.f184T == 2;
                    boolean z5 = c0005c.f172H == C0004b.a.WRAP_CONTENT;
                    if ((c0005c.f253aq != 2 && c0005c.f253aq != 8) || !c0005c.f254ar[i4] || !c0004b6.f186V || z4 || z5 || c0004b6.f184T != 0) {
                        char c = 3;
                        if (iM113a != 0 && !z4) {
                            C0004b c0004b8 = null;
                            float f = 0.0f;
                            while (c0004b7 != null) {
                                if (c0004b7.f172H != C0004b.a.MATCH_CONSTRAINT) {
                                    int iM41d3 = c0004b7.f215j.m41d();
                                    if (c0004b8 != null) {
                                        iM41d3 += c0004b8.f217l.m41d();
                                    }
                                    c0014e4.m195a(c0004b7.f215j.f142f, c0004b7.f215j.f139c.f142f, iM41d3, c0004b7.f215j.f139c.f137a.f172H == C0004b.a.MATCH_CONSTRAINT ? 2 : 3);
                                    int iM41d4 = c0004b7.f217l.m41d();
                                    if (c0004b7.f217l.f139c.f137a.f215j.f139c != null && c0004b7.f217l.f139c.f137a.f215j.f139c.f137a == c0004b7) {
                                        iM41d4 += c0004b7.f217l.f139c.f137a.f215j.m41d();
                                    }
                                    c0014e4.m198b(c0004b7.f217l.f142f, c0004b7.f217l.f139c.f142f, -iM41d4, c0004b7.f217l.f139c.f137a.f172H == C0004b.a.MATCH_CONSTRAINT ? 2 : 3);
                                } else {
                                    f += c0004b7.f188X;
                                    if (c0004b7.f217l.f139c != null) {
                                        iM41d2 = c0004b7.f217l.m41d();
                                        if (c0004b7 != c0005c.f255as[3]) {
                                            iM41d2 += c0004b7.f217l.f139c.f137a.f215j.m41d();
                                        }
                                    } else {
                                        iM41d2 = 0;
                                    }
                                    c0014e4.m195a(c0004b7.f217l.f142f, c0004b7.f215j.f142f, i4, 1);
                                    c0014e4.m198b(c0004b7.f217l.f142f, c0004b7.f217l.f139c.f142f, -iM41d2, 1);
                                }
                                c0004b8 = c0004b7;
                                c0004b7 = c0004b7.f190Z;
                            }
                            if (iM113a != 1) {
                                int i6 = 0;
                                while (true) {
                                    int i7 = iM113a - 1;
                                    if (i6 >= i7) {
                                        break;
                                    }
                                    C0004b c0004b9 = c0005c.f250an[i6];
                                    i6++;
                                    C0004b c0004b10 = c0005c.f250an[i6];
                                    C0016g c0016g6 = c0004b9.f215j.f142f;
                                    C0016g c0016g7 = c0004b9.f217l.f142f;
                                    C0016g c0016g8 = c0004b10.f215j.f142f;
                                    C0016g c0016g9 = c0004b10.f217l.f142f;
                                    if (c0004b10 == c0005c.f255as[c]) {
                                        c0016g9 = c0005c.f255as[1].f217l.f142f;
                                    }
                                    int iM41d5 = c0004b9.f215j.m41d();
                                    if (c0004b9.f215j.f139c != null && c0004b9.f215j.f139c.f137a.f217l.f139c != null && c0004b9.f215j.f139c.f137a.f217l.f139c.f137a == c0004b9) {
                                        iM41d5 += c0004b9.f215j.f139c.f137a.f217l.m41d();
                                    }
                                    int i8 = iM113a;
                                    c0014e4.m195a(c0016g6, c0004b9.f215j.f139c.f142f, iM41d5, 2);
                                    int iM41d6 = c0004b9.f217l.m41d();
                                    if (c0004b9.f217l.f139c != null && c0004b9.f190Z != null) {
                                        iM41d6 += c0004b9.f190Z.f215j.f139c != null ? c0004b9.f190Z.f215j.m41d() : 0;
                                    }
                                    c0014e4.m198b(c0016g7, c0004b9.f217l.f139c.f142f, -iM41d6, 2);
                                    if (i6 == i7) {
                                        int iM41d7 = c0004b10.f215j.m41d();
                                        if (c0004b10.f215j.f139c != null && c0004b10.f215j.f139c.f137a.f217l.f139c != null && c0004b10.f215j.f139c.f137a.f217l.f139c.f137a == c0004b10) {
                                            iM41d7 += c0004b10.f215j.f139c.f137a.f217l.m41d();
                                        }
                                        c0014e4.m195a(c0016g8, c0004b10.f215j.f139c.f142f, iM41d7, 2);
                                        C0003a c0003a = c0004b10.f217l;
                                        if (c0004b10 == c0005c.f255as[3]) {
                                            c0003a = c0005c.f255as[1].f217l;
                                        }
                                        int iM41d8 = c0003a.m41d();
                                        if (c0003a.f139c != null && c0003a.f139c.f137a.f215j.f139c != null && c0003a.f139c.f137a.f215j.f139c.f137a == c0004b10) {
                                            iM41d8 += c0003a.f139c.f137a.f215j.m41d();
                                        }
                                        i3 = 2;
                                        c0014e4.m198b(c0016g9, c0003a.f139c.f142f, -iM41d8, 2);
                                    } else {
                                        i3 = 2;
                                    }
                                    if (c0004b6.f213h > 0) {
                                        c0014e4.m198b(c0016g7, c0016g6, c0004b6.f213h, i3);
                                    }
                                    C0011b c0011bM197b = c0014e.m197b();
                                    c0011bM197b.m151a(c0004b9.f188X, f, c0004b10.f188X, c0016g6, c0004b9.f215j.m41d(), c0016g7, c0004b9.f217l.m41d(), c0016g8, c0004b10.f215j.m41d(), c0016g9, c0004b10.f217l.m41d());
                                    c0014e4.m191a(c0011bM197b);
                                    iM113a = i8;
                                    c = 3;
                                }
                            } else {
                                C0004b c0004b11 = c0005c.f250an[i4];
                                int iM41d9 = c0004b11.f215j.m41d();
                                if (c0004b11.f215j.f139c != null) {
                                    iM41d9 += c0004b11.f215j.f139c.m41d();
                                }
                                int iM41d10 = c0004b11.f217l.m41d();
                                if (c0004b11.f217l.f139c != null) {
                                    iM41d10 += c0004b11.f217l.f139c.m41d();
                                }
                                C0016g c0016g10 = c0004b6.f217l.f139c.f142f;
                                if (c0004b11 == c0005c.f255as[3]) {
                                    c0016g10 = c0005c.f255as[1].f217l.f139c.f142f;
                                }
                                if (c0004b11.f209d == 1) {
                                    c0014e4.m195a(c0004b6.f215j.f142f, c0004b6.f215j.f139c.f142f, iM41d9, 1);
                                    c0014e4.m198b(c0004b6.f217l.f142f, c0016g10, -iM41d10, 1);
                                    c0014e4.m199c(c0004b6.f217l.f142f, c0004b6.f215j.f142f, c0004b6.m96l(), 2);
                                } else {
                                    c0014e4.m199c(c0004b11.f215j.f142f, c0004b11.f215j.f139c.f142f, iM41d9, 1);
                                    c0014e4.m199c(c0004b11.f217l.f142f, c0016g10, -iM41d10, 1);
                                }
                            }
                        } else {
                            C0004b c0004b12 = c0004b7;
                            C0004b c0004b13 = null;
                            C0004b c0004b14 = null;
                            boolean z6 = false;
                            while (c0004b12 != null) {
                                C0004b c0004b15 = c0004b12.f190Z;
                                if (c0004b15 == null) {
                                    c0004b = c0005c.f255as[1];
                                    z = true;
                                } else {
                                    c0004b = c0004b13;
                                    z = z6;
                                }
                                if (z4) {
                                    C0003a c0003a2 = c0004b12.f215j;
                                    int iM41d11 = c0003a2.m41d();
                                    if (c0004b14 != null) {
                                        iM41d11 += c0004b14.f217l.m41d();
                                    }
                                    int i9 = c0004b7 != c0004b12 ? 3 : 1;
                                    if (c0003a2.f139c != null) {
                                        c0016g4 = c0003a2.f142f;
                                        c0016g5 = c0003a2.f139c.f142f;
                                    } else if (c0004b12.f218m.f139c != null) {
                                        c0016g4 = c0004b12.f218m.f142f;
                                        c0016g5 = c0004b12.f218m.f139c.f142f;
                                        iM41d11 -= c0003a2.m41d();
                                    } else {
                                        c0016g4 = null;
                                        c0016g5 = null;
                                    }
                                    if (c0016g4 != null && c0016g5 != null) {
                                        c0014e4.m195a(c0016g4, c0016g5, iM41d11, i9);
                                    }
                                    if (c0004b12.f172H == C0004b.a.MATCH_CONSTRAINT) {
                                        C0003a c0003a3 = c0004b12.f217l;
                                        if (c0004b12.f209d == 1) {
                                            c0014e4.m199c(c0003a3.f142f, c0003a2.f142f, Math.max(c0004b12.f212g, c0004b12.m96l()), 3);
                                        } else {
                                            c0014e4.m195a(c0003a2.f142f, c0003a2.f139c.f142f, c0003a2.f140d, 3);
                                            c0014e4.m198b(c0003a3.f142f, c0003a2.f142f, c0004b12.f212g, 3);
                                        }
                                    }
                                } else if (z3 || !z || c0004b14 == null) {
                                    if (z3 || z || c0004b14 != null) {
                                        C0003a c0003a4 = c0004b12.f215j;
                                        C0003a c0003a5 = c0004b12.f217l;
                                        int iM41d12 = c0003a4.m41d();
                                        int iM41d13 = c0003a5.m41d();
                                        c0004b2 = c0004b12;
                                        z2 = z3;
                                        c0014e4.m195a(c0003a4.f142f, c0003a4.f139c.f142f, iM41d12, 1);
                                        int i10 = i5;
                                        c0014e4.m198b(c0003a5.f142f, c0003a5.f139c.f142f, -iM41d13, 1);
                                        C0016g c0016g11 = c0003a4.f139c != null ? c0003a4.f139c.f142f : null;
                                        if (c0004b14 == null) {
                                            c0016g11 = c0004b6.f215j.f139c != null ? c0004b6.f215j.f139c.f142f : null;
                                        }
                                        if (c0004b15 == null) {
                                            c0004b15 = c0004b.f217l.f139c != null ? c0004b.f217l.f139c.f137a : null;
                                        }
                                        C0004b c0004b16 = c0004b15;
                                        if (c0004b16 != null) {
                                            C0016g c0016g12 = c0004b16.f215j.f142f;
                                            if (z) {
                                                c0016g12 = c0004b.f217l.f139c != null ? c0004b.f217l.f139c.f142f : null;
                                            }
                                            if (c0016g11 == null || c0016g12 == null) {
                                                c0004b3 = c0004b16;
                                                c0004b4 = c0004b6;
                                                c0004b5 = c0004b;
                                                c0014e3 = c0014e4;
                                                i2 = i10;
                                            } else {
                                                C0016g c0016g13 = c0016g11;
                                                c0004b4 = c0004b6;
                                                C0016g c0016g14 = c0016g12;
                                                i2 = i10;
                                                c0004b5 = c0004b;
                                                c0004b3 = c0004b16;
                                                c0014e3 = c0014e4;
                                                c0014e4.m194a(c0003a4.f142f, c0016g13, iM41d12, 0.5f, c0016g14, c0003a5.f142f, iM41d13, 4);
                                            }
                                            c0004b15 = c0004b3;
                                        }
                                        if (!z) {
                                            c0004b15 = null;
                                        }
                                        c0004b6 = c0004b4;
                                        z6 = z;
                                        c0014e4 = c0014e3;
                                        i5 = i2;
                                        c0004b12 = c0004b15;
                                        c0004b13 = c0004b5;
                                        c0004b14 = c0004b2;
                                        z3 = z2;
                                        c0005c = this;
                                    } else if (c0004b12.f215j.f139c == null) {
                                        c0016g3 = c0004b12.f215j.f142f;
                                        iM100o = c0004b12.m100o();
                                        c0014e4.m193a(c0016g3, iM100o);
                                    } else {
                                        iM41d = c0004b12.f215j.m41d();
                                        c0016g = c0004b12.f215j.f142f;
                                        c0016g2 = c0004b6.f215j.f139c.f142f;
                                        c0014e4.m199c(c0016g, c0016g2, iM41d, 5);
                                    }
                                } else if (c0004b12.f217l.f139c == null) {
                                    c0016g3 = c0004b12.f217l.f142f;
                                    iM100o = c0004b12.m101p();
                                    c0014e4.m193a(c0016g3, iM100o);
                                } else {
                                    int iM41d14 = c0004b12.f217l.m41d();
                                    c0016g = c0004b12.f217l.f142f;
                                    c0016g2 = c0004b.f217l.f139c.f142f;
                                    iM41d = -iM41d14;
                                    c0014e4.m199c(c0016g, c0016g2, iM41d, 5);
                                }
                                c0004b2 = c0004b12;
                                z2 = z3;
                                c0004b4 = c0004b6;
                                i2 = i5;
                                c0004b5 = c0004b;
                                c0014e3 = c0014e4;
                                if (!z) {
                                }
                                c0004b6 = c0004b4;
                                z6 = z;
                                c0014e4 = c0014e3;
                                i5 = i2;
                                c0004b12 = c0004b15;
                                c0004b13 = c0004b5;
                                c0004b14 = c0004b2;
                                z3 = z2;
                                c0005c = this;
                            }
                            C0004b c0004b17 = c0004b6;
                            i = i5;
                            c0014e2 = c0014e4;
                            if (z4) {
                                C0003a c0003a6 = c0004b7.f215j;
                                C0003a c0003a7 = c0004b13.f217l;
                                int iM41d15 = c0003a6.m41d();
                                int iM41d16 = c0003a7.m41d();
                                C0016g c0016g15 = c0004b17.f215j.f139c != null ? c0004b17.f215j.f139c.f142f : null;
                                C0016g c0016g16 = c0004b13.f217l.f139c != null ? c0004b13.f217l.f139c.f142f : null;
                                if (c0016g15 != null && c0016g16 != null) {
                                    c0014e2.m198b(c0003a7.f142f, c0016g16, -iM41d16, 1);
                                    c0014e2.m194a(c0003a6.f142f, c0016g15, iM41d15, c0004b17.f170F, c0016g16, c0003a7.f142f, iM41d16, 4);
                                }
                            }
                        }
                    } else {
                        C0007e.m140b(c0005c, c0014e4, iM113a, c0004b6);
                    }
                } else {
                    int iM100o2 = c0004b6.m100o();
                    while (c0004b7 != null) {
                        c0014e4.m193a(c0004b7.f215j.f142f, iM100o2);
                        C0004b c0004b18 = c0004b7.f190Z;
                        iM100o2 += c0004b7.f215j.m41d() + c0004b7.m96l() + c0004b7.f217l.m41d();
                        c0004b7 = c0004b18;
                    }
                }
                i = i5;
                c0014e2 = c0014e4;
            } else {
                i = i5;
                c0014e2 = c0014e4;
            }
            i5 = i + 1;
            c0014e4 = c0014e2;
            c0005c = this;
            i4 = 0;
        }
    }

    /* JADX INFO: renamed from: d */
    private void m117d(C0004b c0004b) {
        for (int i = 0; i < this.f248al; i++) {
            if (this.f252ap[i] == c0004b) {
                return;
            }
        }
        if (this.f248al + 1 >= this.f252ap.length) {
            this.f252ap = (C0004b[]) Arrays.copyOf(this.f252ap, this.f252ap.length * 2);
        }
        this.f252ap[this.f248al] = c0004b;
        this.f248al++;
    }

    /* JADX INFO: renamed from: e */
    private void m118e(C0004b c0004b) {
        for (int i = 0; i < this.f249am; i++) {
            if (this.f251ao[i] == c0004b) {
                return;
            }
        }
        if (this.f249am + 1 >= this.f251ao.length) {
            this.f251ao = (C0004b[]) Arrays.copyOf(this.f251ao, this.f251ao.length * 2);
        }
        this.f251ao[this.f249am] = c0004b;
        this.f249am++;
    }

    /* JADX INFO: renamed from: D */
    public boolean m119D() {
        return this.f256at;
    }

    /* JADX INFO: renamed from: E */
    public boolean m120E() {
        return this.f257au;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0224 A[PHI: r5 r11
  0x0224: PHI (r5v15 boolean) = (r5v14 boolean), (r5v18 boolean), (r5v18 boolean), (r5v18 boolean) binds: [B:99:0x01ed, B:107:0x020d, B:108:0x020f, B:110:0x0215] A[DONT_GENERATE, DONT_INLINE]
  0x0224: PHI (r11v6 boolean) = (r11v5 boolean), (r11v8 boolean), (r11v8 boolean), (r11v8 boolean) binds: [B:99:0x01ed, B:107:0x020d, B:108:0x020f, B:110:0x0215] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.support.constraint.p000a.p001a.C0010h
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo121F() {
        boolean z;
        boolean zM128c;
        char c;
        boolean z2;
        boolean z3;
        int i = this.f228w;
        int i2 = this.f229x;
        int iMax = Math.max(0, m88h());
        int iMax2 = Math.max(0, m96l());
        this.f256at = false;
        this.f257au = false;
        if (this.f223r != null) {
            if (this.f247ak == null) {
                this.f247ak = new C0009g(this);
            }
            this.f247ak.m143a(this);
            m68b(this.f243af);
            m76c(this.f244ag);
            m50A();
            mo63a(this.f239aa.m203f());
        } else {
            this.f228w = 0;
            this.f229x = 0;
        }
        C0004b.a aVar = this.f172H;
        C0004b.a aVar2 = this.f171G;
        boolean z4 = true;
        if (this.f253aq == 2 && (this.f172H == C0004b.a.WRAP_CONTENT || this.f171G == C0004b.a.WRAP_CONTENT)) {
            m126a(this.f278aj, this.f254ar);
            z = this.f254ar[0];
            if (iMax > 0 && iMax2 > 0 && (this.f241ad > iMax || this.f242ae > iMax2)) {
                z = false;
            }
            if (z) {
                if (this.f171G == C0004b.a.WRAP_CONTENT) {
                    this.f171G = C0004b.a.FIXED;
                    if (iMax <= 0 || iMax >= this.f241ad) {
                        m80d(Math.max(this.f167B, this.f241ad));
                    } else {
                        this.f256at = true;
                        m80d(iMax);
                    }
                }
                if (this.f172H == C0004b.a.WRAP_CONTENT) {
                    this.f172H = C0004b.a.FIXED;
                    if (iMax2 <= 0 || iMax2 >= this.f242ae) {
                        m83e(Math.max(this.f168C, this.f242ae));
                    } else {
                        this.f257au = true;
                        m83e(iMax2);
                    }
                }
            }
        } else {
            z = false;
        }
        m112J();
        int size = this.f278aj.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0004b c0004b = this.f278aj.get(i3);
            if (c0004b instanceof C0010h) {
                ((C0010h) c0004b).mo121F();
            }
        }
        boolean z5 = z;
        boolean z6 = true;
        int i4 = 0;
        while (z6) {
            i4 += z4 ? 1 : 0;
            try {
                this.f239aa.m190a();
                zM128c = m128c(this.f239aa, Integer.MAX_VALUE);
                if (zM128c) {
                    try {
                        this.f239aa.m202e();
                    } catch (Exception e) {
                        e = e;
                        z6 = zM128c;
                        e.printStackTrace();
                        zM128c = z6;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
            if (!zM128c) {
                mo72b(this.f239aa, Integer.MAX_VALUE);
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    C0004b c0004b2 = this.f278aj.get(i5);
                    if (c0004b2.f171G == C0004b.a.MATCH_CONSTRAINT && c0004b2.m88h() < c0004b2.m94k()) {
                        this.f254ar[2] = z4;
                        break;
                    } else {
                        if (c0004b2.f172H == C0004b.a.MATCH_CONSTRAINT && c0004b2.m96l() < c0004b2.m98m()) {
                            c = 2;
                            this.f254ar[2] = z4;
                            break;
                        }
                        i5++;
                    }
                }
            } else {
                m125a(this.f239aa, Integer.MAX_VALUE, this.f254ar);
            }
            c = 2;
            if (i4 >= 8 || !this.f254ar[c]) {
                z2 = z5;
                z3 = false;
            } else {
                int iMax3 = 0;
                int iMax4 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    C0004b c0004b3 = this.f278aj.get(i6);
                    iMax3 = Math.max(iMax3, c0004b3.f228w + c0004b3.m88h());
                    iMax4 = Math.max(iMax4, c0004b3.f229x + c0004b3.m96l());
                }
                int iMax5 = Math.max(this.f167B, iMax3);
                int iMax6 = Math.max(this.f168C, iMax4);
                if (aVar2 != C0004b.a.WRAP_CONTENT || m88h() >= iMax5) {
                    z2 = z5;
                    z3 = false;
                } else {
                    m80d(iMax5);
                    this.f171G = C0004b.a.WRAP_CONTENT;
                    z3 = true;
                    z2 = true;
                }
                if (aVar == C0004b.a.WRAP_CONTENT && m96l() < iMax6) {
                    m83e(iMax6);
                    this.f172H = C0004b.a.WRAP_CONTENT;
                    z3 = true;
                    z2 = true;
                }
            }
            int iMax7 = Math.max(this.f167B, m88h());
            if (iMax7 > m88h()) {
                m80d(iMax7);
                this.f171G = C0004b.a.FIXED;
                z3 = true;
                z2 = true;
            }
            int iMax8 = Math.max(this.f168C, m96l());
            if (iMax8 > m96l()) {
                m83e(iMax8);
                this.f172H = C0004b.a.FIXED;
                z3 = true;
                z2 = true;
            }
            if (z2) {
                z5 = z2;
            } else {
                if (this.f171G == C0004b.a.WRAP_CONTENT && iMax > 0 && m88h() > iMax) {
                    this.f256at = true;
                    this.f171G = C0004b.a.FIXED;
                    m80d(iMax);
                    z3 = true;
                    z2 = true;
                }
                if (this.f172H == C0004b.a.WRAP_CONTENT && iMax2 > 0 && m96l() > iMax2) {
                    this.f257au = true;
                    this.f172H = C0004b.a.FIXED;
                    m83e(iMax2);
                    z3 = true;
                    z5 = true;
                }
            }
            z6 = z3;
            z4 = true;
        }
        if (this.f223r != null) {
            int iMax9 = Math.max(this.f167B, m88h());
            int iMax10 = Math.max(this.f168C, m96l());
            this.f247ak.m144b(this);
            m80d(iMax9 + this.f243af + this.f245ah);
            m83e(iMax10 + this.f244ag + this.f246ai);
        } else {
            this.f228w = i;
            this.f229x = i2;
        }
        if (z5) {
            this.f171G = aVar2;
            this.f172H = aVar;
        }
        mo63a(this.f239aa.m203f());
        if (this == m147H()) {
            mo111z();
        }
    }

    /* JADX INFO: renamed from: G */
    public boolean m122G() {
        return false;
    }

    @Override // android.support.constraint.p000a.p001a.C0010h, android.support.constraint.p000a.p001a.C0004b
    /* JADX INFO: renamed from: a */
    public void mo54a() {
        this.f239aa.m190a();
        this.f243af = 0;
        this.f245ah = 0;
        this.f244ag = 0;
        this.f246ai = 0;
        super.mo54a();
    }

    /* JADX INFO: renamed from: a */
    void m123a(C0004b c0004b, int i) {
        if (i == 0) {
            while (c0004b.f214i.f139c != null && c0004b.f214i.f139c.f137a.f216k.f139c != null && c0004b.f214i.f139c.f137a.f216k.f139c == c0004b.f214i && c0004b.f214i.f139c.f137a != c0004b) {
                c0004b = c0004b.f214i.f139c.f137a;
            }
            m117d(c0004b);
            return;
        }
        if (i == 1) {
            while (c0004b.f215j.f139c != null && c0004b.f215j.f139c.f137a.f217l.f139c != null && c0004b.f215j.f139c.f137a.f217l.f139c == c0004b.f215j && c0004b.f215j.f139c.f137a != c0004b) {
                c0004b = c0004b.f215j.f139c.f137a;
            }
            m118e(c0004b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x01b0 A[PHI: r0
  0x01b0: PHI (r0v3 int) = (r0v2 int), (r0v2 int), (r0v4 int), (r0v4 int) binds: [B:94:0x0150, B:96:0x0156, B:115:0x0198, B:120:0x01a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0131  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m124a(C0004b c0004b, boolean[] zArr) {
        int iM41d;
        C0004b c0004b2;
        int iM90i;
        int iM90i2;
        int iM84f = 0;
        if (c0004b.f171G == C0004b.a.MATCH_CONSTRAINT && c0004b.f172H == C0004b.a.MATCH_CONSTRAINT && c0004b.f226u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iM90i3 = c0004b.m90i();
        if (c0004b.f171G == C0004b.a.MATCH_CONSTRAINT && c0004b.f172H != C0004b.a.MATCH_CONSTRAINT && c0004b.f226u > 0.0f) {
            zArr[0] = false;
            return;
        }
        boolean z = true;
        c0004b.f181Q = true;
        if (c0004b instanceof C0006d) {
            C0006d c0006d = (C0006d) c0004b;
            if (c0006d.m130D() == 1) {
                if (c0006d.m132F() != -1) {
                    iM84f = c0006d.m132F();
                } else if (c0006d.m133G() != -1) {
                    iM90i3 = c0006d.m133G();
                }
                iM90i3 = 0;
            } else {
                iM84f = iM90i3;
            }
        } else {
            if (c0004b.f216k.m47j() || c0004b.f214i.m47j()) {
                if (c0004b.f216k.f139c != null && c0004b.f214i.f139c != null && (c0004b.f216k.f139c == c0004b.f214i.f139c || (c0004b.f216k.f139c.f137a == c0004b.f214i.f139c.f137a && c0004b.f216k.f139c.f137a != c0004b.f223r))) {
                    zArr[0] = false;
                    return;
                }
                C0004b c0004b3 = null;
                if (c0004b.f216k.f139c != null) {
                    c0004b2 = c0004b.f216k.f139c.f137a;
                    iM41d = c0004b.f216k.m41d() + iM90i3;
                    if (!c0004b2.m73b() && !c0004b2.f181Q) {
                        m124a(c0004b2, zArr);
                    }
                } else {
                    iM41d = iM90i3;
                    c0004b2 = null;
                }
                if (c0004b.f214i.f139c != null) {
                    c0004b3 = c0004b.f214i.f139c.f137a;
                    iM90i3 += c0004b.f214i.m41d();
                    if (!c0004b3.m73b() && !c0004b3.f181Q) {
                        m124a(c0004b3, zArr);
                    }
                }
                if (c0004b.f216k.f139c != null && !c0004b2.m73b()) {
                    if (c0004b.f216k.f139c.f138b == C0003a.c.RIGHT) {
                        iM90i2 = c0004b2.f175K - c0004b2.m90i();
                    } else {
                        if (c0004b.f216k.f139c.m40c() == C0003a.c.LEFT) {
                            iM90i2 = c0004b2.f175K;
                        }
                        c0004b.f178N = (c0004b2.f178N && (c0004b2.f214i.f139c == null || c0004b2.f216k.f139c == null || c0004b2.f171G == C0004b.a.MATCH_CONSTRAINT)) ? false : true;
                        if (c0004b.f178N && (c0004b2.f214i.f139c == null || c0004b2.f214i.f139c.f137a != c0004b)) {
                            iM41d += iM41d - c0004b2.f175K;
                        }
                    }
                    iM41d += iM90i2;
                    if (c0004b2.f178N) {
                        c0004b.f178N = (c0004b2.f178N && (c0004b2.f214i.f139c == null || c0004b2.f216k.f139c == null || c0004b2.f171G == C0004b.a.MATCH_CONSTRAINT)) ? false : true;
                        if (c0004b.f178N) {
                            iM41d += iM41d - c0004b2.f175K;
                        }
                    }
                    if (c0004b.m78d() == 8) {
                        iM84f -= c0004b.f224s;
                        iM41d -= c0004b.f224s;
                    }
                    c0004b.f174J = iM84f;
                    c0004b.f175K = iM41d;
                }
                if (c0004b.f214i.f139c == null || c0004b3.m73b()) {
                    iM84f = iM90i3;
                } else {
                    if (c0004b.f214i.f139c.m40c() == C0003a.c.LEFT) {
                        iM90i = c0004b3.f174J - c0004b3.m90i();
                    } else {
                        if (c0004b.f214i.f139c.m40c() == C0003a.c.RIGHT) {
                            iM90i = c0004b3.f174J;
                        }
                        if (!c0004b3.f177M && (c0004b3.f214i.f139c == null || c0004b3.f216k.f139c == null || c0004b3.f171G == C0004b.a.MATCH_CONSTRAINT)) {
                            z = false;
                        }
                        c0004b.f177M = z;
                        if (!c0004b.f177M && (c0004b3.f216k.f139c == null || c0004b3.f216k.f139c.f137a != c0004b)) {
                            iM84f = iM90i3 + (iM90i3 - c0004b3.f174J);
                        }
                    }
                    iM90i3 += iM90i;
                    if (!c0004b3.f177M) {
                        z = false;
                    }
                    c0004b.f177M = z;
                    if (!c0004b.f177M) {
                        iM84f = iM90i3;
                    }
                }
                if (c0004b.m78d() == 8) {
                }
                c0004b.f174J = iM84f;
                c0004b.f175K = iM41d;
            }
            iM84f = iM90i3 + c0004b.m84f();
        }
        iM41d = iM90i3;
        if (c0004b.m78d() == 8) {
        }
        c0004b.f174J = iM84f;
        c0004b.f175K = iM41d;
    }

    /* JADX INFO: renamed from: a */
    public void m125a(C0014e c0014e, int i, boolean[] zArr) {
        zArr[2] = false;
        mo72b(c0014e, i);
        int size = this.f278aj.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0004b c0004b = this.f278aj.get(i2);
            c0004b.mo72b(c0014e, i);
            if (c0004b.f171G == C0004b.a.MATCH_CONSTRAINT && c0004b.m88h() < c0004b.m94k()) {
                zArr[2] = true;
            }
            if (c0004b.f172H == C0004b.a.MATCH_CONSTRAINT && c0004b.m96l() < c0004b.m98m()) {
                zArr[2] = true;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m126a(ArrayList<C0004b> arrayList, boolean[] zArr) {
        int size = arrayList.size();
        char c = 0;
        zArr[0] = true;
        int i = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        while (i < size) {
            C0004b c0004b = arrayList.get(i);
            if (!c0004b.m73b()) {
                if (!c0004b.f181Q) {
                    m124a(c0004b, zArr);
                }
                if (!c0004b.f182R) {
                    m127b(c0004b, zArr);
                }
                if (!zArr[c]) {
                    return;
                }
                int iM88h = (c0004b.f174J + c0004b.f175K) - c0004b.m88h();
                int iM96l = (c0004b.f173I + c0004b.f176L) - c0004b.m96l();
                int iM88h2 = c0004b.f171G == C0004b.a.MATCH_PARENT ? c0004b.m88h() + c0004b.f214i.f140d + c0004b.f216k.f140d : iM88h;
                int iM96l2 = c0004b.f172H == C0004b.a.MATCH_PARENT ? c0004b.m96l() + c0004b.f215j.f140d + c0004b.f217l.f140d : iM96l;
                if (c0004b.m78d() == 8) {
                    iM88h2 = 0;
                    iM96l2 = 0;
                }
                iMax = Math.max(iMax, c0004b.f174J);
                iMax2 = Math.max(iMax2, c0004b.f175K);
                iMax4 = Math.max(iMax4, c0004b.f176L);
                iMax3 = Math.max(iMax3, c0004b.f173I);
                int iMax6 = Math.max(i2, iM88h2);
                iMax5 = Math.max(iMax5, iM96l2);
                i2 = iMax6;
            }
            i++;
            c = 0;
        }
        this.f241ad = Math.max(this.f167B, Math.max(Math.max(iMax, iMax2), i2));
        this.f242ae = Math.max(this.f168C, Math.max(Math.max(iMax3, iMax4), iMax5));
        for (int i3 = 0; i3 < size; i3++) {
            C0004b c0004b2 = arrayList.get(i3);
            c0004b2.f181Q = false;
            c0004b2.f182R = false;
            c0004b2.f177M = false;
            c0004b2.f178N = false;
            c0004b2.f179O = false;
            c0004b2.f180P = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0176  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m127b(C0004b c0004b, boolean[] zArr) {
        int iM41d;
        C0004b c0004bM39b;
        int iM92j;
        int iM92j2;
        int iM86g = 0;
        if (c0004b.f172H == C0004b.a.MATCH_CONSTRAINT && c0004b.f171G != C0004b.a.MATCH_CONSTRAINT && c0004b.f226u > 0.0f) {
            zArr[0] = false;
            return;
        }
        int iM92j3 = c0004b.m92j();
        boolean z = true;
        c0004b.f182R = true;
        if (c0004b instanceof C0006d) {
            C0006d c0006d = (C0006d) c0004b;
            if (c0006d.m130D() == 0) {
                if (c0006d.m132F() != -1) {
                    iM86g = c0006d.m132F();
                } else if (c0006d.m133G() != -1) {
                    iM92j3 = c0006d.m133G();
                }
                iM92j3 = 0;
            } else {
                iM86g = iM92j3;
            }
        } else {
            if (c0004b.f218m.f139c != null || c0004b.f215j.f139c != null || c0004b.f217l.f139c != null) {
                if (c0004b.f217l.f139c != null && c0004b.f215j.f139c != null && (c0004b.f217l.f139c == c0004b.f215j.f139c || (c0004b.f217l.f139c.f137a == c0004b.f215j.f139c.f137a && c0004b.f217l.f139c.f137a != c0004b.f223r))) {
                    zArr[0] = false;
                    return;
                }
                if (c0004b.f218m.m47j()) {
                    C0004b c0004bM39b2 = c0004b.f218m.f139c.m39b();
                    if (!c0004bM39b2.f182R) {
                        m127b(c0004bM39b2, zArr);
                    }
                    int iMax = Math.max((c0004bM39b2.f173I - c0004bM39b2.f225t) + iM92j3, iM92j3);
                    iM92j3 = Math.max((c0004bM39b2.f176L - c0004bM39b2.f225t) + iM92j3, iM92j3);
                    if (c0004b.m78d() == 8) {
                        iMax -= c0004b.f225t;
                        iM92j3 -= c0004b.f225t;
                    }
                    c0004b.f173I = iMax;
                    c0004b.f176L = iM92j3;
                }
                C0004b c0004bM39b3 = null;
                if (c0004b.f215j.m47j()) {
                    c0004bM39b = c0004b.f215j.f139c.m39b();
                    iM41d = c0004b.f215j.m41d() + iM92j3;
                    if (!c0004bM39b.m73b() && !c0004bM39b.f182R) {
                        m127b(c0004bM39b, zArr);
                    }
                } else {
                    iM41d = iM92j3;
                    c0004bM39b = null;
                }
                if (c0004b.f217l.m47j()) {
                    c0004bM39b3 = c0004b.f217l.f139c.m39b();
                    iM92j3 += c0004b.f217l.m41d();
                    if (!c0004bM39b3.m73b() && !c0004bM39b3.f182R) {
                        m127b(c0004bM39b3, zArr);
                    }
                }
                if (c0004b.f215j.f139c != null && !c0004bM39b.m73b()) {
                    if (c0004b.f215j.f139c.m40c() == C0003a.c.TOP) {
                        iM92j2 = c0004bM39b.f173I - c0004bM39b.m92j();
                    } else {
                        if (c0004b.f215j.f139c.m40c() == C0003a.c.BOTTOM) {
                            iM92j2 = c0004bM39b.f173I;
                        }
                        c0004b.f179O = (c0004bM39b.f179O && (c0004bM39b.f215j.f139c == null || c0004bM39b.f215j.f139c.f137a == c0004b || c0004bM39b.f217l.f139c == null || c0004bM39b.f217l.f139c.f137a == c0004b || c0004bM39b.f172H == C0004b.a.MATCH_CONSTRAINT)) ? false : true;
                        if (c0004b.f179O && (c0004bM39b.f217l.f139c == null || c0004bM39b.f217l.f139c.f137a != c0004b)) {
                            iM41d += iM41d - c0004bM39b.f173I;
                        }
                    }
                    iM41d += iM92j2;
                    if (c0004bM39b.f179O) {
                        c0004b.f179O = (c0004bM39b.f179O && (c0004bM39b.f215j.f139c == null || c0004bM39b.f215j.f139c.f137a == c0004b || c0004bM39b.f217l.f139c == null || c0004bM39b.f217l.f139c.f137a == c0004b || c0004bM39b.f172H == C0004b.a.MATCH_CONSTRAINT)) ? false : true;
                        if (c0004b.f179O) {
                            iM41d += iM41d - c0004bM39b.f173I;
                        }
                    }
                    c0004b.f176L = iM92j3;
                }
                if (c0004b.f217l.f139c != null && !c0004bM39b3.m73b()) {
                    if (c0004b.f217l.f139c.m40c() == C0003a.c.BOTTOM) {
                        iM92j = c0004bM39b3.f176L - c0004bM39b3.m92j();
                    } else {
                        if (c0004b.f217l.f139c.m40c() == C0003a.c.TOP) {
                            iM92j = c0004bM39b3.f176L;
                        }
                        if (!c0004bM39b3.f180P && (c0004bM39b3.f215j.f139c == null || c0004bM39b3.f215j.f139c.f137a == c0004b || c0004bM39b3.f217l.f139c == null || c0004bM39b3.f217l.f139c.f137a == c0004b || c0004bM39b3.f172H == C0004b.a.MATCH_CONSTRAINT)) {
                            z = false;
                        }
                        c0004b.f180P = z;
                        if (c0004b.f180P && (c0004bM39b3.f215j.f139c == null || c0004bM39b3.f215j.f139c.f137a != c0004b)) {
                            iM92j3 += iM92j3 - c0004bM39b3.f176L;
                        }
                    }
                    iM92j3 += iM92j;
                    if (!c0004bM39b3.f180P) {
                        z = false;
                    }
                    c0004b.f180P = z;
                    if (c0004b.f180P) {
                        iM92j3 += iM92j3 - c0004bM39b3.f176L;
                    }
                }
                if (c0004b.m78d() == 8) {
                    iM41d -= c0004b.f225t;
                    iM92j3 -= c0004b.f225t;
                }
                c0004b.f173I = iM41d;
                c0004b.f176L = iM92j3;
            }
            iM86g = iM92j3 + c0004b.m86g();
        }
        iM41d = iM86g;
        if (c0004b.m78d() == 8) {
        }
        c0004b.f173I = iM41d;
        c0004b.f176L = iM92j3;
    }

    /* JADX INFO: renamed from: c */
    public boolean m128c(C0014e c0014e, int i) {
        boolean z;
        mo64a(c0014e, i);
        int size = this.f278aj.size();
        if (this.f253aq == 2 || this.f253aq == 4) {
            if (m114a(c0014e)) {
                return false;
            }
            z = false;
        } else {
            z = true;
        }
        for (int i2 = 0; i2 < size; i2++) {
            C0004b c0004b = this.f278aj.get(i2);
            if (c0004b instanceof C0005c) {
                C0004b.a aVar = c0004b.f171G;
                C0004b.a aVar2 = c0004b.f172H;
                if (aVar == C0004b.a.WRAP_CONTENT) {
                    c0004b.m61a(C0004b.a.FIXED);
                }
                if (aVar2 == C0004b.a.WRAP_CONTENT) {
                    c0004b.m71b(C0004b.a.FIXED);
                }
                c0004b.mo64a(c0014e, i);
                if (aVar == C0004b.a.WRAP_CONTENT) {
                    c0004b.m61a(aVar);
                }
                if (aVar2 == C0004b.a.WRAP_CONTENT) {
                    c0004b.m71b(aVar2);
                }
            } else {
                if (z) {
                    C0007e.m139a(this, c0014e, c0004b);
                }
                c0004b.mo64a(c0014e, i);
            }
        }
        if (this.f248al > 0) {
            m115b(c0014e);
        }
        if (this.f249am > 0) {
            m116c(c0014e);
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m129m(int i) {
        this.f253aq = i;
    }
}
