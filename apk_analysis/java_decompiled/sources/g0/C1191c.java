package g0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import u0.z;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1191c {

    /* renamed from: a, reason: collision with root package name */
    public final int f17496a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17497b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17498c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f17499d;

    public C1191c(byte[] bArr, int i9, int i10) {
        this(-1L, bArr, i9, i10);
    }

    public static C1191c a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C1195g.f17508C[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C1191c(wrap.array(), 4, 1);
    }

    public static C1191c b(C1193e c1193e, ByteOrder byteOrder) {
        C1193e[] c1193eArr = {c1193e};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C1195g.f17508C[5]]);
        wrap.order(byteOrder);
        C1193e c1193e2 = c1193eArr[0];
        wrap.putInt((int) c1193e2.f17504a);
        wrap.putInt((int) c1193e2.f17505b);
        return new C1191c(wrap.array(), 5, 1);
    }

    public static C1191c c(int i9, ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[C1195g.f17508C[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i9}[0]);
        return new C1191c(wrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) {
        Object g9 = g(byteOrder);
        if (g9 != null) {
            if (g9 instanceof String) {
                return Double.parseDouble((String) g9);
            }
            if (g9 instanceof long[]) {
                if (((long[]) g9).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g9 instanceof int[]) {
                if (((int[]) g9).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g9 instanceof double[]) {
                double[] dArr = (double[]) g9;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g9 instanceof C1193e[]) {
                C1193e[] c1193eArr = (C1193e[]) g9;
                if (c1193eArr.length == 1) {
                    C1193e c1193e = c1193eArr[0];
                    return c1193e.f17504a / c1193e.f17505b;
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a double value");
        }
        throw new NumberFormatException("NULL can't be converted to a double value");
    }

    public final int e(ByteOrder byteOrder) {
        Object g9 = g(byteOrder);
        if (g9 != null) {
            if (g9 instanceof String) {
                return Integer.parseInt((String) g9);
            }
            if (g9 instanceof long[]) {
                long[] jArr = (long[]) g9;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (g9 instanceof int[]) {
                int[] iArr = (int[]) g9;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            throw new NumberFormatException("Couldn't find a integer value");
        }
        throw new NumberFormatException("NULL can't be converted to a integer value");
    }

    public final String f(ByteOrder byteOrder) {
        Object g9 = g(byteOrder);
        if (g9 != null) {
            if (g9 instanceof String) {
                return (String) g9;
            }
            StringBuilder sb = new StringBuilder();
            int i9 = 0;
            if (g9 instanceof long[]) {
                long[] jArr = (long[]) g9;
                while (i9 < jArr.length) {
                    sb.append(jArr[i9]);
                    i9++;
                    if (i9 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (g9 instanceof int[]) {
                int[] iArr = (int[]) g9;
                while (i9 < iArr.length) {
                    sb.append(iArr[i9]);
                    i9++;
                    if (i9 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (g9 instanceof double[]) {
                double[] dArr = (double[]) g9;
                while (i9 < dArr.length) {
                    sb.append(dArr[i9]);
                    i9++;
                    if (i9 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (g9 instanceof C1193e[]) {
                C1193e[] c1193eArr = (C1193e[]) g9;
                while (i9 < c1193eArr.length) {
                    sb.append(c1193eArr[i9].f17504a);
                    sb.append('/');
                    sb.append(c1193eArr[i9].f17505b);
                    i9++;
                    if (i9 != c1193eArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:162:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v24, types: [g0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [g0.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable g(java.nio.ByteOrder r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C1191c.g(java.nio.ByteOrder):java.io.Serializable");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C1195g.f17507B[this.f17496a]);
        sb.append(", data length:");
        return z.g(sb, this.f17499d.length, ")");
    }

    public C1191c(long j, byte[] bArr, int i9, int i10) {
        this.f17496a = i9;
        this.f17497b = i10;
        this.f17498c = j;
        this.f17499d = bArr;
    }
}
