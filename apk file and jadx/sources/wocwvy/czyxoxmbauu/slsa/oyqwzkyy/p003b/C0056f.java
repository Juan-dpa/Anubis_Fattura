package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.f */
/* JADX INFO: loaded from: classes.dex */
public class C0056f implements Parcelable {
    public static final Parcelable.Creator<C0056f> CREATOR = new Parcelable.Creator<C0056f>() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.f.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0056f createFromParcel(Parcel parcel) {
            return new C0056f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0056f[] newArray(int i) {
            return new C0056f[i];
        }
    };

    /* JADX INFO: renamed from: a */
    C0020b f508a = new C0020b();

    /* JADX INFO: renamed from: b */
    public final int f509b;

    /* JADX INFO: renamed from: c */
    public final String f510c;

    /* JADX INFO: renamed from: d */
    public final String f511d;

    protected C0056f(Parcel parcel) {
        this.f509b = parcel.readInt();
        this.f510c = parcel.readString();
        this.f511d = parcel.readString();
    }

    protected C0056f(String str) {
        String[] strArrSplit = str.split(Character.toString(':'));
        this.f509b = Integer.parseInt(strArrSplit[0]);
        this.f510c = strArrSplit[1];
        this.f511d = strArrSplit[2];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "%d:%s:%s", Integer.valueOf(this.f509b), this.f510c, this.f511d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f509b);
        parcel.writeString(this.f510c);
        parcel.writeString(this.f511d);
    }
}
