package k8;

import B6.u0;
import B7.C0051b;
import B7.k;
import W7.d;
import W7.l;
import i8.E;
import i8.L;
import i8.M;
import i8.w;
import i8.y;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.r;
import x8.C;
import x8.C2190j;
import x8.I;
import x8.InterfaceC2189i;
import x8.x;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f20141a;

    /* renamed from: b, reason: collision with root package name */
    public static final w f20142b = u0.E(new String[0]);

    /* renamed from: c, reason: collision with root package name */
    public static final M f20143c;

    /* renamed from: d, reason: collision with root package name */
    public static final x f20144d;

    /* renamed from: e, reason: collision with root package name */
    public static final TimeZone f20145e;

    /* renamed from: f, reason: collision with root package name */
    public static final W7.c f20146f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f20147g;

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, x8.i, x8.g] */
    static {
        byte[] bArr = new byte[0];
        f20141a = bArr;
        ?? obj = new Object();
        obj.u0(bArr, 0, 0);
        long j = 0;
        f20143c = new M(null, j, obj, 0);
        c(j, j, j);
        C2190j c2190j = C2190j.f24645d;
        f20144d = u0.F(e0.c.C("efbbbf"), e0.c.C("feff"), e0.c.C("fffe"), e0.c.C("0000ffff"), e0.c.C("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        h.b(timeZone);
        f20145e = timeZone;
        f20146f = new W7.c("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String Y = d.Y(E.class.getName(), "okhttp3.");
        if (l.G(Y, "Client", false)) {
            Y = Y.substring(0, Y.length() - 6);
            h.d(Y, "substring(...)");
        }
        f20147g = Y;
    }

    public static final boolean a(y yVar, y other) {
        h.e(yVar, "<this>");
        h.e(other, "other");
        if (h.a(yVar.f19172d, other.f19172d) && yVar.f19173e == other.f19173e && h.a(yVar.f19169a, other.f19169a)) {
            return true;
        }
        return false;
    }

    public static final int b(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (j >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    if (millis == 0 && j > 0) {
                        throw new IllegalArgumentException("timeout".concat(" too small.").toString());
                    }
                    return (int) millis;
                }
                throw new IllegalArgumentException("timeout".concat(" too large.").toString());
            }
            throw new IllegalStateException("unit == null");
        }
        throw new IllegalStateException("timeout".concat(" < 0").toString());
    }

    public static final void c(long j, long j4, long j9) {
        if ((j4 | j9) >= 0 && j4 <= j && j - j4 >= j9) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeable) {
        h.e(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket socket) {
        h.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e8) {
            throw e8;
        } catch (RuntimeException e9) {
            if (h.a(e9.getMessage(), "bio == null")) {
            } else {
                throw e9;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String str, char c3, int i9, int i10) {
        h.e(str, "<this>");
        while (i9 < i10) {
            if (str.charAt(i9) == c3) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static final int g(String str, int i9, int i10, String str2) {
        h.e(str, "<this>");
        while (i9 < i10) {
            if (d.M(str2, str.charAt(i9))) {
                return i9;
            }
            i9++;
        }
        return i10;
    }

    public static final boolean h(I i9) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        h.e(timeUnit, "timeUnit");
        try {
            return u(i9, 100);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... objArr) {
        h.e(format, "format");
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean j(String[] strArr, String[] strArr2, Comparator comparator) {
        h.e(strArr, "<this>");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                C0051b e8 = r.e(strArr2);
                while (e8.hasNext()) {
                    if (comparator.compare(str, (String) e8.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long k(L l9) {
        String b9 = l9.f19034f.b("Content-Length");
        if (b9 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(b9);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final List l(Object... elements) {
        h.e(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List unmodifiableList = Collections.unmodifiableList(B7.l.b0(Arrays.copyOf(objArr, objArr.length)));
        h.d(unmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String str) {
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            char charAt = str.charAt(i9);
            if (h.f(charAt, 31) <= 0 || h.f(charAt, 127) >= 0) {
                return i9;
            }
        }
        return -1;
    }

    public static final int n(String str, int i9, int i10) {
        h.e(str, "<this>");
        while (i9 < i10) {
            char charAt = str.charAt(i9);
            if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                i9++;
            } else {
                return i9;
            }
        }
        return i10;
    }

    public static final int o(String str, int i9, int i10) {
        h.e(str, "<this>");
        int i11 = i10 - 1;
        if (i9 <= i11) {
            while (true) {
                char charAt = str.charAt(i11);
                if (charAt == '\t' || charAt == '\n' || charAt == '\f' || charAt == '\r' || charAt == ' ') {
                    if (i11 == i9) {
                        break;
                    }
                    i11--;
                } else {
                    return i11 + 1;
                }
            }
        }
        return i9;
    }

    public static final String[] p(String[] strArr, String[] other, Comparator comparator) {
        h.e(other, "other");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i9]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i9++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean q(String name) {
        h.e(name, "name");
        if (!name.equalsIgnoreCase("Authorization") && !name.equalsIgnoreCase("Cookie") && !name.equalsIgnoreCase("Proxy-Authorization") && !name.equalsIgnoreCase("Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final int r(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' <= c3 && c3 < 'G') {
            return c3 - '7';
        }
        return -1;
    }

    public static final Charset s(InterfaceC2189i interfaceC2189i, Charset charset) {
        h.e(interfaceC2189i, "<this>");
        h.e(charset, "default");
        int Q7 = interfaceC2189i.Q(f20144d);
        if (Q7 != -1) {
            if (Q7 != 0) {
                if (Q7 != 1) {
                    if (Q7 != 2) {
                        if (Q7 != 3) {
                            if (Q7 == 4) {
                                Charset charset2 = W7.a.f7934a;
                                Charset charset3 = W7.a.f7935b;
                                if (charset3 == null) {
                                    Charset forName = Charset.forName("UTF-32LE");
                                    h.d(forName, "forName(...)");
                                    W7.a.f7935b = forName;
                                    return forName;
                                }
                                return charset3;
                            }
                            throw new AssertionError();
                        }
                        Charset charset4 = W7.a.f7934a;
                        Charset charset5 = W7.a.f7936c;
                        if (charset5 == null) {
                            Charset forName2 = Charset.forName("UTF-32BE");
                            h.d(forName2, "forName(...)");
                            W7.a.f7936c = forName2;
                            return forName2;
                        }
                        return charset5;
                    }
                    Charset UTF_16LE = StandardCharsets.UTF_16LE;
                    h.d(UTF_16LE, "UTF_16LE");
                    return UTF_16LE;
                }
                Charset UTF_16BE = StandardCharsets.UTF_16BE;
                h.d(UTF_16BE, "UTF_16BE");
                return UTF_16BE;
            }
            Charset UTF_8 = StandardCharsets.UTF_8;
            h.d(UTF_8, "UTF_8");
            return UTF_8;
        }
        return charset;
    }

    public static final int t(C c3) {
        h.e(c3, "<this>");
        return (c3.g() & 255) | ((c3.g() & 255) << 16) | ((c3.g() & 255) << 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, x8.g] */
    public static final boolean u(I i9, int i10) {
        long j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        h.e(timeUnit, "timeUnit");
        long nanoTime = System.nanoTime();
        if (i9.c().e()) {
            j = i9.c().c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        i9.c().d(Math.min(j, timeUnit.toNanos(i10)) + nanoTime);
        try {
            ?? obj = new Object();
            while (i9.b0(obj, 8192L) != -1) {
                obj.x();
            }
            if (j == Long.MAX_VALUE) {
                i9.c().a();
                return true;
            }
            i9.c().d(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                i9.c().a();
                return false;
            }
            i9.c().d(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                i9.c().a();
            } else {
                i9.c().d(nanoTime + j);
            }
            throw th;
        }
    }

    public static final w v(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q8.b bVar = (q8.b) it.next();
            String q9 = bVar.f22453a.q();
            String q10 = bVar.f22454b.q();
            arrayList.add(q9);
            arrayList.add(d.j0(q10).toString());
        }
        return new w((String[]) arrayList.toArray(new String[0]));
    }

    public static final String w(y yVar, boolean z9) {
        int i9;
        h.e(yVar, "<this>");
        String str = yVar.f19172d;
        if (d.N(str, ":")) {
            str = "[" + str + ']';
        }
        int i10 = yVar.f19173e;
        if (!z9) {
            String scheme = yVar.f19169a;
            h.e(scheme, "scheme");
            if (scheme.equals("http")) {
                i9 = 80;
            } else if (scheme.equals("https")) {
                i9 = 443;
            } else {
                i9 = -1;
            }
            if (i10 == i9) {
                return str;
            }
        }
        return str + ':' + i10;
    }

    public static final List x(List list) {
        h.e(list, "<this>");
        List unmodifiableList = Collections.unmodifiableList(k.I0(list));
        h.d(unmodifiableList, "unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final int y(int i9, String str) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
                return i9;
            }
        }
        return i9;
    }

    public static final String z(String str, int i9, int i10) {
        int n7 = n(str, i9, i10);
        String substring = str.substring(n7, o(str, n7, i10));
        h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }
}
