package b2;

import M1.B;
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

/* renamed from: b2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0588a<V extends M1.r, B extends W.g> extends B<V, B> implements InterfaceC2180b {

    /* renamed from: A0, reason: collision with root package name */
    public ContextWrapper f10472A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f10473B0;

    /* renamed from: C0, reason: collision with root package name */
    public volatile C2118f f10474C0;

    /* renamed from: D0, reason: collision with root package name */
    public final Object f10475D0 = new Object();

    /* renamed from: E0, reason: collision with root package name */
    public boolean f10476E0 = false;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void D(Activity activity) {
        boolean z9;
        this.f18382D = true;
        ContextWrapper contextWrapper = this.f10472A0;
        if (contextWrapper != null && C2118f.b(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        s8.e.h(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        w0();
        if (!this.f10476E0) {
            this.f10476E0 = true;
            ((InterfaceC0596i) e()).getClass();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void E(Context context) {
        super.E(context);
        w0();
        if (!this.f10476E0) {
            this.f10476E0 = true;
            ((InterfaceC0596i) e()).getClass();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final LayoutInflater K(Bundle bundle) {
        LayoutInflater K = super.K(bundle);
        return K.cloneInContext(new C2120h(K, this));
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        if (this.f10474C0 == null) {
            synchronized (this.f10475D0) {
                try {
                    if (this.f10474C0 == null) {
                        this.f10474C0 = new C2118f(this);
                    }
                } finally {
                }
            }
        }
        return this.f10474C0.e();
    }

    @Override // i0.AbstractComponentCallbacksC1366v, androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        return Z0.a.i(this, super.j());
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final Context m() {
        if (super.m() == null && !this.f10473B0) {
            return null;
        }
        w0();
        return this.f10472A0;
    }

    public final void w0() {
        if (this.f10472A0 == null) {
            this.f10472A0 = new C2120h(super.m(), this);
            this.f10473B0 = AbstractC0485a.t(super.m());
        }
    }
}
