package q2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.update.UpdateFragment;

/* renamed from: q2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1882k extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f22257r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UpdateFragment f22258s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882k(E7.d dVar, UpdateFragment updateFragment) {
        super(2, dVar);
        this.f22258s = updateFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1882k(dVar, this.f22258s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1882k) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f22257r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            UpdateFragment updateFragment = this.f22258s;
            C0709H c0709h = new C0709H(updateFragment.h0().j);
            C1881j c1881j = new C1881j(null, updateFragment);
            this.f22257r = 1;
            if (AbstractC0714M.i(c0709h, c1881j, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
