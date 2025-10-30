package d2;

import J1.AbstractC0172e0;
import a.AbstractC0485a;
import androidx.constraintlayout.widget.Group;
import com.anilab.android.ui.movieDetail.MovieDetailFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: d2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1116j extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f16792r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MovieDetailFragment f16793s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1116j(E7.d dVar, MovieDetailFragment movieDetailFragment) {
        super(2, dVar);
        this.f16793s = movieDetailFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1116j c1116j = new C1116j(dVar, this.f16793s);
        c1116j.f16792r = obj;
        return c1116j;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1116j c1116j = (C1116j) create((List) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1116j.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int i9;
        AbstractC0485a.A(obj);
        List list = (List) this.f16792r;
        MovieDetailFragment movieDetailFragment = this.f16793s;
        Group groupEpisode = ((AbstractC0172e0) movieDetailFragment.e0()).f3891B;
        kotlin.jvm.internal.h.d(groupEpisode, "groupEpisode");
        if (!list.isEmpty()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        groupEpisode.setVisibility(i9);
        C1108b c1108b = (C1108b) movieDetailFragment.f13789H0.getValue();
        c1108b.getClass();
        ArrayList arrayList = c1108b.f16775g;
        arrayList.clear();
        arrayList.addAll(list);
        c1108b.o(arrayList);
        return A7.n.f558a;
    }
}
