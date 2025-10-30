package I3;

import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import java.util.Arrays;
import l4.y;

/* loaded from: classes.dex */
public final class a extends j {
    public static final Parcelable.Creator<a> CREATOR = new H3.b(4);

    /* renamed from: b, reason: collision with root package name */
    public final String f3481b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3482c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3483d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f3484e;

    public a(String str, String str2, int i9, byte[] bArr) {
        super("APIC");
        this.f3481b = str;
        this.f3482c = str2;
        this.f3483d = i9;
        this.f3484e = bArr;
    }

    @Override // I3.j, D3.b
    public final void b(C1444a0 c1444a0) {
        c1444a0.a(this.f3483d, this.f3484e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f3483d == aVar.f3483d && y.a(this.f3481b, aVar.f3481b) && y.a(this.f3482c, aVar.f3482c) && Arrays.equals(this.f3484e, aVar.f3484e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = (527 + this.f3483d) * 31;
        int i11 = 0;
        String str = this.f3481b;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (i10 + i9) * 31;
        String str2 = this.f3482c;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.f3484e) + ((i12 + i11) * 31);
    }

    @Override // I3.j
    public final String toString() {
        return this.f3509a + ": mimeType=" + this.f3481b + ", description=" + this.f3482c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f3481b);
        parcel.writeString(this.f3482c);
        parcel.writeInt(this.f3483d);
        parcel.writeByteArray(this.f3484e);
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f3481b = readString;
        this.f3482c = parcel.readString();
        this.f3483d = parcel.readInt();
        this.f3484e = parcel.createByteArray();
    }
}
