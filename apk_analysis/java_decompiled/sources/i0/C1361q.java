package i0;

import B6.u0;
import android.view.View;

/* renamed from: i0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361q extends u0 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractComponentCallbacksC1366v f18361n;

    public C1361q(AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v) {
        this.f18361n = abstractComponentCallbacksC1366v;
    }

    @Override // B6.u0
    public final View G(int i9) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = this.f18361n;
        View view = abstractComponentCallbacksC1366v.Y;
        if (view != null) {
            return view.findViewById(i9);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC1366v + " does not have a view");
    }

    @Override // B6.u0
    public final boolean H() {
        if (this.f18361n.Y != null) {
            return true;
        }
        return false;
    }
}
