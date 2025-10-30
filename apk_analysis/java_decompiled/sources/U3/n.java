package U3;

import B6.u0;
import N3.M;
import P5.AbstractC0349q;
import P5.S;
import P5.X;
import android.net.Uri;
import android.util.SparseArray;
import co.notix.R;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Locale;
import javax.net.SocketFactory;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class n implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final s4.i f7406a;

    /* renamed from: b, reason: collision with root package name */
    public final s4.i f7407b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7408c;

    /* renamed from: d, reason: collision with root package name */
    public final SocketFactory f7409d;

    /* renamed from: h, reason: collision with root package name */
    public Uri f7413h;
    public R3.u j;

    /* renamed from: k, reason: collision with root package name */
    public String f7415k;

    /* renamed from: l, reason: collision with root package name */
    public m f7416l;

    /* renamed from: m, reason: collision with root package name */
    public l4.s f7417m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7419o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7420p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7421q;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f7410e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f7411f = new SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public final A3.E f7412g = new A3.E(this);

    /* renamed from: i, reason: collision with root package name */
    public x f7414i = new x(new O0.c(this));

    /* renamed from: r, reason: collision with root package name */
    public long f7422r = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public int f7418n = -1;

    public n(s4.i iVar, s4.i iVar2, String str, Uri uri, SocketFactory socketFactory) {
        this.f7406a = iVar;
        this.f7407b = iVar2;
        this.f7408c = str;
        this.f7409d = socketFactory;
        this.f7413h = y.e(uri);
        this.j = y.c(uri);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0028. Please report as an issue. */
    public static S a(D d9, Uri uri) {
        AbstractC0349q.c(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i9 = 0;
        int i10 = 0;
        while (true) {
            S s9 = d9.f7317b;
            if (i9 < s9.f5928d) {
                C0396c c0396c = (C0396c) s9.get(i9);
                String M7 = u0.M(c0396c.j.f7346b);
                M7.getClass();
                char c3 = 65535;
                switch (M7.hashCode()) {
                    case -1922091719:
                        if (M7.equals("MPEG4-GENERIC")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 2412:
                        if (M7.equals("L8")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 64593:
                        if (M7.equals("AC3")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 64934:
                        if (M7.equals("AMR")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 74609:
                        if (M7.equals("L16")) {
                            c3 = 4;
                            break;
                        }
                        break;
                    case 85182:
                        if (M7.equals("VP8")) {
                            c3 = 5;
                            break;
                        }
                        break;
                    case 85183:
                        if (M7.equals("VP9")) {
                            c3 = 6;
                            break;
                        }
                        break;
                    case 2194728:
                        if (M7.equals("H264")) {
                            c3 = 7;
                            break;
                        }
                        break;
                    case 2194729:
                        if (M7.equals("H265")) {
                            c3 = '\b';
                            break;
                        }
                        break;
                    case 2433087:
                        if (M7.equals("OPUS")) {
                            c3 = '\t';
                            break;
                        }
                        break;
                    case 2450119:
                        if (M7.equals("PCMA")) {
                            c3 = '\n';
                            break;
                        }
                        break;
                    case 2450139:
                        if (M7.equals("PCMU")) {
                            c3 = 11;
                            break;
                        }
                        break;
                    case 1061166827:
                        if (M7.equals("MP4A-LATM")) {
                            c3 = '\f';
                            break;
                        }
                        break;
                    case 1934494802:
                        if (M7.equals("AMR-WB")) {
                            c3 = '\r';
                            break;
                        }
                        break;
                    case 1959269366:
                        if (M7.equals("MP4V-ES")) {
                            c3 = 14;
                            break;
                        }
                        break;
                    case 2137188397:
                        if (M7.equals("H263-1998")) {
                            c3 = 15;
                            break;
                        }
                        break;
                    case 2137209252:
                        if (M7.equals("H263-2000")) {
                            c3 = 16;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case R.styleable.GradientColor_android_endX /* 10 */:
                    case R.styleable.GradientColor_android_endY /* 11 */:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                        u uVar = new u(c0396c, uri);
                        int i11 = i10 + 1;
                        if (objArr.length < i11) {
                            objArr = Arrays.copyOf(objArr, P5.C.e(objArr.length, i11));
                        }
                        objArr[i10] = uVar;
                        i10 = i11;
                        break;
                }
                i9++;
            } else {
                return P5.F.k(i10, objArr);
            }
        }
    }

    public static void d(n nVar, M m9) {
        nVar.getClass();
        if (nVar.f7419o) {
            ((s) nVar.f7407b.f22734a).f7446l = m9;
            return;
        }
        String message = m9.getMessage();
        int i9 = O5.i.f5495a;
        if (message == null) {
            message = "";
        }
        nVar.f7406a.R(message, m9);
    }

    public final void F(long j) {
        boolean z9;
        Uri uri = this.f7413h;
        String str = this.f7415k;
        str.getClass();
        A3.E e8 = this.f7412g;
        int i9 = ((n) e8.f48d).f7418n;
        if (i9 != 1 && i9 != 2) {
            z9 = false;
        } else {
            z9 = true;
        }
        AbstractC1566a.m(z9);
        A a5 = A.f7298c;
        Object[] objArr = {Double.valueOf(j / 1000.0d)};
        int i10 = l4.y.f20553a;
        e8.r(e8.j(6, str, X.b(1, new Object[]{"Range", String.format(Locale.US, "npt=%.3f-", objArr)}, null), uri));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m mVar = this.f7416l;
        if (mVar != null) {
            mVar.close();
            this.f7416l = null;
            Uri uri = this.f7413h;
            String str = this.f7415k;
            str.getClass();
            A3.E e8 = this.f7412g;
            n nVar = (n) e8.f48d;
            int i9 = nVar.f7418n;
            if (i9 != -1 && i9 != 0) {
                nVar.f7418n = 0;
                e8.r(e8.j(12, str, X.f5938g, uri));
            }
        }
        this.f7414i.close();
    }

    public final void g() {
        long j;
        q qVar = (q) this.f7410e.pollFirst();
        if (qVar == null) {
            s sVar = (s) this.f7407b.f22734a;
            long j4 = sVar.f7448n;
            if (j4 != -9223372036854775807L) {
                j = l4.y.T(j4);
            } else {
                long j9 = sVar.f7449o;
                if (j9 != -9223372036854775807L) {
                    j = l4.y.T(j9);
                } else {
                    j = 0;
                }
            }
            sVar.f7439d.F(j);
            return;
        }
        Uri uri = qVar.f7427b.f7359b.f7466b;
        AbstractC1566a.n(qVar.f7428c);
        String str = qVar.f7428c;
        String str2 = this.f7415k;
        A3.E e8 = this.f7412g;
        ((n) e8.f48d).f7418n = 0;
        AbstractC0349q.b("Transport", str);
        e8.r(e8.j(10, str2, X.b(1, new Object[]{"Transport", str}, null), uri));
    }

    public final Socket s(Uri uri) {
        boolean z9;
        int i9;
        if (uri.getHost() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.h(z9);
        if (uri.getPort() > 0) {
            i9 = uri.getPort();
        } else {
            i9 = 554;
        }
        String host = uri.getHost();
        host.getClass();
        return this.f7409d.createSocket(host, i9);
    }

    public final void x(long j) {
        boolean z9;
        if (this.f7418n == 2 && !this.f7421q) {
            Uri uri = this.f7413h;
            String str = this.f7415k;
            str.getClass();
            A3.E e8 = this.f7412g;
            n nVar = (n) e8.f48d;
            if (nVar.f7418n == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            AbstractC1566a.m(z9);
            e8.r(e8.j(5, str, X.f5938g, uri));
            nVar.f7421q = true;
        }
        this.f7422r = j;
    }
}
