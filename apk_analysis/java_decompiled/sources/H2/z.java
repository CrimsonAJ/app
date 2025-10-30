package H2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new A1.a(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f3094a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3095b;

    public z(int i9, int i10) {
        this.f3094a = i9;
        this.f3095b = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (this.f3094a == zVar.f3094a && this.f3095b == zVar.f3095b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f3094a * 31) + this.f3095b;
    }

    public final String toString() {
        return "Vote(score=" + this.f3094a + ", count=" + this.f3095b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.h.e(dest, "dest");
        dest.writeInt(this.f3094a);
        dest.writeInt(this.f3095b);
    }
}
