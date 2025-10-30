package com.anilab.android.ui.congratulation;

import J1.AbstractC0211y;
import Q1.a;
import W.c;
import Y7.B;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.Y;
import co.notix.R;
import i0.DialogInterfaceOnCancelListenerC1358n;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class CongratulationDialogFragment extends DialogInterfaceOnCancelListenerC1358n {

    /* renamed from: L0, reason: collision with root package name */
    public AbstractC0211y f13744L0;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater inflater, ViewGroup viewGroup) {
        h.e(inflater, "inflater");
        int i9 = AbstractC0211y.f4133v;
        this.f13744L0 = (AbstractC0211y) c.b(inflater, R.layout.dialog_register_congraturation, viewGroup, false);
        i0(false);
        B.r(Y.f(this), null, new a(this, null), 3);
        AbstractC0211y abstractC0211y = this.f13744L0;
        if (abstractC0211y != null) {
            return abstractC0211y.f7853k;
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
}
