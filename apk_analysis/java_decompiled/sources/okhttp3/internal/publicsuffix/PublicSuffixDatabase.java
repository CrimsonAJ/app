package okhttp3.internal.publicsuffix;

import A0.a;
import B6.u0;
import B7.k;
import B7.r;
import B7.t;
import V7.j;
import V7.l;
import W7.d;
import e0.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.h;
import s8.p;
import v4.e;
import x8.C;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f21761e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f21762f = u0.D("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f21763g = new PublicSuffixDatabase();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f21764a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f21765b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f21766c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f21767d;

    public static List c(String str) {
        int i9 = 0;
        List a02 = d.a0(str, new char[]{'.'});
        if (h.a(k.v0(a02), "")) {
            int size = a02.size() - 1;
            if (size >= 0) {
                i9 = size;
            }
            return k.D0(a02, i9);
        }
        return a02;
    }

    public final String a(String domain) {
        String str;
        String str2;
        String str3;
        List list;
        List list2;
        int size;
        h.e(domain, "domain");
        String unicodeDomain = IDN.toUnicode(domain);
        h.d(unicodeDomain, "unicodeDomain");
        List c3 = c(unicodeDomain);
        if (!this.f21764a.get() && this.f21764a.compareAndSet(false, true)) {
            boolean z9 = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } finally {
                        if (z9) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z9 = true;
                } catch (IOException e8) {
                    p pVar = p.f22822a;
                    p.f22822a.getClass();
                    p.i("Failed to read public suffix list", 5, e8);
                    if (z9) {
                    }
                }
            }
        } else {
            try {
                this.f21765b.await();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f21766c != null) {
            int size2 = c3.size();
            byte[][] bArr = new byte[size2];
            for (int i9 = 0; i9 < size2; i9++) {
                String str4 = (String) c3.get(i9);
                Charset UTF_8 = StandardCharsets.UTF_8;
                h.d(UTF_8, "UTF_8");
                byte[] bytes = str4.getBytes(UTF_8);
                h.d(bytes, "this as java.lang.String).getBytes(charset)");
                bArr[i9] = bytes;
            }
            int i10 = 0;
            while (true) {
                if (i10 < size2) {
                    byte[] bArr2 = this.f21766c;
                    if (bArr2 != null) {
                        str = c.x(bArr2, bArr, i10);
                        if (str != null) {
                            break;
                        }
                        i10++;
                    } else {
                        h.h("publicSuffixListBytes");
                        throw null;
                    }
                } else {
                    str = null;
                    break;
                }
            }
            if (size2 > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i11 = 0; i11 < length; i11++) {
                    bArr3[i11] = f21761e;
                    byte[] bArr4 = this.f21766c;
                    if (bArr4 != null) {
                        str2 = c.x(bArr4, bArr3, i11);
                        if (str2 != null) {
                            break;
                        }
                    } else {
                        h.h("publicSuffixListBytes");
                        throw null;
                    }
                }
            }
            str2 = null;
            if (str2 != null) {
                int i12 = size2 - 1;
                for (int i13 = 0; i13 < i12; i13++) {
                    byte[] bArr5 = this.f21767d;
                    if (bArr5 != null) {
                        str3 = c.x(bArr5, bArr, i13);
                        if (str3 != null) {
                            break;
                        }
                    } else {
                        h.h("publicSuffixExceptionListBytes");
                        throw null;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                list2 = d.a0("!".concat(str3), new char[]{'.'});
            } else if (str == null && str2 == null) {
                list2 = f21762f;
            } else {
                List list3 = t.f1135a;
                if (str != null) {
                    list = d.a0(str, new char[]{'.'});
                } else {
                    list = list3;
                }
                if (str2 != null) {
                    list3 = d.a0(str2, new char[]{'.'});
                }
                if (list.size() > list3.size()) {
                    list2 = list;
                } else {
                    list2 = list3;
                }
            }
            if (c3.size() == list2.size() && ((String) list2.get(0)).charAt(0) != '!') {
                return null;
            }
            if (((String) list2.get(0)).charAt(0) == '!') {
                size = c3.size() - list2.size();
            } else {
                size = c3.size() - (list2.size() + 1);
            }
            j rVar = new r(0, c(domain));
            if (size >= 0) {
                if (size != 0) {
                    if (rVar instanceof V7.d) {
                        rVar = ((V7.d) rVar).a(size);
                    } else {
                        rVar = new V7.c(rVar, size);
                    }
                }
                return l.h0(rVar, ".");
            }
            throw new IllegalArgumentException(a.m("Requested element count ", size, " is less than zero.").toString());
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                C b9 = e.b(new x8.r(e.P(resourceAsStream)));
                try {
                    long x5 = b9.x();
                    b9.g0(x5);
                    byte[] i02 = b9.f24603b.i0(x5);
                    long x9 = b9.x();
                    b9.g0(x9);
                    byte[] i03 = b9.f24603b.i0(x9);
                    b9.close();
                    synchronized (this) {
                        this.f21766c = i02;
                        this.f21767d = i03;
                    }
                } finally {
                }
            }
        } finally {
            this.f21765b.countDown();
        }
    }
}
