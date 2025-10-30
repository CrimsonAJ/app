package e2;

import a.AbstractC0485a;
import com.anilab.android.ui.myList.MyListFragment;

/* loaded from: classes.dex */
public final class p extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17120r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MyListFragment f17121s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(E7.d dVar, MyListFragment myListFragment) {
        super(2, dVar);
        this.f17121s = myListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        p pVar = new p(dVar, this.f17121s);
        pVar.f17120r = obj;
        return pVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        p pVar = (p) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        pVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        int ordinal;
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f17120r).a();
        if (a5 != null && (ordinal = ((x) a5).ordinal()) != 0) {
            if (ordinal == 1) {
                MyListFragment myListFragment = this.f17121s;
                myListFragment.s0().d();
                C1136B h02 = myListFragment.h0();
                h02.getClass();
                h02.d(true, new y(h02, 1, null));
            } else {
                throw new RuntimeException();
            }
        }
        return A7.n.f558a;
    }
}
