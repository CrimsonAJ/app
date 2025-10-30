package com.google.android.gms.internal.measurement;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class Y extends AbstractRunnableC0932g0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0952k0 f15407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f15408g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(C0952k0 c0952k0, Object obj, int i9) {
        super(c0952k0, true);
        this.f15406e = i9;
        this.f15408g = obj;
        this.f15407f = c0952k0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public final void a() {
        switch (this.f15406e) {
            case 0:
                J j = this.f15407f.f15520h;
                F4.y.h(j);
                j.setConditionalUserProperty((Bundle) this.f15408g, this.f15488a);
                return;
            case 1:
                J j4 = this.f15407f.f15520h;
                F4.y.h(j4);
                j4.retrieveAndUploadBatches(new BinderC0907b0((S5.o) this.f15408g));
                return;
            case 2:
                J j9 = this.f15407f.f15520h;
                F4.y.h(j9);
                j9.logHealthData(5, "Error with data collection. Data lost.", new N4.b((Exception) this.f15408g), new N4.b(null), new N4.b(null));
                return;
            default:
                J j10 = this.f15407f.f15520h;
                F4.y.h(j10);
                j10.registerOnMeasurementEventListener((BinderC0937h0) this.f15408g);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(C0952k0 c0952k0, Exception exc) {
        super(c0952k0, false);
        this.f15406e = 2;
        this.f15408g = exc;
        this.f15407f = c0952k0;
    }
}
