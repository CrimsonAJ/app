package P;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a0 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.firebase.messaging.n f5570a;

    /* renamed from: b, reason: collision with root package name */
    public u0 f5571b;

    public a0(View view, com.google.firebase.messaging.n nVar) {
        u0 u0Var;
        k0 g0Var;
        this.f5570a = nVar;
        WeakHashMap weakHashMap = Q.f5546a;
        u0 a5 = I.a(view);
        if (a5 != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 34) {
                g0Var = new j0(a5);
            } else if (i9 >= 30) {
                g0Var = new i0(a5);
            } else if (i9 >= 29) {
                g0Var = new h0(a5);
            } else {
                g0Var = new g0(a5);
            }
            u0Var = g0Var.b();
        } else {
            u0Var = null;
        }
        this.f5571b = u0Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        r0 r0Var;
        Interpolator interpolator;
        long j;
        int i9;
        int i10;
        int i11 = 1;
        if (!view.isLaidOut()) {
            this.f5571b = u0.g(view, windowInsets);
            return b0.i(view, windowInsets);
        }
        u0 g9 = u0.g(view, windowInsets);
        if (this.f5571b == null) {
            WeakHashMap weakHashMap = Q.f5546a;
            this.f5571b = I.a(view);
        }
        if (this.f5571b == null) {
            this.f5571b = g9;
            return b0.i(view, windowInsets);
        }
        com.google.firebase.messaging.n j4 = b0.j(view);
        if (j4 != null && Objects.equals((u0) j4.f16490c, g9)) {
            return b0.i(view, windowInsets);
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        u0 u0Var = this.f5571b;
        int i12 = 1;
        while (true) {
            r0Var = g9.f5645a;
            if (i12 > 512) {
                break;
            }
            H.c f9 = r0Var.f(i12);
            H.c f10 = u0Var.f5645a.f(i12);
            int i13 = f9.f2914a;
            int i14 = f10.f2914a;
            int i15 = f9.f2917d;
            int i16 = f9.f2916c;
            int i17 = f9.f2915b;
            int i18 = f10.f2917d;
            int i19 = i11;
            int i20 = f10.f2916c;
            int i21 = f10.f2915b;
            if (i13 <= i14 && i17 <= i21 && i16 <= i20 && i15 <= i18) {
                i9 = 0;
            } else {
                i9 = i19;
            }
            if (i13 >= i14 && i17 >= i21 && i16 >= i20 && i15 >= i18) {
                i10 = 0;
            } else {
                i10 = i19;
            }
            if (i9 != i10) {
                if (i9 != 0) {
                    iArr[0] = iArr[0] | i12;
                } else {
                    iArr2[0] = iArr2[0] | i12;
                }
            }
            i12 <<= 1;
            i11 = i19;
        }
        int i22 = i11;
        int i23 = iArr[0];
        int i24 = iArr2[0];
        int i25 = i23 | i24;
        if (i25 == 0) {
            this.f5571b = g9;
            return b0.i(view, windowInsets);
        }
        u0 u0Var2 = this.f5571b;
        if ((i23 & 8) != 0) {
            interpolator = b0.f5575e;
        } else if ((i24 & 8) != 0) {
            interpolator = b0.f5576f;
        } else if ((i23 & 519) != 0) {
            interpolator = b0.f5577g;
        } else if ((i24 & 519) != 0) {
            interpolator = b0.f5578h;
        } else {
            interpolator = null;
        }
        if ((i25 & 8) != 0) {
            j = 160;
        } else {
            j = 250;
        }
        f0 f0Var = new f0(i25, interpolator, j);
        f0Var.f5595a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(f0Var.f5595a.a());
        H.c f11 = r0Var.f(i25);
        H.c f12 = u0Var2.f5645a.f(i25);
        int min = Math.min(f11.f2914a, f12.f2914a);
        int i26 = f11.f2915b;
        int i27 = f12.f2915b;
        int min2 = Math.min(i26, i27);
        int i28 = f11.f2916c;
        int i29 = f12.f2916c;
        int min3 = Math.min(i28, i29);
        int i30 = f11.f2917d;
        int i31 = f12.f2917d;
        O0.c cVar = new O0.c(H.c.b(min, min2, min3, Math.min(i30, i31)), 3, H.c.b(Math.max(f11.f2914a, f12.f2914a), Math.max(i26, i27), Math.max(i28, i29), Math.max(i30, i31)));
        b0.f(view, g9, false);
        duration.addUpdateListener(new Z(f0Var, g9, u0Var2, i25, view));
        duration.addListener(new W(f0Var, view, i22));
        ViewTreeObserverOnPreDrawListenerC0316q.a(view, new A4.j(view, f0Var, cVar, duration));
        this.f5571b = g9;
        return b0.i(view, windowInsets);
    }
}
