package F4;

/* loaded from: classes.dex */
public final class z extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final B4.b f2459a;

    public z(B4.b bVar) {
        boolean z9;
        if (bVar.f685b != 0 && bVar.f686c != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        y.a("ResolvableConnectionException can only be created with a connection result containing a resolution.", z9);
        this.f2459a = bVar;
    }
}
