package n2;

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

/* renamed from: n2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1619e<B extends W.g, V extends r> extends M1.g<B, V> implements InterfaceC2180b {

    /* renamed from: N0, reason: collision with root package name */
    public ContextWrapper f21054N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f21055O0;

    /* renamed from: P0, reason: collision with root package name */
    public volatile C2118f f21056P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final Object f21057Q0 = new Object();

    /* renamed from: R0, reason: collision with root package name */
    public boolean f21058R0 = false;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void D(Activity activity) {
        boolean z9;
        this.f18382D = true;
        ContextWrapper contextWrapper = this.f21054N0;
        if (contextWrapper != null && C2118f.b(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        s8.e.h(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        if (!this.f21058R0) {
            this.f21058R0 = true;
            ((InterfaceC1618d) e()).getClass();
        }
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void E(Context context) {
        super.E(context);
        s0();
        if (!this.f21058R0) {
            this.f21058R0 = true;
            ((InterfaceC1618d) e()).getClass();
        }
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final LayoutInflater K(Bundle bundle) {
        LayoutInflater K = super.K(bundle);
        return K.cloneInContext(new C2120h(K, this));
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        if (this.f21056P0 == null) {
            synchronized (this.f21057Q0) {
                try {
                    if (this.f21056P0 == null) {
                        this.f21056P0 = new C2118f(this);
                    }
                } finally {
                }
            }
        }
        return this.f21056P0.e();
    }

    @Override // i0.AbstractComponentCallbacksC1366v, androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        return Z0.a.i(this, super.j());
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final Context m() {
        if (super.m() == null && !this.f21055O0) {
            return null;
        }
        s0();
        return this.f21054N0;
    }

    public final void s0() {
        if (this.f21054N0 == null) {
            this.f21054N0 = new C2120h(super.m(), this);
            this.f21055O0 = AbstractC0485a.t(super.m());
        }
    }
}
