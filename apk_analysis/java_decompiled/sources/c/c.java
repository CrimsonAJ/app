package c;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c extends Binder implements b {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f11549f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f11550e;

    public c(d dVar) {
        this.f11550e = dVar;
        attachInterface(this, b.f11548d);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        Object obj;
        String str = b.f11548d;
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
        int readInt = parcel.readInt();
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() != 0) {
            obj = creator.createFromParcel(parcel);
        } else {
            obj = null;
        }
        this.f11550e.a(readInt, (Bundle) obj);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
