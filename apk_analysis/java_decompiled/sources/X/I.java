package X;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class I extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f7985r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ G7.j f7986s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0403c f7987t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(O7.p pVar, C0403c c0403c, E7.d dVar) {
        super(2, dVar);
        this.f7986s = (G7.j) pVar;
        this.f7987t = c0403c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new I(this.f7986s, this.f7987t, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((I) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7985r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        Object obj2 = this.f7987t.f8052b;
        this.f7985r = 1;
        Object invoke = this.f7986s.invoke(obj2, this);
        if (invoke == aVar) {
            return aVar;
        }
        return invoke;
    }
}
