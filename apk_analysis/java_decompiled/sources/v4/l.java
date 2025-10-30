package v4;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f23866A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ h f23867B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, int i9) {
        super(hVar, false);
        this.f23866A = i9;
        this.f23867B = hVar;
    }

    @Override // v4.s
    public final void N() {
        this.f23867B.f23849c.p(O(), 0, -1L, 0, Integer.valueOf(this.f23866A));
    }
}
