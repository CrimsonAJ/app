package T1;

import a.AbstractC0485a;
import com.anilab.android.ui.external_player.SelectPlayerFragment;

/* renamed from: T1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0390d extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f7011r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SelectPlayerFragment f7012s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0390d(E7.d dVar, SelectPlayerFragment selectPlayerFragment) {
        super(2, dVar);
        this.f7012s = selectPlayerFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0390d c0390d = new C0390d(dVar, this.f7012s);
        c0390d.f7011r = obj;
        return c0390d;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0390d c0390d = (C0390d) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0390d.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f7011r).a();
        if (a5 != null) {
            o oVar = (o) a5;
            if (oVar instanceof m) {
                ((C0389c) this.f7012s.f13756U0.getValue()).o(((m) oVar).f7028a);
            } else if (!oVar.equals(n.f7029a)) {
                throw new RuntimeException();
            }
        }
        return A7.n.f558a;
    }
}
