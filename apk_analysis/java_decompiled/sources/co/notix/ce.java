package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.Set;

/* loaded from: classes.dex */
public final class ce extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12006a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ de f12007b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f12008c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce(de deVar, String str, E7.d dVar) {
        super(2, dVar);
        this.f12007b = deVar;
        this.f12008c = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new ce(this.f12007b, this.f12008c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ce) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12006a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        dh dhVar = this.f12007b.f12090a;
        Cdo cdo = new Cdo(this.f12008c);
        be beVar = be.f11926a;
        no noVar = no.f12835e;
        Set set = io.f12491a;
        this.f12006a = 1;
        Object a5 = ((gh) dhVar).a(3, "/inapp/metrics", false, cdo, beVar, noVar, set, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
