package Y2;

import a3.C0490a;
import android.content.Context;
import d3.C1120b;
import z7.InterfaceC2251a;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public Context f8632a;

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, Y2.l] */
    public l a() {
        Context context = this.f8632a;
        if (context != null) {
            ?? obj = new Object();
            obj.f8633a = C0490a.a(n.f8641a);
            Z2.e eVar = new Z2.e(3, context);
            obj.f8634b = eVar;
            obj.f8635c = C0490a.a(new Z2.g(eVar, new Z2.e(0, eVar), 0));
            Z2.e eVar2 = obj.f8634b;
            obj.f8636d = new Z2.e(2, eVar2);
            InterfaceC2251a a5 = C0490a.a(new Z2.g(obj.f8636d, C0490a.a(new Z2.e(1, eVar2)), 1));
            obj.f8637e = a5;
            o oVar = new o(1);
            Z2.e eVar3 = obj.f8634b;
            t tVar = new t(eVar3, a5, oVar, 1);
            InterfaceC2251a interfaceC2251a = obj.f8633a;
            InterfaceC2251a interfaceC2251a2 = obj.f8635c;
            obj.f8638f = C0490a.a(new t(new C1120b(interfaceC2251a, interfaceC2251a2, tVar, a5, a5), new e3.k(eVar3, interfaceC2251a2, a5, tVar, interfaceC2251a, a5, a5), new e3.m(interfaceC2251a, a5, tVar, a5), 0));
            return obj;
        }
        throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
    }
}
