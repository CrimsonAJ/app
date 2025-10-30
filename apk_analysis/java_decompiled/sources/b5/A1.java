package b5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class A1 extends G4.a {
    public static final Parcelable.Creator<A1> CREATOR = new android.support.v4.media.a(10);

    /* renamed from: a, reason: collision with root package name */
    public final long f10549a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f10550b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10551c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f10552d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10553e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10554f;

    /* renamed from: g, reason: collision with root package name */
    public String f10555g;

    public A1(long j, byte[] bArr, String str, Bundle bundle, int i9, long j4, String str2) {
        this.f10549a = j;
        this.f10550b = bArr;
        this.f10551c = str;
        this.f10552d = bundle;
        this.f10553e = i9;
        this.f10554f = j4;
        this.f10555g = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 8);
        parcel.writeLong(this.f10549a);
        s8.n.G(parcel, 2, this.f10550b);
        s8.n.M(parcel, 3, this.f10551c);
        s8.n.F(parcel, 4, this.f10552d);
        s8.n.V(parcel, 5, 4);
        parcel.writeInt(this.f10553e);
        s8.n.V(parcel, 6, 8);
        parcel.writeLong(this.f10554f);
        s8.n.M(parcel, 7, this.f10555g);
        s8.n.U(parcel, R2);
    }
}
