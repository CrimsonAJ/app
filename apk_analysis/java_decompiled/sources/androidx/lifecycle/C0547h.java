package androidx.lifecycle;

import android.os.Handler;
import android.widget.FrameLayout;
import c1.C0754c;
import c2.C0768n;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0547h implements InterfaceC0559u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9888a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9889b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9890c;

    public /* synthetic */ C0547h(Object obj, int i9, Object obj2) {
        this.f9888a = i9;
        this.f9889b = obj;
        this.f9890c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0559u
    public final void d(InterfaceC0561w interfaceC0561w, EnumC0554o enumC0554o) {
        Object obj = this.f9890c;
        Object obj2 = this.f9889b;
        switch (this.f9888a) {
            case 0:
                InterfaceC0545f interfaceC0545f = (InterfaceC0545f) obj2;
                switch (AbstractC0546g.f9885a[enumC0554o.ordinal()]) {
                    case 1:
                        interfaceC0545f.c(interfaceC0561w);
                        break;
                    case 2:
                        interfaceC0545f.i(interfaceC0561w);
                        break;
                    case 3:
                        interfaceC0545f.a(interfaceC0561w);
                        break;
                    case 4:
                        interfaceC0545f.f(interfaceC0561w);
                        break;
                    case 5:
                        interfaceC0545f.j(interfaceC0561w);
                        break;
                    case 6:
                        interfaceC0545f.b(interfaceC0561w);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0559u interfaceC0559u = (InterfaceC0559u) obj;
                if (interfaceC0559u != null) {
                    interfaceC0559u.d(interfaceC0561w, enumC0554o);
                    return;
                }
                return;
            case 1:
                if (enumC0554o == EnumC0554o.ON_START) {
                    ((D.n) obj2).g0(this);
                    ((N0.f) obj).g();
                    return;
                }
                return;
            case 2:
                HashMap hashMap = ((C0541b) obj).f9861a;
                InterfaceC0560v interfaceC0560v = (InterfaceC0560v) obj2;
                C0541b.a((List) hashMap.get(enumC0554o), interfaceC0561w, enumC0554o, interfaceC0560v);
                C0541b.a((List) hashMap.get(EnumC0554o.ON_ANY), interfaceC0561w, enumC0554o, interfaceC0560v);
                return;
            case 3:
                C0768n c0768n = (C0768n) obj;
                if (!c0768n.f11626e.M()) {
                    interfaceC0561w.x().g0(this);
                    C0754c c0754c = (C0754c) obj2;
                    FrameLayout frameLayout = (FrameLayout) c0754c.f2210a;
                    WeakHashMap weakHashMap = P.Q.f5546a;
                    if (frameLayout.isAttachedToWindow()) {
                        c0768n.r(c0754c);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (enumC0554o == EnumC0554o.ON_DESTROY) {
                    ((Handler) obj2).removeCallbacks((A4.e) obj);
                    interfaceC0561w.x().g0(this);
                    return;
                }
                return;
        }
    }

    public C0547h(InterfaceC0545f defaultLifecycleObserver, InterfaceC0559u interfaceC0559u) {
        this.f9888a = 0;
        kotlin.jvm.internal.h.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f9889b = defaultLifecycleObserver;
        this.f9890c = interfaceC0559u;
    }

    public C0547h(InterfaceC0560v interfaceC0560v) {
        this.f9888a = 2;
        this.f9889b = interfaceC0560v;
        C0543d c0543d = C0543d.f9872c;
        Class<?> cls = interfaceC0560v.getClass();
        C0541b c0541b = (C0541b) c0543d.f9873a.get(cls);
        this.f9890c = c0541b == null ? c0543d.a(cls, null) : c0541b;
    }

    public C0547h(C0768n c0768n, C0754c c0754c) {
        this.f9888a = 3;
        this.f9890c = c0768n;
        this.f9889b = c0754c;
    }
}
