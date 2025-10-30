package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class cb extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eb f12003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12004b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb(eb ebVar, long j, E7.d dVar) {
        super(2, dVar);
        this.f12003a = ebVar;
        this.f12004b = j;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new cb(this.f12003a, this.f12004b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((cb) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        eb ebVar = this.f12003a;
        long j = this.f12004b;
        ebVar.f12150a.getClass();
        d9 d9Var = wq.f13475b;
        xq.a(d9Var.a(), "NOTIX_FOREGROUND_TIME", d9Var.a().getSharedPreferences("NOTIX_PREF_STORAGE", 0).getLong("NOTIX_FOREGROUND_TIME", 0L) + j);
        return A7.n.f558a;
    }
}
