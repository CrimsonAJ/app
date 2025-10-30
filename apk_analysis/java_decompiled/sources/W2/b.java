package W2;

import N6.d;
import X2.A;
import X2.AbstractC0440a;
import X2.B;
import X2.C;
import X2.C0441b;
import X2.C0442c;
import X2.C0443d;
import X2.C0444e;
import X2.C0445f;
import X2.C0446g;
import X2.C0447h;
import X2.C0448i;
import X2.C0449j;
import X2.D;
import X2.E;
import X2.F;
import X2.I;
import X2.k;
import X2.l;
import X2.m;
import X2.n;
import X2.o;
import X2.p;
import X2.q;
import X2.r;
import X2.s;
import X2.t;
import X2.v;
import X2.w;
import X2.y;
import Z2.h;
import android.content.Context;
import android.net.ConnectivityManager;
import h3.InterfaceC1276a;
import java.net.MalformedURLException;
import java.net.URL;
import o1.C1671f;
import u0.z;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final C1671f f7879a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f7880b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f7881c;

    /* renamed from: d, reason: collision with root package name */
    public final URL f7882d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1276a f7883e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1276a f7884f;

    /* renamed from: g, reason: collision with root package name */
    public final int f7885g;

    public b(Context context, InterfaceC1276a interfaceC1276a, InterfaceC1276a interfaceC1276a2) {
        d dVar = new d();
        C0442c c0442c = C0442c.f8338a;
        dVar.a(w.class, c0442c);
        dVar.a(m.class, c0442c);
        C0449j c0449j = C0449j.f8362a;
        dVar.a(F.class, c0449j);
        dVar.a(t.class, c0449j);
        C0443d c0443d = C0443d.f8340a;
        dVar.a(y.class, c0443d);
        dVar.a(n.class, c0443d);
        C0441b c0441b = C0441b.f8326a;
        dVar.a(AbstractC0440a.class, c0441b);
        dVar.a(l.class, c0441b);
        C0448i c0448i = C0448i.f8353a;
        dVar.a(E.class, c0448i);
        dVar.a(s.class, c0448i);
        C0444e c0444e = C0444e.f8343a;
        dVar.a(A.class, c0444e);
        dVar.a(o.class, c0444e);
        C0447h c0447h = C0447h.f8351a;
        dVar.a(D.class, c0447h);
        dVar.a(r.class, c0447h);
        C0446g c0446g = C0446g.f8349a;
        dVar.a(C.class, c0446g);
        dVar.a(q.class, c0446g);
        k kVar = k.f8370a;
        dVar.a(I.class, kVar);
        dVar.a(v.class, kVar);
        C0445f c0445f = C0445f.f8346a;
        dVar.a(B.class, c0445f);
        dVar.a(p.class, c0445f);
        dVar.f5241d = true;
        this.f7879a = new C1671f(12, dVar);
        this.f7881c = context;
        this.f7880b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f7882d = b(a.f7873c);
        this.f7883e = interfaceC1276a2;
        this.f7884f = interfaceC1276a;
        this.f7885g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException(z.e("Invalid url: ", str), e8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
    
        if (((X2.G) X2.G.f8320a.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final Y2.i a(Y2.i r7) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.b.a(Y2.i):Y2.i");
    }
}
