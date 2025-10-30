package d2;

import G0.C0142h;
import J1.AbstractC0164b1;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* loaded from: classes.dex */
public final class L extends AbstractC0249e {

    /* renamed from: e, reason: collision with root package name */
    public final C0142h f16767e;

    public L(C0142h c0142h) {
        super(X1.r.f8285f);
        this.f16767e = c0142h;
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = AbstractC0164b1.f3837y;
        AbstractC0164b1 abstractC0164b1 = (AbstractC0164b1) W.c.b(layoutInflater, R.layout.item_more_like, parent, false);
        kotlin.jvm.internal.h.d(abstractC0164b1, "inflate(...)");
        return new N1.d(abstractC0164b1, this.f16767e);
    }
}
