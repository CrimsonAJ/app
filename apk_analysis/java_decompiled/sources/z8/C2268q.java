package z8;

import i8.InterfaceC1419i;

/* renamed from: z8.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2268q extends r {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2257f f25624d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25625e;

    public C2268q(N n7, InterfaceC1419i interfaceC1419i, InterfaceC2262k interfaceC2262k, InterfaceC2257f interfaceC2257f, boolean z9) {
        super(n7, interfaceC1419i, interfaceC2262k);
        this.f25624d = interfaceC2257f;
        this.f25625e = z9;
    }

    @Override // z8.r
    public final Object a(y yVar, Object[] objArr) {
        InterfaceC2255d interfaceC2255d = (InterfaceC2255d) this.f25624d.a(yVar);
        E7.d dVar = (E7.d) objArr[objArr.length - 1];
        try {
            if (this.f25625e) {
                kotlin.jvm.internal.h.c(interfaceC2255d, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
                return X.c(interfaceC2255d, dVar);
            }
            return X.b(interfaceC2255d, dVar);
        } catch (LinkageError e8) {
            throw e8;
        } catch (ThreadDeath e9) {
            throw e9;
        } catch (VirtualMachineError e10) {
            throw e10;
        } catch (Throwable th) {
            X.r(th, dVar);
            return F7.a.f2587a;
        }
    }
}
