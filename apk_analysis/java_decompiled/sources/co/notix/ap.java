package co.notix;

import android.os.Build;
import e1.r;
import java.util.concurrent.TimeUnit;
import n1.C1613j;

/* loaded from: classes.dex */
public abstract class ap {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f11872a;

    public ap(d9 contextProvider) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        this.f11872a = contextProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.to
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.to r0 = (co.notix.to) r0
            int r1 = r0.f13248c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13248c = r1
            goto L18
        L13:
            co.notix.to r0 = new co.notix.to
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13246a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13248c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r6)
            goto L98
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            a.AbstractC0485a.A(r6)
            co.notix.y8 r6 = r5.f11872a
            co.notix.d9 r6 = (co.notix.d9) r6
            android.content.Context r6 = r6.a()
            f1.k r6 = f1.k.b0(r6)
            java.lang.String r2 = r5.a()
            o1.b r4 = new o1.b
            r4.<init>(r6, r2, r3)
            b5.G1 r6 = r6.f17301k
            r6.i(r4)
            O0.c r6 = r4.f21463a
            java.lang.String r2 = "workManager.cancelUniqueWork(workName)"
            kotlin.jvm.internal.h.d(r6, r2)
            java.lang.Object r6 = r6.f5264c
            p1.j r6 = (p1.C1847j) r6
            java.lang.String r2 = "result"
            kotlin.jvm.internal.h.d(r6, r2)
            boolean r2 = r6.isDone()
            if (r2 == 0) goto L71
            java.lang.Object r6 = r6.get()     // Catch: java.util.concurrent.ExecutionException -> L67
            goto L98
        L67:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            if (r0 != 0) goto L6f
            goto L70
        L6f:
            r6 = r0
        L70:
            throw r6
        L71:
            r0.f13248c = r3
            Y7.h r2 = new Y7.h
            E7.d r0 = com.google.android.gms.internal.measurement.D1.A(r0)
            r2.<init>(r3, r0)
            r2.s()
            co.notix.ro r0 = new co.notix.ro
            r0.<init>(r2, r6)
            e1.i r3 = e1.i.f17051a
            r6.a(r0, r3)
            co.notix.so r0 = new co.notix.so
            r0.<init>(r6)
            r2.u(r0)
            java.lang.Object r6 = r2.r()
            if (r6 != r1) goto L98
            return r1
        L98:
            java.lang.String r0 = "result.await()"
            kotlin.jvm.internal.h.d(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ap.a(E7.d):java.lang.Object");
    }

    public abstract String a();

    public abstract Class b();

    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(E7.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof co.notix.zo
            if (r0 == 0) goto L13
            r0 = r6
            co.notix.zo r0 = (co.notix.zo) r0
            int r1 = r0.f13704c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13704c = r1
            goto L18
        L13:
            co.notix.zo r0 = new co.notix.zo
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f13702a
            F7.a r1 = F7.a.f2587a
            int r2 = r0.f13704c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            a.AbstractC0485a.A(r6)
            goto L95
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            a.AbstractC0485a.A(r6)
            co.notix.y8 r6 = r5.f11872a
            co.notix.d9 r6 = (co.notix.d9) r6
            android.content.Context r6 = r6.a()
            f1.k r6 = f1.k.b0(r6)
            java.lang.String r2 = r5.a()
            A4.j r4 = new A4.j
            r4.<init>(r6, r2)
            b5.G1 r6 = r6.f17301k
            java.lang.Object r6 = r6.f10717b
            o1.i r6 = (o1.i) r6
            r6.execute(r4)
            java.lang.Object r6 = r4.f354b
            p1.j r6 = (p1.C1847j) r6
            java.lang.String r2 = "workManager.getWorkInfosForUniqueWork(workName)"
            kotlin.jvm.internal.h.d(r6, r2)
            boolean r2 = r6.isDone()
            if (r2 == 0) goto L6e
            java.lang.Object r6 = r6.get()     // Catch: java.util.concurrent.ExecutionException -> L64
            goto L95
        L64:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            if (r0 != 0) goto L6c
            goto L6d
        L6c:
            r6 = r0
        L6d:
            throw r6
        L6e:
            r0.f13704c = r3
            Y7.h r2 = new Y7.h
            E7.d r0 = com.google.android.gms.internal.measurement.D1.A(r0)
            r2.<init>(r3, r0)
            r2.s()
            co.notix.xo r0 = new co.notix.xo
            r0.<init>(r2, r6)
            e1.i r4 = e1.i.f17051a
            r6.a(r0, r4)
            co.notix.yo r0 = new co.notix.yo
            r0.<init>(r6)
            r2.u(r0)
            java.lang.Object r6 = r2.r()
            if (r6 != r1) goto L95
            return r1
        L95:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto Lb9
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto La0
            goto Lb9
        La0:
            java.util.Iterator r6 = r6.iterator()
        La4:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto Lb9
            java.lang.Object r0 = r6.next()
            e1.x r0 = (e1.x) r0
            int r0 = r0.f17073b
            boolean r0 = com.google.android.gms.internal.measurement.AbstractC0953k1.c(r0)
            if (r0 != 0) goto La4
            goto Lba
        Lb9:
            r3 = 0
        Lba:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.ap.b(E7.d):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e1.c] */
    public static final e1.s a(ap apVar, r rVar) {
        e1.e eVar = new e1.e();
        ?? obj = new Object();
        obj.f17031a = 1;
        obj.f17036f = -1L;
        obj.f17037g = -1L;
        obj.f17038h = new e1.e();
        obj.f17032b = false;
        int i9 = Build.VERSION.SDK_INT;
        obj.f17033c = false;
        obj.f17031a = 2;
        obj.f17034d = false;
        obj.f17035e = false;
        if (i9 >= 24) {
            obj.f17038h = eVar;
            obj.f17036f = -1L;
            obj.f17037g = -1L;
        }
        C1613j c1613j = rVar.f17064c;
        c1613j.j = obj;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        rVar.f17062a = true;
        c1613j.f21041l = 1;
        long millis = timeUnit.toMillis(30L);
        String str = C1613j.f21029s;
        if (millis > 18000000) {
            e1.q.d().k(str, "Backoff delay duration exceeds maximum value", new Throwable[0]);
            millis = 18000000;
        }
        if (millis < 10000) {
            e1.q.d().k(str, "Backoff delay duration less than minimum value", new Throwable[0]);
            millis = 10000;
        }
        c1613j.f21042m = millis;
        return rVar.a();
    }
}
