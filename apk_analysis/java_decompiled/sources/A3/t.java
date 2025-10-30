package A3;

import j3.M;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class t implements InterfaceC0008i {

    /* renamed from: a, reason: collision with root package name */
    public final String f263a;

    /* renamed from: b, reason: collision with root package name */
    public final A4.r f264b;

    /* renamed from: c, reason: collision with root package name */
    public final Z3.f f265c;

    /* renamed from: d, reason: collision with root package name */
    public q3.u f266d;

    /* renamed from: e, reason: collision with root package name */
    public String f267e;

    /* renamed from: f, reason: collision with root package name */
    public M f268f;

    /* renamed from: g, reason: collision with root package name */
    public int f269g;

    /* renamed from: h, reason: collision with root package name */
    public int f270h;

    /* renamed from: i, reason: collision with root package name */
    public int f271i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f272k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f273l;

    /* renamed from: m, reason: collision with root package name */
    public int f274m;

    /* renamed from: n, reason: collision with root package name */
    public int f275n;

    /* renamed from: o, reason: collision with root package name */
    public int f276o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f277p;

    /* renamed from: q, reason: collision with root package name */
    public long f278q;

    /* renamed from: r, reason: collision with root package name */
    public int f279r;

    /* renamed from: s, reason: collision with root package name */
    public long f280s;

    /* renamed from: t, reason: collision with root package name */
    public int f281t;

    /* renamed from: u, reason: collision with root package name */
    public String f282u;

    public t(String str) {
        this.f263a = str;
        A4.r rVar = new A4.r(1024);
        this.f264b = rVar;
        byte[] bArr = (byte[]) rVar.f384c;
        this.f265c = new Z3.f(bArr.length, bArr);
        this.f272k = -9223372036854775807L;
    }

    @Override // A3.InterfaceC0008i
    public final void a() {
        this.f269g = 0;
        this.f272k = -9223372036854775807L;
        this.f273l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0192, code lost:
    
        if (r23.f273l == false) goto L88;
     */
    @Override // A3.InterfaceC0008i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(A4.r r24) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.t.c(A4.r):void");
    }

    @Override // A3.InterfaceC0008i
    public final void e(long j, int i9) {
        if (j != -9223372036854775807L) {
            this.f272k = j;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void f(InterfaceC1907l interfaceC1907l, I i9) {
        i9.a();
        i9.b();
        this.f266d = interfaceC1907l.u(i9.f77d, 1);
        i9.b();
        this.f267e = i9.f78e;
    }

    @Override // A3.InterfaceC0008i
    public final void d() {
    }
}
