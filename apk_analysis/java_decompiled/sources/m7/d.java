package m7;

import O7.p;
import a.AbstractC0485a;
import android.util.Log;

/* loaded from: classes.dex */
public final class d extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f20877r;

    /* JADX WARN: Type inference failed for: r0v0, types: [m7.d, E7.d, G7.j] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        ?? jVar = new G7.j(2, dVar);
        jVar.f20877r = obj;
        return jVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((String) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        dVar.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.f20877r));
        return A7.n.f558a;
    }
}
