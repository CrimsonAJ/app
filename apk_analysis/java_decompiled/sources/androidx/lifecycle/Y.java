package androidx.lifecycle;

import Y7.InterfaceC0484z;
import Y7.z0;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import m0.C1581d;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f9853a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f9854b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f9855c = new Object();

    public static final void a(e0 e0Var, N0.f registry, D.n lifecycle) {
        Object obj;
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        HashMap hashMap = e0Var.f9880a;
        if (hashMap == null) {
            obj = null;
        } else {
            synchronized (hashMap) {
                obj = e0Var.f9880a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        W w7 = (W) obj;
        if (w7 != null && !w7.f9850c) {
            w7.g(registry, lifecycle);
            i(registry, lifecycle);
        }
    }

    public static final W b(N0.f registry, D.n lifecycle, String str, Bundle bundle) {
        kotlin.jvm.internal.h.e(registry, "registry");
        kotlin.jvm.internal.h.e(lifecycle, "lifecycle");
        Bundle c3 = registry.c(str);
        Class[] clsArr = V.f9842f;
        W w7 = new W(str, c(c3, bundle));
        w7.g(registry, lifecycle);
        i(registry, lifecycle);
        return w7;
    }

    public static V c(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new V();
            }
            HashMap hashMap = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.h.d(key, "key");
                hashMap.put(key, bundle2.get(key));
            }
            return new V(hashMap);
        }
        ClassLoader classLoader = V.class.getClassLoader();
        kotlin.jvm.internal.h.b(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList != null && parcelableArrayList2 != null && parcelableArrayList.size() == parcelableArrayList2.size()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = parcelableArrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                Object obj = parcelableArrayList.get(i9);
                kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlin.String");
                linkedHashMap.put((String) obj, parcelableArrayList2.get(i9));
            }
            return new V(linkedHashMap);
        }
        throw new IllegalStateException("Invalid bundle passed as restored state");
    }

    public static final V d(C1581d c1581d) {
        Z z9;
        Bundle bundle;
        f0 f0Var = f9853a;
        LinkedHashMap linkedHashMap = c1581d.f20661a;
        N0.g gVar = (N0.g) linkedHashMap.get(f0Var);
        if (gVar != null) {
            k0 k0Var = (k0) linkedHashMap.get(f9854b);
            if (k0Var != null) {
                Bundle bundle2 = (Bundle) linkedHashMap.get(f9855c);
                String str = (String) linkedHashMap.get(f0.f9884b);
                if (str != null) {
                    N0.e d9 = gVar.c().d();
                    if (d9 instanceof Z) {
                        z9 = (Z) d9;
                    } else {
                        z9 = null;
                    }
                    if (z9 != null) {
                        LinkedHashMap linkedHashMap2 = ((a0) new android.support.v4.media.session.y(k0Var, new X(0)).K(a0.class, "androidx.lifecycle.internal.SavedStateHandlesVM")).f9860d;
                        V v8 = (V) linkedHashMap2.get(str);
                        if (v8 == null) {
                            Class[] clsArr = V.f9842f;
                            z9.b();
                            Bundle bundle3 = z9.f9858c;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = z9.f9858c;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = z9.f9858c;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                z9.f9858c = null;
                            }
                            V c3 = c(bundle, bundle2);
                            linkedHashMap2.put(str, c3);
                            return c3;
                        }
                        return v8;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final void e(N0.g gVar) {
        EnumC0555p a02 = gVar.x().a0();
        if (a02 != EnumC0555p.f9894b && a02 != EnumC0555p.f9895c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gVar.c().d() == null) {
            Z z9 = new Z(gVar.c(), (k0) gVar);
            gVar.c().f("androidx.lifecycle.internal.SavedStateHandlesProvider", z9);
            gVar.x().V(new N0.b(2, z9));
        }
    }

    public static final r f(InterfaceC0561w interfaceC0561w) {
        kotlin.jvm.internal.h.e(interfaceC0561w, "<this>");
        D.n x5 = interfaceC0561w.x();
        kotlin.jvm.internal.h.e(x5, "<this>");
        while (true) {
            AtomicReference atomicReference = (AtomicReference) x5.f1707a;
            r rVar = (r) atomicReference.get();
            if (rVar != null) {
                return rVar;
            }
            z0 b9 = Y7.B.b();
            f8.e eVar = Y7.K.f8773a;
            r rVar2 = new r(x5, O4.h.D(b9, d8.o.f17003a.f9070d));
            while (!atomicReference.compareAndSet(null, rVar2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            f8.e eVar2 = Y7.K.f8773a;
            Y7.B.r(rVar2, d8.o.f17003a.f9070d, new C0556q(rVar2, null), 2);
            return rVar2;
        }
    }

    public static final InterfaceC0484z g(M1.r rVar) {
        Object obj;
        Object obj2;
        HashMap hashMap = rVar.f9880a;
        if (hashMap == null) {
            obj2 = null;
        } else {
            synchronized (hashMap) {
                obj = rVar.f9880a.get("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
            }
            obj2 = obj;
        }
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) obj2;
        if (interfaceC0484z != null) {
            return interfaceC0484z;
        }
        z0 b9 = Y7.B.b();
        f8.e eVar = Y7.K.f8773a;
        return (InterfaceC0484z) rVar.c(new C0544e(O4.h.D(b9, d8.o.f17003a.f9070d)), "androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
    }

    public static final Object h(InterfaceC0561w interfaceC0561w, EnumC0555p enumC0555p, O7.p pVar, E7.d dVar) {
        Object f9;
        D.n x5 = interfaceC0561w.x();
        if (enumC0555p != EnumC0555p.f9894b) {
            EnumC0555p a02 = x5.a0();
            EnumC0555p enumC0555p2 = EnumC0555p.f9893a;
            A7.n nVar = A7.n.f558a;
            F7.a aVar = F7.a.f2587a;
            if (a02 == enumC0555p2 || (f9 = Y7.B.f(new O(x5, enumC0555p, pVar, null), dVar)) != aVar) {
                f9 = nVar;
            }
            if (f9 == aVar) {
                return f9;
            }
            return nVar;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static void i(N0.f fVar, D.n nVar) {
        EnumC0555p a02 = nVar.a0();
        if (a02 != EnumC0555p.f9894b && a02.compareTo(EnumC0555p.f9896d) < 0) {
            nVar.V(new C0547h(nVar, 1, fVar));
        } else {
            fVar.g();
        }
    }
}
