package w3;

import A1.i;
import A4.r;
import android.util.SparseArray;
import c7.C0790j;
import i.G;
import j3.j0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import l4.AbstractC1566a;
import l4.y;
import q3.C1902g;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;
import q3.u;
import q3.v;
import u0.z;

/* loaded from: classes.dex */
public final class d implements InterfaceC1905j {

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f24095c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f24096d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f24097e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f24098f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final UUID f24099g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Map f24100h0;

    /* renamed from: A, reason: collision with root package name */
    public long f24101A;

    /* renamed from: B, reason: collision with root package name */
    public long f24102B;

    /* renamed from: C, reason: collision with root package name */
    public i f24103C;

    /* renamed from: D, reason: collision with root package name */
    public i f24104D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f24105E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f24106F;

    /* renamed from: G, reason: collision with root package name */
    public int f24107G;

    /* renamed from: H, reason: collision with root package name */
    public long f24108H;

    /* renamed from: I, reason: collision with root package name */
    public long f24109I;

    /* renamed from: J, reason: collision with root package name */
    public int f24110J;
    public int K;

    /* renamed from: L, reason: collision with root package name */
    public int[] f24111L;

    /* renamed from: M, reason: collision with root package name */
    public int f24112M;

    /* renamed from: N, reason: collision with root package name */
    public int f24113N;

    /* renamed from: O, reason: collision with root package name */
    public int f24114O;

    /* renamed from: P, reason: collision with root package name */
    public int f24115P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f24116Q;

    /* renamed from: R, reason: collision with root package name */
    public long f24117R;

    /* renamed from: S, reason: collision with root package name */
    public int f24118S;

    /* renamed from: T, reason: collision with root package name */
    public int f24119T;

    /* renamed from: U, reason: collision with root package name */
    public int f24120U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f24121V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f24122W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f24123X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public byte f24124Z;

    /* renamed from: a, reason: collision with root package name */
    public final C2137b f24125a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f24126a0;

    /* renamed from: b, reason: collision with root package name */
    public final e f24127b;

    /* renamed from: b0, reason: collision with root package name */
    public InterfaceC1907l f24128b0;

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f24129c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24130d;

    /* renamed from: e, reason: collision with root package name */
    public final r f24131e;

    /* renamed from: f, reason: collision with root package name */
    public final r f24132f;

    /* renamed from: g, reason: collision with root package name */
    public final r f24133g;

    /* renamed from: h, reason: collision with root package name */
    public final r f24134h;

    /* renamed from: i, reason: collision with root package name */
    public final r f24135i;
    public final r j;

    /* renamed from: k, reason: collision with root package name */
    public final r f24136k;

    /* renamed from: l, reason: collision with root package name */
    public final r f24137l;

    /* renamed from: m, reason: collision with root package name */
    public final r f24138m;

    /* renamed from: n, reason: collision with root package name */
    public final r f24139n;

    /* renamed from: o, reason: collision with root package name */
    public ByteBuffer f24140o;

    /* renamed from: p, reason: collision with root package name */
    public long f24141p;

    /* renamed from: q, reason: collision with root package name */
    public long f24142q;

    /* renamed from: r, reason: collision with root package name */
    public long f24143r;

    /* renamed from: s, reason: collision with root package name */
    public long f24144s;

    /* renamed from: t, reason: collision with root package name */
    public long f24145t;

    /* renamed from: u, reason: collision with root package name */
    public C2138c f24146u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f24147v;

    /* renamed from: w, reason: collision with root package name */
    public int f24148w;

    /* renamed from: x, reason: collision with root package name */
    public long f24149x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24150y;

    /* renamed from: z, reason: collision with root package name */
    public long f24151z;

    static {
        int i9 = y.f20553a;
        f24096d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(O5.e.f5491c);
        f24097e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f24098f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f24099g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        z.h(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        z.h(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f24100h0 = Collections.unmodifiableMap(hashMap);
    }

    public d(int i9) {
        boolean z9;
        C2137b c2137b = new C2137b();
        this.f24142q = -1L;
        this.f24143r = -9223372036854775807L;
        this.f24144s = -9223372036854775807L;
        this.f24145t = -9223372036854775807L;
        this.f24151z = -1L;
        this.f24101A = -1L;
        this.f24102B = -9223372036854775807L;
        this.f24125a = c2137b;
        c2137b.f24043d = new G(19, this);
        if ((i9 & 1) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f24130d = z9;
        this.f24127b = new e();
        this.f24129c = new SparseArray();
        this.f24133g = new r(4);
        this.f24134h = new r(ByteBuffer.allocate(4).putInt(-1).array());
        this.f24135i = new r(4);
        this.f24131e = new r(AbstractC1566a.f20476d);
        this.f24132f = new r(4);
        this.j = new r(5, false);
        this.f24136k = new r(5, false);
        this.f24137l = new r(8);
        this.f24138m = new r(5, false);
        this.f24139n = new r(5, false);
        this.f24111L = new int[1];
    }

    public static byte[] g(long j, String str, long j4) {
        boolean z9;
        if (j != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        int i9 = (int) (j / 3600000000L);
        long j9 = j - (i9 * 3600000000L);
        int i10 = (int) (j9 / 60000000);
        long j10 = j9 - (i10 * 60000000);
        int i11 = (int) (j10 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j10 - (i11 * 1000000)) / j4)));
        int i12 = y.f20553a;
        return format.getBytes(O5.e.f5491c);
    }

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        this.f24102B = -9223372036854775807L;
        this.f24107G = 0;
        C2137b c2137b = this.f24125a;
        c2137b.f24044e = 0;
        c2137b.f24041b.clear();
        e eVar = c2137b.f24042c;
        eVar.f24154b = 0;
        eVar.f24155c = 0;
        e eVar2 = this.f24127b;
        eVar2.f24154b = 0;
        eVar2.f24155c = 0;
        l();
        int i9 = 0;
        while (true) {
            SparseArray sparseArray = this.f24129c;
            if (i9 < sparseArray.size()) {
                v vVar = ((C2138c) sparseArray.valueAt(i9)).f24065T;
                if (vVar != null) {
                    vVar.f22352b = false;
                    vVar.f22353c = 0;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public final void c(int i9) {
        if (this.f24103C != null && this.f24104D != null) {
            return;
        }
        throw j0.a("Element " + i9 + " must be in a Cues", null);
    }

    public final void d(int i9) {
        if (this.f24146u != null) {
            return;
        }
        throw j0.a("Element " + i9 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(w3.C2138c r23, long r24, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.d.e(w3.c, long, int, int, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0dba, code lost:
    
        r20 = true;
        r48 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x118c, code lost:
    
        if (r20 == false) goto L835;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x118e, code lost:
    
        r3 = r51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x119e, code lost:
    
        if (r3.h(r53, ((q3.C1902g) r52).E()) == false) goto L886;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x11a0, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x11a7, code lost:
    
        r9 = r2;
        r0 = r3;
        r4 = r5;
        r5 = r6;
        r6 = r38;
        r1 = r48;
        r2 = r49;
        r3 = r50;
        r10 = 0;
        r18 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0a68, code lost:
    
        if (r1.q() == r9.getLeastSignificantBits()) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x11a3, code lost:
    
        r3 = r51;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:113:0x0268. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:122:0x04c0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x06b3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0ad4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0ae7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0cc8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0ad6  */
    /* JADX WARN: Type inference failed for: r0v7, types: [w3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v88, types: [w3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v100, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r1v163 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Type inference failed for: r1v59, types: [q3.k, q3.g] */
    /* JADX WARN: Type inference failed for: r1v99 */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [w3.e] */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v17, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r8v54, types: [boolean] */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(q3.InterfaceC1906k r52, c7.C0790j r53) {
        /*
            Method dump skipped, instructions count: 5430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.d.f(q3.k, c7.j):int");
    }

    public final boolean h(C0790j c0790j, long j) {
        if (this.f24150y) {
            this.f24101A = j;
            c0790j.f11723a = this.f24151z;
            this.f24150y = false;
            return true;
        }
        if (this.f24147v) {
            long j4 = this.f24101A;
            if (j4 != -1) {
                c0790j.f11723a = j4;
                this.f24101A = -1L;
                return true;
            }
        }
        return false;
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f24128b0 = interfaceC1907l;
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        i iVar = new i(7);
        C1902g c1902g = (C1902g) interfaceC1906k;
        long j = c1902g.f22311c;
        long j4 = 1024;
        if (j != -1 && j <= 1024) {
            j4 = j;
        }
        int i9 = (int) j4;
        r rVar = (r) iVar.f25b;
        c1902g.t((byte[]) rVar.f384c, 0, 4, false);
        long y9 = rVar.y();
        iVar.f24a = 4;
        while (true) {
            if (y9 != 440786851) {
                int i10 = iVar.f24a + 1;
                iVar.f24a = i10;
                if (i10 == i9) {
                    break;
                }
                c1902g.t((byte[]) rVar.f384c, 0, 1, false);
                y9 = ((y9 << 8) & (-256)) | (((byte[]) rVar.f384c)[0] & 255);
            } else {
                long k5 = iVar.k(c1902g);
                long j9 = iVar.f24a;
                if (k5 != Long.MIN_VALUE && (j == -1 || j9 + k5 < j)) {
                    while (true) {
                        long j10 = iVar.f24a;
                        long j11 = j9 + k5;
                        if (j10 < j11) {
                            if (iVar.k(c1902g) != Long.MIN_VALUE) {
                                long k9 = iVar.k(c1902g);
                                if (k9 < 0 || k9 > 2147483647L) {
                                    break;
                                }
                                if (k9 != 0) {
                                    int i11 = (int) k9;
                                    c1902g.c(i11, false);
                                    iVar.f24a += i11;
                                }
                            } else {
                                break;
                            }
                        } else if (j10 == j11) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void k(C1902g c1902g, int i9) {
        r rVar = this.f24133g;
        if (rVar.f383b >= i9) {
            return;
        }
        byte[] bArr = (byte[]) rVar.f384c;
        if (bArr.length < i9) {
            rVar.f(Math.max(bArr.length * 2, i9));
        }
        byte[] bArr2 = (byte[]) rVar.f384c;
        int i10 = rVar.f383b;
        c1902g.e(bArr2, i10, i9 - i10, false);
        rVar.G(i9);
    }

    public final void l() {
        this.f24118S = 0;
        this.f24119T = 0;
        this.f24120U = 0;
        this.f24121V = false;
        this.f24122W = false;
        this.f24123X = false;
        this.Y = 0;
        this.f24124Z = (byte) 0;
        this.f24126a0 = false;
        this.j.E(0);
    }

    public final long m(long j) {
        long j4 = this.f24143r;
        if (j4 != -9223372036854775807L) {
            return y.O(j, j4, 1000L);
        }
        throw j0.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final int n(C1902g c1902g, C2138c c2138c, int i9, boolean z9) {
        int a5;
        int a9;
        boolean z10;
        boolean z11;
        int i10;
        if ("S_TEXT/UTF8".equals(c2138c.f24071b)) {
            o(c1902g, f24095c0, i9);
            int i11 = this.f24119T;
            l();
            return i11;
        }
        if ("S_TEXT/ASS".equals(c2138c.f24071b)) {
            o(c1902g, f24097e0, i9);
            int i12 = this.f24119T;
            l();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(c2138c.f24071b)) {
            o(c1902g, f24098f0, i9);
            int i13 = this.f24119T;
            l();
            return i13;
        }
        u uVar = c2138c.f24069X;
        boolean z12 = this.f24121V;
        boolean z13 = true;
        r rVar = this.j;
        if (!z12) {
            boolean z14 = c2138c.f24077h;
            r rVar2 = this.f24133g;
            if (z14) {
                this.f24114O &= -1073741825;
                int i14 = 128;
                if (!this.f24122W) {
                    c1902g.e((byte[]) rVar2.f384c, 0, 1, false);
                    this.f24118S++;
                    byte b9 = ((byte[]) rVar2.f384c)[0];
                    if ((b9 & 128) != 128) {
                        this.f24124Z = b9;
                        this.f24122W = true;
                    } else {
                        throw j0.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b10 = this.f24124Z;
                if ((b10 & 1) == 1) {
                    if ((b10 & 2) == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f24114O |= 1073741824;
                    if (!this.f24126a0) {
                        r rVar3 = this.f24137l;
                        c1902g.e((byte[]) rVar3.f384c, 0, 8, false);
                        this.f24118S += 8;
                        this.f24126a0 = true;
                        byte[] bArr = (byte[]) rVar2.f384c;
                        if (!z11) {
                            i14 = 0;
                        }
                        bArr[0] = (byte) (i14 | 8);
                        rVar2.H(0);
                        uVar.b(1, rVar2);
                        this.f24119T++;
                        rVar3.H(0);
                        uVar.b(8, rVar3);
                        this.f24119T += 8;
                    }
                    if (z11) {
                        if (!this.f24123X) {
                            c1902g.e((byte[]) rVar2.f384c, 0, 1, false);
                            this.f24118S++;
                            rVar2.H(0);
                            this.Y = rVar2.x();
                            this.f24123X = true;
                        }
                        int i15 = this.Y * 4;
                        rVar2.E(i15);
                        c1902g.e((byte[]) rVar2.f384c, 0, i15, false);
                        this.f24118S += i15;
                        short s9 = (short) ((this.Y / 2) + 1);
                        int i16 = (s9 * 6) + 2;
                        ByteBuffer byteBuffer = this.f24140o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f24140o = ByteBuffer.allocate(i16);
                        }
                        this.f24140o.position(0);
                        this.f24140o.putShort(s9);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i10 = this.Y;
                            if (i17 >= i10) {
                                break;
                            }
                            int A2 = rVar2.A();
                            if (i17 % 2 == 0) {
                                this.f24140o.putShort((short) (A2 - i18));
                            } else {
                                this.f24140o.putInt(A2 - i18);
                            }
                            i17++;
                            i18 = A2;
                        }
                        int i19 = (i9 - this.f24118S) - i18;
                        if (i10 % 2 == 1) {
                            this.f24140o.putInt(i19);
                        } else {
                            this.f24140o.putShort((short) i19);
                            this.f24140o.putInt(0);
                        }
                        byte[] array = this.f24140o.array();
                        r rVar4 = this.f24138m;
                        rVar4.F(i16, array);
                        uVar.b(i16, rVar4);
                        this.f24119T += i16;
                    }
                }
            } else {
                byte[] bArr2 = c2138c.f24078i;
                if (bArr2 != null) {
                    rVar.F(bArr2.length, bArr2);
                }
            }
            if ("A_OPUS".equals(c2138c.f24071b)) {
                z10 = z9;
            } else if (c2138c.f24075f > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f24114O |= 268435456;
                this.f24139n.E(0);
                int i20 = (rVar.f383b + i9) - this.f24118S;
                rVar2.E(4);
                byte[] bArr3 = (byte[]) rVar2.f384c;
                bArr3[0] = (byte) ((i20 >> 24) & 255);
                bArr3[1] = (byte) ((i20 >> 16) & 255);
                bArr3[2] = (byte) ((i20 >> 8) & 255);
                bArr3[3] = (byte) (i20 & 255);
                uVar.b(4, rVar2);
                this.f24119T += 4;
            }
            this.f24121V = true;
        }
        int i21 = i9 + rVar.f383b;
        if (!"V_MPEG4/ISO/AVC".equals(c2138c.f24071b) && !"V_MPEGH/ISO/HEVC".equals(c2138c.f24071b)) {
            if (c2138c.f24065T != null) {
                if (rVar.f383b != 0) {
                    z13 = false;
                }
                AbstractC1566a.m(z13);
                c2138c.f24065T.c(c1902g);
            }
            while (true) {
                int i22 = this.f24118S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                int e8 = rVar.e();
                if (e8 > 0) {
                    a9 = Math.min(i23, e8);
                    uVar.c(a9, rVar);
                } else {
                    a9 = uVar.a(c1902g, i23, false);
                }
                this.f24118S += a9;
                this.f24119T += a9;
            }
        } else {
            r rVar5 = this.f24132f;
            byte[] bArr4 = (byte[]) rVar5.f384c;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i24 = c2138c.Y;
            int i25 = 4 - i24;
            while (this.f24118S < i21) {
                int i26 = this.f24120U;
                if (i26 == 0) {
                    int min = Math.min(i24, rVar.e());
                    c1902g.e(bArr4, i25 + min, i24 - min, false);
                    if (min > 0) {
                        rVar.h(bArr4, i25, min);
                    }
                    this.f24118S += i24;
                    rVar5.H(0);
                    this.f24120U = rVar5.A();
                    r rVar6 = this.f24131e;
                    rVar6.H(0);
                    uVar.c(4, rVar6);
                    this.f24119T += 4;
                } else {
                    int e9 = rVar.e();
                    if (e9 > 0) {
                        a5 = Math.min(i26, e9);
                        uVar.c(a5, rVar);
                    } else {
                        a5 = uVar.a(c1902g, i26, false);
                    }
                    this.f24118S += a5;
                    this.f24119T += a5;
                    this.f24120U -= a5;
                }
            }
        }
        if ("A_VORBIS".equals(c2138c.f24071b)) {
            r rVar7 = this.f24134h;
            rVar7.H(0);
            uVar.c(4, rVar7);
            this.f24119T += 4;
        }
        int i27 = this.f24119T;
        l();
        return i27;
    }

    public final void o(C1902g c1902g, byte[] bArr, int i9) {
        int length = bArr.length + i9;
        r rVar = this.f24136k;
        byte[] bArr2 = (byte[]) rVar.f384c;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i9);
            rVar.F(copyOf.length, copyOf);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        c1902g.e((byte[]) rVar.f384c, bArr.length, i9, false);
        rVar.H(0);
        rVar.G(length);
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
