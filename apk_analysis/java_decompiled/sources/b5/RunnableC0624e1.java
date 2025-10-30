package b5;

import android.os.RemoteException;

/* renamed from: b5.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0624e1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0648m1 f11108b;

    public /* synthetic */ RunnableC0624e1(C0648m1 c0648m1, int i9) {
        this.f11107a = i9;
        this.f11108b = c0648m1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11107a) {
            case 0:
                C0648m1 c0648m1 = this.f11108b;
                G g9 = c0648m1.f11196d;
                C0650n0 c0650n0 = (C0650n0) c0648m1.f1707a;
                if (g9 == null) {
                    V v8 = c0650n0.f11229i;
                    C0650n0.f(v8);
                    v8.f10971f.b("Failed to send storage consent settings to service");
                    return;
                }
                try {
                    g9.o(c0648m1.z0(false));
                    c0648m1.B0();
                    return;
                } catch (RemoteException e8) {
                    V v9 = c0650n0.f11229i;
                    C0650n0.f(v9);
                    v9.f10971f.c(e8, "Failed to send storage consent settings to the service");
                    return;
                }
            case 1:
                C0648m1 c0648m12 = this.f11108b;
                G g10 = c0648m12.f11196d;
                C0650n0 c0650n02 = (C0650n0) c0648m12.f1707a;
                if (g10 == null) {
                    V v10 = c0650n02.f11229i;
                    C0650n0.f(v10);
                    v10.f10971f.b("Failed to send Dma consent settings to service");
                    return;
                }
                try {
                    g10.C(c0648m12.z0(false));
                    c0648m12.B0();
                    return;
                } catch (RemoteException e9) {
                    V v11 = c0650n02.f11229i;
                    C0650n0.f(v11);
                    v11.f10971f.c(e9, "Failed to send Dma consent settings to the service");
                    return;
                }
            default:
                this.f11108b.p0();
                return;
        }
    }
}
