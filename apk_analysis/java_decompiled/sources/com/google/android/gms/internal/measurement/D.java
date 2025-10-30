package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import l1.C1535g;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final C1535g f15190a;

    /* renamed from: b, reason: collision with root package name */
    public com.google.firebase.messaging.s f15191b;

    /* renamed from: c, reason: collision with root package name */
    public final b5.G1 f15192c;

    /* renamed from: d, reason: collision with root package name */
    public final C0995t f15193d;

    public D() {
        C1535g c1535g = new C1535g(8);
        this.f15190a = c1535g;
        this.f15191b = ((com.google.firebase.messaging.s) c1535g.f20183b).y();
        this.f15192c = new b5.G1(6);
        this.f15193d = new C0995t(2);
        final int i9 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D f15433b;

            {
                this.f15433b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i9) {
                    case 0:
                        return new I1(this.f15433b.f15193d);
                    default:
                        return new I1(this.f15433b.f15192c);
                }
            }
        };
        C0974o2 c0974o2 = (C0974o2) c1535g.f20185d;
        ((HashMap) c0974o2.f15559a).put("internal.registerCallback", callable);
        final int i10 = 1;
        ((HashMap) c0974o2.f15559a).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ D f15433b;

            {
                this.f15433b = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i10) {
                    case 0:
                        return new I1(this.f15433b.f15193d);
                    default:
                        return new I1(this.f15433b.f15192c);
                }
            }
        });
    }

    public final void a(C0983q1 c0983q1) {
        AbstractC0936h abstractC0936h;
        try {
            C1535g c1535g = this.f15190a;
            this.f15191b = ((com.google.firebase.messaging.s) c1535g.f20183b).y();
            if (!(c1535g.K(this.f15191b, (C0987r1[]) c0983q1.o().toArray(new C0987r1[0])) instanceof C0926f)) {
                for (C0978p1 c0978p1 : c0983q1.n().p()) {
                    InterfaceC0939h2 o9 = c0978p1.o();
                    String n7 = c0978p1.n();
                    Iterator it = o9.iterator();
                    while (it.hasNext()) {
                        InterfaceC0966n K = c1535g.K(this.f15191b, (C0987r1) it.next());
                        if (K instanceof C0951k) {
                            com.google.firebase.messaging.s sVar = this.f15191b;
                            if (!sVar.G(n7)) {
                                abstractC0936h = null;
                            } else {
                                InterfaceC0966n C8 = sVar.C(n7);
                                if (C8 instanceof AbstractC0936h) {
                                    abstractC0936h = (AbstractC0936h) C8;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(n7)));
                                }
                            }
                            if (abstractC0936h != null) {
                                abstractC0936h.a(this.f15191b, Collections.singletonList(K));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(n7)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }

    public final boolean b(C0906b c0906b) {
        b5.G1 g12 = this.f15192c;
        try {
            g12.f10717b = c0906b;
            g12.f10718c = c0906b.clone();
            ((ArrayList) g12.f10719d).clear();
            ((com.google.firebase.messaging.s) this.f15190a.f20184c).F("runtime.counter", new C0931g(Double.valueOf(0.0d)));
            this.f15193d.d(this.f15191b.y(), g12);
            if (((C0906b) g12.f10718c).equals((C0906b) g12.f10717b)) {
                if (((ArrayList) g12.f10719d).isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new Exception(th);
        }
    }
}
