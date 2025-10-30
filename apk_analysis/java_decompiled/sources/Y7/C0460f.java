package Y7;

import java.util.concurrent.ScheduledFuture;

/* renamed from: Y7.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0460f implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8807a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8808b;

    public /* synthetic */ C0460f(int i9, Object obj) {
        this.f8807a = i9;
        this.f8808b = obj;
    }

    public final String toString() {
        switch (this.f8807a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f8808b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((O7.l) this.f8808b).getClass().getSimpleName() + '@' + B.l(this) + ']';
            default:
                return "DisposeOnCancel[" + ((M) this.f8808b) + ']';
        }
    }
}
