package G7;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public abstract class j extends c implements kotlin.jvm.internal.e {
    private final int arity;

    public j(int i9, E7.d dVar) {
        super(dVar);
        this.arity = i9;
    }

    @Override // kotlin.jvm.internal.e
    public int getArity() {
        return this.arity;
    }

    @Override // G7.a
    public String toString() {
        if (getCompletion() == null) {
            p.f20160a.getClass();
            String a5 = q.a(this);
            kotlin.jvm.internal.h.d(a5, "renderLambdaToString(...)");
            return a5;
        }
        return super.toString();
    }
}
