package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class S1 extends C0951k {

    /* renamed from: b, reason: collision with root package name */
    public final b5.G1 f15295b;

    public S1(b5.G1 g12) {
        this.f15295b = g12;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C0951k, com.google.android.gms.internal.measurement.InterfaceC0966n
    public final InterfaceC0966n g(String str, com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        char c3;
        S1 s1;
        Object obj;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c3 = 0;
                    s1 = this;
                    break;
                }
                c3 = 65535;
                s1 = this;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    s1 = this;
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                s1 = this;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    s1 = this;
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                s1 = this;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    s1 = this;
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                s1 = this;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c3 = 5;
                    s1 = this;
                    break;
                }
                c3 = 65535;
                s1 = this;
            case 1570616835:
                if (str.equals("setEventName")) {
                    s1 = this;
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                s1 = this;
                break;
            default:
                c3 = 65535;
                s1 = this;
                break;
        }
        b5.G1 g12 = s1.f15295b;
        if (c3 != 0) {
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        if (c3 != 4) {
                            if (c3 != 5) {
                                return super.g(str, sVar, arrayList);
                            }
                            s8.n.a0(2, "setParamValue", arrayList);
                            String c9 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).c();
                            InterfaceC0966n a5 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(1));
                            C0906b c0906b = (C0906b) g12.f10718c;
                            Object Y = s8.n.Y(a5);
                            HashMap hashMap = c0906b.f15445c;
                            if (Y == null) {
                                hashMap.remove(c9);
                                return a5;
                            }
                            hashMap.put(c9, C0906b.b(hashMap.get(c9), Y, c9));
                            return a5;
                        }
                        s8.n.a0(1, "setEventName", arrayList);
                        InterfaceC0966n a9 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0));
                        if (!InterfaceC0966n.f15543N.equals(a9) && !InterfaceC0966n.f15544O.equals(a9)) {
                            ((C0906b) g12.f10718c).f15443a = a9.c();
                            return new C0981q(a9.c());
                        }
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    s8.n.a0(0, "getTimestamp", arrayList);
                    return new C0931g(Double.valueOf(((C0906b) g12.f10718c).f15444b));
                }
                s8.n.a0(0, "getParams", arrayList);
                HashMap hashMap2 = ((C0906b) g12.f10718c).f15445c;
                C0951k c0951k = new C0951k();
                for (String str2 : hashMap2.keySet()) {
                    c0951k.k(str2, v4.e.Z(hashMap2.get(str2)));
                }
                return c0951k;
            }
            s8.n.a0(1, "getParamValue", arrayList);
            String c10 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0)).c();
            HashMap hashMap3 = ((C0906b) g12.f10718c).f15445c;
            if (hashMap3.containsKey(c10)) {
                obj = hashMap3.get(c10);
            } else {
                obj = null;
            }
            return v4.e.Z(obj);
        }
        s8.n.a0(0, "getEventName", arrayList);
        return new C0981q(((C0906b) g12.f10718c).f15443a);
    }
}
