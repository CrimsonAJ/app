package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class p4 extends AbstractC0936h {

    /* renamed from: c, reason: collision with root package name */
    public final C0974o2 f15570c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15571d;

    public p4(C0974o2 c0974o2) {
        super("require");
        this.f15571d = new HashMap();
        this.f15570c = c0974o2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0936h
    public final InterfaceC0966n a(com.google.firebase.messaging.s sVar, List list) {
        InterfaceC0966n interfaceC0966n;
        s8.n.a0(1, "require", list);
        String c3 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) list.get(0)).c();
        HashMap hashMap = this.f15571d;
        if (hashMap.containsKey(c3)) {
            return (InterfaceC0966n) hashMap.get(c3);
        }
        HashMap hashMap2 = (HashMap) this.f15570c.f15559a;
        if (hashMap2.containsKey(c3)) {
            try {
                interfaceC0966n = (InterfaceC0966n) ((Callable) hashMap2.get(c3)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(c3)));
            }
        } else {
            interfaceC0966n = InterfaceC0966n.f15543N;
        }
        if (interfaceC0966n instanceof AbstractC0936h) {
            hashMap.put(c3, (AbstractC0936h) interfaceC0966n);
        }
        return interfaceC0966n;
    }
}
