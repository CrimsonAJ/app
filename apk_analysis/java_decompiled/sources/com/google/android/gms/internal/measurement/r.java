package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements InterfaceC0966n {
    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final String c() {
        return "undefined";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof r;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n f() {
        return InterfaceC0966n.f15543N;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n g(String str, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Boolean o() {
        return Boolean.FALSE;
    }
}
