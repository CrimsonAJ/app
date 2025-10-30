package c8;

import a.AbstractC0485a;
import b8.InterfaceC0726f;

/* renamed from: c8.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11761r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11762s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f11763t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797g(h hVar, E7.d dVar) {
        super(2, dVar);
        this.f11763t = hVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C0797g c0797g = new C0797g(this.f11763t, dVar);
        c0797g.f11762s = obj;
        return c0797g;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0797g) create((InterfaceC0726f) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11761r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            InterfaceC0726f interfaceC0726f = (InterfaceC0726f) this.f11762s;
            this.f11761r = 1;
            if (this.f11763t.c(interfaceC0726f, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
