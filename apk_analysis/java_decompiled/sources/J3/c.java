package J3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new H3.b(18);

    /* renamed from: a, reason: collision with root package name */
    public final long f4182a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4183b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4184c;

    public c(long j, long j4, int i9) {
        boolean z9;
        if (j < j4) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        this.f4182a = j;
        this.f4183b = j4;
        this.f4184c = i9;
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
            if (this.f4182a == cVar.f4182a && this.f4183b == cVar.f4183b && this.f4184c == cVar.f4184c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4182a), Long.valueOf(this.f4183b), Integer.valueOf(this.f4184c)});
    }

    public final String toString() {
        int i9 = y.f20553a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.f4182a + ", endTimeMs=" + this.f4183b + ", speedDivisor=" + this.f4184c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.f4182a);
        parcel.writeLong(this.f4183b);
        parcel.writeInt(this.f4184c);
    }
}
