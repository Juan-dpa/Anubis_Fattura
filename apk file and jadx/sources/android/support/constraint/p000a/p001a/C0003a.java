package android.support.constraint.p000a.p001a;

import android.support.constraint.p000a.C0012c;
import android.support.constraint.p000a.C0016g;
import java.util.HashSet;

/* JADX INFO: renamed from: android.support.constraint.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0003a {

    /* JADX INFO: renamed from: a */
    final C0004b f137a;

    /* JADX INFO: renamed from: b */
    final c f138b;

    /* JADX INFO: renamed from: c */
    C0003a f139c;

    /* JADX INFO: renamed from: f */
    C0016g f142f;

    /* JADX INFO: renamed from: d */
    public int f140d = 0;

    /* JADX INFO: renamed from: e */
    int f141e = -1;

    /* JADX INFO: renamed from: h */
    private b f144h = b.NONE;

    /* JADX INFO: renamed from: i */
    private a f145i = a.RELAXED;

    /* JADX INFO: renamed from: j */
    private int f146j = 0;

    /* JADX INFO: renamed from: g */
    int f143g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: android.support.constraint.a.a.a$a */
    public enum a {
        RELAXED,
        STRICT
    }

    /* JADX INFO: renamed from: android.support.constraint.a.a.a$b */
    public enum b {
        NONE,
        STRONG,
        WEAK
    }

    /* JADX INFO: renamed from: android.support.constraint.a.a.a$c */
    public enum c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public C0003a(C0004b c0004b, c cVar) {
        this.f137a = c0004b;
        this.f138b = cVar;
    }

    /* JADX INFO: renamed from: a */
    private String m32a(HashSet<C0003a> hashSet) {
        String str;
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f137a.m82e());
        sb.append(":");
        sb.append(this.f138b.toString());
        if (this.f139c != null) {
            str = " connected to " + this.f139c.m32a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public C0016g m33a() {
        return this.f142f;
    }

    /* JADX INFO: renamed from: a */
    public void m34a(a aVar) {
        this.f145i = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m35a(C0012c c0012c) {
        if (this.f142f == null) {
            this.f142f = new C0016g(C0016g.a.UNRESTRICTED);
        } else {
            this.f142f.m212c();
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m36a(C0003a c0003a) {
        if (c0003a == null) {
            return false;
        }
        c cVarM40c = c0003a.m40c();
        if (cVarM40c == this.f138b) {
            if (this.f138b == c.CENTER) {
                return false;
            }
            return this.f138b != c.BASELINE || (c0003a.m39b().m107v() && m39b().m107v());
        }
        switch (this.f138b) {
            case CENTER:
                if (cVarM40c == c.BASELINE || cVarM40c == c.CENTER_X || cVarM40c == c.CENTER_Y) {
                }
                break;
            case LEFT:
            case RIGHT:
                boolean z = cVarM40c == c.LEFT || cVarM40c == c.RIGHT;
                if (c0003a.m39b() instanceof C0006d) {
                    if (z || cVarM40c == c.CENTER_X) {
                    }
                }
                break;
            case TOP:
            case BOTTOM:
                boolean z2 = cVarM40c == c.TOP || cVarM40c == c.BOTTOM;
                if (c0003a.m39b() instanceof C0006d) {
                    if (z2 || cVarM40c == c.CENTER_Y) {
                    }
                }
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public boolean m37a(C0003a c0003a, int i, int i2, b bVar, int i3, boolean z) {
        if (c0003a == null) {
            this.f139c = null;
            this.f140d = 0;
            this.f141e = -1;
            this.f144h = b.NONE;
            this.f146j = 2;
            return true;
        }
        if (!z && !m36a(c0003a)) {
            return false;
        }
        this.f139c = c0003a;
        if (i > 0) {
            this.f140d = i;
        } else {
            this.f140d = 0;
        }
        this.f141e = i2;
        this.f144h = bVar;
        this.f146j = i3;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m38a(C0003a c0003a, int i, b bVar, int i2) {
        return m37a(c0003a, i, -1, bVar, i2, false);
    }

    /* JADX INFO: renamed from: b */
    public C0004b m39b() {
        return this.f137a;
    }

    /* JADX INFO: renamed from: c */
    public c m40c() {
        return this.f138b;
    }

    /* JADX INFO: renamed from: d */
    public int m41d() {
        if (this.f137a.m78d() == 8) {
            return 0;
        }
        return (this.f141e <= -1 || this.f139c == null || this.f139c.f137a.m78d() != 8) ? this.f140d : this.f141e;
    }

    /* JADX INFO: renamed from: e */
    public b m42e() {
        return this.f144h;
    }

    /* JADX INFO: renamed from: f */
    public C0003a m43f() {
        return this.f139c;
    }

    /* JADX INFO: renamed from: g */
    public a m44g() {
        return this.f145i;
    }

    /* JADX INFO: renamed from: h */
    public int m45h() {
        return this.f146j;
    }

    /* JADX INFO: renamed from: i */
    public void m46i() {
        this.f139c = null;
        this.f140d = 0;
        this.f141e = -1;
        this.f144h = b.STRONG;
        this.f146j = 0;
        this.f145i = a.RELAXED;
    }

    /* JADX INFO: renamed from: j */
    public boolean m47j() {
        return this.f139c != null;
    }

    public String toString() {
        String str;
        HashSet<C0003a> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f137a.m82e());
        sb.append(":");
        sb.append(this.f138b.toString());
        if (this.f139c != null) {
            str = " connected to " + this.f139c.m32a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
