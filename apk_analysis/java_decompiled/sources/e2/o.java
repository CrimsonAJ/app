package e2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0709H;
import b8.C0718Q;
import com.anilab.android.ui.myList.MyListFragment;

/* loaded from: classes.dex */
public final class o extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17118r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MyListFragment f17119s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(E7.d dVar, MyListFragment myListFragment) {
        super(2, dVar);
        this.f17119s = myListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new o(dVar, this.f17119s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((o) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17118r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        MyListFragment myListFragment = this.f17119s;
        C0709H c0709h = myListFragment.h0().f17087k;
        m mVar = new m(myListFragment, 1);
        this.f17118r = 1;
        ((C0718Q) c0709h.f11422a).collect(mVar, this);
        return aVar;
    }
}
