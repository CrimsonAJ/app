package o1;

import androidx.work.impl.WorkDatabase;
import e1.t;
import e1.w;
import f1.C1160b;
import f1.InterfaceC1161c;
import java.util.Iterator;
import java.util.LinkedList;
import k4.C1499E;

/* renamed from: o1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractRunnableC1668c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final O0.c f21463a = new O0.c(24);

    public static void a(f1.k kVar, String str) {
        WorkDatabase workDatabase = kVar.j;
        G6.e v8 = workDatabase.v();
        C1499E q9 = workDatabase.q();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int j = v8.j(str2);
            if (j != 3 && j != 4) {
                v8.r(6, str2);
            }
            linkedList.addAll(q9.f(str2));
        }
        C1160b c1160b = kVar.f17303m;
        synchronized (c1160b.f17273k) {
            try {
                boolean z9 = false;
                e1.q.d().a(C1160b.f17263l, "Processor cancelling " + str, new Throwable[0]);
                c1160b.f17272i.add(str);
                f1.l lVar = (f1.l) c1160b.f17269f.remove(str);
                if (lVar != null) {
                    z9 = true;
                }
                if (lVar == null) {
                    lVar = (f1.l) c1160b.f17270g.remove(str);
                }
                C1160b.c(str, lVar);
                if (z9) {
                    c1160b.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = kVar.f17302l.iterator();
        while (it.hasNext()) {
            ((InterfaceC1161c) it.next()).b(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        O0.c cVar = this.f21463a;
        try {
            b();
            cVar.P(w.f17070V);
        } catch (Throwable th) {
            cVar.P(new t(th));
        }
    }
}
