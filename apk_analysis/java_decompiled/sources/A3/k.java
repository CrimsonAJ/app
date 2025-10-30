package A3;

import l4.AbstractC1566a;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class k implements InterfaceC0008i {

    /* renamed from: q, reason: collision with root package name */
    public static final double[] f151q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    public String f152a;

    /* renamed from: b, reason: collision with root package name */
    public q3.u f153b;

    /* renamed from: c, reason: collision with root package name */
    public final D f154c;

    /* renamed from: d, reason: collision with root package name */
    public final A4.r f155d;

    /* renamed from: e, reason: collision with root package name */
    public final v f156e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f157f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    public final C0009j f158g;

    /* renamed from: h, reason: collision with root package name */
    public long f159h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f161k;

    /* renamed from: l, reason: collision with root package name */
    public long f162l;

    /* renamed from: m, reason: collision with root package name */
    public long f163m;

    /* renamed from: n, reason: collision with root package name */
    public long f164n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f165o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f166p;

    /* JADX WARN: Type inference failed for: r0v2, types: [A3.j, java.lang.Object] */
    public k(D d9) {
        this.f154c = d9;
        ?? obj = new Object();
        obj.f150d = new byte[128];
        this.f158g = obj;
        if (d9 != null) {
            this.f156e = new v(178);
            this.f155d = new A4.r(5, false);
        } else {
            this.f156e = null;
            this.f155d = null;
        }
        this.f162l = -9223372036854775807L;
        this.f164n = -9223372036854775807L;
    }

    @Override // A3.InterfaceC0008i
    public final void a() {
        AbstractC1566a.q(this.f157f);
        C0009j c0009j = this.f158g;
        c0009j.f147a = false;
        c0009j.f148b = 0;
        c0009j.f149c = 0;
        v vVar = this.f156e;
        if (vVar != null) {
            vVar.f();
        }
        this.f159h = 0L;
        this.f160i = false;
        this.f162l = -9223372036854775807L;
        this.f164n = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f6  */
    @Override // A3.InterfaceC0008i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(A4.r r29) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.k.c(A4.r):void");
    }

    @Override // A3.InterfaceC0008i
    public final void e(long j, int i9) {
        this.f162l = j;
    }

    @Override // A3.InterfaceC0008i
    public final void f(InterfaceC1907l interfaceC1907l, I i9) {
        i9.a();
        i9.b();
        this.f152a = i9.f78e;
        i9.b();
        this.f153b = interfaceC1907l.u(i9.f77d, 2);
        D d9 = this.f154c;
        if (d9 != null) {
            d9.b(interfaceC1907l, i9);
        }
    }

    @Override // A3.InterfaceC0008i
    public final void d() {
    }
}
