package m4;

import C3.B;
import C3.w;
import P5.C;
import P5.D;
import P5.F;
import P5.S;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j2.C1435b;
import j3.L;
import j3.M;
import j3.SurfaceHolderCallbackC1438A;
import j3.w0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import l3.C1564m;
import l4.AbstractC1566a;
import l4.y;
import n3.InterfaceC1632i;

/* loaded from: classes.dex */
public final class i extends C3.t {

    /* renamed from: L1, reason: collision with root package name */
    public static final int[] f20747L1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: M1, reason: collision with root package name */
    public static boolean f20748M1;

    /* renamed from: N1, reason: collision with root package name */
    public static boolean f20749N1;

    /* renamed from: A1, reason: collision with root package name */
    public long f20750A1;

    /* renamed from: B1, reason: collision with root package name */
    public int f20751B1;

    /* renamed from: C1, reason: collision with root package name */
    public int f20752C1;

    /* renamed from: D1, reason: collision with root package name */
    public int f20753D1;

    /* renamed from: E1, reason: collision with root package name */
    public int f20754E1;

    /* renamed from: F1, reason: collision with root package name */
    public float f20755F1;

    /* renamed from: G1, reason: collision with root package name */
    public v f20756G1;

    /* renamed from: H1, reason: collision with root package name */
    public boolean f20757H1;

    /* renamed from: I1, reason: collision with root package name */
    public int f20758I1;

    /* renamed from: J1, reason: collision with root package name */
    public h f20759J1;

    /* renamed from: K1, reason: collision with root package name */
    public o f20760K1;

    /* renamed from: c1, reason: collision with root package name */
    public final Context f20761c1;

    /* renamed from: d1, reason: collision with root package name */
    public final t f20762d1;

    /* renamed from: e1, reason: collision with root package name */
    public final C1564m f20763e1;

    /* renamed from: f1, reason: collision with root package name */
    public final long f20764f1;

    /* renamed from: g1, reason: collision with root package name */
    public final int f20765g1;

    /* renamed from: h1, reason: collision with root package name */
    public final boolean f20766h1;

    /* renamed from: i1, reason: collision with root package name */
    public O4.d f20767i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f20768j1;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f20769k1;

    /* renamed from: l1, reason: collision with root package name */
    public Surface f20770l1;

    /* renamed from: m1, reason: collision with root package name */
    public k f20771m1;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f20772n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f20773o1;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f20774p1;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f20775q1;
    public boolean r1;
    public long s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f20776t1;

    /* renamed from: u1, reason: collision with root package name */
    public long f20777u1;

    /* renamed from: v1, reason: collision with root package name */
    public int f20778v1;

    /* renamed from: w1, reason: collision with root package name */
    public int f20779w1;

    /* renamed from: x1, reason: collision with root package name */
    public int f20780x1;

    /* renamed from: y1, reason: collision with root package name */
    public long f20781y1;

    /* renamed from: z1, reason: collision with root package name */
    public long f20782z1;

    public i(Context context, C3.l lVar, Handler handler, SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A) {
        super(2, lVar, 30.0f);
        this.f20764f1 = 5000L;
        this.f20765g1 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f20761c1 = applicationContext;
        this.f20762d1 = new t(applicationContext);
        this.f20763e1 = new C1564m(handler, surfaceHolderCallbackC1438A, 1);
        this.f20766h1 = "NVIDIA".equals(y.f20555c);
        this.f20776t1 = -9223372036854775807L;
        this.f20752C1 = -1;
        this.f20753D1 = -1;
        this.f20755F1 = -1.0f;
        this.f20773o1 = 1;
        this.f20758I1 = 0;
        this.f20756G1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x074f, code lost:
    
        if (r14.equals("A10-70L") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x08b7, code lost:
    
        if (r1.equals("JSN-L21") == false) goto L662;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean q0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.i.q0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0070, code lost:
    
        if (r10.equals("video/hevc") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int r0(C3.p r11, j3.M r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.i.r0(C3.p, j3.M):int");
    }

    public static F s0(Context context, C3.u uVar, M m9, boolean z9, boolean z10) {
        String str = m9.f19435l;
        if (str == null) {
            D d9 = F.f5901b;
            return S.f5926e;
        }
        uVar.getClass();
        List e8 = B.e(str, z9, z10);
        String b9 = B.b(m9);
        if (b9 == null) {
            return F.o(e8);
        }
        List e9 = B.e(b9, z9, z10);
        if (y.f20553a >= 26 && "video/dolby-vision".equals(m9.f19435l) && !e9.isEmpty() && !g.a(context)) {
            return F.o(e9);
        }
        D d10 = F.f5901b;
        C c3 = new C();
        c3.c(e8);
        c3.c(e9);
        return c3.d();
    }

    public static int t0(C3.p pVar, M m9) {
        if (m9.f19436m != -1) {
            List list = m9.f19437n;
            int size = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size; i10++) {
                i9 += ((byte[]) list.get(i10)).length;
            }
            return m9.f19436m + i9;
        }
        return r0(pVar, m9);
    }

    @Override // C3.t
    public final C3.n A(IllegalStateException illegalStateException, C3.p pVar) {
        Surface surface = this.f20770l1;
        C3.n nVar = new C3.n(illegalStateException, pVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return nVar;
    }

    public final void A0(C3.m mVar, int i9) {
        AbstractC1566a.c("skipVideoBuffer");
        mVar.h(i9, false);
        AbstractC1566a.v();
        this.f1520X0.f20697f++;
    }

    public final void B0(int i9, int i10) {
        m3.d dVar = this.f1520X0;
        dVar.f20699h += i9;
        int i11 = i9 + i10;
        dVar.f20698g += i11;
        this.f20778v1 += i11;
        int i12 = this.f20779w1 + i11;
        this.f20779w1 = i12;
        dVar.f20700i = Math.max(i12, dVar.f20700i);
        int i13 = this.f20765g1;
        if (i13 > 0 && this.f20778v1 >= i13) {
            u0();
        }
    }

    public final void C0(long j) {
        m3.d dVar = this.f1520X0;
        dVar.f20701k += j;
        dVar.f20702l++;
        this.f20750A1 += j;
        this.f20751B1++;
    }

    @Override // C3.t
    public final boolean I() {
        if (this.f20757H1 && y.f20553a < 23) {
            return true;
        }
        return false;
    }

    @Override // C3.t
    public final float J(float f9, M[] mArr) {
        float f10 = -1.0f;
        for (M m9 : mArr) {
            float f11 = m9.f19442s;
            if (f11 != -1.0f) {
                f10 = Math.max(f10, f11);
            }
        }
        if (f10 == -1.0f) {
            return -1.0f;
        }
        return f10 * f9;
    }

    @Override // C3.t
    public final ArrayList K(C3.u uVar, M m9, boolean z9) {
        F s02 = s0(this.f20761c1, uVar, m9, z9, this.f20757H1);
        Pattern pattern = B.f1428a;
        ArrayList arrayList = new ArrayList(s02);
        Collections.sort(arrayList, new w(new C3.v(0, m9)));
        return arrayList;
    }

    @Override // C3.t
    public final C3.k M(C3.p pVar, M m9, MediaCrypto mediaCrypto, float f9) {
        C1591b c1591b;
        int i9;
        O4.d dVar;
        boolean z9;
        int i10;
        int i11;
        Point point;
        Point point2;
        int i12;
        int i13;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i14;
        int i15;
        char c3;
        boolean z10;
        int i16;
        boolean z11;
        Pair d9;
        int r0;
        k kVar = this.f20771m1;
        if (kVar != null && kVar.f20790a != pVar.f1484f) {
            if (this.f20770l1 == kVar) {
                this.f20770l1 = null;
            }
            kVar.release();
            this.f20771m1 = null;
        }
        String str = pVar.f1481c;
        M[] mArr = this.f19591h;
        mArr.getClass();
        int i17 = m9.f19440q;
        int t02 = t0(pVar, m9);
        int length = mArr.length;
        float f10 = m9.f19442s;
        int i18 = m9.f19440q;
        C1591b c1591b2 = m9.f19447x;
        int i19 = m9.f19441r;
        if (length == 1) {
            if (t02 != -1 && (r0 = r0(pVar, m9)) != -1) {
                t02 = Math.min((int) (t02 * 1.5f), r0);
            }
            dVar = new O4.d(i17, i19, t02);
            c1591b = c1591b2;
            i9 = i19;
        } else {
            int length2 = mArr.length;
            int i20 = i19;
            int i21 = 0;
            boolean z12 = false;
            while (i21 < length2) {
                M m10 = mArr[i21];
                M[] mArr2 = mArr;
                if (c1591b2 != null && m10.f19447x == null) {
                    L a5 = m10.a();
                    a5.f19414w = c1591b2;
                    m10 = new M(a5);
                }
                if (pVar.b(m9, m10).f20713d != 0) {
                    int i22 = m10.f19441r;
                    i14 = length2;
                    int i23 = m10.f19440q;
                    i15 = i21;
                    c3 = 65535;
                    if (i23 != -1 && i22 != -1) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    z12 |= z10;
                    i17 = Math.max(i17, i23);
                    i20 = Math.max(i20, i22);
                    t02 = Math.max(t02, t0(pVar, m10));
                } else {
                    i14 = length2;
                    i15 = i21;
                    c3 = 65535;
                }
                i21 = i15 + 1;
                mArr = mArr2;
                length2 = i14;
            }
            if (z12) {
                AbstractC1566a.P("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i17 + "x" + i20);
                if (i19 > i18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i10 = i19;
                } else {
                    i10 = i18;
                }
                boolean z13 = z9;
                if (z9) {
                    i11 = i18;
                } else {
                    i11 = i19;
                }
                float f11 = i11 / i10;
                int[] iArr = f20747L1;
                c1591b = c1591b2;
                int i24 = 0;
                while (i24 < 9) {
                    int i25 = iArr[i24];
                    int i26 = i24;
                    int i27 = (int) (i25 * f11);
                    if (i25 <= i10 || i27 <= i11) {
                        break;
                    }
                    int i28 = i11;
                    int i29 = i10;
                    if (y.f20553a >= 21) {
                        if (z13) {
                            i13 = i27;
                        } else {
                            i13 = i25;
                        }
                        if (!z13) {
                            i25 = i27;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f1482d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            point2 = new Point(y.f(i13, widthAlignment) * widthAlignment, y.f(i25, heightAlignment) * heightAlignment);
                        }
                        i9 = i19;
                        if (pVar.e(point2.x, point2.y, f10)) {
                            point = point2;
                            break;
                        }
                        i24 = i26 + 1;
                        i19 = i9;
                        i11 = i28;
                        i10 = i29;
                    } else {
                        i9 = i19;
                        try {
                            int f12 = y.f(i25, 16) * 16;
                            int f13 = y.f(i27, 16) * 16;
                            if (f12 * f13 <= B.i()) {
                                if (z13) {
                                    i12 = f13;
                                } else {
                                    i12 = f12;
                                }
                                if (!z13) {
                                    f12 = f13;
                                }
                                point2 = new Point(i12, f12);
                                point = point2;
                                break;
                            }
                            i24 = i26 + 1;
                            i19 = i9;
                            i11 = i28;
                            i10 = i29;
                        } catch (C3.y unused) {
                        }
                    }
                }
                i9 = i19;
                point = null;
                if (point != null) {
                    i17 = Math.max(i17, point.x);
                    i20 = Math.max(i20, point.y);
                    L a9 = m9.a();
                    a9.f19407p = i17;
                    a9.f19408q = i20;
                    t02 = Math.max(t02, r0(pVar, new M(a9)));
                    AbstractC1566a.P("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i17 + "x" + i20);
                }
            } else {
                c1591b = c1591b2;
                i9 = i19;
            }
            dVar = new O4.d(i17, i20, t02);
        }
        this.f20767i1 = dVar;
        if (this.f20757H1) {
            i16 = this.f20758I1;
        } else {
            i16 = 0;
        }
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i18);
        mediaFormat.setInteger("height", i9);
        AbstractC1566a.N(mediaFormat, m9.f19437n);
        if (f10 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f10);
        }
        AbstractC1566a.F(mediaFormat, "rotation-degrees", m9.f19443t);
        if (c1591b != null) {
            C1591b c1591b3 = c1591b;
            AbstractC1566a.F(mediaFormat, "color-transfer", c1591b3.f20725c);
            AbstractC1566a.F(mediaFormat, "color-standard", c1591b3.f20723a);
            AbstractC1566a.F(mediaFormat, "color-range", c1591b3.f20724b);
            byte[] bArr = c1591b3.f20726d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(m9.f19435l) && (d9 = B.d(m9)) != null) {
            AbstractC1566a.F(mediaFormat, "profile", ((Integer) d9.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.f5459a);
        mediaFormat.setInteger("max-height", dVar.f5460b);
        AbstractC1566a.F(mediaFormat, "max-input-size", dVar.f5461c);
        if (y.f20553a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f9 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f9);
            }
        }
        if (this.f20766h1) {
            z11 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z11 = true;
        }
        if (i16 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z11);
            mediaFormat.setInteger("audio-session-id", i16);
        }
        if (this.f20770l1 == null) {
            if (z0(pVar)) {
                if (this.f20771m1 == null) {
                    this.f20771m1 = k.f(this.f20761c1, pVar.f1484f);
                }
                this.f20770l1 = this.f20771m1;
            } else {
                throw new IllegalStateException();
            }
        }
        return new C3.k(pVar, mediaFormat, m9, this.f20770l1, mediaCrypto);
    }

    @Override // C3.t
    public final void N(m3.f fVar) {
        if (this.f20769k1) {
            ByteBuffer byteBuffer = fVar.f20707g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b9 = byteBuffer.get();
                short s9 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b9 == -75 && s9 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        C3.m mVar = this.f1526g0;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mVar.s(bundle);
                    }
                }
            }
        }
    }

    @Override // C3.t
    public final void R(Exception exc) {
        AbstractC1566a.u("MediaCodecVideoRenderer", "Video codec error", exc);
        C1564m c1564m = this.f20763e1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new u(c1564m, exc, 2));
        }
    }

    @Override // C3.t
    public final void S(long j, String str, long j4) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C1564m c1564m = this.f20763e1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            str2 = str;
            handler.post(new u(c1564m, str2, j, j4));
        } else {
            str2 = str;
        }
        this.f20768j1 = q0(str2);
        C3.p pVar = this.f1535n0;
        pVar.getClass();
        boolean z9 = false;
        if (y.f20553a >= 29 && "video/x-vnd.on2.vp9".equals(pVar.f1480b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f1482d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i9].profile == 16384) {
                    z9 = true;
                    break;
                }
                i9++;
            }
        }
        this.f20769k1 = z9;
        if (y.f20553a >= 23 && this.f20757H1) {
            C3.m mVar = this.f1526g0;
            mVar.getClass();
            this.f20759J1 = new h(this, mVar);
        }
    }

    @Override // C3.t
    public final void T(String str) {
        C1564m c1564m = this.f20763e1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new u(c1564m, str, 1));
        }
    }

    @Override // C3.t
    public final m3.h U(O0.c cVar) {
        m3.h U8 = super.U(cVar);
        M m9 = (M) cVar.f5264c;
        C1564m c1564m = this.f20763e1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new u(c1564m, m9, U8));
        }
        return U8;
    }

    @Override // C3.t
    public final void V(M m9, MediaFormat mediaFormat) {
        boolean z9;
        int integer;
        int integer2;
        C3.m mVar = this.f1526g0;
        if (mVar != null) {
            mVar.i(this.f20773o1);
        }
        if (this.f20757H1) {
            this.f20752C1 = m9.f19440q;
            this.f20753D1 = m9.f19441r;
        } else {
            mediaFormat.getClass();
            if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f20752C1 = integer;
            if (z9) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f20753D1 = integer2;
        }
        float f9 = m9.f19444u;
        this.f20755F1 = f9;
        int i9 = y.f20553a;
        int i10 = m9.f19443t;
        if (i9 >= 21) {
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f20752C1;
                this.f20752C1 = this.f20753D1;
                this.f20753D1 = i11;
                this.f20755F1 = 1.0f / f9;
            }
        } else {
            this.f20754E1 = i10;
        }
        float f10 = m9.f19442s;
        t tVar = this.f20762d1;
        tVar.f20816f = f10;
        d dVar = tVar.f20811a;
        dVar.f20736a.c();
        dVar.f20737b.c();
        dVar.f20738c = false;
        dVar.f20739d = -9223372036854775807L;
        dVar.f20740e = 0;
        tVar.b();
    }

    @Override // C3.t
    public final void X(long j) {
        super.X(j);
        if (!this.f20757H1) {
            this.f20780x1--;
        }
    }

    @Override // C3.t
    public final void Y() {
        p0();
    }

    @Override // C3.t
    public final void Z(m3.f fVar) {
        boolean z9 = this.f20757H1;
        if (!z9) {
            this.f20780x1++;
        }
        if (y.f20553a < 23 && z9) {
            long j = fVar.f20706f;
            o0(j);
            w0();
            this.f1520X0.f20696e++;
            v0();
            X(j);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x026a, code lost:
    
        if (r6 != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0077, code lost:
    
        if (r12 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0140, code lost:
    
        if (r8 != false) goto L83;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016e  */
    @Override // C3.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b0(long r32, long r34, C3.m r36, java.nio.ByteBuffer r37, int r38, int r39, int r40, long r41, boolean r43, boolean r44, j3.M r45) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.i.b0(long, long, C3.m, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, j3.M):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.view.Surface] */
    @Override // j3.AbstractC1449d, j3.s0
    public final void d(int i9, Object obj) {
        k kVar;
        Handler handler;
        k kVar2;
        long j;
        Handler handler2;
        int intValue;
        t tVar = this.f20762d1;
        if (i9 != 1) {
            if (i9 != 7) {
                if (i9 != 10) {
                    if (i9 != 4) {
                        if (i9 == 5 && tVar.j != (intValue = ((Integer) obj).intValue())) {
                            tVar.j = intValue;
                            tVar.c(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.f20773o1 = intValue2;
                    C3.m mVar = this.f1526g0;
                    if (mVar != null) {
                        mVar.i(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.f20758I1 != intValue3) {
                    this.f20758I1 = intValue3;
                    if (this.f20757H1) {
                        d0();
                        return;
                    }
                    return;
                }
                return;
            }
            this.f20760K1 = (o) obj;
            return;
        }
        if (obj instanceof Surface) {
            kVar = (Surface) obj;
        } else {
            kVar = null;
        }
        if (kVar == null) {
            k kVar3 = this.f20771m1;
            if (kVar3 != null) {
                kVar = kVar3;
            } else {
                C3.p pVar = this.f1535n0;
                if (pVar != null && z0(pVar)) {
                    kVar = k.f(this.f20761c1, pVar.f1484f);
                    this.f20771m1 = kVar;
                }
            }
        }
        Surface surface = this.f20770l1;
        C1564m c1564m = this.f20763e1;
        if (surface != kVar) {
            this.f20770l1 = kVar;
            tVar.getClass();
            if (kVar instanceof k) {
                kVar2 = null;
            } else {
                kVar2 = kVar;
            }
            if (tVar.f20815e != kVar2) {
                tVar.a();
                tVar.f20815e = kVar2;
                tVar.c(true);
            }
            this.f20772n1 = false;
            int i10 = this.f19589f;
            C3.m mVar2 = this.f1526g0;
            if (mVar2 != null) {
                if (y.f20553a >= 23 && kVar != null && !this.f20768j1) {
                    mVar2.q(kVar);
                } else {
                    d0();
                    P();
                }
            }
            if (kVar != null && kVar != this.f20771m1) {
                v vVar = this.f20756G1;
                if (vVar != null && (handler2 = c1564m.f20413b) != null) {
                    handler2.post(new A6.r(c1564m, 20, vVar));
                }
                p0();
                if (i10 == 2) {
                    long j4 = this.f20764f1;
                    if (j4 > 0) {
                        j = SystemClock.elapsedRealtime() + j4;
                    } else {
                        j = -9223372036854775807L;
                    }
                    this.f20776t1 = j;
                    return;
                }
                return;
            }
            this.f20756G1 = null;
            p0();
            return;
        }
        if (kVar != null && kVar != this.f20771m1) {
            v vVar2 = this.f20756G1;
            if (vVar2 != null && (handler = c1564m.f20413b) != null) {
                handler.post(new A6.r(c1564m, 20, vVar2));
            }
            if (this.f20772n1) {
                Surface surface2 = this.f20770l1;
                Handler handler3 = c1564m.f20413b;
                if (handler3 != null) {
                    handler3.post(new y6.o(c1564m, surface2, SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // C3.t
    public final void f0() {
        super.f0();
        this.f20780x1 = 0;
    }

    @Override // j3.AbstractC1449d
    public final String g() {
        return "MediaCodecVideoRenderer";
    }

    @Override // C3.t, j3.AbstractC1449d
    public final boolean j() {
        k kVar;
        if (super.j() && (this.f20774p1 || (((kVar = this.f20771m1) != null && this.f20770l1 == kVar) || this.f1526g0 == null || this.f20757H1))) {
            this.f20776t1 = -9223372036854775807L;
            return true;
        }
        if (this.f20776t1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f20776t1) {
            return true;
        }
        this.f20776t1 = -9223372036854775807L;
        return false;
    }

    @Override // C3.t
    public final boolean j0(C3.p pVar) {
        if (this.f20770l1 == null && !z0(pVar)) {
            return false;
        }
        return true;
    }

    @Override // C3.t, j3.AbstractC1449d
    public final void k() {
        C1564m c1564m = this.f20763e1;
        this.f20756G1 = null;
        p0();
        this.f20772n1 = false;
        this.f20759J1 = null;
        try {
            super.k();
            m3.d dVar = this.f1520X0;
            c1564m.getClass();
            synchronized (dVar) {
            }
            Handler handler = c1564m.f20413b;
            if (handler != null) {
                handler.post(new A6.r(c1564m, 21, dVar));
            }
        } catch (Throwable th) {
            c1564m.a(this.f1520X0);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, m3.d] */
    @Override // j3.AbstractC1449d
    public final void l(boolean z9, boolean z10) {
        boolean z11;
        this.f1520X0 = new Object();
        w0 w0Var = this.f19586c;
        w0Var.getClass();
        boolean z12 = w0Var.f19759a;
        if (z12 && this.f20758I1 == 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        AbstractC1566a.m(z11);
        if (this.f20757H1 != z12) {
            this.f20757H1 = z12;
            d0();
        }
        m3.d dVar = this.f1520X0;
        C1564m c1564m = this.f20763e1;
        Handler handler = c1564m.f20413b;
        if (handler != null) {
            handler.post(new u(c1564m, dVar, 4));
        }
        this.f20775q1 = z10;
        this.r1 = false;
    }

    @Override // C3.t
    public final int l0(C3.u uVar, M m9) {
        boolean z9;
        boolean z10;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        if (!l4.n.l(m9.f19435l)) {
            return AbstractC0953k1.e(0, 0, 0);
        }
        if (m9.f19438o != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        Context context = this.f20761c1;
        F s02 = s0(context, uVar, m9, z9, false);
        if (z9 && s02.isEmpty()) {
            s02 = s0(context, uVar, m9, false, false);
        }
        if (s02.isEmpty()) {
            return AbstractC0953k1.e(1, 0, 0);
        }
        int i14 = m9.f19424X;
        if (i14 != 0 && i14 != 2) {
            return AbstractC0953k1.e(2, 0, 0);
        }
        C3.p pVar = (C3.p) s02.get(0);
        boolean c3 = pVar.c(m9);
        if (!c3) {
            for (int i15 = 1; i15 < s02.size(); i15++) {
                C3.p pVar2 = (C3.p) s02.get(i15);
                if (pVar2.c(m9)) {
                    c3 = true;
                    z10 = false;
                    pVar = pVar2;
                    break;
                }
            }
        }
        z10 = true;
        if (c3) {
            i9 = 4;
        } else {
            i9 = 3;
        }
        if (pVar.d(m9)) {
            i10 = 16;
        } else {
            i10 = 8;
        }
        if (pVar.f1485g) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = 128;
        } else {
            i12 = 0;
        }
        if (y.f20553a >= 26 && "video/dolby-vision".equals(m9.f19435l) && !g.a(context)) {
            i12 = 256;
        }
        if (c3) {
            F s03 = s0(context, uVar, m9, z9, true);
            if (!s03.isEmpty()) {
                Pattern pattern = B.f1428a;
                ArrayList arrayList = new ArrayList(s03);
                Collections.sort(arrayList, new w(new C3.v(0, m9)));
                C3.p pVar3 = (C3.p) arrayList.get(0);
                if (pVar3.c(m9) && pVar3.d(m9)) {
                    i13 = 32;
                }
            }
        }
        return i9 | i10 | i13 | i11 | i12;
    }

    @Override // C3.t, j3.AbstractC1449d
    public final void m(long j, boolean z9) {
        super.m(j, z9);
        p0();
        t tVar = this.f20762d1;
        tVar.f20822m = 0L;
        tVar.f20825p = -1L;
        tVar.f20823n = -1L;
        long j4 = -9223372036854775807L;
        this.f20781y1 = -9223372036854775807L;
        this.s1 = -9223372036854775807L;
        this.f20779w1 = 0;
        if (z9) {
            long j9 = this.f20764f1;
            if (j9 > 0) {
                j4 = SystemClock.elapsedRealtime() + j9;
            }
            this.f20776t1 = j4;
            return;
        }
        this.f20776t1 = -9223372036854775807L;
    }

    @Override // j3.AbstractC1449d
    public final void n() {
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
            k kVar = this.f20771m1;
            if (kVar != null) {
                if (this.f20770l1 == kVar) {
                    this.f20770l1 = null;
                }
                kVar.release();
                this.f20771m1 = null;
            }
        }
    }

    @Override // j3.AbstractC1449d
    public final void o() {
        this.f20778v1 = 0;
        this.f20777u1 = SystemClock.elapsedRealtime();
        this.f20782z1 = SystemClock.elapsedRealtime() * 1000;
        this.f20750A1 = 0L;
        this.f20751B1 = 0;
        t tVar = this.f20762d1;
        tVar.f20814d = true;
        tVar.f20822m = 0L;
        tVar.f20825p = -1L;
        tVar.f20823n = -1L;
        q qVar = tVar.f20812b;
        if (qVar != null) {
            s sVar = tVar.f20813c;
            sVar.getClass();
            sVar.f20808b.sendEmptyMessage(1);
            qVar.b(new C1435b(11, tVar));
        }
        tVar.c(false);
    }

    @Override // j3.AbstractC1449d
    public final void p() {
        this.f20776t1 = -9223372036854775807L;
        u0();
        int i9 = this.f20751B1;
        if (i9 != 0) {
            long j = this.f20750A1;
            C1564m c1564m = this.f20763e1;
            Handler handler = c1564m.f20413b;
            if (handler != null) {
                handler.post(new u(c1564m, j, i9));
            }
            this.f20750A1 = 0L;
            this.f20751B1 = 0;
        }
        t tVar = this.f20762d1;
        tVar.f20814d = false;
        q qVar = tVar.f20812b;
        if (qVar != null) {
            qVar.h();
            s sVar = tVar.f20813c;
            sVar.getClass();
            sVar.f20808b.sendEmptyMessage(2);
        }
        tVar.a();
    }

    public final void p0() {
        C3.m mVar;
        this.f20774p1 = false;
        if (y.f20553a >= 23 && this.f20757H1 && (mVar = this.f1526g0) != null) {
            this.f20759J1 = new h(this, mVar);
        }
    }

    public final void u0() {
        if (this.f20778v1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.f20777u1;
            int i9 = this.f20778v1;
            C1564m c1564m = this.f20763e1;
            Handler handler = c1564m.f20413b;
            if (handler != null) {
                handler.post(new u(c1564m, i9, j));
            }
            this.f20778v1 = 0;
            this.f20777u1 = elapsedRealtime;
        }
    }

    @Override // C3.t, j3.AbstractC1449d
    public final void v(float f9, float f10) {
        super.v(f9, f10);
        t tVar = this.f20762d1;
        tVar.f20819i = f9;
        tVar.f20822m = 0L;
        tVar.f20825p = -1L;
        tVar.f20823n = -1L;
        tVar.c(false);
    }

    public final void v0() {
        this.r1 = true;
        if (!this.f20774p1) {
            this.f20774p1 = true;
            Surface surface = this.f20770l1;
            C1564m c1564m = this.f20763e1;
            Handler handler = c1564m.f20413b;
            if (handler != null) {
                handler.post(new y6.o(c1564m, surface, SystemClock.elapsedRealtime()));
            }
            this.f20772n1 = true;
        }
    }

    public final void w0() {
        int i9 = this.f20752C1;
        if (i9 != -1 || this.f20753D1 != -1) {
            v vVar = this.f20756G1;
            if (vVar == null || vVar.f20830a != i9 || vVar.f20831b != this.f20753D1 || vVar.f20832c != this.f20754E1 || vVar.f20833d != this.f20755F1) {
                v vVar2 = new v(this.f20755F1, i9, this.f20753D1, this.f20754E1);
                this.f20756G1 = vVar2;
                C1564m c1564m = this.f20763e1;
                Handler handler = c1564m.f20413b;
                if (handler != null) {
                    handler.post(new A6.r(c1564m, 20, vVar2));
                }
            }
        }
    }

    public final void x0(C3.m mVar, int i9) {
        w0();
        AbstractC1566a.c("releaseOutputBuffer");
        mVar.h(i9, true);
        AbstractC1566a.v();
        this.f20782z1 = SystemClock.elapsedRealtime() * 1000;
        this.f1520X0.f20696e++;
        this.f20779w1 = 0;
        v0();
    }

    public final void y0(C3.m mVar, int i9, long j) {
        w0();
        AbstractC1566a.c("releaseOutputBuffer");
        mVar.e(j, i9);
        AbstractC1566a.v();
        this.f20782z1 = SystemClock.elapsedRealtime() * 1000;
        this.f1520X0.f20696e++;
        this.f20779w1 = 0;
        v0();
    }

    @Override // C3.t
    public final m3.h z(C3.p pVar, M m9, M m10) {
        int i9;
        m3.h b9 = pVar.b(m9, m10);
        O4.d dVar = this.f20767i1;
        int i10 = dVar.f5459a;
        int i11 = b9.f20714e;
        if (m10.f19440q > i10 || m10.f19441r > dVar.f5460b) {
            i11 |= 256;
        }
        if (t0(pVar, m10) > this.f20767i1.f5461c) {
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

    public final boolean z0(C3.p pVar) {
        if (y.f20553a >= 23 && !this.f20757H1 && !q0(pVar.f1479a)) {
            if (!pVar.f1484f || k.d(this.f20761c1)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
