package u;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public Object f23359a;

    /* renamed from: b, reason: collision with root package name */
    public j f23360b;

    /* renamed from: c, reason: collision with root package name */
    public k f23361c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f23362d;

    public final void finalize() {
        k kVar;
        j jVar = this.f23360b;
        if (jVar != null) {
            i iVar = jVar.f23365b;
            if (!iVar.isDone()) {
                iVar.k(new S5.b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f23359a, 3));
            }
        }
        if (!this.f23362d && (kVar = this.f23361c) != null) {
            kVar.j(null);
        }
    }
}
