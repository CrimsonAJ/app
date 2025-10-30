package I1;

import C3.v;
import c7.C0781a;
import c7.C0784d;
import c7.C0785e;
import c7.C0787g;
import com.anilab.android.App;
import com.google.android.gms.internal.measurement.D1;
import f5.AbstractC1176h;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3281b;

    public /* synthetic */ c(int i9, Object obj) {
        this.f3280a = i9;
        this.f3281b = obj;
    }

    public final void a(C0787g c0787g) {
        switch (this.f3280a) {
            case 0:
                return;
            default:
                d7.k kVar = (d7.k) this.f3281b;
                synchronized (kVar) {
                    kVar.f16933d = true;
                }
                ((d7.k) this.f3281b).g(c0787g);
                return;
        }
    }

    public final void c(C0781a c0781a) {
        int i9 = 1;
        int i10 = 0;
        switch (this.f3280a) {
            case 0:
                C0785e v8 = D1.v();
                AbstractC1176h b9 = v8.f11715c.b();
                AbstractC1176h b10 = v8.f11716d.b();
                s8.n.D(b9, b10).e(v8.f11714b, new C0784d(v8, b9, b10, i10)).k(new v(i9, (App) this.f3281b));
                return;
            default:
                return;
        }
    }

    private final void b(C0787g c0787g) {
    }

    private final void d(C0781a c0781a) {
    }
}
