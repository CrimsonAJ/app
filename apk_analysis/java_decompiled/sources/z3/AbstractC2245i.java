package z3;

import A4.r;
import k4.C1499E;
import q3.InterfaceC1907l;
import q3.u;

/* renamed from: z3.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2245i {

    /* renamed from: b, reason: collision with root package name */
    public u f25400b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC1907l f25401c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2243g f25402d;

    /* renamed from: e, reason: collision with root package name */
    public long f25403e;

    /* renamed from: f, reason: collision with root package name */
    public long f25404f;

    /* renamed from: g, reason: collision with root package name */
    public long f25405g;

    /* renamed from: h, reason: collision with root package name */
    public int f25406h;

    /* renamed from: i, reason: collision with root package name */
    public int f25407i;

    /* renamed from: k, reason: collision with root package name */
    public long f25408k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25409l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f25410m;

    /* renamed from: a, reason: collision with root package name */
    public final C2241e f25399a = new C2241e();
    public C1499E j = new C1499E(27, false);

    public void a(long j) {
        this.f25405g = j;
    }

    public abstract long b(r rVar);

    public abstract boolean c(r rVar, long j, C1499E c1499e);

    public void d(boolean z9) {
        if (z9) {
            this.j = new C1499E(27, false);
            this.f25404f = 0L;
            this.f25406h = 0;
        } else {
            this.f25406h = 1;
        }
        this.f25403e = -1L;
        this.f25405g = 0L;
    }
}
