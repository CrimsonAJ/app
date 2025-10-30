package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0936h implements InterfaceC0966n, InterfaceC0946j {

    /* renamed from: a, reason: collision with root package name */
    public final String f15494a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f15495b = new HashMap();

    public AbstractC0936h(String str) {
        this.f15494a = str;
    }

    public abstract InterfaceC0966n a(com.google.firebase.messaging.s sVar, List list);

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final String c() {
        return this.f15494a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0946j
    public final boolean d(String str) {
        return this.f15495b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Iterator e() {
        return new C0941i(this.f15495b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC0936h)) {
            return false;
        }
        AbstractC0936h abstractC0936h = (AbstractC0936h) obj;
        String str = this.f15494a;
        if (str == null) {
            return false;
        }
        return str.equals(abstractC0936h.f15494a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public InterfaceC0966n f() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n g(String str, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C0981q(this.f15494a);
        }
        return Y1.I(this, new C0981q(str), sVar, arrayList);
    }

    public final int hashCode() {
        String str = this.f15494a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0946j
    public final InterfaceC0966n i(String str) {
        HashMap hashMap = this.f15495b;
        if (hashMap.containsKey(str)) {
            return (InterfaceC0966n) hashMap.get(str);
        }
        return InterfaceC0966n.f15543N;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0946j
    public final void k(String str, InterfaceC0966n interfaceC0966n) {
        HashMap hashMap = this.f15495b;
        if (interfaceC0966n == null) {
            hashMap.remove(str);
        } else {
            hashMap.put(str, interfaceC0966n);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Boolean o() {
        return Boolean.TRUE;
    }
}
