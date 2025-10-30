package Q3;

import N3.A;
import N3.AbstractC0250a;
import N3.C0266q;
import N3.G;
import N3.InterfaceC0272x;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.firebase.messaging.s;
import e1.q;
import f5.C1183o;
import j3.K;
import j3.T;
import j3.U;
import j3.Y;
import java.util.HashMap;
import k4.C1517q;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;
import k4.M;
import k4.N;
import k4.O;
import k4.P;
import k4.W;
import l4.AbstractC1566a;
import l4.y;
import n3.C1635l;
import n3.InterfaceC1638o;
import o1.C1671f;

/* loaded from: classes.dex */
public final class h extends AbstractC0250a {

    /* renamed from: A, reason: collision with root package name */
    public M f6359A;

    /* renamed from: B, reason: collision with root package name */
    public W f6360B;

    /* renamed from: C, reason: collision with root package name */
    public N3.M f6361C;

    /* renamed from: D, reason: collision with root package name */
    public Handler f6362D;

    /* renamed from: X, reason: collision with root package name */
    public T f6363X;
    public Uri Y;

    /* renamed from: Z, reason: collision with root package name */
    public final Uri f6364Z;

    /* renamed from: f0, reason: collision with root package name */
    public R3.c f6365f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f6366g0;

    /* renamed from: h, reason: collision with root package name */
    public final Y f6367h;

    /* renamed from: h0, reason: collision with root package name */
    public long f6368h0;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6369i;

    /* renamed from: i0, reason: collision with root package name */
    public long f6370i0;
    public final InterfaceC1512l j;

    /* renamed from: j0, reason: collision with root package name */
    public long f6371j0;

    /* renamed from: k, reason: collision with root package name */
    public final C1671f f6372k;

    /* renamed from: k0, reason: collision with root package name */
    public int f6373k0;

    /* renamed from: l, reason: collision with root package name */
    public final F5.e f6374l;

    /* renamed from: l0, reason: collision with root package name */
    public long f6375l0;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC1638o f6376m;

    /* renamed from: m0, reason: collision with root package name */
    public int f6377m0;

    /* renamed from: n, reason: collision with root package name */
    public final q f6378n;

    /* renamed from: o, reason: collision with root package name */
    public final s f6379o;

    /* renamed from: p, reason: collision with root package name */
    public final long f6380p;

    /* renamed from: q, reason: collision with root package name */
    public final G f6381q;

    /* renamed from: r, reason: collision with root package name */
    public final O f6382r;

    /* renamed from: s, reason: collision with root package name */
    public final C1671f f6383s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f6384t;

    /* renamed from: u, reason: collision with root package name */
    public final SparseArray f6385u;

    /* renamed from: v, reason: collision with root package name */
    public final c f6386v;

    /* renamed from: w, reason: collision with root package name */
    public final c f6387w;

    /* renamed from: x, reason: collision with root package name */
    public final f f6388x;

    /* renamed from: y, reason: collision with root package name */
    public final N f6389y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC1513m f6390z;

    static {
        K.a("goog.exo.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [Q3.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [Q3.c] */
    public h(Y y9, InterfaceC1512l interfaceC1512l, O o9, C1671f c1671f, F5.e eVar, InterfaceC1638o interfaceC1638o, q qVar, long j) {
        this.f6367h = y9;
        this.f6363X = y9.f19493c;
        U u9 = y9.f19492b;
        u9.getClass();
        Uri uri = u9.f19475a;
        this.Y = uri;
        this.f6364Z = uri;
        this.f6365f0 = null;
        this.j = interfaceC1512l;
        this.f6382r = o9;
        this.f6372k = c1671f;
        this.f6376m = interfaceC1638o;
        this.f6378n = qVar;
        this.f6380p = j;
        this.f6374l = eVar;
        this.f6379o = new s(4);
        this.f6369i = false;
        this.f6381q = a(null);
        this.f6384t = new Object();
        this.f6385u = new SparseArray();
        this.f6388x = new f(this);
        this.f6375l0 = -9223372036854775807L;
        this.f6371j0 = -9223372036854775807L;
        this.f6383s = new C1671f(17, this);
        this.f6389y = new d(this);
        final int i9 = 0;
        this.f6386v = new Runnable(this) { // from class: Q3.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f6346b;

            {
                this.f6346b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.f6346b.y();
                        return;
                    default:
                        this.f6346b.x(false);
                        return;
                }
            }
        };
        final int i10 = 1;
        this.f6387w = new Runnable(this) { // from class: Q3.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f6346b;

            {
                this.f6346b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f6346b.y();
                        return;
                    default:
                        this.f6346b.x(false);
                        return;
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean v(R3.h r5) {
        /*
            r0 = 0
            r1 = r0
        L2:
            java.util.List r2 = r5.f6617c
            int r3 = r2.size()
            if (r1 >= r3) goto L1d
            java.lang.Object r2 = r2.get(r1)
            R3.a r2 = (R3.a) r2
            int r2 = r2.f6576b
            r3 = 1
            if (r2 == r3) goto L1c
            r4 = 2
            if (r2 != r4) goto L19
            goto L1c
        L19:
            int r1 = r1 + 1
            goto L2
        L1c:
            return r3
        L1d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.h.v(R3.h):boolean");
    }

    @Override // N3.AbstractC0250a
    public final InterfaceC0272x b(A a5, C1517q c1517q, long j) {
        int intValue = ((Integer) a5.f5207a).intValue() - this.f6377m0;
        G g9 = new G(this.f5037c.f4923c, 0, a5, this.f6365f0.b(intValue).f6616b);
        C1635l c1635l = new C1635l(this.f5038d.f21132c, 0, a5);
        int i9 = this.f6377m0 + intValue;
        R3.c cVar = this.f6365f0;
        W w7 = this.f6360B;
        long j4 = this.f6371j0;
        k3.l lVar = this.f5041g;
        AbstractC1566a.n(lVar);
        b bVar = new b(i9, cVar, this.f6379o, intValue, this.f6372k, w7, this.f6376m, c1635l, this.f6378n, g9, j4, this.f6389y, c1517q, this.f6374l, this.f6388x, lVar);
        this.f6385u.put(i9, bVar);
        return bVar;
    }

    @Override // N3.AbstractC0250a
    public final Y j() {
        return this.f6367h;
    }

    @Override // N3.AbstractC0250a
    public final void l() {
        this.f6389y.b();
    }

    @Override // N3.AbstractC0250a
    public final void n(W w7) {
        this.f6360B = w7;
        InterfaceC1638o interfaceC1638o = this.f6376m;
        interfaceC1638o.b();
        Looper myLooper = Looper.myLooper();
        k3.l lVar = this.f5041g;
        AbstractC1566a.n(lVar);
        interfaceC1638o.l(myLooper, lVar);
        if (this.f6369i) {
            x(false);
            return;
        }
        this.f6390z = this.j.c();
        this.f6359A = new M("DashMediaSource");
        this.f6362D = y.l(null);
        y();
    }

    @Override // N3.AbstractC0250a
    public final void p(InterfaceC0272x interfaceC0272x) {
        b bVar = (b) interfaceC0272x;
        p pVar = bVar.f6334m;
        pVar.f6435i = true;
        pVar.f6430d.removeCallbacksAndMessages(null);
        for (P3.g gVar : bVar.f6339r) {
            gVar.A(bVar);
        }
        bVar.f6338q = null;
        this.f6385u.remove(bVar.f6323a);
    }

    @Override // N3.AbstractC0250a
    public final void r() {
        R3.c cVar;
        this.f6366g0 = false;
        this.f6390z = null;
        M m9 = this.f6359A;
        if (m9 != null) {
            m9.e(null);
            this.f6359A = null;
        }
        this.f6368h0 = 0L;
        this.f6370i0 = 0L;
        if (this.f6369i) {
            cVar = this.f6365f0;
        } else {
            cVar = null;
        }
        this.f6365f0 = cVar;
        this.Y = this.f6364Z;
        this.f6361C = null;
        Handler handler = this.f6362D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f6362D = null;
        }
        this.f6371j0 = -9223372036854775807L;
        this.f6373k0 = 0;
        this.f6375l0 = -9223372036854775807L;
        this.f6377m0 = 0;
        this.f6385u.clear();
        s sVar = this.f6379o;
        ((HashMap) sVar.f16504b).clear();
        ((HashMap) sVar.f16505c).clear();
        ((HashMap) sVar.f16506d).clear();
        this.f6376m.a();
    }

    public final void w() {
        boolean z9;
        M m9 = this.f6359A;
        d dVar = new d(this);
        synchronized (AbstractC1566a.f20481i) {
            z9 = AbstractC1566a.j;
        }
        if (z9) {
            dVar.a();
            return;
        }
        if (m9 == null) {
            m9 = new M("SntpClient");
        }
        m9.f(new d0.o(8), new C1183o(8, dVar), 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0496, code lost:
    
        if (r8 > r22) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0499, code lost:
    
        if (r11 > 0) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x049c, code lost:
    
        if (r11 < 0) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016e, code lost:
    
        r11 = r19;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:216:0x047a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:249:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x039b  */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20, types: [int] */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r5v23, types: [i4.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(boolean r46) {
        /*
            Method dump skipped, instructions count: 1272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q3.h.x(boolean):void");
    }

    public final void y() {
        Uri uri;
        this.f6362D.removeCallbacks(this.f6386v);
        if (this.f6359A.c()) {
            return;
        }
        if (this.f6359A.d()) {
            this.f6366g0 = true;
            return;
        }
        synchronized (this.f6384t) {
            uri = this.Y;
        }
        this.f6366g0 = false;
        P p9 = new P(this.f6390z, uri, 4, this.f6382r);
        this.f6359A.f(p9, this.f6383s, this.f6378n.f(4));
        this.f6381q.l(new C0266q(p9.f20009b), p9.f20010c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
