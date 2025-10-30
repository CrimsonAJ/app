package q3;

/* renamed from: q3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1896a implements r {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1898c f22285a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22286b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22287c;

    /* renamed from: d, reason: collision with root package name */
    public final long f22288d;

    /* renamed from: e, reason: collision with root package name */
    public final long f22289e;

    /* renamed from: f, reason: collision with root package name */
    public final long f22290f;

    public C1896a(InterfaceC1898c interfaceC1898c, long j, long j4, long j9, long j10, long j11) {
        this.f22285a = interfaceC1898c;
        this.f22286b = j;
        this.f22287c = j4;
        this.f22288d = j9;
        this.f22289e = j10;
        this.f22290f = j11;
    }

    @Override // q3.r
    public final boolean e() {
        return true;
    }

    @Override // q3.r
    public final q g(long j) {
        s sVar = new s(j, C1897b.a(this.f22285a.k(j), 0L, this.f22287c, this.f22288d, this.f22289e, this.f22290f));
        return new q(sVar, sVar);
    }

    @Override // q3.r
    public final long h() {
        return this.f22286b;
    }
}
