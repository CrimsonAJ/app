package q2;

import J1.E0;
import a.AbstractC0485a;
import com.anilab.android.ui.update.UpdateFragment;

/* renamed from: q2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1879h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ int f22251r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UpdateFragment f22252s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1879h(E7.d dVar, UpdateFragment updateFragment) {
        super(2, dVar);
        this.f22252s = updateFragment;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1879h c1879h = new C1879h(dVar, this.f22252s);
        c1879h.f22251r = ((Number) obj).intValue();
        return c1879h;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1879h c1879h = (C1879h) create(Integer.valueOf(((Number) obj).intValue()), (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1879h.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        int i9 = this.f22251r;
        UpdateFragment updateFragment = this.f22252s;
        ((E0) updateFragment.e0()).f3659B.setProgress(i9);
        ((E0) updateFragment.e0()).f3662E.setText(i9 + "%");
        if (i9 > 0) {
            ((E0) updateFragment.e0()).f3659B.setIndeterminate(false);
        }
        return A7.n.f558a;
    }
}
