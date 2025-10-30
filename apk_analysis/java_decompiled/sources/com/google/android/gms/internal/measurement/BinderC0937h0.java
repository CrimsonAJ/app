package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import q6.C1917b;

/* renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0937h0 extends AbstractBinderC1015x implements Q {

    /* renamed from: e, reason: collision with root package name */
    public final C1917b f15496e;

    public BinderC0937h0(C1917b c1917b) {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
        this.f15496e = c1917b;
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final int c() {
        return System.identityHashCode(this.f15496e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractBinderC1015x
    public final boolean d(int i9, Parcel parcel, Parcel parcel2) {
        if (i9 != 1) {
            if (i9 != 2) {
                return false;
            }
            int identityHashCode = System.identityHashCode(this.f15496e);
            parcel2.writeNoException();
            parcel2.writeInt(identityHashCode);
            return true;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        Bundle bundle = (Bundle) AbstractC1020y.a(parcel, Bundle.CREATOR);
        long readLong = parcel.readLong();
        AbstractC1020y.b(parcel);
        t0(readLong, bundle, readString, readString2);
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.Q
    public final void t0(long j, Bundle bundle, String str, String str2) {
        this.f15496e.a(j, bundle, str, str2);
    }
}
