package android.support.constraint.p000a.p001a;

import android.support.constraint.p000a.C0011b;
import android.support.constraint.p000a.C0014e;
import android.support.constraint.p000a.C0016g;
import android.support.constraint.p000a.p001a.C0003a;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.constraint.a.a.d */
/* JADX INFO: loaded from: classes.dex */
public class C0006d extends C0004b {

    /* JADX INFO: renamed from: aa */
    protected float f258aa = -1.0f;

    /* JADX INFO: renamed from: ab */
    protected int f259ab = -1;

    /* JADX INFO: renamed from: ac */
    protected int f260ac = -1;

    /* JADX INFO: renamed from: ad */
    private C0003a f261ad = this.f215j;

    /* JADX INFO: renamed from: ae */
    private int f262ae = 0;

    /* JADX INFO: renamed from: af */
    private boolean f263af = false;

    /* JADX INFO: renamed from: ag */
    private int f264ag = 0;

    /* JADX INFO: renamed from: ah */
    private C0008f f265ah = new C0008f();

    /* JADX INFO: renamed from: ai */
    private int f266ai = 8;

    public C0006d() {
        this.f222q.clear();
        this.f222q.add(this.f261ad);
    }

    /* JADX INFO: renamed from: D */
    public int m130D() {
        return this.f262ae;
    }

    /* JADX INFO: renamed from: E */
    public float m131E() {
        return this.f258aa;
    }

    /* JADX INFO: renamed from: F */
    public int m132F() {
        return this.f259ab;
    }

    /* JADX INFO: renamed from: G */
    public int m133G() {
        return this.f260ac;
    }

    @Override // android.support.constraint.p000a.p001a.C0004b
    /* JADX INFO: renamed from: a */
    public C0003a mo53a(C0003a.c cVar) {
        switch (cVar) {
            case LEFT:
            case RIGHT:
                if (this.f262ae == 1) {
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.f262ae == 0) {
                }
                break;
        }
        return this.f261ad;
    }

    @Override // android.support.constraint.p000a.p001a.C0004b
    /* JADX INFO: renamed from: a */
    public void mo64a(C0014e c0014e, int i) {
        C0011b c0011bM176a;
        C0016g c0016gM189a;
        C0016g c0016gM189a2;
        int i2;
        C0005c c0005c = (C0005c) m74c();
        if (c0005c == null) {
            return;
        }
        C0003a c0003aA = c0005c.mo53a(C0003a.c.LEFT);
        C0003a c0003aA2 = c0005c.mo53a(C0003a.c.RIGHT);
        if (this.f262ae == 0) {
            c0003aA = c0005c.mo53a(C0003a.c.TOP);
            c0003aA2 = c0005c.mo53a(C0003a.c.BOTTOM);
        }
        if (this.f259ab != -1) {
            c0016gM189a = c0014e.m189a(this.f261ad);
            c0016gM189a2 = c0014e.m189a(c0003aA);
            i2 = this.f259ab;
        } else {
            if (this.f260ac == -1) {
                if (this.f258aa != -1.0f) {
                    c0011bM176a = C0014e.m176a(c0014e, c0014e.m189a(this.f261ad), c0014e.m189a(c0003aA), c0014e.m189a(c0003aA2), this.f258aa, this.f263af);
                    c0014e.m191a(c0011bM176a);
                }
                return;
            }
            c0016gM189a = c0014e.m189a(this.f261ad);
            c0016gM189a2 = c0014e.m189a(c0003aA2);
            i2 = -this.f260ac;
        }
        c0011bM176a = C0014e.m175a(c0014e, c0016gM189a, c0016gM189a2, i2, false);
        c0014e.m191a(c0011bM176a);
    }

    @Override // android.support.constraint.p000a.p001a.C0004b
    /* JADX INFO: renamed from: b */
    public void mo72b(C0014e c0014e, int i) {
        if (m74c() == null) {
            return;
        }
        int iM196b = c0014e.m196b(this.f261ad);
        if (this.f262ae == 1) {
            m68b(iM196b);
            m76c(0);
            m83e(m74c().m96l());
            m80d(0);
            return;
        }
        m68b(0);
        m76c(iM196b);
        m80d(m74c().m88h());
        m83e(0);
    }

    /* JADX INFO: renamed from: e */
    public void m134e(float f) {
        if (f > -1.0f) {
            this.f258aa = f;
            this.f259ab = -1;
            this.f260ac = -1;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m135m(int i) {
        if (this.f262ae == i) {
            return;
        }
        this.f262ae = i;
        this.f222q.clear();
        this.f261ad = this.f262ae == 1 ? this.f214i : this.f215j;
        this.f222q.add(this.f261ad);
    }

    /* JADX INFO: renamed from: n */
    public void m136n(int i) {
        if (i > -1) {
            this.f258aa = -1.0f;
            this.f259ab = i;
            this.f260ac = -1;
        }
    }

    /* JADX INFO: renamed from: o */
    public void m137o(int i) {
        if (i > -1) {
            this.f258aa = -1.0f;
            this.f259ab = -1;
            this.f260ac = i;
        }
    }

    @Override // android.support.constraint.p000a.p001a.C0004b
    /* JADX INFO: renamed from: y */
    public ArrayList<C0003a> mo110y() {
        return this.f222q;
    }
}
