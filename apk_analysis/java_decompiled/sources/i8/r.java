package i8;

import B6.u0;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements InterfaceC1412b, s {

    /* renamed from: a, reason: collision with root package name */
    public static final r f19148a = new Object();

    public static final C1424n b(r rVar, String str) {
        C1424n c1424n = new C1424n(str);
        C1424n.f19109d.put(str, c1424n);
        return c1424n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [x8.g] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, x8.g] */
    public static String c(String str, int i9, int i10, String str2, int i11) {
        int i12;
        int i13;
        boolean z9;
        boolean z10;
        boolean z11;
        String str3;
        boolean z12 = false;
        if ((i11 & 1) != 0) {
            i12 = 0;
        } else {
            i12 = i9;
        }
        if ((i11 & 2) != 0) {
            i13 = str.length();
        } else {
            i13 = i10;
        }
        if ((i11 & 8) != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if ((i11 & 16) != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((i11 & 32) != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((i11 & 64) == 0) {
            z12 = true;
        }
        kotlin.jvm.internal.h.e(str, "<this>");
        int i14 = i12;
        while (i14 < i13) {
            int codePointAt = str.codePointAt(i14);
            int i15 = 32;
            int i16 = 128;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z12) && !W7.d.M(str2, (char) codePointAt) && ((codePointAt != 37 || (z9 && (!z10 || f(str, i14, i13)))) && (codePointAt != 43 || !z11)))) {
                i14 += Character.charCount(codePointAt);
            } else {
                ?? obj = new Object();
                obj.C0(str, i12, i14);
                ?? r22 = 0;
                while (i14 < i13) {
                    int codePointAt2 = str.codePointAt(i14);
                    if (!z9 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z11) {
                            if (z9) {
                                str3 = "+";
                            } else {
                                str3 = "%2B";
                            }
                            obj.B0(str3);
                        } else if (codePointAt2 >= i15 && codePointAt2 != 127 && ((codePointAt2 < i16 || z12) && !W7.d.M(str2, (char) codePointAt2) && (codePointAt2 != 37 || (z9 && (!z10 || f(str, i14, i13)))))) {
                            obj.D0(codePointAt2);
                        } else {
                            if (r22 == 0) {
                                r22 = new Object();
                            }
                            r22.D0(codePointAt2);
                            while (!r22.N()) {
                                byte h02 = r22.h0();
                                obj.w0(37);
                                char[] cArr = y.f19168k;
                                obj.w0(cArr[((h02 & 255) >> 4) & 15]);
                                obj.w0(cArr[h02 & 15]);
                            }
                        }
                    }
                    i14 += Character.charCount(codePointAt2);
                    i15 = 32;
                    i16 = 128;
                    r22 = r22;
                }
                return obj.q0();
            }
        }
        String substring = str.substring(i12, i13);
        kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, x8.i, x8.g] */
    public static M d(String string) {
        Charset charset = W7.a.f7934a;
        ?? obj = new Object();
        kotlin.jvm.internal.h.e(charset, "charset");
        int length = string.length();
        kotlin.jvm.internal.h.e(string, "string");
        if (length >= 0) {
            if (length <= string.length()) {
                if (charset.equals(W7.a.f7934a)) {
                    obj.C0(string, 0, length);
                } else {
                    String substring = string.substring(0, length);
                    kotlin.jvm.internal.h.d(substring, "substring(...)");
                    byte[] bytes = substring.getBytes(charset);
                    kotlin.jvm.internal.h.d(bytes, "getBytes(...)");
                    obj.u0(bytes, 0, bytes.length);
                }
                return new M(null, obj.f24644b, obj, 0);
            }
            StringBuilder p9 = A0.a.p("endIndex > string.length: ", length, " > ");
            p9.append(string.length());
            throw new IllegalArgumentException(p9.toString().toString());
        }
        throw new IllegalArgumentException(A0.a.l("endIndex < beginIndex: ", length, 0, " < ").toString());
    }

    public static boolean f(String str, int i9, int i10) {
        int i11 = i9 + 2;
        if (i11 < i10 && str.charAt(i9) == '%' && k8.c.r(str.charAt(i9 + 1)) != -1 && k8.c.r(str.charAt(i11)) != -1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, x8.g] */
    public static String g(int i9, int i10, int i11, String str) {
        int i12;
        boolean z9 = false;
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        if ((i11 & 4) == 0) {
            z9 = true;
        }
        kotlin.jvm.internal.h.e(str, "<this>");
        int i13 = i9;
        while (i13 < i10) {
            char charAt = str.charAt(i13);
            if (charAt != '%' && (charAt != '+' || !z9)) {
                i13++;
            } else {
                ?? obj = new Object();
                obj.C0(str, i9, i13);
                while (i13 < i10) {
                    int codePointAt = str.codePointAt(i13);
                    if (codePointAt == 37 && (i12 = i13 + 2) < i10) {
                        int r5 = k8.c.r(str.charAt(i13 + 1));
                        int r7 = k8.c.r(str.charAt(i12));
                        if (r5 != -1 && r7 != -1) {
                            obj.w0((r5 << 4) + r7);
                            i13 = Character.charCount(codePointAt) + i12;
                        }
                        obj.D0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    } else {
                        if (codePointAt == 43 && z9) {
                            obj.w0(32);
                            i13++;
                        }
                        obj.D0(codePointAt);
                        i13 += Character.charCount(codePointAt);
                    }
                }
                return obj.q0();
            }
        }
        String substring = str.substring(i9, i10);
        kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static ArrayList h(String str) {
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        while (i9 <= str.length()) {
            int R2 = W7.d.R(str, '&', i9, 4);
            if (R2 == -1) {
                R2 = str.length();
            }
            int R8 = W7.d.R(str, '=', i9, 4);
            if (R8 != -1 && R8 <= R2) {
                String substring = str.substring(i9, R8);
                kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring);
                String substring2 = str.substring(R8 + 1, R2);
                kotlin.jvm.internal.h.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring2);
            } else {
                String substring3 = str.substring(i9, R2);
                kotlin.jvm.internal.h.d(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(substring3);
                arrayList.add(null);
            }
            i9 = R2 + 1;
        }
        return arrayList;
    }

    public static void j(ArrayList arrayList, StringBuilder sb) {
        kotlin.jvm.internal.h.e(arrayList, "<this>");
        T7.a K = u0.K(u0.N(0, arrayList.size()), 2);
        int i9 = K.f7237a;
        int i10 = K.f7238b;
        int i11 = K.f7239c;
        if ((i11 <= 0 || i9 > i10) && (i11 >= 0 || i10 > i9)) {
            return;
        }
        while (true) {
            String str = (String) arrayList.get(i9);
            String str2 = (String) arrayList.get(i9 + 1);
            if (i9 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i9 != i10) {
                i9 += i11;
            } else {
                return;
            }
        }
    }

    @Override // i8.InterfaceC1412b
    public G a(O o9, L response) {
        kotlin.jvm.internal.h.e(response, "response");
        return null;
    }

    public synchronized C1424n e(String javaName) {
        C1424n c1424n;
        String str;
        try {
            kotlin.jvm.internal.h.e(javaName, "javaName");
            LinkedHashMap linkedHashMap = C1424n.f19109d;
            c1424n = (C1424n) linkedHashMap.get(javaName);
            if (c1424n == null) {
                if (W7.l.L(javaName, "TLS_", false)) {
                    String substring = javaName.substring(4);
                    kotlin.jvm.internal.h.d(substring, "this as java.lang.String).substring(startIndex)");
                    str = "SSL_".concat(substring);
                } else if (W7.l.L(javaName, "SSL_", false)) {
                    String substring2 = javaName.substring(4);
                    kotlin.jvm.internal.h.d(substring2, "this as java.lang.String).substring(startIndex)");
                    str = "TLS_".concat(substring2);
                } else {
                    str = javaName;
                }
                c1424n = (C1424n) linkedHashMap.get(str);
                if (c1424n == null) {
                    c1424n = new C1424n(javaName);
                }
                linkedHashMap.put(javaName, c1424n);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1424n;
    }

    @Override // i8.s
    public List i(String hostname) {
        kotlin.jvm.internal.h.e(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            kotlin.jvm.internal.h.d(allByName, "getAllByName(hostname)");
            return B7.j.o0(allByName);
        } catch (NullPointerException e8) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostname));
            unknownHostException.initCause(e8);
            throw unknownHostException;
        }
    }
}
