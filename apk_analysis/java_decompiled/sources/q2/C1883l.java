package q2;

import Y7.B;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.android.ui.update.UpdateFragment;

/* renamed from: q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1883l extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22259r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UpdateFragment f22260s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1883l(E7.d dVar, UpdateFragment updateFragment) {
        super(2, dVar);
        this.f22260s = updateFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1883l c1883l = new C1883l(dVar, this.f22260s);
        c1883l.f22259r = obj;
        return c1883l;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1883l c1883l = (C1883l) create((InterfaceC0484z) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1883l.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f22259r;
        UpdateFragment updateFragment = this.f22260s;
        B.r(interfaceC0484z, null, new C1878g(null, updateFragment), 3);
        B.r(interfaceC0484z, null, new C1880i(null, updateFragment), 3);
        B.r(interfaceC0484z, null, new C1882k(null, updateFragment), 3);
        return A7.n.f558a;
    }
}
