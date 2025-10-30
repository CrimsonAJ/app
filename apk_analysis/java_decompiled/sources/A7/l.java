package A7;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class l implements e, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public O7.a f554a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f555b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f556c;

    public l(O7.a initializer) {
        kotlin.jvm.internal.h.e(initializer, "initializer");
        this.f554a = initializer;
        this.f555b = m.f557a;
        this.f556c = this;
    }

    @Override // A7.e
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f555b;
        m mVar = m.f557a;
        if (obj2 != mVar) {
            return obj2;
        }
        synchronized (this.f556c) {
            obj = this.f555b;
            if (obj == mVar) {
                O7.a aVar = this.f554a;
                kotlin.jvm.internal.h.b(aVar);
                obj = aVar.invoke();
                this.f555b = obj;
                this.f554a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        if (this.f555b != m.f557a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
