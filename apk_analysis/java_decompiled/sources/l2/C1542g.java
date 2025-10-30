package l2;

import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.search.SearchFragment;

/* renamed from: l2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1542g extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f20198r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchFragment f20199s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1542g(E7.d dVar, SearchFragment searchFragment) {
        super(2, dVar);
        this.f20199s = searchFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1542g(dVar, this.f20199s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1542g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f20198r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            SearchFragment searchFragment = this.f20199s;
            C0709H c0709h = new C0709H(searchFragment.h0().f20220k);
            C1541f c1541f = new C1541f(null, searchFragment);
            this.f20198r = 1;
            if (AbstractC0714M.i(c0709h, c1541f, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
