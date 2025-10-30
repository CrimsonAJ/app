package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class X extends AbstractRunnableC0932g0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f15397f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0952k0 f15398g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(C0952k0 c0952k0, String str, int i9) {
        super(c0952k0, true);
        this.f15396e = i9;
        this.f15397f = str;
        this.f15398g = c0952k0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public final void a() {
        switch (this.f15396e) {
            case 0:
                J j = this.f15398g.f15520h;
                F4.y.h(j);
                j.setUserProperty("fcm", "_ln", new N4.b(this.f15397f), true, this.f15488a);
                return;
            case 1:
                J j4 = this.f15398g.f15520h;
                F4.y.h(j4);
                j4.beginAdUnitExposure(this.f15397f, this.f15489b);
                return;
            default:
                J j9 = this.f15398g.f15520h;
                F4.y.h(j9);
                j9.endAdUnitExposure(this.f15397f, this.f15489b);
                return;
        }
    }
}
