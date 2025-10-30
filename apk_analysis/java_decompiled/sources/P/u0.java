package P;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u0 f5644b;

    /* renamed from: a, reason: collision with root package name */
    public final r0 f5645a;

    static {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            f5644b = q0.f5637s;
        } else if (i9 >= 30) {
            f5644b = p0.f5633r;
        } else {
            f5644b = r0.f5639b;
        }
    }

    public u0(WindowInsets windowInsets) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            this.f5645a = new q0(this, windowInsets);
            return;
        }
        if (i9 >= 30) {
            this.f5645a = new p0(this, windowInsets);
            return;
        }
        if (i9 >= 29) {
            this.f5645a = new o0(this, windowInsets);
        } else if (i9 >= 28) {
            this.f5645a = new n0(this, windowInsets);
        } else {
            this.f5645a = new m0(this, windowInsets);
        }
    }

    public static H.c e(H.c cVar, int i9, int i10, int i11, int i12) {
        int max = Math.max(0, cVar.f2914a - i9);
        int max2 = Math.max(0, cVar.f2915b - i10);
        int max3 = Math.max(0, cVar.f2916c - i11);
        int max4 = Math.max(0, cVar.f2917d - i12);
        if (max == i9 && max2 == i10 && max3 == i11 && max4 == i12) {
            return cVar;
        }
        return H.c.b(max, max2, max3, max4);
    }

    public static u0 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        u0 u0Var = new u0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = Q.f5546a;
            u0 a5 = I.a(view);
            r0 r0Var = u0Var.f5645a;
            r0Var.q(a5);
            r0Var.d(view.getRootView());
            r0Var.s(view.getWindowSystemUiVisibility());
        }
        return u0Var;
    }

    public final int a() {
        return this.f5645a.j().f2917d;
    }

    public final int b() {
        return this.f5645a.j().f2914a;
    }

    public final int c() {
        return this.f5645a.j().f2916c;
    }

    public final int d() {
        return this.f5645a.j().f2915b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        return Objects.equals(this.f5645a, ((u0) obj).f5645a);
    }

    public final WindowInsets f() {
        r0 r0Var = this.f5645a;
        if (r0Var instanceof l0) {
            return ((l0) r0Var).f5623c;
        }
        return null;
    }

    public final int hashCode() {
        r0 r0Var = this.f5645a;
        if (r0Var == null) {
            return 0;
        }
        return r0Var.hashCode();
    }

    public u0() {
        this.f5645a = new r0(this);
    }
}
