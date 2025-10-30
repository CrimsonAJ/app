package F4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class r extends G4.a {
    public static final Parcelable.Creator<r> CREATOR = new A1.a(13);

    /* renamed from: a, reason: collision with root package name */
    public final int f2443a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f2444b;

    /* renamed from: c, reason: collision with root package name */
    public final B4.b f2445c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2446d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2447e;

    public r(int i9, IBinder iBinder, B4.b bVar, boolean z9, boolean z10) {
        this.f2443a = i9;
        this.f2444b = iBinder;
        this.f2445c = bVar;
        this.f2446d = z9;
        this.f2447e = z10;
    }

    public final boolean equals(Object obj) {
        Object aVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof r) {
                    r rVar = (r) obj;
                    if (this.f2445c.equals(rVar.f2445c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.f2444b;
                        if (iBinder == null) {
                            aVar = null;
                        } else {
                            int i9 = AbstractBinderC0122a.f2366f;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof InterfaceC0130i) {
                                aVar = (InterfaceC0130i) queryLocalInterface;
                            } else {
                                aVar = new S4.a(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                            }
                        }
                        IBinder iBinder2 = rVar.f2444b;
                        if (iBinder2 != null) {
                            int i10 = AbstractBinderC0122a.f2366f;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof InterfaceC0130i) {
                                obj2 = (InterfaceC0130i) queryLocalInterface2;
                            } else {
                                obj2 = new S4.a(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 2);
                            }
                        }
                        if (y.k(aVar, obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 4);
        parcel.writeInt(this.f2443a);
        s8.n.H(parcel, 2, this.f2444b);
        s8.n.L(parcel, 3, this.f2445c, i9);
        s8.n.V(parcel, 4, 4);
        parcel.writeInt(this.f2446d ? 1 : 0);
        s8.n.V(parcel, 5, 4);
        parcel.writeInt(this.f2447e ? 1 : 0);
        s8.n.U(parcel, R2);
    }
}
