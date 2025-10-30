package o2;

import J1.AbstractC0193o0;
import K5.ViewOnClickListenerC0215a;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import co.notix.R;
import i0.AbstractC1336M;
import i0.C1345a;
import i0.DialogInterfaceOnCancelListenerC1358n;
import java.util.ArrayList;
import u6.C2083b;

/* renamed from: o2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1685l extends DialogInterfaceOnCancelListenerC1358n {

    /* renamed from: M0, reason: collision with root package name */
    public static final String f21533M0 = kotlin.jvm.internal.p.a(C1685l.class).c();

    /* renamed from: L0, reason: collision with root package name */
    public AbstractC0193o0 f21534L0;

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.h.e(inflater, "inflater");
        int i9 = AbstractC0193o0.f4026y;
        this.f21534L0 = (AbstractC0193o0) W.c.b(inflater, R.layout.fragment_profile_settings, viewGroup, false);
        i0(false);
        AbstractC0193o0 abstractC0193o0 = this.f21534L0;
        if (abstractC0193o0 != null) {
            abstractC0193o0.f4027v.setOnClickListener(new ViewOnClickListenerC0215a(17, this));
            byte[] bArr = {22, 51, 21, 59, 56, 52, 60, 119, 51, 50, 35, 50, 52, 35, 50, 51};
            AbstractC0193o0 abstractC0193o02 = this.f21534L0;
            if (abstractC0193o02 != null) {
                ArrayList arrayList = new ArrayList(16);
                for (int i10 = 0; i10 < 16; i10++) {
                    arrayList.add(Character.valueOf((char) (bArr[i10] ^ 87)));
                }
                abstractC0193o02.f4028w.setText(B7.k.u0(arrayList, "", null, null, null, 62));
                byte[] bArr2 = {21, 48, 22, 56, 59, 55, 63, 49, 38, 116, 59, 38, 116, 55, 33, 39, 32, 59, 57, 116, 16, 26, 7, 116, 48, 49, 32, 49, 55, 32, 49, 48, 122, 116, 0, 60, 61, 39, 116, 57, 53, 45, 116, 53, 50, 50, 49, 55, 32, 116, 53, 36, 36, 116, 50, 33, 58, 55, 32, 61, 59, 58, 53, 56, 61, 32, 45, 122};
                AbstractC0193o0 abstractC0193o03 = this.f21534L0;
                if (abstractC0193o03 != null) {
                    ArrayList arrayList2 = new ArrayList(68);
                    for (int i11 = 0; i11 < 68; i11++) {
                        arrayList2.add(Character.valueOf((char) (bArr2[i11] ^ 84)));
                    }
                    abstractC0193o03.f4029x.setText(B7.k.u0(arrayList2, "", null, null, null, 62));
                    AbstractC0193o0 abstractC0193o04 = this.f21534L0;
                    if (abstractC0193o04 != null) {
                        return abstractC0193o04.f7853k;
                    }
                    kotlin.jvm.internal.h.h("binding");
                    throw null;
                }
                kotlin.jvm.internal.h.h("binding");
                throw null;
            }
            kotlin.jvm.internal.h.h("binding");
            throw null;
        }
        kotlin.jvm.internal.h.h("binding");
        throw null;
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final void S(View view) {
        Window window;
        kotlin.jvm.internal.h.e(view, "view");
        Dialog dialog = this.f18349G0;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setDimAmount(0.0f);
            window.setBackgroundDrawable(new ColorDrawable(window.getContext().getColor(R.color.colorPrimary)));
            window.setLayout(-1, -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnKeyListener, java.lang.Object] */
    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public final Dialog g0(Bundle bundle) {
        Dialog g02 = super.g0(bundle);
        g02.setCancelable(false);
        g02.setCanceledOnTouchOutside(false);
        g02.setOnKeyListener(new Object());
        return g02;
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public final void k0(AbstractC1336M abstractC1336M, String str) {
        try {
            super.k0(abstractC1336M, str);
        } catch (Exception e8) {
            C2083b.a().b(e8);
            try {
                C1345a c1345a = new C1345a(abstractC1336M);
                c1345a.g(0, this, str, 1);
                c1345a.e(true);
            } catch (Exception e9) {
                C2083b.a().b(e9);
            }
        }
    }
}
