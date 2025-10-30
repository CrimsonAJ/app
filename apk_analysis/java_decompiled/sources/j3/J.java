package j3;

import N3.C0251b;
import N3.C0261l;
import N3.InterfaceC0271w;
import N3.InterfaceC0272x;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import b5.C0617c0;
import co.notix.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.C1489e;
import k4.C1514n;
import k4.C1518s;
import k4.InterfaceC1506f;
import l4.AbstractC1566a;
import n3.C1631h;

/* loaded from: classes.dex */
public final class J implements Handler.Callback, InterfaceC0271w {

    /* renamed from: A, reason: collision with root package name */
    public boolean f19348A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f19349B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f19350C;

    /* renamed from: D, reason: collision with root package name */
    public int f19351D;

    /* renamed from: X, reason: collision with root package name */
    public boolean f19352X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f19353Z;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1449d[] f19354a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f19355b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1449d[] f19356c;

    /* renamed from: d, reason: collision with root package name */
    public final i4.s f19357d;

    /* renamed from: e, reason: collision with root package name */
    public final i4.w f19358e;

    /* renamed from: f, reason: collision with root package name */
    public final C1458i f19359f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f19360f0;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1506f f19361g;

    /* renamed from: g0, reason: collision with root package name */
    public int f19362g0;

    /* renamed from: h, reason: collision with root package name */
    public final l4.w f19363h;

    /* renamed from: h0, reason: collision with root package name */
    public I f19364h0;

    /* renamed from: i, reason: collision with root package name */
    public final HandlerThread f19365i;

    /* renamed from: i0, reason: collision with root package name */
    public long f19366i0;
    public final Looper j;

    /* renamed from: j0, reason: collision with root package name */
    public int f19367j0;

    /* renamed from: k, reason: collision with root package name */
    public final D0 f19368k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f19369k0;

    /* renamed from: l, reason: collision with root package name */
    public final C0 f19370l;

    /* renamed from: l0, reason: collision with root package name */
    public C1462m f19371l0;

    /* renamed from: m, reason: collision with root package name */
    public final long f19372m;

    /* renamed from: n, reason: collision with root package name */
    public final C1459j f19374n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f19375o;

    /* renamed from: p, reason: collision with root package name */
    public final l4.u f19376p;

    /* renamed from: q, reason: collision with root package name */
    public final C1467s f19377q;

    /* renamed from: r, reason: collision with root package name */
    public final C1452e0 f19378r;

    /* renamed from: s, reason: collision with root package name */
    public final F5.o f19379s;

    /* renamed from: t, reason: collision with root package name */
    public final C1457h f19380t;

    /* renamed from: u, reason: collision with root package name */
    public final long f19381u;

    /* renamed from: v, reason: collision with root package name */
    public x0 f19382v;

    /* renamed from: w, reason: collision with root package name */
    public l0 f19383w;

    /* renamed from: x, reason: collision with root package name */
    public G f19384x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f19385y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f19386z = false;

    /* renamed from: m0, reason: collision with root package name */
    public long f19373m0 = -9223372036854775807L;

    public J(AbstractC1449d[] abstractC1449dArr, i4.s sVar, i4.w wVar, C1458i c1458i, InterfaceC1506f interfaceC1506f, int i9, boolean z9, C1489e c1489e, x0 x0Var, C1457h c1457h, long j, Looper looper, l4.u uVar, C1467s c1467s, k3.l lVar) {
        this.f19377q = c1467s;
        this.f19354a = abstractC1449dArr;
        this.f19357d = sVar;
        this.f19358e = wVar;
        this.f19359f = c1458i;
        this.f19361g = interfaceC1506f;
        this.f19351D = i9;
        this.f19352X = z9;
        this.f19382v = x0Var;
        this.f19380t = c1457h;
        this.f19381u = j;
        this.f19376p = uVar;
        this.f19372m = c1458i.f19644g;
        l0 h7 = l0.h(wVar);
        this.f19383w = h7;
        this.f19384x = new G(h7);
        this.f19356c = new AbstractC1449d[abstractC1449dArr.length];
        for (int i10 = 0; i10 < abstractC1449dArr.length; i10++) {
            AbstractC1449d abstractC1449d = abstractC1449dArr[i10];
            abstractC1449d.f19587d = i10;
            abstractC1449d.f19588e = lVar;
            this.f19356c[i10] = abstractC1449d;
        }
        this.f19374n = new C1459j(this, uVar);
        this.f19375o = new ArrayList();
        this.f19355b = Collections.newSetFromMap(new IdentityHashMap());
        this.f19368k = new D0();
        this.f19370l = new C0();
        sVar.f18595a = this;
        sVar.f18596b = interfaceC1506f;
        this.f19369k0 = true;
        Handler handler = new Handler(looper);
        this.f19378r = new C1452e0(handler, c1489e);
        this.f19379s = new F5.o(this, c1489e, handler, lVar);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f19365i = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.j = looper2;
        this.f19363h = uVar.a(looper2, this);
    }

    public static Pair F(E0 e02, I i9, boolean z9, int i10, boolean z10, D0 d02, C0 c02) {
        E0 e03;
        Object G8;
        E0 e04 = i9.f19345a;
        if (!e02.p()) {
            if (e04.p()) {
                e03 = e02;
            } else {
                e03 = e04;
            }
            try {
                Pair i11 = e03.i(d02, c02, i9.f19346b, i9.f19347c);
                if (!e02.equals(e03)) {
                    if (e02.b(i11.first) != -1) {
                        if (e03.g(i11.first, c02).f19240f && e03.m(c02.f19237c, d02, 0L).f19316o == e03.b(i11.first)) {
                            return e02.i(d02, c02, e02.g(i11.first, c02).f19237c, i9.f19347c);
                        }
                    } else {
                        if (z9 && (G8 = G(d02, c02, i10, z10, i11.first, e03, e02)) != null) {
                            return e02.i(d02, c02, e02.g(G8, c02).f19237c, -9223372036854775807L);
                        }
                        return null;
                    }
                }
                return i11;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return null;
    }

    public static Object G(D0 d02, C0 c02, int i9, boolean z9, Object obj, E0 e02, E0 e03) {
        int b9 = e02.b(obj);
        int h7 = e02.h();
        int i10 = 0;
        int i11 = b9;
        int i12 = -1;
        while (i10 < h7 && i12 == -1) {
            D0 d03 = d02;
            C0 c03 = c02;
            int i13 = i9;
            boolean z10 = z9;
            E0 e04 = e02;
            i11 = e04.d(i11, c03, d03, i13, z10);
            if (i11 == -1) {
                break;
            }
            i12 = e03.b(e04.l(i11));
            i10++;
            e02 = e04;
            c02 = c03;
            d02 = d03;
            i9 = i13;
            z9 = z10;
        }
        if (i12 == -1) {
            return null;
        }
        return e03.l(i12);
    }

    public static void M(AbstractC1449d abstractC1449d, long j) {
        abstractC1449d.f19593k = true;
        if (abstractC1449d instanceof Y3.l) {
            Y3.l lVar = (Y3.l) abstractC1449d;
            AbstractC1566a.m(lVar.f19593k);
            lVar.f8716A = j;
        }
    }

    public static boolean o(AbstractC1449d abstractC1449d) {
        if (abstractC1449d.f19589f != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
    
        if (r5.equals(r29.f19383w.f19668b) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(boolean r30, boolean r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.J.A(boolean, boolean, boolean, boolean):void");
    }

    public final void B() {
        boolean z9;
        C1448c0 c1448c0 = this.f19378r.f19611h;
        if (c1448c0 != null && c1448c0.f19575f.f19602h && this.f19386z) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19348A = z9;
    }

    @Override // N3.InterfaceC0271w
    public final void C(InterfaceC0272x interfaceC0272x) {
        this.f19363h.a(8, interfaceC0272x).b();
    }

    public final void D(long j) {
        long j4;
        C1448c0 c1448c0 = this.f19378r.f19611h;
        if (c1448c0 == null) {
            j4 = 1000000000000L;
        } else {
            j4 = c1448c0.f19583o;
        }
        long j9 = j + j4;
        this.f19366i0 = j9;
        this.f19374n.f19652a.d(j9);
        for (AbstractC1449d abstractC1449d : this.f19354a) {
            if (o(abstractC1449d)) {
                long j10 = this.f19366i0;
                abstractC1449d.f19593k = false;
                abstractC1449d.j = j10;
                abstractC1449d.m(j10, false);
            }
        }
        for (C1448c0 c1448c02 = r0.f19611h; c1448c02 != null; c1448c02 = c1448c02.f19580l) {
            for (i4.q qVar : c1448c02.f19582n.f18652c) {
                if (qVar != null) {
                    qVar.s();
                }
            }
        }
    }

    public final void E(E0 e02, E0 e03) {
        if (e02.p() && e03.p()) {
            return;
        }
        ArrayList arrayList = this.f19375o;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            A0.a.x(arrayList.get(size));
            throw null;
        }
    }

    public final void H(boolean z9) {
        N3.A a5 = this.f19378r.f19611h.f19575f.f19595a;
        long J8 = J(a5, this.f19383w.f19683r, true, false);
        if (J8 != this.f19383w.f19683r) {
            l0 l0Var = this.f19383w;
            this.f19383w = m(a5, J8, l0Var.f19669c, l0Var.f19670d, z9, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:20|(10:(11:64|65|66|67|(1:85)(1:73)|74|(1:84)|81|82|11|12)(1:22)|39|40|41|42|43|44|10|11|12)|23|24|(1:26)(1:60)|27|(1:29)(1:59)|30|31|32|(1:34)(1:57)|35|36|37|38) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0160, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0162, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0163, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1 A[Catch: all -> 0x00a4, TryCatch #3 {all -> 0x00a4, blocks: (B:6:0x0097, B:8:0x00a1, B:16:0x00ad, B:18:0x00b3, B:19:0x00b6, B:20:0x00be, B:69:0x00ce, B:73:0x00d6), top: B:5:0x0097 }] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, N3.x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(j3.I r19) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.J.I(j3.I):void");
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, N3.x] */
    public final long J(N3.A a5, long j, boolean z9, boolean z10) {
        b0();
        this.f19349B = false;
        if (z10 || this.f19383w.f19671e == 3) {
            W(2);
        }
        C1452e0 c1452e0 = this.f19378r;
        C1448c0 c1448c0 = c1452e0.f19611h;
        C1448c0 c1448c02 = c1448c0;
        while (c1448c02 != null && !a5.equals(c1448c02.f19575f.f19595a)) {
            c1448c02 = c1448c02.f19580l;
        }
        if (z9 || c1448c0 != c1448c02 || (c1448c02 != null && c1448c02.f19583o + j < 0)) {
            AbstractC1449d[] abstractC1449dArr = this.f19354a;
            for (AbstractC1449d abstractC1449d : abstractC1449dArr) {
                b(abstractC1449d);
            }
            if (c1448c02 != null) {
                while (c1452e0.f19611h != c1448c02) {
                    c1452e0.a();
                }
                c1452e0.k(c1448c02);
                c1448c02.f19583o = 1000000000000L;
                d(new boolean[abstractC1449dArr.length]);
            }
        }
        if (c1448c02 != null) {
            c1452e0.k(c1448c02);
            if (!c1448c02.f19573d) {
                c1448c02.f19575f = c1448c02.f19575f.b(j);
            } else if (c1448c02.f19574e) {
                ?? r9 = c1448c02.f19570a;
                j = r9.w(j);
                r9.x(j - this.f19372m);
            }
            D(j);
            q();
        } else {
            c1452e0.b();
            D(j);
        }
        i(false);
        this.f19363h.c(2);
        return j;
    }

    public final void K(t0 t0Var) {
        Looper looper = t0Var.f19738f;
        Looper looper2 = this.j;
        l4.w wVar = this.f19363h;
        if (looper == looper2) {
            synchronized (t0Var) {
            }
            try {
                t0Var.f19733a.d(t0Var.f19736d, t0Var.f19737e);
                t0Var.b(true);
                int i9 = this.f19383w.f19671e;
                if (i9 != 3 && i9 != 2) {
                    return;
                }
                wVar.c(2);
                return;
            } catch (Throwable th) {
                t0Var.b(true);
                throw th;
            }
        }
        wVar.a(15, t0Var).b();
    }

    public final void L(t0 t0Var) {
        Looper looper = t0Var.f19738f;
        if (!looper.getThread().isAlive()) {
            AbstractC1566a.P("TAG", "Trying to send message on a dead thread.");
            t0Var.b(false);
        } else {
            l4.w a5 = this.f19376p.a(looper, null);
            a5.f20548a.post(new A6.r(this, 15, t0Var));
        }
    }

    public final void N(boolean z9, AtomicBoolean atomicBoolean) {
        if (this.Y != z9) {
            this.Y = z9;
            if (!z9) {
                for (AbstractC1449d abstractC1449d : this.f19354a) {
                    if (!o(abstractC1449d) && this.f19355b.remove(abstractC1449d)) {
                        abstractC1449d.u();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void O(F f9) {
        this.f19384x.a(1);
        int i9 = f9.f19323c;
        ArrayList arrayList = f9.f19321a;
        N3.g0 g0Var = f9.f19322b;
        if (i9 != -1) {
            this.f19364h0 = new I(new u0(arrayList, g0Var), f9.f19323c, f9.f19324d);
        }
        F5.o oVar = this.f19379s;
        ArrayList arrayList2 = (ArrayList) oVar.f2533c;
        oVar.i(0, arrayList2.size());
        j(oVar.a(arrayList2.size(), arrayList, g0Var), false);
    }

    public final void P(boolean z9) {
        if (z9 != this.f19360f0) {
            this.f19360f0 = z9;
            if (!z9 && this.f19383w.f19680o) {
                this.f19363h.c(2);
            }
        }
    }

    public final void Q(boolean z9) {
        this.f19386z = z9;
        B();
        if (this.f19348A) {
            C1452e0 c1452e0 = this.f19378r;
            if (c1452e0.f19612i != c1452e0.f19611h) {
                H(true);
                i(false);
            }
        }
    }

    public final void R(int i9, int i10, boolean z9, boolean z10) {
        this.f19384x.a(z10 ? 1 : 0);
        G g9 = this.f19384x;
        g9.f19330a = true;
        g9.f19335f = true;
        g9.f19336g = i10;
        this.f19383w = this.f19383w.c(i9, z9);
        this.f19349B = false;
        for (C1448c0 c1448c0 = this.f19378r.f19611h; c1448c0 != null; c1448c0 = c1448c0.f19580l) {
            for (i4.q qVar : c1448c0.f19582n.f18652c) {
                if (qVar != null) {
                    qVar.b(z9);
                }
            }
        }
        if (!X()) {
            b0();
            e0();
            return;
        }
        int i11 = this.f19383w.f19671e;
        l4.w wVar = this.f19363h;
        if (i11 == 3) {
            Z();
            wVar.c(2);
        } else if (i11 == 2) {
            wVar.c(2);
        }
    }

    public final void S(m0 m0Var) {
        C1459j c1459j = this.f19374n;
        c1459j.a(m0Var);
        m0 c3 = c1459j.c();
        l(c3, c3.f19694a, true, true);
    }

    public final void T(int i9) {
        this.f19351D = i9;
        E0 e02 = this.f19383w.f19667a;
        C1452e0 c1452e0 = this.f19378r;
        c1452e0.f19609f = i9;
        if (!c1452e0.n(e02)) {
            H(true);
        }
        i(false);
    }

    public final void U(boolean z9) {
        this.f19352X = z9;
        E0 e02 = this.f19383w.f19667a;
        C1452e0 c1452e0 = this.f19378r;
        c1452e0.f19610g = z9;
        if (!c1452e0.n(e02)) {
            H(true);
        }
        i(false);
    }

    public final void V(N3.g0 g0Var) {
        this.f19384x.a(1);
        F5.o oVar = this.f19379s;
        int size = ((ArrayList) oVar.f2533c).size();
        if (g0Var.f5102b.length != size) {
            g0Var = new N3.g0(new Random(g0Var.f5101a.nextLong())).a(size);
        }
        oVar.f2540k = g0Var;
        j(oVar.c(), false);
    }

    public final void W(int i9) {
        l0 l0Var = this.f19383w;
        if (l0Var.f19671e != i9) {
            if (i9 != 2) {
                this.f19373m0 = -9223372036854775807L;
            }
            this.f19383w = l0Var.f(i9);
        }
    }

    public final boolean X() {
        l0 l0Var = this.f19383w;
        if (l0Var.f19677l && l0Var.f19678m == 0) {
            return true;
        }
        return false;
    }

    public final boolean Y(E0 e02, N3.A a5) {
        if (!a5.a() && !e02.p()) {
            int i9 = e02.g(a5.f5207a, this.f19370l).f19237c;
            D0 d02 = this.f19368k;
            e02.n(i9, d02);
            if (d02.a() && d02.f19311i && d02.f19308f != -9223372036854775807L) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void Z() {
        boolean z9;
        this.f19349B = false;
        C1459j c1459j = this.f19374n;
        c1459j.f19657f = true;
        c1459j.f19652a.e();
        for (AbstractC1449d abstractC1449d : this.f19354a) {
            if (o(abstractC1449d)) {
                if (abstractC1449d.f19589f == 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                abstractC1449d.f19589f = 2;
                abstractC1449d.o();
            }
        }
    }

    public final void a(F f9, int i9) {
        this.f19384x.a(1);
        F5.o oVar = this.f19379s;
        if (i9 == -1) {
            i9 = ((ArrayList) oVar.f2533c).size();
        }
        j(oVar.a(i9, f9.f19321a, f9.f19322b), false);
    }

    public final void a0(boolean z9, boolean z10) {
        boolean z11;
        if (!z9 && this.Y) {
            z11 = false;
        } else {
            z11 = true;
        }
        A(z11, false, true, false);
        this.f19384x.a(z10 ? 1 : 0);
        this.f19359f.b(true);
        W(1);
    }

    public final void b(AbstractC1449d abstractC1449d) {
        boolean z9;
        boolean z10;
        if (!o(abstractC1449d)) {
            return;
        }
        C1459j c1459j = this.f19374n;
        if (abstractC1449d == c1459j.f19654c) {
            c1459j.f19655d = null;
            c1459j.f19654c = null;
            c1459j.f19656e = true;
        }
        int i9 = abstractC1449d.f19589f;
        if (i9 == 2) {
            if (i9 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            AbstractC1566a.m(z10);
            abstractC1449d.f19589f = 1;
            abstractC1449d.p();
        }
        if (abstractC1449d.f19589f == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        abstractC1449d.f19585b.j();
        abstractC1449d.f19589f = 0;
        abstractC1449d.f19590g = null;
        abstractC1449d.f19591h = null;
        abstractC1449d.f19593k = false;
        abstractC1449d.k();
        this.f19362g0--;
    }

    public final void b0() {
        int i9;
        boolean z9;
        C1459j c1459j = this.f19374n;
        c1459j.f19657f = false;
        C0617c0 c0617c0 = c1459j.f19652a;
        if (c0617c0.f11049a) {
            c0617c0.d(c0617c0.b());
            c0617c0.f11049a = false;
        }
        for (AbstractC1449d abstractC1449d : this.f19354a) {
            if (o(abstractC1449d) && (i9 = abstractC1449d.f19589f) == 2) {
                if (i9 == 2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                abstractC1449d.f19589f = 1;
                abstractC1449d.p();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x052e, code lost:
    
        if (r4 >= r10.f19645h) goto L292;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02f7 A[EDGE_INSN: B:74:0x02f7->B:75:0x02f7 BREAK  A[LOOP:0: B:42:0x0295->B:53:0x02f4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0348  */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40, types: [int] */
    /* JADX WARN: Type inference failed for: r0v54, types: [i4.w] */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r13v10, types: [i4.w] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14, types: [int] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, N3.x] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.Object, N3.x] */
    /* JADX WARN: Type inference failed for: r2v65, types: [N3.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v69 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v45, types: [int] */
    /* JADX WARN: Type inference failed for: r3v83, types: [int] */
    /* JADX WARN: Type inference failed for: r3v89 */
    /* JADX WARN: Type inference failed for: r3v90 */
    /* JADX WARN: Type inference failed for: r3v91 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, N3.x] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61, types: [int] */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, N3.x] */
    /* JADX WARN: Type inference failed for: r6v60, types: [i4.q[]] */
    /* JADX WARN: Type inference failed for: r6v61, types: [i4.q] */
    /* JADX WARN: Type inference failed for: r6v68, types: [N3.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13, types: [N3.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30, types: [int] */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36, types: [int] */
    /* JADX WARN: Type inference failed for: r8v44 */
    /* JADX WARN: Type inference failed for: r8v45, types: [int] */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v48 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v50 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v6, types: [i4.w] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 1738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.J.c():void");
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [N3.f0, java.lang.Object] */
    public final void c0() {
        boolean z9;
        C1448c0 c1448c0 = this.f19378r.j;
        if (!this.f19350C && (c1448c0 == null || !c1448c0.f19570a.a())) {
            z9 = false;
        } else {
            z9 = true;
        }
        boolean z10 = z9;
        l0 l0Var = this.f19383w;
        if (z10 != l0Var.f19673g) {
            this.f19383w = new l0(l0Var.f19667a, l0Var.f19668b, l0Var.f19669c, l0Var.f19670d, l0Var.f19671e, l0Var.f19672f, z10, l0Var.f19674h, l0Var.f19675i, l0Var.j, l0Var.f19676k, l0Var.f19677l, l0Var.f19678m, l0Var.f19679n, l0Var.f19681p, l0Var.f19682q, l0Var.f19683r, l0Var.f19680o);
        }
    }

    public final void d(boolean[] zArr) {
        AbstractC1449d[] abstractC1449dArr;
        Set set;
        i4.w wVar;
        int i9;
        AbstractC1449d[] abstractC1449dArr2;
        boolean z9;
        int i10;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l4.m mVar;
        C1452e0 c1452e0 = this.f19378r;
        C1448c0 c1448c0 = c1452e0.f19612i;
        i4.w wVar2 = c1448c0.f19582n;
        int i11 = 0;
        while (true) {
            abstractC1449dArr = this.f19354a;
            int length = abstractC1449dArr.length;
            set = this.f19355b;
            if (i11 >= length) {
                break;
            }
            if (!wVar2.b(i11) && set.remove(abstractC1449dArr[i11])) {
                abstractC1449dArr[i11].u();
            }
            i11++;
        }
        int i12 = 0;
        while (i12 < abstractC1449dArr.length) {
            if (wVar2.b(i12)) {
                boolean z14 = zArr[i12];
                AbstractC1449d abstractC1449d = abstractC1449dArr[i12];
                if (!o(abstractC1449d)) {
                    C1448c0 c1448c02 = c1452e0.f19612i;
                    if (c1448c02 == c1452e0.f19611h) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    i4.w wVar3 = c1448c02.f19582n;
                    w0 w0Var = wVar3.f18651b[i12];
                    i4.q qVar = wVar3.f18652c[i12];
                    if (qVar != null) {
                        i10 = qVar.length();
                    } else {
                        i10 = 0;
                    }
                    M[] mArr = new M[i10];
                    for (int i13 = 0; i13 < i10; i13++) {
                        mArr[i13] = qVar.c(i13);
                    }
                    if (X() && this.f19383w.f19671e == 3) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z14 && z10) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f19362g0++;
                    set.add(abstractC1449d);
                    N3.d0 d0Var = c1448c02.f19572c[i12];
                    wVar = wVar2;
                    long j = this.f19366i0;
                    long e8 = c1448c02.e();
                    i9 = i12;
                    abstractC1449dArr2 = abstractC1449dArr;
                    long j4 = c1448c02.f19583o;
                    if (abstractC1449d.f19589f == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    AbstractC1566a.m(z12);
                    abstractC1449d.f19586c = w0Var;
                    abstractC1449d.f19589f = 1;
                    abstractC1449d.l(z11, z9);
                    abstractC1449d.t(mArr, d0Var, e8, j4);
                    abstractC1449d.f19593k = false;
                    abstractC1449d.j = j;
                    abstractC1449d.m(j, z11);
                    abstractC1449d.d(11, new C1442E(this));
                    C1459j c1459j = this.f19374n;
                    c1459j.getClass();
                    l4.m f9 = abstractC1449d.f();
                    if (f9 != null && f9 != (mVar = c1459j.f19655d)) {
                        if (mVar == null) {
                            c1459j.f19655d = f9;
                            c1459j.f19654c = abstractC1449d;
                            ((l3.H) f9).a((m0) c1459j.f19652a.f11053e);
                        } else {
                            throw new C1462m(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                    }
                    if (z10) {
                        if (abstractC1449d.f19589f == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        AbstractC1566a.m(z13);
                        abstractC1449d.f19589f = 2;
                        abstractC1449d.o();
                    }
                    i12 = i9 + 1;
                    wVar2 = wVar;
                    abstractC1449dArr = abstractC1449dArr2;
                }
            }
            wVar = wVar2;
            i9 = i12;
            abstractC1449dArr2 = abstractC1449dArr;
            i12 = i9 + 1;
            wVar2 = wVar;
            abstractC1449dArr = abstractC1449dArr2;
        }
        c1448c0.f19576g = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x001c. Please report as an issue. */
    public final void d0(i4.w wVar) {
        i4.q[] qVarArr = wVar.f18652c;
        C1458i c1458i = this.f19359f;
        int i9 = c1458i.f19643f;
        if (i9 == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                AbstractC1449d[] abstractC1449dArr = this.f19354a;
                int i12 = 13107200;
                if (i10 < abstractC1449dArr.length) {
                    if (qVarArr[i10] != null) {
                        switch (abstractC1449dArr[i10].f19584a) {
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                    }
                    i10++;
                } else {
                    i9 = Math.max(13107200, i11);
                }
            }
        }
        c1458i.f19645h = i9;
        c1458i.f19638a.a(i9);
    }

    public final long e(E0 e02, Object obj, long j) {
        C0 c02 = this.f19370l;
        int i9 = e02.g(obj, c02).f19237c;
        D0 d02 = this.f19368k;
        e02.n(i9, d02);
        if (d02.f19308f == -9223372036854775807L || !d02.a() || !d02.f19311i) {
            return -9223372036854775807L;
        }
        return l4.y.H(l4.y.v(d02.f19309g) - d02.f19308f) - (j + c02.f19239e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, N3.x] */
    public final void e0() {
        long j;
        Object[] objArr;
        int i9;
        long j4;
        long max;
        boolean z9;
        long max2;
        boolean z10;
        float f9;
        C1448c0 c1448c0 = this.f19378r.f19611h;
        if (c1448c0 != null) {
            if (c1448c0.f19573d) {
                j = c1448c0.f19570a.k();
            } else {
                j = -9223372036854775807L;
            }
            if (j != -9223372036854775807L) {
                D(j);
                if (j != this.f19383w.f19683r) {
                    l0 l0Var = this.f19383w;
                    this.f19383w = m(l0Var.f19668b, j, l0Var.f19669c, j, true, 5);
                }
            } else {
                C1459j c1459j = this.f19374n;
                if (c1448c0 != this.f19378r.f19612i) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                AbstractC1449d abstractC1449d = c1459j.f19654c;
                C0617c0 c0617c0 = c1459j.f19652a;
                if (abstractC1449d != null && !abstractC1449d.i() && (c1459j.f19654c.j() || (objArr == false && !c1459j.f19654c.h()))) {
                    l4.m mVar = c1459j.f19655d;
                    mVar.getClass();
                    long b9 = mVar.b();
                    if (c1459j.f19656e) {
                        if (b9 < c0617c0.b()) {
                            if (c0617c0.f11049a) {
                                c0617c0.d(c0617c0.b());
                                c0617c0.f11049a = false;
                            }
                        } else {
                            c1459j.f19656e = false;
                            if (c1459j.f19657f) {
                                c0617c0.e();
                            }
                        }
                    }
                    c0617c0.d(b9);
                    m0 c3 = mVar.c();
                    if (!c3.equals((m0) c0617c0.f11053e)) {
                        c0617c0.a(c3);
                        c1459j.f19653b.f19363h.a(16, c3).b();
                    }
                } else {
                    c1459j.f19656e = true;
                    if (c1459j.f19657f) {
                        c0617c0.e();
                    }
                }
                long b10 = c1459j.b();
                this.f19366i0 = b10;
                long j9 = b10 - c1448c0.f19583o;
                long j10 = this.f19383w.f19683r;
                if (!this.f19375o.isEmpty() && !this.f19383w.f19668b.a()) {
                    if (this.f19369k0) {
                        this.f19369k0 = false;
                    }
                    l0 l0Var2 = this.f19383w;
                    l0Var2.f19667a.b(l0Var2.f19668b.f5207a);
                    int min = Math.min(this.f19367j0, this.f19375o.size());
                    if (min > 0 && this.f19375o.get(min - 1) != null) {
                        throw new ClassCastException();
                    }
                    if (min < this.f19375o.size() && this.f19375o.get(min) != null) {
                        throw new ClassCastException();
                    }
                    this.f19367j0 = min;
                }
                this.f19383w.f19683r = j9;
            }
            this.f19383w.f19681p = this.f19378r.j.d();
            l0 l0Var3 = this.f19383w;
            long j11 = l0Var3.f19681p;
            C1448c0 c1448c02 = this.f19378r.j;
            if (c1448c02 == null) {
                max = 0;
                i9 = 1;
                j4 = -9223372036854775807L;
            } else {
                i9 = 1;
                j4 = -9223372036854775807L;
                max = Math.max(0L, j11 - (this.f19366i0 - c1448c02.f19583o));
            }
            l0Var3.f19682q = max;
            l0 l0Var4 = this.f19383w;
            if (l0Var4.f19677l && l0Var4.f19671e == 3 && Y(l0Var4.f19667a, l0Var4.f19668b)) {
                l0 l0Var5 = this.f19383w;
                float f10 = 1.0f;
                if (l0Var5.f19679n.f19694a == 1.0f) {
                    C1457h c1457h = this.f19380t;
                    long e8 = e(l0Var5.f19667a, l0Var5.f19668b.f5207a, l0Var5.f19683r);
                    long j12 = this.f19383w.f19681p;
                    C1448c0 c1448c03 = this.f19378r.j;
                    if (c1448c03 == null) {
                        z9 = false;
                        max2 = 0;
                    } else {
                        z9 = false;
                        max2 = Math.max(0L, j12 - (this.f19366i0 - c1448c03.f19583o));
                    }
                    if (c1457h.f19624c == j4) {
                        z10 = z9;
                    } else {
                        long j13 = e8 - max2;
                        if (c1457h.f19633m == j4) {
                            c1457h.f19633m = j13;
                            c1457h.f19634n = 0L;
                            z10 = z9;
                        } else {
                            z10 = z9;
                            c1457h.f19633m = Math.max(j13, (((float) j13) * 9.999871E-4f) + (((float) r13) * 0.999f));
                            c1457h.f19634n = (9.999871E-4f * ((float) Math.abs(j13 - r4))) + (((float) c1457h.f19634n) * 0.999f);
                        }
                        if (c1457h.f19632l != j4 && SystemClock.elapsedRealtime() - c1457h.f19632l < 1000) {
                            f10 = c1457h.f19631k;
                        } else {
                            c1457h.f19632l = SystemClock.elapsedRealtime();
                            long j14 = (c1457h.f19634n * 3) + c1457h.f19633m;
                            if (c1457h.f19629h > j14) {
                                float H8 = (float) l4.y.H(1000L);
                                long j15 = c1457h.f19626e;
                                f9 = 1.0E-7f;
                                long j16 = c1457h.f19629h - (((c1457h.f19631k - 1.0f) * H8) + ((c1457h.f19630i - 1.0f) * H8));
                                long[] jArr = new long[3];
                                jArr[z10 ? 1 : 0] = j14;
                                jArr[i9] = j15;
                                jArr[2] = j16;
                                long j17 = jArr[z10 ? 1 : 0];
                                for (int i10 = i9; i10 < 3; i10 += i9) {
                                    long j18 = jArr[i10];
                                    if (j18 > j17) {
                                        j17 = j18;
                                    }
                                }
                                c1457h.f19629h = j17;
                            } else {
                                f9 = 1.0E-7f;
                                long j19 = l4.y.j(e8 - (Math.max(0.0f, c1457h.f19631k - 1.0f) / 1.0E-7f), c1457h.f19629h, j14);
                                c1457h.f19629h = j19;
                                long j20 = c1457h.f19628g;
                                if (j20 != j4 && j19 > j20) {
                                    c1457h.f19629h = j20;
                                }
                            }
                            long j21 = e8 - c1457h.f19629h;
                            if (Math.abs(j21) < c1457h.f19622a) {
                                c1457h.f19631k = 1.0f;
                            } else {
                                c1457h.f19631k = l4.y.h((((float) j21) * f9) + 1.0f, c1457h.j, c1457h.f19630i);
                            }
                            f10 = c1457h.f19631k;
                        }
                    }
                    if (this.f19374n.c().f19694a != f10) {
                        this.f19374n.a(new m0(f10, this.f19383w.f19679n.f19695b));
                        l(this.f19383w.f19679n, this.f19374n.c().f19694a, z10, z10);
                    }
                }
            }
        }
    }

    public final Pair f(E0 e02) {
        long j = 0;
        if (e02.p()) {
            return Pair.create(l0.f19666s, 0L);
        }
        int a5 = e02.a(this.f19352X);
        Pair i9 = e02.i(this.f19368k, this.f19370l, a5, -9223372036854775807L);
        N3.A m9 = this.f19378r.m(e02, i9.first, 0L);
        long longValue = ((Long) i9.second).longValue();
        if (m9.a()) {
            Object obj = m9.f5207a;
            C0 c02 = this.f19370l;
            e02.g(obj, c02);
            if (m9.f5209c == c02.f(m9.f5208b)) {
                j = c02.f19241g.f5455b;
            }
            longValue = j;
        }
        return Pair.create(m9, Long.valueOf(longValue));
    }

    public final void f0(E0 e02, N3.A a5, E0 e03, N3.A a9, long j) {
        Object obj;
        m0 m0Var;
        if (!Y(e02, a5)) {
            if (a5.a()) {
                m0Var = m0.f19693d;
            } else {
                m0Var = this.f19383w.f19679n;
            }
            C1459j c1459j = this.f19374n;
            if (!c1459j.c().equals(m0Var)) {
                c1459j.a(m0Var);
                return;
            }
            return;
        }
        Object obj2 = a5.f5207a;
        C0 c02 = this.f19370l;
        int i9 = e02.g(obj2, c02).f19237c;
        D0 d02 = this.f19368k;
        e02.n(i9, d02);
        T t7 = d02.f19312k;
        int i10 = l4.y.f20553a;
        C1457h c1457h = this.f19380t;
        c1457h.getClass();
        c1457h.f19624c = l4.y.H(t7.f19470a);
        c1457h.f19627f = l4.y.H(t7.f19471b);
        c1457h.f19628g = l4.y.H(t7.f19472c);
        float f9 = t7.f19473d;
        if (f9 == -3.4028235E38f) {
            f9 = 0.97f;
        }
        c1457h.j = f9;
        float f10 = t7.f19474e;
        if (f10 == -3.4028235E38f) {
            f10 = 1.03f;
        }
        c1457h.f19630i = f10;
        if (f9 == 1.0f && f10 == 1.0f) {
            c1457h.f19624c = -9223372036854775807L;
        }
        c1457h.a();
        if (j != -9223372036854775807L) {
            c1457h.f19625d = e(e02, obj2, j);
            c1457h.a();
            return;
        }
        Object obj3 = d02.f19303a;
        if (!e03.p()) {
            obj = e03.m(e03.g(a9.f5207a, c02).f19237c, d02, 0L).f19303a;
        } else {
            obj = null;
        }
        if (!l4.y.a(obj, obj3)) {
            c1457h.f19625d = -9223372036854775807L;
            c1457h.a();
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [N3.f0, java.lang.Object] */
    public final void g(InterfaceC0272x interfaceC0272x) {
        boolean z9;
        C1448c0 c1448c0 = this.f19378r.j;
        if (c1448c0 != null && c1448c0.f19570a == interfaceC0272x) {
            long j = this.f19366i0;
            if (c1448c0 != null) {
                if (c1448c0.f19580l == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                if (c1448c0.f19573d) {
                    c1448c0.f19570a.B(j - c1448c0.f19583o);
                }
            }
            q();
        }
    }

    public final synchronized void g0(C0261l c0261l, long j) {
        this.f19376p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        boolean z9 = false;
        while (!((Boolean) c0261l.get()).booleanValue() && j > 0) {
            try {
                this.f19376p.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z9 = true;
            }
            this.f19376p.getClass();
            j = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public final void h(int i9, IOException iOException) {
        C1462m c1462m = new C1462m(0, iOException, i9);
        C1448c0 c1448c0 = this.f19378r.f19611h;
        if (c1448c0 != null) {
            c1462m = c1462m.a(c1448c0.f19575f.f19595a);
        }
        AbstractC1566a.u("ExoPlayerImplInternal", "Playback error", c1462m);
        a0(false, false);
        this.f19383w = this.f19383w.d(c1462m);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C1448c0 c1448c0;
        int i9;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = 1000;
        try {
            switch (message.what) {
                case 0:
                    u();
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    R(message.arg2, 1, z9, true);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    I((I) message.obj);
                    break;
                case 4:
                    S((m0) message.obj);
                    break;
                case 5:
                    this.f19382v = (x0) message.obj;
                    break;
                case 6:
                    a0(false, true);
                    break;
                case 7:
                    x();
                    return true;
                case 8:
                    k((InterfaceC0272x) message.obj);
                    break;
                case 9:
                    g((InterfaceC0272x) message.obj);
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    z();
                    break;
                case R.styleable.GradientColor_android_endY /* 11 */:
                    T(message.arg1);
                    break;
                case 12:
                    if (message.arg1 != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    U(z10);
                    break;
                case 13:
                    if (message.arg1 != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    N(z11, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    t0 t0Var = (t0) message.obj;
                    t0Var.getClass();
                    K(t0Var);
                    break;
                case 15:
                    L((t0) message.obj);
                    break;
                case 16:
                    m0 m0Var = (m0) message.obj;
                    l(m0Var, m0Var.f19694a, true, false);
                    break;
                case 17:
                    O((F) message.obj);
                    break;
                case 18:
                    a((F) message.obj, message.arg1);
                    break;
                case 19:
                    A0.a.x(message.obj);
                    t();
                    throw null;
                case 20:
                    y(message.arg1, message.arg2, (N3.g0) message.obj);
                    break;
                case 21:
                    V((N3.g0) message.obj);
                    break;
                case 22:
                    s();
                    break;
                case 23:
                    if (message.arg1 != 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Q(z12);
                    break;
                case 24:
                    if (message.arg1 == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    P(z13);
                    break;
                case 25:
                    H(true);
                    break;
                default:
                    return false;
            }
        } catch (C0251b e8) {
            h(1002, e8);
        } catch (j0 e9) {
            boolean z14 = e9.f19658a;
            int i11 = e9.f19659b;
            if (i11 == 1) {
                if (z14) {
                    i9 = 3001;
                } else {
                    i9 = 3003;
                }
            } else {
                if (i11 == 4) {
                    if (z14) {
                        i9 = 3002;
                    } else {
                        i9 = 3004;
                    }
                }
                h(i10, e9);
            }
            i10 = i9;
            h(i10, e9);
        } catch (C1462m e10) {
            e = e10;
            if (e.f19686c == 1 && (c1448c0 = this.f19378r.f19612i) != null) {
                e = e.a(c1448c0.f19575f.f19595a);
            }
            if (e.f19692i && this.f19371l0 == null) {
                AbstractC1566a.Q("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.f19371l0 = e;
                l4.w wVar = this.f19363h;
                l4.v a5 = wVar.a(25, e);
                wVar.getClass();
                Message message2 = a5.f20546a;
                message2.getClass();
                wVar.f20548a.sendMessageAtFrontOfQueue(message2);
                a5.a();
            } else {
                C1462m c1462m = this.f19371l0;
                if (c1462m != null) {
                    c1462m.addSuppressed(e);
                    e = this.f19371l0;
                }
                AbstractC1566a.u("ExoPlayerImplInternal", "Playback error", e);
                a0(true, false);
                this.f19383w = this.f19383w.d(e);
            }
        } catch (C1631h e11) {
            h(e11.f21124a, e11);
        } catch (IOException e12) {
            h(2000, e12);
        } catch (RuntimeException e13) {
            if ((e13 instanceof IllegalStateException) || (e13 instanceof IllegalArgumentException)) {
                i10 = 1004;
            }
            C1462m c1462m2 = new C1462m(2, e13, i10);
            AbstractC1566a.u("ExoPlayerImplInternal", "Playback error", c1462m2);
            a0(true, false);
            this.f19383w = this.f19383w.d(c1462m2);
        } catch (C1514n e14) {
            h(e14.f20071a, e14);
        }
        r();
        return true;
    }

    public final void i(boolean z9) {
        N3.A a5;
        long d9;
        C1448c0 c1448c0 = this.f19378r.j;
        if (c1448c0 == null) {
            a5 = this.f19383w.f19668b;
        } else {
            a5 = c1448c0.f19575f.f19595a;
        }
        boolean equals = this.f19383w.f19676k.equals(a5);
        if (!equals) {
            this.f19383w = this.f19383w.a(a5);
        }
        l0 l0Var = this.f19383w;
        if (c1448c0 == null) {
            d9 = l0Var.f19683r;
        } else {
            d9 = c1448c0.d();
        }
        l0Var.f19681p = d9;
        l0 l0Var2 = this.f19383w;
        long j = l0Var2.f19681p;
        C1448c0 c1448c02 = this.f19378r.j;
        long j4 = 0;
        if (c1448c02 != null) {
            j4 = Math.max(0L, j - (this.f19366i0 - c1448c02.f19583o));
        }
        l0Var2.f19682q = j4;
        if ((!equals || z9) && c1448c0 != null && c1448c0.f19573d) {
            d0(c1448c0.f19582n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x01f4, code lost:
    
        if (r6.e(r9, r10) != 2) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01f6, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0206, code lost:
    
        if (r6.g(r3.f5208b) != false) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x03f8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03dc  */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [j3.I] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [j3.E0] */
    /* JADX WARN: Type inference failed for: r2v58, types: [j3.e0] */
    /* JADX WARN: Type inference failed for: r2v62 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [j3.C0] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v34, types: [j3.E0] */
    /* JADX WARN: Type inference failed for: r9v0, types: [j3.e0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(j3.E0 r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.J.j(j3.E0, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, N3.x] */
    public final void k(InterfaceC0272x interfaceC0272x) {
        C1452e0 c1452e0 = this.f19378r;
        C1448c0 c1448c0 = c1452e0.j;
        if (c1448c0 != null && c1448c0.f19570a == interfaceC0272x) {
            float f9 = this.f19374n.c().f19694a;
            E0 e02 = this.f19383w.f19667a;
            c1448c0.f19573d = true;
            c1448c0.f19581m = c1448c0.f19570a.l();
            i4.w g9 = c1448c0.g(f9, e02);
            C1450d0 c1450d0 = c1448c0.f19575f;
            long j = c1450d0.f19599e;
            long j4 = c1450d0.f19596b;
            if (j != -9223372036854775807L && j4 >= j) {
                j4 = Math.max(0L, j - 1);
            }
            long a5 = c1448c0.a(g9, j4, false, new boolean[c1448c0.f19578i.length]);
            long j9 = c1448c0.f19583o;
            C1450d0 c1450d02 = c1448c0.f19575f;
            c1448c0.f19583o = (c1450d02.f19596b - a5) + j9;
            c1448c0.f19575f = c1450d02.b(a5);
            d0(c1448c0.f19582n);
            if (c1448c0 == c1452e0.f19611h) {
                D(c1448c0.f19575f.f19596b);
                d(new boolean[this.f19354a.length]);
                l0 l0Var = this.f19383w;
                N3.A a9 = l0Var.f19668b;
                long j10 = c1448c0.f19575f.f19596b;
                this.f19383w = m(a9, j10, l0Var.f19669c, j10, false, 5);
            }
            q();
        }
    }

    public final void l(m0 m0Var, float f9, boolean z9, boolean z10) {
        int i9;
        if (z9) {
            if (z10) {
                this.f19384x.a(1);
            }
            this.f19383w = this.f19383w.e(m0Var);
        }
        float f10 = m0Var.f19694a;
        C1448c0 c1448c0 = this.f19378r.f19611h;
        while (true) {
            i9 = 0;
            if (c1448c0 == null) {
                break;
            }
            i4.q[] qVarArr = c1448c0.f19582n.f18652c;
            int length = qVarArr.length;
            while (i9 < length) {
                i4.q qVar = qVarArr[i9];
                if (qVar != null) {
                    qVar.q(f10);
                }
                i9++;
            }
            c1448c0 = c1448c0.f19580l;
        }
        AbstractC1449d[] abstractC1449dArr = this.f19354a;
        int length2 = abstractC1449dArr.length;
        while (i9 < length2) {
            AbstractC1449d abstractC1449d = abstractC1449dArr[i9];
            if (abstractC1449d != null) {
                abstractC1449d.v(f9, m0Var.f19694a);
            }
            i9++;
        }
    }

    public final l0 m(N3.A a5, long j, long j4, long j9, boolean z9, int i9) {
        boolean z10;
        boolean z11;
        long max;
        P5.S s9;
        boolean z12 = false;
        if (!this.f19369k0 && j == this.f19383w.f19683r && a5.equals(this.f19383w.f19668b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f19369k0 = z10;
        B();
        l0 l0Var = this.f19383w;
        N3.n0 n0Var = l0Var.f19674h;
        i4.w wVar = l0Var.f19675i;
        List list = l0Var.j;
        if (this.f19379s.f2531a) {
            C1448c0 c1448c0 = this.f19378r.f19611h;
            if (c1448c0 == null) {
                n0Var = N3.n0.f5169d;
            } else {
                n0Var = c1448c0.f19581m;
            }
            if (c1448c0 == null) {
                wVar = this.f19358e;
            } else {
                wVar = c1448c0.f19582n;
            }
            i4.q[] qVarArr = wVar.f18652c;
            P5.C c3 = new P5.C();
            boolean z13 = false;
            for (i4.q qVar : qVarArr) {
                if (qVar != null) {
                    D3.c cVar = qVar.c(0).j;
                    if (cVar == null) {
                        c3.a(new D3.c(new D3.b[0]));
                    } else {
                        c3.a(cVar);
                        z13 = true;
                    }
                }
            }
            z11 = true;
            if (z13) {
                s9 = c3.d();
            } else {
                P5.D d9 = P5.F.f5901b;
                s9 = P5.S.f5926e;
            }
            list = s9;
            if (c1448c0 != null) {
                C1450d0 c1450d0 = c1448c0.f19575f;
                if (c1450d0.f19597c != j4) {
                    c1448c0.f19575f = c1450d0.a(j4);
                }
            }
        } else {
            z11 = true;
            if (!a5.equals(l0Var.f19668b)) {
                n0Var = N3.n0.f5169d;
                wVar = this.f19358e;
                list = P5.S.f5926e;
            }
        }
        N3.n0 n0Var2 = n0Var;
        i4.w wVar2 = wVar;
        List list2 = list;
        if (z9) {
            G g9 = this.f19384x;
            if (g9.f19333d && g9.f19334e != 5) {
                if (i9 == 5) {
                    z12 = z11;
                }
                AbstractC1566a.h(z12);
            } else {
                boolean z14 = z11;
                g9.f19330a = z14;
                g9.f19333d = z14;
                g9.f19334e = i9;
            }
        }
        l0 l0Var2 = this.f19383w;
        long j10 = l0Var2.f19681p;
        C1448c0 c1448c02 = this.f19378r.j;
        if (c1448c02 == null) {
            max = 0;
        } else {
            max = Math.max(0L, j10 - (this.f19366i0 - c1448c02.f19583o));
        }
        return l0Var2.b(a5, j, j4, j9, max, n0Var2, wVar2, list2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [N3.f0, java.lang.Object] */
    public final boolean n() {
        long h7;
        C1448c0 c1448c0 = this.f19378r.j;
        if (c1448c0 != null) {
            if (!c1448c0.f19573d) {
                h7 = 0;
            } else {
                h7 = c1448c0.f19570a.h();
            }
            if (h7 == Long.MIN_VALUE) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean p() {
        C1448c0 c1448c0 = this.f19378r.f19611h;
        long j = c1448c0.f19575f.f19599e;
        if (c1448c0.f19573d) {
            if (j == -9223372036854775807L || this.f19383w.f19683r < j || !X()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, N3.x] */
    /* JADX WARN: Type inference failed for: r0v18, types: [N3.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [N3.f0, java.lang.Object] */
    public final void q() {
        long h7;
        long max;
        boolean c3;
        boolean z9 = false;
        if (!n()) {
            c3 = false;
        } else {
            C1448c0 c1448c0 = this.f19378r.j;
            if (!c1448c0.f19573d) {
                h7 = 0;
            } else {
                h7 = c1448c0.f19570a.h();
            }
            C1448c0 c1448c02 = this.f19378r.j;
            if (c1448c02 == null) {
                max = 0;
            } else {
                max = Math.max(0L, h7 - (this.f19366i0 - c1448c02.f19583o));
            }
            C1448c0 c1448c03 = this.f19378r.f19611h;
            c3 = this.f19359f.c(max, this.f19374n.c().f19694a);
            if (!c3 && max < 500000 && this.f19372m > 0) {
                this.f19378r.f19611h.f19570a.x(this.f19383w.f19683r);
                c3 = this.f19359f.c(max, this.f19374n.c().f19694a);
            }
        }
        this.f19350C = c3;
        if (c3) {
            C1448c0 c1448c04 = this.f19378r.j;
            long j = this.f19366i0;
            if (c1448c04.f19580l == null) {
                z9 = true;
            }
            AbstractC1566a.m(z9);
            c1448c04.f19570a.z(j - c1448c04.f19583o);
        }
        c0();
    }

    public final void r() {
        boolean z9;
        G g9 = this.f19384x;
        l0 l0Var = this.f19383w;
        boolean z10 = g9.f19330a;
        if (g9.f19331b != l0Var) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z11 = z10 | z9;
        g9.f19330a = z11;
        g9.f19331b = l0Var;
        if (z11) {
            C1441D c1441d = this.f19377q.f19730a;
            l4.w wVar = c1441d.f19266i;
            wVar.f20548a.post(new A6.r(c1441d, 14, g9));
            this.f19384x = new G(this.f19383w);
        }
    }

    public final void s() {
        j(this.f19379s.c(), true);
    }

    public final void t() {
        this.f19384x.a(1);
        throw null;
    }

    public final void u() {
        int i9;
        this.f19384x.a(1);
        int i10 = 0;
        A(false, false, false, true);
        this.f19359f.b(false);
        if (this.f19383w.f19667a.p()) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        W(i9);
        C1518s c1518s = (C1518s) this.f19361g;
        c1518s.getClass();
        F5.o oVar = this.f19379s;
        AbstractC1566a.m(!oVar.f2531a);
        oVar.f2541l = c1518s;
        while (true) {
            ArrayList arrayList = (ArrayList) oVar.f2533c;
            if (i10 < arrayList.size()) {
                i0 i0Var = (i0) arrayList.get(i10);
                oVar.g(i0Var);
                ((HashSet) oVar.j).add(i0Var);
                i10++;
            } else {
                oVar.f2531a = true;
                this.f19363h.c(2);
                return;
            }
        }
    }

    @Override // N3.e0
    public final void v(N3.f0 f0Var) {
        this.f19363h.a(9, (InterfaceC0272x) f0Var).b();
    }

    public final synchronized boolean w() {
        if (!this.f19385y && this.f19365i.isAlive()) {
            this.f19363h.c(7);
            g0(new C0261l(3, this), this.f19381u);
            return this.f19385y;
        }
        return true;
    }

    public final void x() {
        A(true, false, true, false);
        this.f19359f.b(true);
        W(1);
        this.f19365i.quit();
        synchronized (this) {
            this.f19385y = true;
            notifyAll();
        }
    }

    public final void y(int i9, int i10, N3.g0 g0Var) {
        boolean z9 = true;
        this.f19384x.a(1);
        F5.o oVar = this.f19379s;
        oVar.getClass();
        if (i9 < 0 || i9 > i10 || i10 > ((ArrayList) oVar.f2533c).size()) {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        oVar.f2540k = g0Var;
        oVar.i(i9, i10);
        j(oVar.c(), false);
    }

    public final void z() {
        int i9;
        boolean z9;
        float f9 = this.f19374n.c().f19694a;
        C1452e0 c1452e0 = this.f19378r;
        C1448c0 c1448c0 = c1452e0.f19611h;
        C1448c0 c1448c02 = c1452e0.f19612i;
        boolean z10 = true;
        for (C1448c0 c1448c03 = c1448c0; c1448c03 != null && c1448c03.f19573d; c1448c03 = c1448c03.f19580l) {
            i4.w g9 = c1448c03.g(f9, this.f19383w.f19667a);
            i4.w wVar = c1448c03.f19582n;
            if (wVar != null) {
                int length = wVar.f18652c.length;
                i4.q[] qVarArr = g9.f18652c;
                if (length == qVarArr.length) {
                    for (int i10 = 0; i10 < qVarArr.length; i10++) {
                        if (g9.a(wVar, i10)) {
                        }
                    }
                    if (c1448c03 == c1448c02) {
                        z10 = false;
                    }
                }
            }
            if (z10) {
                C1452e0 c1452e02 = this.f19378r;
                C1448c0 c1448c04 = c1452e02.f19611h;
                boolean k5 = c1452e02.k(c1448c04);
                boolean[] zArr = new boolean[this.f19354a.length];
                long a5 = c1448c04.a(g9, this.f19383w.f19683r, k5, zArr);
                l0 l0Var = this.f19383w;
                if (l0Var.f19671e != 4 && a5 != l0Var.f19683r) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                l0 l0Var2 = this.f19383w;
                i9 = 4;
                this.f19383w = m(l0Var2.f19668b, a5, l0Var2.f19669c, l0Var2.f19670d, z9, 5);
                if (z9) {
                    D(a5);
                }
                boolean[] zArr2 = new boolean[this.f19354a.length];
                int i11 = 0;
                while (true) {
                    AbstractC1449d[] abstractC1449dArr = this.f19354a;
                    if (i11 >= abstractC1449dArr.length) {
                        break;
                    }
                    AbstractC1449d abstractC1449d = abstractC1449dArr[i11];
                    boolean o9 = o(abstractC1449d);
                    zArr2[i11] = o9;
                    N3.d0 d0Var = c1448c04.f19572c[i11];
                    if (o9) {
                        if (d0Var != abstractC1449d.f19590g) {
                            b(abstractC1449d);
                        } else if (zArr[i11]) {
                            long j = this.f19366i0;
                            abstractC1449d.f19593k = false;
                            abstractC1449d.j = j;
                            abstractC1449d.m(j, false);
                        }
                    }
                    i11++;
                }
                d(zArr2);
            } else {
                i9 = 4;
                this.f19378r.k(c1448c03);
                if (c1448c03.f19573d) {
                    c1448c03.a(g9, Math.max(c1448c03.f19575f.f19596b, this.f19366i0 - c1448c03.f19583o), false, new boolean[c1448c03.f19578i.length]);
                }
            }
            i(true);
            if (this.f19383w.f19671e != i9) {
                q();
                e0();
                this.f19363h.c(2);
                return;
            }
            return;
        }
    }
}
