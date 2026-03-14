package android.support.constraint.p000a;

import android.support.constraint.p000a.C0016g;
import java.util.Arrays;

/* JADX INFO: renamed from: android.support.constraint.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C0002a {

    /* JADX INFO: renamed from: b */
    private final C0011b f127b;

    /* JADX INFO: renamed from: c */
    private final C0012c f128c;

    /* JADX INFO: renamed from: a */
    int f126a = 0;

    /* JADX INFO: renamed from: d */
    private int f129d = 8;

    /* JADX INFO: renamed from: e */
    private C0016g f130e = null;

    /* JADX INFO: renamed from: f */
    private int[] f131f = new int[this.f129d];

    /* JADX INFO: renamed from: g */
    private int[] f132g = new int[this.f129d];

    /* JADX INFO: renamed from: h */
    private float[] f133h = new float[this.f129d];

    /* JADX INFO: renamed from: i */
    private int f134i = -1;

    /* JADX INFO: renamed from: j */
    private int f135j = -1;

    /* JADX INFO: renamed from: k */
    private boolean f136k = false;

    C0002a(C0011b c0011b, C0012c c0012c) {
        this.f127b = c0011b;
        this.f128c = c0012c;
    }

    /* JADX INFO: renamed from: a */
    public final float m18a(C0016g c0016g) {
        if (this.f130e == c0016g) {
            this.f130e = null;
        }
        if (this.f134i == -1) {
            return 0.0f;
        }
        int i = this.f134i;
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f126a) {
            int i4 = this.f131f[i];
            if (i4 == c0016g.f306a) {
                if (i == this.f134i) {
                    this.f134i = this.f132g[i];
                } else {
                    this.f132g[i3] = this.f132g[i];
                }
                this.f128c.f286c[i4].m211b(this.f127b);
                this.f126a--;
                this.f131f[i] = -1;
                if (this.f136k) {
                    this.f135j = i;
                }
                return this.f133h[i];
            }
            i2++;
            i3 = i;
            i = this.f132g[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    final C0016g m19a(int i) {
        int i2 = this.f134i;
        for (int i3 = 0; i2 != -1 && i3 < this.f126a; i3++) {
            if (i3 == i) {
                return this.f128c.f286c[this.f131f[i2]];
            }
            i2 = this.f132g[i2];
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final void m20a() {
        this.f134i = -1;
        this.f135j = -1;
        this.f136k = false;
        this.f126a = 0;
    }

    /* JADX INFO: renamed from: a */
    void m21a(float f) {
        int i = this.f134i;
        for (int i2 = 0; i != -1 && i2 < this.f126a; i2++) {
            float[] fArr = this.f133h;
            fArr[i] = fArr[i] / f;
            i = this.f132g[i];
        }
    }

    /* JADX INFO: renamed from: a */
    void m22a(C0011b c0011b) {
        int i = this.f134i;
        for (int i2 = 0; i != -1 && i2 < this.f126a; i2++) {
            this.f128c.f286c[this.f131f[i]].m208a(c0011b);
            i = this.f132g[i];
        }
    }

    /* JADX INFO: renamed from: a */
    void m23a(C0011b c0011b, C0011b c0011b2) {
        int i = this.f134i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f126a; i2++) {
                if (this.f131f[i] == c0011b2.f279a.f306a) {
                    float f = this.f133h[i];
                    m18a(c0011b2.f279a);
                    C0002a c0002a = c0011b2.f282d;
                    int i3 = c0002a.f134i;
                    for (int i4 = 0; i3 != -1 && i4 < c0002a.f126a; i4++) {
                        m28b(this.f128c.f286c[c0002a.f131f[i3]], c0002a.f133h[i3] * f);
                        i3 = c0002a.f132g[i3];
                    }
                    c0011b.f280b += c0011b2.f280b * f;
                    c0011b2.f279a.m211b(c0011b);
                    i = this.f134i;
                } else {
                    i = this.f132g[i];
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: a */
    void m24a(C0011b c0011b, C0011b[] c0011bArr) {
        int i = this.f134i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f126a; i2++) {
                C0016g c0016g = this.f128c.f286c[this.f131f[i]];
                if (c0016g.f307b != -1) {
                    float f = this.f133h[i];
                    m18a(c0016g);
                    C0011b c0011b2 = c0011bArr[c0016g.f307b];
                    if (!c0011b2.f283e) {
                        C0002a c0002a = c0011b2.f282d;
                        int i3 = c0002a.f134i;
                        for (int i4 = 0; i3 != -1 && i4 < c0002a.f126a; i4++) {
                            m28b(this.f128c.f286c[c0002a.f131f[i3]], c0002a.f133h[i3] * f);
                            i3 = c0002a.f132g[i3];
                        }
                    }
                    c0011b.f280b += c0011b2.f280b * f;
                    c0011b2.f279a.m211b(c0011b);
                    i = this.f134i;
                } else {
                    i = this.f132g[i];
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m25a(C0016g c0016g, float f) {
        if (f == 0.0f) {
            m18a(c0016g);
            return;
        }
        if (this.f134i == -1) {
            this.f134i = 0;
            this.f133h[this.f134i] = f;
            this.f131f[this.f134i] = c0016g.f306a;
            this.f132g[this.f134i] = -1;
            this.f126a++;
            if (this.f136k) {
                return;
            }
            this.f135j++;
            return;
        }
        int i = this.f134i;
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.f126a; i3++) {
            if (this.f131f[i] == c0016g.f306a) {
                this.f133h[i] = f;
                return;
            }
            if (this.f131f[i] < c0016g.f306a) {
                i2 = i;
            }
            i = this.f132g[i];
        }
        int length = this.f135j + 1;
        if (this.f136k) {
            length = this.f131f[this.f135j] == -1 ? this.f135j : this.f131f.length;
        }
        if (length >= this.f131f.length && this.f126a < this.f131f.length) {
            int i4 = 0;
            while (true) {
                if (i4 >= this.f131f.length) {
                    break;
                }
                if (this.f131f[i4] == -1) {
                    length = i4;
                    break;
                }
                i4++;
            }
        }
        if (length >= this.f131f.length) {
            length = this.f131f.length;
            this.f129d *= 2;
            this.f136k = false;
            this.f135j = length - 1;
            this.f133h = Arrays.copyOf(this.f133h, this.f129d);
            this.f131f = Arrays.copyOf(this.f131f, this.f129d);
            this.f132g = Arrays.copyOf(this.f132g, this.f129d);
        }
        this.f131f[length] = c0016g.f306a;
        this.f133h[length] = f;
        if (i2 != -1) {
            this.f132g[length] = this.f132g[i2];
            this.f132g[i2] = length;
        } else {
            this.f132g[length] = this.f134i;
            this.f134i = length;
        }
        this.f126a++;
        if (!this.f136k) {
            this.f135j++;
        }
        if (this.f126a >= this.f131f.length) {
            this.f136k = true;
        }
    }

    /* JADX INFO: renamed from: b */
    final float m26b(int i) {
        int i2 = this.f134i;
        for (int i3 = 0; i2 != -1 && i3 < this.f126a; i3++) {
            if (i3 == i) {
                return this.f133h[i2];
            }
            i2 = this.f132g[i2];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: b */
    void m27b() {
        int i = this.f134i;
        for (int i2 = 0; i != -1 && i2 < this.f126a; i2++) {
            float[] fArr = this.f133h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f132g[i];
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m28b(C0016g c0016g, float f) {
        if (f == 0.0f) {
            return;
        }
        if (this.f134i == -1) {
            this.f134i = 0;
            this.f133h[this.f134i] = f;
            this.f131f[this.f134i] = c0016g.f306a;
            this.f132g[this.f134i] = -1;
            this.f126a++;
            if (this.f136k) {
                return;
            }
            this.f135j++;
            return;
        }
        int i = this.f134i;
        int i2 = -1;
        for (int i3 = 0; i != -1 && i3 < this.f126a; i3++) {
            int i4 = this.f131f[i];
            if (i4 == c0016g.f306a) {
                float[] fArr = this.f133h;
                fArr[i] = fArr[i] + f;
                if (this.f133h[i] == 0.0f) {
                    if (i == this.f134i) {
                        this.f134i = this.f132g[i];
                    } else {
                        this.f132g[i2] = this.f132g[i];
                    }
                    this.f128c.f286c[i4].m211b(this.f127b);
                    if (this.f136k) {
                        this.f135j = i;
                    }
                    this.f126a--;
                    return;
                }
                return;
            }
            if (this.f131f[i] < c0016g.f306a) {
                i2 = i;
            }
            i = this.f132g[i];
        }
        int length = this.f135j + 1;
        if (this.f136k) {
            length = this.f131f[this.f135j] == -1 ? this.f135j : this.f131f.length;
        }
        if (length >= this.f131f.length && this.f126a < this.f131f.length) {
            int i5 = 0;
            while (true) {
                if (i5 >= this.f131f.length) {
                    break;
                }
                if (this.f131f[i5] == -1) {
                    length = i5;
                    break;
                }
                i5++;
            }
        }
        if (length >= this.f131f.length) {
            length = this.f131f.length;
            this.f129d *= 2;
            this.f136k = false;
            this.f135j = length - 1;
            this.f133h = Arrays.copyOf(this.f133h, this.f129d);
            this.f131f = Arrays.copyOf(this.f131f, this.f129d);
            this.f132g = Arrays.copyOf(this.f132g, this.f129d);
        }
        this.f131f[length] = c0016g.f306a;
        this.f133h[length] = f;
        if (i2 != -1) {
            this.f132g[length] = this.f132g[i2];
            this.f132g[i2] = length;
        } else {
            this.f132g[length] = this.f134i;
            this.f134i = length;
        }
        this.f126a++;
        if (!this.f136k) {
            this.f135j++;
        }
        if (this.f135j >= this.f131f.length) {
            this.f136k = true;
            this.f135j = this.f131f.length - 1;
        }
    }

    /* JADX INFO: renamed from: b */
    final boolean m29b(C0016g c0016g) {
        if (this.f134i == -1) {
            return false;
        }
        int i = this.f134i;
        for (int i2 = 0; i != -1 && i2 < this.f126a; i2++) {
            if (this.f131f[i] == c0016g.f306a) {
                return true;
            }
            i = this.f132g[i];
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final float m30c(C0016g c0016g) {
        int i = this.f134i;
        for (int i2 = 0; i != -1 && i2 < this.f126a; i2++) {
            if (this.f131f[i] == c0016g.f306a) {
                return this.f133h[i];
            }
            i = this.f132g[i];
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: c */
    C0016g m31c() {
        int i = this.f134i;
        C0016g c0016g = null;
        C0016g c0016g2 = null;
        for (int i2 = 0; i != -1 && i2 < this.f126a; i2++) {
            float f = this.f133h[i];
            if (f < 0.0f) {
                if (f > -0.001f) {
                    this.f133h[i] = 0.0f;
                    f = 0.0f;
                }
            } else if (f < 0.001f) {
                this.f133h[i] = 0.0f;
                f = 0.0f;
            }
            if (f != 0.0f) {
                C0016g c0016g3 = this.f128c.f286c[this.f131f[i]];
                if (c0016g3.f311f == C0016g.a.UNRESTRICTED) {
                    if (f < 0.0f) {
                        return c0016g3;
                    }
                    if (c0016g == null) {
                        c0016g = c0016g3;
                    }
                } else if (f < 0.0f && (c0016g2 == null || c0016g3.f308c < c0016g2.f308c)) {
                    c0016g2 = c0016g3;
                }
            }
            i = this.f132g[i];
        }
        return c0016g != null ? c0016g : c0016g2;
    }

    public String toString() {
        String str = "";
        int i = this.f134i;
        for (int i2 = 0; i != -1 && i2 < this.f126a; i2++) {
            str = ((str + " -> ") + this.f133h[i] + " : ") + this.f128c.f286c[this.f131f[i]];
            i = this.f132g[i];
        }
        return str;
    }
}
