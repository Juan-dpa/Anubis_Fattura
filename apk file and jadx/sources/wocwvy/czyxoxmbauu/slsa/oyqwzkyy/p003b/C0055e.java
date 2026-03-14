package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b;

import java.util.Locale;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.e */
/* JADX INFO: loaded from: classes.dex */
public class C0055e extends C0051a {

    /* JADX INFO: renamed from: c */
    C0020b f507c;

    private C0055e(String str) {
        super(str);
        this.f507c = new C0020b();
    }

    /* JADX INFO: renamed from: a */
    public static C0055e m318a(int i) {
        new C0020b();
        return new C0055e(String.format(Locale.ENGLISH, "/proc/%d/status", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: a */
    public int m319a() {
        new C0020b();
        try {
            return Integer.parseInt(m320b("Uid").split("\\s+")[0]);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: b */
    public String m320b(String str) {
        new C0020b();
        for (String str2 : this.f499b.split("\n")) {
            if (str2.startsWith(str + ":")) {
                return str2.split(str + ":")[1].trim();
            }
        }
        return null;
    }
}
