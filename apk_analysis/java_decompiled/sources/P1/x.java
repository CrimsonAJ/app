package P1;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5753a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H2.c f5754b;

    public /* synthetic */ x(H2.c cVar, int i9) {
        this.f5753a = i9;
        this.f5754b = cVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        H2.c cVar = (H2.c) obj;
        switch (this.f5753a) {
            case 0:
                return Boolean.valueOf(kotlin.jvm.internal.h.a(cVar.f2997m, this.f5754b.f2986a));
            default:
                return Boolean.valueOf(kotlin.jvm.internal.h.a(cVar.f2986a, this.f5754b.f2986a));
        }
    }
}
