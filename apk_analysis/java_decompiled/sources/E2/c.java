package E2;

import A7.i;
import A7.n;
import G7.j;
import O7.p;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import com.anilab.data.model.response.ErrorResponse;
import i8.M;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import u2.C2067a;
import u2.C2068b;
import u2.C2069c;
import u2.e;
import v2.AbstractC2103c;
import v2.C2101a;
import z8.C2266o;
import z8.O;

/* loaded from: classes.dex */
public final class c extends j implements p {

    /* renamed from: r, reason: collision with root package name */
    public int f1932r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f1933s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f1934t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, E7.d dVar) {
        super(2, dVar);
        this.f1934t = (j) pVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [G7.j, O7.p] */
    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        c cVar = new c(this.f1934t, dVar);
        cVar.f1933s = obj;
        return cVar;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(n.f558a);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [G7.j, O7.p] */
    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object h7;
        M m9;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f1932r;
        try {
            if (i9 != 0) {
                if (i9 == 1) {
                    AbstractC0485a.A(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC0485a.A(obj);
                InterfaceC0484z interfaceC0484z = (InterfaceC0484z) this.f1933s;
                ?? r1 = this.f1934t;
                this.f1932r = 1;
                obj = r1.invoke(interfaceC0484z, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return (AbstractC2103c) obj;
        } catch (Throwable th) {
            if (!(th instanceof CancellationException)) {
                String str2 = null;
                if (th instanceof C2266o) {
                    C2266o c2266o = (C2266o) th;
                    int i10 = c2266o.f25620a;
                    if (i10 != 400) {
                        if (i10 != 401) {
                            if (i10 != 408) {
                                return new C2101a(new C2067a((String) null, th));
                            }
                            return new C2101a(new e((C2266o) th));
                        }
                        return new C2101a(new IOException());
                    }
                    O o9 = c2266o.f25621b;
                    if (o9 != null && (m9 = o9.f25589c) != null) {
                        str = m9.s();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    try {
                        h7 = (ErrorResponse) d.f1935a.a(ErrorResponse.class).a(str);
                    } catch (Throwable th2) {
                        h7 = AbstractC0485a.h(th2);
                    }
                    if (h7 instanceof i) {
                        h7 = null;
                    }
                    ErrorResponse errorResponse = (ErrorResponse) h7;
                    if (errorResponse != null) {
                        str2 = errorResponse.f14135a;
                    }
                    return new C2101a(new C2067a(str2, th));
                }
                if (th instanceof C2068b) {
                    return new C2101a(new IOException());
                }
                if (th instanceof IOException) {
                    return new C2101a(new C2069c((IOException) th));
                }
                return new C2101a(new C2067a((String) null, th));
            }
            throw th;
        }
    }
}
