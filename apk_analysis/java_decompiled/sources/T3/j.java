package T3;

import P5.AbstractC0349q;
import P5.F;
import P5.X;
import java.util.List;
import java.util.Map;
import n3.C1630g;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: d, reason: collision with root package name */
    public final int f7114d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7115e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f7116f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7117g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7118h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7119i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final long f7120k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7121l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7122m;

    /* renamed from: n, reason: collision with root package name */
    public final long f7123n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7124o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f7125p;

    /* renamed from: q, reason: collision with root package name */
    public final C1630g f7126q;

    /* renamed from: r, reason: collision with root package name */
    public final F f7127r;

    /* renamed from: s, reason: collision with root package name */
    public final F f7128s;

    /* renamed from: t, reason: collision with root package name */
    public final X f7129t;

    /* renamed from: u, reason: collision with root package name */
    public final long f7130u;

    /* renamed from: v, reason: collision with root package name */
    public final i f7131v;

    public j(int i9, String str, List list, long j, boolean z9, long j4, boolean z10, int i10, long j9, int i11, long j10, long j11, boolean z11, boolean z12, boolean z13, C1630g c1630g, List list2, List list3, i iVar, Map map) {
        super(str, list, z11);
        this.f7114d = i9;
        this.f7118h = j4;
        this.f7117g = z9;
        this.f7119i = z10;
        this.j = i10;
        this.f7120k = j9;
        this.f7121l = i11;
        this.f7122m = j10;
        this.f7123n = j11;
        this.f7124o = z12;
        this.f7125p = z13;
        this.f7126q = c1630g;
        this.f7127r = F.o(list2);
        this.f7128s = F.o(list3);
        this.f7129t = X.a(map);
        if (!list3.isEmpty()) {
            e eVar = (e) AbstractC0349q.i(list3);
            this.f7130u = eVar.f7103e + eVar.f7101c;
        } else if (!list2.isEmpty()) {
            g gVar = (g) AbstractC0349q.i(list2);
            this.f7130u = gVar.f7103e + gVar.f7101c;
        } else {
            this.f7130u = 0L;
        }
        long j12 = -9223372036854775807L;
        if (j != -9223372036854775807L) {
            if (j >= 0) {
                j12 = Math.min(this.f7130u, j);
            } else {
                j12 = Math.max(0L, this.f7130u + j);
            }
        }
        this.f7115e = j12;
        this.f7116f = j >= 0;
        this.f7131v = iVar;
    }

    @Override // M3.a
    public final Object a(List list) {
        return this;
    }
}
