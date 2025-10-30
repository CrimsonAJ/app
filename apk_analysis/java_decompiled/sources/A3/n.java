package A3;

import l4.AbstractC1566a;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class n implements InterfaceC0008i {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f181l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final D f182a;

    /* renamed from: b, reason: collision with root package name */
    public final A4.r f183b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f184c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final l f185d;

    /* renamed from: e, reason: collision with root package name */
    public final v f186e;

    /* renamed from: f, reason: collision with root package name */
    public m f187f;

    /* renamed from: g, reason: collision with root package name */
    public long f188g;

    /* renamed from: h, reason: collision with root package name */
    public String f189h;

    /* renamed from: i, reason: collision with root package name */
    public q3.u f190i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public long f191k;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, A3.l] */
    public n(D d9) {
        this.f182a = d9;
        ?? obj = new Object();
        obj.f172e = new byte[128];
        this.f185d = obj;
        this.f191k = -9223372036854775807L;
        this.f186e = new v(178);
        this.f183b = new A4.r(5, false);
    }

    @Override // A3.InterfaceC0008i
    public final void a() {
        AbstractC1566a.q(this.f184c);
        l lVar = this.f185d;
        lVar.f168a = false;
        lVar.f170c = 0;
        lVar.f169b = 0;
        m mVar = this.f187f;
        if (mVar != null) {
            mVar.f174b = false;
            mVar.f175c = false;
            mVar.f176d = false;
            mVar.f177e = -1;
        }
        v vVar = this.f186e;
        if (vVar != null) {
            vVar.f();
        }
        this.f188g = 0L;
        this.f191k = -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0247 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0283 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013e  */
    @Override // A3.InterfaceC0008i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(A4.r r28) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.n.c(A4.r):void");
    }

    @Override // A3.InterfaceC0008i
    public final void e(long j, int i9) {
        if (j != -9223372036854775807L) {
            this.f191k = j;
        }
    }

    @Override // A3.InterfaceC0008i
    public final void f(InterfaceC1907l interfaceC1907l, I i9) {
        i9.a();
        i9.b();
        this.f189h = i9.f78e;
        i9.b();
        q3.u u9 = interfaceC1907l.u(i9.f77d, 2);
        this.f190i = u9;
        this.f187f = new m(u9);
        this.f182a.b(interfaceC1907l, i9);
    }

    @Override // A3.InterfaceC0008i
    public final void d() {
    }
}
