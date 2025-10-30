package g2;

import a.AbstractC0485a;
import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1240q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17686r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17687s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1240q(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17687s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1240q c1240q = new C1240q(dVar, this.f17687s);
        c1240q.f17686r = obj;
        return c1240q;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1240q c1240q = (C1240q) create((M1.E) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1240q.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        M1.E e8 = (M1.E) this.f17686r;
        int i9 = PlayerActivity.f13798w0;
        this.f17687s.f0(e8);
        return A7.n.f558a;
    }
}
