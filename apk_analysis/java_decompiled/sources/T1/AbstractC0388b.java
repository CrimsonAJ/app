package T1;

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

/* renamed from: T1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0388b<B extends W.g, V extends M1.r> extends M1.g<B, V> implements InterfaceC2180b {

    /* renamed from: N0, reason: collision with root package name */
    public ContextWrapper f7004N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f7005O0;

    /* renamed from: P0, reason: collision with root package name */
    public volatile C2118f f7006P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final Object f7007Q0 = new Object();

    /* renamed from: R0, reason: collision with root package name */
    public boolean f7008R0 = false;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void D(Activity activity) {
        boolean z9;
        this.f18382D = true;
        ContextWrapper contextWrapper = this.f7004N0;
        if (contextWrapper != null && C2118f.b(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        s8.e.h(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        if (!this.f7008R0) {
            this.f7008R0 = true;
            ((z) e()).getClass();
        }
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void E(Context context) {
        super.E(context);
        s0();
        if (!this.f7008R0) {
            this.f7008R0 = true;
            ((z) e()).getClass();
        }
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final LayoutInflater K(Bundle bundle) {
        LayoutInflater K = super.K(bundle);
        return K.cloneInContext(new C2120h(K, this));
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        if (this.f7006P0 == null) {
            synchronized (this.f7007Q0) {
                try {
                    if (this.f7006P0 == null) {
                        this.f7006P0 = new C2118f(this);
                    }
                } finally {
                }
            }
        }
        return this.f7006P0.e();
    }

    @Override // i0.AbstractComponentCallbacksC1366v, androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        return Z0.a.i(this, super.j());
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final Context m() {
        if (super.m() == null && !this.f7005O0) {
            return null;
        }
        s0();
        return this.f7004N0;
    }

    public final void s0() {
        if (this.f7004N0 == null) {
            this.f7004N0 = new C2120h(super.m(), this);
            this.f7005O0 = AbstractC0485a.t(super.m());
        }
    }
}
