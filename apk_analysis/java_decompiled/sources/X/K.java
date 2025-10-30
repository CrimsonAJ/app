package X;

import Y7.C0473n;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b7.C0701c;
import java.util.concurrent.atomic.AtomicInteger;
import l1.C1535g;

/* loaded from: classes.dex */
public final class K extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public int f7993r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f7994s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ O f7995t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G7.j f7996u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(O o9, O7.p pVar, E7.d dVar) {
        super(2, dVar);
        this.f7995t = o9;
        this.f7996u = (G7.j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        K k5 = new K(this.f7995t, this.f7996u, dVar);
        k5.f7994s = obj;
        return k5;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        a8.j jVar;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f7993r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f7994s;
        C0473n c0473n = new C0473n();
        O o9 = this.f7995t;
        Q q9 = new Q(this.f7996u, c0473n, o9.f8018h.a(), interfaceC0484z.g());
        C1535g c1535g = o9.f8021l;
        Object j = ((a8.e) c1535g.f20184c).j(q9);
        Throwable th = null;
        if (j instanceof a8.j) {
            if (u0.z.i(j)) {
                jVar = (a8.j) j;
            } else {
                jVar = null;
            }
            if (jVar != null) {
                th = jVar.f9228a;
            }
            if (th == null) {
                throw new IllegalStateException("Channel was closed normally");
            }
            throw th;
        }
        if (!(j instanceof a8.k)) {
            if (((AtomicInteger) ((C0701c) c1535g.f20185d).f11404b).getAndIncrement() == 0) {
                Y7.B.r((InterfaceC0484z) c1535g.f20182a, null, new U(c1535g, null), 3);
            }
            this.f7993r = 1;
            Object o10 = c0473n.o(this);
            if (o10 == aVar) {
                return aVar;
            }
            return o10;
        }
        throw new IllegalStateException("Check failed.");
    }
}
