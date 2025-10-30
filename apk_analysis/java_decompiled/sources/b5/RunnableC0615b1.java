package b5;

/* renamed from: b5.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0615b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0612a1 f11039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0612a1 f11040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0621d1 f11043e;

    public RunnableC0615b1(C0621d1 c0621d1, C0612a1 c0612a1, C0612a1 c0612a12, long j, boolean z9) {
        this.f11039a = c0612a1;
        this.f11040b = c0612a12;
        this.f11041c = j;
        this.f11042d = z9;
        this.f11043e = c0621d1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11043e.q0(this.f11039a, this.f11040b, this.f11041c, this.f11042d, null);
    }
}
