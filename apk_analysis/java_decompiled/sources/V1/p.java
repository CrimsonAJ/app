package V1;

import G0.C0142h;
import J1.f1;
import M1.AbstractC0249e;
import X1.r;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* loaded from: classes.dex */
public final class p extends AbstractC0249e {

    /* renamed from: e, reason: collision with root package name */
    public final C0142h f7653e;

    public p(C0142h c0142h) {
        super(r.f8285f);
        this.f7653e = c0142h;
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = f1.f3921A;
        f1 f1Var = (f1) W.c.b(layoutInflater, R.layout.item_movie_large, parent, false);
        kotlin.jvm.internal.h.d(f1Var, "inflate(...)");
        return new N1.d(this, f1Var, 7);
    }
}
