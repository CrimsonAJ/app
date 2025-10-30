package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class K extends S4.a implements L {
    public K(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 4);
    }

    @Override // com.google.android.gms.internal.measurement.L
    public final void v0(Bundle bundle) {
        Parcel Q7 = Q();
        AbstractC1020y.c(Q7, bundle);
        g1(Q7, 1);
    }
}
