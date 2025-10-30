package W3;

import A6.s;
import F5.e;
import N3.A;
import N3.AbstractC0250a;
import N3.C0266q;
import N3.G;
import N3.InterfaceC0272x;
import N3.h0;
import P3.g;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import d0.o;
import e1.q;
import j3.K;
import j3.U;
import j3.Y;
import java.util.ArrayList;
import java.util.regex.Matcher;
import k3.l;
import k4.C1517q;
import k4.H;
import k4.InterfaceC1512l;
import k4.InterfaceC1513m;
import k4.J;
import k4.M;
import k4.N;
import k4.O;
import k4.P;
import k4.W;
import l4.AbstractC1566a;
import l4.y;
import n3.C1635l;
import n3.InterfaceC1638o;
import s4.i;

/* loaded from: classes.dex */
public final class c extends AbstractC0250a implements H {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f7907h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f7908i;
    public final Y j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1512l f7909k;

    /* renamed from: l, reason: collision with root package name */
    public final i f7910l;

    /* renamed from: m, reason: collision with root package name */
    public final e f7911m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC1638o f7912n;

    /* renamed from: o, reason: collision with root package name */
    public final q f7913o;

    /* renamed from: p, reason: collision with root package name */
    public final long f7914p;

    /* renamed from: q, reason: collision with root package name */
    public final G f7915q;

    /* renamed from: r, reason: collision with root package name */
    public final O f7916r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f7917s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1513m f7918t;

    /* renamed from: u, reason: collision with root package name */
    public M f7919u;

    /* renamed from: v, reason: collision with root package name */
    public N f7920v;

    /* renamed from: w, reason: collision with root package name */
    public W f7921w;

    /* renamed from: x, reason: collision with root package name */
    public long f7922x;

    /* renamed from: y, reason: collision with root package name */
    public X3.c f7923y;

    /* renamed from: z, reason: collision with root package name */
    public Handler f7924z;

    static {
        K.a("goog.exo.smoothstreaming");
    }

    public c(Y y9, InterfaceC1512l interfaceC1512l, O o9, i iVar, e eVar, InterfaceC1638o interfaceC1638o, q qVar, long j) {
        this.j = y9;
        U u9 = y9.f19492b;
        u9.getClass();
        this.f7923y = null;
        Uri uri = Uri.EMPTY;
        Uri uri2 = u9.f19475a;
        if (uri2.equals(uri)) {
            uri2 = null;
        } else {
            int i9 = y.f20553a;
            String path = uri2.getPath();
            if (path != null) {
                Matcher matcher = y.f20561i.matcher(path);
                if (matcher.matches() && matcher.group(1) == null) {
                    uri2 = Uri.withAppendedPath(uri2, "Manifest");
                }
            }
        }
        this.f7908i = uri2;
        this.f7909k = interfaceC1512l;
        this.f7916r = o9;
        this.f7910l = iVar;
        this.f7911m = eVar;
        this.f7912n = interfaceC1638o;
        this.f7913o = qVar;
        this.f7914p = j;
        this.f7915q = a(null);
        this.f7907h = false;
        this.f7917s = new ArrayList();
    }

    @Override // N3.AbstractC0250a
    public final InterfaceC0272x b(A a5, C1517q c1517q, long j) {
        G a9 = a(a5);
        C1635l c1635l = new C1635l(this.f5038d.f21132c, 0, a5);
        X3.c cVar = this.f7923y;
        W w7 = this.f7921w;
        N n7 = this.f7920v;
        b bVar = new b(cVar, this.f7910l, w7, this.f7911m, this.f7912n, c1635l, this.f7913o, a9, n7, c1517q);
        this.f7917s.add(bVar);
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final B3.f e(k4.J r8, java.io.IOException r9, int r10) {
        /*
            r7 = this;
            r0 = 0
            k4.P r8 = (k4.P) r8
            N3.q r1 = new N3.q
            long r2 = r8.f20008a
            k4.V r2 = r8.f20011d
            android.net.Uri r2 = r2.f20034c
            r1.<init>()
            e1.q r2 = r7.f7913o
            r2.getClass()
            boolean r2 = r9 instanceof j3.j0
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 != 0) goto L4c
            boolean r2 = r9 instanceof java.io.FileNotFoundException
            if (r2 != 0) goto L4c
            boolean r2 = r9 instanceof k4.C1495A
            if (r2 != 0) goto L4c
            boolean r2 = r9 instanceof k4.L
            if (r2 != 0) goto L4c
            int r2 = k4.C1514n.f20070b
            r2 = r9
        L2b:
            if (r2 == 0) goto L40
            boolean r5 = r2 instanceof k4.C1514n
            if (r5 == 0) goto L3b
            r5 = r2
            k4.n r5 = (k4.C1514n) r5
            int r5 = r5.f20071a
            r6 = 2008(0x7d8, float:2.814E-42)
            if (r5 != r6) goto L3b
            goto L4c
        L3b:
            java.lang.Throwable r2 = r2.getCause()
            goto L2b
        L40:
            int r10 = r10 + (-1)
            int r10 = r10 * 1000
            r2 = 5000(0x1388, float:7.006E-42)
            int r10 = java.lang.Math.min(r10, r2)
            long r5 = (long) r10
            goto L4d
        L4c:
            r5 = r3
        L4d:
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L54
            B3.f r10 = k4.M.f20004f
            goto L59
        L54:
            B3.f r10 = new B3.f
            r10.<init>(r0, r5, r0)
        L59:
            boolean r0 = r10.a()
            r0 = r0 ^ 1
            N3.G r2 = r7.f7915q
            int r8 = r8.f20010c
            r2.j(r1, r8, r9, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: W3.c.e(k4.J, java.io.IOException, int):B3.f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void f(J j, long j4, long j9) {
        P p9 = (P) j;
        long j10 = p9.f20008a;
        Uri uri = p9.f20011d.f20034c;
        ?? obj = new Object();
        this.f7913o.getClass();
        this.f7915q.f(obj, p9.f20010c);
        this.f7923y = (X3.c) p9.f20013f;
        this.f7922x = j4 - j9;
        v();
        if (!this.f7923y.f8434d) {
            return;
        }
        this.f7924z.postDelayed(new s(12, this), Math.max(0L, (this.f7922x + 5000) - SystemClock.elapsedRealtime()));
    }

    @Override // N3.AbstractC0250a
    public final Y j() {
        return this.j;
    }

    @Override // N3.AbstractC0250a
    public final void l() {
        this.f7920v.b();
    }

    @Override // N3.AbstractC0250a
    public final void n(W w7) {
        this.f7921w = w7;
        InterfaceC1638o interfaceC1638o = this.f7912n;
        interfaceC1638o.b();
        Looper myLooper = Looper.myLooper();
        l lVar = this.f5041g;
        AbstractC1566a.n(lVar);
        interfaceC1638o.l(myLooper, lVar);
        if (this.f7907h) {
            this.f7920v = new o(7);
            v();
            return;
        }
        this.f7918t = this.f7909k.c();
        M m9 = new M("SsMediaSource");
        this.f7919u = m9;
        this.f7920v = m9;
        this.f7924z = y.l(null);
        w();
    }

    @Override // N3.AbstractC0250a
    public final void p(InterfaceC0272x interfaceC0272x) {
        b bVar = (b) interfaceC0272x;
        for (g gVar : bVar.f7905m) {
            gVar.A(null);
        }
        bVar.f7903k = null;
        this.f7917s.remove(interfaceC0272x);
    }

    @Override // N3.AbstractC0250a
    public final void r() {
        X3.c cVar;
        if (this.f7907h) {
            cVar = this.f7923y;
        } else {
            cVar = null;
        }
        this.f7923y = cVar;
        this.f7918t = null;
        this.f7922x = 0L;
        M m9 = this.f7919u;
        if (m9 != null) {
            m9.e(null);
            this.f7919u = null;
        }
        Handler handler = this.f7924z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f7924z = null;
        }
        this.f7912n.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, N3.q] */
    @Override // k4.H
    public final void s(J j, long j4, long j9, boolean z9) {
        P p9 = (P) j;
        long j10 = p9.f20008a;
        Uri uri = p9.f20011d.f20034c;
        ?? obj = new Object();
        this.f7913o.getClass();
        this.f7915q.d(obj, p9.f20010c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void v() {
        h0 h0Var;
        long j;
        int i9;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f7917s;
            if (i10 >= arrayList.size()) {
                break;
            }
            b bVar = (b) arrayList.get(i10);
            X3.c cVar = this.f7923y;
            bVar.f7904l = cVar;
            g[] gVarArr = bVar.f7905m;
            int length = gVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                a aVar = (a) gVarArr[i11].f5856e;
                X3.b[] bVarArr = aVar.f7891f.f8436f;
                int i12 = aVar.f7887b;
                X3.b bVar2 = bVarArr[i12];
                int i13 = bVar2.f8425k;
                X3.b bVar3 = cVar.f8436f[i12];
                if (i13 == 0 || bVar3.f8425k == 0) {
                    i9 = i10;
                    aVar.f7892g += i13;
                } else {
                    int i14 = i13 - 1;
                    long[] jArr = bVar2.f8429o;
                    long b9 = bVar2.b(i14) + jArr[i14];
                    i9 = i10;
                    long j4 = bVar3.f8429o[0];
                    if (b9 <= j4) {
                        aVar.f7892g += i13;
                    } else {
                        aVar.f7892g = y.e(jArr, j4, true) + aVar.f7892g;
                    }
                }
                aVar.f7891f = cVar;
                i11++;
                i10 = i9;
            }
            bVar.f7903k.v(bVar);
            i10++;
        }
        long j9 = Long.MIN_VALUE;
        long j10 = Long.MAX_VALUE;
        for (X3.b bVar4 : this.f7923y.f8436f) {
            if (bVar4.f8425k > 0) {
                long[] jArr2 = bVar4.f8429o;
                j10 = Math.min(j10, jArr2[0]);
                int i15 = bVar4.f8425k - 1;
                j9 = Math.max(j9, bVar4.b(i15) + jArr2[i15]);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            if (this.f7923y.f8434d) {
                j = -9223372036854775807L;
            } else {
                j = 0;
            }
            X3.c cVar2 = this.f7923y;
            boolean z9 = cVar2.f8434d;
            h0Var = new h0(j, 0L, 0L, 0L, true, z9, z9, cVar2, this.j);
        } else {
            X3.c cVar3 = this.f7923y;
            if (cVar3.f8434d) {
                long j11 = cVar3.f8438h;
                if (j11 != -9223372036854775807L && j11 > 0) {
                    j10 = Math.max(j10, j9 - j11);
                }
                long j12 = j10;
                long j13 = j9 - j12;
                long H8 = j13 - y.H(this.f7914p);
                if (H8 < 5000000) {
                    H8 = Math.min(5000000L, j13 / 2);
                }
                h0Var = new h0(-9223372036854775807L, j13, j12, H8, true, true, true, this.f7923y, this.j);
            } else {
                long j14 = cVar3.f8437g;
                if (j14 == -9223372036854775807L) {
                    j14 = j9 - j10;
                }
                long j15 = j14;
                h0Var = new h0(-9223372036854775807L, -9223372036854775807L, j10 + j15, j15, j10, 0L, true, false, false, this.f7923y, this.j, null);
            }
        }
        o(h0Var);
    }

    public final void w() {
        if (this.f7919u.c()) {
            return;
        }
        P p9 = new P(this.f7918t, this.f7908i, 4, this.f7916r);
        M m9 = this.f7919u;
        q qVar = this.f7913o;
        int i9 = p9.f20010c;
        m9.f(p9, this, qVar.f(i9));
        this.f7915q.l(new C0266q(p9.f20009b), i9, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
