package y6;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f25079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G6.e f25080c;

    public /* synthetic */ m(p pVar, G6.e eVar, int i9) {
        this.f25078a = i9;
        this.f25079b = pVar;
        this.f25080c = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25078a) {
            case 0:
                this.f25079b.a(this.f25080c);
                return;
            default:
                this.f25079b.a(this.f25080c);
                return;
        }
    }
}
