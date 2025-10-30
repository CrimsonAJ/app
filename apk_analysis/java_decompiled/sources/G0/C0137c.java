package G0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: G0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137c implements InterfaceC0138d {

    /* renamed from: e, reason: collision with root package name */
    public IBinder f2760e;

    @Override // G0.InterfaceC0138d
    public final void O(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0138d.f2761a);
            obtain.writeStringArray(strArr);
            this.f2760e.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2760e;
    }
}
