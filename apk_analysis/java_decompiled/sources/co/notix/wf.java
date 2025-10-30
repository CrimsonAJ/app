package co.notix;

import O7.r;
import a.AbstractC0485a;

/* loaded from: classes.dex */
public final class wf extends G7.j implements r {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f13437a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f13438b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f13439c;

    public wf(E7.d dVar) {
        super(4, dVar);
    }

    @Override // O7.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        wf wfVar = new wf((E7.d) obj4);
        wfVar.f13437a = booleanValue;
        wfVar.f13438b = booleanValue2;
        wfVar.f13439c = booleanValue3;
        return wfVar.invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        AbstractC0485a.A(obj);
        boolean z10 = this.f13437a;
        boolean z11 = this.f13438b;
        boolean z12 = this.f13439c;
        if (z10 && z11 && z12) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }
}
