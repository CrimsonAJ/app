package X1;

import B6.u0;
import B7.C0050a;
import F0.S;
import F0.r0;
import J1.y1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import co.notix.R;
import com.anilab.domain.model.Movie;
import java.util.List;

/* loaded from: classes.dex */
public final class H extends S {

    /* renamed from: d, reason: collision with root package name */
    public final C0050a f8245d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8246e;

    public H(List list, C0050a c0050a) {
        Object z02;
        this.f8245d = c0050a;
        if (list.isEmpty()) {
            z02 = B7.t.f1135a;
        } else {
            z02 = B7.k.z0(B7.k.y0(u0.D(B7.k.v0(list)), list), B7.k.p0(list));
        }
        this.f8246e = z02;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // F0.S
    public final int a() {
        return this.f8246e.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    @Override // F0.S
    public final void g(r0 r0Var, int i9) {
        ((G) r0Var).r((Movie) this.f8246e.get(i9));
    }

    @Override // F0.S
    public final r0 h(ViewGroup parent, int i9) {
        kotlin.jvm.internal.h.e(parent, "parent");
        LayoutInflater from = LayoutInflater.from(parent.getContext());
        int i10 = y1.f4142x;
        y1 y1Var = (y1) W.c.b(from, R.layout.item_slider, parent, false);
        kotlin.jvm.internal.h.d(y1Var, "inflate(...)");
        return new G(y1Var, this.f8245d);
    }
}
