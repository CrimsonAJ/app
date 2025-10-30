package V1;

import J1.W0;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;

/* loaded from: classes.dex */
public final class b extends AbstractC0249e {
    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = W0.f3803w;
        W0 w02 = (W0) W.c.b(layoutInflater, R.layout.item_filter, parent, false);
        kotlin.jvm.internal.h.d(w02, "inflate(...)");
        return new a(w02);
    }
}
