package b5;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: b5.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622e extends G4.a {
    public static final Parcelable.Creator<C0622e> CREATOR = new android.support.v4.media.a(5);

    /* renamed from: a, reason: collision with root package name */
    public String f11073a;

    /* renamed from: b, reason: collision with root package name */
    public String f11074b;

    /* renamed from: c, reason: collision with root package name */
    public M1 f11075c;

    /* renamed from: d, reason: collision with root package name */
    public long f11076d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11077e;

    /* renamed from: f, reason: collision with root package name */
    public String f11078f;

    /* renamed from: g, reason: collision with root package name */
    public final C0665t f11079g;

    /* renamed from: h, reason: collision with root package name */
    public long f11080h;

    /* renamed from: i, reason: collision with root package name */
    public C0665t f11081i;
    public final long j;

    /* renamed from: k, reason: collision with root package name */
    public final C0665t f11082k;

    public C0622e(C0622e c0622e) {
        F4.y.h(c0622e);
        this.f11073a = c0622e.f11073a;
        this.f11074b = c0622e.f11074b;
        this.f11075c = c0622e.f11075c;
        this.f11076d = c0622e.f11076d;
        this.f11077e = c0622e.f11077e;
        this.f11078f = c0622e.f11078f;
        this.f11079g = c0622e.f11079g;
        this.f11080h = c0622e.f11080h;
        this.f11081i = c0622e.f11081i;
        this.j = c0622e.j;
        this.f11082k = c0622e.f11082k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.M(parcel, 2, this.f11073a);
        s8.n.M(parcel, 3, this.f11074b);
        s8.n.L(parcel, 4, this.f11075c, i9);
        long j = this.f11076d;
        s8.n.V(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z9 = this.f11077e;
        s8.n.V(parcel, 6, 4);
        parcel.writeInt(z9 ? 1 : 0);
        s8.n.M(parcel, 7, this.f11078f);
        s8.n.L(parcel, 8, this.f11079g, i9);
        long j4 = this.f11080h;
        s8.n.V(parcel, 9, 8);
        parcel.writeLong(j4);
        s8.n.L(parcel, 10, this.f11081i, i9);
        s8.n.V(parcel, 11, 8);
        parcel.writeLong(this.j);
        s8.n.L(parcel, 12, this.f11082k, i9);
        s8.n.U(parcel, R2);
    }

    public C0622e(String str, String str2, M1 m12, long j, boolean z9, String str3, C0665t c0665t, long j4, C0665t c0665t2, long j9, C0665t c0665t3) {
        this.f11073a = str;
        this.f11074b = str2;
        this.f11075c = m12;
        this.f11076d = j;
        this.f11077e = z9;
        this.f11078f = str3;
        this.f11079g = c0665t;
        this.f11080h = j4;
        this.f11081i = c0665t2;
        this.j = j9;
        this.f11082k = c0665t3;
    }
}
