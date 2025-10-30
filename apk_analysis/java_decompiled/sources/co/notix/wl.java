package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Set;

/* loaded from: classes.dex */
public final class wl extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13453a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xl f13454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xn f13455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl(xl xlVar, xn xnVar, E7.d dVar) {
        super(2, dVar);
        this.f13454b = xlVar;
        this.f13455c = xnVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new wl(this.f13454b, this.f13455c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((wl) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13453a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        xl xlVar = this.f13454b;
        dh dhVar = xlVar.f13552a;
        ic icVar = xlVar.f13553b;
        xn xnVar = this.f13455c;
        gr grVar = (gr) icVar.f12449a.get(xn.class);
        if (grVar != null) {
            Cdo cdo = new Cdo(grVar.a(xnVar).toString());
            vl vlVar = vl.f13379a;
            no noVar = no.f12835e;
            Set set = io.f12491a;
            this.f13453a = 1;
            Object a5 = ((gh) dhVar).a(3, "/api/inapp/android/log?v=2", false, cdo, vlVar, noVar, set, this);
            if (a5 == aVar) {
                return aVar;
            }
            return a5;
        }
        throw new NullPointerException(n2.a("ToJsonAdapter for class ", xn.class, " not found"));
    }
}
