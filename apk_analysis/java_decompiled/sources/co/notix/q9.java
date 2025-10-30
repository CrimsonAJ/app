package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Set;

/* loaded from: classes.dex */
public final class q9 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t9 f13027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9(t9 t9Var, String str, E7.d dVar) {
        super(2, dVar);
        this.f13027b = t9Var;
        this.f13028c = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new q9(this.f13027b, this.f13028c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q9) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13026a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        dh dhVar = this.f13027b.f13214a;
        Cdo cdo = new Cdo(this.f13028c);
        p9 p9Var = p9.f12936a;
        no noVar = no.f12835e;
        Set set = io.f12491a;
        this.f13026a = 1;
        Object a5 = ((gh) dhVar).a(3, "/inapp/close", false, cdo, p9Var, noVar, set, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
