package c8;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.InterfaceC0725e;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class r extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f11791r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0725e[] f11792s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11793t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f11794u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ a8.e f11795v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(InterfaceC0725e[] interfaceC0725eArr, int i9, AtomicInteger atomicInteger, a8.e eVar, E7.d dVar) {
        super(2, dVar);
        this.f11792s = interfaceC0725eArr;
        this.f11793t = i9;
        this.f11794u = atomicInteger;
        this.f11795v = eVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new r(this.f11792s, this.f11793t, this.f11794u, this.f11795v, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f11791r;
        AtomicInteger atomicInteger = this.f11794u;
        a8.e eVar = this.f11795v;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                InterfaceC0725e[] interfaceC0725eArr = this.f11792s;
                int i10 = this.f11793t;
                InterfaceC0725e interfaceC0725e = interfaceC0725eArr[i10];
                q qVar = new q(eVar, i10);
                this.f11791r = 1;
                if (interfaceC0725e.collect(qVar, this) == aVar) {
                    return aVar;
                }
            }
            if (atomicInteger.decrementAndGet() == 0) {
                O4.h.k(eVar);
            }
            return A7.n.f558a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                O4.h.k(eVar);
            }
        }
    }
}
