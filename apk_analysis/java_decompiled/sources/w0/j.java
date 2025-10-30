package w0;

import B7.D;
import android.util.Log;
import androidx.lifecycle.EnumC0555p;
import b8.C0718Q;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import i0.AbstractComponentCallbacksC1366v;
import i0.InterfaceC1332I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import u0.C2042m;
import u0.C2044o;

/* loaded from: classes.dex */
public final class j implements InterfaceC1332I {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2044o f23996a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f23997b;

    public j(C2044o c2044o, f fVar) {
        this.f23996a = c2044o;
        this.f23997b = fVar;
    }

    @Override // i0.InterfaceC1332I
    public final void a(AbstractComponentCallbacksC1366v fragment, boolean z9) {
        Object obj;
        Object obj2;
        boolean z10;
        kotlin.jvm.internal.h.e(fragment, "fragment");
        C2044o c2044o = this.f23996a;
        ArrayList y02 = B7.k.y0((Collection) ((C0718Q) c2044o.f23515e.f11422a).h(), (Iterable) ((C0718Q) c2044o.f23516f.f11422a).h());
        ListIterator listIterator = y02.listIterator(y02.size());
        while (true) {
            obj = null;
            if (listIterator.hasPrevious()) {
                obj2 = listIterator.previous();
                if (kotlin.jvm.internal.h.a(((C2042m) obj2).f23500f, fragment.f18422y)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        C2042m c2042m = (C2042m) obj2;
        boolean z11 = true;
        f fVar = this.f23997b;
        if (z9 && fVar.f23986g.isEmpty() && fragment.f18401l) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = fVar.f23986g;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                break;
            }
            Object obj3 = arrayList.get(i9);
            i9++;
            if (kotlin.jvm.internal.h.a(((A7.h) obj3).f547a, fragment.f18422y)) {
                obj = obj3;
                break;
            }
        }
        A7.h hVar = (A7.h) obj;
        if (hVar != null) {
            fVar.f23986g.remove(hVar);
        }
        if (!z10 && f.n()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + c2042m);
        }
        if (hVar == null || !((Boolean) hVar.f548b).booleanValue()) {
            z11 = false;
        }
        if (!z9 && !z11 && c2042m == null) {
            throw new IllegalArgumentException(AbstractC0953k1.m("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (c2042m != null) {
            fVar.l(fragment, c2042m, c2044o);
            if (z10) {
                if (f.n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + c2042m + " via system back");
                }
                c2044o.f(c2042m, false);
            }
        }
    }

    @Override // i0.InterfaceC1332I
    public final void c(AbstractComponentCallbacksC1366v fragment, boolean z9) {
        Object obj;
        kotlin.jvm.internal.h.e(fragment, "fragment");
        if (z9) {
            C2044o c2044o = this.f23996a;
            List list = (List) ((C0718Q) c2044o.f23515e.f11422a).h();
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (kotlin.jvm.internal.h.a(((C2042m) obj).f23500f, fragment.f18422y)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C2042m c2042m = (C2042m) obj;
            this.f23997b.getClass();
            if (f.n()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + c2042m);
            }
            if (c2042m != null) {
                C0718Q c0718q = c2044o.f23513c;
                c0718q.j(null, D.Q((Set) c0718q.h(), c2042m));
                if (c2044o.f23518h.f23400g.contains(c2042m)) {
                    c2042m.b(EnumC0555p.f9896d);
                    return;
                }
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
        }
    }

    @Override // i0.InterfaceC1332I
    public final void b() {
    }
}
