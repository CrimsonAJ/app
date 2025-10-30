package b8;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: b8.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0728h extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11476r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0733m f11477s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728h(C0733m c0733m, E7.d dVar) {
        super(2, dVar);
        this.f11477s = c0733m;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0728h(this.f11477s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0728h) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11476r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f11476r = 1;
            if (AbstractC0714M.h(this.f11477s, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
