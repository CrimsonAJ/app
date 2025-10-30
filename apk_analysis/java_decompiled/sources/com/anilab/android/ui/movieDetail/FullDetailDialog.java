package com.anilab.android.ui.movieDetail;

import J1.AbstractC0207w;
import M1.f;
import N1.r;
import W.c;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import b5.G1;
import co.notix.R;
import d2.C1109c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import m5.g;

/* loaded from: classes.dex */
public final class FullDetailDialog extends g {

    /* renamed from: L0, reason: collision with root package name */
    public AbstractC0207w f13785L0;

    /* renamed from: M0, reason: collision with root package name */
    public final G1 f13786M0 = new G1(p.a(C1109c.class), new r(28, this));

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater inflater, ViewGroup viewGroup) {
        h.e(inflater, "inflater");
        int i9 = AbstractC0207w.f4119w;
        this.f13785L0 = (AbstractC0207w) c.b(inflater, R.layout.dialog_full_detail, viewGroup, false);
        i0(true);
        AbstractC0207w abstractC0207w = this.f13785L0;
        if (abstractC0207w != null) {
            abstractC0207w.f4120v.setText(((C1109c) this.f13786M0.getValue()).f16776a);
            AbstractC0207w abstractC0207w2 = this.f13785L0;
            if (abstractC0207w2 != null) {
                View view = abstractC0207w2.f7853k;
                h.d(view, "getRoot(...)");
                return view;
            }
            h.h("binding");
            throw null;
        }
        h.h("binding");
        throw null;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void O() {
        Window window;
        this.f18382D = true;
        Dialog dialog = this.f18349G0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    @Override // m5.g, i.z, i0.DialogInterfaceOnCancelListenerC1358n
    public final Dialog g0(Bundle bundle) {
        Dialog g02 = super.g0(bundle);
        g02.setOnShowListener(new f(1));
        return g02;
    }
}
