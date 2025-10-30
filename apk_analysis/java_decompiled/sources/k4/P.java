package k4;

import N3.C0266q;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class P implements J {

    /* renamed from: a, reason: collision with root package name */
    public final long f20008a;

    /* renamed from: b, reason: collision with root package name */
    public final C1516p f20009b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20010c;

    /* renamed from: d, reason: collision with root package name */
    public final V f20011d;

    /* renamed from: e, reason: collision with root package name */
    public final O f20012e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f20013f;

    public P(InterfaceC1513m interfaceC1513m, Uri uri, int i9, O o9) {
        Map map = Collections.EMPTY_MAP;
        AbstractC1566a.o(uri, "The uri must be set.");
        C1516p c1516p = new C1516p(uri, 1, null, map, 0L, -1L, null, 1);
        this.f20011d = new V(interfaceC1513m);
        this.f20009b = c1516p;
        this.f20010c = i9;
        this.f20012e = o9;
        this.f20008a = C0266q.f5180a.getAndIncrement();
    }

    @Override // k4.J
    public final void a() {
        this.f20011d.f20033b = 0L;
        C1515o c1515o = new C1515o(this.f20011d, this.f20009b);
        try {
            c1515o.a();
            Uri s9 = this.f20011d.f20032a.s();
            s9.getClass();
            this.f20013f = this.f20012e.k(s9, c1515o);
        } finally {
            l4.y.g(c1515o);
        }
    }

    @Override // k4.J
    public final void c() {
    }
}
