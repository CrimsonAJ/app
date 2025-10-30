package x8;

import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final u f24664a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [x8.u] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        ?? r0;
        try {
            Class.forName("java.nio.file.Files");
            r0 = new Object();
        } catch (ClassNotFoundException unused) {
            r0 = new Object();
        }
        f24664a = r0;
        String str = y.f24685b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.h.d(property, "getProperty(...)");
        d0.o.g(property, false);
        ClassLoader classLoader = y8.g.class.getClassLoader();
        kotlin.jvm.internal.h.d(classLoader, "getClassLoader(...)");
        new y8.g(classLoader);
    }

    public final void a(y yVar) {
        B7.i iVar = new B7.i();
        while (yVar != null && !e(yVar)) {
            iVar.addFirst(yVar);
            yVar = yVar.c();
        }
        Iterator<E> it = iVar.iterator();
        while (it.hasNext()) {
            y dir = (y) it.next();
            kotlin.jvm.internal.h.e(dir, "dir");
            b(dir);
        }
    }

    public abstract void b(y yVar);

    public abstract void c(y yVar);

    public final void d(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        c(path);
    }

    public final boolean e(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        if (h(path) != null) {
            return true;
        }
        return false;
    }

    public abstract List f(y yVar);

    public final m g(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        m h7 = h(path);
        if (h7 != null) {
            return h7;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract m h(y yVar);

    public abstract t i(y yVar);

    public abstract G j(y yVar);

    public abstract I k(y yVar);
}
