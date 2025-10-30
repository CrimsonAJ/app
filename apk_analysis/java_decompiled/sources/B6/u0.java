package B6;

import android.graphics.Path;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0909b2;
import com.google.android.gms.internal.measurement.B2;
import com.google.android.gms.internal.measurement.C0914c2;
import com.google.android.gms.internal.measurement.C1003u2;
import com.google.android.gms.internal.measurement.D2;
import com.google.android.gms.internal.measurement.InterfaceC0939h2;
import com.google.android.gms.internal.measurement.Q1;
import com.google.android.gms.internal.measurement.T1;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import x8.C2187g;
import x8.C2190j;

/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1071a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static long f1072b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static Method f1073c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f1074d = true;

    /* renamed from: e, reason: collision with root package name */
    public static Field f1075e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1076f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f1077g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f1078h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f1079i = 0;
    public static final /* synthetic */ int j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f1080k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f1081l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f1082m = 0;

    public static int A(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void B(final android.content.Context r4) {
        /*
            android.content.SharedPreferences r0 = M4.a.r(r4)
            java.lang.String r1 = "proxy_notification_initialized"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto Le
            goto L50
        Le:
            java.lang.String r0 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r1 = r4.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 == 0) goto L37
            java.lang.String r1 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r1 == 0) goto L37
            android.os.Bundle r2 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 == 0) goto L37
            boolean r2 = r2.containsKey(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            if (r2 == 0) goto L37
            android.os.Bundle r1 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            boolean r0 = r1.getBoolean(r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L37
            goto L38
        L37:
            r0 = 1
        L38:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L4c
            f5.i r1 = new f5.i
            r1.<init>()
            com.google.firebase.messaging.p r2 = new com.google.firebase.messaging.p
            r2.<init>()
            r2.run()
            goto L50
        L4c:
            r4 = 0
            s8.n.p(r4)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B6.u0.B(android.content.Context):void");
    }

    public static boolean C() {
        if (Build.VERSION.SDK_INT >= 29) {
            return W0.a.a();
        }
        try {
            if (f1073c == null) {
                f1072b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f1073c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f1073c.invoke(null, Long.valueOf(f1072b))).booleanValue();
        } catch (Exception e8) {
            if (e8 instanceof InvocationTargetException) {
                Throwable cause = e8.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e8);
            return false;
        }
    }

    public static List D(Object obj) {
        List singletonList = Collections.singletonList(obj);
        kotlin.jvm.internal.h.d(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static i8.w E(String... strArr) {
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int length = strArr2.length;
            int i9 = 0;
            for (int i10 = 0; i10 < length; i10++) {
                String str = strArr2[i10];
                if (str != null) {
                    strArr2[i10] = W7.d.j0(str).toString();
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            int z9 = v4.e.z(0, strArr2.length - 1, 2);
            if (z9 >= 0) {
                while (true) {
                    String str2 = strArr2[i9];
                    String str3 = strArr2[i9 + 1];
                    h(str2);
                    i(str3, str2);
                    if (i9 == z9) {
                        break;
                    }
                    i9 += 2;
                }
            }
            return new i8.w(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011d, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, x8.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static x8.x F(x8.C2190j... r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B6.u0.F(x8.j[]):x8.x");
    }

    public static T7.a K(T7.c cVar, int i9) {
        boolean z9;
        kotlin.jvm.internal.h.e(cVar, "<this>");
        if (i9 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Integer valueOf = Integer.valueOf(i9);
        if (z9) {
            if (cVar.f7239c <= 0) {
                i9 = -i9;
            }
            return new T7.a(cVar.f7237a, cVar.f7238b, i9);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static String L(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c3 = charArray[i9];
                    if (c3 >= 'A' && c3 <= 'Z') {
                        charArray[i9] = (char) (c3 ^ ' ');
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    public static String M(String str) {
        int length = str.length();
        int i9 = 0;
        while (i9 < length) {
            char charAt = str.charAt(i9);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i9 < length) {
                    char c3 = charArray[i9];
                    if (c3 >= 'a' && c3 <= 'z') {
                        charArray[i9] = (char) (c3 ^ ' ');
                    }
                    i9++;
                }
                return String.valueOf(charArray);
            }
            i9++;
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T7.a, T7.c] */
    public static T7.c N(int i9, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            T7.c cVar = T7.c.f7244d;
            return T7.c.f7244d;
        }
        return new T7.a(i9, i10 - 1, 1);
    }

    public static int O(byte[] bArr, int i9, Q1 q12) {
        int T8 = T(bArr, i9, q12);
        int i10 = q12.f15284a;
        if (i10 >= 0) {
            if (i10 <= bArr.length - T8) {
                if (i10 == 0) {
                    q12.f15286c = T1.f15297c;
                    return T8;
                }
                q12.f15286c = T1.f(bArr, T8, i10);
                return T8 + i10;
            }
            throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static int P(int i9, byte[] bArr) {
        int i10 = bArr[i9] & 255;
        int i11 = bArr[i9 + 1] & 255;
        int i12 = bArr[i9 + 2] & 255;
        return ((bArr[i9 + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int Q(B2 b22, int i9, byte[] bArr, int i10, int i11, InterfaceC0939h2 interfaceC0939h2, Q1 q12) {
        AbstractC0909b2 c3 = b22.c();
        B2 b23 = b22;
        byte[] bArr2 = bArr;
        int i12 = i11;
        Q1 q13 = q12;
        int Y = Y(c3, b23, bArr2, i10, i12, q13);
        b23.a(c3);
        q13.f15286c = c3;
        interfaceC0939h2.add(c3);
        while (Y < i12) {
            Q1 q14 = q13;
            int i13 = i12;
            int T8 = T(bArr2, Y, q14);
            if (i9 != q14.f15284a) {
                break;
            }
            byte[] bArr3 = bArr2;
            B2 b24 = b23;
            AbstractC0909b2 c9 = b24.c();
            Y = Y(c9, b24, bArr3, T8, i13, q14);
            b23 = b24;
            bArr2 = bArr3;
            i12 = i13;
            q13 = q14;
            b23.a(c9);
            q13.f15286c = c9;
            interfaceC0939h2.add(c9);
        }
        return Y;
    }

    public static int R(byte[] bArr, int i9, InterfaceC0939h2 interfaceC0939h2, Q1 q12) {
        C0914c2 c0914c2 = (C0914c2) interfaceC0939h2;
        int T8 = T(bArr, i9, q12);
        int i10 = q12.f15284a + T8;
        while (T8 < i10) {
            T8 = T(bArr, T8, q12);
            c0914c2.e(q12.f15284a);
        }
        if (T8 == i10) {
            return T8;
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int S(int i9, byte[] bArr, int i10, int i11, D2 d22, Q1 q12) {
        if ((i9 >>> 3) != 0) {
            int i12 = i9 & 7;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 5) {
                                d22.c(i9, Integer.valueOf(P(i10, bArr)));
                                return i10 + 4;
                            }
                            throw new IOException("Protocol message contained an invalid tag (zero).");
                        }
                        int i13 = (i9 & (-8)) | 4;
                        D2 b9 = D2.b();
                        int i14 = q12.f15287d + 1;
                        q12.f15287d = i14;
                        if (i14 < 100) {
                            int i15 = 0;
                            while (true) {
                                if (i10 >= i11) {
                                    break;
                                }
                                int T8 = T(bArr, i10, q12);
                                int i16 = q12.f15284a;
                                if (i16 == i13) {
                                    i15 = i16;
                                    i10 = T8;
                                    break;
                                }
                                i10 = S(i16, bArr, T8, i11, b9, q12);
                                i15 = i16;
                            }
                            q12.f15287d--;
                            if (i10 <= i11 && i15 == i13) {
                                d22.c(i9, b9);
                                return i10;
                            }
                            throw new IOException("Failed to parse the message.");
                        }
                        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    }
                    int T9 = T(bArr, i10, q12);
                    int i17 = q12.f15284a;
                    if (i17 >= 0) {
                        if (i17 <= bArr.length - T9) {
                            if (i17 == 0) {
                                d22.c(i9, T1.f15297c);
                            } else {
                                d22.c(i9, T1.f(bArr, T9, i17));
                            }
                            return T9 + i17;
                        }
                        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                    }
                    throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                d22.c(i9, Long.valueOf(Z(i10, bArr)));
                return i10 + 8;
            }
            int W6 = W(bArr, i10, q12);
            d22.c(i9, Long.valueOf(q12.f15285b));
            return W6;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public static int T(byte[] bArr, int i9, Q1 q12) {
        int i10 = i9 + 1;
        byte b9 = bArr[i9];
        if (b9 >= 0) {
            q12.f15284a = b9;
            return i10;
        }
        return U(b9, bArr, i10, q12);
    }

    public static int U(int i9, byte[] bArr, int i10, Q1 q12) {
        byte b9 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i9 & 127;
        if (b9 >= 0) {
            q12.f15284a = i12 | (b9 << 7);
            return i11;
        }
        int i13 = i12 | ((b9 & Byte.MAX_VALUE) << 7);
        int i14 = i10 + 2;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            q12.f15284a = i13 | (b10 << 14);
            return i14;
        }
        int i15 = i13 | ((b10 & Byte.MAX_VALUE) << 14);
        int i16 = i10 + 3;
        byte b11 = bArr[i14];
        if (b11 >= 0) {
            q12.f15284a = i15 | (b11 << 21);
            return i16;
        }
        int i17 = i15 | ((b11 & Byte.MAX_VALUE) << 21);
        int i18 = i10 + 4;
        byte b12 = bArr[i16];
        if (b12 >= 0) {
            q12.f15284a = i17 | (b12 << 28);
            return i18;
        }
        int i19 = i17 | ((b12 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                q12.f15284a = i19;
                return i20;
            }
        }
    }

    public static int V(int i9, byte[] bArr, int i10, int i11, InterfaceC0939h2 interfaceC0939h2, Q1 q12) {
        C0914c2 c0914c2 = (C0914c2) interfaceC0939h2;
        int T8 = T(bArr, i10, q12);
        c0914c2.e(q12.f15284a);
        while (T8 < i11) {
            int T9 = T(bArr, T8, q12);
            if (i9 != q12.f15284a) {
                break;
            }
            T8 = T(bArr, T9, q12);
            c0914c2.e(q12.f15284a);
        }
        return T8;
    }

    public static int W(byte[] bArr, int i9, Q1 q12) {
        long j4 = bArr[i9];
        int i10 = i9 + 1;
        if (j4 >= 0) {
            q12.f15285b = j4;
            return i10;
        }
        int i11 = i9 + 2;
        byte b9 = bArr[i10];
        long j9 = (j4 & 127) | ((b9 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b9 < 0) {
            int i13 = i11 + 1;
            i12 += 7;
            j9 |= (r10 & Byte.MAX_VALUE) << i12;
            b9 = bArr[i11];
            i11 = i13;
        }
        q12.f15285b = j9;
        return i11;
    }

    public static int X(Object obj, B2 b22, byte[] bArr, int i9, int i10, int i11, Q1 q12) {
        C1003u2 c1003u2 = (C1003u2) b22;
        int i12 = q12.f15287d + 1;
        q12.f15287d = i12;
        if (i12 < 100) {
            int t7 = c1003u2.t(obj, bArr, i9, i10, i11, q12);
            q12.f15287d--;
            q12.f15286c = obj;
            return t7;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static int Y(Object obj, B2 b22, byte[] bArr, int i9, int i10, Q1 q12) {
        int i11 = i9 + 1;
        int i12 = bArr[i9];
        if (i12 < 0) {
            i11 = U(i12, bArr, i11, q12);
            i12 = q12.f15284a;
        }
        int i13 = i11;
        if (i12 >= 0 && i12 <= i10 - i13) {
            int i14 = q12.f15287d + 1;
            q12.f15287d = i14;
            if (i14 < 100) {
                int i15 = i13 + i12;
                b22.g(obj, bArr, i13, i15, q12);
                q12.f15287d--;
                q12.f15286c = obj;
                return i15;
            }
            throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static long Z(int i9, byte[] bArr) {
        return (bArr[i9] & 255) | ((bArr[i9 + 1] & 255) << 8) | ((bArr[i9 + 2] & 255) << 16) | ((bArr[i9 + 3] & 255) << 24) | ((bArr[i9 + 4] & 255) << 32) | ((bArr[i9 + 5] & 255) << 40) | ((bArr[i9 + 6] & 255) << 48) | ((bArr[i9 + 7] & 255) << 56);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, u.h] */
    /* JADX WARN: Type inference failed for: r2v0, types: [u.k, java.lang.Object] */
    public static u.j b(Y7.F f9) {
        ?? obj = new Object();
        obj.f23361c = new Object();
        u.j jVar = new u.j(obj);
        obj.f23360b = jVar;
        obj.f23359a = A0.a.class;
        try {
            f9.O(new A0.b(obj, 0, f9));
            obj.f23359a = "Deferred.asListenableFuture";
            return jVar;
        } catch (Exception e8) {
            jVar.f23365b.k(e8);
            return jVar;
        }
    }

    public static void d(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static C7.c e(C7.c cVar) {
        cVar.g();
        cVar.f1629c = true;
        if (cVar.f1628b > 0) {
            return cVar;
        }
        return C7.c.f1626d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, x8.I, x8.g] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, x8.I, x8.g] */
    public static void f(long j4, C2187g c2187g, int i9, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        ArrayList arrayList3;
        long j9;
        int i14;
        int i15 = i9;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i10 < i11) {
            for (int i16 = i10; i16 < i11; i16++) {
                if (((C2190j) arrayList4.get(i16)).d() < i15) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C2190j c2190j = (C2190j) arrayList.get(i10);
            C2190j c2190j2 = (C2190j) arrayList4.get(i11 - 1);
            if (i15 == c2190j.d()) {
                int intValue = ((Number) arrayList5.get(i10)).intValue();
                int i17 = i10 + 1;
                C2190j c2190j3 = (C2190j) arrayList4.get(i17);
                i12 = i17;
                i13 = intValue;
                c2190j = c2190j3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (c2190j.i(i15) != c2190j2.i(i15)) {
                int i18 = 1;
                for (int i19 = i12 + 1; i19 < i11; i19++) {
                    if (((C2190j) arrayList4.get(i19 - 1)).i(i15) != ((C2190j) arrayList4.get(i19)).i(i15)) {
                        i18++;
                    }
                }
                long j10 = 4;
                long j11 = (c2187g.f24644b / j10) + j4 + 2 + (i18 * 2);
                c2187g.z0(i18);
                c2187g.z0(i13);
                for (int i20 = i12; i20 < i11; i20++) {
                    byte i21 = ((C2190j) arrayList4.get(i20)).i(i15);
                    if (i20 == i12 || i21 != ((C2190j) arrayList4.get(i20 - 1)).i(i15)) {
                        c2187g.z0(i21 & 255);
                    }
                }
                ?? obj = new Object();
                int i22 = i12;
                while (i22 < i11) {
                    byte i23 = ((C2190j) arrayList4.get(i22)).i(i15);
                    int i24 = i22 + 1;
                    int i25 = i24;
                    while (true) {
                        if (i25 < i11) {
                            if (i23 != ((C2190j) arrayList4.get(i25)).i(i15)) {
                                break;
                            } else {
                                i25++;
                            }
                        } else {
                            i25 = i11;
                            break;
                        }
                    }
                    if (i24 == i25 && i15 + 1 == ((C2190j) arrayList4.get(i22)).d()) {
                        c2187g.z0(((Number) arrayList5.get(i22)).intValue());
                        arrayList3 = arrayList5;
                        j9 = j11;
                        i14 = i25;
                    } else {
                        c2187g.z0(((int) ((obj.f24644b / j10) + j11)) * (-1));
                        arrayList3 = arrayList5;
                        j9 = j11;
                        i14 = i25;
                        f(j9, obj, i15 + 1, arrayList, i22, i14, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j11 = j9;
                    i22 = i14;
                    arrayList5 = arrayList3;
                }
                c2187g.v0(obj);
                return;
            }
            int min = Math.min(c2190j.d(), c2190j2.d());
            int i26 = 0;
            for (int i27 = i15; i27 < min && c2190j.i(i27) == c2190j2.i(i27); i27++) {
                i26++;
            }
            long j12 = 4;
            long j13 = (c2187g.f24644b / j12) + j4 + 2 + i26 + 1;
            c2187g.z0(-i26);
            c2187g.z0(i13);
            int i28 = i15 + i26;
            while (i15 < i28) {
                c2187g.z0(c2190j.i(i15) & 255);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i28 == ((C2190j) arrayList4.get(i12)).d()) {
                    c2187g.z0(((Number) arrayList5.get(i12)).intValue());
                    return;
                }
                throw new IllegalStateException("Check failed.");
            }
            ?? obj2 = new Object();
            c2187g.z0(((int) ((obj2.f24644b / j12) + j13)) * (-1));
            f(j13, obj2, i28, arrayList4, i12, i11, arrayList5);
            c2187g.v0(obj2);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static boolean g(H.e[] eVarArr, H.e[] eVarArr2) {
        if (eVarArr == null || eVarArr2 == null || eVarArr.length != eVarArr2.length) {
            return false;
        }
        for (int i9 = 0; i9 < eVarArr.length; i9++) {
            H.e eVar = eVarArr[i9];
            char c3 = eVar.f2919a;
            H.e eVar2 = eVarArr2[i9];
            if (c3 != eVar2.f2919a || eVar.f2920b.length != eVar2.f2920b.length) {
                return false;
            }
        }
        return true;
    }

    public static void h(String str) {
        if (str.length() > 0) {
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char charAt = str.charAt(i9);
                if ('!' > charAt || charAt >= 127) {
                    throw new IllegalArgumentException(k8.c.i("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i9), str).toString());
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    public static void i(String str, String str2) {
        String concat;
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = str.charAt(i9);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder();
                sb.append(k8.c.i("Unexpected char %#04x at %d in %s value", Integer.valueOf(charAt), Integer.valueOf(i9), str2));
                if (k8.c.q(str2)) {
                    concat = "";
                } else {
                    concat = ": ".concat(str);
                }
                sb.append(concat);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static float j(float f9, float f10, float f11) {
        if (f9 < f10) {
            return f10;
        }
        if (f9 > f11) {
            return f11;
        }
        return f9;
    }

    public static int k(int i9, int i10, int i11) {
        if (i9 < i10) {
            return i10;
        }
        if (i9 > i11) {
            return i11;
        }
        return i9;
    }

    public static long l(long j4, long j9, long j10) {
        if (j9 <= j10) {
            if (j4 < j9) {
                return j9;
            }
            if (j4 > j10) {
                return j10;
            }
            return j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j10 + " is less than minimum " + j9 + '.');
    }

    public static final int m(P0.c cVar, String str) {
        kotlin.jvm.internal.h.e(cVar, "<this>");
        int n7 = n(cVar, str);
        if (n7 >= 0) {
            return n7;
        }
        int n9 = n(cVar, "`" + str + '`');
        if (n9 >= 0) {
            return n9;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int j4 = cVar.j();
            String concat = ".".concat(str);
            String str2 = "." + str + '`';
            for (int i9 = 0; i9 < j4; i9++) {
                String T8 = cVar.T(i9);
                if (T8.length() >= str.length() + 2 && (W7.l.G(T8, concat, false) || (T8.charAt(0) == '`' && W7.l.G(T8, str2, false)))) {
                    return i9;
                }
            }
            return -1;
        }
        return -1;
    }

    public static final int n(P0.c cVar, String name) {
        kotlin.jvm.internal.h.e(cVar, "<this>");
        kotlin.jvm.internal.h.e(name, "name");
        int j4 = cVar.j();
        for (int i9 = 0; i9 < j4; i9++) {
            if (name.equals(cVar.T(i9))) {
                return i9;
            }
        }
        return -1;
    }

    public static int o(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] p(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                jArr[i9] = iArr[i9];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static float[] q(float[] fArr, int i9) {
        if (i9 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i9, length);
                float[] fArr2 = new float[i9];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static String r(long j4) {
        Character[] chArr = {' ', 'k', 'M', 'B', 'T', 'P', 'E'};
        double d9 = j4;
        int floor = (int) Math.floor(Math.log10(d9));
        int i9 = floor / 3;
        if (floor >= 3 && i9 < 7) {
            return new DecimalFormat("#0.0").format(d9 / Math.pow(10.0d, 3 * i9)) + chArr[i9];
        }
        String format = new DecimalFormat("#,##0").format(j4);
        kotlin.jvm.internal.h.d(format, "format(...)");
        return format;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static H.e[] s(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B6.u0.s(java.lang.String):H.e[]");
    }

    public static Path t(String str) {
        Path path = new Path();
        try {
            H.e.b(s(str), path);
            return path;
        } catch (RuntimeException e8) {
            throw new RuntimeException("Error in parsing ".concat(str), e8);
        }
    }

    public static H.e[] v(H.e[] eVarArr) {
        H.e[] eVarArr2 = new H.e[eVarArr.length];
        for (int i9 = 0; i9 < eVarArr.length; i9++) {
            eVarArr2[i9] = new H.e(eVarArr[i9]);
        }
        return eVarArr2;
    }

    public static boolean w(String str, String str2) {
        char c3;
        int length = str.length();
        if (str != str2) {
            if (length == str2.length()) {
                for (int i9 = 0; i9 < length; i9++) {
                    if (str.charAt(i9) == str2.charAt(i9) || ((c3 = (char) ((r3 | ' ') - 97)) < 26 && c3 == ((char) ((r4 | ' ') - 97)))) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static String y(Class cls) {
        LinkedHashMap linkedHashMap = u0.W.f23461b;
        String str = (String) linkedHashMap.get(cls);
        if (str == null) {
            u0.U u9 = (u0.U) cls.getAnnotation(u0.U.class);
            if (u9 != null) {
                str = u9.value();
            } else {
                str = null;
            }
            if (str != null && str.length() > 0) {
                linkedHashMap.put(cls, str);
            } else {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
        }
        kotlin.jvm.internal.h.b(str);
        return str;
    }

    public abstract View G(int i9);

    public abstract boolean H();

    public void I(View view, float f9) {
        if (f1074d) {
            try {
                X0.x.b(view, f9);
                return;
            } catch (NoSuchMethodError unused) {
                f1074d = false;
            }
        }
        view.setAlpha(f9);
    }

    public void J(View view, int i9) {
        if (!f1076f) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f1075e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f1076f = true;
        }
        Field field = f1075e;
        if (field != null) {
            try {
                f1075e.setInt(view, i9 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public float z(View view) {
        if (f1074d) {
            try {
                return X0.x.a(view);
            } catch (NoSuchMethodError unused) {
                f1074d = false;
            }
        }
        return view.getAlpha();
    }
}
