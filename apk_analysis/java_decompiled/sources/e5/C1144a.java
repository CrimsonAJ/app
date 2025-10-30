package e5;

import F4.y;
import K4.d;
import K4.e;
import M4.c;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1144a {

    /* renamed from: n, reason: collision with root package name */
    public static final long f17199n = TimeUnit.DAYS.toMillis(366);

    /* renamed from: o, reason: collision with root package name */
    public static volatile ScheduledExecutorService f17200o = null;

    /* renamed from: p, reason: collision with root package name */
    public static final Object f17201p = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f17202a;

    /* renamed from: b, reason: collision with root package name */
    public final PowerManager.WakeLock f17203b;

    /* renamed from: c, reason: collision with root package name */
    public int f17204c;

    /* renamed from: d, reason: collision with root package name */
    public ScheduledFuture f17205d;

    /* renamed from: e, reason: collision with root package name */
    public long f17206e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f17207f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17208g;

    /* renamed from: h, reason: collision with root package name */
    public X4.a f17209h;

    /* renamed from: i, reason: collision with root package name */
    public final K4.a f17210i;
    public final String j;

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f17211k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f17212l;

    /* renamed from: m, reason: collision with root package name */
    public final ScheduledExecutorService f17213m;

    public C1144a(Context context) {
        String str;
        String packageName = context.getPackageName();
        this.f17202a = new Object();
        this.f17204c = 0;
        this.f17207f = new HashSet();
        this.f17208g = true;
        this.f17210i = K4.a.f4292a;
        this.f17211k = new HashMap();
        this.f17212l = new AtomicInteger(0);
        y.f("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        WorkSource workSource = null;
        this.f17209h = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            if ("wake:com.google.firebase.iid.WakeLockHolder".length() != 0) {
                str = "*gcore*:".concat("wake:com.google.firebase.iid.WakeLockHolder");
            } else {
                str = new String("*gcore*:");
            }
            this.j = str;
        } else {
            this.j = "wake:com.google.firebase.iid.WakeLockHolder";
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            this.f17203b = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
            if (e.a(context)) {
                int i9 = d.f4302a;
                packageName = (packageName == null || packageName.trim().isEmpty()) ? context.getPackageName() : packageName;
                if (context.getPackageManager() != null && packageName != null) {
                    try {
                        ApplicationInfo b9 = c.a(context).b(0, packageName);
                        if (b9 == null) {
                            Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(packageName));
                        } else {
                            int i10 = b9.uid;
                            workSource = new WorkSource();
                            Method method = e.f4304b;
                            if (method != null) {
                                try {
                                    method.invoke(workSource, Integer.valueOf(i10), packageName);
                                } catch (Exception e8) {
                                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e8);
                                }
                            } else {
                                Method method2 = e.f4303a;
                                if (method2 != null) {
                                    try {
                                        method2.invoke(workSource, Integer.valueOf(i10));
                                    } catch (Exception e9) {
                                        Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e9);
                                    }
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Log.e("WorkSourceUtil", "Could not find package: ".concat(packageName));
                    }
                }
                if (workSource != null) {
                    try {
                        this.f17203b.setWorkSource(workSource);
                    } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
                        Log.wtf("WakeLock", e10.toString());
                    }
                }
            }
            ScheduledExecutorService scheduledExecutorService = f17200o;
            if (scheduledExecutorService == null) {
                synchronized (f17201p) {
                    try {
                        scheduledExecutorService = f17200o;
                        if (scheduledExecutorService == null) {
                            scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                            f17200o = scheduledExecutorService;
                        }
                    } finally {
                    }
                }
            }
            this.f17213m = scheduledExecutorService;
            return;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new RuntimeException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(long j) {
        this.f17212l.incrementAndGet();
        long j4 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f17199n), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.f17202a) {
            try {
                if (!b()) {
                    this.f17209h = X4.a.f8468a;
                    this.f17203b.acquire();
                    this.f17210i.getClass();
                    SystemClock.elapsedRealtime();
                }
                this.f17204c++;
                if (this.f17208g) {
                    TextUtils.isEmpty(null);
                }
                b bVar = (b) this.f17211k.get(null);
                b bVar2 = bVar;
                if (bVar == null) {
                    Object obj = new Object();
                    this.f17211k.put(null, obj);
                    bVar2 = obj;
                }
                bVar2.f17214a++;
                this.f17210i.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (Long.MAX_VALUE - elapsedRealtime > max) {
                    j4 = elapsedRealtime + max;
                }
                if (j4 > this.f17206e) {
                    this.f17206e = j4;
                    ScheduledFuture scheduledFuture = this.f17205d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f17205d = this.f17213m.schedule(new A4.e(23, this), max, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z9;
        synchronized (this.f17202a) {
            if (this.f17204c > 0) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public final void c() {
        if (this.f17212l.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.j).concat(" release without a matched acquire!"));
        }
        synchronized (this.f17202a) {
            try {
                if (this.f17208g) {
                    TextUtils.isEmpty(null);
                }
                if (this.f17211k.containsKey(null)) {
                    b bVar = (b) this.f17211k.get(null);
                    if (bVar != null) {
                        int i9 = bVar.f17214a - 1;
                        bVar.f17214a = i9;
                        if (i9 == 0) {
                            this.f17211k.remove(null);
                        }
                    }
                } else {
                    Log.w("WakeLock", String.valueOf(this.j).concat(" counter does not exist"));
                }
                e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashSet hashSet = this.f17207f;
        if (!hashSet.isEmpty()) {
            ArrayList arrayList = new ArrayList(hashSet);
            hashSet.clear();
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void e() {
        synchronized (this.f17202a) {
            try {
                if (!b()) {
                    return;
                }
                if (this.f17208g) {
                    int i9 = this.f17204c - 1;
                    this.f17204c = i9;
                    if (i9 > 0) {
                        return;
                    }
                } else {
                    this.f17204c = 0;
                }
                d();
                Iterator it = this.f17211k.values().iterator();
                while (it.hasNext()) {
                    ((b) it.next()).f17214a = 0;
                }
                this.f17211k.clear();
                ScheduledFuture scheduledFuture = this.f17205d;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.f17205d = null;
                    this.f17206e = 0L;
                }
                if (this.f17203b.isHeld()) {
                    try {
                        try {
                            this.f17203b.release();
                            if (this.f17209h != null) {
                                this.f17209h = null;
                            }
                        } catch (RuntimeException e8) {
                            if (e8.getClass().equals(RuntimeException.class)) {
                                Log.e("WakeLock", String.valueOf(this.j).concat(" failed to release!"), e8);
                                if (this.f17209h != null) {
                                    this.f17209h = null;
                                }
                            } else {
                                throw e8;
                            }
                        }
                    } catch (Throwable th) {
                        if (this.f17209h != null) {
                            this.f17209h = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.j).concat(" should be held!"));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
