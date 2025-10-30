package i8;

/* renamed from: i8.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1416f extends x8.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1417g f19083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ J5.k f19084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1416f(C1417g c1417g, J5.k kVar, x8.G g9) {
        super(g9);
        this.f19083b = c1417g;
        this.f19084c = kVar;
    }

    @Override // x8.o, x8.G, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C1417g c1417g = this.f19083b;
        J5.k kVar = this.f19084c;
        synchronized (c1417g) {
            if (kVar.f4223a) {
                return;
            }
            kVar.f4223a = true;
            super.close();
            ((A6.t) this.f19084c.f4224b).c();
        }
    }
}
