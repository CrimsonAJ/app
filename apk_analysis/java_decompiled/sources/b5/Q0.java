package b5;

/* loaded from: classes.dex */
public final class Q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10890a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0 f10891b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f10892c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S0 f10894e;

    public /* synthetic */ Q0(S0 s02, C0 c02, long j, boolean z9, int i9) {
        this.f10890a = i9;
        this.f10891b = c02;
        this.f10892c = j;
        this.f10893d = z9;
        this.f10894e = s02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10890a) {
            case 0:
                C0 c02 = this.f10891b;
                S0 s02 = this.f10894e;
                s02.D0(c02);
                S0.p0(s02, c02, this.f10892c, this.f10893d);
                return;
            default:
                C0 c03 = this.f10891b;
                S0 s03 = this.f10894e;
                s03.D0(c03);
                S0.p0(s03, c03, this.f10892c, this.f10893d);
                return;
        }
    }
}
