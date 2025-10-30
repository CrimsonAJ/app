package l3;

import P5.S;
import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import co.notix.R;
import j3.C1442E;
import j3.SurfaceHolderCallbackC1438A;
import j3.m0;
import j3.w0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l4.AbstractC1566a;
import n3.InterfaceC1632i;

/* loaded from: classes.dex */
public final class H extends C3.t implements l4.m {

    /* renamed from: c1, reason: collision with root package name */
    public final Context f20296c1;

    /* renamed from: d1, reason: collision with root package name */
    public final C1564m f20297d1;

    /* renamed from: e1, reason: collision with root package name */
    public final D f20298e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f20299f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f20300g1;

    /* renamed from: h1, reason: collision with root package name */
    public j3.M f20301h1;

    /* renamed from: i1, reason: collision with root package name */
    public long f20302i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f20303j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f20304k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f20305l1;

    /* renamed from: m1, reason: collision with root package name */
    public C1442E f20306m1;

    public H(Context context, C3.l lVar, Handler handler, SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A, D d9) {
        super(1, lVar, 44100.0f);
        this.f20296c1 = context.getApplicationContext();
        this.f20298e1 = d9;
        this.f20297d1 = new C1564m(handler, surfaceHolderCallbackC1438A, 0);
        d9.f20285r = new i.G(5, this);
    }

    public static P5.F q0(C3.u uVar, j3.M m9, boolean z9, D d9) {
        C3.p pVar;
        String str = m9.f19435l;
        if (str == null) {
            P5.D d10 = P5.F.f5901b;
            return S.f5926e;
        }
        if (d9.f(m9) != 0) {
            List e8 = C3.B.e("audio/raw", false, false);
            if (e8.isEmpty()) {
                pVar = null;
            } else {
                pVar = (C3.p) e8.get(0);
            }
            if (pVar != null) {
                return P5.F.s(pVar);
            }
        }
        uVar.getClass();
        List e9 = C3.B.e(str, z9, false);
        String b9 = C3.B.b(m9);
        if (b9 == null) {
            return P5.F.o(e9);
        }
        List e10 = C3.B.e(b9, z9, false);
        P5.D d11 = P5.F.f5901b;
        P5.C c3 = new P5.C();
        c3.c(e9);
        c3.c(e10);
        return c3.d();
    }

    @Override // C3.t
    public final float J(float f9, j3.M[] mArr) {
        int i9 = -1;
        for (j3.M m9 : mArr) {
            int i10 = m9.f19449z;
            if (i10 != -1) {
                i9 = Math.max(i9, i10);
            }
        }
        if (i9 == -1) {
            return -1.0f;
        }
        return i9 * f9;
    }

    @Override // C3.t
    public final ArrayList K(C3.u uVar, j3.M m9, boolean z9) {
        P5.F q02 = q0(uVar, m9, z9, this.f20298e1);
        Pattern pattern = C3.B.f1428a;
        ArrayList arrayList = new ArrayList(q02);
        Collections.sort(arrayList, new C3.w(new C3.v(0, m9)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if ("AXON 7 mini".equals(r2) == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    @Override // C3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final C3.k M(C3.p r12, j3.M r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.H.M(C3.p, j3.M, android.media.MediaCrypto, float):C3.k");
    }

    @Override // C3.t
    public final void R(Exception exc) {
        AbstractC1566a.u("MediaCodecAudioRenderer", "Audio codec error", exc);
        C1564m c1564m = this.f20297d1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new RunnableC1562k(c1564m, exc, 2));
        }
    }

    @Override // C3.t
    public final void S(long j, String str, long j4) {
        C1564m c1564m = this.f20297d1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new RunnableC1562k(c1564m, str, j, j4));
        }
    }

    @Override // C3.t
    public final void T(String str) {
        C1564m c1564m = this.f20297d1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new RunnableC1562k(c1564m, str, 0));
        }
    }

    @Override // C3.t
    public final m3.h U(O0.c cVar) {
        m3.h U8 = super.U(cVar);
        j3.M m9 = (j3.M) cVar.f5264c;
        C1564m c1564m = this.f20297d1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new RunnableC1562k(c1564m, m9, U8));
        }
        return U8;
    }

    @Override // C3.t
    public final void V(j3.M m9, MediaFormat mediaFormat) {
        int i9;
        int i10;
        j3.M m10 = this.f20301h1;
        int[] iArr = null;
        if (m10 != null) {
            m9 = m10;
        } else if (this.f1526g0 != null) {
            if ("audio/raw".equals(m9.f19435l)) {
                i9 = m9.f19420A;
            } else if (l4.y.f20553a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i9 = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i9 = l4.y.w(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i9 = 2;
            }
            j3.L l9 = new j3.L();
            l9.f19402k = "audio/raw";
            l9.f19417z = i9;
            l9.f19389A = m9.f19421B;
            l9.f19390B = m9.f19422C;
            l9.f19415x = mediaFormat.getInteger("channel-count");
            l9.f19416y = mediaFormat.getInteger("sample-rate");
            j3.M m11 = new j3.M(l9);
            if (this.f20300g1 && m11.f19448y == 6 && (i10 = m9.f19448y) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = i11;
                }
            }
            m9 = m11;
        }
        try {
            this.f20298e1.b(m9, iArr);
        } catch (C1565n e8) {
            throw e(e8, e8.f20415a, false, 5001);
        }
    }

    @Override // C3.t
    public final void W() {
        this.f20298e1.getClass();
    }

    @Override // C3.t
    public final void Y() {
        this.f20298e1.f20248G = true;
    }

    @Override // C3.t
    public final void Z(m3.f fVar) {
        if (this.f20303j1 && !fVar.e(Integer.MIN_VALUE)) {
            if (Math.abs(fVar.f20706f - this.f20302i1) > 500000) {
                this.f20302i1 = fVar.f20706f;
            }
            this.f20303j1 = false;
        }
    }

    @Override // l4.m
    public final void a(m0 m0Var) {
        D d9 = this.f20298e1;
        d9.getClass();
        m0 m0Var2 = new m0(l4.y.h(m0Var.f19694a, 0.1f, 8.0f), l4.y.h(m0Var.f19695b, 0.1f, 8.0f));
        if (d9.f20278k && l4.y.f20553a >= 23) {
            d9.s(m0Var2);
        } else {
            d9.r(m0Var2, d9.g().f20235b);
        }
    }

    @Override // l4.m
    public final long b() {
        if (this.f19589f == 2) {
            r0();
        }
        return this.f20302i1;
    }

    @Override // C3.t
    public final boolean b0(long j, long j4, C3.m mVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j9, boolean z9, boolean z10, j3.M m9) {
        byteBuffer.getClass();
        if (this.f20301h1 != null && (i10 & 2) != 0) {
            mVar.getClass();
            mVar.h(i9, false);
            return true;
        }
        D d9 = this.f20298e1;
        if (z9) {
            if (mVar != null) {
                mVar.h(i9, false);
            }
            this.f1520X0.f20697f += i11;
            d9.f20248G = true;
            return true;
        }
        try {
            if (!d9.j(byteBuffer, j9, i11)) {
                return false;
            }
            if (mVar != null) {
                mVar.h(i9, false);
            }
            this.f1520X0.f20696e += i11;
            return true;
        } catch (o e8) {
            throw e(e8, e8.f20418c, e8.f20417b, 5001);
        } catch (p e9) {
            throw e(e9, m9, e9.f20420b, 5002);
        }
    }

    @Override // l4.m
    public final m0 c() {
        D d9 = this.f20298e1;
        if (d9.f20278k) {
            return d9.f20292y;
        }
        return d9.g().f20234a;
    }

    @Override // j3.AbstractC1449d, j3.s0
    public final void d(int i9, Object obj) {
        boolean z9;
        D d9 = this.f20298e1;
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 != 6) {
                    switch (i9) {
                        case 9:
                            d9.r(d9.g().f20234a, ((Boolean) obj).booleanValue());
                            return;
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            int intValue = ((Integer) obj).intValue();
                            if (d9.f20263W != intValue) {
                                d9.f20263W = intValue;
                                if (intValue != 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                d9.f20262V = z9;
                                d9.d();
                                return;
                            }
                            return;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            this.f20306m1 = (C1442E) obj;
                            return;
                        case 12:
                            if (l4.y.f20553a >= 23) {
                                G.a(d9, obj);
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                u uVar = (u) obj;
                if (!d9.f20264X.equals(uVar)) {
                    uVar.getClass();
                    if (d9.f20288u != null) {
                        d9.f20264X.getClass();
                    }
                    d9.f20264X = uVar;
                    return;
                }
                return;
            }
            C1556e c1556e = (C1556e) obj;
            if (!d9.f20289v.equals(c1556e)) {
                d9.f20289v = c1556e;
                if (!d9.f20265Z) {
                    d9.d();
                    return;
                }
                return;
            }
            return;
        }
        float floatValue = ((Float) obj).floatValue();
        if (d9.f20251J != floatValue) {
            d9.f20251J = floatValue;
            if (d9.m()) {
                if (l4.y.f20553a >= 21) {
                    d9.f20288u.setVolume(d9.f20251J);
                    return;
                }
                AudioTrack audioTrack = d9.f20288u;
                float f9 = d9.f20251J;
                audioTrack.setStereoVolume(f9, f9);
            }
        }
    }

    @Override // C3.t
    public final void e0() {
        try {
            D d9 = this.f20298e1;
            if (!d9.f20259S && d9.m() && d9.c()) {
                d9.o();
                d9.f20259S = true;
            }
        } catch (p e8) {
            throw e(e8, e8.f20421c, e8.f20420b, 5002);
        }
    }

    @Override // j3.AbstractC1449d
    public final String g() {
        return "MediaCodecAudioRenderer";
    }

    @Override // C3.t, j3.AbstractC1449d
    public final boolean i() {
        if (this.f1515T0) {
            D d9 = this.f20298e1;
            if (d9.m()) {
                if (d9.f20259S && !d9.k()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // C3.t, j3.AbstractC1449d
    public final boolean j() {
        if (!this.f20298e1.k() && !super.j()) {
            return false;
        }
        return true;
    }

    @Override // C3.t, j3.AbstractC1449d
    public final void k() {
        C1564m c1564m = this.f20297d1;
        this.f20305l1 = true;
        try {
            this.f20298e1.d();
            try {
                super.k();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.k();
                throw th;
            } finally {
            }
        }
    }

    @Override // C3.t
    public final boolean k0(j3.M m9) {
        if (this.f20298e1.f(m9) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, m3.d] */
    @Override // j3.AbstractC1449d
    public final void l(boolean z9, boolean z10) {
        ?? obj = new Object();
        this.f1520X0 = obj;
        C1564m c1564m = this.f20297d1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new RunnableC1562k(c1564m, (Object) obj, 4));
        }
        w0 w0Var = this.f19586c;
        w0Var.getClass();
        boolean z11 = w0Var.f19759a;
        boolean z12 = false;
        D d9 = this.f20298e1;
        if (z11) {
            d9.getClass();
            if (l4.y.f20553a >= 21) {
                z12 = true;
            }
            AbstractC1566a.m(z12);
            AbstractC1566a.m(d9.f20262V);
            if (!d9.f20265Z) {
                d9.f20265Z = true;
                d9.d();
            }
        } else if (d9.f20265Z) {
            d9.f20265Z = false;
            d9.d();
        }
        k3.l lVar = this.f19588e;
        lVar.getClass();
        d9.f20284q = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r4 != null) goto L30;
     */
    @Override // C3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l0(C3.u r12, j3.M r13) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.H.l0(C3.u, j3.M):int");
    }

    @Override // C3.t, j3.AbstractC1449d
    public final void m(long j, boolean z9) {
        super.m(j, z9);
        this.f20298e1.d();
        this.f20302i1 = j;
        this.f20303j1 = true;
        this.f20304k1 = true;
    }

    @Override // j3.AbstractC1449d
    public final void n() {
        D d9 = this.f20298e1;
        try {
            try {
                B();
                d0();
                InterfaceC1632i interfaceC1632i = this.f1496C;
                if (interfaceC1632i != null) {
                    interfaceC1632i.e(null);
                }
                this.f1496C = null;
            } catch (Throwable th) {
                InterfaceC1632i interfaceC1632i2 = this.f1496C;
                if (interfaceC1632i2 != null) {
                    interfaceC1632i2.e(null);
                }
                this.f1496C = null;
                throw th;
            }
        } finally {
            if (this.f20305l1) {
                this.f20305l1 = false;
                d9.q();
            }
        }
    }

    @Override // j3.AbstractC1449d
    public final void o() {
        D d9 = this.f20298e1;
        d9.f20261U = true;
        if (d9.m()) {
            s sVar = d9.f20277i.f20444f;
            sVar.getClass();
            sVar.a();
            d9.f20288u.play();
        }
    }

    @Override // j3.AbstractC1449d
    public final void p() {
        r0();
        D d9 = this.f20298e1;
        d9.f20261U = false;
        if (d9.m()) {
            t tVar = d9.f20277i;
            tVar.f20449l = 0L;
            tVar.f20460w = 0;
            tVar.f20459v = 0;
            tVar.f20450m = 0L;
            tVar.f20435C = 0L;
            tVar.f20438F = 0L;
            tVar.f20448k = false;
            if (tVar.f20461x == -9223372036854775807L) {
                s sVar = tVar.f20444f;
                sVar.getClass();
                sVar.a();
                d9.f20288u.pause();
            }
        }
    }

    public final int p0(C3.p pVar, j3.M m9) {
        int i9;
        if ("OMX.google.raw.decoder".equals(pVar.f1479a) && (i9 = l4.y.f20553a) < 24 && (i9 != 23 || !l4.y.G(this.f20296c1))) {
            return -1;
        }
        return m9.f19436m;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x022d A[Catch: Exception -> 0x0243, TRY_LEAVE, TryCatch #0 {Exception -> 0x0243, blocks: (B:106:0x0208, B:108:0x022d), top: B:105:0x0208 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r0() {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.H.r0():void");
    }

    @Override // C3.t
    public final m3.h z(C3.p pVar, j3.M m9, j3.M m10) {
        int i9;
        m3.h b9 = pVar.b(m9, m10);
        int p02 = p0(pVar, m10);
        int i10 = this.f20299f1;
        int i11 = b9.f20714e;
        if (p02 > i10) {
            i11 |= 64;
        }
        int i12 = i11;
        if (i12 != 0) {
            i9 = 0;
        } else {
            i9 = b9.f20713d;
        }
        return new m3.h(pVar.f1479a, m9, m10, i9, i12);
    }

    @Override // j3.AbstractC1449d
    public final l4.m f() {
        return this;
    }
}
