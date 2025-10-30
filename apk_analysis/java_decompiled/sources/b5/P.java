package b5;

import F4.AbstractC0126e;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class P extends AbstractC0126e {
    @Override // F4.AbstractC0126e, C4.c
    public final int f() {
        return 12451000;
    }

    @Override // F4.AbstractC0126e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof G) {
            return (G) queryLocalInterface;
        }
        return new F(iBinder);
    }

    @Override // F4.AbstractC0126e
    public final String v() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // F4.AbstractC0126e
    public final String w() {
        return "com.google.android.gms.measurement.START";
    }
}
