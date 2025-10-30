package t0;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class V extends AbstractC1984s implements S {

    /* renamed from: a, reason: collision with root package name */
    public final String f22915a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22916b;

    /* renamed from: c, reason: collision with root package name */
    public final C1985t f22917c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f22918d;

    /* renamed from: e, reason: collision with root package name */
    public int f22919e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f22920f;

    /* renamed from: g, reason: collision with root package name */
    public Q f22921g;

    /* renamed from: h, reason: collision with root package name */
    public int f22922h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ W f22923i;

    public V(W w7, String str, String str2, C1985t c1985t) {
        this.f22923i = w7;
        this.f22915a = str;
        this.f22916b = str2;
        this.f22917c = c1985t;
    }

    @Override // t0.S
    public final int a() {
        return this.f22922h;
    }

    @Override // t0.S
    public final void b() {
        Q q9 = this.f22921g;
        if (q9 != null) {
            int i9 = this.f22922h;
            int i10 = q9.f22899d;
            q9.f22899d = i10 + 1;
            q9.b(4, i10, i9, null, null);
            this.f22921g = null;
            this.f22922h = 0;
        }
    }

    @Override // t0.S
    public final void c(Q q9) {
        this.f22921g = q9;
        int i9 = q9.f22900e;
        q9.f22900e = i9 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.f22915a);
        bundle.putString("routeGroupId", this.f22916b);
        bundle.putParcelable("routeControllerOptions", this.f22917c.f23034a);
        int i10 = q9.f22899d;
        q9.f22899d = i10 + 1;
        q9.b(3, i10, i9, null, bundle);
        this.f22922h = i9;
        if (this.f22918d) {
            q9.a(i9);
            int i11 = this.f22919e;
            if (i11 >= 0) {
                q9.c(this.f22922h, i11);
                this.f22919e = -1;
            }
            int i12 = this.f22920f;
            if (i12 != 0) {
                q9.d(this.f22922h, i12);
                this.f22920f = 0;
            }
        }
    }

    @Override // t0.AbstractC1984s
    public final void d() {
        W w7 = this.f22923i;
        w7.f22926k.remove(this);
        b();
        w7.l();
    }

    @Override // t0.AbstractC1984s
    public final void e() {
        this.f22918d = true;
        Q q9 = this.f22921g;
        if (q9 != null) {
            q9.a(this.f22922h);
        }
    }

    @Override // t0.AbstractC1984s
    public final void f(int i9) {
        Q q9 = this.f22921g;
        if (q9 != null) {
            q9.c(this.f22922h, i9);
        } else {
            this.f22919e = i9;
            this.f22920f = 0;
        }
    }

    @Override // t0.AbstractC1984s
    public final void g() {
        h(0);
    }

    @Override // t0.AbstractC1984s
    public final void h(int i9) {
        this.f22918d = false;
        Q q9 = this.f22921g;
        if (q9 != null) {
            int i10 = this.f22922h;
            Bundle bundle = new Bundle();
            bundle.putInt("unselectReason", i9);
            int i11 = q9.f22899d;
            q9.f22899d = i11 + 1;
            q9.b(6, i11, i10, null, bundle);
        }
    }

    @Override // t0.AbstractC1984s
    public final void i(int i9) {
        Q q9 = this.f22921g;
        if (q9 != null) {
            q9.d(this.f22922h, i9);
        } else {
            this.f22920f += i9;
        }
    }
}
