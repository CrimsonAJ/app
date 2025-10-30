package v4;

/* loaded from: classes.dex */
public final class m extends s {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ int f23868A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ long f23869B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ h f23870C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, int i9, long j) {
        super(hVar, false);
        this.f23868A = i9;
        this.f23869B = j;
        this.f23870C = hVar;
    }

    @Override // v4.s
    public final void N() {
        this.f23870C.f23849c.p(O(), this.f23868A, this.f23869B, 0, null);
    }
}
