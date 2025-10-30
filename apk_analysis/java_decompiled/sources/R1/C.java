package R1;

import B7.C0050a;
import J1.w1;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import co.notix.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class C extends AbstractC0249e implements Filterable {
    public static final N1.b j = new N1.b(2);

    /* renamed from: e, reason: collision with root package name */
    public final String f6507e;

    /* renamed from: f, reason: collision with root package name */
    public final C0050a f6508f;

    /* renamed from: g, reason: collision with root package name */
    public final C0382a f6509g;

    /* renamed from: h, reason: collision with root package name */
    public int f6510h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f6511i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(String poster, C0050a c0050a, C0382a c0382a) {
        super(j);
        kotlin.jvm.internal.h.e(poster, "poster");
        this.f6507e = poster;
        this.f6508f = c0050a;
        this.f6509g = c0382a;
        this.f6511i = new ArrayList();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new B(this, 0);
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = w1.f4123y;
        w1 w1Var = (w1) W.c.b(layoutInflater, R.layout.item_select_episode, parent, false);
        kotlin.jvm.internal.h.d(w1Var, "inflate(...)");
        return new N1.d(this, w1Var, 2);
    }
}
