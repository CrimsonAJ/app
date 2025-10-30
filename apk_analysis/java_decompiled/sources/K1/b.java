package K1;

import i8.A;
import i8.C1413c;
import i8.N;
import kotlin.jvm.internal.h;
import q2.C1892u;
import x8.C;
import x8.InterfaceC2189i;

/* loaded from: classes.dex */
public final class b extends N {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4233a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final N f4234b;

    /* renamed from: c, reason: collision with root package name */
    public C f4235c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4236d;

    public b(N n7) {
        this.f4234b = n7;
        this.f4235c = v4.e.b(new C1413c(this, n7.g()));
    }

    @Override // i8.N
    public final long a() {
        switch (this.f4233a) {
            case 0:
                return this.f4234b.a();
            default:
                return this.f4234b.a();
        }
    }

    @Override // i8.N, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        switch (this.f4233a) {
            case 1:
                this.f4234b.close();
                return;
            default:
                super.close();
                return;
        }
    }

    @Override // i8.N
    public final A d() {
        switch (this.f4233a) {
            case 0:
                return this.f4234b.d();
            default:
                return this.f4234b.d();
        }
    }

    @Override // i8.N
    public final InterfaceC2189i g() {
        switch (this.f4233a) {
            case 0:
                C c3 = this.f4235c;
                if (c3 == null) {
                    C b9 = v4.e.b(new a(this, this.f4234b.g()));
                    this.f4235c = b9;
                    return b9;
                }
                return c3;
            default:
                return this.f4235c;
        }
    }

    public b(N responseBody, C1892u c1892u) {
        h.e(responseBody, "responseBody");
        this.f4234b = responseBody;
        this.f4236d = c1892u;
    }
}
