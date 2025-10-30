package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;
import co.notix.callback.NotixCallback;
import co.notix.callback.NotixCallbackStatus;

/* loaded from: classes.dex */
public final class ja extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12541a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12542b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ma f12543c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12544d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(ma maVar, String str, E7.d dVar) {
        super(2, dVar);
        this.f12543c = maVar;
        this.f12544d = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        ja jaVar = new ja(this.f12543c, this.f12544d, dVar);
        jaVar.f12542b = obj;
        return jaVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ja) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12541a;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                ma maVar = this.f12543c;
                String str = this.f12544d;
                m9 m9Var = maVar.f12770a;
                this.f12541a = 1;
                t9 t9Var = (t9) m9Var;
                t9Var.getClass();
                obj = B.C(K.f8774b, new o9(t9Var, str, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            h7 = (String) obj;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        String str2 = this.f12544d;
        ma maVar2 = this.f12543c;
        Throwable a5 = A7.j.a(h7);
        if (a5 == null) {
            md.f12779a.a("click tracked clickData = " + str2);
            maVar2.f12771b.a(new NotixCallback.Click(NotixCallbackStatus.SUCCESS, (String) h7));
            return Boolean.TRUE;
        }
        yn.a(md.f12779a, "could not send click event", a5);
        maVar2.f12771b.a(new NotixCallback.Click(NotixCallbackStatus.FAILURE, a5.getMessage()));
        return Boolean.FALSE;
    }
}
