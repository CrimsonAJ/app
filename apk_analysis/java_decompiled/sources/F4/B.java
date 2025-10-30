package F4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* loaded from: classes.dex */
public final class B extends S4.c {

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0126e f2330f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2331g;

    public B(AbstractC0126e abstractC0126e, int i9) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 1);
        this.f2330f = abstractC0126e;
        this.f2331g = i9;
    }

    @Override // S4.c
    public final boolean g1(int i9, Parcel parcel, Parcel parcel2) {
        C0133l c0133l;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                F f9 = (F) V4.a.a(parcel, F.CREATOR);
                V4.a.b(parcel);
                AbstractC0126e abstractC0126e = this.f2330f;
                y.i(abstractC0126e, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                y.h(f9);
                abstractC0126e.f2389w = f9;
                if (abstractC0126e.A()) {
                    C0127f c0127f = f9.f2340d;
                    C0132k c3 = C0132k.c();
                    if (c0127f == null) {
                        c0133l = null;
                    } else {
                        c0133l = c0127f.f2391a;
                    }
                    synchronized (c3) {
                        if (c0133l == null) {
                            c0133l = C0132k.f2423c;
                        } else {
                            C0133l c0133l2 = (C0133l) c3.f2424a;
                            if (c0133l2 != null) {
                                if (c0133l2.f2425a < c0133l.f2425a) {
                                }
                            }
                        }
                        c3.f2424a = c0133l;
                    }
                }
                Bundle bundle = f9.f2337a;
                y.i(this.f2330f, "onPostInitComplete can be called only once per call to getRemoteService");
                this.f2330f.z(readInt, readStrongBinder, bundle, this.f2331g);
                this.f2330f = null;
            } else {
                parcel.readInt();
                V4.a.b(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Bundle bundle2 = (Bundle) V4.a.a(parcel, Bundle.CREATOR);
            V4.a.b(parcel);
            y.i(this.f2330f, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f2330f.z(readInt2, readStrongBinder2, bundle2, this.f2331g);
            this.f2330f = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
