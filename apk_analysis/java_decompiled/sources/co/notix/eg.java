package co.notix;

import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class eg extends G7.j implements O7.q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f12157a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f12158b;

    public eg(E7.d dVar) {
        super(3, dVar);
    }

    @Override // O7.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        eg egVar = new eg((E7.d) obj3);
        egVar.f12157a = booleanValue;
        egVar.f12158b = booleanValue2;
        return egVar.invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        AbstractC0485a.A(obj);
        boolean z10 = this.f12157a;
        boolean z11 = this.f12158b;
        if (z10 && z11) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }
}
