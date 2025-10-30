package P1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import com.anilab.android.ui.comment.CommentListFragment;

/* loaded from: classes.dex */
public final class o extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f5742r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CommentListFragment f5743s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(E7.d dVar, CommentListFragment commentListFragment) {
        super(2, dVar);
        this.f5743s = commentListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new o(dVar, this.f5743s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f5742r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            CommentListFragment commentListFragment = this.f5743s;
            n nVar = new n(null, commentListFragment);
            this.f5742r = 1;
            if (Y.h(commentListFragment, enumC0555p, nVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
