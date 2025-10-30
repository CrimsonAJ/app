package P1;

import a.AbstractC0485a;
import com.anilab.android.ui.comment.CommentListFragment;

/* loaded from: classes.dex */
public final class j extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f5732r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CommentListFragment f5733s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(E7.d dVar, CommentListFragment commentListFragment) {
        super(2, dVar);
        this.f5733s = commentListFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        j jVar = new j(dVar, this.f5733s);
        jVar.f5732r = obj;
        return jVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        j jVar = (j) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        jVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f5732r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            ((C0332h) this.f5733s.f13743F0.getValue()).f4742a = true;
        }
        return A7.n.f558a;
    }
}
