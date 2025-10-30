package co.notix;

/* loaded from: classes.dex */
public final class nn extends kotlin.jvm.internal.i implements O7.l {
    public nn(ic icVar) {
        super(1);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        if (kotlin.jvm.internal.p.a(qo.class).equals(kotlin.jvm.internal.p.a(Float.TYPE))) {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlin.Float");
            return Double.valueOf(((Float) obj).floatValue());
        }
        return obj;
    }
}
