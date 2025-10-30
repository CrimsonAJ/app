package z8;

import Y7.C0464h;
import com.google.android.gms.internal.measurement.D1;
import i8.InterfaceC1419i;

/* renamed from: z8.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2267p extends r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25622d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2257f f25623e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2267p(N n7, InterfaceC1419i interfaceC1419i, InterfaceC2262k interfaceC2262k, InterfaceC2257f interfaceC2257f, int i9) {
        super(n7, interfaceC1419i, interfaceC2262k);
        this.f25622d = i9;
        this.f25623e = interfaceC2257f;
    }

    @Override // z8.r
    public final Object a(y yVar, Object[] objArr) {
        switch (this.f25622d) {
            case 0:
                return this.f25623e.a(yVar);
            default:
                InterfaceC2255d interfaceC2255d = (InterfaceC2255d) this.f25623e.a(yVar);
                E7.d dVar = (E7.d) objArr[objArr.length - 1];
                try {
                    C0464h c0464h = new C0464h(1, D1.A(dVar));
                    c0464h.s();
                    c0464h.u(new C2270t(interfaceC2255d, 2));
                    interfaceC2255d.d(new i.G(26, c0464h));
                    return c0464h.r();
                } catch (Exception e8) {
                    X.r(e8, dVar);
                    return F7.a.f2587a;
                }
        }
    }
}
