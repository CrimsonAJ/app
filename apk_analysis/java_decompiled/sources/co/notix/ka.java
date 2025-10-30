package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;
import co.notix.callback.NotixCallback;
import co.notix.callback.NotixCallbackStatus;

/* loaded from: classes.dex */
public final class ka extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12599a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ma f12601c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d3 f12603e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka(ma maVar, String str, d3 d3Var, E7.d dVar) {
        super(2, dVar);
        this.f12601c = maVar;
        this.f12602d = str;
        this.f12603e = d3Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        ka kaVar = new ka(this.f12601c, this.f12602d, this.f12603e, dVar);
        kaVar.f12600b = obj;
        return kaVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ka) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12599a;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                ma maVar = this.f12601c;
                String str = this.f12602d;
                m9 m9Var = maVar.f12770a;
                this.f12599a = 1;
                t9 t9Var = (t9) m9Var;
                t9Var.getClass();
                obj = B.C(K.f8774b, new q9(t9Var, str, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            h7 = (String) obj;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        d3 d3Var = this.f12603e;
        ma maVar2 = this.f12601c;
        Throwable a5 = A7.j.a(h7);
        if (a5 == null) {
            md.f12779a.a("close event tracked. adFormat=" + d3Var.getName());
            maVar2.f12771b.a(new NotixCallback.AdDismissed(NotixCallbackStatus.SUCCESS, (String) h7));
            return Boolean.TRUE;
        }
        yn.a(md.f12779a, "could not send close event. adFormat=" + d3Var.getName(), a5);
        maVar2.f12771b.a(new NotixCallback.AdDismissed(NotixCallbackStatus.FAILURE, a5.getMessage()));
        return Boolean.FALSE;
    }
}
