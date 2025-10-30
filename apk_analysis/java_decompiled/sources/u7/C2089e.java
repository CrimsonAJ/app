package u7;

import A1.g;
import androidx.lifecycle.e0;
import androidx.lifecycle.h0;
import d0.w;
import k4.C1521v;
import m0.C1580c;
import m0.C1581d;

/* renamed from: u7.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2089e implements h0 {

    /* renamed from: d, reason: collision with root package name */
    public static final w f23710d = new w(14);

    /* renamed from: a, reason: collision with root package name */
    public final C1521v f23711a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f23712b;

    /* renamed from: c, reason: collision with root package name */
    public final C1580c f23713c;

    public C2089e(C1521v c1521v, h0 h0Var, g gVar) {
        this.f23711a = c1521v;
        this.f23712b = h0Var;
        this.f23713c = new C1580c(1, gVar);
    }

    @Override // androidx.lifecycle.h0
    public final e0 a(Class cls) {
        if (!this.f23711a.containsKey(cls)) {
            return this.f23712b.a(cls);
        }
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // androidx.lifecycle.h0
    public final e0 b(Class cls, C1581d c1581d) {
        if (this.f23711a.containsKey(cls)) {
            return this.f23713c.b(cls, c1581d);
        }
        return this.f23712b.b(cls, c1581d);
    }
}
