package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.AbstractC0714M;
import b8.C0739s;
import b8.InterfaceC0725e;

/* loaded from: classes.dex */
public final class pf extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f12964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rf f12965c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O7.l f12966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf(long j, rf rfVar, O7.l lVar, E7.d dVar) {
        super(2, dVar);
        this.f12964b = j;
        this.f12965c = rfVar;
        this.f12966d = lVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new pf(this.f12964b, this.f12965c, this.f12966d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((pf) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.jvm.internal.n, java.lang.Object] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12963a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            long max = Math.max(1000L, this.f12964b);
            ?? obj2 = new Object();
            y8 y8Var = this.f12965c.f13109c;
            f state = f.RESUMED;
            d9 d9Var = (d9) y8Var;
            d9Var.getClass();
            kotlin.jvm.internal.h.e(state, "state");
            InterfaceC0725e j = AbstractC0714M.j(new C0739s(new b9(d9Var.f12078b, d9Var), new mf(null), 0));
            of ofVar = new of(obj2, this.f12965c, max, this.f12966d);
            this.f12963a = 1;
            if (j.collect(ofVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
