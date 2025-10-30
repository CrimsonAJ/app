package s3;

import A4.r;
import l4.y;
import q3.C1902g;
import q3.InterfaceC1905j;
import q3.InterfaceC1906k;
import q3.InterfaceC1907l;

/* renamed from: s3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1947b implements InterfaceC1905j {

    /* renamed from: c, reason: collision with root package name */
    public int f22675c;

    /* renamed from: e, reason: collision with root package name */
    public C1948c f22677e;

    /* renamed from: h, reason: collision with root package name */
    public long f22680h;

    /* renamed from: i, reason: collision with root package name */
    public C1950e f22681i;

    /* renamed from: m, reason: collision with root package name */
    public int f22684m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f22685n;

    /* renamed from: a, reason: collision with root package name */
    public final r f22673a = new r(12);

    /* renamed from: b, reason: collision with root package name */
    public final O4.d f22674b = new Object();

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1907l f22676d = new e0.c(11);

    /* renamed from: g, reason: collision with root package name */
    public C1950e[] f22679g = new C1950e[0];

    /* renamed from: k, reason: collision with root package name */
    public long f22682k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f22683l = -1;
    public int j = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f22678f = -9223372036854775807L;

    @Override // q3.InterfaceC1905j
    public final void b(long j, long j4) {
        this.f22680h = -1L;
        this.f22681i = null;
        for (C1950e c1950e : this.f22679g) {
            if (c1950e.j == 0) {
                c1950e.f22701h = 0;
            } else {
                c1950e.f22701h = c1950e.f22704l[y.e(c1950e.f22703k, j, true)];
            }
        }
        if (j == 0) {
            if (this.f22679g.length == 0) {
                this.f22675c = 0;
                return;
            } else {
                this.f22675c = 3;
                return;
            }
        }
        this.f22675c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
    @Override // q3.InterfaceC1905j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(q3.InterfaceC1906k r23, c7.C0790j r24) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.C1947b.f(q3.k, c7.j):int");
    }

    @Override // q3.InterfaceC1905j
    public final void i(InterfaceC1907l interfaceC1907l) {
        this.f22675c = 0;
        this.f22676d = interfaceC1907l;
        this.f22680h = -1L;
    }

    @Override // q3.InterfaceC1905j
    public final boolean j(InterfaceC1906k interfaceC1906k) {
        r rVar = this.f22673a;
        ((C1902g) interfaceC1906k).t((byte[]) rVar.f384c, 0, 12, false);
        rVar.H(0);
        if (rVar.k() == 1179011410) {
            rVar.I(4);
            if (rVar.k() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // q3.InterfaceC1905j
    public final void a() {
    }
}
