package co.notix;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f13013a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(yh yhVar) {
        super(1);
        this.f13013a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        if (obj != null) {
            this.f13013a.getClass();
            if (kotlin.jvm.internal.p.a(Integer.class).equals(kotlin.jvm.internal.p.a(Float.TYPE))) {
                return Double.valueOf(((Float) obj).floatValue());
            }
            return obj;
        }
        return null;
    }
}
