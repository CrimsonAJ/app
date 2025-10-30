package i8;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class L implements Closeable, AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public final G f19029a;

    /* renamed from: b, reason: collision with root package name */
    public final F f19030b;

    /* renamed from: c, reason: collision with root package name */
    public final String f19031c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19032d;

    /* renamed from: e, reason: collision with root package name */
    public final v f19033e;

    /* renamed from: f, reason: collision with root package name */
    public final w f19034f;

    /* renamed from: g, reason: collision with root package name */
    public final N f19035g;

    /* renamed from: h, reason: collision with root package name */
    public final L f19036h;

    /* renamed from: i, reason: collision with root package name */
    public final L f19037i;
    public final L j;

    /* renamed from: k, reason: collision with root package name */
    public final long f19038k;

    /* renamed from: l, reason: collision with root package name */
    public final long f19039l;

    /* renamed from: m, reason: collision with root package name */
    public final J5.k f19040m;

    /* renamed from: n, reason: collision with root package name */
    public C1418h f19041n;

    public L(G request, F protocol, String message, int i9, v vVar, w wVar, N n7, L l9, L l10, L l11, long j, long j4, J5.k kVar) {
        kotlin.jvm.internal.h.e(request, "request");
        kotlin.jvm.internal.h.e(protocol, "protocol");
        kotlin.jvm.internal.h.e(message, "message");
        this.f19029a = request;
        this.f19030b = protocol;
        this.f19031c = message;
        this.f19032d = i9;
        this.f19033e = vVar;
        this.f19034f = wVar;
        this.f19035g = n7;
        this.f19036h = l9;
        this.f19037i = l10;
        this.j = l11;
        this.f19038k = j;
        this.f19039l = j4;
        this.f19040m = kVar;
    }

    public static String d(L l9, String str) {
        l9.getClass();
        String b9 = l9.f19034f.b(str);
        if (b9 == null) {
            return null;
        }
        return b9;
    }

    public final C1418h a() {
        C1418h c1418h = this.f19041n;
        if (c1418h == null) {
            C1418h c1418h2 = C1418h.f19086n;
            C1418h M7 = s8.e.M(this.f19034f);
            this.f19041n = M7;
            return M7;
        }
        return c1418h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        N n7 = this.f19035g;
        if (n7 != null) {
            n7.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final boolean g() {
        int i9 = this.f19032d;
        if (200 > i9 || i9 >= 300) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, i8.K] */
    public final K s() {
        ?? obj = new Object();
        obj.f19017a = this.f19029a;
        obj.f19018b = this.f19030b;
        obj.f19019c = this.f19032d;
        obj.f19020d = this.f19031c;
        obj.f19021e = this.f19033e;
        obj.f19022f = this.f19034f.d();
        obj.f19023g = this.f19035g;
        obj.f19024h = this.f19036h;
        obj.f19025i = this.f19037i;
        obj.j = this.j;
        obj.f19026k = this.f19038k;
        obj.f19027l = this.f19039l;
        obj.f19028m = this.f19040m;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f19030b + ", code=" + this.f19032d + ", message=" + this.f19031c + ", url=" + this.f19029a.f19005a + '}';
    }
}
