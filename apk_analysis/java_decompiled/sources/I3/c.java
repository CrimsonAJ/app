package I3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import l4.y;

/* loaded from: classes.dex */
public final class c extends j {
    public static final Parcelable.Creator<c> CREATOR = new H3.b(6);

    /* renamed from: b, reason: collision with root package name */
    public final String f3486b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3487c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3488d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3489e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3490f;

    /* renamed from: g, reason: collision with root package name */
    public final j[] f3491g;

    public c(String str, int i9, int i10, long j, long j4, j[] jVarArr) {
        super("CHAP");
        this.f3486b = str;
        this.f3487c = i9;
        this.f3488d = i10;
        this.f3489e = j;
        this.f3490f = j4;
        this.f3491g = jVarArr;
    }

    @Override // I3.j, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f3487c == cVar.f3487c && this.f3488d == cVar.f3488d && this.f3489e == cVar.f3489e && this.f3490f == cVar.f3490f && y.a(this.f3486b, cVar.f3486b) && Arrays.equals(this.f3491g, cVar.f3491g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = (((((((527 + this.f3487c) * 31) + this.f3488d) * 31) + ((int) this.f3489e)) * 31) + ((int) this.f3490f)) * 31;
        String str = this.f3486b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3486b);
        parcel.writeInt(this.f3487c);
        parcel.writeInt(this.f3488d);
        parcel.writeLong(this.f3489e);
        parcel.writeLong(this.f3490f);
        j[] jVarArr = this.f3491g;
        parcel.writeInt(jVarArr.length);
        for (j jVar : jVarArr) {
            parcel.writeParcelable(jVar, 0);
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f3486b = readString;
        this.f3487c = parcel.readInt();
        this.f3488d = parcel.readInt();
        this.f3489e = parcel.readLong();
        this.f3490f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f3491g = new j[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.f3491g[i10] = (j) parcel.readParcelable(j.class.getClassLoader());
        }
    }
}
