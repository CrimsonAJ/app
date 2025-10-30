package b5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: b5.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0626f0 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final String f11109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0629g0 f11110b;

    public ServiceConnectionC0626f0(C0629g0 c0629g0, String str) {
        this.f11110b = c0629g0;
        this.f11109a = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.measurement.B] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ?? r1;
        C0629g0 c0629g0 = this.f11110b;
        if (iBinder != null) {
            try {
                int i9 = com.google.android.gms.internal.measurement.A.f15174e;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                if (queryLocalInterface instanceof com.google.android.gms.internal.measurement.B) {
                    r1 = (com.google.android.gms.internal.measurement.B) queryLocalInterface;
                } else {
                    r1 = new S4.a(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 4);
                }
                if (r1 == 0) {
                    V v8 = c0629g0.f11122a.f11229i;
                    C0650n0.f(v8);
                    v8.f10974i.b("Install Referrer Service implementation was not found");
                    return;
                }
                C0650n0 c0650n0 = c0629g0.f11122a;
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10978n.b("Install Referrer Service connected");
                C0647m0 c0647m0 = c0650n0.j;
                C0650n0.f(c0647m0);
                c0647m0.v0(new S5.o(this, (com.google.android.gms.internal.measurement.B) r1, this));
                return;
            } catch (RuntimeException e8) {
                V v10 = c0629g0.f11122a.f11229i;
                C0650n0.f(v10);
                v10.f10974i.c(e8, "Exception occurred while calling Install Referrer API");
                return;
            }
        }
        V v11 = c0629g0.f11122a.f11229i;
        C0650n0.f(v11);
        v11.f10974i.b("Install Referrer connection returned with null binder");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        V v8 = this.f11110b.f11122a.f11229i;
        C0650n0.f(v8);
        v8.f10978n.b("Install Referrer Service disconnected");
    }
}
