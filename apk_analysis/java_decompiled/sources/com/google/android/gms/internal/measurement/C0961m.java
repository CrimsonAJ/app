package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0961m extends AbstractC0936h {

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f15537c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f15538d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.firebase.messaging.s f15539e;

    public C0961m(C0961m c0961m) {
        super(c0961m.f15494a);
        ArrayList arrayList = new ArrayList(c0961m.f15537c.size());
        this.f15537c = arrayList;
        arrayList.addAll(c0961m.f15537c);
        ArrayList arrayList2 = new ArrayList(c0961m.f15538d.size());
        this.f15538d = arrayList2;
        arrayList2.addAll(c0961m.f15538d);
        this.f15539e = c0961m.f15539e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0936h
    public final InterfaceC0966n a(com.google.firebase.messaging.s sVar, List list) {
        r rVar;
        com.google.firebase.messaging.s y9 = this.f15539e.y();
        int i9 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f15537c;
            int size = arrayList.size();
            rVar = InterfaceC0966n.f15543N;
            if (i10 >= size) {
                break;
            }
            if (i10 < list.size()) {
                y9.E((String) arrayList.get(i10), ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) list.get(i10)));
            } else {
                y9.E((String) arrayList.get(i10), rVar);
            }
            i10++;
        }
        ArrayList arrayList2 = this.f15538d;
        int size2 = arrayList2.size();
        while (i9 < size2) {
            Object obj = arrayList2.get(i9);
            i9++;
            InterfaceC0966n interfaceC0966n = (InterfaceC0966n) obj;
            C0995t c0995t = (C0995t) y9.f16505c;
            InterfaceC0966n a5 = c0995t.a(y9, interfaceC0966n);
            if (a5 instanceof C0971o) {
                a5 = c0995t.a(y9, interfaceC0966n);
            }
            if (a5 instanceof C0926f) {
                return ((C0926f) a5).f15480a;
            }
        }
        return rVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0936h, com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n f() {
        return new C0961m(this);
    }

    public C0961m(String str, ArrayList arrayList, List list, com.google.firebase.messaging.s sVar) {
        super(str);
        this.f15537c = new ArrayList();
        this.f15539e = sVar;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                this.f15537c.add(((InterfaceC0966n) obj).c());
            }
        }
        this.f15538d = new ArrayList(list);
    }
}
