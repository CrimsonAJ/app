package co.notix;

/* loaded from: classes.dex */
public final class ti extends kotlin.jvm.internal.i implements O7.l {
    public ti(ic icVar) {
        super(1);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        if (kotlin.jvm.internal.p.a(ni.class).equals(kotlin.jvm.internal.p.a(Float.TYPE))) {
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type kotlin.Float");
            return Double.valueOf(((Float) obj).floatValue());
        }
        return obj;
    }
}
