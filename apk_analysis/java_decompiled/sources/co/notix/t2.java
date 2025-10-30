package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Set;

/* loaded from: classes.dex */
public final class t2 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u2 f13202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f13203c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q4 f13204d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(u2 u2Var, String str, q4 q4Var, E7.d dVar) {
        super(2, dVar);
        this.f13202b = u2Var;
        this.f13203c = str;
        this.f13204d = q4Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new t2(this.f13202b, this.f13203c, this.f13204d, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t2) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13201a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        u2 u2Var = this.f13202b;
        dh dhVar = u2Var.f13269a;
        String str = this.f13203c;
        ic icVar = u2Var.f13270b;
        q4 q4Var = this.f13204d;
        gr grVar = (gr) icVar.f12449a.get(q4.class);
        if (grVar != null) {
            Cdo cdo = new Cdo(grVar.a(q4Var).toString());
            s2 s2Var = new s2(this.f13202b);
            no noVar = no.f12834d;
            Set set = io.f12491a;
            this.f13201a = 1;
            Object a5 = ((gh) dhVar).a(2, str, false, cdo, s2Var, noVar, set, this);
            if (a5 == aVar) {
                return aVar;
            }
            return a5;
        }
        throw new NullPointerException(n2.a("ToJsonAdapter for class ", q4.class, " not found"));
    }
}
