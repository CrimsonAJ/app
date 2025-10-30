package t4;

import android.os.Parcel;
import android.os.Parcelable;
import i5.C1381b;
import java.util.Arrays;

/* renamed from: t4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2013c extends G4.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f23165a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23166b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23167c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23168d;

    /* renamed from: e, reason: collision with root package name */
    public final long f23169e;

    /* renamed from: f, reason: collision with root package name */
    public static final y4.b f23164f = new y4.b("AdBreakStatus", null);
    public static final Parcelable.Creator<C2013c> CREATOR = new C1381b(19);

    public C2013c(long j, long j4, String str, String str2, long j9) {
        this.f23165a = j;
        this.f23166b = j4;
        this.f23167c = str;
        this.f23168d = str2;
        this.f23169e = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2013c)) {
            return false;
        }
        C2013c c2013c = (C2013c) obj;
        if (this.f23165a == c2013c.f23165a && this.f23166b == c2013c.f23166b && y4.a.e(this.f23167c, c2013c.f23167c) && y4.a.e(this.f23168d, c2013c.f23168d) && this.f23169e == c2013c.f23169e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f23165a), Long.valueOf(this.f23166b), this.f23167c, this.f23168d, Long.valueOf(this.f23169e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 2, 8);
        parcel.writeLong(this.f23165a);
        s8.n.V(parcel, 3, 8);
        parcel.writeLong(this.f23166b);
        s8.n.M(parcel, 4, this.f23167c);
        s8.n.M(parcel, 5, this.f23168d);
        s8.n.V(parcel, 6, 8);
        parcel.writeLong(this.f23169e);
        s8.n.U(parcel, R2);
    }
}
