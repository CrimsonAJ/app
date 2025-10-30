package z8;

/* renamed from: z8.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2270t extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2255d f25634e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2270t(InterfaceC2255d interfaceC2255d, int i9) {
        super(1);
        this.f25633d = i9;
        this.f25634e = interfaceC2255d;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        switch (this.f25633d) {
            case 0:
                this.f25634e.cancel();
                return A7.n.f558a;
            case 1:
                this.f25634e.cancel();
                return A7.n.f558a;
            default:
                this.f25634e.cancel();
                return A7.n.f558a;
        }
    }
}
