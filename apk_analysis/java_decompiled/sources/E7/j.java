package E7;

import O7.p;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class j implements i, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final j f1978a = new Object();

    @Override // E7.i
    public final g get(h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // E7.i
    public final i minusKey(h key) {
        kotlin.jvm.internal.h.e(key, "key");
        return this;
    }

    @Override // E7.i
    public final i plus(i context) {
        kotlin.jvm.internal.h.e(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // E7.i
    public final Object fold(Object obj, p pVar) {
        return obj;
    }
}
