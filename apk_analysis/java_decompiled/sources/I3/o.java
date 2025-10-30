package I3;

import android.os.Parcel;
import android.os.Parcelable;
import l4.y;
import u0.z;

/* loaded from: classes.dex */
public final class o extends j {
    public static final Parcelable.Creator<o> CREATOR = new H3.b(14);

    /* renamed from: b, reason: collision with root package name */
    public final String f3522b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3523c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f3522b = str2;
        this.f3523c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f3509a.equals(oVar.f3509a) && y.a(this.f3522b, oVar.f3522b) && y.a(this.f3523c, oVar.f3523c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int c3 = z.c(this.f3509a, 527, 31);
        int i10 = 0;
        String str = this.f3522b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i11 = (c3 + i9) * 31;
        String str2 = this.f3523c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return i11 + i10;
    }

    @Override // I3.j
    public final String toString() {
        return this.f3509a + ": url=" + this.f3523c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3509a);
        parcel.writeString(this.f3522b);
        parcel.writeString(this.f3523c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = l4.y.f20553a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f3522b = r0
            java.lang.String r3 = r3.readString()
            r2.f3523c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.o.<init>(android.os.Parcel):void");
    }
}
