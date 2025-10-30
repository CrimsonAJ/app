package O;

/* loaded from: classes.dex */
public final class d extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Object f5253d;

    public d(int i9) {
        super(i9);
        this.f5253d = new Object();
    }

    @Override // O.c
    public final Object a() {
        Object a5;
        synchronized (this.f5253d) {
            a5 = super.a();
        }
        return a5;
    }

    @Override // O.c
    public final boolean c(Object obj) {
        boolean c3;
        synchronized (this.f5253d) {
            c3 = super.c(obj);
        }
        return c3;
    }
}
