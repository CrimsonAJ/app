package v7;

import I1.j;
import I1.m;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import b7.C0701c;
import i0.AbstractActivityC1369y;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1368x;
import x7.InterfaceC2179a;
import x7.InterfaceC2180b;

/* renamed from: v7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2118f implements InterfaceC2180b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23909a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f23910b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public volatile InterfaceC2179a f23911c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f23912d;

    public C2118f(C0701c c0701c) {
        this.f23912d = c0701c;
    }

    public static final Context b(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    private final Object c() {
        if (((j) this.f23911c) == null) {
            synchronized (this.f23910b) {
                if (((j) this.f23911c) == null) {
                    this.f23911c = new j(new M4.b((m) ((C0701c) this.f23912d).f11404b, false));
                }
            }
        }
        return (j) this.f23911c;
    }

    public I1.h a() {
        AbstractActivityC1369y abstractActivityC1369y;
        AbstractActivityC1369y abstractActivityC1369y2;
        AbstractActivityC1369y abstractActivityC1369y3;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) this.f23912d;
        C1368x c1368x = abstractComponentCallbacksC1366v.f18416t;
        AbstractActivityC1369y abstractActivityC1369y4 = null;
        if (c1368x == null) {
            abstractActivityC1369y = null;
        } else {
            abstractActivityC1369y = c1368x.f18430r;
        }
        if (abstractActivityC1369y != null) {
            if (c1368x == null) {
                abstractActivityC1369y2 = null;
            } else {
                abstractActivityC1369y2 = c1368x.f18430r;
            }
            boolean z9 = abstractActivityC1369y2 instanceof InterfaceC2180b;
            if (c1368x == null) {
                abstractActivityC1369y3 = null;
            } else {
                abstractActivityC1369y3 = c1368x.f18430r;
            }
            s8.e.h(z9, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", abstractActivityC1369y3.getClass());
            C1368x c1368x2 = abstractComponentCallbacksC1366v.f18416t;
            if (c1368x2 != null) {
                abstractActivityC1369y4 = c1368x2.f18430r;
            }
            return new I1.h(((I1.e) ((InterfaceC2119g) v4.e.p(InterfaceC2119g.class, abstractActivityC1369y4))).f3284c);
        }
        throw new NullPointerException("Hilt Fragments must be attached before creating the component.");
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        switch (this.f23909a) {
            case 0:
                return c();
            default:
                if (((I1.h) this.f23911c) == null) {
                    synchronized (this.f23910b) {
                        try {
                            if (((I1.h) this.f23911c) == null) {
                                this.f23911c = a();
                            }
                        } finally {
                        }
                    }
                }
                return (I1.h) this.f23911c;
        }
    }

    public C2118f(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        this.f23912d = abstractComponentCallbacksC1366v;
    }
}
