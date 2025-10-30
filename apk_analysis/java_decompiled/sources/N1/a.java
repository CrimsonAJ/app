package N1;

import M1.r;
import W.g;
import a.AbstractC0485a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.h0;
import v7.C2118f;
import v7.C2120h;
import x7.InterfaceC2180b;

/* loaded from: classes.dex */
public abstract class a<V extends M1.r, B extends W.g> extends M1.n<V, B> implements InterfaceC2180b {

    /* renamed from: A0, reason: collision with root package name */
    public volatile C2118f f4826A0;

    /* renamed from: B0, reason: collision with root package name */
    public final Object f4827B0 = new Object();

    /* renamed from: C0, reason: collision with root package name */
    public boolean f4828C0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public C2120h f4829y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f4830z0;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void D(Activity activity) {
        boolean z9;
        this.f18382D = true;
        C2120h c2120h = this.f4829y0;
        if (c2120h != null && C2118f.b(c2120h) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        s8.e.h(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        r0();
        if (!this.f4828C0) {
            this.f4828C0 = true;
            ((v) e()).getClass();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void E(Context context) {
        super.E(context);
        r0();
        if (!this.f4828C0) {
            this.f4828C0 = true;
            ((v) e()).getClass();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final LayoutInflater K(Bundle bundle) {
        LayoutInflater K = super.K(bundle);
        return K.cloneInContext(new C2120h(K, this));
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        if (this.f4826A0 == null) {
            synchronized (this.f4827B0) {
                try {
                    if (this.f4826A0 == null) {
                        this.f4826A0 = new C2118f(this);
                    }
                } finally {
                }
            }
        }
        return this.f4826A0.e();
    }

    @Override // i0.AbstractComponentCallbacksC1366v, androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        return Z0.a.i(this, super.j());
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final Context m() {
        if (super.m() == null && !this.f4830z0) {
            return null;
        }
        r0();
        return this.f4829y0;
    }

    public final void r0() {
        if (this.f4829y0 == null) {
            this.f4829y0 = new C2120h(super.m(), this);
            this.f4830z0 = AbstractC0485a.t(super.m());
        }
    }
}
