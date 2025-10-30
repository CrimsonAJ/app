package x8;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class L extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final y f24622e;

    /* renamed from: b, reason: collision with root package name */
    public final y f24623b;

    /* renamed from: c, reason: collision with root package name */
    public final n f24624c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f24625d;

    static {
        String str = y.f24685b;
        f24622e = d0.o.g("/", false);
    }

    public L(y yVar, n nVar, LinkedHashMap linkedHashMap) {
        this.f24623b = yVar;
        this.f24624c = nVar;
        this.f24625d = linkedHashMap;
    }

    @Override // x8.n
    public final void b(y yVar) {
        throw new IOException("zip file systems are read-only");
    }

    @Override // x8.n
    public final void c(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // x8.n
    public final List f(y dir) {
        kotlin.jvm.internal.h.e(dir, "dir");
        y yVar = f24622e;
        yVar.getClass();
        y8.h hVar = (y8.h) this.f24625d.get(y8.c.b(yVar, dir, true));
        if (hVar != null) {
            return B7.k.H0(hVar.f25165q);
        }
        throw new IOException("not a directory: " + dir);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    @Override // x8.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final x8.m h(x8.y r26) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.L.h(x8.y):x8.m");
    }

    @Override // x8.n
    public final t i(y yVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // x8.n
    public final G j(y file) {
        kotlin.jvm.internal.h.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // x8.n
    public final I k(y file) {
        Throwable th;
        C c3;
        kotlin.jvm.internal.h.e(file, "file");
        y yVar = f24622e;
        yVar.getClass();
        y8.h hVar = (y8.h) this.f24625d.get(y8.c.b(yVar, file, true));
        if (hVar != null) {
            t i9 = this.f24624c.i(this.f24623b);
            try {
                c3 = v4.e.b(i9.g(hVar.f25157h));
                try {
                    i9.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                if (i9 != null) {
                    try {
                        i9.close();
                    } catch (Throwable th4) {
                        O4.h.a(th3, th4);
                    }
                }
                th = th3;
                c3 = null;
            }
            if (th == null) {
                kotlin.jvm.internal.h.e(c3, "<this>");
                y8.b.f(c3, null);
                int i10 = hVar.f25156g;
                long j = hVar.f25155f;
                if (i10 == 0) {
                    return new y8.e(c3, j, true);
                }
                return new y8.e(new s(v4.e.b(new y8.e(c3, hVar.f25154e, true)), new Inflater(true)), j, false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + file);
    }
}
