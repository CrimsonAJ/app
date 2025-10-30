package b5;

import F0.C0104h;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: b5.m1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648m1 extends B {

    /* renamed from: c, reason: collision with root package name */
    public final ServiceConnectionC0645l1 f11195c;

    /* renamed from: d, reason: collision with root package name */
    public G f11196d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f11197e;

    /* renamed from: f, reason: collision with root package name */
    public final C0639j1 f11198f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f11199g;

    /* renamed from: h, reason: collision with root package name */
    public final C0104h f11200h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f11201i;
    public final C0639j1 j;

    public C0648m1(C0650n0 c0650n0) {
        super(c0650n0);
        this.f11201i = new ArrayList();
        this.f11200h = new C0104h(c0650n0.f11233n);
        this.f11195c = new ServiceConnectionC0645l1(this);
        this.f11198f = new C0639j1(this, c0650n0, 0);
        this.j = new C0639j1(this, c0650n0, 1);
    }

    public static void E0(C0648m1 c0648m1, ComponentName componentName) {
        c0648m1.l0();
        if (c0648m1.f11196d != null) {
            c0648m1.f11196d = null;
            V v8 = ((C0650n0) c0648m1.f1707a).f11229i;
            C0650n0.f(v8);
            v8.f10978n.c(componentName, "Disconnected from device MeasurementService");
            c0648m1.l0();
            c0648m1.p0();
        }
    }

    public final void A0() {
        l0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        V v8 = c0650n0.f11229i;
        C0650n0.f(v8);
        ArrayList arrayList = this.f11201i;
        v8.f10978n.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            try {
                ((Runnable) obj).run();
            } catch (RuntimeException e8) {
                V v9 = c0650n0.f11229i;
                C0650n0.f(v9);
                v9.f10971f.c(e8, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.j.a();
    }

    public final void B0() {
        l0();
        C0104h c0104h = this.f11200h;
        ((K4.a) c0104h.f2115c).getClass();
        c0104h.f2114b = SystemClock.elapsedRealtime();
        ((C0650n0) this.f1707a).getClass();
        this.f11198f.c(((Long) E.Y.a(null)).longValue());
    }

    public final void C0(Runnable runnable) {
        l0();
        if (v0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f11201i;
        long size = arrayList.size();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        c0650n0.getClass();
        if (size >= 1000) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            v8.f10971f.b("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.j.c(60000L);
            p0();
        }
    }

    public final void D0() {
        ((C0650n0) this.f1707a).getClass();
    }

    @Override // b5.B
    public final boolean o0() {
        return false;
    }

    public final void p0() {
        l0();
        m0();
        if (!v0()) {
            if (!y0()) {
                C0650n0 c0650n0 = (C0650n0) this.f1707a;
                if (!c0650n0.f11227g.o0()) {
                    List<ResolveInfo> queryIntentServices = c0650n0.f11221a.getPackageManager().queryIntentServices(new Intent().setClassName(c0650n0.f11221a, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        Intent intent = new Intent("com.google.android.gms.measurement.START");
                        intent.setComponent(new ComponentName(c0650n0.f11221a, "com.google.android.gms.measurement.AppMeasurementService"));
                        ServiceConnectionC0645l1 serviceConnectionC0645l1 = this.f11195c;
                        C0648m1 c0648m1 = serviceConnectionC0645l1.f11184c;
                        c0648m1.l0();
                        Context context = ((C0650n0) c0648m1.f1707a).f11221a;
                        J4.a b9 = J4.a.b();
                        synchronized (serviceConnectionC0645l1) {
                            try {
                                if (serviceConnectionC0645l1.f11182a) {
                                    V v8 = ((C0650n0) serviceConnectionC0645l1.f11184c.f1707a).f11229i;
                                    C0650n0.f(v8);
                                    v8.f10978n.b("Connection attempt already in progress");
                                    return;
                                } else {
                                    C0648m1 c0648m12 = serviceConnectionC0645l1.f11184c;
                                    V v9 = ((C0650n0) c0648m12.f1707a).f11229i;
                                    C0650n0.f(v9);
                                    v9.f10978n.b("Using local app measurement service");
                                    serviceConnectionC0645l1.f11182a = true;
                                    b9.a(context, intent, c0648m12.f11195c, 129);
                                    return;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    V v10 = c0650n0.f11229i;
                    C0650n0.f(v10);
                    v10.f10971f.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                    return;
                }
                return;
            }
            this.f11195c.a();
        }
    }

    public final void q0() {
        l0();
        m0();
        ServiceConnectionC0645l1 serviceConnectionC0645l1 = this.f11195c;
        if (serviceConnectionC0645l1.f11183b != null && (serviceConnectionC0645l1.f11183b.a() || serviceConnectionC0645l1.f11183b.g())) {
            serviceConnectionC0645l1.f11183b.l();
        }
        serviceConnectionC0645l1.f11183b = null;
        try {
            J4.a.b().c(((C0650n0) this.f1707a).f11221a, serviceConnectionC0645l1);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f11196d = null;
    }

    public final void r0(AtomicReference atomicReference) {
        l0();
        m0();
        C0(new A4.j(this, atomicReference, z0(false), 10, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x041b A[Catch: all -> 0x03a0, TRY_ENTER, TryCatch #0 {all -> 0x03a0, blocks: (B:181:0x0447, B:210:0x041b, B:212:0x0421, B:213:0x0424, B:202:0x0465, B:352:0x038b, B:356:0x0395, B:357:0x03a8), top: B:180:0x0447 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x047a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x02c5 A[Catch: all -> 0x01e2, SQLiteException -> 0x02a1, SQLiteDatabaseLockedException -> 0x02a6, SQLiteFullException -> 0x02aa, TryCatch #36 {all -> 0x01e2, blocks: (B:162:0x01bb, B:170:0x01d1, B:172:0x01d6, B:222:0x01fe, B:223:0x0201, B:220:0x01fa, B:238:0x0214, B:241:0x0228, B:243:0x023e, B:246:0x0247, B:247:0x024a, B:249:0x0238, B:252:0x024e, B:255:0x0262, B:257:0x0278, B:262:0x0282, B:263:0x0285, B:260:0x0272, B:273:0x0289, B:281:0x029d, B:283:0x02c5, B:291:0x02cf, B:292:0x02d2, B:297:0x02bf, B:268:0x02df, B:270:0x02ea, B:349:0x0374), top: B:161:0x01bb }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x063d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s0(b5.G r64, G4.a r65, b5.Q1 r66) {
        /*
            Method dump skipped, instructions count: 1718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0648m1.s0(b5.G, G4.a, b5.Q1):void");
    }

    public final void t0(C0622e c0622e) {
        boolean s02;
        l0();
        m0();
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        c0650n0.getClass();
        N j = c0650n0.j();
        C0650n0 c0650n02 = (C0650n0) j.f1707a;
        C0650n0.d(c0650n02.f11231l);
        byte[] m12 = P1.m1(c0622e);
        if (m12.length > 131072) {
            V v8 = c0650n02.f11229i;
            C0650n0.f(v8);
            v8.f10972g.b("Conditional user property too long for local database. Sending directly to service");
            s02 = false;
        } else {
            s02 = j.s0(2, m12);
        }
        boolean z9 = s02;
        C0(new A4.k(this, z0(true), z9, new C0622e(c0622e), 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.l0()
            r7.m0()
            b5.s r4 = new b5.s
            r4.<init>(r8)
            r7.D0()
            java.lang.Object r0 = r7.f1707a
            b5.n0 r0 = (b5.C0650n0) r0
            b5.g r1 = r0.f11227g
            r2 = 0
            b5.D r3 = b5.E.f10672m1
            boolean r1 = r1.y0(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            b5.N r0 = r0.j()
            java.lang.Object r1 = r0.f1707a
            b5.n0 r1 = (b5.C0650n0) r1
            b5.P1 r3 = r1.f11231l
            b5.C0650n0.d(r3)
            byte[] r3 = b5.P1.m1(r4)
            b5.V r1 = r1.f11229i
            if (r3 != 0) goto L3f
            b5.C0650n0.f(r1)
            java.lang.String r0 = "Null default event parameters; not writing to database"
            b5.T r1 = r1.f10972g
            r1.b(r0)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            b5.C0650n0.f(r1)
            java.lang.String r0 = "Default event parameters too long for local database. Sending directly to service"
            b5.T r1 = r1.f10972g
            r1.b(r0)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.s0(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            b5.Q1 r2 = r7.z0(r2)
            b5.P0 r0 = new b5.P0
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.C0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0648m1.u0(android.os.Bundle):void");
    }

    public final boolean v0() {
        l0();
        m0();
        if (this.f11196d != null) {
            return true;
        }
        return false;
    }

    public final boolean w0() {
        l0();
        m0();
        if (!y0()) {
            return true;
        }
        P1 p12 = ((C0650n0) this.f1707a).f11231l;
        C0650n0.d(p12);
        if (p12.t1() >= ((Integer) E.f10604J0.a(null)).intValue()) {
            return true;
        }
        return false;
    }

    public final boolean x0() {
        l0();
        m0();
        if (y0()) {
            P1 p12 = ((C0650n0) this.f1707a).f11231l;
            C0650n0.d(p12);
            if (p12.t1() < 241200) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y0() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0648m1.y0():boolean");
    }

    public final Q1 z0(boolean z9) {
        long abs;
        Pair pair;
        C0650n0 c0650n0 = (C0650n0) this.f1707a;
        c0650n0.getClass();
        L i9 = c0650n0.i();
        String str = null;
        if (z9) {
            V v8 = c0650n0.f11229i;
            C0650n0.f(v8);
            C0650n0 c0650n02 = (C0650n0) v8.f1707a;
            C0623e0 c0623e0 = c0650n02.f11228h;
            C0650n0.d(c0623e0);
            if (c0623e0.f11087f != null) {
                C0623e0 c0623e02 = c0650n02.f11228h;
                C0650n0.d(c0623e02);
                C0620d0 c0620d0 = c0623e02.f11087f;
                C0623e0 c0623e03 = (C0623e0) c0620d0.f11063e;
                c0623e03.l0();
                c0623e03.l0();
                long j = ((C0623e0) c0620d0.f11063e).q0().getLong((String) c0620d0.f11060b, 0L);
                if (j == 0) {
                    c0620d0.b();
                    abs = 0;
                } else {
                    ((C0650n0) c0623e03.f1707a).f11233n.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j4 = c0620d0.f11059a;
                if (abs >= j4) {
                    if (abs > j4 + j4) {
                        c0620d0.b();
                    } else {
                        String string = c0623e03.q0().getString((String) c0620d0.f11062d, null);
                        long j9 = c0623e03.q0().getLong((String) c0620d0.f11061c, 0L);
                        c0620d0.b();
                        if (string != null && j9 > 0) {
                            pair = new Pair(string, Long.valueOf(j9));
                        } else {
                            pair = C0623e0.f11083A;
                        }
                        if (pair != null && pair != C0623e0.f11083A) {
                            str = AbstractC0953k1.o(String.valueOf(pair.second), ":", (String) pair.first);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    str = AbstractC0953k1.o(String.valueOf(pair.second), ":", (String) pair.first);
                }
            }
        }
        return i9.p0(str);
    }
}
