package F4;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: F4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131j extends G4.a {
    public static final Parcelable.Creator<C0131j> CREATOR = new A1.a(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f2413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2414b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2415c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2416d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2417e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2418f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2419g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2420h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2421i;

    public C0131j(int i9, int i10, int i11, long j, long j4, String str, String str2, int i12, int i13) {
        this.f2413a = i9;
        this.f2414b = i10;
        this.f2415c = i11;
        this.f2416d = j;
        this.f2417e = j4;
        this.f2418f = str;
        this.f2419g = str2;
        this.f2420h = i12;
        this.f2421i = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 4);
        parcel.writeInt(this.f2413a);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f2414b);
        s8.n.V(parcel, 3, 4);
        parcel.writeInt(this.f2415c);
        s8.n.V(parcel, 4, 8);
        parcel.writeLong(this.f2416d);
        s8.n.V(parcel, 5, 8);
        parcel.writeLong(this.f2417e);
        s8.n.M(parcel, 6, this.f2418f);
        s8.n.M(parcel, 7, this.f2419g);
        s8.n.V(parcel, 8, 4);
        parcel.writeInt(this.f2420h);
        s8.n.V(parcel, 9, 4);
        parcel.writeInt(this.f2421i);
        s8.n.U(parcel, R2);
    }
}
