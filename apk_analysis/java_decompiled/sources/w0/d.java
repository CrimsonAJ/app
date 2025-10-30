package w0;

import B7.D;
import android.content.Context;
import android.util.Log;
import androidx.lifecycle.C0563y;
import b8.C0718Q;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1329F;
import i0.DialogInterfaceOnCancelListenerC1358n;
import i0.InterfaceC1341S;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.r;
import u0.C;
import u0.C2042m;
import u0.C2044o;
import u0.J;
import u0.U;
import u0.V;

@U("dialog")
/* loaded from: classes.dex */
public final class d extends V {

    /* renamed from: c, reason: collision with root package name */
    public final Context f23975c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1336M f23976d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f23977e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    public final N0.b f23978f = new N0.b(6, this);

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f23979g = new LinkedHashMap();

    public d(Context context, AbstractC1336M abstractC1336M) {
        this.f23975c = context;
        this.f23976d = abstractC1336M;
    }

    @Override // u0.V
    public final C a() {
        return new C(this);
    }

    @Override // u0.V
    public final void d(List list, J j) {
        AbstractC1336M abstractC1336M = this.f23976d;
        if (abstractC1336M.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2042m c2042m = (C2042m) it.next();
            k(c2042m).k0(abstractC1336M, c2042m.f23500f);
            C2042m c2042m2 = (C2042m) B7.k.w0((List) ((C0718Q) b().f23515e.f11422a).h());
            boolean l02 = B7.k.l0((Iterable) ((C0718Q) b().f23516f.f11422a).h(), c2042m2);
            b().h(c2042m);
            if (c2042m2 != null && !l02) {
                b().b(c2042m2);
            }
        }
    }

    @Override // u0.V
    public final void e(C2044o c2044o) {
        C0563y c0563y;
        this.f23459a = c2044o;
        this.f23460b = true;
        Iterator it = ((List) ((C0718Q) c2044o.f23515e.f11422a).h()).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            AbstractC1336M abstractC1336M = this.f23976d;
            if (hasNext) {
                C2042m c2042m = (C2042m) it.next();
                DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n = (DialogInterfaceOnCancelListenerC1358n) abstractC1336M.C(c2042m.f23500f);
                if (dialogInterfaceOnCancelListenerC1358n != null && (c0563y = dialogInterfaceOnCancelListenerC1358n.f18404m0) != null) {
                    c0563y.V(this.f23978f);
                } else {
                    this.f23977e.add(c2042m.f23500f);
                }
            } else {
                abstractC1336M.f18208n.add(new InterfaceC1341S() { // from class: w0.a
                    @Override // i0.InterfaceC1341S
                    public final void a(AbstractC1336M abstractC1336M2, AbstractComponentCallbacksC1366v childFragment) {
                        d this$0 = d.this;
                        kotlin.jvm.internal.h.e(this$0, "this$0");
                        kotlin.jvm.internal.h.e(abstractC1336M2, "<anonymous parameter 0>");
                        kotlin.jvm.internal.h.e(childFragment, "childFragment");
                        LinkedHashSet linkedHashSet = this$0.f23977e;
                        String str = childFragment.f18422y;
                        r.a(linkedHashSet);
                        if (linkedHashSet.remove(str)) {
                            childFragment.f18404m0.V(this$0.f23978f);
                        }
                        LinkedHashMap linkedHashMap = this$0.f23979g;
                        String str2 = childFragment.f18422y;
                        r.b(linkedHashMap);
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
        }
    }

    @Override // u0.V
    public final void f(C2042m c2042m) {
        AbstractC1336M abstractC1336M = this.f23976d;
        if (abstractC1336M.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        LinkedHashMap linkedHashMap = this.f23979g;
        String str = c2042m.f23500f;
        DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n = (DialogInterfaceOnCancelListenerC1358n) linkedHashMap.get(str);
        if (dialogInterfaceOnCancelListenerC1358n == null) {
            AbstractComponentCallbacksC1366v C8 = abstractC1336M.C(str);
            if (C8 instanceof DialogInterfaceOnCancelListenerC1358n) {
                dialogInterfaceOnCancelListenerC1358n = (DialogInterfaceOnCancelListenerC1358n) C8;
            } else {
                dialogInterfaceOnCancelListenerC1358n = null;
            }
        }
        if (dialogInterfaceOnCancelListenerC1358n != null) {
            dialogInterfaceOnCancelListenerC1358n.f18404m0.g0(this.f23978f);
            dialogInterfaceOnCancelListenerC1358n.e0();
        }
        k(c2042m).k0(abstractC1336M, str);
        C2044o b9 = b();
        List list = (List) ((C0718Q) b9.f23515e.f11422a).h();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            C2042m c2042m2 = (C2042m) listIterator.previous();
            if (kotlin.jvm.internal.h.a(c2042m2.f23500f, str)) {
                C0718Q c0718q = b9.f23513c;
                c0718q.j(null, D.Q(D.Q((Set) c0718q.h(), c2042m2), c2042m));
                b9.c(c2042m);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // u0.V
    public final void i(C2042m popUpTo, boolean z9) {
        kotlin.jvm.internal.h.e(popUpTo, "popUpTo");
        AbstractC1336M abstractC1336M = this.f23976d;
        if (abstractC1336M.M()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) ((C0718Q) b().f23515e.f11422a).h();
        int indexOf = list.indexOf(popUpTo);
        Iterator it = B7.k.A0(list.subList(indexOf, list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC1366v C8 = abstractC1336M.C(((C2042m) it.next()).f23500f);
            if (C8 != null) {
                ((DialogInterfaceOnCancelListenerC1358n) C8).e0();
            }
        }
        l(indexOf, popUpTo, z9);
    }

    public final DialogInterfaceOnCancelListenerC1358n k(C2042m c2042m) {
        C c3 = c2042m.f23496b;
        kotlin.jvm.internal.h.c(c3, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        b bVar = (b) c3;
        String str = bVar.f23973k;
        if (str != null) {
            char charAt = str.charAt(0);
            Context context = this.f23975c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            C1329F E8 = this.f23976d.E();
            context.getClassLoader();
            AbstractComponentCallbacksC1366v a5 = E8.a(str);
            kotlin.jvm.internal.h.d(a5, "fragmentManager.fragment…t.classLoader, className)");
            if (DialogInterfaceOnCancelListenerC1358n.class.isAssignableFrom(a5.getClass())) {
                DialogInterfaceOnCancelListenerC1358n dialogInterfaceOnCancelListenerC1358n = (DialogInterfaceOnCancelListenerC1358n) a5;
                dialogInterfaceOnCancelListenerC1358n.c0(c2042m.a());
                dialogInterfaceOnCancelListenerC1358n.f18404m0.V(this.f23978f);
                this.f23979g.put(c2042m.f23500f, dialogInterfaceOnCancelListenerC1358n);
                return dialogInterfaceOnCancelListenerC1358n;
            }
            StringBuilder sb = new StringBuilder("Dialog destination ");
            String str2 = bVar.f23973k;
            if (str2 != null) {
                throw new IllegalArgumentException(AbstractC0953k1.q(sb, str2, " is not an instance of DialogFragment").toString());
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i9, C2042m c2042m, boolean z9) {
        C2042m c2042m2 = (C2042m) B7.k.r0((List) ((C0718Q) b().f23515e.f11422a).h(), i9 - 1);
        boolean l02 = B7.k.l0((Iterable) ((C0718Q) b().f23516f.f11422a).h(), c2042m2);
        b().f(c2042m, z9);
        if (c2042m2 != null && !l02) {
            b().b(c2042m2);
        }
    }
}
