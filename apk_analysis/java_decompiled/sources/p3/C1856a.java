package p3;

import Y2.r;
import android.net.Uri;
import com.google.firebase.messaging.u;
import i8.E;
import i8.I;
import i8.L;
import i8.N;
import i8.w;
import i8.x;
import j3.K;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import k4.AbstractC1500F;
import k4.AbstractC1507g;
import k4.C1496B;
import k4.C1498D;
import k4.C1499E;
import k4.C1514n;
import k4.C1516p;
import k8.c;
import kotlin.jvm.internal.h;
import l4.y;
import n8.g;

/* renamed from: p3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1856a extends AbstractC1507g {

    /* renamed from: e, reason: collision with root package name */
    public final E f22163e;

    /* renamed from: f, reason: collision with root package name */
    public final C1499E f22164f;

    /* renamed from: g, reason: collision with root package name */
    public final C1499E f22165g;

    /* renamed from: h, reason: collision with root package name */
    public L f22166h;

    /* renamed from: i, reason: collision with root package name */
    public InputStream f22167i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f22168k;

    /* renamed from: l, reason: collision with root package name */
    public long f22169l;

    static {
        K.a("goog.exo.okhttp");
    }

    public C1856a(E e8, C1499E c1499e) {
        super(true);
        e8.getClass();
        this.f22163e = e8;
        this.f22165g = c1499e;
        this.f22164f = new C1499E(0);
    }

    @Override // k4.InterfaceC1510j
    public final int D(byte[] bArr, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        try {
            long j = this.f22168k;
            if (j != -1) {
                long j4 = j - this.f22169l;
                if (j4 == 0) {
                    return -1;
                }
                i10 = (int) Math.min(i10, j4);
            }
            InputStream inputStream = this.f22167i;
            int i11 = y.f20553a;
            int read = inputStream.read(bArr, i9, i10);
            if (read != -1) {
                this.f22169l += read;
                c(read);
                return read;
            }
            return -1;
        } catch (IOException e8) {
            int i12 = y.f20553a;
            throw C1496B.a(2, e8);
        }
    }

    @Override // k4.InterfaceC1513m
    public final void close() {
        if (this.j) {
            this.j = false;
            d();
            k();
        }
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [S5.n, java.lang.Object] */
    @Override // k4.InterfaceC1513m
    public final long g(C1516p c1516p) {
        i8.y yVar;
        long j;
        int i9;
        I i10;
        this.f22169l = 0L;
        this.f22168k = 0L;
        h();
        long j4 = c1516p.f20081e;
        String uri = c1516p.f20077a.toString();
        h.e(uri, "<this>");
        C1514n c1514n = null;
        try {
            x xVar = new x();
            xVar.e(null, uri);
            yVar = xVar.b();
        } catch (IllegalArgumentException unused) {
            yVar = null;
        }
        if (yVar != null) {
            r rVar = new r(5);
            rVar.f8647a = yVar;
            HashMap hashMap = new HashMap();
            C1499E c1499e = this.f22165g;
            if (c1499e != null) {
                hashMap.putAll(c1499e.l());
            }
            hashMap.putAll(this.f22164f.l());
            hashMap.putAll(c1516p.f20080d);
            for (Map.Entry entry : hashMap.entrySet()) {
                rVar.D((String) entry.getKey(), (String) entry.getValue());
            }
            long j9 = c1516p.f20082f;
            String a5 = AbstractC1500F.a(j4, j9);
            if (a5 != null) {
                rVar.n("Range", a5);
            }
            if ((c1516p.f20084h & 1) != 1) {
                rVar.n("Accept-Encoding", "identity");
            }
            int i11 = c1516p.f20078b;
            byte[] bArr = c1516p.f20079c;
            if (bArr != null) {
                int length = bArr.length;
                j = 0;
                c.c(bArr.length, 0, length);
                i10 = new I(null, length, bArr);
                i9 = i11;
            } else {
                j = 0;
                i9 = i11;
                if (i9 == 2) {
                    byte[] content = y.f20558f;
                    h.e(content, "content");
                    int length2 = content.length;
                    c.c(content.length, 0, length2);
                    i10 = new I(null, length2, content);
                } else {
                    i10 = null;
                }
            }
            rVar.G(C1516p.b(i9), i10);
            g c3 = this.f22163e.c(rVar.o());
            try {
                ?? obj = new Object();
                c3.f(new u((Object) obj));
                try {
                    try {
                        L l9 = (L) obj.get();
                        this.f22166h = l9;
                        N n7 = l9.f19035g;
                        n7.getClass();
                        this.f22167i = n7.g().e0();
                        boolean g9 = l9.g();
                        long j10 = -1;
                        long j11 = c1516p.f20081e;
                        int i12 = l9.f19032d;
                        if (!g9) {
                            w wVar = l9.f19034f;
                            if (i12 == 416 && j11 == AbstractC1500F.b(wVar.b("Content-Range"))) {
                                this.j = true;
                                i(c1516p);
                                if (j9 != -1) {
                                    return j9;
                                }
                                return j;
                            }
                            try {
                                InputStream inputStream = this.f22167i;
                                inputStream.getClass();
                                y.R(inputStream);
                            } catch (IOException unused2) {
                                int i13 = y.f20553a;
                            }
                            TreeMap e8 = wVar.e();
                            k();
                            if (i12 == 416) {
                                c1514n = new C1514n(2008);
                            }
                            throw new C1498D(i12, c1514n, e8);
                        }
                        n7.d();
                        if (i12 != 200 || j11 == j) {
                            j11 = j;
                        }
                        if (j9 != -1) {
                            this.f22168k = j9;
                        } else {
                            long a9 = n7.a();
                            if (a9 != -1) {
                                j10 = a9 - j11;
                            }
                            this.f22168k = j10;
                        }
                        this.j = true;
                        i(c1516p);
                        try {
                            o(j11);
                            return this.f22168k;
                        } catch (C1496B e9) {
                            k();
                            throw e9;
                        }
                    } catch (InterruptedException unused3) {
                        c3.cancel();
                        throw new InterruptedIOException();
                    }
                } catch (ExecutionException e10) {
                    throw new IOException(e10);
                }
            } catch (IOException e11) {
                throw C1496B.a(1, e11);
            }
        }
        throw new C1496B("Malformed URL", 1004);
    }

    public final void k() {
        L l9 = this.f22166h;
        if (l9 != null) {
            N n7 = l9.f19035g;
            n7.getClass();
            n7.close();
            this.f22166h = null;
        }
        this.f22167i = null;
    }

    @Override // k4.AbstractC1507g, k4.InterfaceC1513m
    public final Map l() {
        L l9 = this.f22166h;
        if (l9 == null) {
            return Collections.EMPTY_MAP;
        }
        return l9.f19034f.e();
    }

    public final void o(long j) {
        if (j != 0) {
            byte[] bArr = new byte[4096];
            while (j > 0) {
                try {
                    int min = (int) Math.min(j, 4096);
                    InputStream inputStream = this.f22167i;
                    int i9 = y.f20553a;
                    int read = inputStream.read(bArr, 0, min);
                    if (!Thread.currentThread().isInterrupted()) {
                        if (read != -1) {
                            j -= read;
                            c(read);
                        } else {
                            throw new C1496B(2008);
                        }
                    } else {
                        throw new InterruptedIOException();
                    }
                } catch (IOException e8) {
                    if (e8 instanceof C1496B) {
                        throw ((C1496B) e8);
                    }
                    throw new C1496B(2000);
                }
            }
        }
    }

    @Override // k4.InterfaceC1513m
    public final Uri s() {
        L l9 = this.f22166h;
        if (l9 == null) {
            return null;
        }
        return Uri.parse(l9.f19029a.f19005a.f19177i);
    }
}
