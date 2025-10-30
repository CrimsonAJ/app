package q2;

import a.AbstractC0485a;
import com.anilab.android.ui.update.UpdateFragment;

/* renamed from: q2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1877f extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f22247r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UpdateFragment f22248s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1877f(E7.d dVar, UpdateFragment updateFragment) {
        super(2, dVar);
        this.f22248s = updateFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1877f c1877f = new C1877f(dVar, this.f22248s);
        c1877f.f22247r = obj;
        return c1877f;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1877f c1877f = (C1877f) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1877f.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f22247r).a();
        if (a5 != null) {
            InterfaceC1891t interfaceC1891t = (InterfaceC1891t) a5;
            UpdateFragment updateFragment = this.f22248s;
            updateFragment.y0(false);
            if (interfaceC1891t instanceof C1888q) {
                updateFragment.w0(((C1888q) interfaceC1891t).f22266a);
            } else if (interfaceC1891t instanceof C1889r) {
                updateFragment.x0(((C1889r) interfaceC1891t).f22267a);
            }
        }
        return A7.n.f558a;
    }
}
