package com.anilab.android.ui.notification;

import A7.e;
import A7.f;
import B6.u0;
import J1.AbstractC0181i0;
import M1.n;
import N1.t;
import W.g;
import Y2.r;
import c2.C0762h;
import co.notix.R;
import f2.a;
import f2.c;
import java.util.List;
import kotlin.jvm.internal.p;

/* loaded from: classes.dex */
public final class NotificationFragment extends a<c, AbstractC0181i0> {

    /* renamed from: D0, reason: collision with root package name */
    public final r f13797D0;

    public NotificationFragment() {
        e p9 = Z0.a.p(f.f545a, new e2.e(3, new e2.e(2, this)));
        this.f13797D0 = M4.a.i(this, p.a(c.class), new C0762h(p9, 12), new C0762h(p9, 13), new t(this, p9, 21));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_notification;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (c) this.f13797D0.getValue();
    }

    @Override // M1.n
    public final void k0(int i9) {
        if (i9 == R.id.buttonBack) {
            n.q0(this);
        }
    }

    @Override // M1.n
    public final List m0(g gVar) {
        return u0.D(((AbstractC0181i0) gVar).f3962v);
    }

    @Override // M1.n
    public final void p0() {
    }
}
