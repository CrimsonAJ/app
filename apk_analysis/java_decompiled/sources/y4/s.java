package y4;

import F4.AbstractC0129h;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class s extends AbstractC0129h {
    @Override // F4.AbstractC0126e, C4.c
    public final int f() {
        return 12451000;
    }

    @Override // F4.AbstractC0126e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof j) {
            return (j) queryLocalInterface;
        }
        return new S4.a(iBinder, "com.google.android.gms.cast.internal.ICastService", 3);
    }

    @Override // F4.AbstractC0126e
    public final B4.d[] q() {
        return t4.v.f23274e;
    }

    @Override // F4.AbstractC0126e
    public final String v() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    @Override // F4.AbstractC0126e
    public final String w() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
