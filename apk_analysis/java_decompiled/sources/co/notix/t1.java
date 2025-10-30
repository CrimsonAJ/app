package co.notix;

/* loaded from: classes.dex */
public final class t1 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f13200a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(yh yhVar) {
        super(1);
        this.f13200a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        if (obj != null) {
            this.f13200a.getClass();
            if (kotlin.jvm.internal.p.a(Integer.class).equals(kotlin.jvm.internal.p.a(Float.TYPE))) {
                return Double.valueOf(((Float) obj).floatValue());
            }
            return obj;
        }
        return null;
    }
}
