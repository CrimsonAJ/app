package c2;

import C3.v;
import J1.Y;
import K5.ViewOnClickListenerC0215a;
import N1.t;
import Y7.B;
import co.notix.R;
import g.C1188a;
import i0.C1359o;

/* renamed from: c2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0763i extends AbstractC0755a<C0772r, Y> {

    /* renamed from: D0, reason: collision with root package name */
    public final Y2.r f11620D0;

    /* renamed from: E0, reason: collision with root package name */
    public final C1359o f11621E0;

    public C0763i() {
        A7.e p9 = Z0.a.p(A7.f.f545a, new N1.r(24, new C0758d(this, 0)));
        this.f11620D0 = M4.a.i(this, kotlin.jvm.internal.p.a(C0772r.class), new C0762h(p9, 0), new C0762h(p9, 1), new t(this, p9, 15));
        this.f11621E0 = (C1359o) V(new v(13, this), new C1188a(1));
    }

    @Override // M1.n
    public final int f0() {
        return R.layout.fragment_mal_export;
    }

    @Override // M1.n
    public final M1.r h0() {
        return (C0772r) this.f11620D0.getValue();
    }

    @Override // M1.n
    public final void l0() {
        B.r(androidx.lifecycle.Y.f(t()), null, new C0761g(this, null), 3);
    }

    @Override // M1.n
    public final void p0() {
        Y y9 = (Y) e0();
        y9.f3810v.setOnClickListener(new ViewOnClickListenerC0215a(11, this));
    }

    public final void s0() {
        J2.a aVar;
        int checkedRadioButtonId = ((Y) e0()).f3812x.getCheckedRadioButtonId();
        if (checkedRadioButtonId != R.id.buttonImportJSON) {
            if (checkedRadioButtonId != R.id.buttonImportXML) {
                aVar = J2.a.f4153a;
            } else {
                aVar = J2.a.f4154b;
            }
        } else {
            aVar = J2.a.f4155c;
        }
        C0772r c0772r = (C0772r) this.f11620D0.getValue();
        c0772r.getClass();
        c0772r.d(true, new C0770p(c0772r, aVar, null));
    }
}
