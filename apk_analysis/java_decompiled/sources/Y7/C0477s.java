package Y7;

/* renamed from: Y7.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0477s extends kotlin.jvm.internal.i implements O7.p {

    /* renamed from: e, reason: collision with root package name */
    public static final C0477s f8850e = new C0477s(2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final C0477s f8851f = new C0477s(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8852d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0477s(int i9, int i10) {
        super(i9);
        this.f8852d = i10;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8852d) {
            case 0:
                return ((E7.i) obj).plus((E7.g) obj2);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            default:
                return ((E7.i) obj).plus((E7.g) obj2);
        }
    }
}
