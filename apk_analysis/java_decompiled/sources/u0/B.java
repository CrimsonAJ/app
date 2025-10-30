package u0;

/* loaded from: classes.dex */
public final class B extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y f23373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(y yVar, int i9) {
        super(1);
        this.f23372d = i9;
        this.f23373e = yVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        switch (this.f23372d) {
            case 0:
                String key = (String) obj;
                kotlin.jvm.internal.h.e(key, "key");
                return Boolean.valueOf(!this.f23373e.b().contains(key));
            default:
                String key2 = (String) obj;
                kotlin.jvm.internal.h.e(key2, "key");
                return Boolean.valueOf(!this.f23373e.b().contains(key2));
        }
    }
}
