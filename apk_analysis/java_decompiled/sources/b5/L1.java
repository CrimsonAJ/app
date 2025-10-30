package b5;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* loaded from: classes.dex */
public final class L1 implements E0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.Q f10796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f10797b;

    public L1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.Q q9) {
        this.f10797b = appMeasurementDynamiteService;
        this.f10796a = q9;
    }

    @Override // b5.E0
    public final void a(long j, Bundle bundle, String str, String str2) {
        try {
            this.f10796a.t0(j, bundle, str, str2);
        } catch (RemoteException e8) {
            C0650n0 c0650n0 = this.f10797b.f15719e;
            if (c0650n0 != null) {
                V v8 = c0650n0.f11229i;
                C0650n0.f(v8);
                v8.f10974i.c(e8, "Event listener threw exception");
            }
        }
    }
}
