package F0;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: F0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102f {

    /* renamed from: h, reason: collision with root package name */
    public static final ExecutorC0101e f2094h = new ExecutorC0101e(0);

    /* renamed from: a, reason: collision with root package name */
    public final s4.i f2095a;

    /* renamed from: b, reason: collision with root package name */
    public final A1.g f2096b;

    /* renamed from: e, reason: collision with root package name */
    public List f2099e;

    /* renamed from: g, reason: collision with root package name */
    public int f2101g;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f2098d = new CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public List f2100f = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorC0101e f2097c = f2094h;

    public C0102f(s4.i iVar, A1.g gVar) {
        this.f2095a = iVar;
        this.f2096b = gVar;
    }

    public final void a(Runnable runnable) {
        Iterator it = this.f2098d.iterator();
        while (it.hasNext()) {
            ((H) it.next()).f2038a.getClass();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void b(List list, Runnable runnable) {
        int i9 = this.f2101g + 1;
        this.f2101g = i9;
        List list2 = this.f2099e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        s4.i iVar = this.f2095a;
        if (list == null) {
            int size = list2.size();
            this.f2099e = null;
            this.f2100f = Collections.EMPTY_LIST;
            iVar.Q(0, size);
            a(runnable);
            return;
        }
        if (list2 == null) {
            this.f2099e = list;
            this.f2100f = Collections.unmodifiableList(list);
            iVar.N(0, list.size());
            a(runnable);
            return;
        }
        ((ExecutorService) this.f2096b.f18b).execute(new RunnableC0100d(this, list2, list, i9, runnable));
    }
}
