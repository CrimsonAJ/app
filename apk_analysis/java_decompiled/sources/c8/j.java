package c8;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0704C;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class j extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11768r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f11769s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0726f f11770t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f11771u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n nVar, InterfaceC0726f interfaceC0726f, Object obj, E7.d dVar) {
        super(2, dVar);
        this.f11769s = nVar;
        this.f11770t = interfaceC0726f;
        this.f11771u = obj;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new j(this.f11769s, this.f11770t, this.f11771u, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11768r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            C0704C c0704c = this.f11769s.f11785e;
            this.f11768r = 1;
            if (c0704c.invoke(this.f11770t, this.f11771u, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
