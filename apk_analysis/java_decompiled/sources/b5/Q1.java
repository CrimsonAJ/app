package b5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class Q1 extends G4.a {
    public static final Parcelable.Creator<Q1> CREATOR = new android.support.v4.media.a(14);

    /* renamed from: A, reason: collision with root package name */
    public final String f10895A;

    /* renamed from: B, reason: collision with root package name */
    public final int f10896B;

    /* renamed from: C, reason: collision with root package name */
    public final long f10897C;

    /* renamed from: D, reason: collision with root package name */
    public final String f10898D;

    /* renamed from: X, reason: collision with root package name */
    public final String f10899X;
    public final long Y;

    /* renamed from: Z, reason: collision with root package name */
    public final int f10900Z;

    /* renamed from: a, reason: collision with root package name */
    public final String f10901a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10902b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10903c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10904d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10905e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10906f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10907g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10908h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10909i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10910k;

    /* renamed from: l, reason: collision with root package name */
    public final long f10911l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10912m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f10913n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f10914o;

    /* renamed from: p, reason: collision with root package name */
    public final String f10915p;

    /* renamed from: q, reason: collision with root package name */
    public final Boolean f10916q;

    /* renamed from: r, reason: collision with root package name */
    public final long f10917r;

    /* renamed from: s, reason: collision with root package name */
    public final List f10918s;

    /* renamed from: t, reason: collision with root package name */
    public final String f10919t;

    /* renamed from: u, reason: collision with root package name */
    public final String f10920u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10921v;

    /* renamed from: w, reason: collision with root package name */
    public final String f10922w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f10923x;

    /* renamed from: y, reason: collision with root package name */
    public final long f10924y;

    /* renamed from: z, reason: collision with root package name */
    public final int f10925z;

    public Q1(String str, String str2, String str3, long j, String str4, long j4, long j9, String str5, boolean z9, boolean z10, String str6, long j10, int i9, boolean z11, boolean z12, String str7, Boolean bool, long j11, List list, String str8, String str9, String str10, String str11, boolean z13, long j12, int i10, String str12, int i11, long j13, String str13, String str14, long j14, int i12) {
        F4.y.e(str);
        this.f10901a = str;
        this.f10902b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f10903c = str3;
        this.j = j;
        this.f10904d = str4;
        this.f10905e = j4;
        this.f10906f = j9;
        this.f10907g = str5;
        this.f10908h = z9;
        this.f10909i = z10;
        this.f10910k = str6;
        this.f10911l = j10;
        this.f10912m = i9;
        this.f10913n = z11;
        this.f10914o = z12;
        this.f10915p = str7;
        this.f10916q = bool;
        this.f10917r = j11;
        this.f10918s = list;
        this.f10919t = str8;
        this.f10920u = str9;
        this.f10921v = str10;
        this.f10922w = str11;
        this.f10923x = z13;
        this.f10924y = j12;
        this.f10925z = i10;
        this.f10895A = str12;
        this.f10896B = i11;
        this.f10897C = j13;
        this.f10898D = str13;
        this.f10899X = str14;
        this.Y = j14;
        this.f10900Z = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f10901a);
        s8.n.M(parcel, 3, this.f10902b);
        s8.n.M(parcel, 4, this.f10903c);
        s8.n.M(parcel, 5, this.f10904d);
        s8.n.V(parcel, 6, 8);
        parcel.writeLong(this.f10905e);
        s8.n.V(parcel, 7, 8);
        parcel.writeLong(this.f10906f);
        s8.n.M(parcel, 8, this.f10907g);
        s8.n.V(parcel, 9, 4);
        parcel.writeInt(this.f10908h ? 1 : 0);
        s8.n.V(parcel, 10, 4);
        parcel.writeInt(this.f10909i ? 1 : 0);
        s8.n.V(parcel, 11, 8);
        parcel.writeLong(this.j);
        s8.n.M(parcel, 12, this.f10910k);
        s8.n.V(parcel, 14, 8);
        parcel.writeLong(this.f10911l);
        s8.n.V(parcel, 15, 4);
        parcel.writeInt(this.f10912m);
        s8.n.V(parcel, 16, 4);
        parcel.writeInt(this.f10913n ? 1 : 0);
        s8.n.V(parcel, 18, 4);
        parcel.writeInt(this.f10914o ? 1 : 0);
        s8.n.M(parcel, 19, this.f10915p);
        s8.n.E(parcel, 21, this.f10916q);
        s8.n.V(parcel, 22, 8);
        parcel.writeLong(this.f10917r);
        s8.n.N(parcel, 23, this.f10918s);
        s8.n.M(parcel, 24, this.f10919t);
        s8.n.M(parcel, 25, this.f10920u);
        s8.n.M(parcel, 26, this.f10921v);
        s8.n.M(parcel, 27, this.f10922w);
        s8.n.V(parcel, 28, 4);
        parcel.writeInt(this.f10923x ? 1 : 0);
        s8.n.V(parcel, 29, 8);
        parcel.writeLong(this.f10924y);
        s8.n.V(parcel, 30, 4);
        parcel.writeInt(this.f10925z);
        s8.n.M(parcel, 31, this.f10895A);
        s8.n.V(parcel, 32, 4);
        parcel.writeInt(this.f10896B);
        s8.n.V(parcel, 34, 8);
        parcel.writeLong(this.f10897C);
        s8.n.M(parcel, 35, this.f10898D);
        s8.n.M(parcel, 36, this.f10899X);
        s8.n.V(parcel, 37, 8);
        parcel.writeLong(this.Y);
        s8.n.V(parcel, 38, 4);
        parcel.writeInt(this.f10900Z);
        s8.n.U(parcel, R2);
    }

    public Q1(String str, String str2, String str3, String str4, long j, long j4, String str5, boolean z9, boolean z10, long j9, String str6, long j10, int i9, boolean z11, boolean z12, String str7, Boolean bool, long j11, ArrayList arrayList, String str8, String str9, String str10, String str11, boolean z13, long j12, int i10, String str12, int i11, long j13, String str13, String str14, long j14, int i12) {
        this.f10901a = str;
        this.f10902b = str2;
        this.f10903c = str3;
        this.j = j9;
        this.f10904d = str4;
        this.f10905e = j;
        this.f10906f = j4;
        this.f10907g = str5;
        this.f10908h = z9;
        this.f10909i = z10;
        this.f10910k = str6;
        this.f10911l = j10;
        this.f10912m = i9;
        this.f10913n = z11;
        this.f10914o = z12;
        this.f10915p = str7;
        this.f10916q = bool;
        this.f10917r = j11;
        this.f10918s = arrayList;
        this.f10919t = str8;
        this.f10920u = str9;
        this.f10921v = str10;
        this.f10922w = str11;
        this.f10923x = z13;
        this.f10924y = j12;
        this.f10925z = i10;
        this.f10895A = str12;
        this.f10896B = i11;
        this.f10897C = j13;
        this.f10898D = str13;
        this.f10899X = str14;
        this.Y = j14;
        this.f10900Z = i12;
    }
}
