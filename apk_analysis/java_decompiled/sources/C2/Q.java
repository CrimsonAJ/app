package C2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import u2.C2067a;
import v2.C2101a;
import v2.C2102b;

/* loaded from: classes.dex */
public final class Q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f1289r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ S f1290s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(String str, S s9, E7.d dVar) {
        super(2, dVar);
        this.f1289r = str;
        this.f1290s = s9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new Q(this.f1289r, this.f1290s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((Q) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Y2.r rVar = new Y2.r(5);
        rVar.T(this.f1289r);
        i8.L h7 = ((i8.E) this.f1290s.f1291a.getValue()).c(rVar.o()).h();
        String str = null;
        if (h7.g()) {
            i8.N n7 = h7.f19035g;
            if (n7 != null) {
                str = n7.s();
            }
            if (str == null) {
                str = "";
            }
            return new C2102b(str);
        }
        return new C2101a(new C2067a((String) null, 3));
    }
}
