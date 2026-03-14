package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
import java.util.regex.Pattern;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.g */
/* JADX INFO: loaded from: classes.dex */
public class C0057g extends C0053c {
    public static final Parcelable.Creator<C0057g> CREATOR = new Parcelable.Creator<C0057g>() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.g.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0057g createFromParcel(Parcel parcel) {
            return new C0057g(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0057g[] newArray(int i) {
            return new C0057g[i];
        }
    };

    /* JADX INFO: renamed from: d */
    C0020b f512d;

    /* JADX INFO: renamed from: e */
    public final boolean f513e;

    /* JADX INFO: renamed from: f */
    public final int f514f;

    /* JADX INFO: renamed from: g */
    private final boolean f515g;

    /* JADX INFO: renamed from: h */
    private final Pattern f516h;

    /* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.g$a */
    public static final class a extends Exception {
        public a(int i) {
            super(Integer.toString(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0057g(int i) throws a {
        C0055e c0055eC;
        int i2;
        int iM319a;
        boolean z;
        String strSubstring;
        super(i);
        this.f512d = new C0020b();
        this.f515g = new File("/dev/cpuctl/tasks").exists();
        this.f516h = Pattern.compile("^([A-Za-z]{1}[A-Za-z0-9_]*[\\.|:])*[A-Za-z][A-Za-z0-9_]*$");
        if (this.f503b == null || !this.f516h.matcher(this.f503b).matches() || !new File("/data/data", m323d()).exists()) {
            throw new a(i);
        }
        if (this.f515g) {
            C0054d c0054dA = m309a();
            C0056f c0056fM315b = c0054dA.m315b("cpuacct");
            C0056f c0056fM315b2 = c0054dA.m315b("cpu");
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    if (c0056fM315b2 == null || c0056fM315b == null || !c0056fM315b.f511d.contains("pid_")) {
                        throw new a(i);
                    }
                    int i3 = !c0056fM315b2.f511d.contains("bg_non_interactive");
                    strSubstring = c0056fM315b.f511d.split("/")[1].replace("uid_", "");
                    i = i3;
                } else {
                    if (c0056fM315b2 == null || c0056fM315b == null || !c0056fM315b2.f511d.contains("apps")) {
                        throw new a(i);
                    }
                    int i4 = !c0056fM315b2.f511d.contains("bg_non_interactive");
                    strSubstring = c0056fM315b.f511d.substring(c0056fM315b.f511d.lastIndexOf("/") + 1);
                    i = i4;
                }
                iM319a = Integer.parseInt(strSubstring);
                z = i;
            } catch (Exception unused) {
                c0055eC = m311c();
                i2 = i;
                iM319a = c0055eC.m319a();
                z = i2;
            }
            this.f513e = z;
            this.f514f = iM319a;
        }
        C0052b c0052bB = m310b();
        c0055eC = m311c();
        i2 = c0052bB.m305b() == 0 ? 1 : 0;
        iM319a = c0055eC.m319a();
        z = i2;
        this.f513e = z;
        this.f514f = iM319a;
    }

    protected C0057g(Parcel parcel) {
        super(parcel);
        this.f512d = new C0020b();
        this.f515g = new File("/dev/cpuctl/tasks").exists();
        this.f516h = Pattern.compile("^([A-Za-z]{1}[A-Za-z0-9_]*[\\.|:])*[A-Za-z][A-Za-z0-9_]*$");
        this.f513e = parcel.readByte() != 0;
        this.f514f = parcel.readInt();
    }

    /* JADX INFO: renamed from: d */
    public String m323d() {
        return this.f503b.split(":")[0];
    }

    @Override // wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b.C0053c, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f513e ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f514f);
    }
}
