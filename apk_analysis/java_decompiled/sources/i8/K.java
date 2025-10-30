package i8;

import f5.C1183o;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public G f19017a;

    /* renamed from: b, reason: collision with root package name */
    public F f19018b;

    /* renamed from: d, reason: collision with root package name */
    public String f19020d;

    /* renamed from: e, reason: collision with root package name */
    public v f19021e;

    /* renamed from: g, reason: collision with root package name */
    public N f19023g;

    /* renamed from: h, reason: collision with root package name */
    public L f19024h;

    /* renamed from: i, reason: collision with root package name */
    public L f19025i;
    public L j;

    /* renamed from: k, reason: collision with root package name */
    public long f19026k;

    /* renamed from: l, reason: collision with root package name */
    public long f19027l;

    /* renamed from: m, reason: collision with root package name */
    public J5.k f19028m;

    /* renamed from: c, reason: collision with root package name */
    public int f19019c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C1183o f19022f = new C1183o(5);

    public static void b(L l9, String str) {
        if (l9 != null) {
            if (l9.f19035g == null) {
                if (l9.f19036h == null) {
                    if (l9.f19037i == null) {
                        if (l9.j != null) {
                            throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
                        }
                        return;
                    }
                    throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
                }
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            throw new IllegalArgumentException(str.concat(".body != null").toString());
        }
    }

    public final L a() {
        int i9 = this.f19019c;
        if (i9 >= 0) {
            G g9 = this.f19017a;
            if (g9 != null) {
                F f9 = this.f19018b;
                if (f9 != null) {
                    String str = this.f19020d;
                    if (str != null) {
                        return new L(g9, f9, str, i9, this.f19021e, this.f19022f.z(), this.f19023g, this.f19024h, this.f19025i, this.j, this.f19026k, this.f19027l, this.f19028m);
                    }
                    throw new IllegalStateException("message == null");
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
        throw new IllegalStateException(("code < 0: " + this.f19019c).toString());
    }

    public final void c(w headers) {
        kotlin.jvm.internal.h.e(headers, "headers");
        this.f19022f = headers.d();
    }
}
