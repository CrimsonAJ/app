package D4;

import F4.C0132k;
import F4.C0133l;
import F4.C0134m;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import s.C1936f;

/* renamed from: D4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088g implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f1839p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Status f1840q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: r, reason: collision with root package name */
    public static final Object f1841r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static C0088g f1842s;

    /* renamed from: a, reason: collision with root package name */
    public long f1843a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1844b;

    /* renamed from: c, reason: collision with root package name */
    public C0134m f1845c;

    /* renamed from: d, reason: collision with root package name */
    public H4.c f1846d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1847e;

    /* renamed from: f, reason: collision with root package name */
    public final B4.f f1848f;

    /* renamed from: g, reason: collision with root package name */
    public final A1.g f1849g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f1850h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f1851i;
    public final ConcurrentHashMap j;

    /* renamed from: k, reason: collision with root package name */
    public p f1852k;

    /* renamed from: l, reason: collision with root package name */
    public final C1936f f1853l;

    /* renamed from: m, reason: collision with root package name */
    public final C1936f f1854m;

    /* renamed from: n, reason: collision with root package name */
    public final T4.d f1855n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f1856o;

    /* JADX WARN: Type inference failed for: r2v6, types: [T4.d, android.os.Handler] */
    public C0088g(Context context, Looper looper) {
        B4.f fVar = B4.f.f695d;
        this.f1843a = 10000L;
        this.f1844b = false;
        this.f1850h = new AtomicInteger(1);
        this.f1851i = new AtomicInteger(0);
        this.j = new ConcurrentHashMap(5, 0.75f, 1);
        this.f1852k = null;
        this.f1853l = new C1936f(0);
        this.f1854m = new C1936f(0);
        this.f1856o = true;
        this.f1847e = context;
        ?? handler = new Handler(looper, this);
        Looper.getMainLooper();
        this.f1855n = handler;
        this.f1848f = fVar;
        this.f1849g = new A1.g(18, (byte) 0);
        PackageManager packageManager = context.getPackageManager();
        if (K4.b.f4298f == null) {
            K4.b.f4298f = Boolean.valueOf(K4.b.d() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (K4.b.f4298f.booleanValue()) {
            this.f1856o = false;
        }
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static Status d(C0083b c0083b, B4.b bVar) {
        return new Status(17, "API: " + ((String) c0083b.f1831b.f19c) + " is not available on this device. Connection failed with: " + String.valueOf(bVar), bVar.f686c, bVar);
    }

    public static C0088g g(Context context) {
        C0088g c0088g;
        synchronized (f1841r) {
            try {
                if (f1842s == null) {
                    Looper looper = F4.J.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = B4.f.f694c;
                    f1842s = new C0088g(applicationContext, looper);
                }
                c0088g = f1842s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0088g;
    }

    public final void a(p pVar) {
        synchronized (f1841r) {
            try {
                if (this.f1852k != pVar) {
                    this.f1852k = pVar;
                    this.f1853l.clear();
                }
                this.f1853l.addAll(pVar.f1873f);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        if (!this.f1844b) {
            C0133l c0133l = (C0133l) C0132k.c().f2424a;
            if (c0133l == null || c0133l.f2426b) {
                int i9 = ((SparseIntArray) this.f1849g.f18b).get(203400000, -1);
                if (i9 != -1 && i9 != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean c(B4.b bVar, int i9) {
        boolean z9;
        B4.f fVar = this.f1848f;
        fVar.getClass();
        Context context = this.f1847e;
        if (!M4.a.u(context)) {
            int i10 = bVar.f685b;
            PendingIntent pendingIntent = bVar.f686c;
            if (i10 != 0 && pendingIntent != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                pendingIntent = null;
                Intent a5 = fVar.a(i10, context, null);
                if (a5 != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a5, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i11 = GoogleApiActivity.f14651b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i9);
                intent.putExtra("notify_manager", true);
                fVar.f(context, i10, PendingIntent.getActivity(context, 0, intent, T4.c.f7208a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final t e(C4.j jVar) {
        ConcurrentHashMap concurrentHashMap = this.j;
        C0083b c0083b = jVar.f1582e;
        t tVar = (t) concurrentHashMap.get(c0083b);
        if (tVar == null) {
            tVar = new t(this, jVar);
            concurrentHashMap.put(c0083b, tVar);
        }
        if (tVar.f1882f.m()) {
            this.f1854m.add(c0083b);
        }
        tVar.m();
        return tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(f5.C1177i r9, int r10, C4.j r11) {
        /*
            r8 = this;
            if (r10 == 0) goto L77
            D4.b r3 = r11.f1582e
            boolean r11 = r8.b()
            if (r11 != 0) goto Lb
            goto L47
        Lb:
            F4.k r11 = F4.C0132k.c()
            java.lang.Object r11 = r11.f2424a
            F4.l r11 = (F4.C0133l) r11
            r0 = 1
            if (r11 == 0) goto L4a
            boolean r1 = r11.f2426b
            if (r1 == 0) goto L47
            java.util.concurrent.ConcurrentHashMap r1 = r8.j
            java.lang.Object r1 = r1.get(r3)
            D4.t r1 = (D4.t) r1
            if (r1 == 0) goto L44
            C4.c r2 = r1.f1882f
            boolean r4 = r2 instanceof F4.AbstractC0126e
            if (r4 == 0) goto L47
            F4.e r2 = (F4.AbstractC0126e) r2
            F4.F r4 = r2.f2389w
            if (r4 == 0) goto L44
            boolean r4 = r2.g()
            if (r4 != 0) goto L44
            F4.f r11 = D4.z.a(r1, r2, r10)
            if (r11 == 0) goto L47
            int r2 = r1.f1891p
            int r2 = r2 + r0
            r1.f1891p = r2
            boolean r0 = r11.f2393c
            goto L4a
        L44:
            boolean r0 = r11.f2427c
            goto L4a
        L47:
            r10 = 0
            r1 = r8
            goto L64
        L4a:
            D4.z r11 = new D4.z
            r1 = 0
            if (r0 == 0) goto L55
            long r4 = java.lang.System.currentTimeMillis()
            goto L56
        L55:
            r4 = r1
        L56:
            if (r0 == 0) goto L5c
            long r1 = android.os.SystemClock.elapsedRealtime()
        L5c:
            r0 = r11
            r6 = r1
            r1 = r8
            r2 = r10
            r0.<init>(r1, r2, r3, r4, r6)
            r10 = r0
        L64:
            if (r10 == 0) goto L78
            f5.q r9 = r9.f17413a
            T4.d r11 = r1.f1855n
            r11.getClass()
            D4.q r0 = new D4.q
            r2 = 0
            r0.<init>(r2, r11)
            r9.b(r0, r10)
            return
        L77:
            r1 = r8
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.C0088g.f(f5.i, int, C4.j):void");
    }

    public final void h(B4.b bVar, int i9) {
        if (!c(bVar, i9)) {
            T4.d dVar = this.f1855n;
            dVar.sendMessage(dVar.obtainMessage(5, i9, 0, bVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0325  */
    /* JADX WARN: Type inference failed for: r3v13, types: [H4.c, C4.j] */
    /* JADX WARN: Type inference failed for: r3v18, types: [H4.c, C4.j] */
    /* JADX WARN: Type inference failed for: r3v23, types: [H4.c, C4.j] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 1102
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D4.C0088g.handleMessage(android.os.Message):boolean");
    }
}
