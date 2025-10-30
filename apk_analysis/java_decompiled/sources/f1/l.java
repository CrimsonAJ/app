package f1;

import G0.G;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import b5.G1;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.firebase.messaging.s;
import e1.m;
import e1.o;
import e1.p;
import e1.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import k4.C1499E;
import n1.C1608e;
import n1.C1613j;
import p1.C1847j;
import s8.n;
import u0.z;

/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    public static final String f17307t = q.j("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public Context f17308a;

    /* renamed from: b, reason: collision with root package name */
    public String f17309b;

    /* renamed from: c, reason: collision with root package name */
    public List f17310c;

    /* renamed from: d, reason: collision with root package name */
    public G1 f17311d;

    /* renamed from: e, reason: collision with root package name */
    public C1613j f17312e;

    /* renamed from: f, reason: collision with root package name */
    public ListenableWorker f17313f;

    /* renamed from: g, reason: collision with root package name */
    public G1 f17314g;

    /* renamed from: h, reason: collision with root package name */
    public p f17315h;

    /* renamed from: i, reason: collision with root package name */
    public e1.b f17316i;
    public C1160b j;

    /* renamed from: k, reason: collision with root package name */
    public WorkDatabase f17317k;

    /* renamed from: l, reason: collision with root package name */
    public G6.e f17318l;

    /* renamed from: m, reason: collision with root package name */
    public C1499E f17319m;

    /* renamed from: n, reason: collision with root package name */
    public C1499E f17320n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f17321o;

    /* renamed from: p, reason: collision with root package name */
    public String f17322p;

    /* renamed from: q, reason: collision with root package name */
    public C1847j f17323q;

    /* renamed from: r, reason: collision with root package name */
    public S5.p f17324r;

    /* renamed from: s, reason: collision with root package name */
    public volatile boolean f17325s;

    public final void a(p pVar) {
        boolean z9;
        boolean z10 = pVar instanceof o;
        String str = f17307t;
        if (z10) {
            q.d().i(str, z.e("Worker result SUCCESS for ", this.f17322p), new Throwable[0]);
            if (this.f17312e.c()) {
                d();
                return;
            }
            C1499E c1499e = this.f17319m;
            String str2 = this.f17309b;
            G6.e eVar = this.f17318l;
            WorkDatabase workDatabase = this.f17317k;
            workDatabase.c();
            try {
                eVar.r(3, str2);
                eVar.p(str2, ((o) this.f17315h).f17059a);
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList f9 = c1499e.f(str2);
                int size = f9.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = f9.get(i9);
                    i9++;
                    String str3 = (String) obj;
                    if (eVar.j(str3) == 5) {
                        G a5 = G.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                        if (str3 == null) {
                            a5.t(1);
                        } else {
                            a5.m(1, str3);
                        }
                        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c1499e.f19985b;
                        workDatabase_Impl.b();
                        Cursor w7 = n.w(workDatabase_Impl, a5, false);
                        try {
                            if (w7.moveToFirst() && w7.getInt(0) != 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                q.d().i(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                                eVar.r(1, str3);
                                eVar.q(currentTimeMillis, str3);
                            }
                        } finally {
                            w7.close();
                            a5.g();
                        }
                    }
                }
                workDatabase.p();
                workDatabase.m();
                e(false);
                return;
            } catch (Throwable th) {
                workDatabase.m();
                e(false);
                throw th;
            }
        }
        if (pVar instanceof e1.n) {
            q.d().i(str, z.e("Worker result RETRY for ", this.f17322p), new Throwable[0]);
            c();
            return;
        }
        q.d().i(str, z.e("Worker result FAILURE for ", this.f17322p), new Throwable[0]);
        if (this.f17312e.c()) {
            d();
        } else {
            g();
        }
    }

    public final void b() {
        boolean h7 = h();
        String str = this.f17309b;
        WorkDatabase workDatabase = this.f17317k;
        if (!h7) {
            workDatabase.c();
            try {
                int j = this.f17318l.j(str);
                s u9 = workDatabase.u();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) u9.f16504b;
                workDatabase_Impl.b();
                C1608e c1608e = (C1608e) u9.f16506d;
                R0.j a5 = c1608e.a();
                if (str == null) {
                    a5.t(1);
                } else {
                    a5.m(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a5.a();
                    workDatabase_Impl.p();
                    if (j == 0) {
                        e(false);
                    } else if (j == 2) {
                        a(this.f17315h);
                    } else if (!AbstractC0953k1.c(j)) {
                        c();
                    }
                    workDatabase.p();
                    workDatabase.m();
                } finally {
                    workDatabase_Impl.m();
                    c1608e.i(a5);
                }
            } catch (Throwable th) {
                workDatabase.m();
                throw th;
            }
        }
        List list = this.f17310c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC1161c) it.next()).b(str);
            }
            d.a(this.f17316i, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f17309b;
        G6.e eVar = this.f17318l;
        WorkDatabase workDatabase = this.f17317k;
        workDatabase.c();
        try {
            eVar.r(1, str);
            eVar.q(System.currentTimeMillis(), str);
            eVar.o(-1L, str);
            workDatabase.p();
        } finally {
            workDatabase.m();
            e(true);
        }
    }

    public final void d() {
        String str = this.f17309b;
        G6.e eVar = this.f17318l;
        WorkDatabase workDatabase = this.f17317k;
        workDatabase.c();
        try {
            eVar.q(System.currentTimeMillis(), str);
            eVar.r(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) eVar.f2887a;
            workDatabase_Impl.b();
            C1608e c1608e = (C1608e) eVar.f2893g;
            R0.j a5 = c1608e.a();
            if (str == null) {
                a5.t(1);
            } else {
                a5.m(1, str);
            }
            workDatabase_Impl.c();
            try {
                a5.a();
                workDatabase_Impl.p();
                workDatabase_Impl.m();
                c1608e.i(a5);
                eVar.o(-1L, str);
                workDatabase.p();
            } catch (Throwable th) {
                workDatabase_Impl.m();
                c1608e.i(a5);
                throw th;
            }
        } finally {
            workDatabase.m();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:3:0x0005, B:10:0x0032, B:12:0x003a, B:14:0x0046, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:21:0x0068, B:22:0x006e, B:30:0x007b, B:32:0x007c, B:38:0x0090, B:39:0x0096, B:24:0x006f, B:25:0x0077, B:5:0x0020, B:7:0x0027), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.f17317k
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.f17317k     // Catch: java.lang.Throwable -> L42
            G6.e r0 = r0.v()     // Catch: java.lang.Throwable -> L42
            r0.getClass()     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            G0.G r1 = G0.G.a(r2, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = r0.f2887a     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L42
            r0.b()     // Catch: java.lang.Throwable -> L42
            android.database.Cursor r0 = s8.n.w(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2f
            r4 = 1
            if (r3 == 0) goto L31
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L31
            r3 = r4
            goto L32
        L2f:
            r6 = move-exception
            goto L90
        L31:
            r3 = r2
        L32:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.g()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L44
            android.content.Context r0 = r5.f17308a     // Catch: java.lang.Throwable -> L42
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            o1.AbstractC1672g.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L97
        L44:
            if (r6 == 0) goto L5a
            G6.e r0 = r5.f17318l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f17309b     // Catch: java.lang.Throwable -> L42
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L42
            r0.r(r4, r1)     // Catch: java.lang.Throwable -> L42
            G6.e r0 = r5.f17318l     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f17309b     // Catch: java.lang.Throwable -> L42
            r2 = -1
            r0.o(r2, r1)     // Catch: java.lang.Throwable -> L42
        L5a:
            n1.j r0 = r5.f17312e     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            androidx.work.ListenableWorker r0 = r5.f17313f     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            boolean r0 = r0.isRunInForeground()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L7c
            f1.b r0 = r5.j     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = r5.f17309b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r0.f17273k     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.util.HashMap r3 = r0.f17269f     // Catch: java.lang.Throwable -> L79
            r3.remove(r1)     // Catch: java.lang.Throwable -> L79
            r0.i()     // Catch: java.lang.Throwable -> L79
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            goto L7c
        L79:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L79
            throw r6     // Catch: java.lang.Throwable -> L42
        L7c:
            androidx.work.impl.WorkDatabase r0 = r5.f17317k     // Catch: java.lang.Throwable -> L42
            r0.p()     // Catch: java.lang.Throwable -> L42
            androidx.work.impl.WorkDatabase r0 = r5.f17317k
            r0.m()
            p1.j r0 = r5.f17323q
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.j(r6)
            return
        L90:
            r0.close()     // Catch: java.lang.Throwable -> L42
            r1.g()     // Catch: java.lang.Throwable -> L42
            throw r6     // Catch: java.lang.Throwable -> L42
        L97:
            androidx.work.impl.WorkDatabase r0 = r5.f17317k
            r0.m()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.l.e(boolean):void");
    }

    public final void f() {
        G6.e eVar = this.f17318l;
        String str = this.f17309b;
        int j = eVar.j(str);
        String str2 = f17307t;
        if (j == 2) {
            q.d().a(str2, A0.a.n("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            e(true);
            return;
        }
        q d9 = q.d();
        StringBuilder r5 = AbstractC0953k1.r("Status for ", str, " is ");
        r5.append(AbstractC0953k1.A(j));
        r5.append("; not doing any work");
        d9.a(str2, r5.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        String str = this.f17309b;
        WorkDatabase workDatabase = this.f17317k;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                G6.e eVar = this.f17318l;
                if (eVar.j(str2) != 6) {
                    eVar.r(4, str2);
                }
                linkedList.addAll(this.f17319m.f(str2));
            }
            this.f17318l.p(str, ((m) this.f17315h).f17058a);
            workDatabase.p();
        } finally {
            workDatabase.m();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f17325s) {
            return false;
        }
        q.d().a(f17307t, z.e("Work interrupted for ", this.f17322p), new Throwable[0]);
        if (this.f17318l.j(this.f17309b) == 0) {
            e(false);
            return true;
        }
        e(!AbstractC0953k1.c(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r6 != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [p1.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.l.run():void");
    }
}
