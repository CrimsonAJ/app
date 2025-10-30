package b2;

import M1.t;
import a.AbstractC0485a;
import com.anilab.android.ui.main.HostFragment;

/* renamed from: b2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591d extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f10481r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HostFragment f10482s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0591d(E7.d dVar, HostFragment hostFragment) {
        super(2, dVar);
        this.f10482s = hostFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0591d c0591d = new C0591d(dVar, this.f10482s);
        c0591d.f10481r = obj;
        return c0591d;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C0591d c0591d = (C0591d) create((t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c0591d.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((t) this.f10481r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            C0599l h02 = this.f10482s.h0();
            h02.getClass();
            h02.d(false, new C0598k(h02, null));
        }
        return A7.n.f558a;
    }
}
