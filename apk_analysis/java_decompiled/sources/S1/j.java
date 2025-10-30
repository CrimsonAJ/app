package S1;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f6721r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f6722s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, E7.d dVar) {
        super(2, dVar);
        this.f6722s = lVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new j(this.f6722s, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        Object a5;
        Object obj2 = F7.a.f2587a;
        int i9 = this.f6721r;
        l lVar = this.f6722s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                a5 = ((A7.j) obj).f550a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            L2.l lVar2 = lVar.f6729h;
            this.f6721r = 1;
            a5 = lVar2.a(this);
            if (a5 == obj2) {
                return obj2;
            }
        }
        if (!(a5 instanceof A7.i)) {
            lVar.f6731k.i((List) a5);
        }
        return n.f558a;
    }
}
