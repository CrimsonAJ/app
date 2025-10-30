package d0;

import D4.InterfaceC0093l;
import P.Q;
import P.u0;
import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.view.View;
import com.google.android.gms.internal.cast.C;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import f5.C1177i;
import j3.M;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.Provider;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import k4.G;
import n3.C1631h;
import n3.C1635l;
import n3.C1642s;
import n3.InterfaceC1632i;
import n3.InterfaceC1637n;
import n3.InterfaceC1638o;
import q3.InterfaceC1898c;
import t4.C2009A;
import x8.C2184d;

/* loaded from: classes.dex */
public class w implements i8.s, i6.j, w5.q, InterfaceC1638o, o.w, InterfaceC1898c, s6.d, InterfaceC0093l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16686a;

    public /* synthetic */ w(int i9) {
        this.f16686a = i9;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [x8.d, java.lang.Object] */
    public static final void n(C2184d c2184d, long j, boolean z9) {
        C2184d c2184d2;
        ReentrantLock reentrantLock = C2184d.f24634h;
        if (C2184d.f24637l == null) {
            C2184d.f24637l = new Object();
            O4.g gVar = new O4.g("Okio Watchdog");
            gVar.setDaemon(true);
            gVar.start();
        }
        long nanoTime = System.nanoTime();
        if (j != 0 && z9) {
            c2184d.f24640g = Math.min(j, c2184d.c() - nanoTime) + nanoTime;
        } else if (j != 0) {
            c2184d.f24640g = j + nanoTime;
        } else if (z9) {
            c2184d.f24640g = c2184d.c();
        } else {
            throw new AssertionError();
        }
        long j4 = c2184d.f24640g - nanoTime;
        C2184d c2184d3 = C2184d.f24637l;
        kotlin.jvm.internal.h.b(c2184d3);
        while (true) {
            c2184d2 = c2184d3.f24639f;
            if (c2184d2 == null || j4 < c2184d2.f24640g - nanoTime) {
                break;
            }
            kotlin.jvm.internal.h.b(c2184d2);
            c2184d3 = c2184d2;
        }
        c2184d.f24639f = c2184d2;
        c2184d3.f24639f = c2184d;
        if (c2184d3 == C2184d.f24637l) {
            C2184d.f24635i.signal();
        }
    }

    public static final boolean o(x8.y yVar) {
        x8.y yVar2 = y8.g.f25146e;
        return !W7.l.G(yVar.b(), ".class", true);
    }

    public static C2184d p() {
        C2184d c2184d = C2184d.f24637l;
        kotlin.jvm.internal.h.b(c2184d);
        C2184d c2184d2 = c2184d.f24639f;
        if (c2184d2 == null) {
            long nanoTime = System.nanoTime();
            C2184d.f24635i.await(C2184d.j, TimeUnit.MILLISECONDS);
            C2184d c2184d3 = C2184d.f24637l;
            kotlin.jvm.internal.h.b(c2184d3);
            if (c2184d3.f24639f != null || System.nanoTime() - nanoTime < C2184d.f24636k) {
                return null;
            }
            return C2184d.f24637l;
        }
        long nanoTime2 = c2184d2.f24640g - System.nanoTime();
        if (nanoTime2 > 0) {
            C2184d.f24635i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C2184d c2184d4 = C2184d.f24637l;
        kotlin.jvm.internal.h.b(c2184d4);
        c2184d4.f24639f = c2184d2.f24639f;
        c2184d2.f24639f = null;
        c2184d2.f24638e = 2;
        return c2184d2;
    }

    @Override // D4.InterfaceC0093l
    public void H(Object obj, Object obj2) {
        y4.w wVar = (y4.w) obj;
        y4.b bVar = C2009A.f23120G;
        Context context = wVar.f2370c;
        C4.g gVar = new C4.g(-1, -1, 0, true);
        y4.g gVar2 = (y4.g) wVar.u();
        C4.f fVar = new C4.f(gVar);
        Parcel Q7 = gVar2.Q();
        C.c(Q7, fVar);
        gVar2.i1(Q7, 1);
        ((C1177i) obj2).b(null);
    }

    @Override // n3.InterfaceC1638o
    public /* synthetic */ void a() {
    }

    @Override // n3.InterfaceC1638o
    public /* synthetic */ void b() {
    }

    @Override // w5.q
    public u0 d(View view, u0 u0Var, G g9) {
        int i9;
        g9.f19992d = u0Var.a() + g9.f19992d;
        WeakHashMap weakHashMap = Q.f5546a;
        boolean z9 = true;
        if (view.getLayoutDirection() != 1) {
            z9 = false;
        }
        int b9 = u0Var.b();
        int c3 = u0Var.c();
        int i10 = g9.f19989a;
        if (z9) {
            i9 = c3;
        } else {
            i9 = b9;
        }
        int i11 = i10 + i9;
        g9.f19989a = i11;
        int i12 = g9.f19991c;
        if (!z9) {
            b9 = c3;
        }
        int i13 = i12 + b9;
        g9.f19991c = i13;
        view.setPaddingRelative(i11, g9.f19990b, i13, g9.f19992d);
        return u0Var;
    }

    @Override // s6.d
    public Object e(Y2.r rVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(rVar);
    }

    @Override // i6.j
    public Object f(String str, Provider provider) {
        switch (this.f16686a) {
            case 4:
                if (provider == null) {
                    return KeyAgreement.getInstance(str);
                }
                return KeyAgreement.getInstance(str, provider);
            default:
                if (provider == null) {
                    return Mac.getInstance(str);
                }
                return Mac.getInstance(str, provider);
        }
    }

    @Override // n3.InterfaceC1638o
    public InterfaceC1632i g(C1635l c1635l, M m9) {
        if (m9.f19438o == null) {
            return null;
        }
        return new C1642s(new C1631h(new Exception(), 6001));
    }

    @Override // n3.InterfaceC1638o
    public int h(M m9) {
        if (m9.f19438o != null) {
            return 1;
        }
        return 0;
    }

    @Override // i8.s
    public List i(String hostname) {
        kotlin.jvm.internal.h.e(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            kotlin.jvm.internal.h.d(allByName, "getAllByName(hostname)");
            return B7.k.C0(B7.j.o0(allByName), new B.j(14));
        } catch (NullPointerException e8) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
            unknownHostException.initCause(e8);
            throw unknownHostException;
        }
    }

    @Override // n3.InterfaceC1638o
    public /* synthetic */ InterfaceC1637n j(C1635l c1635l, M m9) {
        return InterfaceC1637n.f21133c0;
    }

    @Override // o.w
    public boolean m(o.l lVar) {
        return false;
    }

    public boolean q(CharSequence charSequence) {
        return false;
    }

    @Override // q3.InterfaceC1898c
    public long k(long j) {
        return j;
    }

    @Override // o.w
    public void c(o.l lVar, boolean z9) {
    }

    @Override // n3.InterfaceC1638o
    public void l(Looper looper, k3.l lVar) {
    }
}
