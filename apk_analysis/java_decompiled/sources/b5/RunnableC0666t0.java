package b5;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* renamed from: b5.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0666t0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11313a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.L f11314b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f11315c;

    public /* synthetic */ RunnableC0666t0(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.L l9, int i9) {
        this.f11313a = i9;
        this.f11314b = l9;
        this.f11315c = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        switch (this.f11313a) {
            case 0:
                C0648m1 m9 = this.f11315c.f15719e.m();
                m9.l0();
                m9.m0();
                m9.C0(new A4.j(m9, m9.z0(false), this.f11314b, 11, false));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f11315c;
                P1 p12 = appMeasurementDynamiteService.f15719e.f11231l;
                C0650n0.d(p12);
                C0650n0 c0650n0 = appMeasurementDynamiteService.f15719e;
                if (c0650n0.f11216B != null && c0650n0.f11216B.booleanValue()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                p12.H0(this.f11314b, z9);
                return;
        }
    }
}
