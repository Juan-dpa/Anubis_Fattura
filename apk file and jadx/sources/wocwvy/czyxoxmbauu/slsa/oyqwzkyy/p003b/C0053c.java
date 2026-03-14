package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.c */
/* JADX INFO: loaded from: classes.dex */
public class C0053c implements Parcelable {
    public static final Parcelable.Creator<C0053c> CREATOR = new Parcelable.Creator<C0053c>() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.c.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0053c createFromParcel(Parcel parcel) {
            return new C0053c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0053c[] newArray(int i) {
            return new C0053c[i];
        }
    };

    /* JADX INFO: renamed from: a */
    C0020b f502a = new C0020b();

    /* JADX INFO: renamed from: b */
    public final String f503b;

    /* JADX INFO: renamed from: c */
    public final int f504c;

    public C0053c(int i) {
        this.f504c = i;
        this.f503b = m308a(i);
    }

    protected C0053c(Parcel parcel) {
        this.f503b = parcel.readString();
        this.f504c = parcel.readInt();
    }

    /* JADX INFO: renamed from: a */
    private String m308a(int i) throws IOException {
        String strTrim;
        try {
            strTrim = C0051a.m300a(String.format(Locale.ENGLISH, "/proc/%d/cmdline", Integer.valueOf(i))).trim();
        } catch (IOException unused) {
            strTrim = null;
        }
        if (!TextUtils.isEmpty(strTrim)) {
            return strTrim;
        }
        try {
            return C0052b.m303a(i).m304a();
        } catch (Exception unused2) {
            throw new IOException(String.format(Locale.ENGLISH, "Error reading /proc/%d/stat", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: a */
    public C0054d m309a() {
        return C0054d.m314a(this.f504c);
    }

    /* JADX INFO: renamed from: b */
    public C0052b m310b() {
        return C0052b.m303a(this.f504c);
    }

    /* JADX INFO: renamed from: c */
    public C0055e m311c() {
        return C0055e.m318a(this.f504c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f503b);
        parcel.writeInt(this.f504c);
    }
}
