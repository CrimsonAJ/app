package l2;

import M1.t;
import O7.p;
import a.AbstractC0485a;
import com.anilab.android.ui.search.SearchFragment;

/* renamed from: l2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1541f extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f20196r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SearchFragment f20197s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1541f(E7.d dVar, SearchFragment searchFragment) {
        super(2, dVar);
        this.f20197s = searchFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1541f c1541f = new C1541f(dVar, this.f20197s);
        c1541f.f20196r = obj;
        return c1541f;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1541f c1541f = (C1541f) create((t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1541f.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f20196r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            ((C1539d) this.f20197s.f13831G0.getValue()).f4742a = true;
        }
        return A7.n.f558a;
    }
}
