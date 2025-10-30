package l2;

import G0.C0142h;
import J1.u1;
import M1.AbstractC0249e;
import X1.r;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* renamed from: l2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1537b extends AbstractC0249e {

    /* renamed from: e, reason: collision with root package name */
    public final C0142h f20191e;

    public C1537b(C0142h c0142h) {
        super(r.f8285f);
        this.f20191e = c0142h;
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = u1.f4106A;
        u1 u1Var = (u1) W.c.b(layoutInflater, R.layout.item_search, parent, false);
        kotlin.jvm.internal.h.d(u1Var, "inflate(...)");
        return new N1.d(u1Var, this.f20191e);
    }
}
