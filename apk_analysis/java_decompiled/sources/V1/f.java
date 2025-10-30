package V1;

import M1.t;
import a.AbstractC0485a;
import com.anilab.android.ui.filterResult.FilterResultFragment;

/* loaded from: classes.dex */
public final class f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7622r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ FilterResultFragment f7623s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(E7.d dVar, FilterResultFragment filterResultFragment) {
        super(2, dVar);
        this.f7623s = filterResultFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        f fVar = new f(dVar, this.f7623s);
        fVar.f7622r = obj;
        return fVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        fVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f7622r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            ((d) this.f7623s.f13769G0.getValue()).f4742a = true;
        }
        return A7.n.f558a;
    }
}
