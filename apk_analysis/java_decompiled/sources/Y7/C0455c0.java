package Y7;

/* renamed from: Y7.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455c0 implements InterfaceC0457d0 {

    /* renamed from: a, reason: collision with root package name */
    public final O7.l f8801a;

    public C0455c0(O7.l lVar) {
        this.f8801a = lVar;
    }

    @Override // Y7.InterfaceC0457d0
    public final void d(Throwable th) {
        this.f8801a.invoke(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + this.f8801a.getClass().getSimpleName() + '@' + B.l(this) + ']';
    }
}
