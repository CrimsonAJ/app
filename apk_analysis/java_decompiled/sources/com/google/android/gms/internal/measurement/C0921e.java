package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0921e implements InterfaceC0966n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f15466a;

    public C0921e(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.f15466a = booleanValue;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Double b() {
        double d9;
        if (true != this.f15466a) {
            d9 = 0.0d;
        } else {
            d9 = 1.0d;
        }
        return Double.valueOf(d9);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final String c() {
        return Boolean.toString(this.f15466a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0921e) && this.f15466a == ((C0921e) obj).f15466a) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n f() {
        return new C0921e(Boolean.valueOf(this.f15466a));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n g(String str, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        boolean equals = "toString".equals(str);
        boolean z9 = this.f15466a;
        if (equals) {
            return new C0981q(Boolean.toString(z9));
        }
        throw new IllegalArgumentException(Boolean.toString(z9) + "." + str + " is not a function.");
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f15466a).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Boolean o() {
        return Boolean.valueOf(this.f15466a);
    }

    public final String toString() {
        return String.valueOf(this.f15466a);
    }
}
