package I0;

import B6.u0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class i implements P0.a, g8.a, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final P0.a f3216a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.a f3217b;

    /* renamed from: c, reason: collision with root package name */
    public E7.i f3218c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f3219d;

    public i(P0.a delegate) {
        g8.d a5 = g8.e.a();
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f3216a = delegate;
        this.f3217b = a5;
    }

    @Override // g8.a
    public final void a(Object obj) {
        this.f3217b.a(null);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f3216a.close();
    }

    @Override // g8.a
    public final Object d(G7.c cVar) {
        return this.f3217b.d(cVar);
    }

    @Override // P0.a
    public final P0.c d0(String sql) {
        kotlin.jvm.internal.h.e(sql, "sql");
        return this.f3216a.d0(sql);
    }

    public final void g(StringBuilder sb) {
        List list;
        if (this.f3218c == null && this.f3219d == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
            return;
        }
        sb.append("\t\tStatus: Acquired connection");
        sb.append('\n');
        E7.i iVar = this.f3218c;
        if (iVar != null) {
            sb.append("\t\tCoroutine: " + iVar);
            sb.append('\n');
        }
        Throwable th = this.f3219d;
        if (th != null) {
            sb.append("\t\tAcquired:");
            sb.append('\n');
            W7.b bVar = new W7.b(O4.h.K(th));
            if (!bVar.hasNext()) {
                list = B7.t.f1135a;
            } else {
                Object next = bVar.next();
                if (!bVar.hasNext()) {
                    list = u0.D(next);
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(next);
                    while (bVar.hasNext()) {
                        arrayList.add(bVar.next());
                    }
                    list = arrayList;
                }
            }
            Iterator it = B7.k.m0(list).iterator();
            while (it.hasNext()) {
                sb.append("\t\t" + ((String) it.next()));
                sb.append('\n');
            }
        }
    }

    public final String toString() {
        return this.f3216a.toString();
    }
}
