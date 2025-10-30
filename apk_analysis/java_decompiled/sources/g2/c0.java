package g2;

import F0.r0;
import J1.Y0;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* loaded from: classes.dex */
public final class c0 extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f17659f = new N1.b(12);

    /* renamed from: e, reason: collision with root package name */
    public final C1229f f17660e;

    public c0(C1229f c1229f) {
        super(f17659f);
        this.f17660e = c1229f;
    }

    @Override // M1.AbstractC0249e, F0.S
    public final void g(r0 r0Var, int i9) {
        b0 b0Var = (b0) r0Var;
        super.g(b0Var, i9);
        b0Var.f2210a.setOnClickListener(new I5.k(this, 18, b0Var));
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = Y0.f3814x;
        Y0 y02 = (Y0) W.c.b(layoutInflater, R.layout.item_hls_server, parent, false);
        kotlin.jvm.internal.h.d(y02, "inflate(...)");
        return new b0(y02);
    }

    @Override // M1.AbstractC0249e
    /* renamed from: q */
    public final void g(M1.o oVar, int i9) {
        b0 b0Var = (b0) oVar;
        super.g(b0Var, i9);
        b0Var.f2210a.setOnClickListener(new I5.k(this, 18, b0Var));
    }
}
