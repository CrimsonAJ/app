package co.notix;

/* loaded from: classes.dex */
public final class mk extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f12787a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk(yh yhVar) {
        super(1);
        this.f12787a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        if (obj != null) {
            this.f12787a.getClass();
            if (kotlin.jvm.internal.p.a(Integer.class).equals(kotlin.jvm.internal.p.a(Float.TYPE))) {
                return Double.valueOf(((Float) obj).floatValue());
            }
            return obj;
        }
        return null;
    }
}
