package d2;

import J1.T0;
import M1.AbstractC0249e;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import co.notix.R;
import com.anilab.domain.model.Movie;
import java.util.ArrayList;

/* renamed from: d2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1108b extends AbstractC0249e implements Filterable {

    /* renamed from: h, reason: collision with root package name */
    public static final N1.b f16772h = new N1.b(9);

    /* renamed from: e, reason: collision with root package name */
    public final Movie f16773e;

    /* renamed from: f, reason: collision with root package name */
    public final C1112f f16774f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f16775g;

    public C1108b(Movie movie, C1112f c1112f) {
        super(f16772h);
        this.f16773e = movie;
        this.f16774f = c1112f;
        this.f16775g = new ArrayList();
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new R1.B(this, 1);
    }

    @Override // M1.AbstractC0249e
    public final M1.o p(LayoutInflater layoutInflater, ViewGroup parent) {
        kotlin.jvm.internal.h.e(parent, "parent");
        int i9 = T0.f3777y;
        T0 t02 = (T0) W.c.b(layoutInflater, R.layout.item_episode, parent, false);
        kotlin.jvm.internal.h.d(t02, "inflate(...)");
        return new C1107a(this, t02, this.f16774f);
    }
}
