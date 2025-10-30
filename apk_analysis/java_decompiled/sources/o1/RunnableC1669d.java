package o1;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import e1.t;
import e1.w;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1669d implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public static final String f21464c = e1.q.j("EnqueueRunnable");

    /* renamed from: a, reason: collision with root package name */
    public final f1.e f21465a;

    /* renamed from: b, reason: collision with root package name */
    public final O0.c f21466b = new O0.c(24);

    public RunnableC1669d(f1.e eVar) {
        this.f21465a = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019e  */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(f1.e r22) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.RunnableC1669d.a(f1.e):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        O0.c cVar = this.f21466b;
        f1.e eVar = this.f21465a;
        try {
            eVar.getClass();
            HashSet hashSet = new HashSet();
            hashSet.addAll(eVar.f17280q);
            HashSet g02 = f1.e.g0(eVar);
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (g02.contains((String) it.next())) {
                        z9 = true;
                        break;
                    }
                } else {
                    hashSet.removeAll(eVar.f17280q);
                    z9 = false;
                    break;
                }
            }
            if (!z9) {
                f1.k kVar = eVar.f17276m;
                WorkDatabase workDatabase = kVar.j;
                workDatabase.c();
                try {
                    boolean a5 = a(eVar);
                    workDatabase.p();
                    if (a5) {
                        AbstractC1672g.a(kVar.f17299h, RescheduleReceiver.class, true);
                        f1.d.a(kVar.f17300i, kVar.j, kVar.f17302l);
                    }
                    cVar.P(w.f17070V);
                    return;
                } finally {
                    workDatabase.m();
                }
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + eVar + ")");
        } catch (Throwable th) {
            cVar.P(new t(th));
        }
    }
}
