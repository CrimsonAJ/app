package Y7;

/* loaded from: classes.dex */
public final class D0 extends d8.t implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public final long f8761e;

    public D0(long j, G7.c cVar) {
        super(cVar, cVar.getContext());
        this.f8761e = j;
    }

    @Override // Y7.r0
    public final String P() {
        return super.P() + "(timeMillis=" + this.f8761e + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        B.k(this.f8795c);
        p(new C0(A0.a.o(new StringBuilder("Timed out waiting for "), this.f8761e, " ms"), this));
    }
}
