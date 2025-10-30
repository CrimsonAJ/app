package j8;

import i8.A;
import i8.E;
import i8.F;
import i8.L;
import i8.N;
import i8.s;
import i8.y;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import kotlin.jvm.internal.h;
import n8.g;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import s8.p;

/* loaded from: classes.dex */
public final class b implements s {

    /* renamed from: c, reason: collision with root package name */
    public static final A f19800c;

    /* renamed from: a, reason: collision with root package name */
    public final E f19801a;

    /* renamed from: b, reason: collision with root package name */
    public final y f19802b;

    static {
        Pattern pattern = A.f18925d;
        f19800c = M4.a.o("application/dns-message");
    }

    public b(E e8, y yVar) {
        this.f19801a = e8;
        this.f19802b = yVar;
    }

    public static void b(L l9, String str, ArrayList arrayList, ArrayList arrayList2) {
        try {
            ArrayList c3 = c(l9, str);
            synchronized (arrayList) {
                arrayList.addAll(c3);
            }
        } catch (Exception e8) {
            synchronized (arrayList2) {
                arrayList2.add(e8);
            }
        }
    }

    public static ArrayList c(L l9, String str) {
        if (l9.f19037i == null && l9.f19030b != F.HTTP_2) {
            p pVar = p.f22822a;
            p.j(p.f22822a, "Incorrect protocol: " + l9.f19030b, 4);
        }
        try {
            if (l9.g()) {
                N n7 = l9.f19035g;
                h.b(n7);
                if (n7.a() <= 65536) {
                    ArrayList a5 = c.a(str, n7.g().k());
                    l9.close();
                    return a5;
                }
                throw new IOException("response size exceeds limit (65536 bytes): " + n7.a() + " bytes");
            }
            throw new IOException("response: " + l9.f19032d + ' ' + l9.f19031c);
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0111, code lost:
    
        if (r4.f19032d != 504) goto L27;
     */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, x8.g] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, x8.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r20, java.util.ArrayList r21, java.util.ArrayList r22, java.util.ArrayList r23, int r24) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.b.a(java.lang.String, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [Y2.r, java.lang.Object, i8.j] */
    @Override // i8.s
    public final List i(String hostname) {
        h.e(hostname, "hostname");
        if (PublicSuffixDatabase.f21763g.a(hostname) != null) {
            ArrayList arrayList = new ArrayList(2);
            ArrayList arrayList2 = new ArrayList(2);
            ArrayList arrayList3 = new ArrayList(5);
            a(hostname, arrayList, arrayList3, arrayList2, 1);
            a(hostname, arrayList, arrayList3, arrayList2, 28);
            CountDownLatch countDownLatch = new CountDownLatch(arrayList.size());
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                ?? obj2 = new Object();
                obj2.f8647a = arrayList2;
                obj2.f8649c = countDownLatch;
                obj2.f8650d = this;
                obj2.f8648b = hostname;
                obj2.f8651e = arrayList3;
                ((g) obj).f(obj2);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e8) {
                arrayList2.add(e8);
            }
            if (!arrayList3.isEmpty()) {
                return arrayList3;
            }
            if (!arrayList2.isEmpty()) {
                Exception exc = (Exception) arrayList2.get(0);
                if (!(exc instanceof UnknownHostException)) {
                    UnknownHostException unknownHostException = new UnknownHostException(hostname);
                    unknownHostException.initCause(exc);
                    int size2 = arrayList2.size();
                    for (int i10 = 1; i10 < size2; i10++) {
                        O4.h.a(unknownHostException, (Throwable) arrayList2.get(i10));
                    }
                    throw unknownHostException;
                }
                throw exc;
            }
            throw new UnknownHostException(hostname);
        }
        throw new UnknownHostException("private hosts not resolved");
    }
}
