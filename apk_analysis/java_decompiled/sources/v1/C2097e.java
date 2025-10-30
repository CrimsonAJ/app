package v1;

import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import java.io.IOException;

/* renamed from: v1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2097e extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C2098f f23741r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2097e(C2098f c2098f, E7.d dVar) {
        super(2, dVar);
        this.f23741r = c2098f;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new C2097e(this.f23741r, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2097e) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, x8.G] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        boolean z9;
        AbstractC0485a.A(obj);
        C2098f c2098f = this.f23741r;
        synchronized (c2098f) {
            if (c2098f.f23753l && !c2098f.f23754m) {
                try {
                    c2098f.a0();
                } catch (IOException unused) {
                    c2098f.f23755n = true;
                }
                try {
                    if (c2098f.f23751i >= 2000) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        c2098f.h0();
                    }
                } catch (IOException unused2) {
                    c2098f.f23756o = true;
                    c2098f.j = v4.e.a(new Object());
                }
                return n.f558a;
            }
            return n.f558a;
        }
    }
}
