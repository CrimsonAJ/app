package U1;

import J1.W0;
import M1.AbstractC0249e;
import M1.o;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f7275f = new N1.b(6);

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f7276e;

    public m() {
        super(f7275f);
        this.f7276e = new ArrayList();
    }

    @Override // M1.AbstractC0249e
    public final o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = W0.f3803w;
        W0 w02 = (W0) W.c.b(layoutInflater, R.layout.item_filter, parent, false);
        kotlin.jvm.internal.h.d(w02, "inflate(...)");
        return new N1.d(this, w02, 6);
    }
}
