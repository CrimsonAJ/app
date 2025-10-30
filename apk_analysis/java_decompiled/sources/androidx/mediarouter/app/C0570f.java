package androidx.mediarouter.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import co.notix.R;
import i0.DialogInterfaceOnCancelListenerC1358n;
import l6.AbstractC1570b;
import t0.C1988w;

/* renamed from: androidx.mediarouter.app.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0570f extends DialogInterfaceOnCancelListenerC1358n {

    /* renamed from: L0, reason: collision with root package name */
    public final boolean f10090L0 = false;

    /* renamed from: M0, reason: collision with root package name */
    public i.y f10091M0;

    /* renamed from: N0, reason: collision with root package name */
    public C1988w f10092N0;

    public C0570f() {
        i0(true);
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public final Dialog g0(Bundle bundle) {
        if (this.f10090L0) {
            A a5 = new A(m());
            this.f10091M0 = a5;
            l0();
            a5.g(this.f10092N0);
        } else {
            DialogC0569e dialogC0569e = new DialogC0569e(m());
            this.f10091M0 = dialogC0569e;
            l0();
            dialogC0569e.h(this.f10092N0);
        }
        return this.f10091M0;
    }

    public final void l0() {
        if (this.f10092N0 == null) {
            Bundle bundle = this.f18390f;
            if (bundle != null) {
                this.f10092N0 = C1988w.b(bundle.getBundle("selector"));
            }
            if (this.f10092N0 == null) {
                this.f10092N0 = C1988w.f23046c;
            }
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        int e8;
        this.f18382D = true;
        i.y yVar = this.f10091M0;
        if (yVar == null) {
            return;
        }
        int i9 = -2;
        if (this.f10090L0) {
            A a5 = (A) yVar;
            Context context = a5.f9925h;
            if (!context.getResources().getBoolean(R.bool.is_tablet)) {
                e8 = -1;
            } else {
                e8 = AbstractC1570b.e(context);
            }
            if (!context.getResources().getBoolean(R.bool.is_tablet)) {
                i9 = -1;
            }
            a5.getWindow().setLayout(e8, i9);
            return;
        }
        DialogC0569e dialogC0569e = (DialogC0569e) yVar;
        dialogC0569e.getWindow().setLayout(AbstractC1570b.e(dialogC0569e.getContext()), -2);
    }
}
