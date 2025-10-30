package x1;

import A7.n;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import kotlin.jvm.internal.o;
import t1.C1993b;
import t1.C1994c;
import w1.m;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2160d extends G7.j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f24499r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C2165i f24500s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f24501t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ o f24502u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C1.i f24503v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f24504w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f24505x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ C1994c f24506y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2160d(C2165i c2165i, o oVar, o oVar2, C1.i iVar, Object obj, o oVar3, C1994c c1994c, E7.d dVar) {
        super(2, dVar);
        this.f24500s = c2165i;
        this.f24501t = oVar;
        this.f24502u = oVar2;
        this.f24503v = iVar;
        this.f24504w = obj;
        this.f24505x = oVar3;
        this.f24506y = c1994c;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C2160d(this.f24500s, this.f24501t, this.f24502u, this.f24503v, this.f24504w, this.f24505x, this.f24506y, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2160d) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f24499r;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        m mVar = (m) this.f24501t.f20159a;
        C1993b c1993b = (C1993b) this.f24502u.f20159a;
        C1.m mVar2 = (C1.m) this.f24505x.f20159a;
        this.f24499r = 1;
        Object a5 = C2165i.a(this.f24500s, mVar, c1993b, this.f24503v, this.f24504w, mVar2, this.f24506y, this);
        if (a5 == aVar) {
            return aVar;
        }
        return a5;
    }
}
