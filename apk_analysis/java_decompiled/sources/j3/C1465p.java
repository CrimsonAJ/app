package j3;

import android.content.Context;
import android.os.Looper;
import l3.C1556e;

/* renamed from: j3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1465p {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19702a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.u f19703b;

    /* renamed from: c, reason: collision with root package name */
    public O5.n f19704c;

    /* renamed from: d, reason: collision with root package name */
    public O5.n f19705d;

    /* renamed from: e, reason: collision with root package name */
    public final C1463n f19706e;

    /* renamed from: f, reason: collision with root package name */
    public final C1463n f19707f;

    /* renamed from: g, reason: collision with root package name */
    public final Looper f19708g;

    /* renamed from: h, reason: collision with root package name */
    public final C1556e f19709h;

    /* renamed from: i, reason: collision with root package name */
    public final int f19710i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final x0 f19711k;

    /* renamed from: l, reason: collision with root package name */
    public long f19712l;

    /* renamed from: m, reason: collision with root package name */
    public long f19713m;

    /* renamed from: n, reason: collision with root package name */
    public final C1457h f19714n;

    /* renamed from: o, reason: collision with root package name */
    public final long f19715o;

    /* renamed from: p, reason: collision with root package name */
    public final long f19716p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f19717q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19718r;

    public C1465p(Context context) {
        C1463n c1463n = new C1463n(context, 0);
        C1463n c1463n2 = new C1463n(context, 1);
        C1463n c1463n3 = new C1463n(context, 2);
        C1463n c1463n4 = new C1463n(context, 3);
        this.f19702a = context;
        this.f19704c = c1463n;
        this.f19705d = c1463n2;
        this.f19706e = c1463n3;
        this.f19707f = c1463n4;
        int i9 = l4.y.f20553a;
        Looper myLooper = Looper.myLooper();
        this.f19708g = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f19709h = C1556e.f20389g;
        this.f19710i = 1;
        this.j = true;
        this.f19711k = x0.f19760c;
        this.f19712l = 5000L;
        this.f19713m = 15000L;
        this.f19714n = new C1457h(l4.y.H(20L), l4.y.H(500L));
        this.f19703b = l4.u.f20545a;
        this.f19715o = 500L;
        this.f19716p = 2000L;
        this.f19717q = true;
    }
}
