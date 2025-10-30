package G0;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: G0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0147m extends Binder implements InterfaceC0138d {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0149o f2784e;

    public BinderC0147m(C0149o c0149o) {
        this.f2784e = c0149o;
        attachInterface(this, InterfaceC0138d.f2761a);
    }

    @Override // G0.InterfaceC0138d
    public final void O(String[] tables) {
        kotlin.jvm.internal.h.e(tables, "tables");
        C0149o c0149o = this.f2784e;
        Y7.B.r(c0149o.f2790d, null, new C0146l(tables, c0149o, null), 3);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        String str = InterfaceC0138d.f2761a;
        if (i9 >= 1 && i9 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i9 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i9 != 1) {
            return super.onTransact(i9, parcel, parcel2, i10);
        }
        O(parcel.createStringArray());
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
