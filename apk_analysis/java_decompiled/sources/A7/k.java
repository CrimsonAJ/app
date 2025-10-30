package A7;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class k implements e, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f551c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile O7.a f552a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f553b;

    @Override // A7.e
    public final Object getValue() {
        Object obj = this.f553b;
        m mVar = m.f557a;
        if (obj != mVar) {
            return obj;
        }
        O7.a aVar = this.f552a;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f551c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, mVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != mVar) {
                }
            }
            this.f552a = null;
            return invoke;
        }
        return this.f553b;
    }

    public final String toString() {
        if (this.f553b != m.f557a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
