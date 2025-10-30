package l2;

import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0708G;
import com.anilab.android.ui.search.SearchFragment;

/* renamed from: l2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1540e extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f20194r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchFragment f20195s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1540e(E7.d dVar, SearchFragment searchFragment) {
        super(2, dVar);
        this.f20195s = searchFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1540e(dVar, this.f20195s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((C1540e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f20194r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
        } else {
            AbstractC0485a.A(obj);
            SearchFragment searchFragment = this.f20195s;
            C0708G c0708g = searchFragment.h0().j;
            N1.k kVar = new N1.k(8, searchFragment);
            this.f20194r = 1;
            if (c0708g.f11421a.collect(kVar, this) == aVar) {
                return aVar;
            }
        }
        throw new RuntimeException();
    }
}
