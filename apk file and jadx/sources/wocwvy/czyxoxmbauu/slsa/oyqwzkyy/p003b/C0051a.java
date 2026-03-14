package wocwvy.czyxoxmbauu.slsa.oyqwzkyy.p003b;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import wocwvy.czyxoxmbauu.slsa.C0020b;

/* JADX INFO: renamed from: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.a */
/* JADX INFO: loaded from: classes.dex */
public class C0051a extends File implements Parcelable {
    public static final Parcelable.Creator<C0051a> CREATOR = new Parcelable.Creator<C0051a>() { // from class: wocwvy.czyxoxmbauu.slsa.oyqwzkyy.b.a.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0051a createFromParcel(Parcel parcel) {
            return new C0051a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0051a[] newArray(int i) {
            return new C0051a[i];
        }
    };

    /* JADX INFO: renamed from: a */
    C0020b f498a;

    /* JADX INFO: renamed from: b */
    public final String f499b;

    protected C0051a(Parcel parcel) {
        super(parcel.readString());
        this.f498a = new C0020b();
        this.f499b = parcel.readString();
    }

    protected C0051a(String str) {
        super(str);
        this.f498a = new C0020b();
        this.f499b = m300a(str);
    }

    /* JADX INFO: renamed from: a */
    static String m300a(String str) throws Throwable {
        BufferedReader bufferedReader;
        StringBuilder sb;
        try {
            sb = new StringBuilder();
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            String string = "";
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(string);
                sb.append(line);
                string = Character.toString('\n');
            }
            String string2 = sb.toString();
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
            }
            return string2;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.io.File
    public long length() {
        return this.f499b.length();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getAbsolutePath());
        parcel.writeString(this.f499b);
    }
}
