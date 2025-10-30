package P;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f5639b;

    /* renamed from: a, reason: collision with root package name */
    public final u0 f5640a;

    static {
        k0 g0Var;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            g0Var = new j0();
        } else if (i9 >= 30) {
            g0Var = new i0();
        } else if (i9 >= 29) {
            g0Var = new h0();
        } else {
            g0Var = new g0();
        }
        f5639b = g0Var.b().f5645a.a().f5645a.b().f5645a.c();
    }

    public r0(u0 u0Var) {
        this.f5640a = u0Var;
    }

    public u0 a() {
        return this.f5640a;
    }

    public u0 b() {
        return this.f5640a;
    }

    public u0 c() {
        return this.f5640a;
    }

    public C0308i e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        if (n() == r0Var.n() && m() == r0Var.m() && Objects.equals(j(), r0Var.j()) && Objects.equals(h(), r0Var.h()) && Objects.equals(e(), r0Var.e())) {
            return true;
        }
        return false;
    }

    public H.c f(int i9) {
        return H.c.f2913e;
    }

    public H.c g() {
        return j();
    }

    public H.c h() {
        return H.c.f2913e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public H.c i() {
        return j();
    }

    public H.c j() {
        return H.c.f2913e;
    }

    public H.c k() {
        return j();
    }

    public u0 l(int i9, int i10, int i11, int i12) {
        return f5639b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i9) {
        return true;
    }

    public void d(View view) {
    }

    public void p(H.c[] cVarArr) {
    }

    public void q(u0 u0Var) {
    }

    public void r(H.c cVar) {
    }

    public void s(int i9) {
    }
}
