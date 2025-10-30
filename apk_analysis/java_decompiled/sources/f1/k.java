package f1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import b5.G1;
import e1.q;
import i.G;
import i1.C1372b;
import java.util.ArrayList;
import java.util.List;
import n1.C1608e;

/* loaded from: classes.dex */
public final class k extends v4.e {

    /* renamed from: q, reason: collision with root package name */
    public static k f17296q;

    /* renamed from: r, reason: collision with root package name */
    public static k f17297r;

    /* renamed from: s, reason: collision with root package name */
    public static final Object f17298s;

    /* renamed from: h, reason: collision with root package name */
    public final Context f17299h;

    /* renamed from: i, reason: collision with root package name */
    public final e1.b f17300i;
    public final WorkDatabase j;

    /* renamed from: k, reason: collision with root package name */
    public final G1 f17301k;

    /* renamed from: l, reason: collision with root package name */
    public final List f17302l;

    /* renamed from: m, reason: collision with root package name */
    public final C1160b f17303m;

    /* renamed from: n, reason: collision with root package name */
    public final G f17304n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17305o;

    /* renamed from: p, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f17306p;

    static {
        q.j("WorkManagerImpl");
        f17296q = null;
        f17297r = null;
        f17298s = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0314, code lost:
    
        throw new java.lang.IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c0 A[LOOP:6: B:115:0x0389->B:126:0x03c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0552 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(android.content.Context r38, e1.b r39, b5.G1 r40) {
        /*
            Method dump skipped, instructions count: 1607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.k.<init>(android.content.Context, e1.b, b5.G1):void");
    }

    public static k a0() {
        synchronized (f17298s) {
            try {
                k kVar = f17296q;
                if (kVar != null) {
                    return kVar;
                }
                return f17297r;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static k b0(Context context) {
        k a02;
        synchronized (f17298s) {
            try {
                a02 = a0();
                if (a02 == null) {
                    context.getApplicationContext();
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a02;
    }

    public final void c0() {
        synchronized (f17298s) {
            try {
                this.f17305o = true;
                BroadcastReceiver.PendingResult pendingResult = this.f17306p;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f17306p = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d0() {
        ArrayList e8;
        WorkDatabase workDatabase = this.j;
        Context context = this.f17299h;
        String str = C1372b.f18443e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (e8 = C1372b.e(context, jobScheduler)) != null && !e8.isEmpty()) {
            int size = e8.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = e8.get(i9);
                i9++;
                C1372b.a(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        G6.e v8 = workDatabase.v();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) v8.f2887a;
        workDatabase_Impl.b();
        C1608e c1608e = (C1608e) v8.f2895i;
        R0.j a5 = c1608e.a();
        workDatabase_Impl.c();
        try {
            a5.a();
            workDatabase_Impl.p();
            workDatabase_Impl.m();
            c1608e.i(a5);
            d.a(this.f17300i, workDatabase, this.f17302l);
        } catch (Throwable th) {
            workDatabase_Impl.m();
            c1608e.i(a5);
            throw th;
        }
    }

    public final void e0(String str, G1 g12) {
        G1 g13 = this.f17301k;
        A4.j jVar = new A4.j(18);
        jVar.f354b = this;
        jVar.f355c = str;
        jVar.f356d = g12;
        g13.i(jVar);
    }

    public final void f0(String str) {
        this.f17301k.i(new o1.j(this, str, false));
    }
}
