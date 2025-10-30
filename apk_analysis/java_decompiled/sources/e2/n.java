package e2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b2.C0599l;
import com.anilab.android.ui.myList.MyListFragment;

/* loaded from: classes.dex */
public final class n extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f17116r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ MyListFragment f17117s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(E7.d dVar, MyListFragment myListFragment) {
        super(2, dVar);
        this.f17117s = myListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new n(dVar, this.f17117s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((n) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f17116r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        MyListFragment myListFragment = this.f17117s;
        C0599l c0599l = (C0599l) myListFragment.f13795F0.getValue();
        m mVar = new m(myListFragment, 0);
        this.f17116r = 1;
        c0599l.f10494h.collect(mVar, this);
        return aVar;
    }
}
