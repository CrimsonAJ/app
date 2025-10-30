package d2;

import J1.AbstractC0172e0;
import Y7.AbstractC0480v;
import Y7.C0464h;
import a.AbstractC0485a;
import android.os.Looper;
import android.os.SystemClock;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import co.notix.R;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.D1;
import f5.AbstractC1176h;
import f5.AbstractC1178j;
import f5.C1174f;
import f5.C1180l;
import f5.C1181m;
import f5.C1185q;
import f5.ExecutorC1184p;
import f5.InterfaceC1171c;
import f5.InterfaceC1172d;
import f5.InterfaceC1173e;
import f5.InterfaceC1175g;
import g1.C1198a;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import k1.AbstractC1480b;
import l1.AbstractC1532d;
import n0.C1601a;
import n1.C1613j;
import o0.RunnableC1664a;
import s4.C1957d;
import t4.C2009A;
import t4.C2014d;
import t6.ExecutorC2025j;
import z8.C2272v;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16817a;

    /* renamed from: b, reason: collision with root package name */
    public Object f16818b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16819c;

    public v(AppCompatTextView appCompatTextView, AbstractC0172e0 abstractC0172e0, Movie movie) {
        this.f16817a = 0;
        this.f16818b = abstractC0172e0;
        this.f16819c = movie;
    }

    private final void a() {
        synchronized (((C1181m) this.f16819c).f17430c) {
            try {
                InterfaceC1172d interfaceC1172d = (InterfaceC1172d) ((C1181m) this.f16819c).f17431d;
                if (interfaceC1172d != null) {
                    Exception f9 = ((AbstractC1176h) this.f16818b).f();
                    F4.y.h(f9);
                    interfaceC1172d.y(f9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void b() {
        synchronized (((C1181m) this.f16819c).f17430c) {
            try {
                InterfaceC1173e interfaceC1173e = (InterfaceC1173e) ((C1181m) this.f16819c).f17431d;
                if (interfaceC1173e != null) {
                    interfaceC1173e.o(((AbstractC1176h) this.f16818b).g());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void c() {
        synchronized (((ConstraintTrackingWorker) this.f16819c).f10449i) {
            if (((ConstraintTrackingWorker) this.f16819c).j) {
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f16819c;
                constraintTrackingWorker.f10450k.j(new Object());
            } else {
                ((ConstraintTrackingWorker) this.f16819c).f10450k.l((S5.p) this.f16818b);
            }
        }
    }

    private final void d() {
        try {
            e();
        } catch (Error e8) {
            synchronized (((ExecutorC2025j) this.f16819c).f23314b) {
                ((ExecutorC2025j) this.f16819c).f23315c = 1;
                throw e8;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        ((java.lang.Runnable) r10.f16818b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        r10.f16818b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        t6.ExecutorC2025j.f23312f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.f16818b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.f16819c     // Catch: java.lang.Throwable -> L58
            t6.j r2 = (t6.ExecutorC2025j) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.f23314b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.f16819c     // Catch: java.lang.Throwable -> L20
            t6.j r0 = (t6.ExecutorC2025j) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.f23315c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.f23316d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.f23316d = r6     // Catch: java.lang.Throwable -> L20
            r0.f23315c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.f16819c     // Catch: java.lang.Throwable -> L20
            t6.j r4 = (t6.ExecutorC2025j) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.f23314b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.f16818b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.f16819c     // Catch: java.lang.Throwable -> L20
            t6.j r0 = (t6.ExecutorC2025j) r0     // Catch: java.lang.Throwable -> L20
            r0.f23315c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.f16818b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.f16818b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = t6.ExecutorC2025j.f23312f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.f16818b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.f16818b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.v.e():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object h7;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i9 = 0;
        switch (this.f16817a) {
            case 0:
                AppCompatTextView textViewMore = ((AbstractC0172e0) this.f16818b).f3906R;
                kotlin.jvm.internal.h.d(textViewMore, "textViewMore");
                try {
                    h7 = Boolean.valueOf(!W7.l.H(r0.f3902N.getLayout().getText().toString(), ((Movie) this.f16819c).f14418e, true));
                } catch (Throwable th) {
                    h7 = AbstractC0485a.h(th);
                }
                Object obj = Boolean.FALSE;
                if (h7 instanceof A7.i) {
                    h7 = obj;
                }
                if (!((Boolean) h7).booleanValue()) {
                    i9 = 8;
                }
                textViewMore.setVisibility(i9);
                return;
            case 1:
                break;
            case 2:
                C0464h c0464h = (C0464h) this.f16818b;
                try {
                    c0464h.resumeWith(((S5.p) this.f16819c).get());
                    return;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        cause = th2;
                    }
                    if (th2 instanceof CancellationException) {
                        c0464h.c(cause);
                        return;
                    } else {
                        c0464h.resumeWith(AbstractC0485a.h(cause));
                        return;
                    }
                }
            case 3:
                if (((C1185q) ((AbstractC1176h) this.f16818b)).f17438d) {
                    ((C1180l) this.f16819c).f17427d.p();
                    return;
                }
                try {
                    ((C1180l) this.f16819c).f17427d.o(((C1180l) this.f16819c).f17426c.i((AbstractC1176h) this.f16818b));
                    return;
                } catch (C1174f e8) {
                    if (e8.getCause() instanceof Exception) {
                        ((C1180l) this.f16819c).f17427d.n((Exception) e8.getCause());
                        return;
                    } else {
                        ((C1180l) this.f16819c).f17427d.n(e8);
                        return;
                    }
                } catch (Exception e9) {
                    ((C1180l) this.f16819c).f17427d.n(e9);
                    return;
                }
            case 4:
                C1180l c1180l = (C1180l) this.f16819c;
                try {
                    AbstractC1176h abstractC1176h = (AbstractC1176h) c1180l.f17426c.i((AbstractC1176h) this.f16818b);
                    if (abstractC1176h == null) {
                        c1180l.y(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC1184p executorC1184p = AbstractC1178j.f17415b;
                    abstractC1176h.d(executorC1184p, c1180l);
                    abstractC1176h.c(executorC1184p, c1180l);
                    abstractC1176h.a(executorC1184p, c1180l);
                    return;
                } catch (C1174f e10) {
                    if (e10.getCause() instanceof Exception) {
                        c1180l.f17427d.n((Exception) e10.getCause());
                        return;
                    } else {
                        c1180l.f17427d.n(e10);
                        return;
                    }
                } catch (Exception e11) {
                    c1180l.f17427d.n(e11);
                    return;
                }
            case 5:
                synchronized (((C1181m) this.f16819c).f17430c) {
                    ((InterfaceC1171c) ((C1181m) this.f16819c).f17431d).G((AbstractC1176h) this.f16818b);
                }
                return;
            case 6:
                a();
                return;
            case 7:
                b();
                return;
            case 8:
                C1181m c1181m = (C1181m) this.f16819c;
                try {
                    C1185q s9 = ((InterfaceC1175g) c1181m.f17430c).s(((AbstractC1176h) this.f16818b).g());
                    if (s9 == null) {
                        c1181m.y(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC1184p executorC1184p2 = AbstractC1178j.f17415b;
                    s9.d(executorC1184p2, c1181m);
                    s9.c(executorC1184p2, c1181m);
                    s9.a(executorC1184p2, c1181m);
                    return;
                } catch (C1174f e12) {
                    if (e12.getCause() instanceof Exception) {
                        c1181m.y((Exception) e12.getCause());
                        return;
                    } else {
                        c1181m.y(e12);
                        return;
                    }
                } catch (CancellationException unused) {
                    c1181m.a();
                    return;
                } catch (Exception e13) {
                    c1181m.y(e13);
                    return;
                }
            case 9:
                C1185q c1185q = (C1185q) this.f16818b;
                try {
                    c1185q.o(((Callable) this.f16819c).call());
                    return;
                } catch (Exception e14) {
                    c1185q.n(e14);
                    return;
                } catch (Throwable th3) {
                    c1185q.n(new RuntimeException(th3));
                    return;
                }
            case R.styleable.GradientColor_android_endX /* 10 */:
                e1.q d9 = e1.q.d();
                String str = C1198a.f17544d;
                C1613j c1613j = (C1613j) this.f16818b;
                d9.a(str, u0.z.e("Scheduling work ", c1613j.f21031a), new Throwable[0]);
                ((C1198a) this.f16819c).f17545a.d(c1613j);
                return;
            case R.styleable.GradientColor_android_endY /* 11 */:
                ArrayList arrayList = (ArrayList) this.f16818b;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    AbstractC1480b abstractC1480b = (AbstractC1480b) obj2;
                    Object obj3 = ((AbstractC1532d) this.f16819c).f20175e;
                    abstractC1480b.f19872b = obj3;
                    abstractC1480b.d(abstractC1480b.f19874d, obj3);
                }
                return;
            case 12:
                RunnableC1664a runnableC1664a = (RunnableC1664a) this.f16819c;
                Object obj4 = this.f16818b;
                if (runnableC1664a.f21454c.get()) {
                    C1957d c1957d = runnableC1664a.f21456e;
                    if (c1957d.f22726h == runnableC1664a) {
                        SystemClock.uptimeMillis();
                        c1957d.f22726h = null;
                        c1957d.b();
                    }
                } else {
                    C1957d c1957d2 = runnableC1664a.f21456e;
                    if (c1957d2.f22725g != runnableC1664a) {
                        if (c1957d2.f22726h == runnableC1664a) {
                            SystemClock.uptimeMillis();
                            c1957d2.f22726h = null;
                            c1957d2.b();
                        }
                    } else if (!c1957d2.f22721c) {
                        SystemClock.uptimeMillis();
                        c1957d2.f22725g = null;
                        C1601a c1601a = c1957d2.f22719a;
                        if (c1601a != null) {
                            if (Looper.myLooper() == Looper.getMainLooper()) {
                                c1601a.i(obj4);
                            } else {
                                c1601a.g(obj4);
                            }
                        }
                    }
                }
                runnableC1664a.f21453b = 3;
                return;
            case 13:
                o1.i iVar = (o1.i) this.f16818b;
                try {
                    ((Runnable) this.f16819c).run();
                    return;
                } finally {
                    iVar.b();
                }
            case 14:
                c();
                return;
            case 15:
                C2009A c2009a = ((t4.z) this.f16818b).f23285f;
                y4.b bVar = C2009A.f23120G;
                y4.e eVar = (y4.e) this.f16819c;
                C2014d c2014d = eVar.f24933d;
                boolean e15 = y4.a.e(c2014d, c2009a.f23137t);
                u4.D d10 = c2009a.f23125D;
                if (!e15) {
                    c2009a.f23137t = c2014d;
                    d10.c();
                }
                double d11 = eVar.f24930a;
                if (!Double.isNaN(d11) && Math.abs(d11 - c2009a.f23139v) > 1.0E-7d) {
                    c2009a.f23139v = d11;
                    z9 = true;
                } else {
                    z9 = false;
                }
                boolean z17 = c2009a.f23140w;
                boolean z18 = eVar.f24931b;
                if (z18 != z17) {
                    c2009a.f23140w = z18;
                    z9 = true;
                }
                Object[] objArr = {Boolean.valueOf(z9), Boolean.valueOf(c2009a.f23130m)};
                y4.b bVar2 = C2009A.f23120G;
                bVar2.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr);
                if (d10 != null && (z9 || c2009a.f23130m)) {
                    d10.f();
                }
                Double.isNaN(eVar.f24936g);
                int i10 = c2009a.f23141x;
                int i11 = eVar.f24932c;
                if (i11 != i10) {
                    c2009a.f23141x = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
                bVar2.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z10), Boolean.valueOf(c2009a.f23130m));
                if (d10 != null && (z10 || c2009a.f23130m)) {
                    d10.a();
                }
                int i12 = c2009a.f23142y;
                int i13 = eVar.f24934e;
                if (i13 != i12) {
                    c2009a.f23142y = i13;
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar2.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z11), Boolean.valueOf(c2009a.f23130m));
                if (d10 != null && (z11 || c2009a.f23130m)) {
                    d10.e();
                }
                t4.u uVar = c2009a.f23143z;
                t4.u uVar2 = eVar.f24935f;
                if (!y4.a.e(uVar, uVar2)) {
                    c2009a.f23143z = uVar2;
                }
                c2009a.f23130m = false;
                return;
            case 16:
                C2009A c2009a2 = ((t4.z) this.f16818b).f23285f;
                y4.b bVar3 = C2009A.f23120G;
                String str2 = ((y4.c) this.f16819c).f24920a;
                if (!y4.a.e(str2, c2009a2.f23138u)) {
                    c2009a2.f23138u = str2;
                    z12 = true;
                } else {
                    z12 = false;
                }
                C2009A.f23120G.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z12), Boolean.valueOf(c2009a2.f23131n));
                u4.D d12 = c2009a2.f23125D;
                if (d12 != null && (z12 || c2009a2.f23131n)) {
                    d12.d();
                }
                c2009a2.f23131n = false;
                return;
            case 17:
                d();
                return;
            case 18:
                y4.b bVar4 = y4.v.r0;
                y4.e eVar2 = (y4.e) this.f16819c;
                C2014d c2014d2 = eVar2.f24933d;
                y4.v vVar = (y4.v) this.f16818b;
                boolean e16 = y4.a.e(c2014d2, vVar.f24982A);
                u4.D d13 = vVar.f24984C;
                if (!e16) {
                    vVar.f24982A = c2014d2;
                    d13.c();
                }
                double d14 = eVar2.f24930a;
                if (!Double.isNaN(d14) && Math.abs(d14 - vVar.f24992j0) > 1.0E-7d) {
                    vVar.f24992j0 = d14;
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z19 = vVar.f24989g0;
                boolean z20 = eVar2.f24931b;
                if (z20 != z19) {
                    vVar.f24989g0 = z20;
                    z13 = true;
                }
                Double.isNaN(eVar2.f24936g);
                Object[] objArr2 = {Boolean.valueOf(z13), Boolean.valueOf(vVar.f24991i0)};
                y4.b bVar5 = y4.v.r0;
                bVar5.b("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", objArr2);
                if (d13 != null && (z13 || vVar.f24991i0)) {
                    d13.f();
                }
                int i14 = vVar.f24994l0;
                int i15 = eVar2.f24932c;
                if (i15 != i14) {
                    vVar.f24994l0 = i15;
                    z14 = true;
                } else {
                    z14 = false;
                }
                bVar5.b("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z14), Boolean.valueOf(vVar.f24991i0));
                if (d13 != null && (z14 || vVar.f24991i0)) {
                    d13.a();
                }
                int i16 = vVar.f24995m0;
                int i17 = eVar2.f24934e;
                if (i17 != i16) {
                    vVar.f24995m0 = i17;
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar5.b("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z15), Boolean.valueOf(vVar.f24991i0));
                if (d13 != null && (z15 || vVar.f24991i0)) {
                    d13.e();
                }
                t4.u uVar3 = vVar.f24993k0;
                t4.u uVar4 = eVar2.f24935f;
                if (!y4.a.e(uVar3, uVar4)) {
                    vVar.f24993k0 = uVar4;
                }
                vVar.f24991i0 = false;
                return;
            case 19:
                y4.b bVar6 = y4.v.r0;
                String str3 = ((y4.c) this.f16819c).f24920a;
                y4.v vVar2 = (y4.v) this.f16818b;
                if (!y4.a.e(str3, vVar2.f24988f0)) {
                    vVar2.f24988f0 = str3;
                    z16 = true;
                } else {
                    z16 = false;
                }
                y4.v.r0.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z16), Boolean.valueOf(vVar2.f24990h0));
                u4.D d15 = vVar2.f24984C;
                if (d15 != null && (z16 || vVar2.f24990h0)) {
                    d15.d();
                }
                vVar2.f24990h0 = false;
                return;
            default:
                D1.A((C2272v) this.f16818b).resumeWith(AbstractC0485a.h((Throwable) this.f16819c));
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f16818b).run();
            } catch (Throwable th4) {
                Y7.B.o(E7.j.f1978a, th4);
            }
            d8.i iVar2 = (d8.i) this.f16819c;
            Runnable k02 = iVar2.k0();
            if (k02 != null) {
                this.f16818b = k02;
                i9++;
                if (i9 >= 16) {
                    AbstractC0480v abstractC0480v = iVar2.f16985b;
                    if (abstractC0480v.i0()) {
                        abstractC0480v.g0(iVar2, this);
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    public String toString() {
        String str;
        switch (this.f16817a) {
            case 17:
                Runnable runnable = (Runnable) this.f16818b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i9 = ((ExecutorC2025j) this.f16819c).f23315c;
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            if (i9 != 4) {
                                str = "null";
                            } else {
                                str = "RUNNING";
                            }
                        } else {
                            str = "QUEUED";
                        }
                    } else {
                        str = "QUEUING";
                    }
                } else {
                    str = "IDLE";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(Object obj, int i9, Object obj2) {
        this.f16817a = i9;
        this.f16819c = obj;
        this.f16818b = obj2;
    }

    public /* synthetic */ v(Object obj, Object obj2, int i9, boolean z9) {
        this.f16817a = i9;
        this.f16818b = obj;
        this.f16819c = obj2;
    }

    public v(ExecutorC2025j executorC2025j) {
        this.f16817a = 17;
        this.f16819c = executorC2025j;
    }
}
