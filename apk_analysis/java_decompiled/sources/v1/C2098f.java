package v1;

import A6.t;
import B7.C0050a;
import W7.l;
import com.google.android.gms.internal.measurement.D1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import x8.B;
import x8.C;
import x8.C2182b;
import x8.G;
import x8.u;
import x8.w;
import x8.y;

/* renamed from: v1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2098f implements Closeable, Flushable, AutoCloseable {

    /* renamed from: q, reason: collision with root package name */
    public static final W7.c f23742q = new W7.c("[a-z0-9_-]{1,120}");

    /* renamed from: a, reason: collision with root package name */
    public final y f23743a;

    /* renamed from: b, reason: collision with root package name */
    public final long f23744b;

    /* renamed from: c, reason: collision with root package name */
    public final y f23745c;

    /* renamed from: d, reason: collision with root package name */
    public final y f23746d;

    /* renamed from: e, reason: collision with root package name */
    public final y f23747e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f23748f;

    /* renamed from: g, reason: collision with root package name */
    public final d8.e f23749g;

    /* renamed from: h, reason: collision with root package name */
    public long f23750h;

    /* renamed from: i, reason: collision with root package name */
    public int f23751i;
    public B j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f23752k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f23753l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f23754m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f23755n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f23756o;

    /* renamed from: p, reason: collision with root package name */
    public final C2096d f23757p;

    public C2098f(long j, f8.d dVar, u uVar, y yVar) {
        this.f23743a = yVar;
        this.f23744b = j;
        if (j > 0) {
            this.f23745c = yVar.e("journal");
            this.f23746d = yVar.e("journal.tmp");
            this.f23747e = yVar.e("journal.bkp");
            this.f23748f = new LinkedHashMap(0, 0.75f, true);
            this.f23749g = Y7.B.a(O4.h.D(Y7.B.b(), dVar.j0(1)));
            this.f23757p = new C2096d(uVar);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0119, code lost:
    
        if (r1 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0112 A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:16:0x0030, B:26:0x003e, B:28:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:36:0x005c, B:38:0x006c, B:40:0x00aa, B:42:0x00b1, B:45:0x00b6, B:47:0x00c7, B:50:0x00cc, B:51:0x0107, B:53:0x0112, B:59:0x011b, B:60:0x00e4, B:62:0x00f9, B:64:0x0104, B:67:0x009a, B:69:0x0120, B:70:0x0127), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(v1.C2098f r9, A6.t r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.C2098f.a(v1.f, A6.t, boolean):void");
    }

    public static void g0(String input) {
        W7.c cVar = f23742q;
        cVar.getClass();
        kotlin.jvm.internal.h.e(input, "input");
        if (cVar.f7942a.matcher(input).matches()) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + input + '\"').toString());
    }

    public final B F() {
        C2096d c2096d = this.f23757p;
        c2096d.getClass();
        y file = this.f23745c;
        kotlin.jvm.internal.h.e(file, "file");
        c2096d.getClass();
        kotlin.jvm.internal.h.e(file, "file");
        c2096d.f23740b.getClass();
        File f9 = file.f();
        Logger logger = w.f24682a;
        return v4.e.a(new l8.h((G) new C2182b(new FileOutputStream(f9, true), 1, new Object()), new C0050a(5, this)));
    }

    public final void I() {
        Iterator it = this.f23748f.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            C2094b c2094b = (C2094b) it.next();
            int i9 = 0;
            if (c2094b.f23734g == null) {
                while (i9 < 2) {
                    j += c2094b.f23729b[i9];
                    i9++;
                }
            } else {
                c2094b.f23734g = null;
                while (i9 < 2) {
                    y yVar = (y) c2094b.f23730c.get(i9);
                    C2096d c2096d = this.f23757p;
                    c2096d.d(yVar);
                    c2096d.d((y) c2094b.f23731d.get(i9));
                    i9++;
                }
                it.remove();
            }
        }
        this.f23750h = j;
    }

    public final void N() {
        C b9 = v4.e.b(this.f23757p.k(this.f23745c));
        try {
            String a02 = b9.a0(Long.MAX_VALUE);
            String a03 = b9.a0(Long.MAX_VALUE);
            String a04 = b9.a0(Long.MAX_VALUE);
            String a05 = b9.a0(Long.MAX_VALUE);
            String a06 = b9.a0(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(a02) && "1".equals(a03) && kotlin.jvm.internal.h.a(String.valueOf(1), a04) && kotlin.jvm.internal.h.a(String.valueOf(2), a05) && a06.length() <= 0) {
                int i9 = 0;
                while (true) {
                    try {
                        O(b9.a0(Long.MAX_VALUE));
                        i9++;
                    } catch (EOFException unused) {
                        this.f23751i = i9 - this.f23748f.size();
                        if (!b9.a()) {
                            h0();
                        } else {
                            this.j = F();
                        }
                        try {
                            b9.close();
                            th = null;
                        } catch (Throwable th) {
                            th = th;
                        }
                        if (th == null) {
                            return;
                        } else {
                            throw th;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + a02 + ", " + a03 + ", " + a04 + ", " + a05 + ", " + a06 + ']');
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                b9.close();
            } catch (Throwable th3) {
                O4.h.a(th, th3);
            }
        }
    }

    public final void O(String str) {
        String substring;
        int R2 = W7.d.R(str, ' ', 0, 6);
        if (R2 != -1) {
            int i9 = R2 + 1;
            int R8 = W7.d.R(str, ' ', i9, 4);
            LinkedHashMap linkedHashMap = this.f23748f;
            if (R8 == -1) {
                substring = str.substring(i9);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
                if (R2 == 6 && l.L(str, "REMOVE", false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i9, R8);
                kotlin.jvm.internal.h.d(substring, "substring(...)");
            }
            Object obj = linkedHashMap.get(substring);
            if (obj == null) {
                obj = new C2094b(this, substring);
                linkedHashMap.put(substring, obj);
            }
            C2094b c2094b = (C2094b) obj;
            if (R8 != -1 && R2 == 5 && l.L(str, "CLEAN", false)) {
                String substring2 = str.substring(R8 + 1);
                kotlin.jvm.internal.h.d(substring2, "substring(...)");
                List a02 = W7.d.a0(substring2, new char[]{' '});
                c2094b.f23732e = true;
                c2094b.f23734g = null;
                int size = a02.size();
                c2094b.f23736i.getClass();
                if (size == 2) {
                    try {
                        int size2 = a02.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            c2094b.f23729b[i10] = Long.parseLong((String) a02.get(i10));
                        }
                        return;
                    } catch (NumberFormatException unused) {
                        throw new IOException("unexpected journal line: " + a02);
                    }
                }
                throw new IOException("unexpected journal line: " + a02);
            }
            if (R8 == -1 && R2 == 5 && l.L(str, "DIRTY", false)) {
                c2094b.f23734g = new t(this, c2094b);
                return;
            } else if (R8 == -1 && R2 == 4 && l.L(str, "READ", false)) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final void S(C2094b c2094b) {
        B b9;
        int i9 = c2094b.f23735h;
        String str = c2094b.f23728a;
        if (i9 > 0 && (b9 = this.j) != null) {
            b9.X("DIRTY");
            b9.y(32);
            b9.X(str);
            b9.y(10);
            b9.flush();
        }
        if (c2094b.f23735h <= 0 && c2094b.f23734g == null) {
            for (int i10 = 0; i10 < 2; i10++) {
                this.f23757p.d((y) c2094b.f23730c.get(i10));
                long j = this.f23750h;
                long[] jArr = c2094b.f23729b;
                this.f23750h = j - jArr[i10];
                jArr[i10] = 0;
            }
            this.f23751i++;
            B b10 = this.j;
            if (b10 != null) {
                b10.X("REMOVE");
                b10.y(32);
                b10.X(str);
                b10.y(10);
            }
            this.f23748f.remove(str);
            if (this.f23751i >= 2000) {
                x();
                return;
            }
            return;
        }
        c2094b.f23733f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        S(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f23750h
            long r2 = r4.f23744b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L27
            java.util.LinkedHashMap r0 = r4.f23748f
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            v1.b r1 = (v1.C2094b) r1
            boolean r2 = r1.f23733f
            if (r2 != 0) goto L12
            r4.S(r1)
            goto L0
        L26:
            return
        L27:
            r0 = 0
            r4.f23755n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.C2098f.a0():void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f23753l && !this.f23754m) {
                for (C2094b c2094b : (C2094b[]) this.f23748f.values().toArray(new C2094b[0])) {
                    t tVar = c2094b.f23734g;
                    if (tVar != null) {
                        C2094b c2094b2 = (C2094b) tVar.f540b;
                        if (kotlin.jvm.internal.h.a(c2094b2.f23734g, tVar)) {
                            c2094b2.f23733f = true;
                        }
                    }
                }
                a0();
                Y7.B.d(this.f23749g);
                B b9 = this.j;
                kotlin.jvm.internal.h.b(b9);
                b9.close();
                this.j = null;
                this.f23754m = true;
                return;
            }
            this.f23754m = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized t d(String str) {
        t tVar;
        try {
            if (!this.f23754m) {
                g0(str);
                s();
                C2094b c2094b = (C2094b) this.f23748f.get(str);
                if (c2094b != null) {
                    tVar = c2094b.f23734g;
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    return null;
                }
                if (c2094b != null && c2094b.f23735h != 0) {
                    return null;
                }
                if (!this.f23755n && !this.f23756o) {
                    B b9 = this.j;
                    kotlin.jvm.internal.h.b(b9);
                    b9.X("DIRTY");
                    b9.y(32);
                    b9.X(str);
                    b9.y(10);
                    b9.flush();
                    if (this.f23752k) {
                        return null;
                    }
                    if (c2094b == null) {
                        c2094b = new C2094b(this, str);
                        this.f23748f.put(str, c2094b);
                    }
                    t tVar2 = new t(this, c2094b);
                    c2094b.f23734g = tVar2;
                    return tVar2;
                }
                x();
                return null;
            }
            throw new IllegalStateException("cache is closed");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f23753l) {
            return;
        }
        if (!this.f23754m) {
            a0();
            B b9 = this.j;
            kotlin.jvm.internal.h.b(b9);
            b9.flush();
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized C2095c g(String str) {
        C2095c a5;
        if (!this.f23754m) {
            g0(str);
            s();
            C2094b c2094b = (C2094b) this.f23748f.get(str);
            if (c2094b != null && (a5 = c2094b.a()) != null) {
                boolean z9 = true;
                this.f23751i++;
                B b9 = this.j;
                kotlin.jvm.internal.h.b(b9);
                b9.X("READ");
                b9.y(32);
                b9.X(str);
                b9.y(10);
                if (this.f23751i < 2000) {
                    z9 = false;
                }
                if (z9) {
                    x();
                }
                return a5;
            }
            return null;
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void h0() {
        Throwable th;
        try {
            B b9 = this.j;
            if (b9 != null) {
                b9.close();
            }
            B a5 = v4.e.a(this.f23757p.j(this.f23746d));
            try {
                a5.X("libcore.io.DiskLruCache");
                a5.y(10);
                a5.X("1");
                a5.y(10);
                a5.Y(1);
                a5.y(10);
                a5.Y(2);
                a5.y(10);
                a5.y(10);
                for (C2094b c2094b : this.f23748f.values()) {
                    if (c2094b.f23734g != null) {
                        a5.X("DIRTY");
                        a5.y(32);
                        a5.X(c2094b.f23728a);
                        a5.y(10);
                    } else {
                        a5.X("CLEAN");
                        a5.y(32);
                        a5.X(c2094b.f23728a);
                        for (long j : c2094b.f23729b) {
                            a5.y(32);
                            a5.Y(j);
                        }
                        a5.y(10);
                    }
                }
                try {
                    a5.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                try {
                    a5.close();
                } catch (Throwable th4) {
                    O4.h.a(th3, th4);
                }
                th = th3;
            }
            if (th == null) {
                if (this.f23757p.e(this.f23745c)) {
                    this.f23757p.l(this.f23745c, this.f23747e);
                    this.f23757p.l(this.f23746d, this.f23745c);
                    this.f23757p.d(this.f23747e);
                } else {
                    this.f23757p.l(this.f23746d, this.f23745c);
                }
                this.j = F();
                this.f23751i = 0;
                this.f23752k = false;
                this.f23756o = false;
            } else {
                throw th;
            }
        } catch (Throwable th5) {
            throw th5;
        }
    }

    public final synchronized void s() {
        try {
            if (this.f23753l) {
                return;
            }
            this.f23757p.d(this.f23746d);
            if (this.f23757p.e(this.f23747e)) {
                if (this.f23757p.e(this.f23745c)) {
                    this.f23757p.d(this.f23747e);
                } else {
                    this.f23757p.l(this.f23747e, this.f23745c);
                }
            }
            if (this.f23757p.e(this.f23745c)) {
                try {
                    N();
                    I();
                    this.f23753l = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        D1.m(this.f23757p, this.f23743a);
                        this.f23754m = false;
                    } catch (Throwable th) {
                        this.f23754m = false;
                        throw th;
                    }
                }
            }
            h0();
            this.f23753l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void x() {
        Y7.B.r(this.f23749g, null, new C2097e(this, null), 3);
    }
}
