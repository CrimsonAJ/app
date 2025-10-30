package com.google.android.material.datepicker;

import K5.ViewOnClickListenerC0215a;
import P.H;
import P.Q;
import P.v0;
import P.y0;
import a.AbstractC0485a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import b7.C0701c;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.material.internal.CheckableImageButton;
import g5.AbstractC1254a;
import i0.DialogInterfaceOnCancelListenerC1358n;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import s5.ViewOnTouchListenerC1960a;

/* loaded from: classes.dex */
public final class k<S> extends DialogInterfaceOnCancelListenerC1358n {

    /* renamed from: L0, reason: collision with root package name */
    public final LinkedHashSet f16006L0;

    /* renamed from: M0, reason: collision with root package name */
    public final LinkedHashSet f16007M0;

    /* renamed from: N0, reason: collision with root package name */
    public int f16008N0;

    /* renamed from: O0, reason: collision with root package name */
    public r f16009O0;

    /* renamed from: P0, reason: collision with root package name */
    public b f16010P0;

    /* renamed from: Q0, reason: collision with root package name */
    public j f16011Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f16012R0;

    /* renamed from: S0, reason: collision with root package name */
    public CharSequence f16013S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f16014T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f16015U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f16016V0;

    /* renamed from: W0, reason: collision with root package name */
    public CharSequence f16017W0;

    /* renamed from: X0, reason: collision with root package name */
    public int f16018X0;

    /* renamed from: Y0, reason: collision with root package name */
    public CharSequence f16019Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f16020Z0;

    /* renamed from: a1, reason: collision with root package name */
    public CharSequence f16021a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f16022b1;

    /* renamed from: c1, reason: collision with root package name */
    public CharSequence f16023c1;

    /* renamed from: d1, reason: collision with root package name */
    public TextView f16024d1;

    /* renamed from: e1, reason: collision with root package name */
    public CheckableImageButton f16025e1;

    /* renamed from: f1, reason: collision with root package name */
    public F5.h f16026f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f16027g1;

    /* renamed from: h1, reason: collision with root package name */
    public CharSequence f16028h1;

    /* renamed from: i1, reason: collision with root package name */
    public CharSequence f16029i1;

    public k() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f16006L0 = new LinkedHashSet();
        this.f16007M0 = new LinkedHashSet();
    }

    public static int m0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b9 = v.b();
        b9.set(5, 1);
        Calendar a5 = v.a(b9);
        a5.get(2);
        a5.get(1);
        int maximum = a5.getMaximum(7);
        a5.getActualMaximum(5);
        a5.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean n0(Context context, int i9) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1002u1.Z(R.attr.materialCalendarStyle, context, j.class.getCanonicalName()).data, new int[]{i9});
        boolean z9 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z9;
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.f18390f;
        }
        this.f16008N0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") == null) {
            this.f16010P0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
            if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
                this.f16012R0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
                this.f16013S0 = bundle.getCharSequence("TITLE_TEXT_KEY");
                this.f16015U0 = bundle.getInt("INPUT_MODE_KEY");
                this.f16016V0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f16017W0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
                this.f16018X0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f16019Y0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                this.f16020Z0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
                this.f16021a1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
                this.f16022b1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
                this.f16023c1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
                CharSequence charSequence = this.f16013S0;
                if (charSequence == null) {
                    charSequence = X().getResources().getText(this.f16012R0);
                }
                this.f16028h1 = charSequence;
                if (charSequence != null) {
                    CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
                    if (split.length > 1) {
                        charSequence = split[0];
                    }
                } else {
                    charSequence = null;
                }
                this.f16029i1 = charSequence;
                return;
            }
            throw new ClassCastException();
        }
        throw new ClassCastException();
    }

    @Override // i0.AbstractComponentCallbacksC1366v
    public final View G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i9;
        String string;
        if (this.f16014T0) {
            i9 = R.layout.mtrl_picker_fullscreen;
        } else {
            i9 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i9, viewGroup);
        Context context = inflate.getContext();
        if (this.f16014T0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m0(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = Q.f5546a;
        textView.setAccessibilityLiveRegion(1);
        this.f16025e1 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f16024d1 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f16025e1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f16025e1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0485a.q(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z9 = false;
        stateListDrawable.addState(new int[0], AbstractC0485a.q(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f16025e1;
        if (this.f16015U0 != 0) {
            z9 = true;
        }
        checkableImageButton2.setChecked(z9);
        Q.m(this.f16025e1, null);
        CheckableImageButton checkableImageButton3 = this.f16025e1;
        if (this.f16015U0 == 1) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f16025e1.setContentDescription(string);
        this.f16025e1.setOnClickListener(new ViewOnClickListenerC0215a(15, this));
        l0();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.google.android.material.datepicker.a] */
    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void P(Bundle bundle) {
        m mVar;
        m d9;
        super.P(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f16008N0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f16010P0;
        ?? obj = new Object();
        int i9 = a.f15970b;
        int i10 = a.f15970b;
        long j = bVar.f15972a.f16037f;
        long j4 = bVar.f15973b.f16037f;
        obj.f15971a = Long.valueOf(bVar.f15975d.f16037f);
        j jVar = this.f16011Q0;
        if (jVar == null) {
            mVar = null;
        } else {
            mVar = jVar.f16004y0;
        }
        if (mVar != null) {
            obj.f15971a = Long.valueOf(mVar.f16037f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f15974c);
        m d10 = m.d(j);
        m d11 = m.d(j4);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l9 = obj.f15971a;
        if (l9 == null) {
            d9 = null;
        } else {
            d9 = m.d(l9.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(d10, d11, dVar, d9, bVar.f15976e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f16012R0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f16013S0);
        bundle.putInt("INPUT_MODE_KEY", this.f16015U0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f16016V0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f16017W0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f16018X0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f16019Y0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f16020Z0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f16021a1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f16022b1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f16023c1);
    }

    /* JADX WARN: Type inference failed for: r5v11, types: [P.o, A4.r, java.lang.Object] */
    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void Q() {
        CharSequence charSequence;
        Integer num;
        boolean z9;
        int i9;
        boolean z10;
        s8.e v0Var;
        s8.e v0Var2;
        super.Q();
        Window window = h0().getWindow();
        if (this.f16014T0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f16026f1);
            if (!this.f16027g1) {
                View findViewById = Z().findViewById(R.id.fullscreen_header);
                ColorStateList u9 = O4.h.u(findViewById.getBackground());
                if (u9 != null) {
                    num = Integer.valueOf(u9.getDefaultColor());
                } else {
                    num = null;
                }
                int i10 = Build.VERSION.SDK_INT;
                boolean z11 = false;
                if (num != null && num.intValue() != 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                int q9 = s8.n.q(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z9) {
                    num = Integer.valueOf(q9);
                }
                Y1.E(window, false);
                window.getContext();
                Context context = window.getContext();
                if (i10 < 27) {
                    i9 = H.a.h(s8.n.q(context, android.R.attr.navigationBarColor, -16777216), 128);
                } else {
                    i9 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i9);
                boolean s9 = s8.n.s(num.intValue());
                if (!s8.n.s(0) && !s9) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                C0701c c0701c = new C0701c(window.getDecorView());
                if (i10 >= 35) {
                    v0Var = new y0(window, c0701c);
                } else if (i10 >= 30) {
                    v0Var = new y0(window, c0701c);
                } else if (i10 >= 26) {
                    v0Var = new v0(window, c0701c);
                } else {
                    v0Var = new v0(window, c0701c);
                }
                v0Var.Z(z10);
                boolean s10 = s8.n.s(q9);
                if (s8.n.s(i9) || (i9 == 0 && s10)) {
                    z11 = true;
                }
                C0701c c0701c2 = new C0701c(window.getDecorView());
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 35) {
                    v0Var2 = new y0(window, c0701c2);
                } else if (i11 >= 30) {
                    v0Var2 = new y0(window, c0701c2);
                } else if (i11 >= 26) {
                    v0Var2 = new v0(window, c0701c2);
                } else {
                    v0Var2 = new v0(window, c0701c2);
                }
                v0Var2.Y(z11);
                int paddingTop = findViewById.getPaddingTop();
                int i12 = findViewById.getLayoutParams().height;
                ?? obj = new Object();
                obj.f382a = i12;
                obj.f384c = findViewById;
                obj.f383b = paddingTop;
                WeakHashMap weakHashMap = Q.f5546a;
                H.l(findViewById, obj);
                this.f16027g1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = q().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f16026f1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC1960a(h0(), rect));
        }
        X();
        int i13 = this.f16008N0;
        if (i13 != 0) {
            l0();
            b bVar = this.f16010P0;
            j jVar = new j();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i13);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f15975d);
            jVar.c0(bundle);
            this.f16011Q0 = jVar;
            r rVar = jVar;
            if (this.f16015U0 == 1) {
                l0();
                b bVar2 = this.f16010P0;
                r lVar = new l();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i13);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
                lVar.c0(bundle2);
                rVar = lVar;
            }
            this.f16009O0 = rVar;
            TextView textView = this.f16024d1;
            if (this.f16015U0 == 1 && q().getConfiguration().orientation == 2) {
                charSequence = this.f16029i1;
            } else {
                charSequence = this.f16028h1;
            }
            textView.setText(charSequence);
            l0();
            throw null;
        }
        l0();
        throw null;
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, i0.AbstractComponentCallbacksC1366v
    public final void R() {
        this.f16009O0.f16051v0.clear();
        super.R();
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n
    public final Dialog g0(Bundle bundle) {
        Context X8 = X();
        X();
        int i9 = this.f16008N0;
        if (i9 != 0) {
            Dialog dialog = new Dialog(X8, i9);
            Context context = dialog.getContext();
            this.f16014T0 = n0(context, android.R.attr.windowFullscreen);
            this.f16026f1 = new F5.h(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1254a.f17757w, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f16026f1.i(context);
            this.f16026f1.k(ColorStateList.valueOf(color));
            F5.h hVar = this.f16026f1;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = Q.f5546a;
            hVar.j(H.e(decorView));
            return dialog;
        }
        l0();
        throw null;
    }

    public final void l0() {
        if (this.f18390f.getParcelable("DATE_SELECTOR_KEY") == null) {
        } else {
            throw new ClassCastException();
        }
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f16006L0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // i0.DialogInterfaceOnCancelListenerC1358n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f16007M0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.Y;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
