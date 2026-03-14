package android.support.constraint.p000a.p001a;

import android.support.constraint.p000a.C0012c;
import java.util.ArrayList;

/* JADX INFO: renamed from: android.support.constraint.a.a.h */
/* JADX INFO: loaded from: classes.dex */
public class C0010h extends C0004b {

    /* JADX INFO: renamed from: aj */
    protected ArrayList<C0004b> f278aj = new ArrayList<>();

    /* JADX INFO: renamed from: F */
    public void mo121F() {
        mo111z();
        if (this.f278aj == null) {
            return;
        }
        int size = this.f278aj.size();
        for (int i = 0; i < size; i++) {
            C0004b c0004b = this.f278aj.get(i);
            if (c0004b instanceof C0010h) {
                ((C0010h) c0004b).mo121F();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public C0005c m147H() {
        C0004b c0004bM74c = m74c();
        C0005c c0005c = this instanceof C0005c ? (C0005c) this : null;
        while (c0004bM74c != null) {
            C0004b c0004bM74c2 = c0004bM74c.m74c();
            if (c0004bM74c instanceof C0005c) {
                c0005c = (C0005c) c0004bM74c;
            }
            c0004bM74c = c0004bM74c2;
        }
        return c0005c;
    }

    /* JADX INFO: renamed from: I */
    public void m148I() {
        this.f278aj.clear();
    }

    @Override // android.support.constraint.p000a.p001a.C0004b
    /* JADX INFO: renamed from: a */
    public void mo54a() {
        this.f278aj.clear();
        super.mo54a();
    }

    @Override // android.support.constraint.p000a.p001a.C0004b
    /* JADX INFO: renamed from: a */
    public void mo63a(C0012c c0012c) {
        super.mo63a(c0012c);
        int size = this.f278aj.size();
        for (int i = 0; i < size; i++) {
            this.f278aj.get(i).mo63a(c0012c);
        }
    }

    @Override // android.support.constraint.p000a.p001a.C0004b
    /* JADX INFO: renamed from: b */
    public void mo69b(int i, int i2) {
        super.mo69b(i, i2);
        int size = this.f278aj.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f278aj.get(i3).mo69b(m103r(), m104s());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m149b(C0004b c0004b) {
        this.f278aj.add(c0004b);
        if (c0004b.m74c() != null) {
            ((C0010h) c0004b.m74c()).m150c(c0004b);
        }
        c0004b.m62a((C0004b) this);
    }

    /* JADX INFO: renamed from: c */
    public void m150c(C0004b c0004b) {
        this.f278aj.remove(c0004b);
        c0004b.m62a((C0004b) null);
    }

    @Override // android.support.constraint.p000a.p001a.C0004b
    /* JADX INFO: renamed from: z */
    public void mo111z() {
        super.mo111z();
        if (this.f278aj == null) {
            return;
        }
        int size = this.f278aj.size();
        for (int i = 0; i < size; i++) {
            C0004b c0004b = this.f278aj.get(i);
            c0004b.mo69b(m99n(), m100o());
            if (!(c0004b instanceof C0005c)) {
                c0004b.mo111z();
            }
        }
    }
}
