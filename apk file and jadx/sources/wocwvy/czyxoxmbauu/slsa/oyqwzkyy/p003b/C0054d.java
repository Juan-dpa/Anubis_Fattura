package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Locale;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.d */
/* JADX INFO: loaded from: classes.dex */
class C0054d extends C0051a {
    public static final Parcelable.Creator<C0054d> CREATOR = new Parcelable.Creator<C0054d>() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.d.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0054d createFromParcel(Parcel parcel) {
            return new C0054d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0054d[] newArray(int i) {
            return new C0054d[i];
        }
    };

    /* JADX INFO: renamed from: c */
    C0020b f505c;

    /* JADX INFO: renamed from: d */
    public final ArrayList<C0056f> f506d;

    private C0054d(Parcel parcel) {
        super(parcel);
        this.f505c = new C0020b();
        this.f506d = parcel.createTypedArrayList(C0056f.CREATOR);
    }

    private C0054d(String str) {
        super(str);
        this.f505c = new C0020b();
        String[] strArrSplit = this.f499b.split(Character.toString('\n'));
        this.f506d = new ArrayList<>();
        for (String str2 : strArrSplit) {
            try {
                this.f506d.add(new C0056f(str2));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0054d m314a(int i) {
        new C0020b();
        return new C0054d(String.format(Locale.ENGLISH, "/proc/%d/cgroup", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: b */
    public C0056f m315b(String str) {
        for (C0056f c0056f : this.f506d) {
            for (String str2 : c0056f.f510c.split(",")) {
                if (str2.equals(str)) {
                    return c0056f;
                }
            }
        }
        return null;
    }

    @Override // wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b.C0051a, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f506d);
    }
}
