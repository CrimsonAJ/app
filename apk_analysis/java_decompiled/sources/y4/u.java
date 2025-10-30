package y4;

import F4.A;
import java.util.concurrent.atomic.AtomicReference;
import t4.C2014d;

/* loaded from: classes.dex */
public final class u extends h {

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f24978f;

    /* renamed from: g, reason: collision with root package name */
    public final T4.d f24979g;

    public u(v vVar) {
        this.f24978f = new AtomicReference(vVar);
        this.f24979g = new T4.d(vVar.f2371d, 4);
    }

    @Override // y4.i
    public final void A0(int i9) {
        v vVar = null;
        v vVar2 = (v) this.f24978f.getAndSet(null);
        if (vVar2 != null) {
            vVar2.f24994l0 = -1;
            vVar2.f24995m0 = -1;
            vVar2.f24982A = null;
            vVar2.f24988f0 = null;
            vVar2.f24992j0 = 0.0d;
            vVar2.G();
            vVar2.f24989g0 = false;
            vVar2.f24993k0 = null;
            vVar = vVar2;
        }
        if (vVar != null) {
            v.r0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i9));
            if (i9 != 0) {
                int i10 = vVar.f2390x.get();
                A a5 = vVar.f2374g;
                a5.sendMessage(a5.obtainMessage(6, i10, 2));
            }
        }
    }

    @Override // y4.i
    public final void E(int i9) {
        if (((v) this.f24978f.get()) == null) {
            return;
        }
        synchronized (v.f24981t0) {
        }
    }

    @Override // y4.i
    public final void G0(String str, String str2) {
        v vVar = (v) this.f24978f.get();
        if (vVar == null) {
            return;
        }
        v.r0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f24979g.post(new A4.j(vVar, str, str2, 21));
    }

    @Override // y4.i
    public final void J0(int i9) {
        if (((v) this.f24978f.get()) == null) {
            return;
        }
        synchronized (v.f24981t0) {
        }
    }

    @Override // y4.i
    public final void Q0(String str, byte[] bArr) {
        if (((v) this.f24978f.get()) == null) {
            return;
        }
        v.r0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // y4.i
    public final void T(C2014d c2014d, String str, String str2, boolean z9) {
        v vVar = (v) this.f24978f.get();
        if (vVar == null) {
            return;
        }
        vVar.f24982A = c2014d;
        vVar.f24996n0 = c2014d.f23170a;
        vVar.f24997o0 = str2;
        vVar.f24988f0 = str;
        synchronized (v.f24980s0) {
        }
    }

    @Override // y4.i
    public final void T0(long j) {
        v vVar = (v) this.f24978f.get();
        if (vVar == null) {
            return;
        }
        v.E(vVar, j, 0);
    }

    @Override // y4.i
    public final void X0(e eVar) {
        v vVar = (v) this.f24978f.get();
        if (vVar == null) {
            return;
        }
        v.r0.b("onDeviceStatusChanged", new Object[0]);
        this.f24979g.post(new d2.v(vVar, eVar, 18, false));
    }

    @Override // y4.i
    public final void a(int i9) {
        v vVar = (v) this.f24978f.get();
        if (vVar != null) {
            vVar.f24996n0 = null;
            vVar.f24997o0 = null;
            synchronized (v.f24981t0) {
            }
            if (vVar.f24984C != null) {
                this.f24979g.post(new D4.s(i9, 7, vVar));
            }
        }
    }

    @Override // y4.i
    public final void h0() {
        v.r0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // y4.i
    public final void k(int i9) {
        if (((v) this.f24978f.get()) == null) {
            return;
        }
        synchronized (v.f24980s0) {
        }
    }

    @Override // y4.i
    public final void l0(c cVar) {
        v vVar = (v) this.f24978f.get();
        if (vVar == null) {
            return;
        }
        v.r0.b("onApplicationStatusChanged", new Object[0]);
        this.f24979g.post(new d2.v(vVar, cVar, 19, false));
    }

    @Override // y4.i
    public final void p(long j, int i9) {
        v vVar = (v) this.f24978f.get();
        if (vVar == null) {
            return;
        }
        v.E(vVar, j, i9);
    }

    @Override // y4.i
    public final void B(int i9) {
    }

    @Override // y4.i
    public final void u0(int i9) {
    }
}
