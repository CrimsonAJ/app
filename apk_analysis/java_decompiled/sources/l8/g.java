package l8;

import A6.t;
import W7.l;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.android.gms.internal.measurement.D1;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import s8.p;
import x8.B;
import x8.C;
import x8.C2182b;
import x8.C2183c;
import x8.K;
import x8.w;

/* loaded from: classes.dex */
public final class g implements Closeable, Flushable, AutoCloseable {

    /* renamed from: r, reason: collision with root package name */
    public static final W7.c f20635r = new W7.c("[a-z0-9_-]{1,120}");

    /* renamed from: s, reason: collision with root package name */
    public static final String f20636s = "CLEAN";

    /* renamed from: t, reason: collision with root package name */
    public static final String f20637t = "DIRTY";

    /* renamed from: u, reason: collision with root package name */
    public static final String f20638u = "REMOVE";

    /* renamed from: v, reason: collision with root package name */
    public static final String f20639v = "READ";

    /* renamed from: a, reason: collision with root package name */
    public final File f20640a;

    /* renamed from: b, reason: collision with root package name */
    public final File f20641b;

    /* renamed from: c, reason: collision with root package name */
    public final File f20642c;

    /* renamed from: d, reason: collision with root package name */
    public final File f20643d;

    /* renamed from: e, reason: collision with root package name */
    public long f20644e;

    /* renamed from: f, reason: collision with root package name */
    public B f20645f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f20646g;

    /* renamed from: h, reason: collision with root package name */
    public int f20647h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f20648i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20649k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20650l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20651m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20652n;

    /* renamed from: o, reason: collision with root package name */
    public long f20653o;

    /* renamed from: p, reason: collision with root package name */
    public final m8.b f20654p;

    /* renamed from: q, reason: collision with root package name */
    public final f f20655q;

    public g(File file, m8.c taskRunner) {
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        this.f20640a = file;
        this.f20646g = new LinkedHashMap(0, 0.75f, true);
        this.f20654p = taskRunner.e();
        this.f20655q = new f(this, AbstractC0953k1.q(new StringBuilder(), k8.c.f20147g, " Cache"), 0);
        this.f20641b = new File(file, "journal");
        this.f20642c = new File(file, "journal.tmp");
        this.f20643d = new File(file, "journal.bkp");
    }

    public static void i0(String input) {
        W7.c cVar = f20635r;
        cVar.getClass();
        kotlin.jvm.internal.h.e(input, "input");
        if (cVar.f7942a.matcher(input).matches()) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + input + '\"').toString());
    }

    public final boolean F() {
        int i9 = this.f20647h;
        if (i9 >= 2000 && i9 >= this.f20646g.size()) {
            return true;
        }
        return false;
    }

    public final B I() {
        C2182b c2182b;
        File file = this.f20641b;
        kotlin.jvm.internal.h.e(file, "file");
        try {
            Logger logger = w.f24682a;
            c2182b = new C2182b(new FileOutputStream(file, true), 1, new Object());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = w.f24682a;
            c2182b = new C2182b(new FileOutputStream(file, true), 1, new Object());
        }
        return v4.e.a(new h(c2182b, new C0.b(5, this)));
    }

    public final void N() {
        File file = this.f20642c;
        r8.a aVar = r8.a.f22634a;
        aVar.a(file);
        Iterator it = this.f20646g.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.h.d(next, "i.next()");
            d dVar = (d) next;
            int i9 = 0;
            if (dVar.f20626g == null) {
                while (i9 < 2) {
                    this.f20644e += dVar.f20621b[i9];
                    i9++;
                }
            } else {
                dVar.f20626g = null;
                while (i9 < 2) {
                    aVar.a((File) dVar.f20622c.get(i9));
                    aVar.a((File) dVar.f20623d.get(i9));
                    i9++;
                }
                it.remove();
            }
        }
    }

    public final void O() {
        File file = this.f20641b;
        kotlin.jvm.internal.h.e(file, "file");
        Logger logger = w.f24682a;
        C b9 = v4.e.b(new C2183c(new FileInputStream(file), K.f24618d));
        try {
            String a02 = b9.a0(Long.MAX_VALUE);
            String a03 = b9.a0(Long.MAX_VALUE);
            String a04 = b9.a0(Long.MAX_VALUE);
            String a05 = b9.a0(Long.MAX_VALUE);
            String a06 = b9.a0(Long.MAX_VALUE);
            if ("libcore.io.DiskLruCache".equals(a02) && "1".equals(a03) && kotlin.jvm.internal.h.a(String.valueOf(201105), a04) && kotlin.jvm.internal.h.a(String.valueOf(2), a05) && a06.length() <= 0) {
                int i9 = 0;
                while (true) {
                    try {
                        S(b9.a0(Long.MAX_VALUE));
                        i9++;
                    } catch (EOFException unused) {
                        this.f20647h = i9 - this.f20646g.size();
                        if (!b9.a()) {
                            a0();
                        } else {
                            this.f20645f = I();
                        }
                        b9.close();
                        return;
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + a02 + ", " + a03 + ", " + a05 + ", " + a06 + ']');
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                D1.h(b9, th);
                throw th2;
            }
        }
    }

    public final void S(String str) {
        String substring;
        int R2 = W7.d.R(str, ' ', 0, 6);
        if (R2 != -1) {
            int i9 = R2 + 1;
            int R8 = W7.d.R(str, ' ', i9, 4);
            LinkedHashMap linkedHashMap = this.f20646g;
            if (R8 == -1) {
                substring = str.substring(i9);
                kotlin.jvm.internal.h.d(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = f20638u;
                if (R2 == str2.length() && l.L(str, str2, false)) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i9, R8);
                kotlin.jvm.internal.h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            d dVar = (d) linkedHashMap.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring);
                linkedHashMap.put(substring, dVar);
            }
            if (R8 != -1) {
                String str3 = f20636s;
                if (R2 == str3.length() && l.L(str, str3, false)) {
                    String substring2 = str.substring(R8 + 1);
                    kotlin.jvm.internal.h.d(substring2, "this as java.lang.String).substring(startIndex)");
                    List a02 = W7.d.a0(substring2, new char[]{' '});
                    dVar.f20624e = true;
                    dVar.f20626g = null;
                    int size = a02.size();
                    dVar.j.getClass();
                    if (size == 2) {
                        try {
                            int size2 = a02.size();
                            for (int i10 = 0; i10 < size2; i10++) {
                                dVar.f20621b[i10] = Long.parseLong((String) a02.get(i10));
                            }
                            return;
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + a02);
                        }
                    }
                    throw new IOException("unexpected journal line: " + a02);
                }
            }
            if (R8 == -1) {
                String str4 = f20637t;
                if (R2 == str4.length() && l.L(str, str4, false)) {
                    dVar.f20626g = new t(this, dVar);
                    return;
                }
            }
            if (R8 == -1) {
                String str5 = f20639v;
                if (R2 == str5.length() && l.L(str, str5, false)) {
                    return;
                }
            }
            throw new IOException("unexpected journal line: ".concat(str));
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void a() {
        if (this.f20650l) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void a0() {
        C2182b c2182b;
        try {
            B b9 = this.f20645f;
            if (b9 != null) {
                b9.close();
            }
            File file = this.f20642c;
            kotlin.jvm.internal.h.e(file, "file");
            try {
                Logger logger = w.f24682a;
                c2182b = new C2182b(new FileOutputStream(file, false), 1, new Object());
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                Logger logger2 = w.f24682a;
                c2182b = new C2182b(new FileOutputStream(file, false), 1, new Object());
            }
            B a5 = v4.e.a(c2182b);
            try {
                a5.X("libcore.io.DiskLruCache");
                a5.y(10);
                a5.X("1");
                a5.y(10);
                a5.Y(201105);
                a5.y(10);
                a5.Y(2);
                a5.y(10);
                a5.y(10);
                for (d dVar : this.f20646g.values()) {
                    if (dVar.f20626g != null) {
                        a5.X(f20637t);
                        a5.y(32);
                        a5.X(dVar.f20620a);
                        a5.y(10);
                    } else {
                        a5.X(f20636s);
                        a5.y(32);
                        a5.X(dVar.f20620a);
                        for (long j : dVar.f20621b) {
                            a5.y(32);
                            a5.Y(j);
                        }
                        a5.y(10);
                    }
                }
                a5.close();
                r8.a aVar = r8.a.f22634a;
                if (aVar.c(this.f20641b)) {
                    aVar.d(this.f20641b, this.f20643d);
                }
                aVar.d(this.f20642c, this.f20641b);
                aVar.a(this.f20643d);
                this.f20645f = I();
                this.f20648i = false;
                this.f20652n = false;
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f20649k && !this.f20650l) {
                Collection values = this.f20646g.values();
                kotlin.jvm.internal.h.d(values, "lruEntries.values");
                for (d dVar : (d[]) values.toArray(new d[0])) {
                    t tVar = dVar.f20626g;
                    if (tVar != null) {
                        tVar.f();
                    }
                }
                h0();
                B b9 = this.f20645f;
                kotlin.jvm.internal.h.b(b9);
                b9.close();
                this.f20645f = null;
                this.f20650l = true;
                return;
            }
            this.f20650l = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(t editor, boolean z9) {
        kotlin.jvm.internal.h.e(editor, "editor");
        d dVar = (d) editor.f540b;
        if (kotlin.jvm.internal.h.a(dVar.f20626g, editor)) {
            if (z9 && !dVar.f20624e) {
                for (int i9 = 0; i9 < 2; i9++) {
                    boolean[] zArr = (boolean[]) editor.f541c;
                    kotlin.jvm.internal.h.b(zArr);
                    if (zArr[i9]) {
                        File file = (File) dVar.f20623d.get(i9);
                        kotlin.jvm.internal.h.e(file, "file");
                        if (!file.exists()) {
                            editor.a();
                            return;
                        }
                    } else {
                        editor.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i9);
                    }
                }
            }
            for (int i10 = 0; i10 < 2; i10++) {
                File file2 = (File) dVar.f20623d.get(i10);
                if (z9 && !dVar.f20625f) {
                    r8.a aVar = r8.a.f22634a;
                    if (aVar.c(file2)) {
                        File file3 = (File) dVar.f20622c.get(i10);
                        aVar.d(file2, file3);
                        long j = dVar.f20621b[i10];
                        long length = file3.length();
                        dVar.f20621b[i10] = length;
                        this.f20644e = (this.f20644e - j) + length;
                    }
                } else {
                    kotlin.jvm.internal.h.e(file2, "file");
                    if (!file2.delete() && file2.exists()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }
            dVar.f20626g = null;
            if (dVar.f20625f) {
                g0(dVar);
                return;
            }
            this.f20647h++;
            B b9 = this.f20645f;
            kotlin.jvm.internal.h.b(b9);
            if (!dVar.f20624e && !z9) {
                this.f20646g.remove(dVar.f20620a);
                b9.X(f20638u);
                b9.y(32);
                b9.X(dVar.f20620a);
                b9.y(10);
                b9.flush();
                if (this.f20644e <= 5242880 || F()) {
                    this.f20654p.c(this.f20655q, 0L);
                }
                return;
            }
            dVar.f20624e = true;
            b9.X(f20636s);
            b9.y(32);
            b9.X(dVar.f20620a);
            for (long j4 : dVar.f20621b) {
                b9.y(32);
                b9.Y(j4);
            }
            b9.y(10);
            if (z9) {
                long j9 = this.f20653o;
                this.f20653o = 1 + j9;
                dVar.f20628i = j9;
            }
            b9.flush();
            if (this.f20644e <= 5242880) {
            }
            this.f20654p.c(this.f20655q, 0L);
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (!this.f20649k) {
            return;
        }
        a();
        h0();
        B b9 = this.f20645f;
        kotlin.jvm.internal.h.b(b9);
        b9.flush();
    }

    public final synchronized t g(long j, String key) {
        t tVar;
        try {
            kotlin.jvm.internal.h.e(key, "key");
            x();
            a();
            i0(key);
            d dVar = (d) this.f20646g.get(key);
            if (j != -1 && (dVar == null || dVar.f20628i != j)) {
                return null;
            }
            if (dVar != null) {
                tVar = dVar.f20626g;
            } else {
                tVar = null;
            }
            if (tVar != null) {
                return null;
            }
            if (dVar != null && dVar.f20627h != 0) {
                return null;
            }
            if (!this.f20651m && !this.f20652n) {
                B b9 = this.f20645f;
                kotlin.jvm.internal.h.b(b9);
                b9.X(f20637t);
                b9.y(32);
                b9.X(key);
                b9.y(10);
                b9.flush();
                if (this.f20648i) {
                    return null;
                }
                if (dVar == null) {
                    dVar = new d(this, key);
                    this.f20646g.put(key, dVar);
                }
                t tVar2 = new t(this, dVar);
                dVar.f20626g = tVar2;
                return tVar2;
            }
            this.f20654p.c(this.f20655q, 0L);
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void g0(d entry) {
        B b9;
        kotlin.jvm.internal.h.e(entry, "entry");
        boolean z9 = this.j;
        String str = entry.f20620a;
        if (!z9) {
            if (entry.f20627h > 0 && (b9 = this.f20645f) != null) {
                b9.X(f20637t);
                b9.y(32);
                b9.X(str);
                b9.y(10);
                b9.flush();
            }
            if (entry.f20627h > 0 || entry.f20626g != null) {
                entry.f20625f = true;
                return;
            }
        }
        t tVar = entry.f20626g;
        if (tVar != null) {
            tVar.f();
        }
        for (int i9 = 0; i9 < 2; i9++) {
            File file = (File) entry.f20622c.get(i9);
            kotlin.jvm.internal.h.e(file, "file");
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
            long j = this.f20644e;
            long[] jArr = entry.f20621b;
            this.f20644e = j - jArr[i9];
            jArr[i9] = 0;
        }
        this.f20647h++;
        B b10 = this.f20645f;
        if (b10 != null) {
            b10.X(f20638u);
            b10.y(32);
            b10.X(str);
            b10.y(10);
        }
        this.f20646g.remove(str);
        if (F()) {
            this.f20654p.c(this.f20655q, 0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        g0(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0() {
        /*
            r4 = this;
        L0:
            long r0 = r4.f20644e
            r2 = 5242880(0x500000, double:2.590327E-317)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L28
            java.util.LinkedHashMap r0 = r4.f20646g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            l8.d r1 = (l8.d) r1
            boolean r2 = r1.f20625f
            if (r2 != 0) goto L13
            r4.g0(r1)
            goto L0
        L27:
            return
        L28:
            r0 = 0
            r4.f20651m = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.g.h0():void");
    }

    public final synchronized e s(String key) {
        kotlin.jvm.internal.h.e(key, "key");
        x();
        a();
        i0(key);
        d dVar = (d) this.f20646g.get(key);
        if (dVar == null) {
            return null;
        }
        e a5 = dVar.a();
        if (a5 == null) {
            return null;
        }
        this.f20647h++;
        B b9 = this.f20645f;
        kotlin.jvm.internal.h.b(b9);
        b9.X(f20639v);
        b9.y(32);
        b9.X(key);
        b9.y(10);
        if (F()) {
            this.f20654p.c(this.f20655q, 0L);
        }
        return a5;
    }

    public final synchronized void x() {
        boolean z9;
        try {
            byte[] bArr = k8.c.f20141a;
            if (this.f20649k) {
                return;
            }
            r8.a aVar = r8.a.f22634a;
            if (aVar.c(this.f20643d)) {
                if (aVar.c(this.f20641b)) {
                    aVar.a(this.f20643d);
                } else {
                    aVar.d(this.f20643d, this.f20641b);
                }
            }
            File file = this.f20643d;
            kotlin.jvm.internal.h.e(file, "file");
            C2182b e8 = aVar.e(file);
            try {
                aVar.a(file);
                e8.close();
                z9 = true;
            } catch (IOException unused) {
                e8.close();
                aVar.a(file);
                z9 = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    D1.h(e8, th);
                    throw th2;
                }
            }
            this.j = z9;
            File file2 = this.f20641b;
            kotlin.jvm.internal.h.e(file2, "file");
            if (file2.exists()) {
                try {
                    O();
                    N();
                    this.f20649k = true;
                    return;
                } catch (IOException e9) {
                    p pVar = p.f22822a;
                    p pVar2 = p.f22822a;
                    String str = "DiskLruCache " + this.f20640a + " is corrupt: " + e9.getMessage() + ", removing";
                    pVar2.getClass();
                    p.i(str, 5, e9);
                    try {
                        close();
                        r8.a.f22634a.b(this.f20640a);
                        this.f20650l = false;
                    } catch (Throwable th3) {
                        this.f20650l = false;
                        throw th3;
                    }
                }
            }
            a0();
            this.f20649k = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }
}
