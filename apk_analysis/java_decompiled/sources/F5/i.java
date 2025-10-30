package F5;

/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: c, reason: collision with root package name */
    public final f f2505c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2506d;

    public i(f fVar, float f9) {
        super(0);
        this.f2505c = fVar;
        this.f2506d = f9;
    }

    @Override // F5.e
    public final boolean q() {
        return true;
    }

    @Override // F5.e
    public final void r(float f9, float f10, float f11, w wVar) {
        this.f2505c.r(f9, f10 - this.f2506d, f11, wVar);
    }
}
