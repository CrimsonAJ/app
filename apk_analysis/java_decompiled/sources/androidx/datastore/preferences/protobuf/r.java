package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class r implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0533t f9763a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0533t f9764b;

    public r(AbstractC0533t abstractC0533t) {
        this.f9763a = abstractC0533t;
        if (!abstractC0533t.g()) {
            this.f9764b = abstractC0533t.i();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public final AbstractC0533t b() {
        AbstractC0533t c3 = c();
        c3.getClass();
        if (AbstractC0533t.f(c3, true)) {
            return c3;
        }
        throw new Z();
    }

    public final AbstractC0533t c() {
        if (!this.f9764b.g()) {
            return this.f9764b;
        }
        AbstractC0533t abstractC0533t = this.f9764b;
        abstractC0533t.getClass();
        P p9 = P.f9654c;
        p9.getClass();
        p9.a(abstractC0533t.getClass()).b(abstractC0533t);
        abstractC0533t.h();
        return this.f9764b;
    }

    public final Object clone() {
        r rVar = (r) this.f9763a.c(5);
        rVar.f9764b = c();
        return rVar;
    }

    public final void e() {
        if (!this.f9764b.g()) {
            AbstractC0533t i9 = this.f9763a.i();
            AbstractC0533t abstractC0533t = this.f9764b;
            P p9 = P.f9654c;
            p9.getClass();
            p9.a(i9.getClass()).a(i9, abstractC0533t);
            this.f9764b = i9;
        }
    }
}
