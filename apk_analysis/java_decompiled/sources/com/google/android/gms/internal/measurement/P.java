package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class P extends S4.a implements Q {
    public P(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 4);
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final int c() {
        Parcel f12 = f1(Q(), 2);
        int readInt = f12.readInt();
        f12.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final void t0(long j, Bundle bundle, String str, String str2) {
        Parcel Q7 = Q();
        Q7.writeString(str);
        Q7.writeString(str2);
        AbstractC1020y.c(Q7, bundle);
        Q7.writeLong(j);
        g1(Q7, 1);
    }
}
