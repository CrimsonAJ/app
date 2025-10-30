package G7;

import kotlin.jvm.internal.p;
import kotlin.jvm.internal.q;

/* loaded from: classes.dex */
public abstract class i extends h implements kotlin.jvm.internal.e {

    /* renamed from: r, reason: collision with root package name */
    public final int f2911r;

    public i(E7.d dVar) {
        super(dVar);
        this.f2911r = 2;
    }

    @Override // kotlin.jvm.internal.e
    public final int getArity() {
        return this.f2911r;
    }

    @Override // G7.a
    public final String toString() {
        if (getCompletion() == null) {
            p.f20160a.getClass();
            String a5 = q.a(this);
            kotlin.jvm.internal.h.d(a5, "renderLambdaToString(...)");
            return a5;
        }
        return super.toString();
    }
}
