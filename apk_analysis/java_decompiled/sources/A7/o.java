package A7;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class o implements e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public O7.a f559a;

    /* renamed from: b, reason: collision with root package name */
    public Object f560b;

    @Override // A7.e
    public final Object getValue() {
        if (this.f560b == m.f557a) {
            O7.a aVar = this.f559a;
            kotlin.jvm.internal.h.b(aVar);
            this.f560b = aVar.invoke();
            this.f559a = null;
        }
        return this.f560b;
    }

    public final String toString() {
        if (this.f560b != m.f557a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
