package U1;

import J1.W0;
import M1.AbstractC0249e;
import M1.o;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;
import com.anilab.domain.model.FilterConfig;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends AbstractC0249e {

    /* renamed from: f, reason: collision with root package name */
    public static final N1.b f7248f = new N1.b(5);

    /* renamed from: e, reason: collision with root package name */
    public int f7249e;

    public a() {
        super(f7248f);
    }

    @Override // M1.AbstractC0249e
    public final o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = W0.f3803w;
        W0 w02 = (W0) W.c.b(layoutInflater, R.layout.item_filter, parent, false);
        kotlin.jvm.internal.h.d(w02, "inflate(...)");
        return new N1.d(this, w02, 5);
    }

    public final FilterConfig r() {
        List list = this.f2039d.f2100f;
        kotlin.jvm.internal.h.d(list, "getCurrentList(...)");
        return (FilterConfig) B7.k.r0(list, this.f7249e);
    }
}
