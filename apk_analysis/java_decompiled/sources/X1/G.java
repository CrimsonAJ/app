package X1;

import B7.C0050a;
import J1.y1;
import androidx.appcompat.widget.AppCompatImageView;
import com.anilab.domain.model.Movie;
import t1.C1992a;
import t1.C2004m;

/* loaded from: classes.dex */
public final class G extends M1.o {

    /* renamed from: u, reason: collision with root package name */
    public final y1 f8243u;

    /* renamed from: v, reason: collision with root package name */
    public Movie f8244v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(y1 y1Var, C0050a itemClick) {
        super(y1Var);
        kotlin.jvm.internal.h.e(itemClick, "itemClick");
        this.f8243u = y1Var;
        y1Var.f4143v.setOnClickListener(new I5.k(this, 10, itemClick));
    }

    @Override // M1.o
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void r(Movie item) {
        kotlin.jvm.internal.h.e(item, "item");
        this.f8244v = item;
        AppCompatImageView imageMovie = this.f8243u.f4143v;
        kotlin.jvm.internal.h.d(imageMovie, "imageMovie");
        String J8 = W7.l.J(item.f14415b, "313x438", "963x900");
        C2004m a5 = C1992a.a(imageMovie.getContext());
        C1.h hVar = new C1.h(imageMovie.getContext());
        hVar.f1179c = J8;
        hVar.b(imageMovie);
        a5.b(hVar.a());
    }
}
