package c8;

import a.AbstractC0485a;
import b8.InterfaceC0726f;

/* loaded from: classes.dex */
public final class G extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11743r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f11744s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0726f f11745t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(InterfaceC0726f interfaceC0726f, E7.d dVar) {
        super(2, dVar);
        this.f11745t = interfaceC0726f;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        G g9 = new G(this.f11745t, dVar);
        g9.f11744s = obj;
        return g9;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((G) create(obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11743r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            Object obj2 = this.f11744s;
            this.f11743r = 1;
            if (this.f11745t.emit(obj2, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
