package d8;

/* loaded from: classes.dex */
public final class x extends kotlin.jvm.internal.i implements O7.p {

    /* renamed from: e, reason: collision with root package name */
    public static final x f17010e = new x(2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final x f17011f = new x(2, 1);

    /* renamed from: g, reason: collision with root package name */
    public static final x f17012g = new x(2, 2);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17013d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(int i9, int i10) {
        super(i9);
        this.f17013d = i10;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        int i9;
        switch (this.f17013d) {
            case 0:
                E7.g gVar = (E7.g) obj2;
                if (gVar instanceof y) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        i9 = num.intValue();
                    } else {
                        i9 = 1;
                    }
                    if (i9 == 0) {
                        return gVar;
                    }
                    return Integer.valueOf(i9 + 1);
                }
                return obj;
            case 1:
                y yVar = (y) obj;
                E7.g gVar2 = (E7.g) obj2;
                if (yVar == null) {
                    if (gVar2 instanceof y) {
                        return (y) gVar2;
                    }
                    return null;
                }
                return yVar;
            default:
                B b9 = (B) obj;
                E7.g gVar3 = (E7.g) obj2;
                if (gVar3 instanceof y) {
                    y yVar2 = (y) gVar3;
                    Object c3 = yVar2.c(b9.f16962a);
                    int i10 = b9.f16965d;
                    b9.f16963b[i10] = c3;
                    b9.f16965d = i10 + 1;
                    b9.f16964c[i10] = yVar2;
                }
                return b9;
        }
    }
}
