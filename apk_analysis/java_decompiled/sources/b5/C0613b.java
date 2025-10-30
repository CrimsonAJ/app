package b5;

import com.google.android.gms.internal.measurement.AbstractC0909b2;
import com.google.android.gms.internal.measurement.C0950j3;
import com.google.android.gms.internal.measurement.C0968n1;
import com.google.android.gms.internal.measurement.C0982q0;
import com.google.android.gms.internal.measurement.C0996t0;
import com.google.android.gms.internal.measurement.C1006v0;
import com.google.android.gms.internal.measurement.C1011w0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* renamed from: b5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0613b {

    /* renamed from: a, reason: collision with root package name */
    public final String f11025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11026b;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f11027c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f11028d;

    /* renamed from: e, reason: collision with root package name */
    public Long f11029e;

    /* renamed from: f, reason: collision with root package name */
    public Long f11030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11031g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0616c f11032h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0909b2 f11033i;

    public C0613b(C0616c c0616c, String str, int i9, AbstractC0909b2 abstractC0909b2, int i10) {
        this.f11031g = i10;
        this.f11032h = c0616c;
        this.f11025a = str;
        this.f11026b = i9;
        this.f11033i = abstractC0909b2;
    }

    public static Boolean c(BigDecimal bigDecimal, C0996t0 c0996t0, double d9) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        F4.y.h(c0996t0);
        if (c0996t0.s()) {
            boolean z9 = true;
            if (c0996t0.x() != 1 && (c0996t0.x() != 5 ? c0996t0.t() : c0996t0.w() && c0996t0.v())) {
                int x5 = c0996t0.x();
                try {
                    if (c0996t0.x() == 5) {
                        if (Z.p0(c0996t0.q()) && Z.p0(c0996t0.p())) {
                            BigDecimal bigDecimal5 = new BigDecimal(c0996t0.q());
                            bigDecimal4 = new BigDecimal(c0996t0.p());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (Z.p0(c0996t0.o())) {
                        bigDecimal2 = new BigDecimal(c0996t0.o());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (x5 != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i9 = x5 - 1;
                        if (i9 != 1) {
                            if (i9 != 2) {
                                if (i9 != 3) {
                                    if (i9 == 4 && bigDecimal3 != null) {
                                        if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                            z9 = false;
                                        }
                                        return Boolean.valueOf(z9);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d9 != 0.0d) {
                                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d9).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d9).multiply(new BigDecimal(2)))) >= 0) {
                                            z9 = false;
                                        }
                                        return Boolean.valueOf(z9);
                                    }
                                    if (bigDecimal.compareTo(bigDecimal2) != 0) {
                                        z9 = false;
                                    }
                                    return Boolean.valueOf(z9);
                                }
                            } else if (bigDecimal2 != null) {
                                if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                                    z9 = false;
                                }
                                return Boolean.valueOf(z9);
                            }
                        } else if (bigDecimal2 != null) {
                            if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                                z9 = false;
                            }
                            return Boolean.valueOf(z9);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, C1011w0 c1011w0, V v8) {
        String p9;
        List q9;
        String str2;
        int i9;
        F4.y.h(c1011w0);
        if (str != null && c1011w0.u() && c1011w0.v() != 1 && (c1011w0.v() != 7 ? c1011w0.t() : c1011w0.n() != 0)) {
            int v9 = c1011w0.v();
            boolean r5 = c1011w0.r();
            if (!r5 && v9 != 2 && v9 != 7) {
                p9 = c1011w0.p().toUpperCase(Locale.ENGLISH);
            } else {
                p9 = c1011w0.p();
            }
            if (c1011w0.n() == 0) {
                q9 = null;
            } else {
                q9 = c1011w0.q();
                if (!r5) {
                    ArrayList arrayList = new ArrayList(q9.size());
                    Iterator it = q9.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    q9 = Collections.unmodifiableList(arrayList);
                }
            }
            if (v9 == 2) {
                str2 = p9;
            } else {
                str2 = null;
            }
            if (v9 != 7 ? p9 != null : q9 != null && !q9.isEmpty()) {
                if (!r5 && v9 != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (v9 - 1) {
                    case 1:
                        if (str2 != null) {
                            if (true != r5) {
                                i9 = 66;
                            } else {
                                i9 = 0;
                            }
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, i9).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (v8 != null) {
                                    v8.f10974i.c(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(p9));
                    case 3:
                        return Boolean.valueOf(str.endsWith(p9));
                    case 4:
                        return Boolean.valueOf(str.contains(p9));
                    case 5:
                        return Boolean.valueOf(str.equals(p9));
                    case 6:
                        if (q9 != null) {
                            return Boolean.valueOf(q9.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(long j, C0996t0 c0996t0) {
        try {
            return c(new BigDecimal(j), c0996t0, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean f(Boolean bool, boolean z9) {
        boolean z10;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x02b1, code lost:
    
        r16 = r3;
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0292, code lost:
    
        r16 = r3;
        r17 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.Long r19, java.lang.Long r20, com.google.android.gms.internal.measurement.V0 r21, long r22, b5.r r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0613b.a(java.lang.Long, java.lang.Long, com.google.android.gms.internal.measurement.V0, long, b5.r, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean b(Long l9, Long l10, C0968n1 c0968n1, boolean z9) {
        Object[] objArr;
        Object obj;
        C0950j3.a();
        C0650n0 c0650n0 = (C0650n0) this.f11032h.f1707a;
        boolean y02 = c0650n0.f11227g.y0(this.f11025a, E.f10592D0);
        C1006v0 c1006v0 = (C1006v0) this.f11033i;
        boolean s9 = c1006v0.s();
        boolean t7 = c1006v0.t();
        boolean u9 = c1006v0.u();
        if (s9 || t7 || u9) {
            objArr = true;
        } else {
            objArr = false;
        }
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        V v8 = c0650n0.f11229i;
        if (z9 && objArr == false) {
            C0650n0.f(v8);
            Integer valueOf = Integer.valueOf(this.f11026b);
            if (c1006v0.v()) {
                num = Integer.valueOf(c1006v0.n());
            }
            v8.f10978n.d(valueOf, num, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C0982q0 o9 = c1006v0.o();
        boolean s10 = o9.s();
        boolean E8 = c0968n1.E();
        O o10 = c0650n0.f11232m;
        if (E8) {
            if (!o9.u()) {
                C0650n0.f(v8);
                v8.f10974i.c(o10.f(c0968n1.s()), "No number filter for long property. property");
            } else {
                bool = f(e(c0968n1.p(), o9.o()), s10);
            }
        } else if (c0968n1.C()) {
            if (!o9.u()) {
                C0650n0.f(v8);
                v8.f10974i.c(o10.f(c0968n1.s()), "No number filter for double property. property");
            } else {
                double n7 = c0968n1.n();
                try {
                    bool3 = c(new BigDecimal(n7), o9.o(), Math.ulp(n7));
                } catch (NumberFormatException unused) {
                }
                bool = f(bool3, s10);
            }
        } else if (c0968n1.G()) {
            if (!o9.w()) {
                if (!o9.u()) {
                    C0650n0.f(v8);
                    v8.f10974i.c(o10.f(c0968n1.s()), "No string or number filter defined. property");
                } else if (Z.p0(c0968n1.t())) {
                    String t9 = c0968n1.t();
                    C0996t0 o11 = o9.o();
                    if (Z.p0(t9)) {
                        try {
                            bool2 = c(new BigDecimal(t9), o11, 0.0d);
                        } catch (NumberFormatException unused2) {
                        }
                    }
                    bool = f(bool2, s10);
                } else {
                    C0650n0.f(v8);
                    v8.f10974i.d(o10.f(c0968n1.s()), c0968n1.t(), "Invalid user property value for Numeric number filter. property, value");
                }
            } else {
                String t10 = c0968n1.t();
                C1011w0 p9 = o9.p();
                C0650n0.f(v8);
                bool = f(d(t10, p9, v8), s10);
            }
        } else {
            C0650n0.f(v8);
            v8.f10974i.c(o10.f(c0968n1.s()), "User property has no value, property");
        }
        C0650n0.f(v8);
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        v8.f10978n.c(obj, "Property filter result");
        if (bool == null) {
            return false;
        }
        this.f11027c = Boolean.TRUE;
        if (!u9 || bool.booleanValue()) {
            if (!z9 || c1006v0.s()) {
                this.f11028d = bool;
            }
            if (bool.booleanValue() && objArr != false && c0968n1.F()) {
                long q9 = c0968n1.q();
                if (l9 != null) {
                    q9 = l9.longValue();
                }
                if (y02 && c1006v0.s() && !c1006v0.t() && l10 != null) {
                    q9 = l10.longValue();
                }
                if (c1006v0.t()) {
                    this.f11030f = Long.valueOf(q9);
                } else {
                    this.f11029e = Long.valueOf(q9);
                }
            }
        }
        return true;
    }
}
