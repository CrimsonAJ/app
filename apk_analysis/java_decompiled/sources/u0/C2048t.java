package u0;

/* renamed from: u0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2048t extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f23536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2048t(String str, int i9) {
        super(1);
        this.f23535d = i9;
        this.f23536e = str;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        switch (this.f23535d) {
            case 0:
                return Boolean.valueOf(kotlin.jvm.internal.h.a((String) obj, this.f23536e));
            default:
                A7.h it = (A7.h) obj;
                kotlin.jvm.internal.h.e(it, "it");
                return Boolean.valueOf(kotlin.jvm.internal.h.a(it.f547a, this.f23536e));
        }
    }
}
