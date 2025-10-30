package com.anilab.android.ui.welcome;

import A7.e;
import A7.f;
import B7.l;
import J1.G0;
import W.g;
import Y2.r;
import Z0.a;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import co.notix.R;
import java.util.List;
import kotlin.jvm.internal.p;
import o2.C1688o;
import o2.C1689p;
import s2.AbstractC1943a;
import s2.C1945c;

/* loaded from: classes.dex */
public final class WelcomeFragment extends AbstractC1943a<C1945c, G0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13858D0;

    public WelcomeFragment() {
        e p9 = a.p(f.f545a, new e2.e(26, new e2.e(25, this)));
        this.f13858D0 = M4.a.i(this, p.a(C1945c.class), new C1688o(p9, 8), new C1688o(p9, 9), new C1689p(this, p9, 4));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_welcome;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (C1945c) this.f13858D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 != R.id.buttonSignIn) {
            if (i9 != R.id.buttonWatchNow) {
                return;
            }
            i0(R.id.welcomeToHost, null);
            return;
        }
        i0(R.id.welcomeToLogin, null);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        G0 g02 = (G0) gVar;
        return l.b0(g02.f3676v, g02.f3677w);
    }

    @Override // M1.n
    public final void p0() {
        G0 g02 = (G0) e0();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r(R.string.title_welcome_white));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(((G0) e0()).f7853k.getContext().getColor(R.color.colorRed));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) r(R.string.title_welcome_red));
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        g02.f3678x.setText(spannableStringBuilder);
    }
}
