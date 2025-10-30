package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class i implements e, Serializable {
    private final int arity;

    public i(int i9) {
        this.arity = i9;
    }

    @Override // kotlin.jvm.internal.e
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        p.f20160a.getClass();
        String a5 = q.a(this);
        h.d(a5, "renderLambdaToString(...)");
        return a5;
    }
}
