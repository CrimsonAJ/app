package X1;

import J1.AbstractC0170d1;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* loaded from: classes.dex */
public final class r extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f8285f = new N1.b(8);

    /* renamed from: e, reason: collision with root package name */
    public final C f8286e;

    public r(C c3) {
        super(f8285f);
        this.f8286e = c3;
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = AbstractC0170d1.f3886y;
        AbstractC0170d1 abstractC0170d1 = (AbstractC0170d1) W.c.b(layoutInflater, R.layout.item_movie_home, parent, false);
        kotlin.jvm.internal.h.d(abstractC0170d1, "inflate(...)");
        return new N1.d(abstractC0170d1, this.f8286e);
    }
}
