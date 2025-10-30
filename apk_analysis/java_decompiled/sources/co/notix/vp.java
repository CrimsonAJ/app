package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Set;

/* loaded from: classes.dex */
public final class vp extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wp f13389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oq f13390c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(wp wpVar, oq oqVar, E7.d dVar) {
        super(2, dVar);
        this.f13389b = wpVar;
        this.f13390c = oqVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new vp(this.f13389b, this.f13390c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((vp) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13388a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        wp wpVar = this.f13389b;
        dh dhVar = wpVar.f13462a;
        ic icVar = wpVar.f13463b;
        oq oqVar = this.f13390c;
        gr grVar = (gr) icVar.f12449a.get(oq.class);
        if (grVar != null) {
            Cdo cdo = new Cdo(grVar.a(oqVar).toString());
            up upVar = new up(this.f13389b);
            no noVar = no.f12833c;
            Set set = io.f12491a;
            this.f13388a = 1;
            Object a5 = ((gh) dhVar).a(1, "/api/inapp/android/c", false, cdo, upVar, noVar, set, this);
            if (a5 == aVar) {
                return aVar;
            }
            return a5;
        }
        throw new NullPointerException(n2.a("ToJsonAdapter for class ", oq.class, " not found"));
    }
}
