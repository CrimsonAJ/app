package c8;

import Y7.C0463g0;
import Y7.InterfaceC0465h0;

/* loaded from: classes.dex */
public final class C extends kotlin.jvm.internal.i implements O7.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f11739d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(z zVar) {
        super(2);
        this.f11739d = zVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        int i9;
        int intValue = ((Number) obj).intValue();
        E7.g gVar = (E7.g) obj2;
        E7.h key = gVar.getKey();
        E7.g gVar2 = this.f11739d.f11811s.get(key);
        if (key != C0463g0.f8811a) {
            if (gVar != gVar2) {
                i9 = Integer.MIN_VALUE;
            } else {
                i9 = intValue + 1;
            }
            return Integer.valueOf(i9);
        }
        InterfaceC0465h0 interfaceC0465h0 = (InterfaceC0465h0) gVar2;
        InterfaceC0465h0 interfaceC0465h02 = (InterfaceC0465h0) gVar;
        while (true) {
            if (interfaceC0465h02 == null) {
                interfaceC0465h02 = null;
                break;
            }
            if (interfaceC0465h02 == interfaceC0465h0 || !(interfaceC0465h02 instanceof d8.t)) {
                break;
            }
            interfaceC0465h02 = interfaceC0465h02.getParent();
        }
        if (interfaceC0465h02 == interfaceC0465h0) {
            if (interfaceC0465h0 != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0465h02 + ", expected child of " + interfaceC0465h0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
