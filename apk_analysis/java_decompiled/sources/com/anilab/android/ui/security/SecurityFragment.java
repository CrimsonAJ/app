package com.anilab.android.ui.security;

import A7.e;
import A7.f;
import B7.l;
import J1.AbstractC0208w0;
import M1.n;
import N1.t;
import W.g;
import Y2.r;
import Z0.a;
import c2.C0762h;
import co.notix.R;
import java.util.List;
import kotlin.jvm.internal.p;
import m2.AbstractC1585a;
import m2.C1587c;

/* loaded from: classes.dex */
public final class SecurityFragment extends AbstractC1585a<C1587c, AbstractC0208w0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13832D0;

    public SecurityFragment() {
        e p9 = a.p(f.f545a, new e2.e(13, new e2.e(12, this)));
        this.f13832D0 = M4.a.i(this, p.a(C1587c.class), new C0762h(p9, 24), new C0762h(p9, 25), new t(this, p9, 27));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_security;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (C1587c) this.f13832D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 != R.id.buttonBack) {
            if (i9 != R.id.buttonChangePassword) {
                return;
            }
            i0(R.id.securityToChangePassword, null);
            return;
        }
        n.q0(this);
    }

    @Override // M1.n
    public final List m0(g gVar) {
        AbstractC0208w0 abstractC0208w0 = (AbstractC0208w0) gVar;
        return l.b0(abstractC0208w0.f4122w, abstractC0208w0.f4121v);
    }

    @Override // M1.n
    public final void p0() {
    }
}
