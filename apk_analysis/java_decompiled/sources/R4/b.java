package R4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class b implements d, IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final IBinder f6660e;

    public b(IBinder iBinder) {
        this.f6660e = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6660e;
    }

    public final Parcel d(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f6660e.transact(i9, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e8) {
                obtain.recycle();
                throw e8;
            }
        } finally {
            parcel.recycle();
        }
    }
}
