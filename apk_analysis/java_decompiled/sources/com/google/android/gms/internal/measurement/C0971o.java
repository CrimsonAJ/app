package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0971o implements InterfaceC0966n {

    /* renamed from: a, reason: collision with root package name */
    public final String f15556a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f15557b;

    public C0971o(String str, ArrayList arrayList) {
        this.f15556a = str;
        ArrayList arrayList2 = new ArrayList();
        this.f15557b = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Double b() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final String c() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0971o)) {
            return false;
        }
        C0971o c0971o = (C0971o) obj;
        String str = this.f15556a;
        if (str == null ? c0971o.f15556a != null : !str.equals(c0971o.f15556a)) {
            return false;
        }
        return this.f15557b.equals(c0971o.f15557b);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n f() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n g(String str, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    public final int hashCode() {
        int i9;
        String str = this.f15556a;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        return this.f15557b.hashCode() + (i9 * 31);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Boolean o() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
}
