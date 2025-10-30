package G0;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: G0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0139e implements InterfaceC0140f {

    /* renamed from: e, reason: collision with root package name */
    public IBinder f2762e;

    @Override // G0.InterfaceC0140f
    public final void M0(int i9, String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0140f.f2763b);
            obtain.writeInt(i9);
            obtain.writeStringArray(strArr);
            this.f2762e.transact(3, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // G0.InterfaceC0140f
    public final int X(InterfaceC0138d interfaceC0138d, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0140f.f2763b);
            obtain.writeStrongInterface(interfaceC0138d);
            obtain.writeString(str);
            this.f2762e.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2762e;
    }

    @Override // G0.InterfaceC0140f
    public final void i0(InterfaceC0138d interfaceC0138d, int i9) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0140f.f2763b);
            obtain.writeStrongInterface(interfaceC0138d);
            obtain.writeInt(i9);
            this.f2762e.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
