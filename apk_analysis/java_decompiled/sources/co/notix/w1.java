package co.notix;

/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.i implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yh f13397a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(yh yhVar) {
        super(1);
        this.f13397a = yhVar;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        if (obj != null) {
            this.f13397a.getClass();
            if (kotlin.jvm.internal.p.a(Integer.class).equals(kotlin.jvm.internal.p.a(Float.TYPE))) {
                return Double.valueOf(((Float) obj).floatValue());
            }
            return obj;
        }
        return null;
    }
}
