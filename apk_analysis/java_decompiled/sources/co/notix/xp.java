package co.notix;

import Y7.B;
import Y7.K;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class xp extends G7.j implements O7.l {

    /* renamed from: a, reason: collision with root package name */
    public int f13563a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mq f13564b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp(mq mqVar, E7.d dVar) {
        super(1, dVar);
        this.f13564b = mqVar;
    }

    @Override // G7.a
    public final E7.d create(E7.d dVar) {
        return new xp(this.f13564b, dVar);
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        return ((xp) create((E7.d) obj)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13563a;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                mq mqVar = this.f13564b;
                tp tpVar = mqVar.f12798a;
                String c3 = mqVar.f12800c.c();
                mqVar.f12800c.getClass();
                oq oqVar = new oq(c3, xq.a());
                this.f13563a = 1;
                wp wpVar = (wp) tpVar;
                wpVar.getClass();
                obj = B.C(K.f8774b, new vp(wpVar, oqVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            h7 = (sp) obj;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        if (!(h7 instanceof A7.i)) {
            kd kdVar = md.f12779a;
            kdVar.getClass();
            kdVar.f12607b.b("/c fetch success");
        }
        Throwable a5 = A7.j.a(h7);
        if (a5 != null) {
            yn.a(md.f12779a, "/c fetch failure", a5);
        }
        return new A7.j(h7);
    }
}
