package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class ug extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f13294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wg f13295b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug(wg wgVar, E7.d dVar) {
        super(2, dVar);
        this.f13295b = wgVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new ug(this.f13295b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ug) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13294a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            kd kdVar = md.f12779a;
            kdVar.getClass();
            kdVar.f12607b.b("Cancel LSI");
            gd gdVar = this.f13295b.f13443d;
            this.f13294a = 1;
            if (gdVar.a(this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
