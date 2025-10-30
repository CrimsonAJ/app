package n3;

import N3.C0266q;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import b5.G1;
import f5.C1183o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import k4.C1499E;
import l4.AbstractC1566a;
import m3.InterfaceC1588a;

/* renamed from: n3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1625b implements InterfaceC1632i {

    /* renamed from: a, reason: collision with root package name */
    public final List f21069a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1645v f21070b;

    /* renamed from: c, reason: collision with root package name */
    public final C1499E f21071c;

    /* renamed from: d, reason: collision with root package name */
    public final C1183o f21072d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21073e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21074f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f21075g;

    /* renamed from: h, reason: collision with root package name */
    public final l4.c f21076h;

    /* renamed from: i, reason: collision with root package name */
    public final e1.q f21077i;
    public final k3.l j;

    /* renamed from: k, reason: collision with root package name */
    public final G1 f21078k;

    /* renamed from: l, reason: collision with root package name */
    public final UUID f21079l;

    /* renamed from: m, reason: collision with root package name */
    public final C3.e f21080m;

    /* renamed from: n, reason: collision with root package name */
    public int f21081n;

    /* renamed from: o, reason: collision with root package name */
    public int f21082o;

    /* renamed from: p, reason: collision with root package name */
    public HandlerThread f21083p;

    /* renamed from: q, reason: collision with root package name */
    public android.support.v4.media.session.f f21084q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1588a f21085r;

    /* renamed from: s, reason: collision with root package name */
    public C1631h f21086s;

    /* renamed from: t, reason: collision with root package name */
    public byte[] f21087t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f21088u;

    /* renamed from: v, reason: collision with root package name */
    public C1643t f21089v;

    /* renamed from: w, reason: collision with root package name */
    public C1644u f21090w;

    public C1625b(UUID uuid, InterfaceC1645v interfaceC1645v, C1499E c1499e, C1183o c1183o, List list, boolean z9, boolean z10, byte[] bArr, HashMap hashMap, G1 g12, Looper looper, e1.q qVar, k3.l lVar) {
        this.f21079l = uuid;
        this.f21071c = c1499e;
        this.f21072d = c1183o;
        this.f21070b = interfaceC1645v;
        this.f21073e = z9;
        this.f21074f = z10;
        if (bArr != null) {
            this.f21088u = bArr;
            this.f21069a = null;
        } else {
            list.getClass();
            this.f21069a = Collections.unmodifiableList(list);
        }
        this.f21075g = hashMap;
        this.f21078k = g12;
        this.f21076h = new l4.c();
        this.f21077i = qVar;
        this.j = lVar;
        this.f21081n = 2;
        this.f21080m = new C3.e(this, looper, 6);
    }

    @Override // n3.InterfaceC1632i
    public final void a(C1635l c1635l) {
        int i9;
        boolean z9 = false;
        if (this.f21082o < 0) {
            AbstractC1566a.t("DefaultDrmSession", "Session reference count less than zero: " + this.f21082o);
            this.f21082o = 0;
        }
        if (c1635l != null) {
            l4.c cVar = this.f21076h;
            synchronized (cVar.f20487a) {
                try {
                    ArrayList arrayList = new ArrayList(cVar.f20490d);
                    arrayList.add(c1635l);
                    cVar.f20490d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) cVar.f20488b.get(c1635l);
                    if (num == null) {
                        HashSet hashSet = new HashSet(cVar.f20489c);
                        hashSet.add(c1635l);
                        cVar.f20489c = Collections.unmodifiableSet(hashSet);
                    }
                    HashMap hashMap = cVar.f20488b;
                    if (num != null) {
                        i9 = num.intValue() + 1;
                    } else {
                        i9 = 1;
                    }
                    hashMap.put(c1635l, Integer.valueOf(i9));
                } finally {
                }
            }
        }
        int i10 = this.f21082o + 1;
        this.f21082o = i10;
        if (i10 == 1) {
            if (this.f21081n == 2) {
                z9 = true;
            }
            AbstractC1566a.m(z9);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f21083p = handlerThread;
            handlerThread.start();
            this.f21084q = new android.support.v4.media.session.f(this, this.f21083p.getLooper());
            if (l()) {
                h(true);
            }
        } else if (c1635l != null && i() && this.f21076h.b(c1635l) == 1) {
            c1635l.c(this.f21081n);
        }
        C1628e c1628e = (C1628e) this.f21072d.f17433b;
        if (c1628e.f21103i != -9223372036854775807L) {
            c1628e.f21105l.remove(this);
            Handler handler = c1628e.f21111r;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // n3.InterfaceC1632i
    public final boolean b() {
        return this.f21073e;
    }

    @Override // n3.InterfaceC1632i
    public final UUID c() {
        return this.f21079l;
    }

    @Override // n3.InterfaceC1632i
    public final boolean d(String str) {
        byte[] bArr = this.f21087t;
        AbstractC1566a.n(bArr);
        return this.f21070b.v(str, bArr);
    }

    @Override // n3.InterfaceC1632i
    public final void e(C1635l c1635l) {
        int i9 = this.f21082o;
        if (i9 <= 0) {
            AbstractC1566a.t("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i9 - 1;
        this.f21082o = i10;
        if (i10 == 0) {
            this.f21081n = 0;
            C3.e eVar = this.f21080m;
            int i11 = l4.y.f20553a;
            eVar.removeCallbacksAndMessages(null);
            android.support.v4.media.session.f fVar = this.f21084q;
            synchronized (fVar) {
                fVar.removeCallbacksAndMessages(null);
                fVar.f9300b = true;
            }
            this.f21084q = null;
            this.f21083p.quit();
            this.f21083p = null;
            this.f21085r = null;
            this.f21086s = null;
            this.f21089v = null;
            this.f21090w = null;
            byte[] bArr = this.f21087t;
            if (bArr != null) {
                this.f21070b.d(bArr);
                this.f21087t = null;
            }
        }
        if (c1635l != null) {
            this.f21076h.c(c1635l);
            if (this.f21076h.b(c1635l) == 0) {
                c1635l.e();
            }
        }
        C1183o c1183o = this.f21072d;
        int i12 = this.f21082o;
        C1628e c1628e = (C1628e) c1183o.f17433b;
        if (i12 == 1 && c1628e.f21106m > 0 && c1628e.f21103i != -9223372036854775807L) {
            c1628e.f21105l.add(this);
            Handler handler = c1628e.f21111r;
            handler.getClass();
            handler.postAtTime(new A6.s(27, this), this, SystemClock.uptimeMillis() + c1628e.f21103i);
        } else if (i12 == 0) {
            c1628e.j.remove(this);
            if (c1628e.f21108o == this) {
                c1628e.f21108o = null;
            }
            if (c1628e.f21109p == this) {
                c1628e.f21109p = null;
            }
            C1499E c1499e = c1628e.f21100f;
            HashSet hashSet = (HashSet) c1499e.f19985b;
            hashSet.remove(this);
            if (((C1625b) c1499e.f19986c) == this) {
                c1499e.f19986c = null;
                if (!hashSet.isEmpty()) {
                    C1625b c1625b = (C1625b) hashSet.iterator().next();
                    c1499e.f19986c = c1625b;
                    C1644u j = c1625b.f21070b.j();
                    c1625b.f21090w = j;
                    android.support.v4.media.session.f fVar2 = c1625b.f21084q;
                    int i13 = l4.y.f20553a;
                    j.getClass();
                    fVar2.getClass();
                    fVar2.obtainMessage(0, new C1624a(C0266q.f5180a.getAndIncrement(), true, SystemClock.elapsedRealtime(), j)).sendToTarget();
                }
            }
            if (c1628e.f21103i != -9223372036854775807L) {
                Handler handler2 = c1628e.f21111r;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                c1628e.f21105l.remove(this);
            }
        }
        c1628e.k();
    }

    @Override // n3.InterfaceC1632i
    public final C1631h f() {
        if (this.f21081n == 1) {
            return this.f21086s;
        }
        return null;
    }

    @Override // n3.InterfaceC1632i
    public final InterfaceC1588a g() {
        return this.f21085r;
    }

    @Override // n3.InterfaceC1632i
    public final int getState() {
        return this.f21081n;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(2:41|42)|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0069 A[Catch: NumberFormatException -> 0x006d, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x006d, blocks: (B:47:0x0061, B:49:0x0069), top: B:46:0x0061 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(boolean r10) {
        /*
            r9 = this;
            boolean r0 = r9.f21074f
            if (r0 == 0) goto L6
            goto Ld6
        L6:
            byte[] r0 = r9.f21087t
            int r1 = l4.y.f20553a
            byte[] r1 = r9.f21088u
            r2 = 1
            if (r1 != 0) goto L13
            r9.m(r2, r10, r0)
            return
        L13:
            int r3 = r9.f21081n
            r4 = 4
            if (r3 == r4) goto L24
            n3.v r3 = r9.f21070b     // Catch: java.lang.Exception -> L1e
            r3.b(r0, r1)     // Catch: java.lang.Exception -> L1e
            goto L24
        L1e:
            r10 = move-exception
            r9.j(r10, r2)
            goto Ld6
        L24:
            java.util.UUID r1 = j3.AbstractC1455g.f19619d
            java.util.UUID r2 = r9.f21079l
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L34
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L8b
        L34:
            byte[] r1 = r9.f21087t
            r2 = 0
            if (r1 != 0) goto L3b
            r1 = r2
            goto L41
        L3b:
            n3.v r3 = r9.f21070b
            java.util.Map r1 = r3.c(r1)
        L41:
            if (r1 != 0) goto L44
            goto L74
        L44:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r3 = "LicenseDurationRemaining"
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.NumberFormatException -> L5a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L5a
            if (r3 == 0) goto L5a
            long r7 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L5a
            goto L5b
        L5a:
            r7 = r5
        L5b:
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.String r7 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.NumberFormatException -> L6d
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.NumberFormatException -> L6d
            if (r1 == 0) goto L6d
            long r5 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L6d
        L6d:
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r2.<init>(r3, r1)
        L74:
            r2.getClass()
            java.lang.Object r1 = r2.first
            java.lang.Long r1 = (java.lang.Long) r1
            long r5 = r1.longValue()
            java.lang.Object r1 = r2.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.min(r5, r1)
        L8b:
            r5 = 60
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            r5 = 2
            if (r3 > 0) goto La9
            java.lang.String r3 = "DefaultDrmSession"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Offline license has expired or will expire soon. Remaining seconds: "
            r4.<init>(r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            l4.AbstractC1566a.s(r3, r1)
            r9.m(r5, r10, r0)
            return
        La9:
            r6 = 0
            int r10 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r10 > 0) goto Lb8
            n3.A r10 = new n3.A
            r10.<init>()
            r9.j(r10, r5)
            return
        Lb8:
            r9.f21081n = r4
            l4.c r10 = r9.f21076h
            java.lang.Object r0 = r10.f20487a
            monitor-enter(r0)
            java.util.Set r10 = r10.f20489c     // Catch: java.lang.Throwable -> Ld7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld7
            java.util.Iterator r10 = r10.iterator()
        Lc6:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Ld6
            java.lang.Object r0 = r10.next()
            n3.l r0 = (n3.C1635l) r0
            r0.b()
            goto Lc6
        Ld6:
            return
        Ld7:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld7
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C1625b.h(boolean):void");
    }

    public final boolean i() {
        int i9 = this.f21081n;
        if (i9 != 3 && i9 != 4) {
            return false;
        }
        return true;
    }

    public final void j(Exception exc, int i9) {
        int i10;
        Set set;
        int i11 = l4.y.f20553a;
        if (i11 >= 21 && AbstractC1640q.a(exc)) {
            i10 = AbstractC1640q.b(exc);
        } else {
            if (i11 < 23 || !AbstractC1641r.a(exc)) {
                if (i11 < 18 || !AbstractC1639p.b(exc)) {
                    if (i11 >= 18 && AbstractC1639p.a(exc)) {
                        i10 = 6007;
                    } else if (exc instanceof C1623C) {
                        i10 = 6001;
                    } else if (exc instanceof C1626c) {
                        i10 = 6003;
                    } else if (exc instanceof C1621A) {
                        i10 = 6008;
                    } else if (i9 != 1) {
                        if (i9 == 2) {
                            i10 = 6004;
                        } else if (i9 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = 6002;
            }
            i10 = 6006;
        }
        this.f21086s = new C1631h(exc, i10);
        AbstractC1566a.u("DefaultDrmSession", "DRM session error", exc);
        l4.c cVar = this.f21076h;
        synchronized (cVar.f20487a) {
            set = cVar.f20489c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((C1635l) it.next()).d(exc);
        }
        if (this.f21081n != 4) {
            this.f21081n = 1;
        }
    }

    public final void k(Exception exc, boolean z9) {
        int i9;
        if (exc instanceof NotProvisionedException) {
            C1499E c1499e = this.f21071c;
            ((HashSet) c1499e.f19985b).add(this);
            if (((C1625b) c1499e.f19986c) != null) {
                return;
            }
            c1499e.f19986c = this;
            C1644u j = this.f21070b.j();
            this.f21090w = j;
            android.support.v4.media.session.f fVar = this.f21084q;
            int i10 = l4.y.f20553a;
            j.getClass();
            fVar.getClass();
            fVar.obtainMessage(0, new C1624a(C0266q.f5180a.getAndIncrement(), true, SystemClock.elapsedRealtime(), j)).sendToTarget();
            return;
        }
        if (z9) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        j(exc, i9);
    }

    public final boolean l() {
        Set set;
        if (i()) {
            return true;
        }
        try {
            byte[] w7 = this.f21070b.w();
            this.f21087t = w7;
            this.f21070b.k(w7, this.j);
            this.f21085r = this.f21070b.q(this.f21087t);
            this.f21081n = 3;
            l4.c cVar = this.f21076h;
            synchronized (cVar.f20487a) {
                set = cVar.f20489c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((C1635l) it.next()).c(3);
            }
            this.f21087t.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            C1499E c1499e = this.f21071c;
            ((HashSet) c1499e.f19985b).add(this);
            if (((C1625b) c1499e.f19986c) == null) {
                c1499e.f19986c = this;
                C1644u j = this.f21070b.j();
                this.f21090w = j;
                android.support.v4.media.session.f fVar = this.f21084q;
                int i9 = l4.y.f20553a;
                j.getClass();
                fVar.getClass();
                fVar.obtainMessage(0, new C1624a(C0266q.f5180a.getAndIncrement(), true, SystemClock.elapsedRealtime(), j)).sendToTarget();
            }
            return false;
        } catch (Exception e8) {
            j(e8, 1);
            return false;
        }
    }

    public final void m(int i9, boolean z9, byte[] bArr) {
        try {
            C1643t n7 = this.f21070b.n(bArr, this.f21069a, i9, this.f21075g);
            this.f21089v = n7;
            android.support.v4.media.session.f fVar = this.f21084q;
            int i10 = l4.y.f20553a;
            n7.getClass();
            fVar.getClass();
            fVar.obtainMessage(1, new C1624a(C0266q.f5180a.getAndIncrement(), z9, SystemClock.elapsedRealtime(), n7)).sendToTarget();
        } catch (Exception e8) {
            k(e8, true);
        }
    }
}
