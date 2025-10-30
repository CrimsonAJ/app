package h2;

import M1.n;
import M1.r;
import W.g;
import a.AbstractC0485a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.h0;
import v7.C2118f;
import v7.C2120h;
import x7.InterfaceC2180b;

/* renamed from: h2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1269a<V extends r, B extends W.g> extends n<V, B> implements InterfaceC2180b {

    /* renamed from: A0, reason: collision with root package name */
    public volatile C2118f f17863A0;

    /* renamed from: B0, reason: collision with root package name */
    public final Object f17864B0 = new Object();

    /* renamed from: C0, reason: collision with root package name */
    public boolean f17865C0 = false;

    /* renamed from: y0, reason: collision with root package name */
    public ContextWrapper f17866y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f17867z0;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void D(Activity activity) {
        boolean z9;
        this.f18382D = true;
        ContextWrapper contextWrapper = this.f17866y0;
        if (contextWrapper != null && C2118f.b(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        s8.e.h(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        r0();
        if (!this.f17865C0) {
            this.f17865C0 = true;
            ((InterfaceC1274f) e()).getClass();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void E(Context context) {
        super.E(context);
        r0();
        if (!this.f17865C0) {
            this.f17865C0 = true;
            ((InterfaceC1274f) e()).getClass();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final LayoutInflater K(Bundle bundle) {
        LayoutInflater K = super.K(bundle);
        return K.cloneInContext(new C2120h(K, this));
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        if (this.f17863A0 == null) {
            synchronized (this.f17864B0) {
                try {
                    if (this.f17863A0 == null) {
                        this.f17863A0 = new C2118f(this);
                    }
                } finally {
                }
            }
        }
        return this.f17863A0.e();
    }

    @Override // i0.AbstractComponentCallbacksC1366v, androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        return Z0.a.i(this, super.j());
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final Context m() {
        if (super.m() == null && !this.f17867z0) {
            return null;
        }
        r0();
        return this.f17866y0;
    }

    public final void r0() {
        if (this.f17866y0 == null) {
            this.f17866y0 = new C2120h(super.m(), this);
            this.f17867z0 = AbstractC0485a.t(super.m());
        }
    }
}
