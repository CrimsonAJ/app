package b5;

import F4.AbstractC0126e;
import F4.InterfaceC0123b;
import F4.InterfaceC0124c;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* renamed from: b5.l1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0645l1 implements ServiceConnection, InterfaceC0123b, InterfaceC0124c {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f11182a;

    /* renamed from: b, reason: collision with root package name */
    public volatile P f11183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0648m1 f11184c;

    public ServiceConnectionC0645l1(C0648m1 c0648m1) {
        this.f11184c = c0648m1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [F4.e, b5.P] */
    public final void a() {
        C0648m1 c0648m1 = this.f11184c;
        c0648m1.l0();
        Context context = ((C0650n0) c0648m1.f1707a).f11221a;
        synchronized (this) {
            try {
                try {
                    if (this.f11182a) {
                        V v8 = ((C0650n0) this.f11184c.f1707a).f11229i;
                        C0650n0.f(v8);
                        v8.f10978n.b("Connection attempt already in progress");
                    } else {
                        if (this.f11183b != null && (this.f11183b.g() || this.f11183b.a())) {
                            V v9 = ((C0650n0) this.f11184c.f1707a).f11229i;
                            C0650n0.f(v9);
                            v9.f10978n.b("Already awaiting connection attempt");
                            return;
                        }
                        this.f11183b = new AbstractC0126e(context, Looper.getMainLooper(), F4.J.a(context), B4.g.f697b, 93, this, this, null);
                        V v10 = ((C0650n0) this.f11184c.f1707a).f11229i;
                        C0650n0.f(v10);
                        v10.f10978n.b("Connecting to remote service");
                        this.f11182a = true;
                        F4.y.h(this.f11183b);
                        this.f11183b.n();
                    }
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // F4.InterfaceC0123b
    public final void b(Bundle bundle) {
        C0647m0 c0647m0 = ((C0650n0) this.f11184c.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.t0();
        synchronized (this) {
            try {
                F4.y.h(this.f11183b);
                G g9 = (G) this.f11183b.u();
                C0647m0 c0647m02 = ((C0650n0) this.f11184c.f1707a).j;
                C0650n0.f(c0647m02);
                c0647m02.v0(new RunnableC0642k1(this, g9, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f11183b = null;
                this.f11182a = false;
            }
        }
    }

    @Override // F4.InterfaceC0124c
    public final void d(B4.b bVar) {
        C0648m1 c0648m1 = this.f11184c;
        C0647m0 c0647m0 = ((C0650n0) c0648m1.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.t0();
        V v8 = ((C0650n0) c0648m1.f1707a).f11229i;
        if (v8 == null || !v8.f11344b) {
            v8 = null;
        }
        if (v8 != null) {
            v8.f10974i.c(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.f11182a = false;
            this.f11183b = null;
        }
        C0647m0 c0647m02 = ((C0650n0) this.f11184c.f1707a).j;
        C0650n0.f(c0647m02);
        c0647m02.v0(new S5.o(this, bVar, 27, false));
    }

    @Override // F4.InterfaceC0123b
    public final void g(int i9) {
        C0650n0 c0650n0 = (C0650n0) this.f11184c.f1707a;
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        c0647m0.t0();
        V v8 = c0650n0.f11229i;
        C0650n0.f(v8);
        v8.f10977m.b("Service connection suspended");
        C0647m0 c0647m02 = c0650n0.j;
        C0650n0.f(c0647m02);
        c0647m02.v0(new A4.e(12, this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        G f9;
        C0647m0 c0647m0 = ((C0650n0) this.f11184c.f1707a).j;
        C0650n0.f(c0647m0);
        c0647m0.t0();
        synchronized (this) {
            if (iBinder == null) {
                this.f11182a = false;
                V v8 = ((C0650n0) this.f11184c.f1707a).f11229i;
                C0650n0.f(v8);
                v8.f10971f.b("Service connected with null binder");
                return;
            }
            G g9 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof G) {
                        f9 = (G) queryLocalInterface;
                    } else {
                        f9 = new F(iBinder);
                    }
                    g9 = f9;
                    V v9 = ((C0650n0) this.f11184c.f1707a).f11229i;
                    C0650n0.f(v9);
                    v9.f10978n.b("Bound to IMeasurementService interface");
                } else {
                    V v10 = ((C0650n0) this.f11184c.f1707a).f11229i;
                    C0650n0.f(v10);
                    v10.f10971f.c(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                V v11 = ((C0650n0) this.f11184c.f1707a).f11229i;
                C0650n0.f(v11);
                v11.f10971f.b("Service connect failed to get IMeasurementService");
            }
            if (g9 == null) {
                this.f11182a = false;
                try {
                    J4.a b9 = J4.a.b();
                    C0648m1 c0648m1 = this.f11184c;
                    b9.c(((C0650n0) c0648m1.f1707a).f11221a, c0648m1.f11195c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                C0647m0 c0647m02 = ((C0650n0) this.f11184c.f1707a).j;
                C0650n0.f(c0647m02);
                c0647m02.v0(new RunnableC0642k1(this, g9, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0650n0 c0650n0 = (C0650n0) this.f11184c.f1707a;
        C0647m0 c0647m0 = c0650n0.j;
        C0650n0.f(c0647m0);
        c0647m0.t0();
        V v8 = c0650n0.f11229i;
        C0650n0.f(v8);
        v8.f10977m.b("Service disconnected");
        C0647m0 c0647m02 = c0650n0.j;
        C0650n0.f(c0647m02);
        c0647m02.v0(new S5.o(this, componentName, 26, false));
    }
}
