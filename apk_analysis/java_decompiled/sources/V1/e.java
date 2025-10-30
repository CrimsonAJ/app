package V1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0709H;
import b8.C0718Q;
import com.anilab.android.ui.filterResult.FilterResultFragment;

/* loaded from: classes.dex */
public final class e extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f7620r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FilterResultFragment f7621s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(E7.d dVar, FilterResultFragment filterResultFragment) {
        super(2, dVar);
        this.f7621s = filterResultFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new e(dVar, this.f7621s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7620r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        FilterResultFragment filterResultFragment = this.f7621s;
        C0709H c0709h = filterResultFragment.h0().f7646h;
        N1.k kVar = new N1.k(2, filterResultFragment);
        this.f7620r = 1;
        ((C0718Q) c0709h.f11422a).collect(kVar, this);
        return aVar;
    }
}
