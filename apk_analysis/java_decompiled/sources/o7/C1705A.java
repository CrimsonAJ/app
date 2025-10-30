package o7;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.math.BigDecimal;
import x8.C2187g;

/* renamed from: o7.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705A extends AbstractC1719k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21642a;

    public /* synthetic */ C1705A(int i9) {
        this.f21642a = i9;
    }

    @Override // o7.AbstractC1719k
    public final Object b(AbstractC1722n abstractC1722n) {
        String s02;
        long parseLong;
        switch (this.f21642a) {
            case 0:
                return abstractC1722n.S();
            case 1:
                C1723o c1723o = (C1723o) abstractC1722n;
                int i9 = c1723o.f21698g;
                if (i9 == 0) {
                    i9 = c1723o.m0();
                }
                boolean z9 = false;
                if (i9 == 5) {
                    c1723o.f21698g = 0;
                    int[] iArr = c1723o.f21690d;
                    int i10 = c1723o.f21687a - 1;
                    iArr[i10] = iArr[i10] + 1;
                    z9 = true;
                } else if (i9 == 6) {
                    c1723o.f21698g = 0;
                    int[] iArr2 = c1723o.f21690d;
                    int i11 = c1723o.f21687a - 1;
                    iArr2[i11] = iArr2[i11] + 1;
                } else {
                    throw new RuntimeException("Expected a boolean but was " + AbstractC0953k1.D(c1723o.a0()) + " at path " + c1723o.x());
                }
                return Boolean.valueOf(z9);
            case 2:
                return Byte.valueOf((byte) AbstractC1708D.g(abstractC1722n, "a byte", -128, 255));
            case 3:
                String S8 = abstractC1722n.S();
                if (S8.length() <= 1) {
                    return Character.valueOf(S8.charAt(0));
                }
                throw new RuntimeException("Expected a char but was " + ("\"" + S8 + '\"') + " at path " + abstractC1722n.x());
            case 4:
                return Double.valueOf(abstractC1722n.I());
            case 5:
                float I4 = (float) abstractC1722n.I();
                if (!Float.isInfinite(I4)) {
                    return Float.valueOf(I4);
                }
                throw new RuntimeException("JSON forbids NaN and infinities: " + I4 + " at path " + abstractC1722n.x());
            case 6:
                return Integer.valueOf(abstractC1722n.N());
            case 7:
                C1723o c1723o2 = (C1723o) abstractC1722n;
                int i12 = c1723o2.f21698g;
                if (i12 == 0) {
                    i12 = c1723o2.m0();
                }
                if (i12 == 16) {
                    c1723o2.f21698g = 0;
                    int[] iArr3 = c1723o2.f21690d;
                    int i13 = c1723o2.f21687a - 1;
                    iArr3[i13] = iArr3[i13] + 1;
                    parseLong = c1723o2.f21699h;
                } else {
                    if (i12 == 17) {
                        long j = c1723o2.f21700i;
                        C2187g c2187g = c1723o2.f21697f;
                        c2187g.getClass();
                        c1723o2.j = c2187g.p0(j, W7.a.f7934a);
                    } else if (i12 != 9 && i12 != 8) {
                        if (i12 != 11) {
                            throw new RuntimeException("Expected a long but was " + AbstractC0953k1.D(c1723o2.a0()) + " at path " + c1723o2.x());
                        }
                    } else {
                        if (i12 == 9) {
                            s02 = c1723o2.s0(C1723o.f21692l);
                        } else {
                            s02 = c1723o2.s0(C1723o.f21691k);
                        }
                        c1723o2.j = s02;
                        try {
                            parseLong = Long.parseLong(s02);
                            c1723o2.f21698g = 0;
                            int[] iArr4 = c1723o2.f21690d;
                            int i14 = c1723o2.f21687a - 1;
                            iArr4[i14] = iArr4[i14] + 1;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    c1723o2.f21698g = 11;
                    try {
                        parseLong = new BigDecimal(c1723o2.j).longValueExact();
                        c1723o2.j = null;
                        c1723o2.f21698g = 0;
                        int[] iArr5 = c1723o2.f21690d;
                        int i15 = c1723o2.f21687a - 1;
                        iArr5[i15] = iArr5[i15] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        throw new RuntimeException("Expected a long but was " + c1723o2.j + " at path " + c1723o2.x());
                    }
                }
                return Long.valueOf(parseLong);
            default:
                return Short.valueOf((short) AbstractC1708D.g(abstractC1722n, "a short", -32768, 32767));
        }
    }

    @Override // o7.AbstractC1719k
    public final void e(AbstractC1725q abstractC1725q, Object obj) {
        String str;
        switch (this.f21642a) {
            case 0:
                abstractC1725q.O((String) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C1724p c1724p = (C1724p) abstractC1725q;
                if (!c1724p.f21708e) {
                    c1724p.i0();
                    c1724p.S();
                    if (booleanValue) {
                        str = "true";
                    } else {
                        str = "false";
                    }
                    c1724p.f21702g.B0(str);
                    int[] iArr = c1724p.f21707d;
                    int i9 = c1724p.f21704a - 1;
                    iArr[i9] = iArr[i9] + 1;
                    return;
                }
                throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + c1724p.s());
            case 2:
                abstractC1725q.N(((Byte) obj).intValue() & 255);
                return;
            case 3:
                abstractC1725q.O(((Character) obj).toString());
                return;
            case 4:
                double doubleValue = ((Double) obj).doubleValue();
                C1724p c1724p2 = (C1724p) abstractC1725q;
                c1724p2.getClass();
                if (!Double.isNaN(doubleValue) && !Double.isInfinite(doubleValue)) {
                    if (c1724p2.f21708e) {
                        c1724p2.f21708e = false;
                        c1724p2.x(Double.toString(doubleValue));
                        return;
                    }
                    c1724p2.i0();
                    c1724p2.S();
                    c1724p2.f21702g.B0(Double.toString(doubleValue));
                    int[] iArr2 = c1724p2.f21707d;
                    int i10 = c1724p2.f21704a - 1;
                    iArr2[i10] = iArr2[i10] + 1;
                    return;
                }
                throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
            case 5:
                Float f9 = (Float) obj;
                f9.getClass();
                C1724p c1724p3 = (C1724p) abstractC1725q;
                c1724p3.getClass();
                String obj2 = f9.toString();
                if (!obj2.equals("-Infinity") && !obj2.equals("Infinity") && !obj2.equals("NaN")) {
                    if (c1724p3.f21708e) {
                        c1724p3.f21708e = false;
                        c1724p3.x(obj2);
                        return;
                    }
                    c1724p3.i0();
                    c1724p3.S();
                    c1724p3.f21702g.B0(obj2);
                    int[] iArr3 = c1724p3.f21707d;
                    int i11 = c1724p3.f21704a - 1;
                    iArr3[i11] = iArr3[i11] + 1;
                    return;
                }
                throw new IllegalArgumentException("Numeric values must be finite, but was " + f9);
            case 6:
                abstractC1725q.N(((Integer) obj).intValue());
                return;
            case 7:
                abstractC1725q.N(((Long) obj).longValue());
                return;
            default:
                abstractC1725q.N(((Short) obj).intValue());
                return;
        }
    }

    public final String toString() {
        switch (this.f21642a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
