package X;

/* loaded from: classes.dex */
public final class c0 implements E7.g {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f8054a;

    /* renamed from: b, reason: collision with root package name */
    public final O f8055b;

    public c0(c0 c0Var, O instance) {
        kotlin.jvm.internal.h.e(instance, "instance");
        this.f8054a = c0Var;
        this.f8055b = instance;
    }

    public final void b(O o9) {
        if (this.f8055b != o9) {
            c0 c0Var = this.f8054a;
            if (c0Var != null) {
                c0Var.b(o9);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // E7.i
    public final Object fold(Object obj, O7.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // E7.i
    public final E7.g get(E7.h hVar) {
        return O4.h.r(this, hVar);
    }

    @Override // E7.g
    public final E7.h getKey() {
        return b0.f8051a;
    }

    @Override // E7.i
    public final E7.i minusKey(E7.h hVar) {
        return O4.h.B(this, hVar);
    }

    @Override // E7.i
    public final E7.i plus(E7.i iVar) {
        return O4.h.D(this, iVar);
    }
}
