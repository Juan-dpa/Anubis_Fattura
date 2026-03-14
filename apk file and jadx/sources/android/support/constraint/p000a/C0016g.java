package android.support.constraint.p000a;

import java.util.Arrays;

/* JADX INFO: renamed from: android.support.constraint.a.g */
/* JADX INFO: loaded from: classes.dex */
public class C0016g {

    /* JADX INFO: renamed from: i */
    private static int f305i = 1;

    /* JADX INFO: renamed from: d */
    public float f309d;

    /* JADX INFO: renamed from: f */
    a f311f;

    /* JADX INFO: renamed from: j */
    private String f314j;

    /* JADX INFO: renamed from: a */
    public int f306a = -1;

    /* JADX INFO: renamed from: b */
    int f307b = -1;

    /* JADX INFO: renamed from: c */
    public int f308c = 0;

    /* JADX INFO: renamed from: e */
    float[] f310e = new float[6];

    /* JADX INFO: renamed from: g */
    C0011b[] f312g = new C0011b[8];

    /* JADX INFO: renamed from: h */
    int f313h = 0;

    /* JADX INFO: renamed from: android.support.constraint.a.g$a */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C0016g(a aVar) {
        this.f311f = aVar;
    }

    /* JADX INFO: renamed from: a */
    void m207a() {
        for (int i = 0; i < 6; i++) {
            this.f310e[i] = 0.0f;
        }
    }

    /* JADX INFO: renamed from: a */
    void m208a(C0011b c0011b) {
        for (int i = 0; i < this.f313h; i++) {
            if (this.f312g[i] == c0011b) {
                return;
            }
        }
        if (this.f313h >= this.f312g.length) {
            this.f312g = (C0011b[]) Arrays.copyOf(this.f312g, this.f312g.length * 2);
        }
        this.f312g[this.f313h] = c0011b;
        this.f313h++;
    }

    /* JADX INFO: renamed from: a */
    public void m209a(a aVar) {
        this.f311f = aVar;
    }

    /* JADX INFO: renamed from: b */
    String m210b() {
        StringBuilder sb;
        String str;
        String string = this + "[";
        for (int i = 0; i < this.f310e.length; i++) {
            String str2 = string + this.f310e[i];
            if (i < this.f310e.length - 1) {
                sb = new StringBuilder();
                sb.append(str2);
                str = ", ";
            } else {
                sb = new StringBuilder();
                sb.append(str2);
                str = "] ";
            }
            sb.append(str);
            string = sb.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: b */
    void m211b(C0011b c0011b) {
        for (int i = 0; i < this.f313h; i++) {
            if (this.f312g[i] == c0011b) {
                for (int i2 = 0; i2 < (this.f313h - i) - 1; i2++) {
                    int i3 = i + i2;
                    this.f312g[i3] = this.f312g[i3 + 1];
                }
                this.f313h--;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m212c() {
        this.f314j = null;
        this.f311f = a.UNKNOWN;
        this.f308c = 0;
        this.f306a = -1;
        this.f307b = -1;
        this.f309d = 0.0f;
        this.f313h = 0;
    }

    public String toString() {
        return "" + this.f314j;
    }
}
