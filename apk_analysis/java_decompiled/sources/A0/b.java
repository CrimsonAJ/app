package A0;

import A6.t;
import A7.n;
import F0.Y;
import O7.l;
import S5.o;
import X.Q;
import Y7.C0473n;
import Y7.C0476q;
import Z7.d;
import a8.e;
import a8.k;
import android.os.Bundle;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import l1.C1535g;
import l6.AbstractC1570b;
import l8.g;
import u.h;
import u.j;
import u0.C;
import u0.C2032c;
import u0.C2042m;
import u0.C2044o;
import u0.F;
import u0.H;
import u0.J;
import u0.K;
import u0.V;

/* loaded from: classes.dex */
public final class b extends i implements l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, int i9, Object obj2) {
        super(1);
        this.f2d = i9;
        this.f3e = obj;
        this.f4f = obj2;
    }

    @Override // O7.l
    public final Object invoke(Object obj) {
        n nVar;
        n nVar2;
        Throwable th;
        F f9;
        boolean z9 = true;
        switch (this.f2d) {
            case 0:
                Throwable th2 = (Throwable) obj;
                h hVar = (h) this.f3e;
                if (th2 != null) {
                    if (th2 instanceof CancellationException) {
                        hVar.f23362d = true;
                        j jVar = hVar.f23360b;
                        if (jVar != null && jVar.f23365b.cancel(true)) {
                            hVar.f23359a = null;
                            hVar.f23360b = null;
                            hVar.f23361c = null;
                        }
                    } else {
                        hVar.f23362d = true;
                        j jVar2 = hVar.f23360b;
                        if (jVar2 != null && jVar2.f23365b.k(th2)) {
                            hVar.f23359a = null;
                            hVar.f23360b = null;
                            hVar.f23361c = null;
                        }
                    }
                } else {
                    Object y9 = ((Y7.F) this.f4f).y();
                    hVar.f23362d = true;
                    j jVar3 = hVar.f23360b;
                    if (jVar3 != null && jVar3.f23365b.j(y9)) {
                        hVar.f23359a = null;
                        hVar.f23360b = null;
                        hVar.f23361c = null;
                    }
                }
                return n.f558a;
            case 1:
                Throwable th3 = (Throwable) obj;
                ((C0.b) this.f3e).invoke(th3);
                C1535g c1535g = (C1535g) this.f4f;
                ((e) c1535g.f20184c).g(th3, false);
                do {
                    Object h7 = ((e) c1535g.f20184c).h();
                    if (h7 instanceof k) {
                        h7 = null;
                    }
                    nVar = n.f558a;
                    if (h7 != null) {
                        Q q9 = (Q) h7;
                        if (th3 == null) {
                            th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                        } else {
                            th = th3;
                        }
                        C0473n c0473n = q9.f8024b;
                        c0473n.getClass();
                        c0473n.L(new C0476q(th, false));
                        nVar2 = nVar;
                    } else {
                        nVar2 = null;
                    }
                } while (nVar2 != null);
                return nVar;
            case 2:
                ((d) this.f3e).f9068b.removeCallbacks((o) this.f4f);
                return n.f558a;
            case 3:
                IOException it = (IOException) obj;
                kotlin.jvm.internal.h.e(it, "it");
                g gVar = (g) this.f3e;
                t tVar = (t) this.f4f;
                synchronized (gVar) {
                    tVar.f();
                }
                return n.f558a;
            case 4:
                K navOptions = (K) obj;
                kotlin.jvm.internal.h.e(navOptions, "$this$navOptions");
                Y y10 = navOptions.f23431a;
                y10.f2058a = 0;
                y10.f2059b = 0;
                C c3 = (C) this.f3e;
                if (c3 instanceof F) {
                    int i9 = C.j;
                    Iterator it2 = V7.l.g0(c3, C2032c.j).iterator();
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        H h9 = (H) this.f4f;
                        if (hasNext) {
                            C c9 = (C) it2.next();
                            C f10 = h9.f();
                            if (f10 != null) {
                                f9 = f10.f23375b;
                            } else {
                                f9 = null;
                            }
                            if (kotlin.jvm.internal.h.a(c9, f9)) {
                            }
                        } else {
                            int i10 = F.f23386n;
                            navOptions.f23434d = AbstractC1570b.d(h9.g()).f23381h;
                            navOptions.f23435e = true;
                        }
                    }
                }
                return n.f558a;
            default:
                C2042m backStackEntry = (C2042m) obj;
                kotlin.jvm.internal.h.e(backStackEntry, "backStackEntry");
                C c10 = backStackEntry.f23496b;
                if (c10 == null) {
                    z9 = false;
                }
                if (!z9) {
                    c10 = null;
                }
                if (c10 == null) {
                    return null;
                }
                Bundle a5 = backStackEntry.a();
                J j = (J) this.f4f;
                V v8 = (V) this.f3e;
                C c11 = v8.c(c10, a5, j);
                if (c11 == null) {
                    return null;
                }
                if (c11.equals(c10)) {
                    return backStackEntry;
                }
                C2044o b9 = v8.b();
                Bundle b10 = c11.b(backStackEntry.a());
                H h10 = b9.f23518h;
                return d0.o.e(h10.f23394a, c11, b10, h10.h(), h10.f23407o);
        }
    }
}
