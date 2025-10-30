package k4;

import N3.A;
import P5.AbstractC0349q;
import android.content.Context;
import android.os.Handler;
import b6.C0693o;
import c1.C0752a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import k3.C1485a;
import k3.C1489e;

/* renamed from: k4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1518s implements InterfaceC1506f, W {

    /* renamed from: n, reason: collision with root package name */
    public static final P5.S f20092n = P5.F.r(4800000L, 3100000L, 2100000L, 1500000L, 800000L);

    /* renamed from: o, reason: collision with root package name */
    public static final P5.S f20093o = P5.F.r(1500000L, 1000000L, 730000L, 440000L, 170000L);

    /* renamed from: p, reason: collision with root package name */
    public static final P5.S f20094p = P5.F.r(2200000L, 1400000L, 1100000L, 910000L, 620000L);

    /* renamed from: q, reason: collision with root package name */
    public static final P5.S f20095q = P5.F.r(3000000L, 1900000L, 1400000L, 1000000L, 660000L);

    /* renamed from: r, reason: collision with root package name */
    public static final P5.S f20096r = P5.F.r(6000000L, 4100000L, 3200000L, 1800000L, 1000000L);

    /* renamed from: s, reason: collision with root package name */
    public static final P5.S f20097s = P5.F.r(2800000L, 2400000L, 1600000L, 1100000L, 950000L);

    /* renamed from: t, reason: collision with root package name */
    public static C1518s f20098t;

    /* renamed from: a, reason: collision with root package name */
    public final P5.X f20099a;

    /* renamed from: b, reason: collision with root package name */
    public final C0752a f20100b;

    /* renamed from: c, reason: collision with root package name */
    public final U f20101c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.u f20102d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20103e;

    /* renamed from: f, reason: collision with root package name */
    public int f20104f;

    /* renamed from: g, reason: collision with root package name */
    public long f20105g;

    /* renamed from: h, reason: collision with root package name */
    public long f20106h;

    /* renamed from: i, reason: collision with root package name */
    public int f20107i;
    public long j;

    /* renamed from: k, reason: collision with root package name */
    public long f20108k;

    /* renamed from: l, reason: collision with root package name */
    public long f20109l;

    /* renamed from: m, reason: collision with root package name */
    public long f20110m;

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, c1.a] */
    public C1518s(Context context, HashMap hashMap, int i9, l4.u uVar, boolean z9) {
        this.f20099a = P5.X.a(hashMap);
        ?? obj = new Object();
        obj.f11587a = new CopyOnWriteArrayList();
        this.f20100b = obj;
        this.f20101c = new U(i9);
        this.f20102d = uVar;
        this.f20103e = z9;
        if (context != null) {
            l4.s d9 = l4.s.d(context);
            int e8 = d9.e();
            this.f20107i = e8;
            this.f20109l = a(e8);
            r rVar = new r(this);
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) d9.f20540c;
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            copyOnWriteArrayList.add(new WeakReference(rVar));
            ((Handler) d9.f20539b).post(new A6.r(d9, 19, rVar));
            return;
        }
        this.f20107i = 0;
        this.f20109l = a(0);
    }

    public final long a(int i9) {
        Integer valueOf = Integer.valueOf(i9);
        P5.X x5 = this.f20099a;
        Long l9 = (Long) x5.get(valueOf);
        if (l9 == null) {
            l9 = (Long) x5.get(0);
        }
        if (l9 == null) {
            l9 = 1000000L;
        }
        return l9.longValue();
    }

    public final void b(long j, long j4, int i9) {
        final long j9;
        final long j10;
        final int i10;
        if (i9 != 0 || j != 0 || j4 != this.f20110m) {
            this.f20110m = j4;
            Iterator it = this.f20100b.f11587a.iterator();
            while (it.hasNext()) {
                final C1505e c1505e = (C1505e) it.next();
                if (!c1505e.f20056c) {
                    j9 = j;
                    j10 = j4;
                    i10 = i9;
                    c1505e.f20054a.post(new Runnable() { // from class: k4.d
                        @Override // java.lang.Runnable
                        public final void run() {
                            N3.A a5;
                            C1489e c1489e = C1505e.this.f20055b;
                            C0693o c0693o = c1489e.f19931d;
                            if (((P5.F) c0693o.f11383b).isEmpty()) {
                                a5 = null;
                            } else {
                                a5 = (N3.A) AbstractC0349q.i((P5.F) c0693o.f11383b);
                            }
                            C1485a P8 = c1489e.P(a5);
                            c1489e.T(P8, 1006, new l4.i(i10, j9, j10) { // from class: k3.d

                                /* renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ int f19926b;

                                /* renamed from: c, reason: collision with root package name */
                                public final /* synthetic */ long f19927c;

                                @Override // l4.i
                                public final void invoke(Object obj) {
                                    long longValue;
                                    C1494j c1494j = (C1494j) obj;
                                    c1494j.getClass();
                                    C1485a c1485a = C1485a.this;
                                    A a9 = c1485a.f19917d;
                                    if (a9 != null) {
                                        String c3 = c1494j.f19954b.c(c1485a.f19915b, a9);
                                        HashMap hashMap = c1494j.f19960h;
                                        Long l9 = (Long) hashMap.get(c3);
                                        HashMap hashMap2 = c1494j.f19959g;
                                        Long l10 = (Long) hashMap2.get(c3);
                                        long j11 = 0;
                                        if (l9 == null) {
                                            longValue = 0;
                                        } else {
                                            longValue = l9.longValue();
                                        }
                                        hashMap.put(c3, Long.valueOf(longValue + this.f19927c));
                                        if (l10 != null) {
                                            j11 = l10.longValue();
                                        }
                                        hashMap2.put(c3, Long.valueOf(j11 + this.f19926b));
                                    }
                                }
                            });
                        }
                    });
                } else {
                    j9 = j;
                    j10 = j4;
                    i10 = i9;
                }
                i9 = i10;
                j = j9;
                j4 = j10;
            }
        }
    }
}
