package l3;

import F0.C0104h;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import b5.G1;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d0.ThreadFactoryC1083a;
import j3.C1441D;
import j3.C1442E;
import j3.C1470v;
import j3.m0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class D implements q {

    /* renamed from: d0, reason: collision with root package name */
    public static final Object f20239d0 = new Object();

    /* renamed from: e0, reason: collision with root package name */
    public static ExecutorService f20240e0;

    /* renamed from: f0, reason: collision with root package name */
    public static int f20241f0;

    /* renamed from: A, reason: collision with root package name */
    public int f20242A;

    /* renamed from: B, reason: collision with root package name */
    public long f20243B;

    /* renamed from: C, reason: collision with root package name */
    public long f20244C;

    /* renamed from: D, reason: collision with root package name */
    public long f20245D;

    /* renamed from: E, reason: collision with root package name */
    public long f20246E;

    /* renamed from: F, reason: collision with root package name */
    public int f20247F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f20248G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f20249H;

    /* renamed from: I, reason: collision with root package name */
    public long f20250I;

    /* renamed from: J, reason: collision with root package name */
    public float f20251J;
    public InterfaceC1561j[] K;

    /* renamed from: L, reason: collision with root package name */
    public ByteBuffer[] f20252L;

    /* renamed from: M, reason: collision with root package name */
    public ByteBuffer f20253M;

    /* renamed from: N, reason: collision with root package name */
    public int f20254N;

    /* renamed from: O, reason: collision with root package name */
    public ByteBuffer f20255O;

    /* renamed from: P, reason: collision with root package name */
    public byte[] f20256P;

    /* renamed from: Q, reason: collision with root package name */
    public int f20257Q;

    /* renamed from: R, reason: collision with root package name */
    public int f20258R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f20259S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f20260T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f20261U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f20262V;

    /* renamed from: W, reason: collision with root package name */
    public int f20263W;

    /* renamed from: X, reason: collision with root package name */
    public u f20264X;
    public z Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f20265Z;

    /* renamed from: a, reason: collision with root package name */
    public final C1558g f20266a;

    /* renamed from: a0, reason: collision with root package name */
    public long f20267a0;

    /* renamed from: b, reason: collision with root package name */
    public final G1 f20268b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f20269b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f20270c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f20271c0;

    /* renamed from: d, reason: collision with root package name */
    public final w f20272d;

    /* renamed from: e, reason: collision with root package name */
    public final N f20273e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1561j[] f20274f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1561j[] f20275g;

    /* renamed from: h, reason: collision with root package name */
    public final H1.k f20276h;

    /* renamed from: i, reason: collision with root package name */
    public final t f20277i;
    public final ArrayDeque j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f20278k;

    /* renamed from: l, reason: collision with root package name */
    public final int f20279l;

    /* renamed from: m, reason: collision with root package name */
    public G1 f20280m;

    /* renamed from: n, reason: collision with root package name */
    public final C0104h f20281n;

    /* renamed from: o, reason: collision with root package name */
    public final C0104h f20282o;

    /* renamed from: p, reason: collision with root package name */
    public final E f20283p;

    /* renamed from: q, reason: collision with root package name */
    public k3.l f20284q;

    /* renamed from: r, reason: collision with root package name */
    public i.G f20285r;

    /* renamed from: s, reason: collision with root package name */
    public C1551A f20286s;

    /* renamed from: t, reason: collision with root package name */
    public C1551A f20287t;

    /* renamed from: u, reason: collision with root package name */
    public AudioTrack f20288u;

    /* renamed from: v, reason: collision with root package name */
    public C1556e f20289v;

    /* renamed from: w, reason: collision with root package name */
    public B f20290w;

    /* renamed from: x, reason: collision with root package name */
    public B f20291x;

    /* renamed from: y, reason: collision with root package name */
    public m0 f20292y;

    /* renamed from: z, reason: collision with root package name */
    public ByteBuffer f20293z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, l3.u] */
    /* JADX WARN: Type inference failed for: r11v3, types: [H1.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [l3.w, l3.v] */
    /* JADX WARN: Type inference failed for: r4v2, types: [l3.N, l3.v] */
    public D(G1 g12) {
        this.f20266a = (C1558g) g12.f10717b;
        G1 g13 = (G1) g12.f10718c;
        this.f20268b = g13;
        int i9 = l4.y.f20553a;
        this.f20270c = false;
        this.f20278k = false;
        this.f20279l = 0;
        this.f20283p = (E) g12.f10719d;
        ?? obj = new Object();
        this.f20276h = obj;
        obj.d();
        this.f20277i = new t(new com.google.firebase.messaging.u(this));
        ?? vVar = new v();
        this.f20272d = vVar;
        ?? vVar2 = new v();
        vVar2.f20363m = l4.y.f20558f;
        this.f20273e = vVar2;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new v(), vVar, vVar2);
        Collections.addAll(arrayList, (InterfaceC1561j[]) g13.f10717b);
        this.f20274f = (InterfaceC1561j[]) arrayList.toArray(new InterfaceC1561j[0]);
        this.f20275g = new InterfaceC1561j[]{new v()};
        this.f20251J = 1.0f;
        this.f20289v = C1556e.f20389g;
        this.f20263W = 0;
        this.f20264X = new Object();
        m0 m0Var = m0.f19693d;
        this.f20291x = new B(m0Var, false, 0L, 0L);
        this.f20292y = m0Var;
        this.f20258R = -1;
        this.K = new InterfaceC1561j[0];
        this.f20252L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.f20281n = new C0104h(4);
        this.f20282o = new C0104h(4);
    }

    public static AudioFormat e(int i9, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i9).setChannelMask(i10).setEncoding(i11).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (l4.y.f20553a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void a(long j) {
        m0 m0Var;
        final boolean z9;
        final C1564m c1564m;
        Handler handler;
        boolean t7 = t();
        G1 g12 = this.f20268b;
        if (t7) {
            m0Var = g().f20234a;
            g12.getClass();
            float f9 = m0Var.f19694a;
            M m9 = (M) g12.f10719d;
            if (m9.f20347c != f9) {
                m9.f20347c = f9;
                m9.f20353i = true;
            }
            float f10 = m9.f20348d;
            float f11 = m0Var.f19695b;
            if (f10 != f11) {
                m9.f20348d = f11;
                m9.f20353i = true;
            }
        } else {
            m0Var = m0.f19693d;
        }
        m0 m0Var2 = m0Var;
        int i9 = 0;
        if (t()) {
            boolean z10 = g().f20235b;
            ((K) g12.f10718c).f20317m = z10;
            z9 = z10;
        } else {
            z9 = false;
        }
        this.j.add(new B(m0Var2, z9, Math.max(0L, j), (i() * 1000000) / this.f20287t.f20229e));
        InterfaceC1561j[] interfaceC1561jArr = this.f20287t.f20233i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC1561j interfaceC1561j : interfaceC1561jArr) {
            if (interfaceC1561j.a()) {
                arrayList.add(interfaceC1561j);
            } else {
                interfaceC1561j.flush();
            }
        }
        int size = arrayList.size();
        this.K = (InterfaceC1561j[]) arrayList.toArray(new InterfaceC1561j[size]);
        this.f20252L = new ByteBuffer[size];
        while (true) {
            InterfaceC1561j[] interfaceC1561jArr2 = this.K;
            if (i9 >= interfaceC1561jArr2.length) {
                break;
            }
            InterfaceC1561j interfaceC1561j2 = interfaceC1561jArr2[i9];
            interfaceC1561j2.flush();
            this.f20252L[i9] = interfaceC1561j2.b();
            i9++;
        }
        i.G g9 = this.f20285r;
        if (g9 != null && (handler = (c1564m = ((H) g9.f17990b).f20297d1).f20413b) != null) {
            handler.post(new Runnable() { // from class: l3.l
                @Override // java.lang.Runnable
                public final void run() {
                    C1564m c1564m2 = C1564m.this;
                    c1564m2.getClass();
                    int i10 = l4.y.f20553a;
                    C1441D c1441d = c1564m2.f20414c.f19226a;
                    boolean z11 = c1441d.f19297y0;
                    boolean z12 = z9;
                    if (z11 == z12) {
                        return;
                    }
                    c1441d.f19297y0 = z12;
                    c1441d.f19271l.e(23, new C1470v(1, z12));
                }
            });
        }
    }

    public final void b(j3.M m9, int[] iArr) {
        int i9;
        InterfaceC1561j[] interfaceC1561jArr;
        int intValue;
        int i10;
        int i11;
        int intValue2;
        int i12;
        boolean z9;
        double d9;
        int i13;
        InterfaceC1561j[] interfaceC1561jArr2;
        int[] iArr2;
        boolean equals = "audio/raw".equals(m9.f19435l);
        int i14 = m9.f19449z;
        int i15 = m9.f19448y;
        if (equals) {
            int i16 = m9.f19420A;
            AbstractC1566a.h(l4.y.F(i16));
            int x5 = l4.y.x(i16, i15);
            if (this.f20270c && (i16 == 536870912 || i16 == 805306368 || i16 == 4)) {
                interfaceC1561jArr2 = this.f20275g;
            } else {
                interfaceC1561jArr2 = this.f20274f;
            }
            int i17 = m9.f19421B;
            N n7 = this.f20273e;
            n7.f20360i = i17;
            n7.j = m9.f19422C;
            if (l4.y.f20553a < 21 && i15 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i18 = 0; i18 < 6; i18++) {
                    iArr2[i18] = i18;
                }
            } else {
                iArr2 = iArr;
            }
            this.f20272d.f20471i = iArr2;
            C1559h c1559h = new C1559h(i14, i15, i16);
            for (InterfaceC1561j interfaceC1561j : interfaceC1561jArr2) {
                try {
                    C1559h f9 = interfaceC1561j.f(c1559h);
                    if (interfaceC1561j.a()) {
                        c1559h = f9;
                    }
                } catch (C1560i e8) {
                    throw new C1565n(e8, m9);
                }
            }
            int i19 = c1559h.f20405c;
            int i20 = c1559h.f20404b;
            int n9 = l4.y.n(i20);
            i11 = l4.y.x(i19, i20);
            interfaceC1561jArr = interfaceC1561jArr2;
            intValue = i19;
            i12 = x5;
            intValue2 = n9;
            i10 = c1559h.f20403a;
            i9 = 0;
        } else {
            InterfaceC1561j[] interfaceC1561jArr3 = new InterfaceC1561j[0];
            if (u(m9, this.f20289v)) {
                String str = m9.f19435l;
                str.getClass();
                i9 = 1;
                interfaceC1561jArr = interfaceC1561jArr3;
                intValue = l4.n.c(str, m9.f19433i);
                i12 = -1;
                intValue2 = l4.y.n(i15);
                i10 = i14;
                i11 = -1;
            } else {
                Pair a5 = this.f20266a.a(m9);
                if (a5 != null) {
                    i9 = 2;
                    interfaceC1561jArr = interfaceC1561jArr3;
                    intValue = ((Integer) a5.first).intValue();
                    i10 = i14;
                    i11 = -1;
                    intValue2 = ((Integer) a5.second).intValue();
                    i12 = -1;
                } else {
                    throw new C1565n("Unable to configure passthrough for: " + m9, m9);
                }
            }
        }
        if (intValue != 0) {
            if (intValue2 != 0) {
                int minBufferSize = AudioTrack.getMinBufferSize(i10, intValue2, intValue);
                if (minBufferSize != -2) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                if (this.f20278k) {
                    d9 = 8.0d;
                } else {
                    d9 = 1.0d;
                }
                this.f20283p.getClass();
                int i21 = 250000;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 == 2) {
                            if (intValue == 5) {
                                i21 = 500000;
                            }
                            i13 = v4.e.e((i21 * E.a(intValue)) / 1000000);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        i13 = v4.e.e((50000000 * E.a(intValue)) / 1000000);
                    }
                } else {
                    long j = i10;
                    long j4 = 250000 * j;
                    long j9 = i11;
                    i13 = l4.y.i(minBufferSize * 4, v4.e.e((j4 * j9) / 1000000), v4.e.e(((750000 * j) * j9) / 1000000));
                }
                this.f20269b0 = false;
                C1551A c1551a = new C1551A(m9, i12, i9, i11, i10, intValue2, intValue, (((Math.max(minBufferSize, (int) (i13 * d9)) + i11) - 1) / i11) * i11, interfaceC1561jArr);
                if (m()) {
                    this.f20286s = c1551a;
                    return;
                } else {
                    this.f20287t = c1551a;
                    return;
                }
            }
            throw new C1565n("Invalid output channel config (mode=" + i9 + ") for: " + m9, m9);
        }
        throw new C1565n("Invalid output encoding (mode=" + i9 + ") for: " + m9, m9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0038, code lost:
    
        if (r9.f20255O != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() {
        /*
            r9 = this;
            int r0 = r9.f20258R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f20258R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f20258R
            l3.j[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.c()
        L1f:
            r9.p(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L29
            goto L3a
        L29:
            int r0 = r9.f20258R
            int r0 = r0 + r1
            r9.f20258R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f20255O
            if (r0 == 0) goto L3b
            r9.v(r0, r7)
            java.nio.ByteBuffer r0 = r9.f20255O
            if (r0 == 0) goto L3b
        L3a:
            return r2
        L3b:
            r9.f20258R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.D.c():boolean");
    }

    public final void d() {
        if (m()) {
            this.f20243B = 0L;
            this.f20244C = 0L;
            this.f20245D = 0L;
            this.f20246E = 0L;
            this.f20271c0 = false;
            this.f20247F = 0;
            this.f20291x = new B(g().f20234a, g().f20235b, 0L, 0L);
            this.f20250I = 0L;
            this.f20290w = null;
            this.j.clear();
            this.f20253M = null;
            this.f20254N = 0;
            this.f20255O = null;
            this.f20260T = false;
            this.f20259S = false;
            this.f20258R = -1;
            this.f20293z = null;
            this.f20242A = 0;
            this.f20273e.f20365o = 0L;
            int i9 = 0;
            while (true) {
                InterfaceC1561j[] interfaceC1561jArr = this.K;
                if (i9 >= interfaceC1561jArr.length) {
                    break;
                }
                InterfaceC1561j interfaceC1561j = interfaceC1561jArr[i9];
                interfaceC1561j.flush();
                this.f20252L[i9] = interfaceC1561j.b();
                i9++;
            }
            AudioTrack audioTrack = this.f20277i.f20441c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f20288u.pause();
            }
            if (n(this.f20288u)) {
                G1 g12 = this.f20280m;
                g12.getClass();
                this.f20288u.unregisterStreamEventCallback((C) g12.f10718c);
                ((Handler) g12.f10717b).removeCallbacksAndMessages(null);
            }
            if (l4.y.f20553a < 21 && !this.f20262V) {
                this.f20263W = 0;
            }
            C1551A c1551a = this.f20286s;
            if (c1551a != null) {
                this.f20287t = c1551a;
                this.f20286s = null;
            }
            t tVar = this.f20277i;
            tVar.f20449l = 0L;
            tVar.f20460w = 0;
            tVar.f20459v = 0;
            tVar.f20450m = 0L;
            tVar.f20435C = 0L;
            tVar.f20438F = 0L;
            tVar.f20448k = false;
            tVar.f20441c = null;
            tVar.f20444f = null;
            AudioTrack audioTrack2 = this.f20288u;
            H1.k kVar = this.f20276h;
            kVar.c();
            synchronized (f20239d0) {
                try {
                    if (f20240e0 == null) {
                        f20240e0 = Executors.newSingleThreadExecutor(new ThreadFactoryC1083a("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f20241f0++;
                    f20240e0.execute(new A6.r(audioTrack2, 18, kVar));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f20288u = null;
        }
        this.f20282o.f2115c = null;
        this.f20281n.f2115c = null;
    }

    public final int f(j3.M m9) {
        if ("audio/raw".equals(m9.f19435l)) {
            int i9 = m9.f19420A;
            if (!l4.y.F(i9)) {
                AbstractC0953k1.v("Invalid PCM encoding: ", i9, "DefaultAudioSink");
                return 0;
            }
            if (i9 != 2 && (!this.f20270c || i9 != 4)) {
                return 1;
            }
        } else if ((this.f20269b0 || !u(m9, this.f20289v)) && this.f20266a.a(m9) == null) {
            return 0;
        }
        return 2;
    }

    public final B g() {
        B b9 = this.f20290w;
        if (b9 != null) {
            return b9;
        }
        ArrayDeque arrayDeque = this.j;
        if (!arrayDeque.isEmpty()) {
            return (B) arrayDeque.getLast();
        }
        return this.f20291x;
    }

    public final long h() {
        if (this.f20287t.f20227c == 0) {
            return this.f20243B / r0.f20226b;
        }
        return this.f20244C;
    }

    public final long i() {
        if (this.f20287t.f20227c == 0) {
            return this.f20245D / r0.f20228d;
        }
        return this.f20246E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:178:0x0096, code lost:
    
        if (l() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0103, code lost:
    
        if (r10.a() == 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02d7, code lost:
    
        if (r5 == 0) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(java.nio.ByteBuffer r27, long r28, int r30) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.D.j(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean k() {
        if (m() && this.f20277i.b(i())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.D.l():boolean");
    }

    public final boolean m() {
        if (this.f20288u != null) {
            return true;
        }
        return false;
    }

    public final void o() {
        if (!this.f20260T) {
            this.f20260T = true;
            long i9 = i();
            t tVar = this.f20277i;
            tVar.f20463z = tVar.a();
            tVar.f20461x = SystemClock.elapsedRealtime() * 1000;
            tVar.f20433A = i9;
            this.f20288u.stop();
            this.f20242A = 0;
        }
    }

    public final void p(long j) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i9 = length;
        while (i9 >= 0) {
            if (i9 > 0) {
                byteBuffer = this.f20252L[i9 - 1];
            } else {
                byteBuffer = this.f20253M;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC1561j.f20407a;
                }
            }
            if (i9 == length) {
                v(byteBuffer, j);
            } else {
                InterfaceC1561j interfaceC1561j = this.K[i9];
                if (i9 > this.f20258R) {
                    interfaceC1561j.e(byteBuffer);
                }
                ByteBuffer b9 = interfaceC1561j.b();
                this.f20252L[i9] = b9;
                if (b9.hasRemaining()) {
                    i9++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i9--;
            } else {
                return;
            }
        }
    }

    public final void q() {
        d();
        for (InterfaceC1561j interfaceC1561j : this.f20274f) {
            interfaceC1561j.reset();
        }
        for (InterfaceC1561j interfaceC1561j2 : this.f20275g) {
            interfaceC1561j2.reset();
        }
        this.f20261U = false;
        this.f20269b0 = false;
    }

    public final void r(m0 m0Var, boolean z9) {
        B g9 = g();
        if (m0Var.equals(g9.f20234a) && z9 == g9.f20235b) {
            return;
        }
        B b9 = new B(m0Var, z9, -9223372036854775807L, -9223372036854775807L);
        if (m()) {
            this.f20290w = b9;
        } else {
            this.f20291x = b9;
        }
    }

    public final void s(m0 m0Var) {
        if (m()) {
            try {
                this.f20288u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(m0Var.f19694a).setPitch(m0Var.f19695b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e8) {
                AbstractC1566a.Q("DefaultAudioSink", "Failed to set playback params", e8);
            }
            m0Var = new m0(this.f20288u.getPlaybackParams().getSpeed(), this.f20288u.getPlaybackParams().getPitch());
            float f9 = m0Var.f19694a;
            t tVar = this.f20277i;
            tVar.j = f9;
            s sVar = tVar.f20444f;
            if (sVar != null) {
                sVar.a();
            }
        }
        this.f20292y = m0Var;
    }

    public final boolean t() {
        if (!this.f20265Z && "audio/raw".equals(this.f20287t.f20225a.f19435l)) {
            int i9 = this.f20287t.f20225a.f19420A;
            if (this.f20270c) {
                int i10 = l4.y.f20553a;
                if (i9 != 536870912 && i9 != 805306368 && i9 != 4) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean u(j3.M m9, C1556e c1556e) {
        int i9;
        int n7;
        boolean isOffloadedPlaybackSupported;
        int i10;
        boolean z9;
        boolean z10;
        int i11 = l4.y.f20553a;
        if (i11 >= 29 && (i9 = this.f20279l) != 0) {
            String str = m9.f19435l;
            str.getClass();
            int c3 = l4.n.c(str, m9.f19433i);
            if (c3 != 0 && (n7 = l4.y.n(m9.f19448y)) != 0) {
                AudioFormat e8 = e(m9.f19449z, n7, c3);
                AudioAttributes audioAttributes = (AudioAttributes) c1556e.a().f17433b;
                if (i11 >= 31) {
                    i10 = AudioManager.getPlaybackOffloadSupport(e8, audioAttributes);
                } else {
                    isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(e8, audioAttributes);
                    if (!isOffloadedPlaybackSupported) {
                        i10 = 0;
                    } else if (i11 == 30 && l4.y.f20556d.startsWith("Pixel")) {
                        i10 = 2;
                    } else {
                        i10 = 1;
                    }
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (m9.f19421B == 0 && m9.f19422C == 0) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (i9 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z9 || !z10) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final void v(ByteBuffer byteBuffer, long j) {
        ByteBuffer byteBuffer2;
        int write;
        boolean z9;
        int write2;
        i.G g9;
        C1442E c1442e;
        boolean z10;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.f20255O;
            boolean z11 = true;
            if (byteBuffer3 != null) {
                if (byteBuffer3 == byteBuffer) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AbstractC1566a.h(z10);
            } else {
                this.f20255O = byteBuffer;
                if (l4.y.f20553a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.f20256P;
                    if (bArr == null || bArr.length < remaining) {
                        this.f20256P = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.f20256P, 0, remaining);
                    byteBuffer.position(position);
                    this.f20257Q = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i9 = l4.y.f20553a;
            if (i9 < 21) {
                long j4 = this.f20245D;
                t tVar = this.f20277i;
                int a5 = tVar.f20443e - ((int) (j4 - (tVar.a() * tVar.f20442d)));
                if (a5 > 0) {
                    write = this.f20288u.write(this.f20256P, this.f20257Q, Math.min(remaining2, a5));
                    if (write > 0) {
                        this.f20257Q += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.f20265Z) {
                if (j != -9223372036854775807L) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                AudioTrack audioTrack = this.f20288u;
                if (i9 >= 26) {
                    byteBuffer2 = byteBuffer;
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1, j * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f20293z == null) {
                        ByteBuffer allocate = ByteBuffer.allocate(16);
                        this.f20293z = allocate;
                        allocate.order(ByteOrder.BIG_ENDIAN);
                        this.f20293z.putInt(1431633921);
                    }
                    if (this.f20242A == 0) {
                        this.f20293z.putInt(4, remaining2);
                        this.f20293z.putLong(8, j * 1000);
                        this.f20293z.position(0);
                        this.f20242A = remaining2;
                    }
                    int remaining3 = this.f20293z.remaining();
                    if (remaining3 > 0) {
                        write = audioTrack.write(this.f20293z, remaining3, 1);
                        if (write < 0) {
                            this.f20242A = 0;
                        } else if (write < remaining3) {
                            write = 0;
                        }
                    }
                    write2 = audioTrack.write(byteBuffer2, remaining2, 1);
                    if (write2 < 0) {
                        this.f20242A = 0;
                    } else {
                        this.f20242A -= write2;
                    }
                }
                write = write2;
            } else {
                byteBuffer2 = byteBuffer;
                write = this.f20288u.write(byteBuffer2, remaining2, 1);
            }
            this.f20267a0 = SystemClock.elapsedRealtime();
            C0104h c0104h = this.f20282o;
            if (write < 0) {
                if (((i9 < 24 || write != -6) && write != -32) || this.f20246E <= 0) {
                    z11 = false;
                }
                p pVar = new p(write, this.f20287t.f20225a, z11);
                i.G g10 = this.f20285r;
                if (g10 != null) {
                    g10.q(pVar);
                }
                if (!pVar.f20420b) {
                    c0104h.N(pVar);
                    return;
                }
                throw pVar;
            }
            c0104h.f2115c = null;
            if (n(this.f20288u)) {
                if (this.f20246E > 0) {
                    this.f20271c0 = false;
                }
                if (this.f20261U && (g9 = this.f20285r) != null && write < remaining2 && !this.f20271c0 && (c1442e = ((H) g9.f17990b).f20306m1) != null) {
                    c1442e.f19319a.f19353Z = true;
                }
            }
            int i10 = this.f20287t.f20227c;
            if (i10 == 0) {
                this.f20245D += write;
            }
            if (write == remaining2) {
                if (i10 != 0) {
                    if (byteBuffer2 != this.f20253M) {
                        z11 = false;
                    }
                    AbstractC1566a.m(z11);
                    this.f20246E = (this.f20247F * this.f20254N) + this.f20246E;
                }
                this.f20255O = null;
            }
        }
    }
}
