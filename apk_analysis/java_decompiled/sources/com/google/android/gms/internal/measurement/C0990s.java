package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15577a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15578b;

    public C0990s(int i9) {
        this.f15578b = i9;
    }

    public static C0961m c(com.google.firebase.messaging.s sVar, ArrayList arrayList) {
        EnumC1010w enumC1010w = EnumC1010w.ADD;
        s8.n.b0(2, "FN", arrayList);
        InterfaceC0966n a5 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(0));
        InterfaceC0966n a9 = ((C0995t) sVar.f16505c).a(sVar, (InterfaceC0966n) arrayList.get(1));
        if (a9 instanceof C0916d) {
            ArrayList t7 = ((C0916d) a9).t();
            List arrayList2 = new ArrayList();
            if (arrayList.size() > 2) {
                arrayList2 = arrayList.subList(2, arrayList.size());
            }
            return new C0961m(a5.c(), t7, arrayList2, sVar);
        }
        throw new IllegalArgumentException(u0.z.e("FN requires an ArrayValue of parameter names found ", a9.getClass().getCanonicalName()));
    }

    public static InterfaceC0966n d(C1005v c1005v, Iterator it, InterfaceC0966n interfaceC0966n) {
        com.google.firebase.messaging.s y9;
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC0966n interfaceC0966n2 = (InterfaceC0966n) it.next();
                switch (c1005v.f15618a) {
                    case 0:
                        y9 = c1005v.f15619b.y();
                        String str = c1005v.f15620c;
                        y9.E(str, interfaceC0966n2);
                        ((HashMap) y9.f16507e).put(str, Boolean.TRUE);
                        break;
                    case 1:
                        y9 = c1005v.f15619b.y();
                        y9.E(c1005v.f15620c, interfaceC0966n2);
                        break;
                    default:
                        String str2 = c1005v.f15620c;
                        y9 = c1005v.f15619b;
                        y9.E(str2, interfaceC0966n2);
                        break;
                }
                InterfaceC0966n B9 = y9.B((C0916d) interfaceC0966n);
                if (B9 instanceof C0926f) {
                    C0926f c0926f = (C0926f) B9;
                    if ("break".equals(c0926f.f15481b)) {
                        return InterfaceC0966n.f15543N;
                    }
                    if ("return".equals(c0926f.f15481b)) {
                        return c0926f;
                    }
                }
            }
        }
        return InterfaceC0966n.f15543N;
    }

    public static boolean e(InterfaceC0966n interfaceC0966n, InterfaceC0966n interfaceC0966n2) {
        if (interfaceC0966n.getClass().equals(interfaceC0966n2.getClass())) {
            if ((interfaceC0966n instanceof r) || (interfaceC0966n instanceof C0956l)) {
                return true;
            }
            if (interfaceC0966n instanceof C0931g) {
                if (Double.isNaN(interfaceC0966n.b().doubleValue()) || Double.isNaN(interfaceC0966n2.b().doubleValue()) || interfaceC0966n.b().doubleValue() != interfaceC0966n2.b().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (interfaceC0966n instanceof C0981q) {
                return interfaceC0966n.c().equals(interfaceC0966n2.c());
            }
            if (interfaceC0966n instanceof C0921e) {
                return interfaceC0966n.o().equals(interfaceC0966n2.o());
            }
            if (interfaceC0966n != interfaceC0966n2) {
                return false;
            }
            return true;
        }
        if (((interfaceC0966n instanceof r) || (interfaceC0966n instanceof C0956l)) && ((interfaceC0966n2 instanceof r) || (interfaceC0966n2 instanceof C0956l))) {
            return true;
        }
        boolean z9 = interfaceC0966n instanceof C0931g;
        if (z9 && (interfaceC0966n2 instanceof C0981q)) {
            return e(interfaceC0966n, new C0931g(interfaceC0966n2.b()));
        }
        boolean z10 = interfaceC0966n instanceof C0981q;
        if (z10 && (interfaceC0966n2 instanceof C0931g)) {
            return e(new C0931g(interfaceC0966n.b()), interfaceC0966n2);
        }
        if (interfaceC0966n instanceof C0921e) {
            return e(new C0931g(interfaceC0966n.b()), interfaceC0966n2);
        }
        if (interfaceC0966n2 instanceof C0921e) {
            return e(interfaceC0966n, new C0931g(interfaceC0966n2.b()));
        }
        if ((!z10 && !z9) || !(interfaceC0966n2 instanceof InterfaceC0946j)) {
            if (!(interfaceC0966n instanceof InterfaceC0946j) || (!(interfaceC0966n2 instanceof C0981q) && !(interfaceC0966n2 instanceof C0931g))) {
                return false;
            }
            return e(new C0981q(interfaceC0966n.c()), interfaceC0966n2);
        }
        return e(interfaceC0966n, new C0981q(interfaceC0966n2.c()));
    }

    public static boolean f(InterfaceC0966n interfaceC0966n, InterfaceC0966n interfaceC0966n2) {
        if (interfaceC0966n instanceof InterfaceC0946j) {
            interfaceC0966n = new C0981q(interfaceC0966n.c());
        }
        if (interfaceC0966n2 instanceof InterfaceC0946j) {
            interfaceC0966n2 = new C0981q(interfaceC0966n2.c());
        }
        if ((interfaceC0966n instanceof C0981q) && (interfaceC0966n2 instanceof C0981q)) {
            if (((C0981q) interfaceC0966n).f15572a.compareTo(((C0981q) interfaceC0966n2).f15572a) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = interfaceC0966n.b().doubleValue();
        double doubleValue2 = interfaceC0966n2.b().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && ((doubleValue != 0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    public static InterfaceC0966n g(C1005v c1005v, InterfaceC0966n interfaceC0966n, InterfaceC0966n interfaceC0966n2) {
        if (interfaceC0966n instanceof Iterable) {
            return d(c1005v, ((Iterable) interfaceC0966n).iterator(), interfaceC0966n2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public static boolean h(InterfaceC0966n interfaceC0966n, InterfaceC0966n interfaceC0966n2) {
        if (interfaceC0966n instanceof InterfaceC0946j) {
            interfaceC0966n = new C0981q(interfaceC0966n.c());
        }
        if (interfaceC0966n2 instanceof InterfaceC0946j) {
            interfaceC0966n2 = new C0981q(interfaceC0966n2.c());
        }
        if (((!(interfaceC0966n instanceof C0981q) || !(interfaceC0966n2 instanceof C0981q)) && (Double.isNaN(interfaceC0966n.b().doubleValue()) || Double.isNaN(interfaceC0966n2.b().doubleValue()))) || f(interfaceC0966n2, interfaceC0966n)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x091f, code lost:
    
        if ("return".equals(r4.f15481b) != false) goto L301;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:531:0x0c97. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.measurement.InterfaceC0966n a(java.lang.String r13, com.google.firebase.messaging.s r14, java.util.ArrayList r15) {
        /*
            Method dump skipped, instructions count: 3872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C0990s.a(java.lang.String, com.google.firebase.messaging.s, java.util.ArrayList):com.google.android.gms.internal.measurement.n");
    }

    public final void b(String str) {
        if (this.f15577a.contains(s8.n.X(str))) {
            throw new UnsupportedOperationException("Command not implemented: ".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("Command not supported");
    }
}
