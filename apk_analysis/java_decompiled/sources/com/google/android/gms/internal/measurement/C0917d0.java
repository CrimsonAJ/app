package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0917d0 extends AbstractRunnableC0932g0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ G f15462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0952k0 f15463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0917d0(C0952k0 c0952k0, G g9, int i9) {
        super(c0952k0, true);
        this.f15461e = i9;
        this.f15462f = g9;
        this.f15463g = c0952k0;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public final void a() {
        switch (this.f15461e) {
            case 0:
                J j = this.f15463g.f15520h;
                F4.y.h(j);
                j.getGmpAppId(this.f15462f);
                return;
            case 1:
                J j4 = this.f15463g.f15520h;
                F4.y.h(j4);
                j4.getCachedAppInstanceId(this.f15462f);
                return;
            case 2:
                J j9 = this.f15463g.f15520h;
                F4.y.h(j9);
                j9.generateEventId(this.f15462f);
                return;
            case 3:
                J j10 = this.f15463g.f15520h;
                F4.y.h(j10);
                j10.getCurrentScreenName(this.f15462f);
                return;
            default:
                J j11 = this.f15463g.f15520h;
                F4.y.h(j11);
                j11.getCurrentScreenClass(this.f15462f);
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0932g0
    public final void b() {
        switch (this.f15461e) {
            case 0:
                this.f15462f.v0(null);
                return;
            case 1:
                this.f15462f.v0(null);
                return;
            case 2:
                this.f15462f.v0(null);
                return;
            case 3:
                this.f15462f.v0(null);
                return;
            default:
                this.f15462f.v0(null);
                return;
        }
    }
}
