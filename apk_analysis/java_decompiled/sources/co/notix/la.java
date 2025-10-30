package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import Y7.K;
import a.AbstractC0485a;
import co.notix.callback.NotixCallback;
import co.notix.callback.NotixCallbackStatus;

/* loaded from: classes.dex */
public final class la extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12695a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f12696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ma f12697c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f12698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d3 f12699e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(ma maVar, String str, d3 d3Var, E7.d dVar) {
        super(2, dVar);
        this.f12697c = maVar;
        this.f12698d = str;
        this.f12699e = d3Var;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        la laVar = new la(this.f12697c, this.f12698d, this.f12699e, dVar);
        laVar.f12696b = obj;
        return laVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((la) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object h7;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12695a;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                ma maVar = this.f12697c;
                String str = this.f12698d;
                m9 m9Var = maVar.f12770a;
                this.f12695a = 1;
                t9 t9Var = (t9) m9Var;
                t9Var.getClass();
                obj = B.C(K.f8774b, new s9(t9Var, str, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            h7 = (String) obj;
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        d3 d3Var = this.f12699e;
        ma maVar2 = this.f12697c;
        Throwable a5 = A7.j.a(h7);
        if (a5 == null) {
            md.f12779a.a("impression tracked. adFormat=" + d3Var.getName());
            maVar2.f12771b.a(new NotixCallback.Impression(NotixCallbackStatus.SUCCESS, (String) h7));
            return Boolean.TRUE;
        }
        yn.a(md.f12779a, "could not send impression event. adFormat=" + d3Var.getName(), a5);
        maVar2.f12771b.a(new NotixCallback.Impression(NotixCallbackStatus.FAILURE, a5.getMessage()));
        return Boolean.FALSE;
    }
}
