package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Set;

/* loaded from: classes.dex */
public final class vj extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13369a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wj f13371c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13372d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj(wj wjVar, String str, E7.d dVar) {
        super(2, dVar);
        this.f13371c = wjVar;
        this.f13372d = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        vj vjVar = new vj(this.f13371c, this.f13372d, dVar);
        vjVar.f13370b = obj;
        return vjVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((vj) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13369a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f13370b;
        dh dhVar = this.f13371c.f13445a;
        Cdo cdo = new Cdo(this.f13372d);
        uj ujVar = new uj(interfaceC0484z, this.f13371c);
        no noVar = no.f12835e;
        Set set = io.f12491a;
        this.f13369a = 1;
        Object a5 = ((gh) dhVar).a(2, "/inapp/pwant", false, cdo, ujVar, noVar, set, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
