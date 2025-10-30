package b8;

import a.AbstractC0485a;

/* renamed from: b8.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704C extends G7.j implements O7.q {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f11413r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f11414s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ InterfaceC0726f f11415t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f11416u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ G7.j f11417v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0704C(E7.d dVar, O7.r rVar) {
        super(3, dVar);
        this.f11417v = (G7.j) rVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [O7.r, G7.j] */
    /* JADX WARN: Type inference failed for: r1v1, types: [G7.j, O7.q] */
    /* JADX WARN: Type inference failed for: r1v2, types: [G7.j, O7.p] */
    @Override // O7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC0726f interfaceC0726f = (InterfaceC0726f) obj;
        switch (this.f11413r) {
            case 0:
                C0704C c0704c = new C0704C((E7.d) obj3, (O7.r) this.f11417v);
                c0704c.f11415t = interfaceC0726f;
                c0704c.f11416u = (Object[]) obj2;
                return c0704c.invokeSuspend(A7.n.f558a);
            case 1:
                C0704C c0704c2 = new C0704C((O7.q) this.f11417v, (E7.d) obj3);
                c0704c2.f11415t = interfaceC0726f;
                c0704c2.f11416u = (Object[]) obj2;
                return c0704c2.invokeSuspend(A7.n.f558a);
            default:
                C0704C c0704c3 = new C0704C((O7.p) this.f11417v, (E7.d) obj3);
                c0704c3.f11415t = interfaceC0726f;
                c0704c3.f11416u = obj2;
                return c0704c3.invokeSuspend(A7.n.f558a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [O7.r, G7.j] */
    /* JADX WARN: Type inference failed for: r3v4, types: [G7.j, O7.q] */
    /* JADX WARN: Type inference failed for: r3v7, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC0726f interfaceC0726f;
        InterfaceC0726f interfaceC0726f2;
        InterfaceC0726f interfaceC0726f3;
        switch (this.f11413r) {
            case 0:
                F7.a aVar = F7.a.f2587a;
                int i9 = this.f11414s;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            AbstractC0485a.A(obj);
                            return A7.n.f558a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0726f = this.f11415t;
                    AbstractC0485a.A(obj);
                } else {
                    AbstractC0485a.A(obj);
                    interfaceC0726f = this.f11415t;
                    Object[] objArr = (Object[]) this.f11416u;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    this.f11415t = interfaceC0726f;
                    this.f11414s = 1;
                    obj = this.f11417v.invoke(obj2, obj3, obj4, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                this.f11415t = null;
                this.f11414s = 2;
                if (interfaceC0726f.emit(obj, this) == aVar) {
                    return aVar;
                }
                return A7.n.f558a;
            case 1:
                F7.a aVar2 = F7.a.f2587a;
                int i10 = this.f11414s;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            AbstractC0485a.A(obj);
                            return A7.n.f558a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0726f2 = this.f11415t;
                    AbstractC0485a.A(obj);
                } else {
                    AbstractC0485a.A(obj);
                    interfaceC0726f2 = this.f11415t;
                    Object[] objArr2 = (Object[]) this.f11416u;
                    Object obj5 = objArr2[0];
                    Object obj6 = objArr2[1];
                    this.f11415t = interfaceC0726f2;
                    this.f11414s = 1;
                    obj = this.f11417v.invoke(obj5, obj6, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                }
                this.f11415t = null;
                this.f11414s = 2;
                if (interfaceC0726f2.emit(obj, this) == aVar2) {
                    return aVar2;
                }
                return A7.n.f558a;
            default:
                F7.a aVar3 = F7.a.f2587a;
                int i11 = this.f11414s;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC0485a.A(obj);
                            return A7.n.f558a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC0726f3 = this.f11415t;
                    AbstractC0485a.A(obj);
                } else {
                    AbstractC0485a.A(obj);
                    interfaceC0726f3 = this.f11415t;
                    Object obj7 = this.f11416u;
                    this.f11415t = interfaceC0726f3;
                    this.f11414s = 1;
                    obj = this.f11417v.invoke(obj7, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                }
                this.f11415t = null;
                this.f11414s = 2;
                if (interfaceC0726f3.emit(obj, this) == aVar3) {
                    return aVar3;
                }
                return A7.n.f558a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0704C(O7.p pVar, E7.d dVar) {
        super(3, dVar);
        this.f11417v = (G7.j) pVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0704C(O7.q qVar, E7.d dVar) {
        super(3, dVar);
        this.f11417v = (G7.j) qVar;
    }
}
