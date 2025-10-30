package com.anilab.android.ui.update;

import A7.e;
import A7.f;
import J1.AbstractC0203u;
import W.c;
import Y2.r;
import Z0.a;
import a.AbstractC0485a;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;
import androidx.lifecycle.h0;
import co.notix.R;
import com.anilab.android.ui.update.CommonErrorDialogFragment;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import i0.AbstractActivityC1369y;
import i0.DialogInterfaceOnCancelListenerC1358n;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import o2.C1688o;
import o2.C1689p;
import q2.C1874c;
import q2.InterfaceC1873b;
import v7.C2118f;
import v7.C2120h;
import x7.InterfaceC2180b;

/* loaded from: classes.dex */
public final class CommonErrorDialogFragment extends DialogInterfaceOnCancelListenerC1358n implements InterfaceC2180b {

    /* renamed from: L0, reason: collision with root package name */
    public ContextWrapper f13839L0;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f13840M0;

    /* renamed from: N0, reason: collision with root package name */
    public volatile C2118f f13841N0;

    /* renamed from: O0, reason: collision with root package name */
    public final Object f13842O0 = new Object();

    /* renamed from: P0, reason: collision with root package name */
    public boolean f13843P0 = false;

    /* renamed from: Q0, reason: collision with root package name */
    public AbstractC0203u f13844Q0;

    /* renamed from: R0, reason: collision with root package name */
    public final r f13845R0;

    public CommonErrorDialogFragment() {
        e p9 = a.p(f.f545a, new e2.e(23, new e2.e(22, this)));
        this.f13845R0 = M4.a.i(this, p.a(C1874c.class), new C1688o(p9, 4), new C1688o(p9, 5), new C1689p(this, p9, 2));
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void D(Activity activity) {
        boolean z9;
        this.f18382D = true;
        ContextWrapper contextWrapper = this.f13839L0;
        if (contextWrapper != null && C2118f.b(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        s8.e.h(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l0();
        if (!this.f13843P0) {
            this.f13843P0 = true;
            ((InterfaceC1873b) e()).getClass();
        }
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void E(Context context) {
        super.E(context);
        l0();
        if (!this.f13843P0) {
            this.f13843P0 = true;
            ((InterfaceC1873b) e()).getClass();
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater inflater, ViewGroup viewGroup) {
        final int i9 = 1;
        final int i10 = 0;
        h.e(inflater, "inflater");
        int i11 = AbstractC0203u.f4093y;
        this.f13844Q0 = (AbstractC0203u) c.b(inflater, R.layout.dialog_common_error, viewGroup, false);
        i0(false);
        AbstractC0203u abstractC0203u = this.f13844Q0;
        if (abstractC0203u != null) {
            abstractC0203u.f4096x.setMovementMethod(LinkMovementMethod.getInstance());
            AbstractC0203u abstractC0203u2 = this.f13844Q0;
            if (abstractC0203u2 != null) {
                abstractC0203u2.f4096x.setText(s(R.string.msg_common_error, ((C1874c) this.f13845R0.getValue()).f22239g));
                AbstractC0203u abstractC0203u3 = this.f13844Q0;
                if (abstractC0203u3 != null) {
                    abstractC0203u3.f4094v.setOnClickListener(new View.OnClickListener(this) { // from class: q2.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ CommonErrorDialogFragment f22237b;

                        {
                            this.f22237b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            PackageManager packageManager;
                            switch (i10) {
                                case 0:
                                    CommonErrorDialogFragment commonErrorDialogFragment = this.f22237b;
                                    try {
                                        AbstractActivityC1369y k5 = commonErrorDialogFragment.k();
                                        if (k5 != null) {
                                            packageManager = k5.getPackageManager();
                                        } else {
                                            packageManager = null;
                                        }
                                        Intent S8 = v4.e.S(packageManager, ((C1874c) commonErrorDialogFragment.f13845R0.getValue()).f22238f);
                                        kotlin.jvm.internal.h.b(S8);
                                        commonErrorDialogFragment.d0(S8);
                                        return;
                                    } catch (Exception unused) {
                                        Toast.makeText(commonErrorDialogFragment.m(), R.string.msg_unknown_error, 0).show();
                                        return;
                                    }
                                default:
                                    try {
                                        AbstractC1002u1.A(this.f22237b).j(R.id.gotoSplash, null, null);
                                        return;
                                    } catch (Exception unused2) {
                                        return;
                                    }
                            }
                        }
                    });
                    AbstractC0203u abstractC0203u4 = this.f13844Q0;
                    if (abstractC0203u4 != null) {
                        abstractC0203u4.f4095w.setOnClickListener(new View.OnClickListener(this) { // from class: q2.a

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ CommonErrorDialogFragment f22237b;

                            {
                                this.f22237b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                PackageManager packageManager;
                                switch (i9) {
                                    case 0:
                                        CommonErrorDialogFragment commonErrorDialogFragment = this.f22237b;
                                        try {
                                            AbstractActivityC1369y k5 = commonErrorDialogFragment.k();
                                            if (k5 != null) {
                                                packageManager = k5.getPackageManager();
                                            } else {
                                                packageManager = null;
                                            }
                                            Intent S8 = v4.e.S(packageManager, ((C1874c) commonErrorDialogFragment.f13845R0.getValue()).f22238f);
                                            kotlin.jvm.internal.h.b(S8);
                                            commonErrorDialogFragment.d0(S8);
                                            return;
                                        } catch (Exception unused) {
                                            Toast.makeText(commonErrorDialogFragment.m(), R.string.msg_unknown_error, 0).show();
                                            return;
                                        }
                                    default:
                                        try {
                                            AbstractC1002u1.A(this.f22237b).j(R.id.gotoSplash, null, null);
                                            return;
                                        } catch (Exception unused2) {
                                            return;
                                        }
                                }
                            }
                        });
                        AbstractC0203u abstractC0203u5 = this.f13844Q0;
                        if (abstractC0203u5 != null) {
                            View view = abstractC0203u5.f7853k;
                            h.d(view, "getRoot(...)");
                            return view;
                        }
                        h.h("binding");
                        throw null;
                    }
                    h.h("binding");
                    throw null;
                }
                h.h("binding");
                throw null;
            }
            h.h("binding");
            throw null;
        }
        h.h("binding");
        throw null;
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final LayoutInflater K(Bundle bundle) {
        LayoutInflater K = super.K(bundle);
        return K.cloneInContext(new C2120h(K, this));
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void O() {
        Window window;
        this.f18382D = true;
        Dialog dialog = this.f18349G0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
        }
    }

    @Override // x7.InterfaceC2180b
    public final Object e() {
        if (this.f13841N0 == null) {
            synchronized (this.f13842O0) {
                try {
                    if (this.f13841N0 == null) {
                        this.f13841N0 = new C2118f(this);
                    }
                } finally {
                }
            }
        }
        return this.f13841N0.e();
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public final Dialog g0(Bundle bundle) {
        Dialog g02 = super.g0(bundle);
        Window window = g02.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
        }
        return g02;
    }

    @Override // i0.AbstractComponentCallbacksC1366v, androidx.lifecycle.InterfaceC0550k
    public final h0 j() {
        return a.i(this, super.j());
    }

    public final void l0() {
        if (this.f13839L0 == null) {
            this.f13839L0 = new C2120h(super.m(), this);
            this.f13840M0 = AbstractC0485a.t(super.m());
        }
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final Context m() {
        if (super.m() == null && !this.f13840M0) {
            return null;
        }
        l0();
        return this.f13839L0;
    }
}
