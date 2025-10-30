package L2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.ArrayList;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class q extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f4624r;

    /* renamed from: s, reason: collision with root package name */
    public ArrayList f4625s;

    /* renamed from: t, reason: collision with root package name */
    public int f4626t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f4627u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z9, E7.d dVar) {
        super(2, dVar);
        this.f4627u = z9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new q(this.f4627u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ArrayList arrayList2;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4626t;
        if (i9 != 0) {
            if (i9 == 1) {
                arrayList = this.f4625s;
                arrayList2 = this.f4624r;
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            String b02 = g6.o.f17761a.b0();
            if (this.f4627u) {
                return b02;
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(String.valueOf(E2.d.f1936b.get()));
            String id = TimeZone.getDefault().getID();
            kotlin.jvm.internal.h.d(id, "getID(...)");
            arrayList3.add(id);
            int i10 = X7.a.f8474d;
            long A2 = Z0.a.A(30, X7.c.SECONDS);
            ?? jVar = new G7.j(2, null);
            this.f4624r = arrayList3;
            this.f4625s = arrayList3;
            this.f4626t = 1;
            Object D8 = Y7.B.D(Y7.B.z(A2), jVar, this);
            if (D8 == aVar) {
                return aVar;
            }
            arrayList = arrayList3;
            obj = D8;
            arrayList2 = arrayList;
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        arrayList.add(str);
        return B7.k.u0(arrayList2, null, null, null, null, 63);
    }
}
