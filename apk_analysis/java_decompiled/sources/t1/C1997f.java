package t1;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;

/* renamed from: t1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1997f extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f23069r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2004m f23070s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C1.i f23071t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1997f(C1.i iVar, E7.d dVar, C2004m c2004m) {
        super(2, dVar);
        this.f23070s = c2004m;
        this.f23071t = iVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C1997f(this.f23071t, dVar, this.f23070s);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C1997f) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f23069r;
        C2004m c2004m = this.f23070s;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            this.f23069r = 1;
            obj = C2004m.a(c2004m, this.f23071t, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (((C1.j) obj) instanceof C1.e) {
            c2004m.getClass();
        }
        return obj;
    }
}
