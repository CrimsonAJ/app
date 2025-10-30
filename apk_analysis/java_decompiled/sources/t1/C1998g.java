package t1;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: t1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1998g extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f23072r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2004m f23073s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1.i f23074t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1998g(C1.i iVar, E7.d dVar, C2004m c2004m) {
        super(2, dVar);
        this.f23073s = c2004m;
        this.f23074t = iVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1998g(this.f23074t, dVar, this.f23073s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1998g) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f23072r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        this.f23072r = 1;
        Object a5 = C2004m.a(this.f23073s, this.f23074t, 1, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
