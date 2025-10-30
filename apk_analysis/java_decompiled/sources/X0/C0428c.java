package X0;

import android.view.ViewGroup;

/* renamed from: X0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0428c extends n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8162a = false;

    /* renamed from: b, reason: collision with root package name */
    public final ViewGroup f8163b;

    public C0428c(ViewGroup viewGroup) {
        this.f8163b = viewGroup;
    }

    @Override // X0.n, X0.j
    public final void a(m mVar) {
        v4.e.R(this.f8163b, false);
        this.f8162a = true;
    }

    @Override // X0.n, X0.j
    public final void d() {
        v4.e.R(this.f8163b, false);
    }

    @Override // X0.n, X0.j
    public final void e() {
        v4.e.R(this.f8163b, true);
    }

    @Override // X0.j
    public final void g(m mVar) {
        if (!this.f8162a) {
            v4.e.R(this.f8163b, false);
        }
        mVar.A(this);
    }
}
