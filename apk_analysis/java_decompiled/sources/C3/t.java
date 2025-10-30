package C3;

import N3.d0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import j3.AbstractC1449d;
import j3.C1462m;
import j3.M;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import l3.AbstractC1552a;
import l4.AbstractC1566a;
import m3.C1589b;
import m3.InterfaceC1588a;
import n3.C1631h;
import n3.C1646w;
import n3.InterfaceC1632i;

/* loaded from: classes.dex */
public abstract class t extends AbstractC1449d {

    /* renamed from: b1, reason: collision with root package name */
    public static final byte[] f1491b1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A, reason: collision with root package name */
    public M f1492A;

    /* renamed from: A0, reason: collision with root package name */
    public long f1493A0;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC1632i f1494B;

    /* renamed from: B0, reason: collision with root package name */
    public int f1495B0;

    /* renamed from: C, reason: collision with root package name */
    public InterfaceC1632i f1496C;

    /* renamed from: C0, reason: collision with root package name */
    public int f1497C0;

    /* renamed from: D, reason: collision with root package name */
    public MediaCrypto f1498D;

    /* renamed from: D0, reason: collision with root package name */
    public ByteBuffer f1499D0;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f1500E0;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f1501F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f1502G0;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f1503H0;

    /* renamed from: I0, reason: collision with root package name */
    public boolean f1504I0;

    /* renamed from: J0, reason: collision with root package name */
    public boolean f1505J0;

    /* renamed from: K0, reason: collision with root package name */
    public int f1506K0;

    /* renamed from: L0, reason: collision with root package name */
    public int f1507L0;

    /* renamed from: M0, reason: collision with root package name */
    public int f1508M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f1509N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f1510O0;

    /* renamed from: P0, reason: collision with root package name */
    public boolean f1511P0;

    /* renamed from: Q0, reason: collision with root package name */
    public long f1512Q0;

    /* renamed from: R0, reason: collision with root package name */
    public long f1513R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f1514S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f1515T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f1516U0;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f1517V0;

    /* renamed from: W0, reason: collision with root package name */
    public C1462m f1518W0;

    /* renamed from: X, reason: collision with root package name */
    public boolean f1519X;

    /* renamed from: X0, reason: collision with root package name */
    public m3.d f1520X0;
    public final long Y;

    /* renamed from: Y0, reason: collision with root package name */
    public long f1521Y0;

    /* renamed from: Z, reason: collision with root package name */
    public float f1522Z;

    /* renamed from: Z0, reason: collision with root package name */
    public long f1523Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f1524a1;

    /* renamed from: f0, reason: collision with root package name */
    public float f1525f0;

    /* renamed from: g0, reason: collision with root package name */
    public m f1526g0;

    /* renamed from: h0, reason: collision with root package name */
    public M f1527h0;

    /* renamed from: i0, reason: collision with root package name */
    public MediaFormat f1528i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f1529j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f1530k0;

    /* renamed from: l0, reason: collision with root package name */
    public ArrayDeque f1531l0;

    /* renamed from: m, reason: collision with root package name */
    public final l f1532m;

    /* renamed from: m0, reason: collision with root package name */
    public s f1533m0;

    /* renamed from: n, reason: collision with root package name */
    public final u f1534n;

    /* renamed from: n0, reason: collision with root package name */
    public p f1535n0;

    /* renamed from: o, reason: collision with root package name */
    public final float f1536o;

    /* renamed from: o0, reason: collision with root package name */
    public int f1537o0;

    /* renamed from: p, reason: collision with root package name */
    public final m3.f f1538p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f1539p0;

    /* renamed from: q, reason: collision with root package name */
    public final m3.f f1540q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f1541q0;

    /* renamed from: r, reason: collision with root package name */
    public final m3.f f1542r;
    public boolean r0;

    /* renamed from: s, reason: collision with root package name */
    public final i f1543s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f1544s0;

    /* renamed from: t, reason: collision with root package name */
    public final K5.p f1545t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f1546t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f1547u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f1548u0;

    /* renamed from: v, reason: collision with root package name */
    public final MediaCodec.BufferInfo f1549v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f1550v0;

    /* renamed from: w, reason: collision with root package name */
    public final long[] f1551w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f1552w0;

    /* renamed from: x, reason: collision with root package name */
    public final long[] f1553x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f1554x0;

    /* renamed from: y, reason: collision with root package name */
    public final long[] f1555y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f1556y0;

    /* renamed from: z, reason: collision with root package name */
    public M f1557z;

    /* renamed from: z0, reason: collision with root package name */
    public j f1558z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v4, types: [C3.i, m3.f] */
    public t(int i9, l lVar, float f9) {
        super(i9);
        u uVar = u.f1559b;
        this.f1532m = lVar;
        this.f1534n = uVar;
        this.f1536o = f9;
        this.f1538p = new m3.f(0);
        this.f1540q = new m3.f(0);
        this.f1542r = new m3.f(2);
        ?? fVar = new m3.f(2);
        fVar.f1469k = 32;
        this.f1543s = fVar;
        this.f1545t = new K5.p();
        this.f1547u = new ArrayList();
        this.f1549v = new MediaCodec.BufferInfo();
        this.f1522Z = 1.0f;
        this.f1525f0 = 1.0f;
        this.Y = -9223372036854775807L;
        this.f1551w = new long[10];
        this.f1553x = new long[10];
        this.f1555y = new long[10];
        this.f1521Y0 = -9223372036854775807L;
        i0(-9223372036854775807L);
        fVar.t(0);
        fVar.f20704d.order(ByteOrder.nativeOrder());
        this.f1530k0 = -1.0f;
        this.f1537o0 = 0;
        this.f1506K0 = 0;
        this.f1495B0 = -1;
        this.f1497C0 = -1;
        this.f1493A0 = -9223372036854775807L;
        this.f1512Q0 = -9223372036854775807L;
        this.f1513R0 = -9223372036854775807L;
        this.f1507L0 = 0;
        this.f1508M0 = 0;
    }

    public n A(IllegalStateException illegalStateException, p pVar) {
        return new n(illegalStateException, pVar);
    }

    public final void B() {
        this.f1504I0 = false;
        this.f1543s.r();
        this.f1542r.r();
        this.f1503H0 = false;
        this.f1502G0 = false;
    }

    public final boolean C() {
        if (this.f1509N0) {
            this.f1507L0 = 1;
            if (!this.f1541q0 && !this.f1544s0) {
                this.f1508M0 = 2;
                return true;
            }
            this.f1508M0 = 3;
            return false;
        }
        n0();
        return true;
    }

    public final boolean D(long j, long j4) {
        boolean z9;
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        boolean b02;
        boolean z12;
        int d9;
        boolean z13;
        boolean z14;
        if (this.f1497C0 >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        MediaCodec.BufferInfo bufferInfo2 = this.f1549v;
        if (!z9) {
            if (this.f1546t0 && this.f1510O0) {
                try {
                    d9 = this.f1526g0.d(bufferInfo2);
                } catch (IllegalStateException unused) {
                    a0();
                    if (this.f1515T0) {
                        d0();
                    }
                }
            } else {
                d9 = this.f1526g0.d(bufferInfo2);
            }
            if (d9 < 0) {
                if (d9 == -2) {
                    this.f1511P0 = true;
                    MediaFormat n7 = this.f1526g0.n();
                    if (this.f1537o0 != 0 && n7.getInteger("width") == 32 && n7.getInteger("height") == 32) {
                        this.f1554x0 = true;
                        return true;
                    }
                    if (this.f1550v0) {
                        n7.setInteger("channel-count", 1);
                    }
                    this.f1528i0 = n7;
                    this.f1529j0 = true;
                    return true;
                }
                if (this.f1556y0 && (this.f1514S0 || this.f1507L0 == 2)) {
                    a0();
                    return false;
                }
                return false;
            }
            if (this.f1554x0) {
                this.f1554x0 = false;
                this.f1526g0.h(d9, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                a0();
                return false;
            }
            this.f1497C0 = d9;
            ByteBuffer u9 = this.f1526g0.u(d9);
            this.f1499D0 = u9;
            if (u9 != null) {
                u9.position(bufferInfo2.offset);
                this.f1499D0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f1548u0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j9 = this.f1512Q0;
                if (j9 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j9;
                }
            }
            long j10 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.f1547u;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    if (((Long) arrayList.get(i9)).longValue() == j10) {
                        arrayList.remove(i9);
                        z13 = true;
                        break;
                    }
                    i9++;
                } else {
                    z13 = false;
                    break;
                }
            }
            this.f1500E0 = z13;
            long j11 = this.f1513R0;
            long j12 = bufferInfo2.presentationTimeUs;
            if (j11 == j12) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f1501F0 = z14;
            o0(j12);
        }
        if (this.f1546t0 && this.f1510O0) {
            try {
                z10 = true;
                z11 = false;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z11 = false;
            }
            try {
                b02 = b0(j, j4, this.f1526g0, this.f1499D0, this.f1497C0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f1500E0, this.f1501F0, this.f1492A);
            } catch (IllegalStateException unused3) {
                a0();
                if (this.f1515T0) {
                    d0();
                    return z11;
                }
                return z11;
            }
        } else {
            z10 = true;
            z11 = false;
            bufferInfo = bufferInfo2;
            b02 = b0(j, j4, this.f1526g0, this.f1499D0, this.f1497C0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f1500E0, this.f1501F0, this.f1492A);
        }
        if (b02) {
            X(bufferInfo.presentationTimeUs);
            if ((bufferInfo.flags & 4) != 0) {
                z12 = z10;
            } else {
                z12 = z11;
            }
            this.f1497C0 = -1;
            this.f1499D0 = null;
            if (!z12) {
                return z10;
            }
            a0();
            return z11;
        }
        return z11;
    }

    public final boolean E() {
        boolean z9;
        m mVar = this.f1526g0;
        if (mVar != null && this.f1507L0 != 2 && !this.f1514S0) {
            int i9 = this.f1495B0;
            m3.f fVar = this.f1540q;
            if (i9 < 0) {
                int v8 = mVar.v();
                this.f1495B0 = v8;
                if (v8 >= 0) {
                    fVar.f20704d = this.f1526g0.o(v8);
                    fVar.r();
                }
            }
            if (this.f1507L0 == 1) {
                if (!this.f1556y0) {
                    this.f1510O0 = true;
                    this.f1526g0.w(this.f1495B0, 0, 0L, 4);
                    this.f1495B0 = -1;
                    fVar.f20704d = null;
                }
                this.f1507L0 = 2;
                return false;
            }
            if (this.f1552w0) {
                this.f1552w0 = false;
                fVar.f20704d.put(f1491b1);
                this.f1526g0.w(this.f1495B0, 38, 0L, 0);
                this.f1495B0 = -1;
                fVar.f20704d = null;
                this.f1509N0 = true;
                return true;
            }
            if (this.f1506K0 == 1) {
                for (int i10 = 0; i10 < this.f1527h0.f19437n.size(); i10++) {
                    fVar.f20704d.put((byte[]) this.f1527h0.f19437n.get(i10));
                }
                this.f1506K0 = 2;
            }
            int position = fVar.f20704d.position();
            O0.c cVar = this.f19585b;
            cVar.j();
            try {
                int r5 = r(cVar, fVar, 0);
                if (h()) {
                    this.f1513R0 = this.f1512Q0;
                }
                if (r5 != -3) {
                    if (r5 == -5) {
                        if (this.f1506K0 == 2) {
                            fVar.r();
                            this.f1506K0 = 1;
                        }
                        U(cVar);
                        return true;
                    }
                    if (fVar.e(4)) {
                        if (this.f1506K0 == 2) {
                            fVar.r();
                            this.f1506K0 = 1;
                        }
                        this.f1514S0 = true;
                        if (!this.f1509N0) {
                            a0();
                            return false;
                        }
                        try {
                            if (!this.f1556y0) {
                                this.f1510O0 = true;
                                this.f1526g0.w(this.f1495B0, 0, 0L, 4);
                                this.f1495B0 = -1;
                                fVar.f20704d = null;
                                return false;
                            }
                        } catch (MediaCodec.CryptoException e8) {
                            throw e(e8, this.f1557z, false, l4.y.s(e8.getErrorCode()));
                        }
                    } else {
                        if (!this.f1509N0 && !fVar.e(1)) {
                            fVar.r();
                            if (this.f1506K0 == 2) {
                                this.f1506K0 = 1;
                                return true;
                            }
                        } else {
                            boolean e9 = fVar.e(1073741824);
                            C1589b c1589b = fVar.f20703c;
                            if (e9) {
                                if (position == 0) {
                                    c1589b.getClass();
                                } else {
                                    if (c1589b.f20686d == null) {
                                        int[] iArr = new int[1];
                                        c1589b.f20686d = iArr;
                                        c1589b.f20691i.numBytesOfClearData = iArr;
                                    }
                                    int[] iArr2 = c1589b.f20686d;
                                    iArr2[0] = iArr2[0] + position;
                                }
                            }
                            if (this.f1539p0 && !e9) {
                                ByteBuffer byteBuffer = fVar.f20704d;
                                int position2 = byteBuffer.position();
                                int i11 = 0;
                                int i12 = 0;
                                while (true) {
                                    int i13 = i11 + 1;
                                    if (i13 < position2) {
                                        int i14 = byteBuffer.get(i11) & 255;
                                        if (i12 == 3) {
                                            if (i14 == 1 && (byteBuffer.get(i13) & 31) == 7) {
                                                ByteBuffer duplicate = byteBuffer.duplicate();
                                                duplicate.position(i11 - 3);
                                                duplicate.limit(position2);
                                                byteBuffer.position(0);
                                                byteBuffer.put(duplicate);
                                                break;
                                            }
                                        } else if (i14 == 0) {
                                            i12++;
                                        }
                                        if (i14 != 0) {
                                            i12 = 0;
                                        }
                                        i11 = i13;
                                    } else {
                                        byteBuffer.clear();
                                        break;
                                    }
                                }
                                if (fVar.f20704d.position() != 0) {
                                    this.f1539p0 = false;
                                }
                            }
                            long j = fVar.f20706f;
                            j jVar = this.f1558z0;
                            if (jVar != null) {
                                M m9 = this.f1557z;
                                if (jVar.f1471b == 0) {
                                    jVar.f1470a = j;
                                }
                                if (!jVar.f1472c) {
                                    ByteBuffer byteBuffer2 = fVar.f20704d;
                                    byteBuffer2.getClass();
                                    int i15 = 0;
                                    for (int i16 = 0; i16 < 4; i16++) {
                                        i15 = (i15 << 8) | (byteBuffer2.get(i16) & 255);
                                    }
                                    int j4 = AbstractC1552a.j(i15);
                                    if (j4 == -1) {
                                        jVar.f1472c = true;
                                        jVar.f1471b = 0L;
                                        jVar.f1470a = fVar.f20706f;
                                        AbstractC1566a.P("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                        j = fVar.f20706f;
                                    } else {
                                        j = Math.max(0L, ((jVar.f1471b - 529) * 1000000) / m9.f19449z) + jVar.f1470a;
                                        jVar.f1471b += j4;
                                    }
                                }
                                long j9 = this.f1512Q0;
                                j jVar2 = this.f1558z0;
                                M m10 = this.f1557z;
                                jVar2.getClass();
                                long j10 = m10.f19449z;
                                z9 = e9;
                                this.f1512Q0 = Math.max(j9, Math.max(0L, ((jVar2.f1471b - 529) * 1000000) / j10) + jVar2.f1470a);
                            } else {
                                z9 = e9;
                            }
                            if (fVar.e(Integer.MIN_VALUE)) {
                                this.f1547u.add(Long.valueOf(j));
                            }
                            if (this.f1516U0) {
                                this.f1545t.a(j, this.f1557z);
                                this.f1516U0 = false;
                            }
                            this.f1512Q0 = Math.max(this.f1512Q0, j);
                            fVar.u();
                            if (fVar.e(268435456)) {
                                N(fVar);
                            }
                            Z(fVar);
                            try {
                                if (z9) {
                                    this.f1526g0.r(this.f1495B0, c1589b, j);
                                } else {
                                    this.f1526g0.w(this.f1495B0, fVar.f20704d.limit(), j, 0);
                                }
                                this.f1495B0 = -1;
                                fVar.f20704d = null;
                                this.f1509N0 = true;
                                this.f1506K0 = 0;
                                this.f1520X0.f20694c++;
                                return true;
                            } catch (MediaCodec.CryptoException e10) {
                                throw e(e10, this.f1557z, false, l4.y.s(e10.getErrorCode()));
                            }
                        }
                        return true;
                    }
                }
            } catch (m3.e e11) {
                R(e11);
                c0(0);
                F();
                return true;
            }
        }
        return false;
    }

    public final void F() {
        try {
            this.f1526g0.flush();
        } finally {
            f0();
        }
    }

    public final boolean G() {
        boolean z9;
        if (this.f1526g0 == null) {
            return false;
        }
        int i9 = this.f1508M0;
        if (i9 != 3 && !this.f1541q0 && ((!this.r0 || this.f1511P0) && (!this.f1544s0 || !this.f1510O0))) {
            if (i9 == 2) {
                int i10 = l4.y.f20553a;
                if (i10 >= 23) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                AbstractC1566a.m(z9);
                if (i10 >= 23) {
                    try {
                        n0();
                    } catch (C1462m e8) {
                        AbstractC1566a.Q("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e8);
                        d0();
                        return true;
                    }
                }
            }
            F();
            return false;
        }
        d0();
        return true;
    }

    public final List H(boolean z9) {
        M m9 = this.f1557z;
        u uVar = this.f1534n;
        ArrayList K = K(uVar, m9, z9);
        if (K.isEmpty() && z9) {
            ArrayList K6 = K(uVar, this.f1557z, false);
            if (!K6.isEmpty()) {
                AbstractC1566a.P("MediaCodecRenderer", "Drm session requires secure decoder for " + this.f1557z.f19435l + ", but no secure decoder available. Trying to proceed with " + K6 + ".");
            }
            return K6;
        }
        return K;
    }

    public boolean I() {
        return false;
    }

    public abstract float J(float f9, M[] mArr);

    public abstract ArrayList K(u uVar, M m9, boolean z9);

    public final C1646w L(InterfaceC1632i interfaceC1632i) {
        InterfaceC1588a g9 = interfaceC1632i.g();
        if (g9 != null && !(g9 instanceof C1646w)) {
            throw e(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + g9), this.f1557z, false, 6001);
        }
        return (C1646w) g9;
    }

    public abstract k M(p pVar, M m9, MediaCrypto mediaCrypto, float f9);

    /* JADX WARN: Code restructure failed: missing block: B:127:0x014f, code lost:
    
        if ("stvm8".equals(r5) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x015f, code lost:
    
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r4) == false) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023e  */
    /* JADX WARN: Type inference failed for: r0v9, types: [C3.j, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O(C3.p r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.t.O(C3.p, android.media.MediaCrypto):void");
    }

    public final void P() {
        M m9;
        boolean z9;
        if (this.f1526g0 == null && !this.f1502G0 && (m9 = this.f1557z) != null) {
            if (this.f1496C == null && k0(m9)) {
                M m10 = this.f1557z;
                B();
                String str = m10.f19435l;
                boolean equals = "audio/mp4a-latm".equals(str);
                i iVar = this.f1543s;
                if (!equals && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    iVar.getClass();
                    iVar.f1469k = 1;
                } else {
                    iVar.getClass();
                    iVar.f1469k = 32;
                }
                this.f1502G0 = true;
                return;
            }
            h0(this.f1496C);
            String str2 = this.f1557z.f19435l;
            InterfaceC1632i interfaceC1632i = this.f1494B;
            if (interfaceC1632i != null) {
                if (this.f1498D == null) {
                    C1646w L8 = L(interfaceC1632i);
                    if (L8 == null) {
                        if (this.f1494B.f() == null) {
                            return;
                        }
                    } else {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(L8.f21141a, L8.f21142b);
                            this.f1498D = mediaCrypto;
                            if (!L8.f21143c && mediaCrypto.requiresSecureDecoderComponent(str2)) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            this.f1519X = z9;
                        } catch (MediaCryptoException e8) {
                            throw e(e8, this.f1557z, false, 6006);
                        }
                    }
                }
                if (C1646w.f21140d) {
                    int state = this.f1494B.getState();
                    if (state != 1) {
                        if (state != 4) {
                            return;
                        }
                    } else {
                        C1631h f9 = this.f1494B.f();
                        f9.getClass();
                        throw e(f9, this.f1557z, false, f9.f21124a);
                    }
                }
            }
            try {
                Q(this.f1498D, this.f1519X);
            } catch (s e9) {
                throw e(e9, this.f1557z, false, 4001);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q(android.media.MediaCrypto r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.t.Q(android.media.MediaCrypto, boolean):void");
    }

    public abstract void R(Exception exc);

    public abstract void S(long j, String str, long j4);

    public abstract void T(String str);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0090, code lost:
    
        if (r13 != false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00cc, code lost:
    
        if (C() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00f2, code lost:
    
        if (r5.f19441r == r4.f19441r) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0100, code lost:
    
        if (C() == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0112, code lost:
    
        if (C() == false) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m3.h U(O0.c r13) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.t.U(O0.c):m3.h");
    }

    public abstract void V(M m9, MediaFormat mediaFormat);

    public void X(long j) {
        while (this.f1524a1 != 0) {
            long[] jArr = this.f1555y;
            if (j >= jArr[0]) {
                long[] jArr2 = this.f1551w;
                this.f1521Y0 = jArr2[0];
                long[] jArr3 = this.f1553x;
                i0(jArr3[0]);
                int i9 = this.f1524a1 - 1;
                this.f1524a1 = i9;
                System.arraycopy(jArr2, 1, jArr2, 0, i9);
                System.arraycopy(jArr3, 1, jArr3, 0, this.f1524a1);
                System.arraycopy(jArr, 1, jArr, 0, this.f1524a1);
                Y();
            } else {
                return;
            }
        }
    }

    public abstract void Y();

    public abstract void Z(m3.f fVar);

    public final void a0() {
        int i9 = this.f1508M0;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    this.f1515T0 = true;
                    e0();
                    return;
                } else {
                    d0();
                    P();
                    return;
                }
            }
            F();
            n0();
            return;
        }
        F();
    }

    public abstract boolean b0(long j, long j4, m mVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j9, boolean z9, boolean z10, M m9);

    public final boolean c0(int i9) {
        O0.c cVar = this.f19585b;
        cVar.j();
        m3.f fVar = this.f1538p;
        fVar.r();
        int r5 = r(cVar, fVar, i9 | 4);
        if (r5 == -5) {
            U(cVar);
            return true;
        }
        if (r5 == -4 && fVar.e(4)) {
            this.f1514S0 = true;
            a0();
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d0() {
        try {
            m mVar = this.f1526g0;
            if (mVar != null) {
                mVar.a();
                this.f1520X0.f20693b++;
                T(this.f1535n0.f1479a);
            }
            this.f1526g0 = null;
            try {
                MediaCrypto mediaCrypto = this.f1498D;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.f1526g0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f1498D;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void f0() {
        this.f1495B0 = -1;
        this.f1540q.f20704d = null;
        this.f1497C0 = -1;
        this.f1499D0 = null;
        this.f1493A0 = -9223372036854775807L;
        this.f1510O0 = false;
        this.f1509N0 = false;
        this.f1552w0 = false;
        this.f1554x0 = false;
        this.f1500E0 = false;
        this.f1501F0 = false;
        this.f1547u.clear();
        this.f1512Q0 = -9223372036854775807L;
        this.f1513R0 = -9223372036854775807L;
        j jVar = this.f1558z0;
        if (jVar != null) {
            jVar.f1470a = 0L;
            jVar.f1471b = 0L;
            jVar.f1472c = false;
        }
        this.f1507L0 = 0;
        this.f1508M0 = 0;
        this.f1506K0 = this.f1505J0 ? 1 : 0;
    }

    public final void g0() {
        f0();
        this.f1518W0 = null;
        this.f1558z0 = null;
        this.f1531l0 = null;
        this.f1535n0 = null;
        this.f1527h0 = null;
        this.f1528i0 = null;
        this.f1529j0 = false;
        this.f1511P0 = false;
        this.f1530k0 = -1.0f;
        this.f1537o0 = 0;
        this.f1539p0 = false;
        this.f1541q0 = false;
        this.r0 = false;
        this.f1544s0 = false;
        this.f1546t0 = false;
        this.f1548u0 = false;
        this.f1550v0 = false;
        this.f1556y0 = false;
        this.f1505J0 = false;
        this.f1506K0 = 0;
        this.f1519X = false;
    }

    public final void h0(InterfaceC1632i interfaceC1632i) {
        InterfaceC1632i interfaceC1632i2 = this.f1494B;
        if (interfaceC1632i2 != interfaceC1632i) {
            if (interfaceC1632i != null) {
                interfaceC1632i.a(null);
            }
            if (interfaceC1632i2 != null) {
                interfaceC1632i2.e(null);
            }
        }
        this.f1494B = interfaceC1632i;
    }

    @Override // j3.AbstractC1449d
    public boolean i() {
        return this.f1515T0;
    }

    public final void i0(long j) {
        this.f1523Z0 = j;
        if (j != -9223372036854775807L) {
            W();
        }
    }

    @Override // j3.AbstractC1449d
    public boolean j() {
        boolean j;
        boolean z9;
        if (this.f1557z != null) {
            if (h()) {
                j = this.f19593k;
            } else {
                d0 d0Var = this.f19590g;
                d0Var.getClass();
                j = d0Var.j();
            }
            if (!j) {
                if (this.f1497C0 >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 || (this.f1493A0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f1493A0)) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean j0(p pVar) {
        return true;
    }

    @Override // j3.AbstractC1449d
    public void k() {
        this.f1557z = null;
        this.f1521Y0 = -9223372036854775807L;
        i0(-9223372036854775807L);
        this.f1524a1 = 0;
        G();
    }

    public boolean k0(M m9) {
        return false;
    }

    public abstract int l0(u uVar, M m9);

    @Override // j3.AbstractC1449d
    public void m(long j, boolean z9) {
        int i9;
        this.f1514S0 = false;
        this.f1515T0 = false;
        this.f1517V0 = false;
        if (this.f1502G0) {
            this.f1543s.r();
            this.f1542r.r();
            this.f1503H0 = false;
        } else if (G()) {
            P();
        }
        K5.p pVar = this.f1545t;
        synchronized (pVar) {
            i9 = pVar.f4354b;
        }
        if (i9 > 0) {
            this.f1516U0 = true;
        }
        this.f1545t.b();
        int i10 = this.f1524a1;
        if (i10 != 0) {
            i0(this.f1553x[i10 - 1]);
            this.f1521Y0 = this.f1551w[this.f1524a1 - 1];
            this.f1524a1 = 0;
        }
    }

    public final boolean m0(M m9) {
        if (l4.y.f20553a >= 23 && this.f1526g0 != null && this.f1508M0 != 3 && this.f19589f != 0) {
            float f9 = this.f1525f0;
            M[] mArr = this.f19591h;
            mArr.getClass();
            float J8 = J(f9, mArr);
            float f10 = this.f1530k0;
            if (f10 != J8) {
                if (J8 == -1.0f) {
                    if (this.f1509N0) {
                        this.f1507L0 = 1;
                        this.f1508M0 = 3;
                        return false;
                    }
                    d0();
                    P();
                    return false;
                }
                if (f10 != -1.0f || J8 > this.f1536o) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", J8);
                    this.f1526g0.s(bundle);
                    this.f1530k0 = J8;
                }
            }
        }
        return true;
    }

    public final void n0() {
        try {
            this.f1498D.setMediaDrmSession(L(this.f1496C).f21142b);
            h0(this.f1496C);
            this.f1507L0 = 0;
            this.f1508M0 = 0;
        } catch (MediaCryptoException e8) {
            throw e(e8, this.f1557z, false, 6006);
        }
    }

    public final void o0(long j) {
        Object f9;
        M m9 = (M) this.f1545t.e(j);
        if (m9 == null && this.f1529j0) {
            K5.p pVar = this.f1545t;
            synchronized (pVar) {
                if (pVar.f4354b == 0) {
                    f9 = null;
                } else {
                    f9 = pVar.f();
                }
            }
            m9 = (M) f9;
        }
        if (m9 != null) {
            this.f1492A = m9;
        } else if (!this.f1529j0 || this.f1492A == null) {
            return;
        }
        V(this.f1492A, this.f1528i0);
        this.f1529j0 = false;
    }

    @Override // j3.AbstractC1449d
    public final void q(M[] mArr, long j, long j4) {
        boolean z9 = true;
        if (this.f1523Z0 == -9223372036854775807L) {
            if (this.f1521Y0 != -9223372036854775807L) {
                z9 = false;
            }
            AbstractC1566a.m(z9);
            this.f1521Y0 = j;
            i0(j4);
            return;
        }
        int i9 = this.f1524a1;
        long[] jArr = this.f1553x;
        if (i9 == jArr.length) {
            AbstractC1566a.P("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + jArr[this.f1524a1 - 1]);
        } else {
            this.f1524a1 = i9 + 1;
        }
        int i10 = this.f1524a1 - 1;
        this.f1551w[i10] = j;
        jArr[i10] = j4;
        this.f1555y[i10] = this.f1512Q0;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x006b A[LOOP:1: B:33:0x004b->B:42:0x006b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006c A[EDGE_INSN: B:43:0x006c->B:44:0x006c BREAK  A[LOOP:1: B:33:0x004b->B:42:0x006b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087 A[LOOP:2: B:45:0x006c->B:54:0x0087, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088 A[EDGE_INSN: B:55:0x0088->B:56:0x0088 BREAK  A[LOOP:2: B:45:0x006c->B:54:0x0087], SYNTHETIC] */
    @Override // j3.AbstractC1449d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.t.s(long, long):void");
    }

    @Override // j3.AbstractC1449d
    public void v(float f9, float f10) {
        this.f1522Z = f9;
        this.f1525f0 = f10;
        m0(this.f1527h0);
    }

    @Override // j3.AbstractC1449d
    public final int w(M m9) {
        try {
            return l0(this.f1534n, m9);
        } catch (y e8) {
            throw e(e8, m9, false, 4002);
        }
    }

    @Override // j3.AbstractC1449d
    public final int x() {
        return 8;
    }

    public final boolean y(long j, long j4) {
        boolean z9;
        i iVar;
        AbstractC1566a.m(!this.f1515T0);
        i iVar2 = this.f1543s;
        int i9 = iVar2.j;
        if (i9 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            iVar = iVar2;
            if (b0(j, j4, null, iVar2.f20704d, this.f1497C0, 0, i9, iVar2.f20706f, iVar2.e(Integer.MIN_VALUE), iVar2.e(4), this.f1492A)) {
                X(iVar.f1468i);
                iVar.r();
            } else {
                return false;
            }
        } else {
            iVar = iVar2;
        }
        if (this.f1514S0) {
            this.f1515T0 = true;
            return false;
        }
        boolean z10 = this.f1503H0;
        m3.f fVar = this.f1542r;
        if (z10) {
            AbstractC1566a.m(iVar.v(fVar));
            this.f1503H0 = false;
        }
        if (this.f1504I0) {
            if (iVar.j > 0) {
                return true;
            }
            B();
            this.f1504I0 = false;
            P();
            if (!this.f1502G0) {
                return false;
            }
        }
        AbstractC1566a.m(!this.f1514S0);
        O0.c cVar = this.f19585b;
        cVar.j();
        fVar.r();
        while (true) {
            fVar.r();
            int r5 = r(cVar, fVar, 0);
            if (r5 != -5) {
                if (r5 != -4) {
                    if (r5 != -3) {
                        throw new IllegalStateException();
                    }
                } else {
                    if (fVar.e(4)) {
                        this.f1514S0 = true;
                        break;
                    }
                    if (this.f1516U0) {
                        M m9 = this.f1557z;
                        m9.getClass();
                        this.f1492A = m9;
                        V(m9, null);
                        this.f1516U0 = false;
                    }
                    fVar.u();
                    if (!iVar.v(fVar)) {
                        this.f1503H0 = true;
                        break;
                    }
                }
            } else {
                U(cVar);
                break;
            }
        }
        if (iVar.j > 0) {
            iVar.u();
        }
        if (iVar.j <= 0 && !this.f1514S0 && !this.f1504I0) {
            return false;
        }
        return true;
    }

    public abstract m3.h z(p pVar, M m9, M m10);

    public void W() {
    }

    public void e0() {
    }

    public void N(m3.f fVar) {
    }
}
