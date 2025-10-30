package v1;

import B7.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import x8.G;
import x8.I;
import x8.m;
import x8.n;
import x8.t;
import x8.u;
import x8.y;

/* renamed from: v1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2096d extends n {

    /* renamed from: b, reason: collision with root package name */
    public final u f23740b;

    public C2096d(u delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f23740b = delegate;
    }

    @Override // x8.n
    public final void b(y yVar) {
        this.f23740b.b(yVar);
    }

    @Override // x8.n
    public final void c(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        this.f23740b.c(path);
    }

    @Override // x8.n
    public final List f(y dir) {
        kotlin.jvm.internal.h.e(dir, "dir");
        List f9 = this.f23740b.f(dir);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) f9;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            y path = (y) obj;
            kotlin.jvm.internal.h.e(path, "path");
            arrayList.add(path);
        }
        p.g0(arrayList);
        return arrayList;
    }

    @Override // x8.n
    public final m h(y path) {
        kotlin.jvm.internal.h.e(path, "path");
        m h7 = this.f23740b.h(path);
        if (h7 == null) {
            return null;
        }
        y yVar = (y) h7.f24658d;
        if (yVar == null) {
            return h7;
        }
        Map extras = (Map) h7.f24663i;
        kotlin.jvm.internal.h.e(extras, "extras");
        return new m(h7.f24656b, h7.f24657c, yVar, (Long) h7.f24659e, (Long) h7.f24660f, (Long) h7.f24661g, (Long) h7.f24662h, extras);
    }

    @Override // x8.n
    public final t i(y yVar) {
        return this.f23740b.i(yVar);
    }

    @Override // x8.n
    public final G j(y yVar) {
        y c3 = yVar.c();
        if (c3 != null) {
            a(c3);
        }
        return this.f23740b.j(yVar);
    }

    @Override // x8.n
    public final I k(y file) {
        kotlin.jvm.internal.h.e(file, "file");
        return this.f23740b.k(file);
    }

    public final void l(y source, y target) {
        kotlin.jvm.internal.h.e(source, "source");
        kotlin.jvm.internal.h.e(target, "target");
        this.f23740b.l(source, target);
    }

    public final String toString() {
        return kotlin.jvm.internal.p.a(C2096d.class).c() + '(' + this.f23740b + ')';
    }
}
