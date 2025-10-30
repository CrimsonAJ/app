package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.res.Configuration;
import android.os.Bundle;
import i0.DialogInterfaceOnCancelListenerC1358n;
import t0.C1988w;

/* loaded from: classes.dex */
public class t extends DialogInterfaceOnCancelListenerC1358n {

    /* renamed from: L0, reason: collision with root package name */
    public final boolean f10182L0 = false;

    /* renamed from: M0, reason: collision with root package name */
    public i.y f10183M0;

    /* renamed from: N0, reason: collision with root package name */
    public C1988w f10184N0;

    public t() {
        i0(true);
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void R() {
        super.R();
        i.y yVar = this.f10183M0;
        if (yVar != null && !this.f10182L0) {
            ((s) yVar).i(false);
        }
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public final Dialog g0(Bundle bundle) {
        if (this.f10182L0) {
            N n7 = new N(m());
            this.f10183M0 = n7;
            n7.i(this.f10184N0);
        } else {
            this.f10183M0 = new s(m());
        }
        return this.f10183M0;
    }

    @Override // i0.AbstractComponentCallbacksC1366v, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f18382D = true;
        i.y yVar = this.f10183M0;
        if (yVar != null) {
            if (this.f10182L0) {
                ((N) yVar).j();
            } else {
                ((s) yVar).r();
            }
        }
    }
}
