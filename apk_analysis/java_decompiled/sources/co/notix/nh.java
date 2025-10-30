package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import b8.C0737q;
import b8.InterfaceC0707F;

/* loaded from: classes.dex */
public final class nh extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public int f12822a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vh f12823b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh(vh vhVar, E7.d dVar) {
        super(2, dVar);
        this.f12823b = vhVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new nh(this.f12823b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((nh) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.internal.m, java.lang.Object] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f12822a;
        if (i9 != 0) {
            if (i9 == 1) {
                AbstractC0485a.A(obj);
                return A7.n.f558a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0485a.A(obj);
        vh vhVar = this.f12823b;
        InterfaceC0707F interfaceC0707F = vhVar.f13366b;
        mh mhVar = new mh(vhVar);
        this.f12822a = 1;
        interfaceC0707F.collect(new C0737q((kotlin.jvm.internal.m) new Object(), mhVar), this);
        return aVar;
    }
}
