package S3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.C1444a0;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class u implements D3.b {
    public static final Parcelable.Creator<u> CREATOR = new s(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f6917a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6918b;

    /* renamed from: c, reason: collision with root package name */
    public final List f6919c;

    public u(String str, String str2, List list) {
        this.f6917a = str;
        this.f6918b = str2;
        this.f6919c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // D3.b
    public final /* synthetic */ void b(C1444a0 c1444a0) {
    }

    @Override // D3.b
    public final /* synthetic */ M c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // D3.b
    public final /* synthetic */ byte[] e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u.class == obj.getClass()) {
            u uVar = (u) obj;
            if (TextUtils.equals(this.f6917a, uVar.f6917a) && TextUtils.equals(this.f6918b, uVar.f6918b) && this.f6919c.equals(uVar.f6919c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = 0;
        String str = this.f6917a;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = i9 * 31;
        String str2 = this.f6918b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.f6919c.hashCode() + ((i11 + i10) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f6917a;
        if (str2 != null) {
            str = AbstractC0953k1.q(AbstractC0953k1.r(" [", str2, ", "), this.f6918b, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f6917a);
        parcel.writeString(this.f6918b);
        List list = this.f6919c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeParcelable((Parcelable) list.get(i10), 0);
        }
    }

    public u(Parcel parcel) {
        this.f6917a = parcel.readString();
        this.f6918b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add((t) parcel.readParcelable(t.class.getClassLoader()));
        }
        this.f6919c = Collections.unmodifiableList(arrayList);
    }
}
