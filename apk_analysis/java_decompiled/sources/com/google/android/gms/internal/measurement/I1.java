package com.google.android.gms.internal.measurement;

import b5.C0635i0;
import b5.CallableC0632h0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class I1 extends AbstractC0936h {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15222c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final Object f15223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I1(O0.c cVar) {
        super("getValue");
        this.f15223d = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0936h
    public final InterfaceC0966n a(com.google.firebase.messaging.s sVar, List list) {
        HashMap hashMap;
        Object obj;
        String str;
        int i9;
        TreeMap treeMap;
        switch (this.f15222c) {
            case 0:
                s8.n.a0(3, this.f15494a, list);
                String c3 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) list.get(0)).c();
                InterfaceC0966n interfaceC0966n = (InterfaceC0966n) list.get(1);
                C0995t c0995t = (C0995t) sVar.f16505c;
                long Q7 = (long) s8.n.Q(c0995t.a(sVar, interfaceC0966n).b().doubleValue());
                InterfaceC0966n a5 = c0995t.a(sVar, (InterfaceC0966n) list.get(2));
                if (a5 instanceof C0951k) {
                    hashMap = s8.n.Z((C0951k) a5);
                } else {
                    hashMap = new HashMap();
                }
                b5.G1 g12 = (b5.G1) this.f15223d;
                g12.getClass();
                HashMap hashMap2 = new HashMap();
                for (String str2 : hashMap.keySet()) {
                    HashMap hashMap3 = ((C0906b) g12.f10717b).f15445c;
                    if (hashMap3.containsKey(str2)) {
                        obj = hashMap3.get(str2);
                    } else {
                        obj = null;
                    }
                    hashMap2.put(str2, C0906b.b(obj, hashMap.get(str2), str2));
                }
                ((ArrayList) g12.f10719d).add(new C0906b(c3, Q7, hashMap2));
                return InterfaceC0966n.f15543N;
            case 1:
                s8.n.a0(2, "getValue", list);
                InterfaceC0966n a9 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) list.get(0));
                InterfaceC0966n a10 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) list.get(1));
                String c9 = a9.c();
                O0.c cVar = (O0.c) this.f15223d;
                Map map = (Map) ((C0635i0) cVar.f5264c).f11140d.get((String) cVar.f5263b);
                if (map != null && map.containsKey(c9)) {
                    str = (String) map.get(c9);
                } else {
                    str = null;
                }
                if (str != null) {
                    return new C0981q(str);
                }
                return a10;
            case 2:
                return InterfaceC0966n.f15543N;
            case 3:
                try {
                    return v4.e.Z(((CallableC0632h0) this.f15223d).call());
                } catch (Exception unused) {
                    return InterfaceC0966n.f15543N;
                }
            default:
                s8.n.a0(3, this.f15494a, list);
                ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) list.get(0)).c();
                InterfaceC0966n interfaceC0966n2 = (InterfaceC0966n) list.get(1);
                C0995t c0995t2 = (C0995t) sVar.f16505c;
                InterfaceC0966n a11 = c0995t2.a(sVar, interfaceC0966n2);
                if (a11 instanceof C0961m) {
                    InterfaceC0966n a12 = c0995t2.a(sVar, (InterfaceC0966n) list.get(2));
                    if (a12 instanceof C0951k) {
                        C0951k c0951k = (C0951k) a12;
                        if (c0951k.f15511a.containsKey("type")) {
                            String c10 = c0951k.i("type").c();
                            if (c0951k.f15511a.containsKey("priority")) {
                                i9 = s8.n.T(c0951k.i("priority").b().doubleValue());
                            } else {
                                i9 = 1000;
                            }
                            C0961m c0961m = (C0961m) a11;
                            C0995t c0995t3 = (C0995t) this.f15223d;
                            c0995t3.getClass();
                            if ("create".equals(c10)) {
                                treeMap = (TreeMap) c0995t3.f15594b;
                            } else if ("edit".equals(c10)) {
                                treeMap = (TreeMap) c0995t3.f15593a;
                            } else {
                                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(c10)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(i9))) {
                                i9 = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(i9), c0961m);
                            return InterfaceC0966n.f15543N;
                        }
                        throw new IllegalArgumentException("Undefined rule type");
                    }
                    throw new IllegalArgumentException("Invalid callback params");
                }
                throw new IllegalArgumentException("Invalid callback type");
        }
    }

    public I1(CallableC0632h0 callableC0632h0) {
        super("internal.appMetadata");
        this.f15223d = callableC0632h0;
    }

    public I1(b5.G1 g12) {
        super("internal.eventLogger");
        this.f15223d = g12;
    }

    public I1(C0995t c0995t) {
        super("internal.registerCallback");
        this.f15223d = c0995t;
    }

    public I1(s4.i iVar) {
        super("internal.logger");
        this.f15223d = iVar;
        this.f15495b.put("log", new o4(this, false, true));
        this.f15495b.put("silent", new C0979p2("silent", 1));
        ((AbstractC0936h) this.f15495b.get("silent")).k("log", new o4(this, true, true));
        this.f15495b.put("unmonitored", new C0979p2("unmonitored", 2));
        ((AbstractC0936h) this.f15495b.get("unmonitored")).k("log", new o4(this, false, false));
    }
}
