package co.notix;

import Y7.B;
import a.AbstractC0485a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class y3 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13573a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f13574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c4 f13575c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(c4 c4Var, E7.d dVar) {
        super(2, dVar);
        this.f13575c = c4Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        y3 y3Var = new y3(this.f13575c, dVar);
        y3Var.f13574b = obj;
        return y3Var;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y3) create((List) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Long l9;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13573a;
        A7.n nVar = A7.n.f558a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            List list = (List) this.f13574b;
            this.f13575c.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if ((((t4) obj2).f13211d - System.currentTimeMillis()) - l4.f12672h > 0) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                l9 = null;
            } else {
                Long l10 = new Long(((t4) it.next()).f13211d);
                while (it.hasNext()) {
                    Long l11 = new Long(((t4) it.next()).f13211d);
                    if (l10.compareTo(l11) > 0) {
                        l10 = l11;
                    }
                }
                l9 = l10;
            }
            if (l9 != null) {
                long longValue = ((l9.longValue() - System.currentTimeMillis()) - l4.f12672h) - 3;
                if (longValue < 5000) {
                    longValue = 5000;
                }
                this.f13573a = 1;
                if (B.g(longValue, this) == aVar) {
                    return aVar;
                }
            }
            return nVar;
        }
        this.f13575c.f11983k.d(qj.f13056a);
        return nVar;
    }
}
