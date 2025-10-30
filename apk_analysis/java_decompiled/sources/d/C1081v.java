package d;

/* renamed from: d.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081v implements InterfaceC1062c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1073n f16625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1082w f16626b;

    public C1081v(C1082w c1082w, AbstractC1073n onBackPressedCallback) {
        kotlin.jvm.internal.h.e(onBackPressedCallback, "onBackPressedCallback");
        this.f16626b = c1082w;
        this.f16625a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.g, O7.a] */
    @Override // d.InterfaceC1062c
    public final void cancel() {
        C1082w c1082w = this.f16626b;
        B7.i iVar = c1082w.f16628b;
        AbstractC1073n abstractC1073n = this.f16625a;
        iVar.remove(abstractC1073n);
        if (kotlin.jvm.internal.h.a(c1082w.f16629c, abstractC1073n)) {
            abstractC1073n.getClass();
            c1082w.f16629c = null;
        }
        abstractC1073n.f16607b.remove(this);
        ?? r0 = abstractC1073n.f16608c;
        if (r0 != 0) {
            r0.invoke();
        }
        abstractC1073n.f16608c = null;
    }
}
