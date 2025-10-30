package N0;

import B7.k;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.EnumC0554o;
import androidx.lifecycle.InterfaceC0549j;
import androidx.lifecycle.InterfaceC0559u;
import androidx.lifecycle.InterfaceC0561w;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.e0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import b8.C0718Q;
import c1.C0753b;
import i0.AbstractComponentCallbacksC1366v;
import i0.DialogInterfaceOnCancelListenerC1358n;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.h;
import u0.C2042m;
import u0.z;
import v7.C2120h;

/* loaded from: classes.dex */
public final class b implements InterfaceC0559u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4816a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4817b;

    public /* synthetic */ b(int i9, Object obj) {
        this.f4816a = i9;
        this.f4817b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        View view;
        int i9;
        switch (this.f4816a) {
            case 0:
                if (enumC0554o == EnumC0554o.ON_CREATE) {
                    interfaceC0561w.x().g0(this);
                    g gVar = (g) this.f4817b;
                    Bundle c3 = gVar.c().c("androidx.savedstate.Restarter");
                    if (c3 != null) {
                        ArrayList<String> stringArrayList = c3.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            int size = stringArrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                String str = stringArrayList.get(i10);
                                i10++;
                                String str2 = str;
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(d.class);
                                    h.d(asSubclass, "{\n                Class.…class.java)\n            }");
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            h.d(newInstance, "{\n                constr…wInstance()\n            }");
                                            if (gVar instanceof k0) {
                                                j0 u9 = ((k0) gVar).u();
                                                f c9 = gVar.c();
                                                u9.getClass();
                                                LinkedHashMap linkedHashMap = u9.f9891a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String key = (String) it.next();
                                                    h.e(key, "key");
                                                    e0 e0Var = (e0) linkedHashMap.get(key);
                                                    h.b(e0Var);
                                                    Y.a(e0Var, c9, gVar.x());
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    c9.g();
                                                }
                                            } else {
                                                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                            }
                                        } catch (Exception e8) {
                                            throw new RuntimeException(z.e("Failed to instantiate ", str2), e8);
                                        }
                                    } catch (NoSuchMethodException e9) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
                                    }
                                } catch (ClassNotFoundException e10) {
                                    throw new RuntimeException(A0.a.n("Class ", str2, " wasn't found"), e10);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                new HashMap();
                InterfaceC0549j[] interfaceC0549jArr = (InterfaceC0549j[]) this.f4817b;
                if (interfaceC0549jArr.length <= 0) {
                    if (interfaceC0549jArr.length <= 0) {
                        return;
                    }
                    InterfaceC0549j interfaceC0549j = interfaceC0549jArr[0];
                    throw null;
                }
                InterfaceC0549j interfaceC0549j2 = interfaceC0549jArr[0];
                throw null;
            case 2:
                if (enumC0554o == EnumC0554o.ON_CREATE) {
                    interfaceC0561w.x().g0(this);
                    ((Z) this.f4817b).b();
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0554o).toString());
            case 3:
                ((C0753b) this.f4817b).b(false);
                return;
            case 4:
                if (enumC0554o == EnumC0554o.ON_STOP && (view = ((AbstractComponentCallbacksC1366v) this.f4817b).Y) != null) {
                    view.cancelPendingInputEvents();
                    return;
                }
                return;
            case 5:
                if (enumC0554o == EnumC0554o.ON_DESTROY) {
                    C2120h c2120h = (C2120h) this.f4817b;
                    c2120h.getClass();
                    c2120h.f23913a = null;
                    c2120h.f23914b = null;
                    return;
                }
                return;
            default:
                int i11 = w0.c.f23974a[enumC0554o.ordinal()];
                w0.d dVar = (w0.d) this.f4817b;
                if (i11 != 1) {
                    Object obj = null;
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 == 4) {
                                DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n = (DialogInterfaceOnCancelListenerC1358n) interfaceC0561w;
                                for (Object obj2 : (Iterable) ((C0718Q) dVar.b().f23516f.f11422a).h()) {
                                    if (h.a(((C2042m) obj2).f23500f, dialogInterfaceOnCancelListenerC1358n.f18422y)) {
                                        obj = obj2;
                                    }
                                }
                                C2042m c2042m = (C2042m) obj;
                                if (c2042m != null) {
                                    dVar.b().b(c2042m);
                                }
                                dialogInterfaceOnCancelListenerC1358n.f18404m0.g0(this);
                                return;
                            }
                            return;
                        }
                        DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n2 = (DialogInterfaceOnCancelListenerC1358n) interfaceC0561w;
                        if (!dialogInterfaceOnCancelListenerC1358n2.h0().isShowing()) {
                            List list = (List) ((C0718Q) dVar.b().f23515e.f11422a).h();
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    if (h.a(((C2042m) listIterator.previous()).f23500f, dialogInterfaceOnCancelListenerC1358n2.f18422y)) {
                                        i9 = listIterator.nextIndex();
                                    }
                                } else {
                                    i9 = -1;
                                }
                            }
                            C2042m c2042m2 = (C2042m) k.r0(list, i9);
                            if (!h.a(k.w0(list), c2042m2)) {
                                Log.i("DialogFragmentNavigator", "Dialog " + dialogInterfaceOnCancelListenerC1358n2 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                            }
                            if (c2042m2 != null) {
                                dVar.l(i9, c2042m2, false);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n3 = (DialogInterfaceOnCancelListenerC1358n) interfaceC0561w;
                    for (Object obj3 : (Iterable) ((C0718Q) dVar.b().f23516f.f11422a).h()) {
                        if (h.a(((C2042m) obj3).f23500f, dialogInterfaceOnCancelListenerC1358n3.f18422y)) {
                            obj = obj3;
                        }
                    }
                    C2042m c2042m3 = (C2042m) obj;
                    if (c2042m3 != null) {
                        dVar.b().b(c2042m3);
                        return;
                    }
                    return;
                }
                DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n4 = (DialogInterfaceOnCancelListenerC1358n) interfaceC0561w;
                Iterable iterable = (Iterable) ((C0718Q) dVar.b().f23515e.f11422a).h();
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        if (h.a(((C2042m) it2.next()).f23500f, dialogInterfaceOnCancelListenerC1358n4.f18422y)) {
                            return;
                        }
                    }
                }
                dialogInterfaceOnCancelListenerC1358n4.e0();
                return;
        }
    }
}
