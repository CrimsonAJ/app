package X1;

import a.AbstractC0485a;
import com.anilab.android.ui.home.HomeFragment;

/* loaded from: classes.dex */
public final class j extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8271r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ HomeFragment f8272s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(E7.d dVar, HomeFragment homeFragment) {
        super(2, dVar);
        this.f8272s = homeFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        j jVar = new j(dVar, this.f8272s);
        jVar.f8271r = obj;
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
        Object a5 = ((M1.t) this.f8271r).a();
        if (a5 != null && ((Boolean) a5).booleanValue()) {
            y h02 = this.f8272s.h0();
            h02.getClass();
            h02.d(false, new v(h02, true, null));
        }
        return A7.n.f558a;
    }
}
