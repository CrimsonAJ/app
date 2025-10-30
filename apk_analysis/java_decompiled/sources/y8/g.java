package y8;

import A7.l;
import B7.k;
import B7.m;
import B7.q;
import d0.o;
import d0.w;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import x8.G;
import x8.I;
import x8.n;
import x8.t;
import x8.u;
import x8.y;

/* loaded from: classes.dex */
public final class g extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final y f25146e;

    /* renamed from: b, reason: collision with root package name */
    public final ClassLoader f25147b;

    /* renamed from: c, reason: collision with root package name */
    public final n f25148c;

    /* renamed from: d, reason: collision with root package name */
    public final l f25149d;

    static {
        String str = y.f24685b;
        f25146e = o.g("/", false);
    }

    public g(ClassLoader classLoader) {
        u systemFileSystem = n.f24664a;
        kotlin.jvm.internal.h.e(systemFileSystem, "systemFileSystem");
        this.f25147b = classLoader;
        this.f25148c = systemFileSystem;
        this.f25149d = Z0.a.q(new f(0, this));
    }

    @Override // x8.n
    public final void b(y yVar) {
        throw new IOException(this + " is read-only");
    }

    @Override // x8.n
    public final void c(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // x8.n
    public final List f(y dir) {
        kotlin.jvm.internal.h.e(dir, "dir");
        y yVar = f25146e;
        yVar.getClass();
        String q9 = c.b(yVar, dir, true).d(yVar).f24686a.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z9 = false;
        for (A7.h hVar : (List) this.f25149d.getValue()) {
            n nVar = (n) hVar.f547a;
            y yVar2 = (y) hVar.f548b;
            try {
                List f9 = nVar.f(yVar2.e(q9));
                ArrayList arrayList = new ArrayList();
                for (Object obj : f9) {
                    if (w.o((y) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(m.f0(arrayList, 10));
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    y yVar3 = (y) obj2;
                    kotlin.jvm.internal.h.e(yVar3, "<this>");
                    String replace = W7.d.Y(yVar3.f24686a.q(), yVar2.f24686a.q()).replace('\\', '/');
                    kotlin.jvm.internal.h.d(replace, "replace(...)");
                    arrayList2.add(yVar.e(replace));
                }
                q.h0(linkedHashSet, arrayList2);
                z9 = true;
            } catch (IOException unused) {
            }
        }
        if (z9) {
            return k.H0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // x8.n
    public final x8.m h(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        if (w.o(path)) {
            y yVar = f25146e;
            yVar.getClass();
            String q9 = c.b(yVar, path, true).d(yVar).f24686a.q();
            for (A7.h hVar : (List) this.f25149d.getValue()) {
                x8.m h7 = ((n) hVar.f547a).h(((y) hVar.f548b).e(q9));
                if (h7 != null) {
                    return h7;
                }
            }
            return null;
        }
        return null;
    }

    @Override // x8.n
    public final t i(y yVar) {
        if (w.o(yVar)) {
            y yVar2 = f25146e;
            yVar2.getClass();
            String q9 = c.b(yVar2, yVar, true).d(yVar2).f24686a.q();
            for (A7.h hVar : (List) this.f25149d.getValue()) {
                try {
                    return ((n) hVar.f547a).i(((y) hVar.f548b).e(q9));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + yVar);
        }
        throw new FileNotFoundException("file not found: " + yVar);
    }

    @Override // x8.n
    public final G j(y file) {
        kotlin.jvm.internal.h.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // x8.n
    public final I k(y file) {
        kotlin.jvm.internal.h.e(file, "file");
        if (w.o(file)) {
            y yVar = f25146e;
            yVar.getClass();
            URL resource = this.f25147b.getResource(c.b(yVar, file, false).d(yVar).f24686a.q());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                kotlin.jvm.internal.h.d(inputStream, "getInputStream(...)");
                return v4.e.P(inputStream);
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
