package Y7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: Y7.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0476q {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f8841b = AtomicIntegerFieldUpdater.newUpdater(C0476q.class, "_handled$volatile");
    private volatile /* synthetic */ int _handled$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f8842a;

    public C0476q(Throwable th, boolean z9) {
        this.f8842a = th;
        this._handled$volatile = z9 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f8842a + ']';
    }
}
