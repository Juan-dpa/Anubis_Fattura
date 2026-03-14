package android.support.constraint.p000a.p001a;

import android.support.constraint.p000a.p001a.C0003a;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.constraint.a.a.g */
/* JADX INFO: loaded from: classes.dex */
public class C0009g {

    /* JADX INFO: renamed from: a */
    private int f268a;

    /* JADX INFO: renamed from: b */
    private int f269b;

    /* JADX INFO: renamed from: c */
    private int f270c;

    /* JADX INFO: renamed from: d */
    private int f271d;

    /* JADX INFO: renamed from: e */
    private ArrayList<a> f272e = new ArrayList<>();

    /* JADX INFO: renamed from: android.support.constraint.a.a.g$a */
    static class a {

        /* JADX INFO: renamed from: a */
        private C0003a f273a;

        /* JADX INFO: renamed from: b */
        private C0003a f274b;

        /* JADX INFO: renamed from: c */
        private int f275c;

        /* JADX INFO: renamed from: d */
        private C0003a.b f276d;

        /* JADX INFO: renamed from: e */
        private int f277e;

        public a(C0003a c0003a) {
            this.f273a = c0003a;
            this.f274b = c0003a.m43f();
            this.f275c = c0003a.m41d();
            this.f276d = c0003a.m42e();
            this.f277e = c0003a.m45h();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public void m145a(C0004b c0004b) {
            int iM45h;
            this.f273a = c0004b.mo53a(this.f273a.m40c());
            if (this.f273a != null) {
                this.f274b = this.f273a.m43f();
                this.f275c = this.f273a.m41d();
                this.f276d = this.f273a.m42e();
                iM45h = this.f273a.m45h();
            } else {
                this.f274b = null;
                iM45h = 0;
                this.f275c = 0;
                this.f276d = C0003a.b.STRONG;
            }
            this.f277e = iM45h;
        }

        /* JADX INFO: renamed from: b */
        public void m146b(C0004b c0004b) {
            c0004b.mo53a(this.f273a.m40c()).m38a(this.f274b, this.f275c, this.f276d, this.f277e);
        }
    }

    public C0009g(C0004b c0004b) {
        this.f268a = c0004b.m84f();
        this.f269b = c0004b.m86g();
        this.f270c = c0004b.m88h();
        this.f271d = c0004b.m96l();
        ArrayList<C0003a> arrayListMo110y = c0004b.mo110y();
        int size = arrayListMo110y.size();
        for (int i = 0; i < size; i++) {
            this.f272e.add(new a(arrayListMo110y.get(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    public void m143a(C0004b c0004b) {
        this.f268a = c0004b.m84f();
        this.f269b = c0004b.m86g();
        this.f270c = c0004b.m88h();
        this.f271d = c0004b.m96l();
        int size = this.f272e.size();
        for (int i = 0; i < size; i++) {
            this.f272e.get(i).m145a(c0004b);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m144b(C0004b c0004b) {
        c0004b.m68b(this.f268a);
        c0004b.m76c(this.f269b);
        c0004b.m80d(this.f270c);
        c0004b.m83e(this.f271d);
        int size = this.f272e.size();
        for (int i = 0; i < size; i++) {
            this.f272e.get(i).m146b(c0004b);
        }
    }
}
