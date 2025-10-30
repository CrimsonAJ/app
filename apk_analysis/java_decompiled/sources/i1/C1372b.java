package i1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import e1.q;
import f1.InterfaceC1161c;
import f1.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import n1.C1607d;
import n1.C1613j;
import o1.C1671f;

/* renamed from: i1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1372b implements InterfaceC1161c {

    /* renamed from: e, reason: collision with root package name */
    public static final String f18443e = q.j("SystemJobScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f18444a;

    /* renamed from: b, reason: collision with root package name */
    public final JobScheduler f18445b;

    /* renamed from: c, reason: collision with root package name */
    public final k f18446c;

    /* renamed from: d, reason: collision with root package name */
    public final C1371a f18447d;

    public C1372b(Context context, k kVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C1371a c1371a = new C1371a(context);
        this.f18444a = context;
        this.f18446c = kVar;
        this.f18445b = jobScheduler;
        this.f18447d = c1371a;
    }

    public static void a(JobScheduler jobScheduler, int i9) {
        try {
            jobScheduler.cancel(i9);
        } catch (Throwable th) {
            q.d().c(f18443e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i9)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0013 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList c(android.content.Context r7, android.app.job.JobScheduler r8, java.lang.String r9) {
        /*
            java.util.ArrayList r7 = e(r7, r8)
            r8 = 0
            if (r7 != 0) goto L8
            return r8
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            int r1 = r7.size()
            r2 = 0
        L13:
            if (r2 >= r1) goto L43
            java.lang.Object r3 = r7.get(r2)
            int r2 = r2 + 1
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r4 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r5 = r3.getExtras()
            if (r5 == 0) goto L30
            boolean r6 = r5.containsKey(r4)     // Catch: java.lang.NullPointerException -> L30
            if (r6 == 0) goto L30
            java.lang.String r4 = r5.getString(r4)     // Catch: java.lang.NullPointerException -> L30
            goto L31
        L30:
            r4 = r8
        L31:
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L13
            int r3 = r3.getId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            goto L13
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1372b.c(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            q.d().c(f18443e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // f1.InterfaceC1161c
    public final void b(String str) {
        Context context = this.f18444a;
        JobScheduler jobScheduler = this.f18445b;
        ArrayList c3 = c(context, jobScheduler, str);
        if (c3 != null && !c3.isEmpty()) {
            int size = c3.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = c3.get(i9);
                i9++;
                a(jobScheduler, ((Integer) obj).intValue());
            }
            this.f18446c.j.s().z(str);
        }
    }

    @Override // f1.InterfaceC1161c
    public final void d(C1613j... c1613jArr) {
        int G8;
        ArrayList c3;
        int G9;
        k kVar = this.f18446c;
        WorkDatabase workDatabase = kVar.j;
        C1671f c1671f = new C1671f(0, workDatabase);
        for (C1613j c1613j : c1613jArr) {
            workDatabase.c();
            try {
                C1613j l9 = workDatabase.v().l(c1613j.f21031a);
                String str = f18443e;
                if (l9 == null) {
                    q.d().k(str, "Skipping scheduling " + c1613j.f21031a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.p();
                } else if (l9.f21032b != 1) {
                    q.d().k(str, "Skipping scheduling " + c1613j.f21031a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.p();
                } else {
                    C1607d r5 = workDatabase.s().r(c1613j.f21031a);
                    if (r5 != null) {
                        G8 = r5.f21015b;
                    } else {
                        kVar.f17300i.getClass();
                        G8 = c1671f.G(kVar.f17300i.f17028g);
                    }
                    if (r5 == null) {
                        kVar.j.s().u(new C1607d(c1613j.f21031a, G8));
                    }
                    g(c1613j, G8);
                    if (Build.VERSION.SDK_INT == 23 && (c3 = c(this.f18444a, this.f18445b, c1613j.f21031a)) != null) {
                        int indexOf = c3.indexOf(Integer.valueOf(G8));
                        if (indexOf >= 0) {
                            c3.remove(indexOf);
                        }
                        if (!c3.isEmpty()) {
                            G9 = ((Integer) c3.get(0)).intValue();
                        } else {
                            kVar.f17300i.getClass();
                            G9 = c1671f.G(kVar.f17300i.f17028g);
                        }
                        g(c1613j, G9);
                    }
                    workDatabase.p();
                }
            } finally {
                workDatabase.m();
            }
        }
    }

    @Override // f1.InterfaceC1161c
    public final boolean f() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0071, code lost:
    
        if (r11 < 26) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(n1.C1613j r19, int r20) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.C1372b.g(n1.j, int):void");
    }
}
