package Q3;

/* loaded from: classes.dex */
public final class k extends P3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6398d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final Object f6399e;

    public k(X3.b bVar, int i9) {
        super(i9, bVar.f8425k - 1);
        this.f6399e = bVar;
    }

    @Override // P3.l
    public final long c() {
        switch (this.f6398d) {
            case 0:
                a();
                return ((j) this.f6399e).c(this.f5822c);
            default:
                return ((X3.b) this.f6399e).b((int) this.f5822c) + h();
        }
    }

    @Override // P3.l
    public final long h() {
        switch (this.f6398d) {
            case 0:
                a();
                return ((j) this.f6399e).d(this.f5822c);
            default:
                a();
                return ((X3.b) this.f6399e).f8429o[(int) this.f5822c];
        }
    }

    public k(j jVar, long j, long j4) {
        super(j, j4);
        this.f6399e = jVar;
    }
}
