package S4;

import D4.E;
import S5.o;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class c extends Binder implements IInterface {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6932e;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i9 = this.f6932e;
        return this;
    }

    public abstract boolean f1(int i9, Parcel parcel, Parcel parcel2);

    public boolean g1(int i9, Parcel parcel, Parcel parcel2) {
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x001a. Please report as an issue. */
    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        switch (this.f6932e) {
            case 0:
                if (i9 > 16777215) {
                    if (super.onTransact(i9, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return f1(i9, parcel, parcel2);
            case 1:
                if (i9 > 16777215) {
                    if (super.onTransact(i9, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return g1(i9, parcel, parcel2);
            case 2:
                if (i9 > 16777215) {
                    if (super.onTransact(i9, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return g1(i9, parcel, parcel2);
            default:
                if (i9 > 16777215) {
                    if (super.onTransact(i9, parcel, parcel2, i10)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                switch (i9) {
                    case 3:
                        T4.a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        T4.a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                    case 5:
                    default:
                        return false;
                    case 6:
                        T4.a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        T4.a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        d5.e eVar = (d5.e) T4.a.a(parcel, d5.e.CREATOR);
                        T4.a.b(parcel);
                        E e8 = (E) this;
                        e8.f1812g.post(new o(e8, eVar, 7, false));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        T4.a.b(parcel);
                        parcel2.writeNoException();
                        return true;
                }
        }
    }

    public c(String str, int i9) {
        this.f6932e = i9;
        switch (i9) {
            case 1:
                attachInterface(this, str);
                return;
            case 2:
                attachInterface(this, str);
                return;
            default:
                attachInterface(this, str);
                return;
        }
    }
}
