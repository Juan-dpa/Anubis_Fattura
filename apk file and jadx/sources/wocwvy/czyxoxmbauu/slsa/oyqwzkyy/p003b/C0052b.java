package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0052b extends C0051a {
    public static final Parcelable.Creator<C0052b> CREATOR = new Parcelable.Creator<C0052b>() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.b.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0052b createFromParcel(Parcel parcel) {
            return new C0052b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0052b[] newArray(int i) {
            return new C0052b[i];
        }
    };

    /* JADX INFO: renamed from: c */
    C0020b f500c;

    /* JADX INFO: renamed from: d */
    private final String[] f501d;

    private C0052b(Parcel parcel) {
        super(parcel);
        this.f500c = new C0020b();
        this.f501d = parcel.createStringArray();
    }

    private C0052b(String str) {
        super(str);
        this.f500c = new C0020b();
        this.f501d = this.f499b.split("\\s+");
    }

    /* JADX INFO: renamed from: a */
    public static C0052b m303a(int i) {
        new C0020b();
        return new C0052b(String.format(Locale.ENGLISH, "/proc/%d/stat", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: a */
    public String m304a() {
        new C0020b();
        return this.f501d[1].replace("(", "").replace(")", "");
    }

    /* JADX INFO: renamed from: b */
    public int m305b() {
        return Integer.parseInt(this.f501d[40]);
    }

    @Override // wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b.C0051a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.f501d);
    }
}
