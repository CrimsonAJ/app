package L;

import Y7.C0464h;
import a.AbstractC0485a;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class e extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final C0464h f4444a;

    public e(C0464h c0464h) {
        super(false);
        this.f4444a = c0464h;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f4444a.resumeWith(AbstractC0485a.h(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f4444a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
