package u0;

import android.util.Log;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.j0;
import b8.AbstractC0714M;
import b8.C0709H;
import b8.C0718Q;
import b8.InterfaceC0707F;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import o2.C1689p;

/* renamed from: u0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2044o {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f23511a;

    /* renamed from: b, reason: collision with root package name */
    public final C0718Q f23512b;

    /* renamed from: c, reason: collision with root package name */
    public final C0718Q f23513c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23514d;

    /* renamed from: e, reason: collision with root package name */
    public final C0709H f23515e;

    /* renamed from: f, reason: collision with root package name */
    public final C0709H f23516f;

    /* renamed from: g, reason: collision with root package name */
    public final V f23517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ H f23518h;

    public C2044o(H h7, V navigator) {
        kotlin.jvm.internal.h.e(navigator, "navigator");
        this.f23518h = h7;
        this.f23511a = new ReentrantLock(true);
        C0718Q c3 = AbstractC0714M.c(B7.t.f1135a);
        this.f23512b = c3;
        C0718Q c9 = AbstractC0714M.c(B7.v.f1137a);
        this.f23513c = c9;
        this.f23515e = new C0709H(c3);
        this.f23516f = new C0709H(c9);
        this.f23517g = navigator;
    }

    public final void a(C2042m backStackEntry) {
        kotlin.jvm.internal.h.e(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.f23511a;
        reentrantLock.lock();
        try {
            C0718Q c0718q = this.f23512b;
            ArrayList z02 = B7.k.z0((Collection) c0718q.h(), backStackEntry);
            c0718q.getClass();
            c0718q.j(null, z02);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(C2042m entry) {
        C2049u c2049u;
        kotlin.jvm.internal.h.e(entry, "entry");
        H h7 = this.f23518h;
        boolean a5 = kotlin.jvm.internal.h.a(h7.f23417y.get(entry), Boolean.TRUE);
        C0718Q c0718q = this.f23513c;
        Set set = (Set) c0718q.h();
        kotlin.jvm.internal.h.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(B7.y.D(set.size()));
        Iterator it = set.iterator();
        boolean z9 = false;
        boolean z10 = false;
        while (true) {
            boolean z11 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!z10 && kotlin.jvm.internal.h.a(next, entry)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                linkedHashSet.add(next);
            }
        }
        c0718q.j(null, linkedHashSet);
        h7.f23417y.remove(entry);
        B7.i iVar = h7.f23400g;
        boolean contains = iVar.contains(entry);
        C0718Q c0718q2 = h7.f23402i;
        if (!contains) {
            h7.u(entry);
            if (entry.f23502h.f9908d.compareTo(EnumC0555p.f9895c) >= 0) {
                entry.b(EnumC0555p.f9893a);
            }
            if (iVar != null) {
                z9 = true;
            }
            String backStackEntryId = entry.f23500f;
            if (!z9 || !iVar.isEmpty()) {
                Iterator it2 = iVar.iterator();
                while (it2.hasNext()) {
                    if (kotlin.jvm.internal.h.a(((C2042m) it2.next()).f23500f, backStackEntryId)) {
                        break;
                    }
                }
            }
            if (!a5 && (c2049u = h7.f23407o) != null) {
                kotlin.jvm.internal.h.e(backStackEntryId, "backStackEntryId");
                j0 j0Var = (j0) c2049u.f23538d.remove(backStackEntryId);
                if (j0Var != null) {
                    j0Var.a();
                }
            }
            h7.v();
            ArrayList r5 = h7.r();
            c0718q2.getClass();
            c0718q2.j(null, r5);
            return;
        }
        if (!this.f23514d) {
            h7.v();
            ArrayList I02 = B7.k.I0(iVar);
            C0718Q c0718q3 = h7.f23401h;
            c0718q3.getClass();
            c0718q3.j(null, I02);
            ArrayList r7 = h7.r();
            c0718q2.getClass();
            c0718q2.j(null, r7);
        }
    }

    public final void c(C2042m c2042m) {
        int i9;
        ReentrantLock reentrantLock = this.f23511a;
        reentrantLock.lock();
        try {
            ArrayList I02 = B7.k.I0((Collection) ((C0718Q) this.f23515e.f11422a).h());
            ListIterator listIterator = I02.listIterator(I02.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (kotlin.jvm.internal.h.a(((C2042m) listIterator.previous()).f23500f, c2042m.f23500f)) {
                        i9 = listIterator.nextIndex();
                        break;
                    }
                } else {
                    i9 = -1;
                    break;
                }
            }
            I02.set(i9, c2042m);
            C0718Q c0718q = this.f23512b;
            c0718q.getClass();
            c0718q.j(null, I02);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(C2042m popUpTo, boolean z9) {
        kotlin.jvm.internal.h.e(popUpTo, "popUpTo");
        H h7 = this.f23518h;
        V b9 = h7.f23413u.b(popUpTo.f23496b.f23374a);
        h7.f23417y.put(popUpTo, Boolean.valueOf(z9));
        if (b9.equals(this.f23517g)) {
            C2045p c2045p = h7.f23416x;
            if (c2045p != null) {
                c2045p.invoke(popUpTo);
                e(popUpTo);
                return;
            }
            C1689p c1689p = new C1689p(this, popUpTo, z9);
            B7.i iVar = h7.f23400g;
            int indexOf = iVar.indexOf(popUpTo);
            if (indexOf < 0) {
                Log.i("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
                return;
            }
            int i9 = indexOf + 1;
            if (i9 != iVar.f1131c) {
                h7.o(((C2042m) iVar.get(i9)).f23496b.f23381h, true, false);
            }
            H.q(h7, popUpTo);
            c1689p.invoke();
            h7.w();
            h7.b();
            return;
        }
        Object obj = h7.f23414v.get(b9);
        kotlin.jvm.internal.h.b(obj);
        ((C2044o) obj).d(popUpTo, z9);
    }

    public final void e(C2042m popUpTo) {
        kotlin.jvm.internal.h.e(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.f23511a;
        reentrantLock.lock();
        try {
            C0718Q c0718q = this.f23512b;
            Iterable iterable = (Iterable) c0718q.h();
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterable) {
                if (kotlin.jvm.internal.h.a((C2042m) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            c0718q.getClass();
            c0718q.j(null, arrayList);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void f(C2042m popUpTo, boolean z9) {
        Object obj;
        kotlin.jvm.internal.h.e(popUpTo, "popUpTo");
        C0718Q c0718q = this.f23513c;
        Iterable iterable = (Iterable) c0718q.h();
        boolean z10 = iterable instanceof Collection;
        C0709H c0709h = this.f23515e;
        if (!z10 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C2042m) it.next()) == popUpTo) {
                    Iterable iterable2 = (Iterable) ((C0718Q) c0709h.f11422a).h();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C2042m) it2.next()) == popUpTo) {
                            }
                        }
                        return;
                    }
                    return;
                }
            }
        }
        c0718q.j(null, B7.D.Q((Set) c0718q.h(), popUpTo));
        List list = (List) ((C0718Q) c0709h.f11422a).h();
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                C2042m c2042m = (C2042m) obj;
                if (!kotlin.jvm.internal.h.a(c2042m, popUpTo)) {
                    InterfaceC0707F interfaceC0707F = c0709h.f11422a;
                    if (((List) ((C0718Q) interfaceC0707F).h()).lastIndexOf(c2042m) < ((List) ((C0718Q) interfaceC0707F).h()).lastIndexOf(popUpTo)) {
                        break;
                    }
                }
            } else {
                obj = null;
                break;
            }
        }
        C2042m c2042m2 = (C2042m) obj;
        if (c2042m2 != null) {
            c0718q.j(null, B7.D.Q((Set) c0718q.h(), c2042m2));
        }
        d(popUpTo, z9);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [O7.l, kotlin.jvm.internal.i] */
    public final void g(C2042m backStackEntry) {
        kotlin.jvm.internal.h.e(backStackEntry, "backStackEntry");
        H h7 = this.f23518h;
        V b9 = h7.f23413u.b(backStackEntry.f23496b.f23374a);
        if (b9.equals(this.f23517g)) {
            ?? r0 = h7.f23415w;
            if (r0 != 0) {
                r0.invoke(backStackEntry);
                a(backStackEntry);
                return;
            } else {
                Log.i("NavController", "Ignoring add of destination " + backStackEntry.f23496b + " outside of the call to navigate(). ");
                return;
            }
        }
        Object obj = h7.f23414v.get(b9);
        if (obj != null) {
            ((C2044o) obj).g(backStackEntry);
            return;
        }
        throw new IllegalStateException(AbstractC0953k1.q(new StringBuilder("NavigatorBackStack for "), backStackEntry.f23496b.f23374a, " should already be created").toString());
    }

    public final void h(C2042m c2042m) {
        C0718Q c0718q = this.f23513c;
        Iterable iterable = (Iterable) c0718q.h();
        boolean z9 = iterable instanceof Collection;
        C0709H c0709h = this.f23515e;
        if (!z9 || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C2042m) it.next()) == c2042m) {
                    Iterable iterable2 = (Iterable) ((C0718Q) c0709h.f11422a).h();
                    if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                        Iterator it2 = iterable2.iterator();
                        while (it2.hasNext()) {
                            if (((C2042m) it2.next()) == c2042m) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C2042m c2042m2 = (C2042m) B7.k.w0((List) ((C0718Q) c0709h.f11422a).h());
        if (c2042m2 != null) {
            LinkedHashSet Q7 = B7.D.Q((Set) c0718q.h(), c2042m2);
            c0718q.getClass();
            c0718q.j(null, Q7);
        }
        LinkedHashSet Q8 = B7.D.Q((Set) c0718q.h(), c2042m);
        c0718q.getClass();
        c0718q.j(null, Q8);
        g(c2042m);
    }
}
