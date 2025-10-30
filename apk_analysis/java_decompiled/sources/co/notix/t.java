package co.notix;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public static final t f13198a = new t();

    public t() {
        super(1);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        int i9;
        Integer num = (Integer) obj;
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = 0;
        }
        return Integer.valueOf(i9 + 1);
    }
}
