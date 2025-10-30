package t0;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class U extends r implements S {

    /* renamed from: f, reason: collision with root package name */
    public final String f22906f;

    /* renamed from: g, reason: collision with root package name */
    public final C1985t f22907g;

    /* renamed from: h, reason: collision with root package name */
    public String f22908h;

    /* renamed from: i, reason: collision with root package name */
    public String f22909i;
    public boolean j;

    /* renamed from: l, reason: collision with root package name */
    public int f22911l;

    /* renamed from: m, reason: collision with root package name */
    public Q f22912m;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W f22914o;

    /* renamed from: k, reason: collision with root package name */
    public int f22910k = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f22913n = -1;

    public U(W w7, String str, C1985t c1985t) {
        this.f22914o = w7;
        this.f22906f = str;
        this.f22907g = c1985t;
    }

    @Override // t0.S
    public final int a() {
        return this.f22913n;
    }

    @Override // t0.S
    public final void b() {
        Q q9 = this.f22912m;
        if (q9 != null) {
            int i9 = this.f22913n;
            int i10 = q9.f22899d;
            q9.f22899d = i10 + 1;
            q9.b(4, i10, i9, null, null);
            this.f22912m = null;
            this.f22913n = 0;
        }
    }

    @Override // t0.S
    public final void c(Q q9) {
        T t7 = new T(this);
        this.f22912m = q9;
        int i9 = q9.f22900e;
        q9.f22900e = i9 + 1;
        int i10 = q9.f22899d;
        q9.f22899d = i10 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f22906f);
        bundle.putParcelable("routeControllerOptions", this.f22907g.f23034a);
        q9.b(11, i10, i9, null, bundle);
        q9.f22903h.put(i10, t7);
        this.f22913n = i9;
        if (this.j) {
            q9.a(i9);
            int i11 = this.f22910k;
            if (i11 >= 0) {
                q9.c(this.f22913n, i11);
                this.f22910k = -1;
            }
            int i12 = this.f22911l;
            if (i12 != 0) {
                q9.d(this.f22913n, i12);
                this.f22911l = 0;
            }
        }
    }

    @Override // t0.AbstractC1984s
    public final void d() {
        W w7 = this.f22914o;
        w7.f22926k.remove(this);
        b();
        w7.l();
    }

    @Override // t0.AbstractC1984s
    public final void e() {
        this.j = true;
        Q q9 = this.f22912m;
        if (q9 != null) {
            q9.a(this.f22913n);
        }
    }

    @Override // t0.AbstractC1984s
    public final void f(int i9) {
        Q q9 = this.f22912m;
        if (q9 != null) {
            q9.c(this.f22913n, i9);
        } else {
            this.f22910k = i9;
            this.f22911l = 0;
        }
    }

    @Override // t0.AbstractC1984s
    public final void g() {
        h(0);
    }

    @Override // t0.AbstractC1984s
    public final void h(int i9) {
        this.j = false;
        Q q9 = this.f22912m;
        if (q9 != null) {
            int i10 = this.f22913n;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i9);
            int i11 = q9.f22899d;
            q9.f22899d = i11 + 1;
            q9.b(6, i11, i10, null, bundle);
        }
    }

    @Override // t0.AbstractC1984s
    public final void i(int i9) {
        Q q9 = this.f22912m;
        if (q9 != null) {
            q9.d(this.f22913n, i9);
        } else {
            this.f22911l += i9;
        }
    }

    @Override // t0.r
    public final String j() {
        return this.f22908h;
    }

    @Override // t0.r
    public final String k() {
        return this.f22909i;
    }

    @Override // t0.r
    public final void m(String str) {
        Q q9 = this.f22912m;
        if (q9 != null) {
            int i9 = this.f22913n;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = q9.f22899d;
            q9.f22899d = i10 + 1;
            q9.b(12, i10, i9, null, bundle);
        }
    }

    @Override // t0.r
    public final void n(String str) {
        Q q9 = this.f22912m;
        if (q9 != null) {
            int i9 = this.f22913n;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i10 = q9.f22899d;
            q9.f22899d = i10 + 1;
            q9.b(13, i10, i9, null, bundle);
        }
    }

    @Override // t0.r
    public final void o(ArrayList arrayList) {
        Q q9 = this.f22912m;
        if (q9 != null) {
            int i9 = this.f22913n;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList<>(arrayList));
            int i10 = q9.f22899d;
            q9.f22899d = i10 + 1;
            q9.b(14, i10, i9, null, bundle);
        }
    }
}
