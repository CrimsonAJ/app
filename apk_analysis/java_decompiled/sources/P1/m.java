package P1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0709H;
import com.anilab.android.ui.comment.CommentListFragment;

/* loaded from: classes.dex */
public final class m extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f5738r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CommentListFragment f5739s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(E7.d dVar, CommentListFragment commentListFragment) {
        super(2, dVar);
        this.f5739s = commentListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new m(dVar, this.f5739s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f5738r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            CommentListFragment commentListFragment = this.f5739s;
            C0709H c0709h = new C0709H(commentListFragment.h0().f5699q);
            l lVar = new l(null, commentListFragment);
            this.f5738r = 1;
            if (AbstractC0714M.i(c0709h, lVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
