package H1;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2964a;

    @Override // H1.i
    public boolean a() {
        return this.f2964a;
    }

    @Override // H1.i
    public boolean b(D1.h hVar) {
        return this.f2964a;
    }

    public synchronized void c() {
        this.f2964a = false;
    }

    public synchronized boolean d() {
        if (this.f2964a) {
            return false;
        }
        this.f2964a = true;
        notifyAll();
        return true;
    }
}
