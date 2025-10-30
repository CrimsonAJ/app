package M1;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import androidx.lifecycle.EnumC0555p;
import androidx.lifecycle.Y;

/* loaded from: classes.dex */
public final class m extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f4725r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f4726s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, E7.d dVar) {
        super(2, dVar);
        this.f4726s = nVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new m(this.f4726s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f4725r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            EnumC0555p enumC0555p = EnumC0555p.f9895c;
            n nVar = this.f4726s;
            l lVar = new l(nVar, null);
            this.f4725r = 1;
            if (Y.h(nVar, enumC0555p, lVar, this) == aVar) {
                return aVar;
            }
        }
        return A7.n.f558a;
    }
}
