package c2;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;

/* renamed from: c2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0761g extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11616r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0763i f11617s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0761g(C0763i c0763i, E7.d dVar) {
        super(2, dVar);
        this.f11617s = c0763i;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C0761g(this.f11617s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0761g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11616r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            C0763i c0763i = this.f11617s;
            C0760f c0760f = new C0760f(c0763i, null);
            this.f11616r = 1;
            if (Y.h(c0763i, enumC0555p, c0760f, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
