package Z7;

import E7.i;
import Y7.AbstractC0480v;
import Y7.C0463g0;
import Y7.C0464h;
import Y7.D0;
import Y7.G;
import Y7.InterfaceC0465h0;
import Y7.K;
import Y7.M;
import Y7.v0;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d8.AbstractC1130a;
import d8.o;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class d extends AbstractC0480v implements G {

    /* renamed from: b, reason: collision with root package name */
    public final Handler f9068b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9069c;

    /* renamed from: d, reason: collision with root package name */
    public final d f9070d;

    public d(Handler handler, boolean z9) {
        d dVar;
        this.f9068b = handler;
        this.f9069c = z9;
        if (z9) {
            dVar = this;
        } else {
            dVar = new d(handler, true);
        }
        this.f9070d = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (dVar.f9068b == this.f9068b && dVar.f9069c == this.f9069c) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // Y7.G
    public final M g(long j, final D0 d02, i iVar) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f9068b.postDelayed(d02, j)) {
            return new M() { // from class: Z7.c
                @Override // Y7.M
                public final void b() {
                    d.this.f9068b.removeCallbacks(d02);
                }
            };
        }
        k0(iVar, d02);
        return v0.f8859a;
    }

    @Override // Y7.AbstractC0480v
    public final void g0(i iVar, Runnable runnable) {
        if (!this.f9068b.post(runnable)) {
            k0(iVar, runnable);
        }
    }

    public final int hashCode() {
        int i9;
        int identityHashCode = System.identityHashCode(this.f9068b);
        if (this.f9069c) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return identityHashCode ^ i9;
    }

    @Override // Y7.AbstractC0480v
    public final boolean i0() {
        if (this.f9069c && h.a(Looper.myLooper(), this.f9068b.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // Y7.AbstractC0480v
    public AbstractC0480v j0(int i9) {
        AbstractC1130a.a(1);
        return this;
    }

    public final void k0(i iVar, Runnable runnable) {
        CancellationException cancellationException = new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed");
        InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) iVar.get(C0463g0.f8811a);
        if (interfaceC0465h0 != null) {
            interfaceC0465h0.d(cancellationException);
        }
        K.f8774b.g0(iVar, runnable);
    }

    @Override // Y7.AbstractC0480v
    public final String toString() {
        d dVar;
        String str;
        f8.e eVar = K.f8773a;
        d dVar2 = o.f17003a;
        if (this == dVar2) {
            str = "Dispatchers.Main";
        } else {
            try {
                dVar = dVar2.f9070d;
            } catch (UnsupportedOperationException unused) {
                dVar = null;
            }
            if (this == dVar) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String handler = this.f9068b.toString();
            if (this.f9069c) {
                return AbstractC0953k1.n(handler, ".immediate");
            }
            return handler;
        }
        return str;
    }

    @Override // Y7.G
    public final void x(long j, C0464h c0464h) {
        S5.o oVar = new S5.o(c0464h, 14, this);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.f9068b.postDelayed(oVar, j)) {
            c0464h.u(new A0.b(this, 2, oVar));
        } else {
            k0(c0464h.f8816e, oVar);
        }
    }
}
