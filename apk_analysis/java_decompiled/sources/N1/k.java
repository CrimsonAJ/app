package N1;

import B6.u0;
import J1.AbstractC0200s0;
import J1.AbstractC0204u0;
import J1.E;
import L1.S;
import P1.C0329e;
import X.O;
import X.P;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import b8.C0718Q;
import b8.InterfaceC0726f;
import c8.C0791a;
import co.notix.R;
import com.anilab.android.ui.categoryDetail.MovieListFragment;
import com.anilab.android.ui.comment.CommentListFragment;
import com.anilab.android.ui.filterResult.FilterResultFragment;
import com.anilab.android.ui.logout.BottomSheetConfirmLogout;
import com.anilab.android.ui.releaseCalendar.ReleaseCalendarFragment;
import com.anilab.android.ui.search.SearchFragment;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import i7.C1406v;
import i7.K;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k2.C1484b;
import l2.C1537b;
import l2.C1550o;

/* loaded from: classes.dex */
public final class k implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4853a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4854b;

    public /* synthetic */ k(int i9, Object obj) {
        this.f4853a = i9;
        this.f4854b = obj;
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        String str;
        Object f9;
        int i9;
        int i10;
        H2.b bVar = null;
        int i11 = 8;
        A7.n nVar = A7.n.f558a;
        Object obj2 = this.f4854b;
        switch (this.f4853a) {
            case 0:
                ((f) ((MovieListFragment) obj2).f13738F0.getValue()).o((List) obj);
                return nVar;
            case 1:
                List list = (List) obj;
                CommentListFragment commentListFragment = (CommentListFragment) obj2;
                E e8 = (E) commentListFragment.e0();
                String r5 = u0.r(commentListFragment.h0().f5703u);
                if (commentListFragment.h0().f5703u != 1) {
                    str = "s";
                } else {
                    str = "";
                }
                e8.f3651G.setText(commentListFragment.s(R.string.format_number_of_comment, r5, str));
                ((C0329e) commentListFragment.f13742E0.getValue()).o(list);
                return nVar;
            case 2:
                ((V1.p) ((FilterResultFragment) obj2).f13768F0.getValue()).o((List) obj);
                return nVar;
            case 3:
                O o9 = (O) obj2;
                if (!(o9.f8018h.a() instanceof P) && (f9 = O.f(o9, true, dVar)) == F7.a.f2587a) {
                    return f9;
                }
                return nVar;
            case 4:
                if (((Boolean) obj).booleanValue()) {
                    BottomSheetConfirmLogout bottomSheetConfirmLogout = (BottomSheetConfirmLogout) obj2;
                    S s9 = (S) bottomSheetConfirmLogout.f13782T0.getValue();
                    M1.t tVar = new M1.t(Boolean.TRUE);
                    C0718Q c0718q = s9.f4504r;
                    c0718q.getClass();
                    c0718q.j(null, tVar);
                    AbstractC1002u1.A(bottomSheetConfirmLogout).m();
                }
                return nVar;
            case 5:
                ((kotlin.jvm.internal.o) obj2).f20159a = obj;
                throw new C0791a(this);
            case 6:
                ((K) obj2).f18764c.set((C1406v) obj);
                return nVar;
            case 7:
                List list2 = (List) obj;
                if (list2 != null) {
                    ReleaseCalendarFragment releaseCalendarFragment = (ReleaseCalendarFragment) obj2;
                    LinearLayoutCompat layoutEmpty = ((AbstractC0200s0) releaseCalendarFragment.e0()).f4075w;
                    kotlin.jvm.internal.h.d(layoutEmpty, "layoutEmpty");
                    if (list2.isEmpty()) {
                        i9 = 0;
                    } else {
                        i9 = 8;
                    }
                    layoutEmpty.setVisibility(i9);
                    RecyclerView recyclerRelease = ((AbstractC0200s0) releaseCalendarFragment.e0()).f4077y;
                    kotlin.jvm.internal.h.d(recyclerRelease, "recyclerRelease");
                    if (!list2.isEmpty()) {
                        i11 = 0;
                    }
                    recyclerRelease.setVisibility(i11);
                    C1484b s02 = releaseCalendarFragment.s0();
                    int i12 = s02.f19881f;
                    if (i12 > 0) {
                        bVar = (H2.b) B7.k.r0(s02.f19880e, i12);
                    }
                    if (bVar != null) {
                        k2.f fVar = (k2.f) releaseCalendarFragment.f13827F0.getValue();
                        ArrayList g9 = releaseCalendarFragment.h0().g(bVar);
                        ArrayList arrayList = fVar.f19893g;
                        arrayList.clear();
                        arrayList.addAll(g9);
                        fVar.d();
                    }
                }
                return nVar;
            default:
                A7.h hVar = (A7.h) obj;
                boolean booleanValue = ((Boolean) hVar.f547a).booleanValue();
                SearchFragment searchFragment = (SearchFragment) obj2;
                Object obj3 = hVar.f548b;
                if (booleanValue) {
                    AbstractC0204u0 abstractC0204u0 = (AbstractC0204u0) searchFragment.e0();
                    RecyclerView recyclerResult = abstractC0204u0.f4098B;
                    kotlin.jvm.internal.h.d(recyclerResult, "recyclerResult");
                    recyclerResult.setVisibility(8);
                    RecyclerView recyclerTopSearch = abstractC0204u0.f4099C;
                    kotlin.jvm.internal.h.d(recyclerTopSearch, "recyclerTopSearch");
                    recyclerTopSearch.setVisibility(0);
                    LinearLayoutCompat layoutEmpty2 = abstractC0204u0.f4104y;
                    kotlin.jvm.internal.h.d(layoutEmpty2, "layoutEmpty");
                    layoutEmpty2.setVisibility(8);
                    A7.l lVar = searchFragment.f13829E0;
                    if (((C1550o) lVar.getValue()).a() <= 0) {
                        ((C1550o) lVar.getValue()).o((List) obj3);
                    }
                } else {
                    AbstractC0204u0 abstractC0204u02 = (AbstractC0204u0) searchFragment.e0();
                    List list3 = (List) obj3;
                    ((C1537b) searchFragment.f13830F0.getValue()).f2039d.b(list3, new A6.r(searchFragment, 16, abstractC0204u02));
                    RecyclerView recyclerTopSearch2 = abstractC0204u02.f4099C;
                    kotlin.jvm.internal.h.d(recyclerTopSearch2, "recyclerTopSearch");
                    recyclerTopSearch2.setVisibility(8);
                    LinearLayoutCompat layoutEmpty3 = abstractC0204u02.f4104y;
                    kotlin.jvm.internal.h.d(layoutEmpty3, "layoutEmpty");
                    if (list3.isEmpty()) {
                        i10 = 0;
                    } else {
                        i10 = 8;
                    }
                    layoutEmpty3.setVisibility(i10);
                    RecyclerView recyclerResult2 = abstractC0204u02.f4098B;
                    kotlin.jvm.internal.h.d(recyclerResult2, "recyclerResult");
                    if (!((Collection) obj3).isEmpty()) {
                        i11 = 0;
                    }
                    recyclerResult2.setVisibility(i11);
                }
                return nVar;
        }
    }
}
