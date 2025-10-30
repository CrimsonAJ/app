package X1;

import F0.r0;
import J1.Q0;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* renamed from: X1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434c extends AbstractC0249e {

    /* renamed from: g, reason: collision with root package name */
    public static final N1.b f8253g = new N1.b(7);

    /* renamed from: e, reason: collision with root package name */
    public final B f8254e;

    /* renamed from: f, reason: collision with root package name */
    public final C f8255f;

    public C0434c(B b9, C c3) {
        super(f8253g);
        this.f8254e = b9;
        this.f8255f = c3;
    }

    @Override // M1.AbstractC0249e, F0.S
    public final void g(r0 r0Var, int i9) {
        C0433b c0433b = (C0433b) r0Var;
        c0433b.f8250u.f3762x.setOnClickListener(new I5.k(this, 7, c0433b));
        super.g(c0433b, i9);
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = Q0.f3759A;
        Q0 q02 = (Q0) W.c.b(layoutInflater, R.layout.item_continue_watch_home, parent, false);
        kotlin.jvm.internal.h.d(q02, "inflate(...)");
        return new C0433b(q02, this.f8254e, this.f8255f);
    }

    @Override // M1.AbstractC0249e
    /* renamed from: q */
    public final void g(M1.o oVar, int i9) {
        C0433b c0433b = (C0433b) oVar;
        c0433b.f8250u.f3762x.setOnClickListener(new I5.k(this, 7, c0433b));
        super.g(c0433b, i9);
    }
}
