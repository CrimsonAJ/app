package G3;

import A4.r;
import O5.e;
import android.os.Parcel;
import android.os.Parcelable;
import j3.C1444a0;
import j3.M;
import java.util.Arrays;
import l4.y;
import u0.z;

/* loaded from: classes.dex */
public final class a implements D3.b {
    public static final Parcelable.Creator<a> CREATOR = new A1.a(19);

    /* renamed from: a, reason: collision with root package name */
    public final int f2853a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2854b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2855c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2856d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2857e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2858f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2859g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f2860h;

    public a(int i9, String str, String str2, int i10, int i11, int i12, int i13, byte[] bArr) {
        this.f2853a = i9;
        this.f2854b = str;
        this.f2855c = str2;
        this.f2856d = i10;
        this.f2857e = i11;
        this.f2858f = i12;
        this.f2859g = i13;
        this.f2860h = bArr;
    }

    public static a a(r rVar) {
        int i9 = rVar.i();
        String v8 = rVar.v(rVar.i(), e.f5489a);
        String v9 = rVar.v(rVar.i(), e.f5491c);
        int i10 = rVar.i();
        int i11 = rVar.i();
        int i12 = rVar.i();
        int i13 = rVar.i();
        int i14 = rVar.i();
        byte[] bArr = new byte[i14];
        rVar.h(bArr, 0, i14);
        return new a(i9, v8, v9, i10, i11, i12, i13, bArr);
    }

    @Override // D3.b
    public final void b(C1444a0 c1444a0) {
        c1444a0.a(this.f2853a, this.f2860h);
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f2853a == aVar.f2853a && this.f2854b.equals(aVar.f2854b) && this.f2855c.equals(aVar.f2855c) && this.f2856d == aVar.f2856d && this.f2857e == aVar.f2857e && this.f2858f == aVar.f2858f && this.f2859g == aVar.f2859g && Arrays.equals(this.f2860h, aVar.f2860h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2860h) + ((((((((z.c(this.f2855c, z.c(this.f2854b, (527 + this.f2853a) * 31, 31), 31) + this.f2856d) * 31) + this.f2857e) * 31) + this.f2858f) * 31) + this.f2859g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f2854b + ", description=" + this.f2855c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.f2853a);
        parcel.writeString(this.f2854b);
        parcel.writeString(this.f2855c);
        parcel.writeInt(this.f2856d);
        parcel.writeInt(this.f2857e);
        parcel.writeInt(this.f2858f);
        parcel.writeInt(this.f2859g);
        parcel.writeByteArray(this.f2860h);
    }

    public a(Parcel parcel) {
        this.f2853a = parcel.readInt();
        String readString = parcel.readString();
        int i9 = y.f20553a;
        this.f2854b = readString;
        this.f2855c = parcel.readString();
        this.f2856d = parcel.readInt();
        this.f2857e = parcel.readInt();
        this.f2858f = parcel.readInt();
        this.f2859g = parcel.readInt();
        this.f2860h = parcel.createByteArray();
    }
}
