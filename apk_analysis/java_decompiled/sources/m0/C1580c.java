package m0;

import A1.g;
import A3.E;
import I1.j;
import I1.l;
import P5.AbstractC0349q;
import P5.X;
import androidx.lifecycle.Y;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import d.AbstractActivityC1071l;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.h;
import u7.C2087c;
import u7.C2089e;
import u7.C2090f;
import u7.InterfaceC2088d;
import v7.C2116d;
import v7.InterfaceC2115c;
import w0.f;
import z7.InterfaceC2251a;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1580c implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20662a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20663b;

    public /* synthetic */ C1580c(int i9, Object obj) {
        this.f20662a = i9;
        this.f20663b = obj;
    }

    @Override // androidx.lifecycle.h0
    public final e0 a(Class cls) {
        switch (this.f20662a) {
            case 0:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            case 1:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
            default:
                throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }

    /* JADX WARN: Type inference failed for: r8v21, types: [com.google.firebase.messaging.u, java.lang.Object] */
    @Override // androidx.lifecycle.h0
    public final e0 b(Class cls, C1581d c1581d) {
        e0 e0Var;
        switch (this.f20662a) {
            case 0:
                f.a aVar = null;
                for (C1582e c1582e : (C1582e[]) this.f20663b) {
                    if (c1582e.f20664a.equals(cls)) {
                        aVar = new f.a();
                    }
                }
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
            case 1:
                C2090f c2090f = new C2090f();
                g gVar = (g) this.f20663b;
                Y.d(c1581d);
                l lVar = new l((j) gVar.f18b, (I1.g) gVar.f19c);
                l lVar2 = (l) ((InterfaceC2088d) v4.e.p(InterfaceC2088d.class, lVar));
                lVar2.getClass();
                AbstractC0349q.c(35, "expectedSize");
                E e8 = new E(35, 6);
                e8.n("O1.g", lVar2.f3412b);
                e8.n("P1.G", lVar2.f3413c);
                e8.n("q2.c", lVar2.f3414d);
                e8.n("a2.k", lVar2.f3415e);
                e8.n("R1.A", lVar2.f3416f);
                e8.n("S1.l", lVar2.f3417g);
                e8.n("V1.n", lVar2.f3418h);
                e8.n("U1.l", lVar2.f3419i);
                e8.n("W1.c", lVar2.j);
                e8.n("X1.y", lVar2.f3420k);
                e8.n("b2.l", lVar2.f3421l);
                e8.n("Y1.h", lVar2.f3422m);
                e8.n("Z1.h", lVar2.f3423n);
                e8.n("L1.S", lVar2.f3424o);
                e8.n("c2.r", lVar2.f3425p);
                e8.n("d2.K", lVar2.f3426q);
                e8.n("N1.y", lVar2.f3427r);
                e8.n("e2.h", lVar2.f3428s);
                e8.n("e2.B", lVar2.f3429t);
                e8.n("f2.c", lVar2.f3430u);
                e8.n("o2.j", lVar2.f3431v);
                e8.n("g2.a0", lVar2.f3432w);
                e8.n("h2.g", lVar2.f3433x);
                e8.n("i2.n", lVar2.f3434y);
                e8.n("j2.j", lVar2.f3435z);
                e8.n("k2.m", lVar2.f3401A);
                e8.n("l2.n", lVar2.f3402B);
                e8.n("m2.c", lVar2.f3403C);
                e8.n("T1.p", lVar2.f3404D);
                e8.n("T1.G", lVar2.f3405E);
                e8.n("n2.g", lVar2.f3406F);
                e8.n("p2.h", lVar2.f3407G);
                e8.n("o2.s", lVar2.f3408H);
                e8.n("q2.x", lVar2.f3409I);
                e8.n("s2.c", lVar2.f3410J);
                InterfaceC2251a interfaceC2251a = (InterfaceC2251a) e8.d().get(cls.getName());
                O7.l lVar3 = (O7.l) c1581d.f20661a.get(C2089e.f23710d);
                ((InterfaceC2088d) v4.e.p(InterfaceC2088d.class, lVar)).getClass();
                Object obj = X.f5938g.get(cls);
                if (obj == null) {
                    if (lVar3 == null) {
                        if (interfaceC2251a != null) {
                            e0Var = (e0) interfaceC2251a.get();
                        } else {
                            throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                        }
                    } else {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                } else if (interfaceC2251a == null) {
                    if (lVar3 != null) {
                        e0Var = (e0) lVar3.invoke(obj);
                    } else {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                } else {
                    throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                C2087c c2087c = new C2087c(c2090f);
                if (e0Var.f9882c) {
                    e0.a(c2087c);
                } else {
                    LinkedHashSet linkedHashSet = e0Var.f9881b;
                    if (linkedHashSet != null) {
                        synchronized (linkedHashSet) {
                            e0Var.f9881b.add(c2087c);
                        }
                    }
                }
                return e0Var;
            default:
                ?? obj2 = new Object();
                obj2.f16512a = c1581d;
                return new C2116d(new I1.g(((j) ((InterfaceC2115c) v4.e.p(InterfaceC2115c.class, Z0.a.h(((AbstractActivityC1071l) this.f20663b).getApplicationContext())))).f3344b), obj2);
        }
    }

    public C1580c(C1582e[] initializers) {
        this.f20662a = 0;
        h.e(initializers, "initializers");
        this.f20663b = initializers;
    }
}
