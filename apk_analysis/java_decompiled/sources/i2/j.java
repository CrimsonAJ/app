package i2;

import J1.m1;
import M1.AbstractC0249e;
import M1.o;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* loaded from: classes.dex */
public final class j extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f18466f = new N1.b(13);

    /* renamed from: e, reason: collision with root package name */
    public int f18467e;

    @Override // M1.AbstractC0249e
    public final o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = m1.f4014x;
        m1 m1Var = (m1) W.c.b(layoutInflater, R.layout.item_rating, parent, false);
        kotlin.jvm.internal.h.d(m1Var, "inflate(...)");
        return new N1.d(this, m1Var, 10);
    }
}
