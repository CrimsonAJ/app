package j3;

import N3.AbstractC0250a;
import N3.InterfaceC0274z;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import c1.C0752a;
import com.google.android.gms.internal.measurement.C1;
import j2.C1435b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import k3.C1485a;
import k3.C1489e;
import k4.C1505e;
import k4.C1518s;
import k4.InterfaceC1506f;
import l3.C1556e;
import l4.AbstractC1566a;

/* renamed from: j3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1441D extends D.n implements InterfaceC1466q {

    /* renamed from: A, reason: collision with root package name */
    public final C1447c f19242A;

    /* renamed from: A0, reason: collision with root package name */
    public final boolean f19243A0;

    /* renamed from: B, reason: collision with root package name */
    public final z0 f19244B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f19245B0;

    /* renamed from: C, reason: collision with root package name */
    public final d0.w f19246C;

    /* renamed from: C0, reason: collision with root package name */
    public final C1461l f19247C0;

    /* renamed from: D, reason: collision with root package name */
    public final e0.c f19248D;

    /* renamed from: D0, reason: collision with root package name */
    public m4.v f19249D0;

    /* renamed from: E0, reason: collision with root package name */
    public C1446b0 f19250E0;

    /* renamed from: F0, reason: collision with root package name */
    public l0 f19251F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f19252G0;

    /* renamed from: H0, reason: collision with root package name */
    public long f19253H0;

    /* renamed from: X, reason: collision with root package name */
    public final long f19254X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f19255Z;

    /* renamed from: b, reason: collision with root package name */
    public final i4.w f19256b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f19257c;

    /* renamed from: d, reason: collision with root package name */
    public final H1.k f19258d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f19259e;

    /* renamed from: f, reason: collision with root package name */
    public final C1441D f19260f;

    /* renamed from: f0, reason: collision with root package name */
    public int f19261f0;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1449d[] f19262g;

    /* renamed from: g0, reason: collision with root package name */
    public int f19263g0;

    /* renamed from: h, reason: collision with root package name */
    public final i4.s f19264h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f19265h0;

    /* renamed from: i, reason: collision with root package name */
    public final l4.w f19266i;

    /* renamed from: i0, reason: collision with root package name */
    public int f19267i0;
    public final C1467s j;

    /* renamed from: j0, reason: collision with root package name */
    public N3.g0 f19268j0;

    /* renamed from: k, reason: collision with root package name */
    public final J f19269k;

    /* renamed from: k0, reason: collision with root package name */
    public n0 f19270k0;

    /* renamed from: l, reason: collision with root package name */
    public final l4.l f19271l;

    /* renamed from: l0, reason: collision with root package name */
    public C1446b0 f19272l0;

    /* renamed from: m, reason: collision with root package name */
    public final CopyOnWriteArraySet f19273m;

    /* renamed from: m0, reason: collision with root package name */
    public AudioTrack f19274m0;

    /* renamed from: n, reason: collision with root package name */
    public final C0 f19275n;

    /* renamed from: n0, reason: collision with root package name */
    public Object f19276n0;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f19277o;

    /* renamed from: o0, reason: collision with root package name */
    public Surface f19278o0;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f19279p;

    /* renamed from: p0, reason: collision with root package name */
    public SurfaceHolder f19280p0;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC0274z f19281q;

    /* renamed from: q0, reason: collision with root package name */
    public n4.k f19282q0;

    /* renamed from: r, reason: collision with root package name */
    public final C1489e f19283r;
    public boolean r0;

    /* renamed from: s, reason: collision with root package name */
    public final Looper f19284s;

    /* renamed from: s0, reason: collision with root package name */
    public TextureView f19285s0;

    /* renamed from: t, reason: collision with root package name */
    public final InterfaceC1506f f19286t;

    /* renamed from: t0, reason: collision with root package name */
    public final int f19287t0;

    /* renamed from: u, reason: collision with root package name */
    public final long f19288u;

    /* renamed from: u0, reason: collision with root package name */
    public l4.t f19289u0;

    /* renamed from: v, reason: collision with root package name */
    public final long f19290v;

    /* renamed from: v0, reason: collision with root package name */
    public final int f19291v0;

    /* renamed from: w, reason: collision with root package name */
    public final l4.u f19292w;

    /* renamed from: w0, reason: collision with root package name */
    public final C1556e f19293w0;

    /* renamed from: x, reason: collision with root package name */
    public final SurfaceHolderCallbackC1438A f19294x;

    /* renamed from: x0, reason: collision with root package name */
    public final float f19295x0;

    /* renamed from: y, reason: collision with root package name */
    public final C1439B f19296y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f19297y0;

    /* renamed from: z, reason: collision with root package name */
    public final C1 f19298z;

    /* renamed from: z0, reason: collision with root package name */
    public Y3.c f19299z0;

    static {
        K.a("goog.exo.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [H1.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.Object, j3.B] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.measurement.C1, java.lang.Object] */
    public C1441D(C1465p c1465p) {
        super(4);
        boolean z9;
        k3.l a5;
        boolean equals;
        this.f19258d = new Object();
        try {
            AbstractC1566a.A("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.2] [" + l4.y.f20557e + "]");
            Context applicationContext = c1465p.f19702a.getApplicationContext();
            this.f19259e = applicationContext;
            C1489e c1489e = new C1489e(c1465p.f19703b);
            this.f19283r = c1489e;
            this.f19293w0 = c1465p.f19709h;
            this.f19287t0 = c1465p.f19710i;
            this.f19297y0 = false;
            this.f19254X = c1465p.f19716p;
            SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A = new SurfaceHolderCallbackC1438A(this);
            this.f19294x = surfaceHolderCallbackC1438A;
            this.f19296y = new Object();
            Handler handler = new Handler(c1465p.f19708g);
            AbstractC1449d[] b9 = ((C1460k) c1465p.f19704c.get()).b(handler, surfaceHolderCallbackC1438A, surfaceHolderCallbackC1438A, surfaceHolderCallbackC1438A, surfaceHolderCallbackC1438A);
            this.f19262g = b9;
            if (b9.length > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            AbstractC1566a.m(z9);
            i4.s sVar = (i4.s) c1465p.f19706e.get();
            this.f19264h = sVar;
            this.f19281q = (InterfaceC0274z) c1465p.f19705d.get();
            InterfaceC1506f interfaceC1506f = (InterfaceC1506f) c1465p.f19707f.get();
            this.f19286t = interfaceC1506f;
            this.f19279p = c1465p.j;
            x0 x0Var = c1465p.f19711k;
            this.f19288u = c1465p.f19712l;
            this.f19290v = c1465p.f19713m;
            Looper looper = c1465p.f19708g;
            this.f19284s = looper;
            l4.u uVar = c1465p.f19703b;
            this.f19292w = uVar;
            this.f19260f = this;
            this.f19271l = new l4.l(looper, uVar, new C1467s(this));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f19273m = copyOnWriteArraySet;
            this.f19277o = new ArrayList();
            this.f19268j0 = new N3.g0();
            boolean z10 = true;
            i4.w wVar = new i4.w(new w0[b9.length], new i4.q[b9.length], G0.f19337b, null);
            this.f19256b = wVar;
            this.f19275n = new C0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            int i9 = 0;
            for (int i10 = 21; i9 < i10; i10 = 21) {
                int i11 = iArr[i9];
                AbstractC1566a.m(!false);
                InterfaceC1506f interfaceC1506f2 = interfaceC1506f;
                boolean z11 = z10;
                sparseBooleanArray.append(i11, z11);
                i9 += z11 ? 1 : 0;
                z10 = z11 ? 1 : 0;
                interfaceC1506f = interfaceC1506f2;
            }
            InterfaceC1506f interfaceC1506f3 = interfaceC1506f;
            AbstractC1566a.m(!false);
            sparseBooleanArray.append(29, z10);
            AbstractC1566a.m(!false);
            l4.f fVar = new l4.f(sparseBooleanArray);
            this.f19257c = new n0(fVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i12 = 0; i12 < fVar.f20498a.size(); i12++) {
                int a9 = fVar.a(i12);
                AbstractC1566a.m(!false);
                sparseBooleanArray2.append(a9, true);
            }
            AbstractC1566a.m(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC1566a.m(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC1566a.m(!false);
            this.f19270k0 = new n0(new l4.f(sparseBooleanArray2));
            this.f19266i = uVar.a(looper, null);
            C1467s c1467s = new C1467s(this);
            this.j = c1467s;
            this.f19251F0 = l0.h(wVar);
            c1489e.U(this, looper);
            int i13 = l4.y.f20553a;
            if (i13 < 31) {
                a5 = new k3.l();
            } else {
                a5 = AbstractC1472x.a(applicationContext, this, c1465p.f19717q);
            }
            this.f19269k = new J(b9, sVar, wVar, new C1458i(), interfaceC1506f3, this.Y, this.f19255Z, c1489e, x0Var, c1465p.f19714n, c1465p.f19715o, looper, uVar, c1467s, a5);
            this.f19295x0 = 1.0f;
            this.Y = 0;
            C1446b0 c1446b0 = C1446b0.f19533Z;
            this.f19272l0 = c1446b0;
            this.f19250E0 = c1446b0;
            int i14 = -1;
            this.f19252G0 = -1;
            if (i13 < 21) {
                AudioTrack audioTrack = this.f19274m0;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f19274m0.release();
                    this.f19274m0 = null;
                }
                if (this.f19274m0 == null) {
                    this.f19274m0 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f19291v0 = this.f19274m0.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f19259e.getSystemService("audio");
                if (audioManager != null) {
                    i14 = audioManager.generateAudioSessionId();
                }
                this.f19291v0 = i14;
            }
            this.f19299z0 = Y3.c.f8695b;
            this.f19243A0 = true;
            y(this.f19283r);
            Handler handler2 = new Handler(looper);
            C1489e c1489e2 = this.f19283r;
            C1518s c1518s = (C1518s) interfaceC1506f3;
            c1518s.getClass();
            c1489e2.getClass();
            C0752a c0752a = c1518s.f20100b;
            c0752a.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = c0752a.f11587a;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C1505e c1505e = (C1505e) it.next();
                if (c1505e.f20055b == c1489e2) {
                    c1505e.f20056c = true;
                    copyOnWriteArrayList.remove(c1505e);
                }
            }
            c0752a.f11587a.add(new C1505e(handler2, c1489e2));
            copyOnWriteArraySet.add(surfaceHolderCallbackC1438A);
            Context context = c1465p.f19702a;
            ?? obj = new Object();
            obj.f15187b = context.getApplicationContext();
            obj.f15188c = new RunnableC1443a(obj, handler, surfaceHolderCallbackC1438A);
            this.f19298z = obj;
            obj.d();
            this.f19242A = new C1447c(c1465p.f19702a, handler, surfaceHolderCallbackC1438A);
            int i15 = l4.y.f20553a;
            z0 z0Var = new z0(c1465p.f19702a, handler, surfaceHolderCallbackC1438A);
            this.f19244B = z0Var;
            int z12 = l4.y.z(this.f19293w0.f20392c);
            if (z0Var.f19775f != z12) {
                z0Var.f19775f = z12;
                z0Var.b();
                C1441D c1441d = z0Var.f19772c.f19226a;
                C1461l o02 = o0(c1441d.f19244B);
                if (!o02.equals(c1441d.f19247C0)) {
                    c1441d.f19247C0 = o02;
                    c1441d.f19271l.e(29, new C1435b(7, o02));
                }
            }
            Context context2 = c1465p.f19702a;
            d0.w wVar2 = new d0.w(6);
            this.f19246C = wVar2;
            Context context3 = c1465p.f19702a;
            e0.c cVar = new e0.c(6);
            this.f19248D = cVar;
            this.f19247C0 = o0(z0Var);
            this.f19249D0 = m4.v.f20829e;
            this.f19289u0 = l4.t.f20542c;
            i4.s sVar2 = this.f19264h;
            C1556e c1556e = this.f19293w0;
            i4.o oVar = (i4.o) sVar2;
            synchronized (oVar.f18586c) {
                equals = oVar.f18592i.equals(c1556e);
                oVar.f18592i = c1556e;
            }
            if (!equals) {
                oVar.f();
            }
            D0(1, 10, Integer.valueOf(this.f19291v0));
            D0(2, 10, Integer.valueOf(this.f19291v0));
            D0(1, 3, this.f19293w0);
            D0(2, 4, Integer.valueOf(this.f19287t0));
            D0(2, 5, 0);
            D0(1, 9, Boolean.valueOf(this.f19297y0));
            D0(2, 7, this.f19296y);
            D0(6, 8, this.f19296y);
            this.f19258d.d();
        } catch (Throwable th) {
            this.f19258d.d();
            throw th;
        }
    }

    public static C1461l o0(z0 z0Var) {
        int i9;
        z0Var.getClass();
        int i10 = l4.y.f20553a;
        AudioManager audioManager = z0Var.f19773d;
        if (i10 >= 28) {
            i9 = audioManager.getStreamMinVolume(z0Var.f19775f);
        } else {
            i9 = 0;
        }
        return new C1461l(0, i9, audioManager.getStreamMaxVolume(z0Var.f19775f));
    }

    public static long v0(l0 l0Var) {
        D0 d02 = new D0();
        C0 c02 = new C0();
        l0Var.f19667a.g(l0Var.f19668b.f5207a, c02);
        long j = l0Var.f19669c;
        if (j == -9223372036854775807L) {
            return l0Var.f19667a.m(c02.f19237c, d02, 0L).f19314m;
        }
        return c02.f19239e + j;
    }

    public static boolean w0(l0 l0Var) {
        if (l0Var.f19671e == 3 && l0Var.f19677l && l0Var.f19678m == 0) {
            return true;
        }
        return false;
    }

    public final void A0(int i9) {
        for (int i10 = i9 - 1; i10 >= 0; i10--) {
            this.f19277o.remove(i10);
        }
        N3.g0 g0Var = this.f19268j0;
        int[] iArr = g0Var.f5102b;
        int[] iArr2 = new int[iArr.length - i9];
        int i11 = 0;
        for (int i12 = 0; i12 < iArr.length; i12++) {
            int i13 = iArr[i12];
            if (i13 >= 0 && i13 < i9) {
                i11++;
            } else {
                int i14 = i12 - i11;
                if (i13 >= 0) {
                    i13 -= i9;
                }
                iArr2[i14] = i13;
            }
        }
        this.f19268j0 = new N3.g0(iArr2, new Random(g0Var.f5101a.nextLong()));
    }

    @Override // j3.r0
    public final void B(P5.S s9) {
        M0();
        ArrayList p02 = p0(s9);
        M0();
        E0(p02, -1, -9223372036854775807L, true);
    }

    public final void B0() {
        n4.k kVar = this.f19282q0;
        SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A = this.f19294x;
        if (kVar != null) {
            t0 q02 = q0(this.f19296y);
            AbstractC1566a.m(!q02.f19739g);
            q02.f19736d = 10000;
            AbstractC1566a.m(!q02.f19739g);
            q02.f19737e = null;
            q02.c();
            this.f19282q0.f21201a.remove(surfaceHolderCallbackC1438A);
            this.f19282q0 = null;
        }
        TextureView textureView = this.f19285s0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC1438A) {
                AbstractC1566a.P("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f19285s0.setSurfaceTextureListener(null);
            }
            this.f19285s0 = null;
        }
        SurfaceHolder surfaceHolder = this.f19280p0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC1438A);
            this.f19280p0 = null;
        }
    }

    @Override // j3.r0
    public final void C(SurfaceView surfaceView) {
        SurfaceHolder holder;
        M0();
        if (surfaceView instanceof m4.n) {
            B0();
            G0(surfaceView);
            F0(surfaceView.getHolder());
            return;
        }
        boolean z9 = surfaceView instanceof n4.k;
        SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A = this.f19294x;
        if (z9) {
            B0();
            this.f19282q0 = (n4.k) surfaceView;
            t0 q02 = q0(this.f19296y);
            AbstractC1566a.m(!q02.f19739g);
            q02.f19736d = 10000;
            n4.k kVar = this.f19282q0;
            AbstractC1566a.m(true ^ q02.f19739g);
            q02.f19737e = kVar;
            q02.c();
            this.f19282q0.f21201a.add(surfaceHolderCallbackC1438A);
            G0(this.f19282q0.getVideoSurface());
            F0(surfaceView.getHolder());
            return;
        }
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        M0();
        if (holder == null) {
            n0();
            return;
        }
        B0();
        this.r0 = true;
        this.f19280p0 = holder;
        holder.addCallback(surfaceHolderCallbackC1438A);
        Surface surface = holder.getSurface();
        if (surface != null && surface.isValid()) {
            G0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            z0(surfaceFrame.width(), surfaceFrame.height());
        } else {
            G0(null);
            z0(0, 0);
        }
    }

    public final void C0(int i9, long j, boolean z9) {
        C1489e c1489e = this.f19283r;
        int i10 = 1;
        if (!c1489e.f19936i) {
            C1485a O8 = c1489e.O();
            c1489e.f19936i = true;
            c1489e.T(O8, -1, new Z(14));
        }
        E0 e02 = this.f19251F0.f19667a;
        if (i9 >= 0 && (e02.p() || i9 < e02.o())) {
            this.f19261f0++;
            if (g()) {
                AbstractC1566a.P("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                G g9 = new G(this.f19251F0);
                g9.a(1);
                C1441D c1441d = this.j.f19730a;
                c1441d.f19266i.f20548a.post(new A6.r(c1441d, 14, g9));
                return;
            }
            if (e() != 1) {
                i10 = 2;
            }
            int z10 = z();
            l0 x02 = x0(this.f19251F0.f(i10), e02, y0(e02, i9, j));
            this.f19269k.f19363h.a(3, new I(e02, i9, l4.y.H(j))).b();
            K0(x02, 0, 1, true, true, 1, t0(x02), z10, z9);
            return;
        }
        throw new IllegalStateException();
    }

    @Override // j3.r0
    public final void D(SurfaceView surfaceView) {
        SurfaceHolder holder;
        M0();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        M0();
        if (holder != null && holder == this.f19280p0) {
            n0();
        }
    }

    public final void D0(int i9, int i10, Object obj) {
        for (AbstractC1449d abstractC1449d : this.f19262g) {
            if (abstractC1449d.f19584a == i9) {
                t0 q02 = q0(abstractC1449d);
                AbstractC1566a.m(!q02.f19739g);
                q02.f19736d = i10;
                AbstractC1566a.m(!q02.f19739g);
                q02.f19737e = obj;
                q02.c();
            }
        }
    }

    @Override // j3.r0
    public final void E(P5.S s9, int i9, long j) {
        M0();
        ArrayList p02 = p0(s9);
        M0();
        E0(p02, 0, j, false);
    }

    public final void E0(ArrayList arrayList, int i9, long j, boolean z9) {
        long j4;
        int i10;
        int i11;
        l0 f9;
        boolean z10;
        int i12 = i9;
        int u02 = u0();
        long T8 = T();
        this.f19261f0++;
        ArrayList arrayList2 = this.f19277o;
        if (!arrayList2.isEmpty()) {
            A0(arrayList2.size());
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            i0 i0Var = new i0((AbstractC0250a) arrayList.get(i13), this.f19279p);
            arrayList3.add(i0Var);
            arrayList2.add(i13, new C1440C(i0Var.f19648b, i0Var.f19647a.f5195o));
        }
        N3.g0 a5 = this.f19268j0.a(arrayList3.size());
        this.f19268j0 = a5;
        u0 u0Var = new u0(arrayList2, a5);
        boolean p9 = u0Var.p();
        int i14 = u0Var.f19746d;
        if (!p9 && i12 >= i14) {
            throw new IllegalStateException();
        }
        if (z9) {
            i12 = u0Var.a(this.f19255Z);
            j4 = -9223372036854775807L;
        } else {
            if (i12 == -1) {
                i10 = u02;
                j4 = T8;
                l0 x02 = x0(this.f19251F0, u0Var, y0(u0Var, i10, j4));
                i11 = x02.f19671e;
                if (i10 != -1 && i11 != 1) {
                    i11 = (!u0Var.p() || i10 >= i14) ? 4 : 2;
                }
                f9 = x02.f(i11);
                this.f19269k.f19363h.a(17, new F(arrayList3, this.f19268j0, i10, l4.y.H(j4))).b();
                if (this.f19251F0.f19668b.f5207a.equals(f9.f19668b.f5207a) && !this.f19251F0.f19667a.p()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                K0(f9, 0, 1, false, z10, 4, t0(f9), -1, false);
            }
            j4 = j;
        }
        i10 = i12;
        l0 x022 = x0(this.f19251F0, u0Var, y0(u0Var, i10, j4));
        i11 = x022.f19671e;
        if (i10 != -1) {
            if (u0Var.p()) {
            }
        }
        f9 = x022.f(i11);
        this.f19269k.f19363h.a(17, new F(arrayList3, this.f19268j0, i10, l4.y.H(j4))).b();
        if (this.f19251F0.f19668b.f5207a.equals(f9.f19668b.f5207a)) {
        }
        z10 = false;
        K0(f9, 0, 1, false, z10, 4, t0(f9), -1, false);
    }

    @Override // j3.r0
    public final int F() {
        M0();
        return this.f19251F0.f19678m;
    }

    public final void F0(SurfaceHolder surfaceHolder) {
        this.r0 = false;
        this.f19280p0 = surfaceHolder;
        surfaceHolder.addCallback(this.f19294x);
        Surface surface = this.f19280p0.getSurface();
        if (surface != null && surface.isValid()) {
            Rect surfaceFrame = this.f19280p0.getSurfaceFrame();
            z0(surfaceFrame.width(), surfaceFrame.height());
        } else {
            z0(0, 0);
        }
    }

    public final void G0(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z9 = false;
        for (AbstractC1449d abstractC1449d : this.f19262g) {
            if (abstractC1449d.f19584a == 2) {
                t0 q02 = q0(abstractC1449d);
                AbstractC1566a.m(!q02.f19739g);
                q02.f19736d = 1;
                AbstractC1566a.m(true ^ q02.f19739g);
                q02.f19737e = obj;
                q02.c();
                arrayList.add(q02);
            }
        }
        Object obj2 = this.f19276n0;
        if (obj2 != null && obj2 != obj) {
            try {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj3 = arrayList.get(i9);
                    i9++;
                    ((t0) obj3).a(this.f19254X);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z9 = true;
            }
            Object obj4 = this.f19276n0;
            Surface surface = this.f19278o0;
            if (obj4 == surface) {
                surface.release();
                this.f19278o0 = null;
            }
        }
        this.f19276n0 = obj;
        if (z9) {
            H0(new C1462m(2, new RuntimeException("Detaching surface timed out."), 1003));
        }
    }

    @Override // j3.r0
    public final long H() {
        M0();
        if (g()) {
            l0 l0Var = this.f19251F0;
            N3.A a5 = l0Var.f19668b;
            Object obj = a5.f5207a;
            E0 e02 = l0Var.f19667a;
            C0 c02 = this.f19275n;
            e02.g(obj, c02);
            return l4.y.T(c02.a(a5.f5208b, a5.f5209c));
        }
        E0 I4 = I();
        if (I4.p()) {
            return -9223372036854775807L;
        }
        return l4.y.T(I4.m(z(), (D0) this.f1707a, 0L).f19315n);
    }

    public final void H0(C1462m c1462m) {
        l0 l0Var = this.f19251F0;
        l0 a5 = l0Var.a(l0Var.f19668b);
        a5.f19681p = a5.f19683r;
        a5.f19682q = 0L;
        boolean z9 = true;
        l0 f9 = a5.f(1);
        if (c1462m != null) {
            f9 = f9.d(c1462m);
        }
        l0 l0Var2 = f9;
        this.f19261f0++;
        l4.w wVar = this.f19269k.f19363h;
        wVar.getClass();
        l4.v b9 = l4.w.b();
        b9.f20546a = wVar.f20548a.obtainMessage(6);
        b9.b();
        if (!l0Var2.f19667a.p() || this.f19251F0.f19667a.p()) {
            z9 = false;
        }
        K0(l0Var2, 0, 1, false, z9, 4, t0(l0Var2), -1, false);
    }

    @Override // j3.r0
    public final E0 I() {
        M0();
        return this.f19251F0.f19667a;
    }

    public final void I0() {
        n0 n0Var = this.f19270k0;
        n0 o9 = l4.y.o(this.f19260f, this.f19257c);
        this.f19270k0 = o9;
        if (!o9.equals(n0Var)) {
            this.f19271l.c(13, new C1467s(this));
        }
    }

    @Override // j3.r0
    public final Looper J() {
        return this.f19284s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void J0(int i9, int i10, boolean z9) {
        ?? r42;
        int i11 = 0;
        if (z9 && i9 != -1) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        if (r42 != 0 && i9 != 1) {
            i11 = 1;
        }
        l0 l0Var = this.f19251F0;
        if (l0Var.f19677l == r42 && l0Var.f19678m == i11) {
            return;
        }
        this.f19261f0++;
        l0 c3 = l0Var.c(i11, r42);
        l4.w wVar = this.f19269k.f19363h;
        wVar.getClass();
        l4.v b9 = l4.w.b();
        b9.f20546a = wVar.f20548a.obtainMessage(1, r42, i11);
        b9.b();
        K0(c3, 0, i10, false, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03db A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0(final j3.l0 r34, final int r35, final int r36, boolean r37, boolean r38, int r39, long r40, int r42, boolean r43) {
        /*
            Method dump skipped, instructions count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1441D.K0(j3.l0, int, int, boolean, boolean, int, long, int, boolean):void");
    }

    @Override // j3.r0
    public final boolean L() {
        M0();
        return this.f19255Z;
    }

    public final void L0() {
        int e8 = e();
        e0.c cVar = this.f19248D;
        d0.w wVar = this.f19246C;
        if (e8 != 1) {
            if (e8 != 2 && e8 != 3) {
                if (e8 != 4) {
                    throw new IllegalStateException();
                }
            } else {
                M0();
                boolean z9 = this.f19251F0.f19680o;
                m();
                wVar.getClass();
                m();
                cVar.getClass();
                return;
            }
        }
        wVar.getClass();
        cVar.getClass();
    }

    @Override // j3.r0
    public final i4.v M() {
        M0();
        return ((i4.o) this.f19264h).d();
    }

    public final void M0() {
        IllegalStateException illegalStateException;
        H1.k kVar = this.f19258d;
        synchronized (kVar) {
            boolean z9 = false;
            while (!kVar.f2964a) {
                try {
                    kVar.wait();
                } catch (InterruptedException unused) {
                    z9 = true;
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f19284s.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f19284s.getThread().getName();
            int i9 = l4.y.f20553a;
            Locale locale = Locale.US;
            String str = "Player is accessed on the wrong thread.\nCurrent thread: '" + name + "'\nExpected thread: '" + name2 + "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread";
            if (!this.f19243A0) {
                if (this.f19245B0) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                AbstractC1566a.Q("ExoPlayerImpl", str, illegalStateException);
                this.f19245B0 = true;
                return;
            }
            throw new IllegalStateException(str);
        }
    }

    @Override // D.n, j3.r0
    public final long N() {
        M0();
        if (this.f19251F0.f19667a.p()) {
            return this.f19253H0;
        }
        l0 l0Var = this.f19251F0;
        if (l0Var.f19676k.f5210d != l0Var.f19668b.f5210d) {
            return l4.y.T(l0Var.f19667a.m(z(), (D0) this.f1707a, 0L).f19315n);
        }
        long j = l0Var.f19681p;
        if (this.f19251F0.f19676k.a()) {
            l0 l0Var2 = this.f19251F0;
            C0 g9 = l0Var2.f19667a.g(l0Var2.f19676k.f5207a, this.f19275n);
            long d9 = g9.d(this.f19251F0.f19676k.f5208b);
            if (d9 == Long.MIN_VALUE) {
                j = g9.f19238d;
            } else {
                j = d9;
            }
        }
        l0 l0Var3 = this.f19251F0;
        E0 e02 = l0Var3.f19667a;
        Object obj = l0Var3.f19676k.f5207a;
        C0 c02 = this.f19275n;
        e02.g(obj, c02);
        return l4.y.T(j + c02.f19239e);
    }

    @Override // j3.r0
    public final void O(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        M0();
        if (textureView == null) {
            n0();
            return;
        }
        B0();
        this.f19285s0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            AbstractC1566a.P("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f19294x);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            G0(null);
            z0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            G0(surface);
            this.f19278o0 = surface;
            z0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // j3.r0
    public final void P(i4.v vVar) {
        M0();
        i4.s sVar = this.f19264h;
        sVar.getClass();
        i4.o oVar = (i4.o) sVar;
        if (vVar.equals(oVar.d())) {
            return;
        }
        if (vVar instanceof i4.h) {
            oVar.i((i4.h) vVar);
        }
        i4.g gVar = new i4.g(oVar.d());
        gVar.c(vVar);
        oVar.i(new i4.h(gVar));
        this.f19271l.e(19, new C1435b(2, vVar));
    }

    @Override // j3.r0
    public final void Q(long j, int i9) {
        M0();
        C0(i9, j, false);
    }

    @Override // j3.r0
    public final C1446b0 R() {
        M0();
        return this.f19272l0;
    }

    @Override // j3.r0
    public final long T() {
        M0();
        return l4.y.T(t0(this.f19251F0));
    }

    @Override // j3.r0
    public final long U() {
        M0();
        return this.f19288u;
    }

    @Override // j3.r0
    public final void a(m0 m0Var) {
        M0();
        if (this.f19251F0.f19679n.equals(m0Var)) {
            return;
        }
        l0 e8 = this.f19251F0.e(m0Var);
        this.f19261f0++;
        this.f19269k.f19363h.a(4, m0Var).b();
        K0(e8, 0, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // j3.r0
    public final void b() {
        int i9;
        M0();
        boolean m9 = m();
        int i10 = 2;
        int c3 = this.f19242A.c(2, m9);
        if (m9 && c3 != 1) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        J0(c3, i9, m9);
        l0 l0Var = this.f19251F0;
        if (l0Var.f19671e != 1) {
            return;
        }
        l0 d9 = l0Var.d(null);
        if (d9.f19667a.p()) {
            i10 = 4;
        }
        l0 f9 = d9.f(i10);
        this.f19261f0++;
        l4.w wVar = this.f19269k.f19363h;
        wVar.getClass();
        l4.v b9 = l4.w.b();
        b9.f20546a = wVar.f20548a.obtainMessage(0);
        b9.b();
        K0(f9, 1, 1, false, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // j3.r0
    public final m0 c() {
        M0();
        return this.f19251F0.f19679n;
    }

    @Override // j3.r0
    public final C1462m d() {
        M0();
        return this.f19251F0.f19672f;
    }

    @Override // j3.r0
    public final int e() {
        M0();
        return this.f19251F0.f19671e;
    }

    @Override // j3.r0
    public final void f(boolean z9) {
        M0();
        int c3 = this.f19242A.c(e(), z9);
        int i9 = 1;
        if (z9 && c3 != 1) {
            i9 = 2;
        }
        J0(c3, i9, z9);
    }

    @Override // j3.r0
    public final boolean g() {
        M0();
        return this.f19251F0.f19668b.a();
    }

    @Override // j3.r0
    public final void h(int i9) {
        M0();
        if (this.Y != i9) {
            this.Y = i9;
            l4.w wVar = this.f19269k.f19363h;
            wVar.getClass();
            l4.v b9 = l4.w.b();
            b9.f20546a = wVar.f20548a.obtainMessage(11, i9, 0);
            b9.b();
            C1468t c1468t = new C1468t(i9, 0);
            l4.l lVar = this.f19271l;
            lVar.c(8, c1468t);
            I0();
            lVar.b();
        }
    }

    @Override // D.n
    public final void h0() {
        M0();
        C0(z(), -9223372036854775807L, true);
    }

    @Override // j3.r0
    public final long i() {
        M0();
        return this.f19290v;
    }

    @Override // j3.r0
    public final int j() {
        M0();
        return this.Y;
    }

    @Override // D.n, j3.r0
    public final long k() {
        M0();
        if (g()) {
            l0 l0Var = this.f19251F0;
            E0 e02 = l0Var.f19667a;
            Object obj = l0Var.f19668b.f5207a;
            C0 c02 = this.f19275n;
            e02.g(obj, c02);
            l0 l0Var2 = this.f19251F0;
            if (l0Var2.f19669c == -9223372036854775807L) {
                return l4.y.T(l0Var2.f19667a.m(z(), (D0) this.f1707a, 0L).f19314m);
            }
            return l4.y.T(this.f19251F0.f19669c) + l4.y.T(c02.f19239e);
        }
        return T();
    }

    @Override // j3.r0
    public final n0 l() {
        M0();
        return this.f19270k0;
    }

    @Override // j3.r0
    public final boolean m() {
        M0();
        return this.f19251F0.f19677l;
    }

    public final C1446b0 m0() {
        E0 I4 = I();
        if (I4.p()) {
            return this.f19250E0;
        }
        Y y9 = I4.m(z(), (D0) this.f1707a, 0L).f19305c;
        C1444a0 a5 = this.f19250E0.a();
        C1446b0 c1446b0 = y9.f19494d;
        if (c1446b0 != null) {
            CharSequence charSequence = c1446b0.f19540a;
            if (charSequence != null) {
                a5.f19506a = charSequence;
            }
            CharSequence charSequence2 = c1446b0.f19541b;
            if (charSequence2 != null) {
                a5.f19507b = charSequence2;
            }
            CharSequence charSequence3 = c1446b0.f19542c;
            if (charSequence3 != null) {
                a5.f19508c = charSequence3;
            }
            CharSequence charSequence4 = c1446b0.f19543d;
            if (charSequence4 != null) {
                a5.f19509d = charSequence4;
            }
            CharSequence charSequence5 = c1446b0.f19544e;
            if (charSequence5 != null) {
                a5.f19510e = charSequence5;
            }
            CharSequence charSequence6 = c1446b0.f19545f;
            if (charSequence6 != null) {
                a5.f19511f = charSequence6;
            }
            CharSequence charSequence7 = c1446b0.f19546g;
            if (charSequence7 != null) {
                a5.f19512g = charSequence7;
            }
            v0 v0Var = c1446b0.f19547h;
            if (v0Var != null) {
                a5.f19513h = v0Var;
            }
            v0 v0Var2 = c1446b0.f19548i;
            if (v0Var2 != null) {
                a5.f19514i = v0Var2;
            }
            byte[] bArr = c1446b0.j;
            if (bArr != null) {
                a5.j = (byte[]) bArr.clone();
                a5.f19515k = c1446b0.f19549k;
            }
            Uri uri = c1446b0.f19550l;
            if (uri != null) {
                a5.f19516l = uri;
            }
            Integer num = c1446b0.f19551m;
            if (num != null) {
                a5.f19517m = num;
            }
            Integer num2 = c1446b0.f19552n;
            if (num2 != null) {
                a5.f19518n = num2;
            }
            Integer num3 = c1446b0.f19553o;
            if (num3 != null) {
                a5.f19519o = num3;
            }
            Boolean bool = c1446b0.f19554p;
            if (bool != null) {
                a5.f19520p = bool;
            }
            Integer num4 = c1446b0.f19555q;
            if (num4 != null) {
                a5.f19521q = num4;
            }
            Integer num5 = c1446b0.f19556r;
            if (num5 != null) {
                a5.f19521q = num5;
            }
            Integer num6 = c1446b0.f19557s;
            if (num6 != null) {
                a5.f19522r = num6;
            }
            Integer num7 = c1446b0.f19558t;
            if (num7 != null) {
                a5.f19523s = num7;
            }
            Integer num8 = c1446b0.f19559u;
            if (num8 != null) {
                a5.f19524t = num8;
            }
            Integer num9 = c1446b0.f19560v;
            if (num9 != null) {
                a5.f19525u = num9;
            }
            Integer num10 = c1446b0.f19561w;
            if (num10 != null) {
                a5.f19526v = num10;
            }
            CharSequence charSequence8 = c1446b0.f19562x;
            if (charSequence8 != null) {
                a5.f19527w = charSequence8;
            }
            CharSequence charSequence9 = c1446b0.f19563y;
            if (charSequence9 != null) {
                a5.f19528x = charSequence9;
            }
            CharSequence charSequence10 = c1446b0.f19564z;
            if (charSequence10 != null) {
                a5.f19529y = charSequence10;
            }
            Integer num11 = c1446b0.f19535A;
            if (num11 != null) {
                a5.f19530z = num11;
            }
            Integer num12 = c1446b0.f19536B;
            if (num12 != null) {
                a5.f19501A = num12;
            }
            CharSequence charSequence11 = c1446b0.f19537C;
            if (charSequence11 != null) {
                a5.f19502B = charSequence11;
            }
            CharSequence charSequence12 = c1446b0.f19538D;
            if (charSequence12 != null) {
                a5.f19503C = charSequence12;
            }
            CharSequence charSequence13 = c1446b0.f19539X;
            if (charSequence13 != null) {
                a5.f19504D = charSequence13;
            }
            Bundle bundle = c1446b0.Y;
            if (bundle != null) {
                a5.f19505E = bundle;
            }
        }
        return new C1446b0(a5);
    }

    @Override // j3.r0
    public final void n(boolean z9) {
        M0();
        if (this.f19255Z != z9) {
            this.f19255Z = z9;
            l4.w wVar = this.f19269k.f19363h;
            wVar.getClass();
            l4.v b9 = l4.w.b();
            b9.f20546a = wVar.f20548a.obtainMessage(12, z9 ? 1 : 0, 0);
            b9.b();
            C1470v c1470v = new C1470v(0, z9);
            l4.l lVar = this.f19271l;
            lVar.c(9, c1470v);
            I0();
            lVar.b();
        }
    }

    public final void n0() {
        M0();
        B0();
        G0(null);
        z0(0, 0);
    }

    public final ArrayList p0(P5.S s9) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < s9.f5928d; i9++) {
            arrayList.add(this.f19281q.b((Y) s9.get(i9)));
        }
        return arrayList;
    }

    @Override // j3.r0
    public final G0 q() {
        M0();
        return this.f19251F0.f19675i.f18653d;
    }

    public final t0 q0(s0 s0Var) {
        int u02 = u0();
        E0 e02 = this.f19251F0.f19667a;
        if (u02 == -1) {
            u02 = 0;
        }
        J j = this.f19269k;
        return new t0(j, s0Var, e02, u02, this.f19292w, j.j);
    }

    @Override // j3.r0
    public final void r() {
        M0();
    }

    public final int r0() {
        M0();
        if (g()) {
            return this.f19251F0.f19668b.f5208b;
        }
        return -1;
    }

    @Override // j3.r0
    public final void s() {
        boolean z9;
        boolean z10;
        int u02;
        Pair y02;
        M0();
        int min = Math.min(Integer.MAX_VALUE, this.f19277o.size());
        ArrayList arrayList = this.f19277o;
        if (min >= 0 && min <= arrayList.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        int z11 = z();
        E0 I4 = I();
        int size = arrayList.size();
        this.f19261f0++;
        A0(min);
        u0 u0Var = new u0(arrayList, this.f19268j0);
        l0 l0Var = this.f19251F0;
        long k5 = k();
        if (!I4.p() && !u0Var.p()) {
            y02 = I4.i((D0) this.f1707a, this.f19275n, z(), l4.y.H(k5));
            Object obj = y02.first;
            if (u0Var.b(obj) == -1) {
                Object G8 = J.G((D0) this.f1707a, this.f19275n, this.Y, this.f19255Z, obj, I4, u0Var);
                if (G8 != null) {
                    C0 c02 = this.f19275n;
                    u0Var.g(G8, c02);
                    int i9 = c02.f19237c;
                    D0 d02 = (D0) this.f1707a;
                    u0Var.m(i9, d02, 0L);
                    y02 = y0(u0Var, i9, l4.y.T(d02.f19314m));
                } else {
                    y02 = y0(u0Var, -1, -9223372036854775807L);
                }
            }
        } else {
            if (!I4.p() && u0Var.p()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                u02 = -1;
            } else {
                u02 = u0();
            }
            if (z10) {
                k5 = -9223372036854775807L;
            }
            y02 = y0(u0Var, u02, k5);
        }
        l0 x02 = x0(l0Var, u0Var, y02);
        int i10 = x02.f19671e;
        if (i10 != 1 && i10 != 4 && min > 0 && min == size && z11 >= x02.f19667a.o()) {
            x02 = x02.f(4);
        }
        N3.g0 g0Var = this.f19268j0;
        l4.w wVar = this.f19269k.f19363h;
        wVar.getClass();
        l4.v b9 = l4.w.b();
        b9.f20546a = wVar.f20548a.obtainMessage(20, 0, min, g0Var);
        b9.b();
        K0(x02, 0, 1, false, !x02.f19668b.f5207a.equals(this.f19251F0.f19668b.f5207a), 4, t0(x02), -1, false);
    }

    public final int s0() {
        M0();
        if (g()) {
            return this.f19251F0.f19668b.f5209c;
        }
        return -1;
    }

    @Override // j3.r0
    public final void stop() {
        M0();
        M0();
        this.f19242A.c(1, m());
        H0(null);
        this.f19299z0 = new Y3.c(this.f19251F0.f19683r, P5.S.f5926e);
    }

    @Override // D.n, j3.r0
    public final int t() {
        M0();
        if (this.f19251F0.f19667a.p()) {
            return 0;
        }
        l0 l0Var = this.f19251F0;
        return l0Var.f19667a.b(l0Var.f19668b.f5207a);
    }

    public final long t0(l0 l0Var) {
        if (l0Var.f19667a.p()) {
            return l4.y.H(this.f19253H0);
        }
        if (l0Var.f19668b.a()) {
            return l0Var.f19683r;
        }
        E0 e02 = l0Var.f19667a;
        N3.A a5 = l0Var.f19668b;
        long j = l0Var.f19683r;
        Object obj = a5.f5207a;
        C0 c02 = this.f19275n;
        e02.g(obj, c02);
        return j + c02.f19239e;
    }

    @Override // j3.r0
    public final Y3.c u() {
        M0();
        return this.f19299z0;
    }

    public final int u0() {
        if (this.f19251F0.f19667a.p()) {
            return this.f19252G0;
        }
        l0 l0Var = this.f19251F0;
        return l0Var.f19667a.g(l0Var.f19668b.f5207a, this.f19275n).f19237c;
    }

    @Override // j3.r0
    public final void v(TextureView textureView) {
        M0();
        if (textureView != null && textureView == this.f19285s0) {
            n0();
        }
    }

    @Override // j3.r0
    public final m4.v w() {
        M0();
        return this.f19249D0;
    }

    @Override // j3.r0
    public final void x(p0 p0Var) {
        p0Var.getClass();
        this.f19271l.d(p0Var);
    }

    public final l0 x0(l0 l0Var, E0 e02, Pair pair) {
        boolean z9;
        N3.A a5;
        N3.n0 n0Var;
        i4.w wVar;
        List list;
        long j;
        if (!e02.p() && pair == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC1566a.h(z9);
        E0 e03 = l0Var.f19667a;
        l0 g9 = l0Var.g(e02);
        if (e02.p()) {
            N3.A a9 = l0.f19666s;
            long H8 = l4.y.H(this.f19253H0);
            l0 a10 = g9.b(a9, H8, H8, H8, 0L, N3.n0.f5169d, this.f19256b, P5.S.f5926e).a(a9);
            a10.f19681p = a10.f19683r;
            return a10;
        }
        Object obj = g9.f19668b.f5207a;
        int i9 = l4.y.f20553a;
        boolean equals = obj.equals(pair.first);
        if (!equals) {
            a5 = new N3.A(pair.first);
        } else {
            a5 = g9.f19668b;
        }
        long longValue = ((Long) pair.second).longValue();
        long H9 = l4.y.H(k());
        if (!e03.p()) {
            H9 -= e03.g(obj, this.f19275n).f19239e;
        }
        if (!equals || longValue < H9) {
            N3.A a11 = a5;
            AbstractC1566a.m(!a11.a());
            if (!equals) {
                n0Var = N3.n0.f5169d;
            } else {
                n0Var = g9.f19674h;
            }
            N3.n0 n0Var2 = n0Var;
            if (!equals) {
                wVar = this.f19256b;
            } else {
                wVar = g9.f19675i;
            }
            i4.w wVar2 = wVar;
            if (!equals) {
                P5.D d9 = P5.F.f5901b;
                list = P5.S.f5926e;
            } else {
                list = g9.j;
            }
            l0 a12 = g9.b(a11, longValue, longValue, longValue, 0L, n0Var2, wVar2, list).a(a11);
            a12.f19681p = longValue;
            return a12;
        }
        if (longValue == H9) {
            int b9 = e02.b(g9.f19676k.f5207a);
            if (b9 != -1 && e02.f(b9, this.f19275n, false).f19237c == e02.g(a5.f5207a, this.f19275n).f19237c) {
                return g9;
            }
            e02.g(a5.f5207a, this.f19275n);
            if (a5.a()) {
                j = this.f19275n.a(a5.f5208b, a5.f5209c);
            } else {
                j = this.f19275n.f19238d;
            }
            N3.A a13 = a5;
            l0 a14 = g9.b(a13, g9.f19683r, g9.f19683r, g9.f19670d, j - g9.f19683r, g9.f19674h, g9.f19675i, g9.j).a(a13);
            a14.f19681p = j;
            return a14;
        }
        N3.A a15 = a5;
        AbstractC1566a.m(!a15.a());
        long max = Math.max(0L, g9.f19682q - (longValue - H9));
        long j4 = g9.f19681p;
        if (g9.f19676k.equals(g9.f19668b)) {
            j4 = longValue + max;
        }
        l0 b10 = g9.b(a15, longValue, longValue, longValue, max, g9.f19674h, g9.f19675i, g9.j);
        b10.f19681p = j4;
        return b10;
    }

    @Override // j3.r0
    public final void y(p0 p0Var) {
        p0Var.getClass();
        this.f19271l.a(p0Var);
    }

    public final Pair y0(E0 e02, int i9, long j) {
        if (e02.p()) {
            this.f19252G0 = i9;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f19253H0 = j;
            return null;
        }
        if (i9 == -1 || i9 >= e02.o()) {
            i9 = e02.a(this.f19255Z);
            j = l4.y.T(e02.m(i9, (D0) this.f1707a, 0L).f19314m);
        }
        return e02.i((D0) this.f1707a, this.f19275n, i9, l4.y.H(j));
    }

    @Override // j3.r0
    public final int z() {
        M0();
        int u02 = u0();
        if (u02 == -1) {
            return 0;
        }
        return u02;
    }

    public final void z0(final int i9, final int i10) {
        l4.t tVar = this.f19289u0;
        if (i9 == tVar.f20543a && i10 == tVar.f20544b) {
            return;
        }
        this.f19289u0 = new l4.t(i9, i10);
        this.f19271l.e(24, new l4.i() { // from class: j3.u
            @Override // l4.i
            public final void invoke(Object obj) {
                ((p0) obj).F(i9, i10);
            }
        });
    }
}
