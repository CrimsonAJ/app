package o3;

import D.n;
import F4.y;
import O5.i;
import P5.F;
import P5.S;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseBooleanArray;
import android.view.SurfaceView;
import android.view.TextureView;
import com.anilab.android.ui.player.PlayerActivity;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.common.api.internal.BasePendingResult;
import i.G;
import i4.v;
import j2.C1435b;
import j3.C0;
import j3.C1441D;
import j3.C1446b0;
import j3.C1462m;
import j3.C1468t;
import j3.C1470v;
import j3.C1473y;
import j3.D0;
import j3.E0;
import j3.F0;
import j3.G0;
import j3.K;
import j3.L;
import j3.M;
import j3.U;
import j3.X;
import j3.Y;
import j3.m0;
import j3.n0;
import j3.p0;
import j3.q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import k4.C1499E;
import l4.AbstractC1566a;
import l4.l;
import l4.u;
import org.json.JSONException;
import org.json.JSONObject;
import t4.k;
import t4.o;
import t4.p;
import u4.C2077b;
import u4.C2079d;
import v4.h;
import v4.j;
import v4.m;
import v4.t;

/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: A, reason: collision with root package name */
    public static final n0 f21558A;

    /* renamed from: B, reason: collision with root package name */
    public static final long[] f21559B;

    /* renamed from: b, reason: collision with root package name */
    public final C2077b f21560b;

    /* renamed from: c, reason: collision with root package name */
    public final Q6.f f21561c;

    /* renamed from: d, reason: collision with root package name */
    public final long f21562d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21563e;

    /* renamed from: f, reason: collision with root package name */
    public final C1499E f21564f;

    /* renamed from: g, reason: collision with root package name */
    public final C0 f21565g;

    /* renamed from: h, reason: collision with root package name */
    public final d f21566h;

    /* renamed from: i, reason: collision with root package name */
    public final c f21567i;
    public final l j;

    /* renamed from: k, reason: collision with root package name */
    public PlayerActivity f21568k;

    /* renamed from: l, reason: collision with root package name */
    public final C1499E f21569l;

    /* renamed from: m, reason: collision with root package name */
    public final C1499E f21570m;

    /* renamed from: n, reason: collision with root package name */
    public final C1499E f21571n;

    /* renamed from: o, reason: collision with root package name */
    public h f21572o;

    /* renamed from: p, reason: collision with root package name */
    public g f21573p;

    /* renamed from: q, reason: collision with root package name */
    public G0 f21574q;

    /* renamed from: r, reason: collision with root package name */
    public n0 f21575r;

    /* renamed from: s, reason: collision with root package name */
    public int f21576s;

    /* renamed from: t, reason: collision with root package name */
    public int f21577t;

    /* renamed from: u, reason: collision with root package name */
    public long f21578u;

    /* renamed from: v, reason: collision with root package name */
    public int f21579v;

    /* renamed from: w, reason: collision with root package name */
    public int f21580w;

    /* renamed from: x, reason: collision with root package name */
    public long f21581x;

    /* renamed from: y, reason: collision with root package name */
    public q0 f21582y;

    /* renamed from: z, reason: collision with root package name */
    public C1446b0 f21583z;

    static {
        K.a("goog.exo.cast");
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        int[] iArr = {1, 2, 3, 4, 10, 15, 13, 16, 17, 18, 19, 31, 20, 30};
        for (int i9 = 0; i9 < 14; i9++) {
            int i10 = iArr[i9];
            AbstractC1566a.m(!false);
            sparseBooleanArray.append(i10, true);
        }
        AbstractC1566a.m(true);
        f21558A = new n0(new l4.f(sparseBooleanArray));
        f21559B = new long[0];
    }

    public e(C2077b c2077b, Q6.f fVar) {
        super(4);
        h hVar;
        this.f21560b = c2077b;
        this.f21561c = fVar;
        this.f21562d = 10000L;
        this.f21563e = 10000L;
        this.f21564f = new C1499E(fVar);
        this.f21565g = new C0();
        d dVar = new d(this);
        this.f21566h = dVar;
        this.f21567i = new c(this, 3);
        this.j = new l(Looper.getMainLooper(), u.f20545a, new C1694b(this, 6));
        this.f21569l = new C1499E(Boolean.FALSE);
        this.f21570m = new C1499E((Object) 0);
        this.f21571n = new C1499E(m0.f19693d);
        this.f21576s = 1;
        this.f21573p = g.f21590h;
        this.f21583z = C1446b0.f19533Z;
        this.f21574q = G0.f19337b;
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        l4.f fVar2 = f21558A.f19699a;
        for (int i9 = 0; i9 < fVar2.f20498a.size(); i9++) {
            int a5 = fVar2.a(i9);
            AbstractC1566a.m(!false);
            sparseBooleanArray.append(a5, true);
        }
        AbstractC1566a.m(true);
        this.f21575r = new n0(new l4.f(sparseBooleanArray));
        this.f21580w = -1;
        this.f21581x = -9223372036854775807L;
        c2077b.getClass();
        y.d();
        u4.h hVar2 = c2077b.f23648c;
        hVar2.a(dVar);
        C2079d c3 = hVar2.c();
        if (c3 != null) {
            y.d();
            hVar = c3.j;
        } else {
            hVar = null;
        }
        q0(hVar);
        t0();
    }

    public static int m0(h hVar, E0 e02) {
        t4.n f9;
        int i9;
        if (hVar != null) {
            y.d();
            p d9 = hVar.d();
            if (d9 == null) {
                f9 = null;
            } else {
                f9 = d9.f(d9.f23226c);
            }
            if (f9 != null) {
                i9 = e02.b(Integer.valueOf(f9.f23215b));
            } else {
                i9 = -1;
            }
            if (i9 != -1) {
                return i9;
            }
        }
        return 0;
    }

    @Override // j3.r0
    public final void B(S s9) {
        E(s9, 0, -9223372036854775807L);
    }

    @Override // j3.r0
    public final void E(S s9, int i9, long j) {
        long j4;
        long j9;
        int i10;
        int i11;
        int i12;
        t4.n[] nVarArr;
        int i13;
        int i14;
        String str;
        String str2;
        String str3;
        int intValue = ((Integer) this.f21570m.f19985b).intValue();
        if (this.f21572o != null && !s9.isEmpty()) {
            if (j == -9223372036854775807L) {
                j4 = 0;
            } else {
                j4 = j;
            }
            if (i9 == -1) {
                i10 = z();
                j9 = T();
            } else {
                j9 = j4;
                i10 = i9;
            }
            if (!this.f21573p.p()) {
                this.f21582y = n0();
            }
            int i15 = s9.f5928d;
            t4.n[] nVarArr2 = new t4.n[i15];
            int i16 = 0;
            while (i16 < i15) {
                Y y9 = (Y) s9.get(i16);
                this.f21561c.getClass();
                U u9 = y9.f19492b;
                u9.getClass();
                if (u9.f19476b != null) {
                    if (l4.n.j(u9.f19476b)) {
                        i12 = 3;
                    } else {
                        i12 = 1;
                    }
                    k kVar = new k(i12);
                    C1446b0 c1446b0 = y9.f19494d;
                    CharSequence charSequence = c1446b0.f19540a;
                    if (charSequence != null) {
                        kVar.g("com.google.android.gms.cast.metadata.TITLE", charSequence.toString());
                    }
                    CharSequence charSequence2 = c1446b0.f19545f;
                    if (charSequence2 != null) {
                        kVar.g("com.google.android.gms.cast.metadata.SUBTITLE", charSequence2.toString());
                    }
                    CharSequence charSequence3 = c1446b0.f19541b;
                    if (charSequence3 != null) {
                        kVar.g("com.google.android.gms.cast.metadata.ARTIST", charSequence3.toString());
                    }
                    CharSequence charSequence4 = c1446b0.f19543d;
                    if (charSequence4 != null) {
                        kVar.g("com.google.android.gms.cast.metadata.ALBUM_ARTIST", charSequence4.toString());
                    }
                    CharSequence charSequence5 = c1446b0.f19542c;
                    if (charSequence5 != null) {
                        kVar.g("com.google.android.gms.cast.metadata.ALBUM_TITLE", charSequence5.toString());
                    }
                    Uri uri = c1446b0.f19550l;
                    if (uri != null) {
                        nVarArr = nVarArr2;
                        kVar.f23197a.add(new E4.a(uri, 0, 0));
                    } else {
                        nVarArr = nVarArr2;
                    }
                    CharSequence charSequence6 = c1446b0.f19563y;
                    if (charSequence6 != null) {
                        kVar.g("com.google.android.gms.cast.metadata.COMPOSER", charSequence6.toString());
                    }
                    Bundle bundle = kVar.f23198b;
                    Integer num = c1446b0.f19535A;
                    if (num != null) {
                        int intValue2 = num.intValue();
                        i13 = i16;
                        i14 = 2;
                        k.i(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                        bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", intValue2);
                    } else {
                        i13 = i16;
                        i14 = 2;
                    }
                    Integer num2 = c1446b0.f19551m;
                    if (num2 != null) {
                        int intValue3 = num2.intValue();
                        k.i(i14, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                        bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", intValue3);
                    }
                    String uri2 = u9.f19475a.toString();
                    String str4 = y9.f19491a;
                    if (str4.equals("")) {
                        str = uri2;
                    } else {
                        str = str4;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("mediaItem", Q6.f.r(y9));
                        JSONObject t7 = Q6.f.t(y9);
                        if (t7 != null) {
                            jSONObject.put("exoPlayerConfig", t7);
                        }
                        String jSONObject2 = jSONObject.toString();
                        ArrayList arrayList = new ArrayList();
                        int i17 = 0;
                        while (true) {
                            F f9 = u9.f19479e;
                            if (i17 < f9.size()) {
                                X x5 = (X) f9.get(i17);
                                long j10 = i17;
                                String str5 = x5.f19487d;
                                int i18 = i.f5495a;
                                if (str5 == null) {
                                    str2 = "";
                                } else {
                                    str2 = str5;
                                }
                                String str6 = x5.f19488e;
                                if (str6 == null) {
                                    str3 = "";
                                } else {
                                    str3 = str6;
                                }
                                arrayList.add(new MediaTrack(j10, 1, str3, null, str2, null, 1, null, null));
                                i17++;
                            }
                        }
                        nVarArr[i13] = new G(new MediaInfo(str, 1, u9.f19476b, kVar, -1L, arrayList, null, jSONObject2, null, null, null, null, -1L, null, uri2, null, null)).l();
                        i16 = i13 + 1;
                        nVarArr2 = nVarArr;
                    } catch (JSONException e8) {
                        throw new RuntimeException(e8);
                    }
                } else {
                    throw new IllegalArgumentException("The item must specify its mimeType");
                }
            }
            t4.n[] nVarArr3 = nVarArr2;
            HashMap hashMap = (HashMap) this.f21564f.f19985b;
            hashMap.clear();
            for (int i19 = 0; i19 < i15; i19++) {
                MediaInfo mediaInfo = nVarArr3[i19].f23214a;
                mediaInfo.getClass();
                String str7 = mediaInfo.f14608a;
                if (str7 == null) {
                    str7 = "";
                }
                hashMap.put(str7, (Y) s9.get(i19));
            }
            h hVar = this.f21572o;
            int min = Math.min(i10, i15 - 1);
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue == 2) {
                        i11 = 1;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 0;
            }
            hVar.getClass();
            y.d();
            if (!hVar.w()) {
                h.r();
            } else {
                h.x(new v4.i(hVar, nVarArr3, min, i11, j9));
            }
        }
    }

    @Override // j3.r0
    public final int F() {
        return 0;
    }

    @Override // j3.r0
    public final long H() {
        E0 I4 = I();
        if (I4.p()) {
            return -9223372036854775807L;
        }
        int z9 = z();
        D0 d02 = (D0) this.f1707a;
        I4.m(z9, d02, 0L);
        return l4.y.T(d02.f19315n);
    }

    @Override // j3.r0
    public final E0 I() {
        return this.f21573p;
    }

    @Override // j3.r0
    public final Looper J() {
        return Looper.getMainLooper();
    }

    @Override // j3.r0
    public final boolean L() {
        return false;
    }

    @Override // j3.r0
    public final v M() {
        return v.f18624A;
    }

    @Override // j3.r0
    public final void Q(long j, int i9) {
        p pVar;
        BasePendingResult basePendingResult;
        C1446b0 c1446b0;
        BasePendingResult basePendingResult2;
        h hVar = this.f21572o;
        if (hVar != null) {
            pVar = hVar.d();
        } else {
            pVar = null;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        l lVar = this.j;
        if (pVar != null) {
            int z9 = z();
            c cVar = this.f21567i;
            if (z9 != i9) {
                h hVar2 = this.f21572o;
                g gVar = this.f21573p;
                C0 c02 = this.f21565g;
                gVar.f(i9, c02, false);
                int intValue = ((Integer) c02.f19236b).intValue();
                hVar2.getClass();
                y.d();
                if (!hVar2.w()) {
                    basePendingResult2 = h.r();
                } else {
                    m mVar = new m(hVar2, intValue, j);
                    h.x(mVar);
                    basePendingResult2 = mVar;
                }
                basePendingResult2.K(cVar);
            } else {
                h hVar3 = this.f21572o;
                hVar3.getClass();
                o oVar = new o(j);
                y.d();
                if (!hVar3.w()) {
                    basePendingResult = h.r();
                } else {
                    v4.n nVar = new v4.n(hVar3, oVar, 0);
                    h.x(nVar);
                    basePendingResult = nVar;
                }
                basePendingResult.K(cVar);
            }
            q0 n02 = n0();
            this.f21579v++;
            this.f21580w = i9;
            this.f21581x = j;
            q0 n03 = n0();
            lVar.c(11, new C1693a(2, n02, n03));
            if (n02.f19720b != n03.f19720b) {
                g gVar2 = this.f21573p;
                D0 d02 = (D0) this.f1707a;
                gVar2.m(i9, d02, 0L);
                lVar.c(1, new C1435b(13, d02.f19305c));
                C1446b0 c1446b02 = this.f21583z;
                Y Z6 = Z();
                if (Z6 != null) {
                    c1446b0 = Z6.f19494d;
                } else {
                    c1446b0 = C1446b0.f19533Z;
                }
                this.f21583z = c1446b0;
                if (!c1446b02.equals(c1446b0)) {
                    lVar.c(14, new C1694b(this, 5));
                }
            }
            s0();
        } else if (this.f21579v == 0) {
            lVar.c(-1, new X0.k(22));
        }
        lVar.b();
    }

    @Override // j3.r0
    public final C1446b0 R() {
        return this.f21583z;
    }

    @Override // j3.r0
    public final long T() {
        long j = this.f21581x;
        if (j != -9223372036854775807L) {
            return j;
        }
        h hVar = this.f21572o;
        if (hVar != null) {
            return hVar.a();
        }
        return this.f21578u;
    }

    @Override // j3.r0
    public final long U() {
        return this.f21562d;
    }

    @Override // j3.r0
    public final void a(m0 m0Var) {
        BasePendingResult basePendingResult;
        if (this.f21572o == null) {
            return;
        }
        m0 m0Var2 = new m0(l4.y.h(m0Var.f19694a, 0.5f, 2.0f));
        o0(m0Var2);
        this.j.b();
        h hVar = this.f21572o;
        double d9 = m0Var2.f19694a;
        hVar.getClass();
        y.d();
        if (!hVar.w()) {
            basePendingResult = h.r();
        } else {
            v4.o oVar = new v4.o(hVar, d9);
            h.x(oVar);
            basePendingResult = oVar;
        }
        c cVar = new c(this, 1);
        this.f21571n.f19986c = cVar;
        basePendingResult.K(cVar);
    }

    @Override // j3.r0
    public final m0 c() {
        return (m0) this.f21571n.f19985b;
    }

    @Override // j3.r0
    public final C1462m d() {
        return null;
    }

    @Override // j3.r0
    public final int e() {
        return this.f21576s;
    }

    @Override // j3.r0
    public final void f(boolean z9) {
        v4.k kVar;
        BasePendingResult r5;
        if (this.f21572o == null) {
            return;
        }
        p0(1, this.f21576s, z9);
        this.j.b();
        if (z9) {
            h hVar = this.f21572o;
            hVar.getClass();
            y.d();
            if (!hVar.w()) {
                r5 = h.r();
            } else {
                kVar = new v4.k(hVar, 5);
                h.x(kVar);
                r5 = kVar;
            }
        } else {
            h hVar2 = this.f21572o;
            hVar2.getClass();
            y.d();
            if (!hVar2.w()) {
                r5 = h.r();
            } else {
                kVar = new v4.k(hVar2, 3);
                h.x(kVar);
                r5 = kVar;
            }
        }
        c cVar = new c(this, 0);
        this.f21569l.f19986c = cVar;
        r5.K(cVar);
    }

    @Override // j3.r0
    public final boolean g() {
        return false;
    }

    @Override // j3.r0
    public final void h(int i9) {
        int i10;
        BasePendingResult basePendingResult;
        if (this.f21572o == null) {
            return;
        }
        r0(i9);
        this.j.b();
        h hVar = this.f21572o;
        if (i9 != 0) {
            i10 = 2;
            if (i9 != 1) {
                if (i9 == 2) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else {
            i10 = 0;
        }
        hVar.getClass();
        y.d();
        if (!hVar.w()) {
            basePendingResult = h.r();
        } else {
            v4.l lVar = new v4.l(hVar, i10);
            h.x(lVar);
            basePendingResult = lVar;
        }
        C4.p cVar = new c(this, 2);
        this.f21570m.f19986c = cVar;
        basePendingResult.K(cVar);
    }

    @Override // j3.r0
    public final long i() {
        return this.f21563e;
    }

    @Override // j3.r0
    public final int j() {
        return ((Integer) this.f21570m.f19985b).intValue();
    }

    @Override // j3.r0
    public final n0 l() {
        return this.f21575r;
    }

    @Override // j3.r0
    public final boolean m() {
        return ((Boolean) this.f21569l.f19985b).booleanValue();
    }

    public final q0 n0() {
        Object obj;
        Y y9;
        Object obj2;
        g gVar = this.f21573p;
        if (!gVar.p()) {
            int z9 = z();
            C0 c02 = this.f21565g;
            gVar.f(z9, c02, true);
            Object obj3 = c02.f19236b;
            int i9 = c02.f19237c;
            D0 d02 = (D0) this.f1707a;
            gVar.m(i9, d02, 0L);
            obj = d02.f19303a;
            obj2 = obj3;
            y9 = d02.f19305c;
        } else {
            obj = null;
            y9 = null;
            obj2 = null;
        }
        return new q0(obj, z(), y9, obj2, z(), T(), T(), -1, -1);
    }

    public final void o0(m0 m0Var) {
        C1499E c1499e = this.f21571n;
        if (((m0) c1499e.f19985b).equals(m0Var)) {
            return;
        }
        c1499e.f19985b = m0Var;
        this.j.c(12, new C1435b(12, m0Var));
        s0();
    }

    public final void p0(int i9, int i10, boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i11 = this.f21576s;
        C1499E c1499e = this.f21569l;
        boolean z13 = false;
        if (i11 == 3 && ((Boolean) c1499e.f19985b).booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((Boolean) c1499e.f19985b).booleanValue() != z9) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f21576s != i10) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 || z12) {
            this.f21576s = i10;
            c1499e.f19985b = Boolean.valueOf(z9);
            C1473y c1473y = new C1473y(i10, 1, z9);
            l lVar = this.j;
            lVar.c(-1, c1473y);
            if (z12) {
                lVar.c(4, new C1468t(i10, 2));
            }
            if (z11) {
                lVar.c(5, new C1473y(i9, 2, z9));
            }
            if (i10 == 3 && z9) {
                z13 = true;
            }
            if (z10 != z13) {
                lVar.c(7, new C1470v(2, z13));
            }
        }
    }

    @Override // j3.r0
    public final G0 q() {
        return this.f21574q;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [j3.a0, java.lang.Object] */
    public final void q0(h hVar) {
        h hVar2 = this.f21572o;
        if (hVar2 != hVar) {
            d dVar = this.f21566h;
            if (hVar2 != null) {
                y.d();
                if (dVar != null) {
                    hVar2.f23854h.remove(dVar);
                }
                h hVar3 = this.f21572o;
                hVar3.getClass();
                y.d();
                v4.u uVar = (v4.u) hVar3.f23855i.remove(dVar);
                if (uVar != null) {
                    HashSet hashSet = uVar.f23886a;
                    hashSet.remove(dVar);
                    if (hashSet.isEmpty()) {
                        hVar3.j.remove(Long.valueOf(uVar.f23887b));
                        uVar.f23890e.f23848b.removeCallbacks(uVar.f23888c);
                        uVar.f23889d = false;
                    }
                }
            }
            this.f21572o = hVar;
            if (hVar != null) {
                PlayerActivity playerActivity = this.f21568k;
                if (playerActivity != null) {
                    playerActivity.k0();
                    ((n) playerActivity.b0()).f(false);
                    long T8 = ((C1441D) playerActivity.b0()).T();
                    I2.a aVar = playerActivity.d0().f17639p;
                    ?? obj = new Object();
                    obj.f19506a = aVar.f3446c;
                    C1446b0 c1446b0 = new C1446b0(obj);
                    Y2.h d9 = s8.n.d(aVar, playerActivity.d0().f17645v.f3479h, playerActivity.d0().f17645v.j);
                    d9.f8618h = c1446b0;
                    Y c3 = d9.c();
                    if (T8 == 0) {
                        e Y = playerActivity.Y();
                        Y.getClass();
                        Y.B(F.s(c3));
                    } else {
                        e Y4 = playerActivity.Y();
                        Y4.getClass();
                        Y4.E(F.s(c3), 0, T8);
                    }
                    playerActivity.Y().getClass();
                    playerActivity.Y().f(true);
                    ((C1441D) playerActivity.b0()).stop();
                    ((n) playerActivity.b0()).s();
                }
                hVar.o(dVar);
                y.d();
                if (dVar != null) {
                    ConcurrentHashMap concurrentHashMap = hVar.f23855i;
                    if (!concurrentHashMap.containsKey(dVar)) {
                        ConcurrentHashMap concurrentHashMap2 = hVar.j;
                        v4.u uVar2 = (v4.u) concurrentHashMap2.get(1000L);
                        if (uVar2 == null) {
                            uVar2 = new v4.u(hVar);
                            concurrentHashMap2.put(1000L, uVar2);
                        }
                        uVar2.f23886a.add(dVar);
                        concurrentHashMap.put(dVar, uVar2);
                        if (hVar.g()) {
                            h hVar4 = uVar2.f23890e;
                            T4.d dVar2 = hVar4.f23848b;
                            t tVar = uVar2.f23888c;
                            dVar2.removeCallbacks(tVar);
                            uVar2.f23889d = true;
                            hVar4.f23848b.postDelayed(tVar, uVar2.f23887b);
                        }
                    }
                }
                t0();
                return;
            }
            x0();
            PlayerActivity playerActivity2 = this.f21568k;
            if (playerActivity2 != null) {
                playerActivity2.k0();
                playerActivity2.Y().f(false);
                long T9 = playerActivity2.Y().T();
                Y c9 = s8.n.d(playerActivity2.d0().f17639p, playerActivity2.d0().f17645v.f3479h, playerActivity2.d0().f17645v.j).c();
                if (T9 == 0) {
                    n nVar = (n) playerActivity2.b0();
                    nVar.getClass();
                    nVar.B(F.s(c9));
                } else {
                    n nVar2 = (n) playerActivity2.b0();
                    nVar2.getClass();
                    nVar2.E(F.s(c9), 0, T9);
                }
                ((C1441D) playerActivity2.b0()).b();
                ((n) playerActivity2.b0()).f(true);
                playerActivity2.Y().stop();
                playerActivity2.Y().s();
            }
        }
    }

    public final void r0(int i9) {
        C1499E c1499e = this.f21570m;
        if (((Integer) c1499e.f19985b).intValue() != i9) {
            c1499e.f19985b = Integer.valueOf(i9);
            this.j.c(8, new C1468t(i9, 3));
            s0();
        }
    }

    @Override // j3.r0
    public final void s() {
        p pVar;
        int min = Math.min(Integer.MAX_VALUE, this.f21573p.f21593d.length);
        if (min != 0) {
            int[] iArr = new int[min];
            for (int i9 = 0; i9 < min; i9++) {
                g gVar = this.f21573p;
                D0 d02 = (D0) this.f1707a;
                gVar.m(i9, d02, 0L);
                iArr[i9] = ((Integer) d02.f19303a).intValue();
            }
            h hVar = this.f21572o;
            if (hVar != null) {
                if (hVar != null) {
                    pVar = hVar.d();
                } else {
                    pVar = null;
                }
                if (pVar != null) {
                    g gVar2 = this.f21573p;
                    if (!gVar2.p()) {
                        int z9 = z();
                        C0 c02 = this.f21565g;
                        gVar2.f(z9, c02, true);
                        Object obj = c02.f19236b;
                        int i10 = l4.y.f20553a;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= min) {
                                break;
                            }
                            if (obj.equals(Integer.valueOf(iArr[i11]))) {
                                this.f21582y = n0();
                                break;
                            }
                            i11++;
                        }
                    }
                    h hVar2 = this.f21572o;
                    hVar2.getClass();
                    y.d();
                    if (!hVar2.w()) {
                        h.r();
                    } else {
                        h.x(new j(hVar2, iArr, 0));
                    }
                }
            }
        }
    }

    public final void s0() {
        n0 n0Var = this.f21575r;
        n0 o9 = l4.y.o(this, f21558A);
        this.f21575r = o9;
        if (!o9.equals(n0Var)) {
            this.j.c(13, new C1694b(this, 4));
        }
    }

    @Override // j3.r0
    public final void stop() {
        this.f21576s = 1;
        h hVar = this.f21572o;
        if (hVar != null) {
            y.d();
            if (!hVar.w()) {
                h.r();
            } else {
                h.x(new v4.k(hVar, 4));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void t0() {
        Object obj;
        C1446b0 c1446b0;
        Object obj2;
        int i9;
        p pVar;
        MediaInfo mediaInfo;
        int i10;
        boolean z9;
        int i11 = 0;
        int i12 = 1;
        if (this.f21572o == null) {
            return;
        }
        int i13 = this.f21577t;
        C1446b0 c1446b02 = this.f21583z;
        boolean p9 = this.f21573p.p();
        ArrayList arrayList = null;
        C0 c02 = this.f21565g;
        if (!p9) {
            this.f21573p.f(i13, c02, true);
            obj = c02.f19236b;
        } else {
            obj = null;
        }
        v0(null);
        w0(null);
        u0(null);
        boolean x02 = x0();
        g gVar = this.f21573p;
        this.f21577t = m0(this.f21572o, gVar);
        Y Z6 = Z();
        if (Z6 != null) {
            c1446b0 = Z6.f19494d;
        } else {
            c1446b0 = C1446b0.f19533Z;
        }
        this.f21583z = c1446b0;
        if (!gVar.p()) {
            gVar.f(this.f21577t, c02, true);
            obj2 = c02.f19236b;
        } else {
            obj2 = null;
        }
        l lVar = this.j;
        if (!x02 && !l4.y.a(obj, obj2) && this.f21579v == 0) {
            gVar.f(i13, c02, true);
            D0 d02 = (D0) this.f1707a;
            gVar.n(i13, d02);
            long T8 = l4.y.T(d02.f19315n);
            Object obj3 = d02.f19303a;
            int i14 = c02.f19237c;
            q0 q0Var = new q0(obj3, i14, d02.f19305c, c02.f19236b, i14, T8, T8, -1, -1);
            gVar.f(this.f21577t, c02, true);
            gVar.n(this.f21577t, d02);
            Object obj4 = d02.f19303a;
            int i15 = c02.f19237c;
            lVar.c(11, new C1693a(0, q0Var, new q0(obj4, i15, d02.f19305c, c02.f19236b, i15, l4.y.T(d02.f19314m), l4.y.T(d02.f19314m), -1, -1)));
            lVar.c(1, new C1694b(this, i11));
        }
        h hVar = this.f21572o;
        if (hVar != null) {
            if (hVar != null) {
                pVar = hVar.d();
            } else {
                pVar = null;
            }
            if (pVar != null) {
                mediaInfo = pVar.f23224a;
            } else {
                mediaInfo = null;
            }
            if (mediaInfo != null) {
                arrayList = mediaInfo.f14613f;
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                long[] jArr = pVar.f23233k;
                if (jArr == null) {
                    jArr = f21559B;
                }
                F0[] f0Arr = new F0[arrayList.size()];
                int i16 = 0;
                while (i16 < arrayList.size()) {
                    MediaTrack mediaTrack = (MediaTrack) arrayList.get(i16);
                    String num = Integer.toString(i16);
                    L l9 = new L();
                    l9.f19393a = mediaTrack.f14627c;
                    l9.j = mediaTrack.f14628d;
                    l9.f19395c = mediaTrack.f14630f;
                    M m9 = new M(l9);
                    M[] mArr = new M[1];
                    mArr[i11] = m9;
                    N3.m0 m0Var = new N3.m0(num, mArr);
                    int[] iArr = {4};
                    int length = jArr.length;
                    int i17 = i11;
                    while (true) {
                        if (i17 < length) {
                            i10 = i11;
                            if (jArr[i17] == mediaTrack.f14625a) {
                                z9 = true;
                                break;
                            } else {
                                i17++;
                                i11 = i10 == true ? 1 : 0;
                            }
                        } else {
                            i10 = i11;
                            z9 = i10 == true ? 1 : 0;
                            break;
                        }
                    }
                    boolean[] zArr = new boolean[1];
                    zArr[i10] = z9;
                    boolean z10 = i10;
                    f0Arr[i16] = new F0(m0Var, z10, iArr, zArr);
                    i16++;
                    i11 = z10 ? 1 : 0;
                }
                int i18 = i11;
                G0 g02 = new G0(F.p(f0Arr));
                if (!g02.equals(this.f21574q)) {
                    this.f21574q = g02;
                    i11 = 1;
                } else {
                    i11 = i18;
                }
            } else {
                G0 g03 = G0.f19337b;
                i11 = !g03.equals(this.f21574q) ? 1 : 0;
                this.f21574q = g03;
            }
        }
        if (i11 != 0) {
            i9 = 2;
            lVar.c(2, new C1694b(this, i12));
        } else {
            i9 = 2;
        }
        if (!c1446b02.equals(this.f21583z)) {
            lVar.c(14, new C1694b(this, i9));
        }
        s0();
        lVar.b();
    }

    @Override // j3.r0
    public final Y3.c u() {
        return Y3.c.f8695b;
    }

    public final void u0(c cVar) {
        float f9;
        C1499E c1499e = this.f21571n;
        if (((C4.p) c1499e.f19986c) == cVar) {
            p d9 = this.f21572o.d();
            if (d9 != null) {
                f9 = (float) d9.f23227d;
            } else {
                f9 = m0.f19693d.f19694a;
            }
            if (f9 > 0.0f) {
                o0(new m0(f9));
            }
            c1499e.f19986c = null;
        }
    }

    public final void v0(c cVar) {
        boolean z9;
        int i9;
        C1499E c1499e = this.f21569l;
        boolean booleanValue = ((Boolean) c1499e.f19985b).booleanValue();
        int i10 = 1;
        if (((C4.p) c1499e.f19986c) == cVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            booleanValue = !this.f21572o.k();
            c1499e.f19986c = null;
        }
        if (booleanValue != ((Boolean) c1499e.f19985b).booleanValue()) {
            i9 = 4;
        } else {
            i9 = 1;
        }
        int e8 = this.f21572o.e();
        if (e8 != 2 && e8 != 3) {
            if (e8 == 4) {
                i10 = 2;
            }
        } else {
            i10 = 3;
        }
        p0(i9, i10, booleanValue);
    }

    @Override // j3.r0
    public final m4.v w() {
        return m4.v.f20829e;
    }

    public final void w0(c cVar) {
        int i9;
        C1499E c1499e = this.f21570m;
        if (((C4.p) c1499e.f19986c) == cVar) {
            p d9 = this.f21572o.d();
            int i10 = 0;
            if (d9 != null && (i9 = d9.f23238p) != 0) {
                i10 = 2;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            throw new IllegalStateException();
                        }
                    } else {
                        i10 = 1;
                    }
                }
            }
            r0(i10);
            c1499e.f19986c = null;
        }
    }

    @Override // j3.r0
    public final void x(p0 p0Var) {
        this.j.d(p0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02aa  */
    /* JADX WARN: Type inference failed for: r10v4, types: [j3.a0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x0() {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.e.x0():boolean");
    }

    @Override // j3.r0
    public final void y(p0 p0Var) {
        this.j.a(p0Var);
    }

    @Override // j3.r0
    public final int z() {
        int i9 = this.f21580w;
        if (i9 != -1) {
            return i9;
        }
        return this.f21577t;
    }

    @Override // j3.r0
    public final void b() {
    }

    @Override // j3.r0
    public final void r() {
    }

    @Override // j3.r0
    public final void C(SurfaceView surfaceView) {
    }

    @Override // j3.r0
    public final void D(SurfaceView surfaceView) {
    }

    @Override // j3.r0
    public final void O(TextureView textureView) {
    }

    @Override // j3.r0
    public final void P(v vVar) {
    }

    @Override // j3.r0
    public final void n(boolean z9) {
    }

    @Override // j3.r0
    public final void v(TextureView textureView) {
    }
}
