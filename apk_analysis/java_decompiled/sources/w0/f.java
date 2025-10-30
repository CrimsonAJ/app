package w0;

import B7.l;
import B7.q;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.media.session.y;
import android.util.Log;
import androidx.lifecycle.e0;
import androidx.lifecycle.j0;
import b8.C0718Q;
import d2.u;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1329F;
import i0.C1334K;
import i0.C1335L;
import i0.C1345a;
import i0.InterfaceC1341S;
import i8.C1421k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.p;
import l6.AbstractC1570b;
import m0.C1578a;
import m0.C1580c;
import m0.C1582e;
import u0.C;
import u0.C2042m;
import u0.C2044o;
import u0.C2048t;
import u0.J;
import u0.U;
import u0.V;

@U("fragment")
/* loaded from: classes.dex */
public class f extends V {

    /* renamed from: c, reason: collision with root package name */
    public final Context f23982c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1336M f23983d;

    /* renamed from: e, reason: collision with root package name */
    public final int f23984e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashSet f23985f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f23986g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final N0.c f23987h = new N0.c(2, this);

    /* renamed from: i, reason: collision with root package name */
    public final C0.b f23988i = new C0.b(6, this);

    /* loaded from: classes.dex */
    public static final class a extends e0 {

        /* renamed from: d, reason: collision with root package name */
        public WeakReference f23989d;

        @Override // androidx.lifecycle.e0
        public final void b() {
            WeakReference weakReference = this.f23989d;
            if (weakReference != null) {
                O7.a aVar = (O7.a) weakReference.get();
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.h.h("completeTransition");
            throw null;
        }
    }

    public f(Context context, AbstractC1336M abstractC1336M, int i9) {
        this.f23982c = context;
        this.f23983d = abstractC1336M;
        this.f23984e = i9;
    }

    public static void k(f fVar, String str, int i9) {
        boolean z9;
        boolean z10 = true;
        if ((i9 & 2) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if ((i9 & 4) == 0) {
            z10 = false;
        }
        ArrayList arrayList = fVar.f23986g;
        if (z10) {
            q.j0(arrayList, new C2048t(str, 1));
        }
        arrayList.add(new A7.h(str, Boolean.valueOf(z9)));
    }

    public static boolean n() {
        if (!Log.isLoggable("FragmentManager", 2) && !Log.isLoggable("FragmentNavigator", 2)) {
            return false;
        }
        return true;
    }

    @Override // u0.V
    public final C a() {
        return new C(this);
    }

    @Override // u0.V
    public final void d(List list, J j) {
        AbstractC1336M abstractC1336M = this.f23983d;
        if (abstractC1336M.M()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2042m c2042m = (C2042m) it.next();
            boolean isEmpty = ((List) ((C0718Q) b().f23515e.f11422a).h()).isEmpty();
            if (j != null && !isEmpty && j.f23423b && this.f23985f.remove(c2042m.f23500f)) {
                abstractC1336M.v(new C1335L(abstractC1336M, c2042m.f23500f, 0), false);
                b().h(c2042m);
            } else {
                C1345a m9 = m(c2042m, j);
                if (!isEmpty) {
                    C2042m c2042m2 = (C2042m) B7.k.w0((List) ((C0718Q) b().f23515e.f11422a).h());
                    if (c2042m2 != null) {
                        k(this, c2042m2.f23500f, 6);
                    }
                    String str = c2042m.f23500f;
                    k(this, str, 6);
                    m9.c(str);
                }
                m9.e(false);
                if (n()) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + c2042m);
                }
                b().h(c2042m);
            }
        }
    }

    @Override // u0.V
    public final void e(final C2044o c2044o) {
        this.f23459a = c2044o;
        this.f23460b = true;
        if (n()) {
            Log.v("FragmentNavigator", "onAttach");
        }
        InterfaceC1341S interfaceC1341S = new InterfaceC1341S() { // from class: w0.e
            @Override // i0.InterfaceC1341S
            public final void a(AbstractC1336M abstractC1336M, AbstractComponentCallbacksC1366v fragment) {
                Object obj;
                C2044o c2044o2 = C2044o.this;
                f this$0 = this;
                kotlin.jvm.internal.h.e(this$0, "this$0");
                kotlin.jvm.internal.h.e(abstractC1336M, "<anonymous parameter 0>");
                kotlin.jvm.internal.h.e(fragment, "fragment");
                List list = (List) ((C0718Q) c2044o2.f23515e.f11422a).h();
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
                if (f.n()) {
                    Log.v("FragmentNavigator", "Attaching fragment " + fragment + " associated with entry " + c2042m + " to FragmentManager " + this$0.f23983d);
                }
                if (c2042m != null) {
                    fragment.f18408o0.d(fragment, new u(1, new h(this$0, fragment, c2042m)));
                    fragment.f18404m0.V(this$0.f23987h);
                    this$0.l(fragment, c2042m, c2044o2);
                }
            }
        };
        AbstractC1336M abstractC1336M = this.f23983d;
        abstractC1336M.f18208n.add(interfaceC1341S);
        j jVar = new j(c2044o, this);
        if (abstractC1336M.f18206l == null) {
            abstractC1336M.f18206l = new ArrayList();
        }
        abstractC1336M.f18206l.add(jVar);
    }

    @Override // u0.V
    public final void f(C2042m c2042m) {
        AbstractC1336M abstractC1336M = this.f23983d;
        if (abstractC1336M.M()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C1345a m9 = m(c2042m, null);
        List list = (List) ((C0718Q) b().f23515e.f11422a).h();
        if (list.size() > 1) {
            C2042m c2042m2 = (C2042m) B7.k.r0(list, l.a0(list) - 1);
            if (c2042m2 != null) {
                k(this, c2042m2.f23500f, 6);
            }
            String str = c2042m.f23500f;
            k(this, str, 4);
            abstractC1336M.v(new C1334K(abstractC1336M, str, -1, 1), false);
            k(this, str, 2);
            m9.c(str);
        }
        m9.e(false);
        b().c(c2042m);
    }

    @Override // u0.V
    public final void g(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f23985f;
            linkedHashSet.clear();
            q.h0(linkedHashSet, stringArrayList);
        }
    }

    @Override // u0.V
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f23985f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return Z0.a.c(new A7.h("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        if (r11 < 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        if (r9 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ae, code lost:
    
        if (kotlin.jvm.internal.h.a(r13.f23500f, r8.f23500f) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b1, code lost:
    
        if (r12 == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        r4.add(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        r9 = false;
     */
    @Override // u0.V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(u0.C2042m r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w0.f.i(u0.m, boolean):void");
    }

    public final void l(AbstractComponentCallbacksC1366v fragment, C2042m c2042m, C2044o c2044o) {
        kotlin.jvm.internal.h.e(fragment, "fragment");
        j0 u9 = fragment.u();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1582e(AbstractC1570b.f(p.a(a.class))));
        C1582e[] c1582eArr = (C1582e[]) arrayList.toArray(new C1582e[0]);
        ((a) new y(u9, new C1580c((C1582e[]) Arrays.copyOf(c1582eArr, c1582eArr.length)), C1578a.f20660b).J(a.class)).f23989d = new WeakReference(new C1421k(c2042m, c2044o, this, fragment));
    }

    public final C1345a m(C2042m c2042m, J j) {
        int i9;
        int i10;
        int i11;
        int i12;
        C c3 = c2042m.f23496b;
        kotlin.jvm.internal.h.c(c3, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle a5 = c2042m.a();
        String str = ((g) c3).f23990k;
        if (str != null) {
            int i13 = 0;
            char charAt = str.charAt(0);
            Context context = this.f23982c;
            if (charAt == '.') {
                str = context.getPackageName() + str;
            }
            AbstractC1336M abstractC1336M = this.f23983d;
            C1329F E8 = abstractC1336M.E();
            context.getClassLoader();
            AbstractComponentCallbacksC1366v a9 = E8.a(str);
            kotlin.jvm.internal.h.d(a9, "fragmentManager.fragment…t.classLoader, className)");
            a9.c0(a5);
            C1345a c1345a = new C1345a(abstractC1336M);
            if (j != null) {
                i9 = j.f23427f;
            } else {
                i9 = -1;
            }
            if (j != null) {
                i10 = j.f23428g;
            } else {
                i10 = -1;
            }
            if (j != null) {
                i11 = j.f23429h;
            } else {
                i11 = -1;
            }
            if (j != null) {
                i12 = j.f23430i;
            } else {
                i12 = -1;
            }
            if (i9 != -1 || i10 != -1 || i11 != -1 || i12 != -1) {
                if (i9 == -1) {
                    i9 = 0;
                }
                if (i10 == -1) {
                    i10 = 0;
                }
                if (i11 == -1) {
                    i11 = 0;
                }
                if (i12 != -1) {
                    i13 = i12;
                }
                c1345a.f18283b = i9;
                c1345a.f18284c = i10;
                c1345a.f18285d = i11;
                c1345a.f18286e = i13;
            }
            int i14 = this.f23984e;
            if (i14 != 0) {
                c1345a.g(i14, a9, c2042m.f23500f, 2);
                c1345a.k(a9);
                c1345a.f18296p = true;
                return c1345a;
            }
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        throw new IllegalStateException("Fragment class was not set");
    }
}
