package co.notix;

import Y7.B;
import Y7.C0463g0;
import Y7.InterfaceC0465h0;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class db extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public bb f12082a;

    /* renamed from: b, reason: collision with root package name */
    public int f12083b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12084c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb f12085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(eb ebVar, E7.d dVar) {
        super(2, dVar);
        this.f12085d = ebVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        db dbVar = new db(this.f12085d, dVar);
        dbVar.f12084c = obj;
        return dbVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((db) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0484z interfaceC0484z;
        bb bbVar;
        boolean z9;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12083b;
        if (i9 != 0) {
            if (i9 == 1) {
                bbVar = this.f12082a;
                interfaceC0484z = (InterfaceC0484z) this.f12084c;
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            interfaceC0484z = (InterfaceC0484z) this.f12084c;
            bbVar = new bb(false, System.currentTimeMillis());
        }
        while (true) {
            InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) interfaceC0484z.g().get(C0463g0.f8811a);
            if (interfaceC0465h0 != null) {
                z9 = interfaceC0465h0.a();
            } else {
                z9 = true;
            }
            if (z9) {
                boolean a5 = eb.a(this.f12085d);
                long currentTimeMillis = System.currentTimeMillis();
                bb bbVar2 = new bb(a5, currentTimeMillis);
                if (bbVar.f11923a && a5) {
                    long j = currentTimeMillis - bbVar.f11924b;
                    eb ebVar = this.f12085d;
                    B.r(ebVar.f12151b, null, new cb(ebVar, j, null), 3);
                }
                this.f12084c = interfaceC0484z;
                this.f12082a = bbVar2;
                this.f12083b = 1;
                if (B.g(5000L, this) == aVar) {
                    return aVar;
                }
                bbVar = bbVar2;
            } else {
                return A7.n.f558a;
            }
        }
    }
}
