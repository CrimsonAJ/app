package o7;

import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.EOFException;
import java.io.IOException;
import k4.C1499E;
import x8.C2187g;
import x8.C2190j;
import x8.InterfaceC2189i;

/* renamed from: o7.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1723o extends AbstractC1722n {

    /* renamed from: k, reason: collision with root package name */
    public static final C2190j f21691k;

    /* renamed from: l, reason: collision with root package name */
    public static final C2190j f21692l;

    /* renamed from: m, reason: collision with root package name */
    public static final C2190j f21693m;

    /* renamed from: n, reason: collision with root package name */
    public static final C2190j f21694n;

    /* renamed from: o, reason: collision with root package name */
    public static final C2190j f21695o;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC2189i f21696e;

    /* renamed from: f, reason: collision with root package name */
    public final C2187g f21697f;

    /* renamed from: g, reason: collision with root package name */
    public int f21698g;

    /* renamed from: h, reason: collision with root package name */
    public long f21699h;

    /* renamed from: i, reason: collision with root package name */
    public int f21700i;
    public String j;

    static {
        C2190j c2190j = C2190j.f24645d;
        f21691k = e0.c.D("'\\");
        f21692l = e0.c.D("\"\\");
        f21693m = e0.c.D("{}[]:, \n\t\r\f/\\;#=");
        f21694n = e0.c.D("\n\r");
        f21695o = e0.c.D("*/");
    }

    public C1723o(InterfaceC2189i interfaceC2189i) {
        this.f21688b = new int[32];
        this.f21689c = new String[32];
        this.f21690d = new int[32];
        this.f21698g = 0;
        this.f21696e = interfaceC2189i;
        this.f21697f = interfaceC2189i.b();
        g0(6);
    }

    @Override // o7.AbstractC1722n
    public final boolean F() {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 != 2 && i9 != 4 && i9 != 18) {
            return true;
        }
        return false;
    }

    @Override // o7.AbstractC1722n
    public final double I() {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 16) {
            this.f21698g = 0;
            int[] iArr = this.f21690d;
            int i10 = this.f21687a - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f21699h;
        }
        if (i9 == 17) {
            long j = this.f21700i;
            C2187g c2187g = this.f21697f;
            c2187g.getClass();
            this.j = c2187g.p0(j, W7.a.f7934a);
        } else if (i9 == 9) {
            this.j = s0(f21692l);
        } else if (i9 == 8) {
            this.j = s0(f21691k);
        } else if (i9 == 10) {
            this.j = t0();
        } else if (i9 != 11) {
            throw new RuntimeException("Expected a double but was " + AbstractC0953k1.D(a0()) + " at path " + x());
        }
        this.f21698g = 11;
        try {
            double parseDouble = Double.parseDouble(this.j);
            if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
                this.j = null;
                this.f21698g = 0;
                int[] iArr2 = this.f21690d;
                int i11 = this.f21687a - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return parseDouble;
            }
            throw new IOException("JSON forbids NaN and infinities: " + parseDouble + " at path " + x());
        } catch (NumberFormatException unused) {
            throw new RuntimeException("Expected a double but was " + this.j + " at path " + x());
        }
    }

    @Override // o7.AbstractC1722n
    public final int N() {
        String s02;
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 16) {
            long j = this.f21699h;
            int i10 = (int) j;
            if (j == i10) {
                this.f21698g = 0;
                int[] iArr = this.f21690d;
                int i11 = this.f21687a - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new RuntimeException("Expected an int but was " + this.f21699h + " at path " + x());
        }
        if (i9 == 17) {
            long j4 = this.f21700i;
            C2187g c2187g = this.f21697f;
            c2187g.getClass();
            this.j = c2187g.p0(j4, W7.a.f7934a);
        } else if (i9 != 9 && i9 != 8) {
            if (i9 != 11) {
                throw new RuntimeException("Expected an int but was " + AbstractC0953k1.D(a0()) + " at path " + x());
            }
        } else {
            if (i9 == 9) {
                s02 = s0(f21692l);
            } else {
                s02 = s0(f21691k);
            }
            this.j = s02;
            try {
                int parseInt = Integer.parseInt(s02);
                this.f21698g = 0;
                int[] iArr2 = this.f21690d;
                int i12 = this.f21687a - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f21698g = 11;
        try {
            double parseDouble = Double.parseDouble(this.j);
            int i13 = (int) parseDouble;
            if (i13 == parseDouble) {
                this.j = null;
                this.f21698g = 0;
                int[] iArr3 = this.f21690d;
                int i14 = this.f21687a - 1;
                iArr3[i14] = iArr3[i14] + 1;
                return i13;
            }
            throw new RuntimeException("Expected an int but was " + this.j + " at path " + x());
        } catch (NumberFormatException unused2) {
            throw new RuntimeException("Expected an int but was " + this.j + " at path " + x());
        }
    }

    @Override // o7.AbstractC1722n
    public final void O() {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 7) {
            this.f21698g = 0;
            int[] iArr = this.f21690d;
            int i10 = this.f21687a - 1;
            iArr[i10] = iArr[i10] + 1;
            return;
        }
        throw new RuntimeException("Expected null but was " + AbstractC0953k1.D(a0()) + " at path " + x());
    }

    @Override // o7.AbstractC1722n
    public final String S() {
        String p02;
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 10) {
            p02 = t0();
        } else if (i9 == 9) {
            p02 = s0(f21692l);
        } else if (i9 == 8) {
            p02 = s0(f21691k);
        } else if (i9 == 11) {
            p02 = this.j;
            this.j = null;
        } else if (i9 == 16) {
            p02 = Long.toString(this.f21699h);
        } else if (i9 == 17) {
            long j = this.f21700i;
            C2187g c2187g = this.f21697f;
            c2187g.getClass();
            p02 = c2187g.p0(j, W7.a.f7934a);
        } else {
            throw new RuntimeException("Expected a string but was " + AbstractC0953k1.D(a0()) + " at path " + x());
        }
        this.f21698g = 0;
        int[] iArr = this.f21690d;
        int i10 = this.f21687a - 1;
        iArr[i10] = iArr[i10] + 1;
        return p02;
    }

    @Override // o7.AbstractC1722n
    public final void a() {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 3) {
            g0(1);
            this.f21690d[this.f21687a - 1] = 0;
            this.f21698g = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_ARRAY but was " + AbstractC0953k1.D(a0()) + " at path " + x());
        }
    }

    @Override // o7.AbstractC1722n
    public final int a0() {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        switch (i9) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case R.styleable.GradientColor_android_endX /* 10 */:
            case R.styleable.GradientColor_android_endY /* 11 */:
                return 6;
            case 12:
            case 13:
            case 14:
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            case 18:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f21698g = 0;
        this.f21688b[0] = 8;
        this.f21687a = 1;
        this.f21697f.x();
        this.f21696e.close();
    }

    @Override // o7.AbstractC1722n
    public final void d() {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 1) {
            g0(3);
            this.f21698g = 0;
        } else {
            throw new RuntimeException("Expected BEGIN_OBJECT but was " + AbstractC0953k1.D(a0()) + " at path " + x());
        }
    }

    @Override // o7.AbstractC1722n
    public final void g() {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 4) {
            int i10 = this.f21687a;
            this.f21687a = i10 - 1;
            int[] iArr = this.f21690d;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
            this.f21698g = 0;
            return;
        }
        throw new RuntimeException("Expected END_ARRAY but was " + AbstractC0953k1.D(a0()) + " at path " + x());
    }

    @Override // o7.AbstractC1722n
    public final int h0(C1499E c1499e) {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 < 12 || i9 > 15) {
            return -1;
        }
        if (i9 == 15) {
            return n0(this.j, c1499e);
        }
        int Q7 = this.f21696e.Q((x8.x) c1499e.f19986c);
        if (Q7 != -1) {
            this.f21698g = 0;
            this.f21689c[this.f21687a - 1] = ((String[]) c1499e.f19985b)[Q7];
            return Q7;
        }
        String str = this.f21689c[this.f21687a - 1];
        String q02 = q0();
        int n02 = n0(q02, c1499e);
        if (n02 == -1) {
            this.f21698g = 15;
            this.j = q02;
            this.f21689c[this.f21687a - 1] = str;
        }
        return n02;
    }

    @Override // o7.AbstractC1722n
    public final void i0() {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 14) {
            long h7 = this.f21696e.h(f21693m);
            C2187g c2187g = this.f21697f;
            if (h7 == -1) {
                h7 = c2187g.f24644b;
            }
            c2187g.n(h7);
        } else if (i9 == 13) {
            v0(f21692l);
        } else if (i9 == 12) {
            v0(f21691k);
        } else if (i9 != 15) {
            throw new RuntimeException("Expected a name but was " + AbstractC0953k1.D(a0()) + " at path " + x());
        }
        this.f21698g = 0;
        this.f21689c[this.f21687a - 1] = "null";
    }

    @Override // o7.AbstractC1722n
    public final void j0() {
        int i9 = 0;
        do {
            int i10 = this.f21698g;
            if (i10 == 0) {
                i10 = m0();
            }
            if (i10 == 3) {
                g0(1);
            } else if (i10 == 1) {
                g0(3);
            } else {
                if (i10 == 4) {
                    i9--;
                    if (i9 >= 0) {
                        this.f21687a--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + AbstractC0953k1.D(a0()) + " at path " + x());
                    }
                } else if (i10 == 2) {
                    i9--;
                    if (i9 >= 0) {
                        this.f21687a--;
                    } else {
                        throw new RuntimeException("Expected a value but was " + AbstractC0953k1.D(a0()) + " at path " + x());
                    }
                } else {
                    C2187g c2187g = this.f21697f;
                    if (i10 != 14 && i10 != 10) {
                        if (i10 != 9 && i10 != 13) {
                            if (i10 != 8 && i10 != 12) {
                                if (i10 == 17) {
                                    c2187g.n(this.f21700i);
                                } else if (i10 == 18) {
                                    throw new RuntimeException("Expected a value but was " + AbstractC0953k1.D(a0()) + " at path " + x());
                                }
                            } else {
                                v0(f21691k);
                            }
                        } else {
                            v0(f21692l);
                        }
                    } else {
                        long h7 = this.f21696e.h(f21693m);
                        if (h7 == -1) {
                            h7 = c2187g.f24644b;
                        }
                        c2187g.n(h7);
                    }
                }
                this.f21698g = 0;
            }
            i9++;
            this.f21698g = 0;
        } while (i9 != 0);
        int[] iArr = this.f21690d;
        int i11 = this.f21687a - 1;
        iArr[i11] = iArr[i11] + 1;
        this.f21689c[i11] = "null";
    }

    public final void l0() {
        k0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01cf, code lost:
    
        r9 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d5, code lost:
    
        r23.f21699h = r9;
        r12.n(r4);
        r11 = 16;
        r23.f21698g = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d2, code lost:
    
        r9 = -r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c5, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01e0, code lost:
    
        if (r2 == r3) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e3, code lost:
    
        if (r2 == 4) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01e6, code lost:
    
        if (r2 != 7) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01e8, code lost:
    
        r23.f21700i = r4;
        r11 = 17;
        r23.f21698g = 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b5, code lost:
    
        if (p0(r8) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0146, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
    
        if (r2 != 2) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01ba, code lost:
    
        if (r6 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c0, code lost:
    
        if (r18 != Long.MIN_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c2, code lost:
    
        if (r7 == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c9, code lost:
    
        if (r18 != r16) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cb, code lost:
    
        if (r7 != 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01cd, code lost:
    
        if (r7 == 0) goto L153;
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0216 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m0() {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C1723o.m0():int");
    }

    public final int n0(String str, C1499E c1499e) {
        int length = ((String[]) c1499e.f19985b).length;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(((String[]) c1499e.f19985b)[i9])) {
                this.f21698g = 0;
                this.f21689c[this.f21687a - 1] = str;
                return i9;
            }
        }
        return -1;
    }

    public final int o0(String str, C1499E c1499e) {
        int length = ((String[]) c1499e.f19985b).length;
        for (int i9 = 0; i9 < length; i9++) {
            if (str.equals(((String[]) c1499e.f19985b)[i9])) {
                this.f21698g = 0;
                int[] iArr = this.f21690d;
                int i10 = this.f21687a - 1;
                iArr[i10] = iArr[i10] + 1;
                return i9;
            }
        }
        return -1;
    }

    public final boolean p0(int i9) {
        if (i9 != 9 && i9 != 10 && i9 != 12 && i9 != 13 && i9 != 32) {
            if (i9 != 35) {
                if (i9 != 44) {
                    if (i9 != 47 && i9 != 61) {
                        if (i9 != 123 && i9 != 125 && i9 != 58) {
                            if (i9 != 59) {
                                switch (i9) {
                                    case 91:
                                    case 93:
                                        return false;
                                    case 92:
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            l0();
            return false;
        }
        return false;
    }

    public final String q0() {
        String str;
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 14) {
            str = t0();
        } else if (i9 == 13) {
            str = s0(f21692l);
        } else if (i9 == 12) {
            str = s0(f21691k);
        } else if (i9 == 15) {
            str = this.j;
            this.j = null;
        } else {
            throw new RuntimeException("Expected a name but was " + AbstractC0953k1.D(a0()) + " at path " + x());
        }
        this.f21698g = 0;
        this.f21689c[this.f21687a - 1] = str;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r1.n(r3);
        r2 = o7.C1723o.f21694n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r6 != 47) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:
    
        if (r6 != 35) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        l0();
        r5 = r5.h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r5 == (-1)) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        r1.n(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r5 = r1.f24644b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0039, code lost:
    
        if (r5.o(2) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x003d, code lost:
    
        l0();
        r10 = r1.O(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (r10 == 42) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r1.h0();
        r1.h0();
        r5 = r5.C(o7.C1723o.f21695o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        if (r5 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r3 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        r5 = r5 + r2.f24646a.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:
    
        r1.n(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        if (r3 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        k0("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007c, code lost:
    
        r5 = r1.f24644b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0048, code lost:
    
        if (r10 == 47) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x004b, code lost:
    
        r1.h0();
        r1.h0();
        r5 = r5.h(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0057, code lost:
    
        if (r5 == (-1)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005d, code lost:
    
        r1.n(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005b, code lost:
    
        r5 = r1.f24644b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int r0(boolean r13) {
        /*
            r12 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            int r2 = r1 + 1
            long r3 = (long) r2
            x8.i r5 = r12.f21696e
            boolean r3 = r5.o(r3)
            if (r3 == 0) goto La8
            long r3 = (long) r1
            x8.g r1 = r12.f21697f
            byte r6 = r1.O(r3)
            r7 = 10
            if (r6 == r7) goto La5
            r7 = 32
            if (r6 == r7) goto La5
            r7 = 13
            if (r6 == r7) goto La5
            r7 = 9
            if (r6 != r7) goto L26
            goto La5
        L26:
            r1.n(r3)
            x8.j r2 = o7.C1723o.f21694n
            r3 = -1
            r7 = 1
            r9 = 47
            if (r6 != r9) goto L8c
            r10 = 2
            boolean r10 = r5.o(r10)
            if (r10 != 0) goto L3d
            goto La4
        L3d:
            r12.l0()
            byte r10 = r1.O(r7)
            r11 = 42
            if (r10 == r11) goto L61
            if (r10 == r9) goto L4b
            goto La4
        L4b:
            r1.h0()
            r1.h0()
            long r5 = r5.h(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L5b
            long r5 = r5 + r7
            goto L5d
        L5b:
            long r5 = r1.f24644b
        L5d:
            r1.n(r5)
            goto L1
        L61:
            r1.h0()
            r1.h0()
            x8.j r2 = o7.C1723o.f21695o
            long r5 = r5.C(r2)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L73
            r3 = 1
            goto L74
        L73:
            r3 = r0
        L74:
            if (r3 == 0) goto L7c
            byte[] r2 = r2.f24646a
            int r2 = r2.length
            long r7 = (long) r2
            long r5 = r5 + r7
            goto L7e
        L7c:
            long r5 = r1.f24644b
        L7e:
            r1.n(r5)
            if (r3 == 0) goto L85
            goto L1
        L85:
            java.lang.String r13 = "Unterminated comment"
            r12.k0(r13)
            r13 = 0
            throw r13
        L8c:
            r9 = 35
            if (r6 != r9) goto La4
            r12.l0()
            long r5 = r5.h(r2)
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L9d
            long r5 = r5 + r7
            goto L9f
        L9d:
            long r5 = r1.f24644b
        L9f:
            r1.n(r5)
            goto L1
        La4:
            return r6
        La5:
            r1 = r2
            goto L2
        La8:
            if (r13 != 0) goto Lac
            r13 = -1
            return r13
        Lac:
            java.io.EOFException r13 = new java.io.EOFException
            java.lang.String r0 = "End of input"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o7.C1723o.r0(boolean):int");
    }

    @Override // o7.AbstractC1722n
    public final void s() {
        int i9 = this.f21698g;
        if (i9 == 0) {
            i9 = m0();
        }
        if (i9 == 2) {
            int i10 = this.f21687a;
            int i11 = i10 - 1;
            this.f21687a = i11;
            this.f21689c[i11] = null;
            int[] iArr = this.f21690d;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.f21698g = 0;
            return;
        }
        throw new RuntimeException("Expected END_OBJECT but was " + AbstractC0953k1.D(a0()) + " at path " + x());
    }

    public final String s0(C2190j c2190j) {
        StringBuilder sb = null;
        while (true) {
            long h7 = this.f21696e.h(c2190j);
            if (h7 != -1) {
                C2187g c2187g = this.f21697f;
                if (c2187g.O(h7) == 92) {
                    if (sb == null) {
                        sb = new StringBuilder();
                    }
                    sb.append(c2187g.p0(h7, W7.a.f7934a));
                    c2187g.h0();
                    sb.append(u0());
                } else {
                    if (sb == null) {
                        String p02 = c2187g.p0(h7, W7.a.f7934a);
                        c2187g.h0();
                        return p02;
                    }
                    sb.append(c2187g.p0(h7, W7.a.f7934a));
                    c2187g.h0();
                    return sb.toString();
                }
            } else {
                k0("Unterminated string");
                throw null;
            }
        }
    }

    public final String t0() {
        long h7 = this.f21696e.h(f21693m);
        C2187g c2187g = this.f21697f;
        if (h7 != -1) {
            c2187g.getClass();
            return c2187g.p0(h7, W7.a.f7934a);
        }
        return c2187g.q0();
    }

    public final String toString() {
        return "JsonReader(" + this.f21696e + ")";
    }

    public final char u0() {
        int i9;
        InterfaceC2189i interfaceC2189i = this.f21696e;
        if (interfaceC2189i.o(1L)) {
            C2187g c2187g = this.f21697f;
            byte h02 = c2187g.h0();
            if (h02 != 10 && h02 != 34 && h02 != 39 && h02 != 47 && h02 != 92) {
                if (h02 != 98) {
                    if (h02 != 102) {
                        if (h02 == 110) {
                            return '\n';
                        }
                        if (h02 != 114) {
                            if (h02 != 116) {
                                if (h02 == 117) {
                                    if (interfaceC2189i.o(4L)) {
                                        char c3 = 0;
                                        for (int i10 = 0; i10 < 4; i10++) {
                                            byte O8 = c2187g.O(i10);
                                            char c9 = (char) (c3 << 4);
                                            if (O8 >= 48 && O8 <= 57) {
                                                i9 = O8 - 48;
                                            } else if (O8 >= 97 && O8 <= 102) {
                                                i9 = O8 - 87;
                                            } else {
                                                if (O8 < 65 || O8 > 70) {
                                                    k0("\\u".concat(c2187g.p0(4L, W7.a.f7934a)));
                                                    throw null;
                                                }
                                                i9 = O8 - 55;
                                            }
                                            c3 = (char) (i9 + c9);
                                        }
                                        c2187g.n(4L);
                                        return c3;
                                    }
                                    throw new EOFException("Unterminated escape sequence at path " + x());
                                }
                                k0("Invalid escape sequence: \\" + ((char) h02));
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return (char) h02;
        }
        k0("Unterminated escape sequence");
        throw null;
    }

    public final void v0(C2190j c2190j) {
        while (true) {
            long h7 = this.f21696e.h(c2190j);
            if (h7 != -1) {
                C2187g c2187g = this.f21697f;
                if (c2187g.O(h7) == 92) {
                    c2187g.n(h7 + 1);
                    u0();
                } else {
                    c2187g.n(h7 + 1);
                    return;
                }
            } else {
                k0("Unterminated string");
                throw null;
            }
        }
    }
}
