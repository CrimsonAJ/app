package S4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6928e;

    /* renamed from: f, reason: collision with root package name */
    public final IBinder f6929f;

    /* renamed from: g, reason: collision with root package name */
    public final String f6930g;

    public /* synthetic */ a(IBinder iBinder, String str, int i9) {
        this.f6928e = i9;
        this.f6929f = iBinder;
        this.f6930g = str;
    }

    public Parcel Q() {
        switch (this.f6928e) {
            case 2:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f6930g);
                return obtain;
            case 3:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f6930g);
                return obtain2;
            default:
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken(this.f6930g);
                return obtain3;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f6928e) {
            case 0:
                return this.f6929f;
            case 1:
                return this.f6929f;
            case 2:
                return this.f6929f;
            case 3:
                return this.f6929f;
            default:
                return this.f6929f;
        }
    }

    public void d(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6929f.transact(i9, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public Parcel f1(Parcel parcel, int i9) {
        switch (this.f6928e) {
            case 3:
                Parcel obtain = Parcel.obtain();
                try {
                    try {
                        this.f6929f.transact(i9, parcel, obtain, 0);
                        obtain.readException();
                        return obtain;
                    } finally {
                    }
                } catch (RuntimeException e8) {
                    obtain.recycle();
                    throw e8;
                }
            default:
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.f6929f.transact(i9, parcel, obtain2, 0);
                        obtain2.readException();
                        return obtain2;
                    } catch (RuntimeException e9) {
                        obtain2.recycle();
                        throw e9;
                    }
                } finally {
                }
        }
    }

    public Parcel g(Parcel parcel, int i9) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f6929f.transact(i9, parcel, obtain, 0);
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

    public void g1(Parcel parcel, int i9) {
        Parcel obtain;
        switch (this.f6928e) {
            case 3:
                obtain = Parcel.obtain();
                try {
                    this.f6929f.transact(i9, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
            default:
                obtain = Parcel.obtain();
                try {
                    this.f6929f.transact(i9, parcel, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                }
        }
    }

    public void h1(Parcel parcel) {
        try {
            this.f6929f.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    public void i1(Parcel parcel, int i9) {
        try {
            this.f6929f.transact(i9, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
