package D3;

import B6.u0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final b[] f1786a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1787b;

    public c(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f1786a, cVar.f1786a) && this.f1787b == cVar.f1787b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return u0.A(this.f1787b) + (Arrays.hashCode(this.f1786a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f1786a));
        long j = this.f1787b;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        b[] bVarArr = this.f1786a;
        parcel.writeInt(bVarArr.length);
        for (b bVar : bVarArr) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f1787b);
    }

    public c(long j, b... bVarArr) {
        this.f1787b = j;
        this.f1786a = bVarArr;
    }

    public c(List list) {
        this((b[]) list.toArray(new b[0]));
    }

    public c(Parcel parcel) {
        this.f1786a = new b[parcel.readInt()];
        int i9 = 0;
        while (true) {
            b[] bVarArr = this.f1786a;
            if (i9 < bVarArr.length) {
                bVarArr[i9] = (b) parcel.readParcelable(b.class.getClassLoader());
                i9++;
            } else {
                this.f1787b = parcel.readLong();
                return;
            }
        }
    }
}
