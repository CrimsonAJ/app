package u;

/* loaded from: classes.dex */
public final class i extends g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ j f23363h;

    public i(j jVar) {
        this.f23363h = jVar;
    }

    @Override // u.g
    public final String h() {
        h hVar = (h) this.f23363h.f23364a.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f23359a + "]";
    }
}
