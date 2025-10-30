package P1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0718Q;
import com.anilab.android.ui.comment.CommentListFragment;

/* loaded from: classes.dex */
public final class i extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f5730r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CommentListFragment f5731s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(E7.d dVar, CommentListFragment commentListFragment) {
        super(2, dVar);
        this.f5731s = commentListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new i(dVar, this.f5731s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        ((i) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
        return F7.a.f2587a;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f5730r;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0485a.A(obj);
            throw new RuntimeException();
        }
        AbstractC0485a.A(obj);
        CommentListFragment commentListFragment = this.f5731s;
        C0718Q c0718q = commentListFragment.h0().f5698p;
        N1.k kVar = new N1.k(1, commentListFragment);
        this.f5730r = 1;
        c0718q.collect(kVar, this);
        return aVar;
    }
}
