package u0;

import F0.Y;
import android.os.Bundle;
import b8.C0718Q;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name */
    public C2044o f23459a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f23460b;

    public abstract C a();

    public final C2044o b() {
        C2044o c2044o = this.f23459a;
        if (c2044o != null) {
            return c2044o;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, J j) {
        V7.f fVar = new V7.f(new V7.g(new V7.i(new B7.r(0, list), new A0.b(this, 5, j), 2), false, new G0.L(4)));
        while (fVar.hasNext()) {
            b().g((C2042m) fVar.next());
        }
    }

    public void e(C2044o c2044o) {
        this.f23459a = c2044o;
        this.f23460b = true;
    }

    public void f(C2042m c2042m) {
        boolean z9;
        C c3 = c2042m.f23496b;
        if (c3 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            c3 = null;
        }
        if (c3 == null) {
            return;
        }
        K k5 = new K();
        k5.f23432b = true;
        boolean z10 = k5.f23432b;
        Y y9 = k5.f23431a;
        c(c3, null, new J(z10, k5.f23433c, k5.f23434d, false, k5.f23435e, y9.f2058a, y9.f2059b, -1, -1));
        b().c(c2042m);
    }

    public Bundle h() {
        return null;
    }

    public void i(C2042m popUpTo, boolean z9) {
        kotlin.jvm.internal.h.e(popUpTo, "popUpTo");
        List list = (List) ((C0718Q) b().f23515e.f11422a).h();
        if (list.contains(popUpTo)) {
            ListIterator listIterator = list.listIterator(list.size());
            C2042m c2042m = null;
            while (j()) {
                c2042m = (C2042m) listIterator.previous();
                if (kotlin.jvm.internal.h.a(c2042m, popUpTo)) {
                    break;
                }
            }
            if (c2042m != null) {
                b().d(c2042m, z9);
                return;
            }
            return;
        }
        throw new IllegalStateException(("popBackStack was called with " + popUpTo + " which does not exist in back stack " + list).toString());
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public C c(C c3, Bundle bundle, J j) {
        return c3;
    }
}
