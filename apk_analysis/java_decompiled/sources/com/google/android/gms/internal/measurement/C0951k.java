package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0951k implements InterfaceC0966n, InterfaceC0946j {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15511a = new HashMap();

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Double b() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final String c() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0946j
    public final boolean d(String str) {
        return this.f15511a.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final Iterator e() {
        return new C0941i(this.f15511a.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0951k)) {
            return false;
        }
        return this.f15511a.equals(((C0951k) obj).f15511a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n f() {
        C0951k c0951k = new C0951k();
        for (Map.Entry entry : this.f15511a.entrySet()) {
            boolean z9 = entry.getValue() instanceof InterfaceC0946j;
            HashMap hashMap = c0951k.f15511a;
            if (z9) {
                hashMap.put((String) entry.getKey(), (InterfaceC0966n) entry.getValue());
            } else {
                hashMap.put((String) entry.getKey(), ((InterfaceC0966n) entry.getValue()).f());
            }
        }
        return c0951k;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0966n
    public InterfaceC0966n g(String str, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new C0981q(toString());
        }
        return Y1.I(this, new C0981q(str), sVar, arrayList);
    }

    public final int hashCode() {
        return this.f15511a.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0946j
    public final InterfaceC0966n i(String str) {
        HashMap hashMap = this.f15511a;
        if (hashMap.containsKey(str)) {
            return (InterfaceC0966n) hashMap.get(str);
        }
        return InterfaceC0966n.f15543N;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0946j
    public final void k(String str, InterfaceC0966n interfaceC0966n) {
        HashMap hashMap = this.f15511a;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap hashMap = this.f15511a;
        if (!hashMap.isEmpty()) {
            for (String str : hashMap.keySet()) {
                sb.append(String.format("%s: %s,", str, hashMap.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
