package e2;

import a.AbstractC0485a;
import com.anilab.android.ui.myList.MyListFragment;

/* loaded from: classes.dex */
public final class r extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17124r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MyListFragment f17125s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(E7.d dVar, MyListFragment myListFragment) {
        super(2, dVar);
        this.f17125s = myListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        r rVar = new r(dVar, this.f17125s);
        rVar.f17124r = obj;
        return rVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        r rVar = (r) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        rVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f17124r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            this.f17125s.s0().f4742a = true;
        }
        return A7.n.f558a;
    }
}
