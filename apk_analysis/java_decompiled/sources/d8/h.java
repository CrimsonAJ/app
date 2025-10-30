package d8;

import Y7.A0;
import Y7.AbstractC0480v;
import Y7.C0476q;
import Y7.I;
import Y7.V;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h extends I implements G7.d, E7.d {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16979h = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0480v f16980d;

    /* renamed from: e, reason: collision with root package name */
    public final G7.c f16981e;

    /* renamed from: f, reason: collision with root package name */
    public Object f16982f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f16983g;

    public h(AbstractC0480v abstractC0480v, G7.c cVar) {
        super(-1);
        this.f16980d = abstractC0480v;
        this.f16981e = cVar;
        this.f16982f = AbstractC1130a.f16968c;
        this.f16983g = AbstractC1130a.l(cVar.getContext());
    }

    @Override // Y7.I
    public final void d(Object obj, CancellationException cancellationException) {
        if (!(obj instanceof Y7.r)) {
            return;
        }
        ((Y7.r) obj).getClass();
        throw null;
    }

    @Override // G7.d
    public final G7.d getCallerFrame() {
        G7.c cVar = this.f16981e;
        if (u0.z.i(cVar)) {
            return cVar;
        }
        return null;
    }

    @Override // E7.d
    public final E7.i getContext() {
        return this.f16981e.getContext();
    }

    @Override // Y7.I
    public final Object j() {
        Object obj = this.f16982f;
        this.f16982f = AbstractC1130a.f16968c;
        return obj;
    }

    @Override // E7.d
    public final void resumeWith(Object obj) {
        Object c0476q;
        G7.c cVar = this.f16981e;
        E7.i context = cVar.getContext();
        Throwable a5 = A7.j.a(obj);
        if (a5 == null) {
            c0476q = obj;
        } else {
            c0476q = new C0476q(a5, false);
        }
        AbstractC0480v abstractC0480v = this.f16980d;
        if (abstractC0480v.i0()) {
            this.f16982f = c0476q;
            this.f8769c = 0;
            abstractC0480v.g0(context, this);
            return;
        }
        V a9 = A0.a();
        if (a9.f8789b >= 4294967296L) {
            this.f16982f = c0476q;
            this.f8769c = 0;
            a9.l0(this);
            return;
        }
        a9.n0(true);
        try {
            E7.i context2 = cVar.getContext();
            Object m9 = AbstractC1130a.m(context2, this.f16983g);
            try {
                cVar.resumeWith(obj);
                do {
                } while (a9.p0());
            } finally {
                AbstractC1130a.g(context2, m9);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f16980d + ", " + Y7.B.y(this.f16981e) + ']';
    }

    @Override // Y7.I
    public final E7.d f() {
        return this;
    }
}
