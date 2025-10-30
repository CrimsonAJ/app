package M1;

import L1.S;
import M1.r;
import P.H;
import P.Q;
import W.g;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Y;
import b8.C0718Q;
import com.anilab.android.ui.activity.MainActivity;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import i0.AbstractActivityC1369y;
import i0.AbstractComponentCallbacksC1366v;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import u6.C2083b;

/* loaded from: classes.dex */
public abstract class n<V extends r, B extends W.g> extends AbstractComponentCallbacksC1366v implements View.OnClickListener {

    /* renamed from: v0, reason: collision with root package name */
    public W.g f4727v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f4728w0 = true;

    /* renamed from: x0, reason: collision with root package name */
    public final boolean f4729x0 = true;

    public static void q0(n nVar) {
        nVar.getClass();
        try {
            AbstractC1002u1.A(nVar).m();
        } catch (Exception unused) {
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater inflater, ViewGroup viewGroup) {
        int i9 = 3;
        kotlin.jvm.internal.h.e(inflater, "inflater");
        W.g b9 = W.c.b(inflater, f0(), viewGroup, false);
        kotlin.jvm.internal.h.e(b9, "<set-?>");
        this.f4727v0 = b9;
        e0().i0(t());
        Y7.B.r(Y.f(t()), null, new m(this, null), 3);
        Iterator it = m0(e0()).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(this);
        }
        p0();
        if (g0()) {
            W.g e02 = e0();
            C3.v vVar = new C3.v(i9, this);
            WeakHashMap weakHashMap = Q.f5546a;
            H.l(e02.f7853k, vVar);
        }
        View view = e0().f7853k;
        kotlin.jvm.internal.h.d(view, "getRoot(...)");
        return view;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public void N() {
        this.f18382D = true;
        this.f4728w0 = false;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public void O() {
        this.f18382D = true;
        this.f4728w0 = true;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void S(View view) {
        kotlin.jvm.internal.h.e(view, "view");
        l0();
    }

    public final W.g e0() {
        W.g gVar = this.f4727v0;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.h.h("binding");
        throw null;
    }

    public abstract int f0();

    public boolean g0() {
        return this.f4729x0;
    }

    public abstract r h0();

    public final void i0(int i9, Bundle bundle) {
        try {
            AbstractC1002u1.A(this).j(i9, bundle, null);
        } catch (Exception e8) {
            C2083b.a().b(e8);
        }
    }

    public final void j0(u0.D d9) {
        try {
            AbstractC1002u1.A(this).l(d9);
        } catch (Exception e8) {
            C2083b.a().b(e8);
        }
    }

    public List m0(W.g gVar) {
        return B7.t.f1135a;
    }

    public void n0(boolean z9) {
        MainActivity mainActivity;
        AbstractActivityC1369y k5 = k();
        if (k5 instanceof MainActivity) {
            mainActivity = (MainActivity) k5;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            S V8 = mainActivity.V();
            Boolean valueOf = Boolean.valueOf(z9);
            C0718Q c0718q = V8.f4741e;
            c0718q.getClass();
            c0718q.j(null, valueOf);
        }
    }

    public void o0(E uiText) {
        MainActivity mainActivity;
        kotlin.jvm.internal.h.e(uiText, "uiText");
        AbstractActivityC1369y k5 = k();
        if (k5 instanceof MainActivity) {
            mainActivity = (MainActivity) k5;
        } else {
            mainActivity = null;
        }
        if (mainActivity != null) {
            mainActivity.Z(uiText);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f4728w0 && view != null) {
            k0(view.getId());
        }
    }

    public abstract void p0();

    public void l0() {
    }

    public void k0(int i9) {
    }
}
