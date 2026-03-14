package android.support.constraint.p000a;

import android.support.constraint.p000a.C0016g;

/* JADX INFO: renamed from: android.support.constraint.a.b */
/* JADX INFO: loaded from: classes.dex */
public class C0011b {

    /* JADX INFO: renamed from: d */
    final C0002a f282d;

    /* JADX INFO: renamed from: a */
    C0016g f279a = null;

    /* JADX INFO: renamed from: b */
    float f280b = 0.0f;

    /* JADX INFO: renamed from: c */
    boolean f281c = false;

    /* JADX INFO: renamed from: e */
    boolean f283e = false;

    public C0011b(C0012c c0012c) {
        this.f282d = new C0002a(this, c0012c);
    }

    /* JADX INFO: renamed from: a */
    public C0011b m151a(float f, float f2, float f3, C0016g c0016g, int i, C0016g c0016g2, int i2, C0016g c0016g3, int i3, C0016g c0016g4, int i4) {
        if (f2 == 0.0f || f == f3) {
            this.f280b = ((-i) - i2) + i3 + i4;
            this.f282d.m25a(c0016g, 1.0f);
            this.f282d.m25a(c0016g2, -1.0f);
            this.f282d.m25a(c0016g4, 1.0f);
            this.f282d.m25a(c0016g3, -1.0f);
            return this;
        }
        float f4 = (f / f2) / (f3 / f2);
        this.f280b = ((-i) - i2) + (i3 * f4) + (i4 * f4);
        this.f282d.m25a(c0016g, 1.0f);
        this.f282d.m25a(c0016g2, -1.0f);
        this.f282d.m25a(c0016g4, f4);
        this.f282d.m25a(c0016g3, -f4);
        return this;
    }

    /* JADX INFO: renamed from: a */
    C0011b m152a(C0016g c0016g, int i) {
        this.f279a = c0016g;
        float f = i;
        c0016g.f309d = f;
        this.f280b = f;
        this.f283e = true;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0011b m153a(C0016g c0016g, C0016g c0016g2) {
        this.f282d.m25a(c0016g, 1.0f);
        this.f282d.m25a(c0016g2, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0011b m154a(C0016g c0016g, C0016g c0016g2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f280b = i;
        }
        if (z) {
            this.f282d.m25a(c0016g, 1.0f);
            this.f282d.m25a(c0016g2, -1.0f);
            return this;
        }
        this.f282d.m25a(c0016g, -1.0f);
        this.f282d.m25a(c0016g2, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: a */
    C0011b m155a(C0016g c0016g, C0016g c0016g2, int i, float f, C0016g c0016g3, C0016g c0016g4, int i2) {
        float f2;
        if (c0016g2 == c0016g3) {
            this.f282d.m25a(c0016g, 1.0f);
            this.f282d.m25a(c0016g4, 1.0f);
            this.f282d.m25a(c0016g2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f282d.m25a(c0016g, 1.0f);
            this.f282d.m25a(c0016g2, -1.0f);
            this.f282d.m25a(c0016g3, -1.0f);
            this.f282d.m25a(c0016g4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (-i) + i2;
                this.f280b = f2;
                return this;
            }
            return this;
        }
        if (f <= 0.0f) {
            this.f282d.m25a(c0016g, -1.0f);
            this.f282d.m25a(c0016g2, 1.0f);
            f2 = i;
        } else {
            if (f < 1.0f) {
                float f3 = 1.0f - f;
                this.f282d.m25a(c0016g, f3 * 1.0f);
                this.f282d.m25a(c0016g2, f3 * (-1.0f));
                this.f282d.m25a(c0016g3, (-1.0f) * f);
                this.f282d.m25a(c0016g4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    f2 = ((-i) * f3) + (i2 * f);
                }
                return this;
            }
            this.f282d.m25a(c0016g3, -1.0f);
            this.f282d.m25a(c0016g4, 1.0f);
            f2 = i2;
        }
        this.f280b = f2;
        return this;
    }

    /* JADX INFO: renamed from: a */
    C0011b m156a(C0016g c0016g, C0016g c0016g2, C0016g c0016g3, float f) {
        this.f282d.m25a(c0016g, -1.0f);
        this.f282d.m25a(c0016g2, 1.0f - f);
        this.f282d.m25a(c0016g3, f);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0011b m157a(C0016g c0016g, C0016g c0016g2, C0016g c0016g3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f280b = i;
        }
        if (z) {
            this.f282d.m25a(c0016g, 1.0f);
            this.f282d.m25a(c0016g2, -1.0f);
            this.f282d.m25a(c0016g3, -1.0f);
            return this;
        }
        this.f282d.m25a(c0016g, -1.0f);
        this.f282d.m25a(c0016g2, 1.0f);
        this.f282d.m25a(c0016g3, 1.0f);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C0011b m158a(C0016g c0016g, C0016g c0016g2, C0016g c0016g3, C0016g c0016g4, float f) {
        this.f282d.m25a(c0016g, -1.0f);
        this.f282d.m25a(c0016g2, 1.0f);
        this.f282d.m25a(c0016g3, f);
        this.f282d.m25a(c0016g4, -f);
        return this;
    }

    /* JADX INFO: renamed from: a */
    void m159a() {
        this.f282d.m22a(this);
    }

    /* JADX INFO: renamed from: a */
    boolean m160a(C0011b c0011b) {
        this.f282d.m23a(this, c0011b);
        return true;
    }

    /* JADX INFO: renamed from: a */
    boolean m161a(C0016g c0016g) {
        return this.f282d.m29b(c0016g);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public C0011b m162b(C0016g c0016g, int i) {
        C0002a c0002a;
        float f;
        if (i < 0) {
            this.f280b = i * (-1);
            c0002a = this.f282d;
            f = 1.0f;
        } else {
            this.f280b = i;
            c0002a = this.f282d;
            f = -1.0f;
        }
        c0002a.m25a(c0016g, f);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C0011b m163b(C0016g c0016g, C0016g c0016g2, C0016g c0016g3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f280b = i;
        }
        if (z) {
            this.f282d.m25a(c0016g, 1.0f);
            this.f282d.m25a(c0016g2, -1.0f);
            this.f282d.m25a(c0016g3, 1.0f);
            return this;
        }
        this.f282d.m25a(c0016g, -1.0f);
        this.f282d.m25a(c0016g2, 1.0f);
        this.f282d.m25a(c0016g3, -1.0f);
        return this;
    }

    /* JADX INFO: renamed from: b */
    void m164b(C0016g c0016g) {
        if (this.f279a != null) {
            this.f282d.m25a(this.f279a, -1.0f);
            this.f279a = null;
        }
        float fM18a = this.f282d.m18a(c0016g) * (-1.0f);
        this.f279a = c0016g;
        if (fM18a == 1.0f) {
            return;
        }
        this.f280b /= fM18a;
        this.f282d.m21a(fM18a);
    }

    /* JADX INFO: renamed from: b */
    boolean m165b() {
        if (this.f279a != null) {
            return this.f279a.f311f == C0016g.a.UNRESTRICTED || this.f280b >= 0.0f;
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    C0011b m166c(C0016g c0016g, int i) {
        this.f282d.m25a(c0016g, i);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c0  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    String m167c() {
        StringBuilder sb;
        boolean z;
        StringBuilder sb2;
        String str;
        StringBuilder sb3;
        if (this.f279a == null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append("0");
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f279a);
        }
        String string = sb.toString() + " = ";
        if (this.f280b != 0.0f) {
            string = string + this.f280b;
            z = true;
        } else {
            z = false;
        }
        int i = this.f282d.f126a;
        for (int i2 = 0; i2 < i; i2++) {
            C0016g c0016gM19a = this.f282d.m19a(i2);
            if (c0016gM19a != null) {
                float fM26b = this.f282d.m26b(i2);
                String string2 = c0016gM19a.toString();
                if (!z) {
                    if (fM26b < 0.0f) {
                        sb2 = new StringBuilder();
                        sb2.append(string);
                        str = "- ";
                        sb2.append(str);
                        string = sb2.toString();
                        fM26b *= -1.0f;
                    }
                    if (fM26b == 1.0f) {
                        sb3 = new StringBuilder();
                    } else {
                        sb3 = new StringBuilder();
                        sb3.append(string);
                        sb3.append(fM26b);
                        string = " ";
                    }
                    sb3.append(string);
                    sb3.append(string2);
                    string = sb3.toString();
                    z = true;
                } else if (fM26b > 0.0f) {
                    string = string + " + ";
                    if (fM26b == 1.0f) {
                    }
                    sb3.append(string);
                    sb3.append(string2);
                    string = sb3.toString();
                    z = true;
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(string);
                    str = " - ";
                    sb2.append(str);
                    string = sb2.toString();
                    fM26b *= -1.0f;
                    if (fM26b == 1.0f) {
                    }
                    sb3.append(string);
                    sb3.append(string2);
                    string = sb3.toString();
                    z = true;
                }
            }
        }
        if (z) {
            return string;
        }
        return string + "0.0";
    }

    /* JADX INFO: renamed from: d */
    public void m168d() {
        this.f279a = null;
        this.f282d.m20a();
        this.f280b = 0.0f;
        this.f283e = false;
    }

    /* JADX INFO: renamed from: e */
    void m169e() {
        if (this.f280b < 0.0f) {
            this.f280b *= -1.0f;
            this.f282d.m27b();
        }
    }

    /* JADX INFO: renamed from: f */
    void m170f() {
        C0016g c0016gM31c = this.f282d.m31c();
        if (c0016gM31c != null) {
            m164b(c0016gM31c);
        }
        if (this.f282d.f126a == 0) {
            this.f283e = true;
        }
    }

    public String toString() {
        return m167c();
    }
}
