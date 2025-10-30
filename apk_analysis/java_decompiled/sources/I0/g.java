package I0;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f3208r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O7.p f3209s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f3210t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(O7.p pVar, kotlin.jvm.internal.o oVar, E7.d dVar) {
        super(2, dVar);
        this.f3209s = pVar;
        this.f3210t = oVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new g(this.f3209s, this.f3210t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f3208r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        Object obj2 = this.f3210t.f20159a;
        this.f3208r = 1;
        Object invoke = this.f3209s.invoke(obj2, this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
