package T1;

import J1.k1;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* renamed from: T1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0389c extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f7009f = new N1.b(4);

    /* renamed from: e, reason: collision with root package name */
    public int f7010e;

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = k1.f3977B;
        k1 k1Var = (k1) W.c.b(layoutInflater, R.layout.item_player, parent, false);
        kotlin.jvm.internal.h.d(k1Var, "inflate(...)");
        return new N1.d(this, k1Var, 4);
    }
}
