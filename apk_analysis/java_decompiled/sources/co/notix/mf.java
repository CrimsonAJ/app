package co.notix;

import a.AbstractC0485a;
import android.app.Activity;

/* loaded from: classes.dex */
public final class mf extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f12781a;

    public mf(E7.d dVar) {
        super(2, dVar);
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        mf mfVar = new mf(dVar);
        mfVar.f12781a = obj;
        return mfVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((mf) create((Activity) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        AbstractC0485a.A(obj);
        if (((Activity) this.f12781a) == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }
}
