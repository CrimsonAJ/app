package M1;

import M1.r;
import W.g;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g<B extends W.g, V extends r> extends m5.g implements View.OnClickListener {

    /* renamed from: L0, reason: collision with root package name */
    public W.g f4713L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f4714M0 = true;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.h.e(inflater, "inflater");
        W.g b9 = W.c.b(inflater, n0(), viewGroup, false);
        kotlin.jvm.internal.h.e(b9, "<set-?>");
        this.f4713L0 = b9;
        r0();
        p0();
        Iterator it = q0(m0()).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(this);
        }
        return m0().f7853k;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void N() {
        this.f18382D = true;
        this.f4714M0 = false;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void O() {
        Window window;
        this.f18382D = true;
        this.f4714M0 = true;
        Dialog dialog = this.f18349G0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // m5.g, i.z, i0.DialogInterfaceOnCancelListenerC1358n
    public final Dialog g0(Bundle bundle) {
        Dialog g02 = super.g0(bundle);
        g02.setOnShowListener(new f(0));
        return g02;
    }

    public final W.g m0() {
        W.g gVar = this.f4713L0;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.h.h("binding");
        throw null;
    }

    public abstract int n0();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f4714M0 && view != null) {
            o0(view.getId());
        }
    }

    public List q0(W.g gVar) {
        return B7.t.f1135a;
    }

    public abstract void r0();

    public void p0() {
    }

    public void o0(int i9) {
    }
}
