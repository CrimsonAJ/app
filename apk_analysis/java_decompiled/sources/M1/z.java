package M1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;
import i0.W;

/* loaded from: classes.dex */
public final class z extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4764r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ B f4765s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(E7.d dVar, B b9) {
        super(2, dVar);
        this.f4765s = b9;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new z(dVar, this.f4765s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4764r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            B b9 = this.f4765s;
            W t7 = b9.t();
            EnumC0555p enumC0555p = EnumC0555p.f9897e;
            y yVar = new y(null, b9);
            this.f4764r = 1;
            if (Y.h(t7, enumC0555p, yVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
