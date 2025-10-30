package M3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b implements Comparable, Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new H3.b(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f4778a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4779b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4780c;

    public b() {
        this.f4778a = -1;
        this.f4779b = -1;
        this.f4780c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        int i9 = this.f4778a - bVar.f4778a;
        if (i9 == 0) {
            int i10 = this.f4779b - bVar.f4779b;
            if (i10 == 0) {
                return this.f4780c - bVar.f4780c;
            }
            return i10;
        }
        return i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f4778a == bVar.f4778a && this.f4779b == bVar.f4779b && this.f4780c == bVar.f4780c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f4778a * 31) + this.f4779b) * 31) + this.f4780c;
    }

    public final String toString() {
        return this.f4778a + "." + this.f4779b + "." + this.f4780c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f4778a);
        parcel.writeInt(this.f4779b);
        parcel.writeInt(this.f4780c);
    }

    public b(Parcel parcel) {
        this.f4778a = parcel.readInt();
        this.f4779b = parcel.readInt();
        this.f4780c = parcel.readInt();
    }
}
