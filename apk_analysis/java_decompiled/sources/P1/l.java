package P1;

import a.AbstractC0485a;
import co.notix.R;
import com.anilab.android.ui.comment.CommentListFragment;

/* loaded from: classes.dex */
public final class l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5736r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CommentListFragment f5737s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(E7.d dVar, CommentListFragment commentListFragment) {
        super(2, dVar);
        this.f5737s = commentListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        l lVar = new l(dVar, this.f5737s);
        lVar.f5736r = obj;
        return lVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        lVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f5736r).a();
        if (a5 != null) {
            w wVar = (w) a5;
            if (!wVar.equals(u.f5750a)) {
                boolean z9 = wVar instanceof s;
                CommentListFragment commentListFragment = this.f5737s;
                if (z9) {
                    ((J1.E) commentListFragment.e0()).f3649E.h0(0);
                    ((J1.E) commentListFragment.e0()).f3657z.setText("");
                } else if (wVar instanceof t) {
                    ((C0329e) commentListFragment.f13742E0.getValue()).e(((t) wVar).f5749a);
                } else if (wVar instanceof v) {
                    ((C0329e) commentListFragment.f13742E0.getValue()).e(((v) wVar).f5752a);
                } else if (wVar.equals(u.f5751b)) {
                    ((J1.E) commentListFragment.e0()).f3657z.setText("");
                    J1.E e8 = (J1.E) commentListFragment.e0();
                    e8.f3657z.setHint(commentListFragment.r(R.string.hint_add_comment));
                } else {
                    throw new RuntimeException();
                }
            }
        }
        return A7.n.f558a;
    }
}
