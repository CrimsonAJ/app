package w1;

import Y2.r;
import android.webkit.MimeTypeMap;
import i8.A;
import i8.C1418h;
import i8.G;
import i8.w;
import java.io.IOException;
import java.util.Map;
import u1.C2064l;
import v1.C2095c;
import v1.C2099g;
import v1.C2100h;
import x8.C;
import x8.n;
import x8.y;

/* loaded from: classes.dex */
public final class l implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final C1418h f24024f = new C1418h(true, true, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: g, reason: collision with root package name */
    public static final C1418h f24025g = new C1418h(true, false, -1, -1, false, false, false, -1, -1, true, false, false, null);

    /* renamed from: a, reason: collision with root package name */
    public final String f24026a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.m f24027b;

    /* renamed from: c, reason: collision with root package name */
    public final A7.l f24028c;

    /* renamed from: d, reason: collision with root package name */
    public final A7.l f24029d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24030e;

    public l(String str, C1.m mVar, A7.l lVar, A7.l lVar2, boolean z9) {
        this.f24026a = str;
        this.f24027b = mVar;
        this.f24028c = lVar;
        this.f24029d = lVar2;
        this.f24030e = z9;
    }

    public static String d(String str, A a5) {
        String str2;
        String b9;
        if (a5 != null) {
            str2 = a5.f18927a;
        } else {
            str2 = null;
        }
        if ((str2 == null || W7.l.L(str2, "text/plain", false)) && (b9 = H1.f.b(MimeTypeMap.getSingleton(), str)) != null) {
            return b9;
        }
        if (str2 == null) {
            return null;
        }
        int R2 = W7.d.R(str2, ';', 0, 6);
        if (R2 != -1) {
            String substring = str2.substring(0, R2);
            kotlin.jvm.internal.h.d(substring, "substring(...)");
            return substring;
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0131 A[Catch: Exception -> 0x00d5, TryCatch #3 {Exception -> 0x00d5, blocks: (B:30:0x020c, B:31:0x020f, B:39:0x0157, B:41:0x0210, B:42:0x0215, B:83:0x009d, B:85:0x00a7, B:88:0x00d9, B:90:0x00dd, B:94:0x00f6, B:96:0x013e, B:100:0x010c, B:102:0x0118, B:103:0x0121, B:105:0x00bd, B:107:0x00c7, B:109:0x0129, B:110:0x0130, B:111:0x0131), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01dd A[Catch: Exception -> 0x0203, TryCatch #4 {Exception -> 0x0203, blocks: (B:17:0x01d7, B:19:0x01dd, B:22:0x01ff, B:26:0x0206, B:27:0x020b), top: B:16:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0206 A[Catch: Exception -> 0x0203, TryCatch #4 {Exception -> 0x0203, blocks: (B:17:0x01d7, B:19:0x01dd, B:22:0x01ff, B:26:0x0206, B:27:0x020b), top: B:16:0x01d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0210 A[Catch: Exception -> 0x00d5, TryCatch #3 {Exception -> 0x00d5, blocks: (B:30:0x020c, B:31:0x020f, B:39:0x0157, B:41:0x0210, B:42:0x0215, B:83:0x009d, B:85:0x00a7, B:88:0x00d9, B:90:0x00dd, B:94:0x00f6, B:96:0x013e, B:100:0x010c, B:102:0x0118, B:103:0x0121, B:105:0x00bd, B:107:0x00c7, B:109:0x0129, B:110:0x0130, B:111:0x0131), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009d A[Catch: Exception -> 0x00d5, TRY_ENTER, TryCatch #3 {Exception -> 0x00d5, blocks: (B:30:0x020c, B:31:0x020f, B:39:0x0157, B:41:0x0210, B:42:0x0215, B:83:0x009d, B:85:0x00a7, B:88:0x00d9, B:90:0x00dd, B:94:0x00f6, B:96:0x013e, B:100:0x010c, B:102:0x0118, B:103:0x0121, B:105:0x00bd, B:107:0x00c7, B:109:0x0129, B:110:0x0130, B:111:0x0131), top: B:7:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /* JADX WARN: Type inference failed for: r3v16, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [A7.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // w1.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r18) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.l.a(E7.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(i8.G r5, G7.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof w1.j
            if (r0 == 0) goto L13
            r0 = r6
            w1.j r0 = (w1.j) r0
            int r1 = r0.f24017t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24017t = r1
            goto L18
        L13:
            w1.j r0 = new w1.j
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f24015r
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f24017t
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r6)
            goto L8f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            a.AbstractC0485a.A(r6)
            android.graphics.Bitmap$Config[] r6 = H1.f.f2949a
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            boolean r6 = kotlin.jvm.internal.h.a(r6, r2)
            A7.l r2 = r4.f24028c
            if (r6 == 0) goto L63
            C1.m r6 = r4.f24027b
            C1.b r6 = r6.f1231o
            boolean r6 = r6.f1158a
            if (r6 != 0) goto L5d
            java.lang.Object r6 = r2.getValue()
            i8.i r6 = (i8.InterfaceC1419i) r6
            i8.E r6 = (i8.E) r6
            n8.g r5 = r6.c(r5)
            i8.L r5 = r5.h()
            goto L92
        L5d:
            android.os.NetworkOnMainThreadException r5 = new android.os.NetworkOnMainThreadException
            r5.<init>()
            throw r5
        L63:
            java.lang.Object r6 = r2.getValue()
            i8.i r6 = (i8.InterfaceC1419i) r6
            i8.E r6 = (i8.E) r6
            n8.g r5 = r6.c(r5)
            r0.f24017t = r3
            Y7.h r6 = new Y7.h
            E7.d r0 = com.google.android.gms.internal.measurement.D1.A(r0)
            r6.<init>(r3, r0)
            r6.s()
            H1.g r0 = new H1.g
            r0.<init>(r5, r6)
            r5.f(r0)
            r6.u(r0)
            java.lang.Object r6 = r6.r()
            if (r6 != r1) goto L8f
            return r1
        L8f:
            r5 = r6
            i8.L r5 = (i8.L) r5
        L92:
            boolean r6 = r5.g()
            if (r6 != 0) goto Lbc
            r6 = 304(0x130, float:4.26E-43)
            int r0 = r5.f19032d
            if (r0 == r6) goto Lbc
            i8.N r6 = r5.f19035g
            if (r6 == 0) goto La5
            H1.f.a(r6)
        La5:
            A7.b r6 = new A7.b
            java.lang.String r1 = "HTTP "
            java.lang.String r2 = ": "
            java.lang.StringBuilder r0 = A0.a.p(r1, r0, r2)
            java.lang.String r5 = r5.f19031c
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lbc:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.l.b(i8.G, G7.c):java.lang.Object");
    }

    public final n c() {
        Object value = this.f24029d.getValue();
        kotlin.jvm.internal.h.b(value);
        return ((C2100h) value).f23759a;
    }

    public final G e() {
        r rVar = new r(5);
        rVar.T(this.f24026a);
        C1.m mVar = this.f24027b;
        w headers = mVar.j;
        kotlin.jvm.internal.h.e(headers, "headers");
        rVar.f8649c = headers.d();
        for (Map.Entry entry : mVar.f1227k.f1242a.entrySet()) {
            Object key = entry.getKey();
            kotlin.jvm.internal.h.c(key, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            rVar.R((Class) key, entry.getValue());
        }
        C1.b bVar = mVar.f1230n;
        boolean z9 = bVar.f1158a;
        boolean z10 = mVar.f1231o.f1158a;
        if (!z10 && z9) {
            rVar.p(C1418h.f19087o);
        } else if (z10 && !z9) {
            if (bVar.f1159b) {
                rVar.p(C1418h.f19086n);
            } else {
                rVar.p(f24024f);
            }
        } else if (!z10 && !z9) {
            rVar.p(f24025g);
        }
        return rVar.o();
    }

    public final B1.b f(C2099g c2099g) {
        Throwable th;
        B1.b bVar;
        try {
            n c3 = c();
            C2095c c2095c = c2099g.f23758a;
            if (!c2095c.f23738b) {
                C b9 = v4.e.b(c3.k((y) c2095c.f23737a.f23730c.get(0)));
                try {
                    bVar = new B1.b(b9);
                    try {
                        b9.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        b9.close();
                    } catch (Throwable th4) {
                        O4.h.a(th3, th4);
                    }
                    th = th3;
                    bVar = null;
                }
                if (th == null) {
                    return bVar;
                }
                throw th;
            }
            throw new IllegalStateException("snapshot is closed");
        } catch (IOException unused) {
            return null;
        }
    }

    public final C2064l g(C2099g c2099g) {
        C2095c c2095c = c2099g.f23758a;
        if (!c2095c.f23738b) {
            y yVar = (y) c2095c.f23737a.f23730c.get(1);
            n c3 = c();
            String str = this.f24027b.f1226i;
            if (str == null) {
                str = this.f24026a;
            }
            return new C2064l(yVar, c3, str, c2099g);
        }
        throw new IllegalStateException("snapshot is closed");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v1.C2099g h(v1.C2099g r4, i8.G r5, i8.L r6, B1.b r7) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.l.h(v1.g, i8.G, i8.L, B1.b):v1.g");
    }
}
