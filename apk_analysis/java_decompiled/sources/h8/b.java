package h8;

import Y7.C0464h;
import a.AbstractC0485a;
import f5.AbstractC1176h;
import f5.C1185q;
import f5.InterfaceC1171c;
import i8.G;
import kotlin.jvm.internal.h;
import z8.C2266o;
import z8.C2269s;
import z8.InterfaceC2255d;
import z8.InterfaceC2258g;
import z8.O;

/* loaded from: classes.dex */
public final class b implements InterfaceC1171c, InterfaceC2258g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0464h f17971a;

    public /* synthetic */ b(C0464h c0464h) {
        this.f17971a = c0464h;
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h abstractC1176h) {
        Exception f9 = abstractC1176h.f();
        if (f9 == null) {
            if (((C1185q) abstractC1176h).f17438d) {
                this.f17971a.c(null);
                return;
            } else {
                this.f17971a.resumeWith(abstractC1176h.g());
                return;
            }
        }
        this.f17971a.resumeWith(AbstractC0485a.h(f9));
    }

    @Override // z8.InterfaceC2258g
    public void e(InterfaceC2255d call, Throwable th) {
        h.e(call, "call");
        this.f17971a.resumeWith(AbstractC0485a.h(th));
    }

    @Override // z8.InterfaceC2258g
    public void g(InterfaceC2255d call, O o9) {
        h.e(call, "call");
        boolean g9 = o9.f25587a.g();
        C0464h c0464h = this.f17971a;
        if (g9) {
            Object obj = o9.f25588b;
            if (obj == null) {
                G g10 = call.g();
                g10.getClass();
                Object cast = C2269s.class.cast(g10.f19009e.get(C2269s.class));
                h.b(cast);
                C2269s c2269s = (C2269s) cast;
                c0464h.resumeWith(AbstractC0485a.h(new NullPointerException("Response from " + c2269s.f25629a.getName() + '.' + c2269s.f25631c.getName() + " was null but response body type was declared as non-null")));
                return;
            }
            c0464h.resumeWith(obj);
            return;
        }
        c0464h.resumeWith(AbstractC0485a.h(new C2266o(o9)));
    }
}
