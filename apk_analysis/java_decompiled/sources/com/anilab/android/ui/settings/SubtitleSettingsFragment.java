package com.anilab.android.ui.settings;

import A7.e;
import A7.f;
import B7.C0051b;
import B7.l;
import J1.C0;
import J2.d;
import M1.D;
import M1.n;
import W.g;
import Y2.r;
import Z0.a;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import co.notix.R;
import com.google.android.material.slider.Slider;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.p;
import o2.AbstractC1675b;
import o2.C1686m;
import o2.C1688o;
import o2.C1689p;
import o2.C1691r;
import o2.C1692s;
import o2.EnumC1687n;

/* loaded from: classes.dex */
public final class SubtitleSettingsFragment extends AbstractC1675b<C1692s, C0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13837D0;

    public SubtitleSettingsFragment() {
        e p9 = a.p(f.f545a, new e2.e(19, new e2.e(18, this)));
        this.f13837D0 = M4.a.i(this, p.a(C1692s.class), new C1688o(p9, 0), new C1688o(p9, 1), new C1689p(this, p9, 0));
    }

    public static Typeface s0(d dVar) {
        int ordinal = dVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return Typeface.MONOSPACE;
                        }
                        throw new RuntimeException();
                    }
                    return Typeface.SERIF;
                }
                return Typeface.SANS_SERIF;
            }
            return Typeface.DEFAULT_BOLD;
        }
        return Typeface.DEFAULT;
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_subtitle_setting;
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 != R.id.buttonBack) {
            if (i9 != R.id.buttonUpdate) {
                return;
            }
            C1692s h02 = h0();
            h02.getClass();
            h02.d(false, new C1691r(h02, null));
            o0(new D(R.string.title_save_success));
            return;
        }
        n.q0(this);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        C0 c02 = (C0) gVar;
        return l.b0(c02.f3630v, c02.f3631w);
    }

    @Override // M1.n
    public final void p0() {
        int i9;
        float f9;
        int i10;
        C0 c02 = (C0) e0();
        I2.f fVar = h0().f21549g;
        int i11 = fVar.f3475d;
        Integer valueOf = Integer.valueOf(i11);
        boolean z9 = false;
        if (8 <= i11 && i11 < 41) {
            z9 = true;
        }
        Object obj = null;
        if (!z9) {
            valueOf = null;
        }
        if (valueOf != null) {
            i9 = valueOf.intValue();
        } else {
            i9 = 22;
        }
        Slider slider = c02.f3627B;
        slider.setValue(i9);
        float f10 = fVar.f3480i;
        Float valueOf2 = Float.valueOf(f10);
        if (0.0f > f10 || f10 > 32.0f) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            f9 = valueOf2.floatValue();
        } else {
            f9 = 0.0f;
        }
        Slider slider2 = c02.f3626A;
        slider2.setValue(f9);
        float ordinal = fVar.f3476e.ordinal();
        Slider slider3 = c02.f3628C;
        slider3.setValue(ordinal);
        int i12 = fVar.f3474c;
        Integer valueOf3 = Integer.valueOf(i12);
        if (i12 < 0 || i12 >= 429) {
            valueOf3 = null;
        }
        if (valueOf3 != null) {
            i10 = valueOf3.intValue();
        } else {
            i10 = 18;
        }
        Slider slider4 = c02.f3634z;
        slider4.setValue(i10);
        float alpha = Color.alpha(fVar.f3472a);
        Slider slider5 = c02.f3633y;
        slider5.setValue(alpha);
        H7.a aVar = EnumC1687n.f21540d;
        aVar.getClass();
        C0051b c0051b = new C0051b(0, aVar);
        while (true) {
            if (!c0051b.hasNext()) {
                break;
            }
            Object next = c0051b.next();
            if (((EnumC1687n) next).f21541a == fVar.f3473b) {
                obj = next;
                break;
            }
        }
        EnumC1687n enumC1687n = (EnumC1687n) obj;
        if (enumC1687n == null) {
            enumC1687n = EnumC1687n.f21538b;
        }
        float ordinal2 = enumC1687n.ordinal();
        Slider slider6 = c02.f3632x;
        slider6.setValue(ordinal2);
        TextView textView = c02.f3629D;
        h.b(textView);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Context context = textView.getContext();
            h.d(context, "getContext(...)");
            layoutParams2.bottomMargin = M4.a.j(context, (int) (fVar.f3474c * 0.6542056f));
            textView.setLayoutParams(layoutParams2);
            textView.setBackgroundColor(fVar.f3472a);
            textView.setTextSize(2, fVar.f3475d * 0.6542056f);
            textView.setTypeface(s0(fVar.f3476e));
            textView.setTextColor(fVar.f3473b);
            textView.setShadowLayer(fVar.f3480i, 0.0f, 0.0f, -16777216);
            slider6.a(new C1686m(this, 0, c02));
            slider.a(new C1686m(this, 1, c02));
            slider3.a(new C1686m(this, 2, c02));
            slider4.a(new C1686m(this, 3, c02));
            slider2.a(new C1686m(this, 4, c02));
            slider5.a(new C1686m(this, 5, c02));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    @Override // M1.n
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public final C1692s h0() {
        return (C1692s) this.f13837D0.getValue();
    }
}
