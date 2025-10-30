package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000u implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0936h f15599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.messaging.s f15600b;

    public C1000u(AbstractC0936h abstractC0936h, com.google.firebase.messaging.s sVar) {
        this.f15599a = abstractC0936h;
        this.f15600b = sVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC0966n interfaceC0966n = (InterfaceC0966n) obj;
        InterfaceC0966n interfaceC0966n2 = (InterfaceC0966n) obj2;
        if (interfaceC0966n instanceof r) {
            if (interfaceC0966n2 instanceof r) {
                return 0;
            }
            return 1;
        }
        if (interfaceC0966n2 instanceof r) {
            return -1;
        }
        AbstractC0936h abstractC0936h = this.f15599a;
        if (abstractC0936h == null) {
            return interfaceC0966n.c().compareTo(interfaceC0966n2.c());
        }
        return (int) s8.n.Q(abstractC0936h.a(this.f15600b, Arrays.asList(interfaceC0966n, interfaceC0966n2)).b().doubleValue());
    }
}
