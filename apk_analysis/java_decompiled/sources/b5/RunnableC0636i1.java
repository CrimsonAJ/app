package b5;

import android.os.RemoteException;

/* renamed from: b5.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0636i1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q1 f11151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0648m1 f11152c;

    public /* synthetic */ RunnableC0636i1(C0648m1 c0648m1, Q1 q12, int i9) {
        this.f11150a = i9;
        this.f11151b = q12;
        this.f11152c = c0648m1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11150a) {
            case 0:
                C0648m1 c0648m1 = this.f11152c;
                G g9 = c0648m1.f11196d;
                C0650n0 c0650n0 = (C0650n0) c0648m1.f1707a;
                if (g9 == null) {
                    V v8 = c0650n0.f11229i;
                    C0650n0.f(v8);
                    v8.f10971f.b("Failed to reset data on the service: not connected to service");
                    return;
                } else {
                    try {
                        g9.L0(this.f11151b);
                    } catch (RemoteException e8) {
                        V v9 = c0650n0.f11229i;
                        C0650n0.f(v9);
                        v9.f10971f.c(e8, "Failed to reset data on the service: remote exception");
                    }
                    c0648m1.B0();
                    return;
                }
            case 1:
                C0648m1 c0648m12 = this.f11152c;
                G g10 = c0648m12.f11196d;
                C0650n0 c0650n02 = (C0650n0) c0648m12.f1707a;
                if (g10 == null) {
                    V v10 = c0650n02.f11229i;
                    C0650n0.f(v10);
                    v10.f10971f.b("Discarding data. Failed to send app launch");
                    return;
                }
                try {
                    Q1 q12 = this.f11151b;
                    C0628g c0628g = c0650n02.f11227g;
                    D d9 = E.f10672m1;
                    if (c0628g.y0(null, d9)) {
                        c0648m12.s0(g10, null, q12);
                    }
                    g10.m0(q12);
                    c0650n02.j().r0();
                    c0650n02.f11227g.y0(null, d9);
                    c0648m12.s0(g10, null, q12);
                    c0648m12.B0();
                    return;
                } catch (RemoteException e9) {
                    V v11 = c0650n02.f11229i;
                    C0650n0.f(v11);
                    v11.f10971f.c(e9, "Failed to send app launch to the service");
                    return;
                }
            case 2:
                C0648m1 c0648m13 = this.f11152c;
                G g11 = c0648m13.f11196d;
                C0650n0 c0650n03 = (C0650n0) c0648m13.f1707a;
                if (g11 == null) {
                    V v12 = c0650n03.f11229i;
                    C0650n0.f(v12);
                    v12.f10974i.b("Failed to send app backgrounded");
                    return;
                }
                try {
                    g11.U(this.f11151b);
                    c0648m13.B0();
                    return;
                } catch (RemoteException e10) {
                    V v13 = c0650n03.f11229i;
                    C0650n0.f(v13);
                    v13.f10971f.c(e10, "Failed to send app backgrounded to the service");
                    return;
                }
            case 3:
                C0648m1 c0648m14 = this.f11152c;
                G g12 = c0648m14.f11196d;
                C0650n0 c0650n04 = (C0650n0) c0648m14.f1707a;
                if (g12 == null) {
                    V v14 = c0650n04.f11229i;
                    C0650n0.f(v14);
                    v14.f10971f.b("Failed to send measurementEnabled to service");
                    return;
                }
                try {
                    g12.Y(this.f11151b);
                    c0648m14.B0();
                    return;
                } catch (RemoteException e11) {
                    V v15 = c0650n04.f11229i;
                    C0650n0.f(v15);
                    v15.f10971f.c(e11, "Failed to send measurementEnabled to the service");
                    return;
                }
            default:
                C0648m1 c0648m15 = this.f11152c;
                G g13 = c0648m15.f11196d;
                C0650n0 c0650n05 = (C0650n0) c0648m15.f1707a;
                if (g13 == null) {
                    V v16 = c0650n05.f11229i;
                    C0650n0.f(v16);
                    v16.f10971f.b("Failed to send consent settings to service");
                    return;
                }
                try {
                    g13.a0(this.f11151b);
                    c0648m15.B0();
                    return;
                } catch (RemoteException e12) {
                    V v17 = c0650n05.f11229i;
                    C0650n0.f(v17);
                    v17.f10971f.c(e12, "Failed to send consent settings to the service");
                    return;
                }
        }
    }
}
