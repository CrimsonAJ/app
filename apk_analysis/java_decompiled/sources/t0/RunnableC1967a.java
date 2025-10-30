package t0;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1967a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f22946b;

    public /* synthetic */ RunnableC1967a(int i9, Object obj) {
        this.f22945a = i9;
        this.f22946b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f22945a) {
            case 0:
                ((C1971e) this.f22946b).l();
                return;
            case 1:
                ((C1975i) this.f22946b).f22997n = -1;
                return;
            default:
                ((C1965A) this.f22946b).a();
                return;
        }
    }
}
