package F4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class u implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f2454e;

    public u(IBinder iBinder) {
        this.f2454e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2454e;
    }

    public final void d(B b9, C0128g c0128g) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(b9);
            obtain.writeInt(1);
            A1.a.a(c0128g, obtain, 0);
            this.f2454e.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
