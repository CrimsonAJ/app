package Y7;

/* loaded from: classes.dex */
public final class P extends S {

    /* renamed from: c, reason: collision with root package name */
    public final C0464h f8779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ U f8780d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(U u9, long j, C0464h c0464h) {
        super(j);
        this.f8780d = u9;
        this.f8779c = c0464h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8779c.B(this.f8780d);
    }

    @Override // Y7.S
    public final String toString() {
        return super.toString() + this.f8779c;
    }
}
