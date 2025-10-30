package i0;

import android.os.Bundle;

/* renamed from: i0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1360p extends AbstractC1364t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC1366v f18360a;

    public C1360p(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        this.f18360a = abstractComponentCallbacksC1366v;
    }

    @Override // i0.AbstractC1364t
    public final void a() {
        Bundle bundle;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18360a;
        abstractComponentCallbacksC1366v.f18412q0.a();
        androidx.lifecycle.Y.e(abstractComponentCallbacksC1366v);
        Bundle bundle2 = abstractComponentCallbacksC1366v.f18386b;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        abstractComponentCallbacksC1366v.f18412q0.b(bundle);
    }
}
