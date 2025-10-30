package co.notix;

import X.C0419t;
import Y7.C0473n;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.content.Context;
import b8.AbstractC0714M;

/* loaded from: classes.dex */
public final class a extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f11815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f11816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f11817c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Context context, E7.d dVar) {
        super(2, dVar);
        this.f11816b = bVar;
        this.f11817c = context;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new a(this.f11816b, this.f11817c, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11815a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            if (!b.a(this.f11816b, this.f11817c)) {
                y8 y8Var = this.f11816b.f11899a;
                f state = f.CREATED;
                this.f11815a = 1;
                d9 d9Var = (d9) y8Var;
                d9Var.getClass();
                kotlin.jvm.internal.h.e(state, "state");
                if (AbstractC0714M.m(new C0419t(new b9(d9Var.f12078b, d9Var), 2), this) == aVar) {
                    return aVar;
                }
            }
        }
        ((C0473n) this.f11816b.f11901c).L(Boolean.TRUE);
        return A7.n.f558a;
    }
}
