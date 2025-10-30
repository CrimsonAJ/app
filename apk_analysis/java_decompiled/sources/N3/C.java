package N3;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G f4905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0266q f4907d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0270v f4908e;

    public /* synthetic */ C(G g9, H h7, C0266q c0266q, C0270v c0270v, int i9) {
        this.f4904a = i9;
        this.f4905b = g9;
        this.f4906c = h7;
        this.f4907d = c0266q;
        this.f4908e = c0270v;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, N3.H] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, N3.H] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, N3.H] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4904a) {
            case 0:
                G g9 = this.f4905b;
                int i9 = g9.f4921a;
                this.f4906c.e(i9, g9.f4922b, this.f4907d, this.f4908e);
                return;
            case 1:
                G g10 = this.f4905b;
                int i10 = g10.f4921a;
                this.f4906c.D(i10, g10.f4922b, this.f4907d, this.f4908e);
                return;
            default:
                G g11 = this.f4905b;
                int i11 = g11.f4921a;
                this.f4906c.c(i11, g11.f4922b, this.f4907d, this.f4908e);
                return;
        }
    }
}
