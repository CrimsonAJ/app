package M1;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4751a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f4752b;

    public t(Object value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f4751a = value;
        this.f4752b = new AtomicBoolean(false);
    }

    public final Object a() {
        if (this.f4752b.compareAndSet(false, true)) {
            return this.f4751a;
        }
        return null;
    }
}
