package P;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import l6.AbstractC1570b;

/* loaded from: classes.dex */
public abstract class l0 extends r0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f5619i = false;
    public static Method j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f5620k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f5621l;

    /* renamed from: m, reason: collision with root package name */
    public static Field f5622m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f5623c;

    /* renamed from: d, reason: collision with root package name */
    public H.c[] f5624d;

    /* renamed from: e, reason: collision with root package name */
    public H.c f5625e;

    /* renamed from: f, reason: collision with root package name */
    public u0 f5626f;

    /* renamed from: g, reason: collision with root package name */
    public H.c f5627g;

    /* renamed from: h, reason: collision with root package name */
    public int f5628h;

    public l0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var);
        this.f5625e = null;
        this.f5623c = windowInsets;
    }

    public static boolean A(int i9, int i10) {
        if ((i9 & 6) == (i10 & 6)) {
            return true;
        }
        return false;
    }

    @SuppressLint({"WrongConstant"})
    private H.c t(int i9, boolean z9) {
        H.c cVar = H.c.f2913e;
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0) {
                cVar = H.c.a(cVar, u(i10, z9));
            }
        }
        return cVar;
    }

    private H.c v() {
        u0 u0Var = this.f5626f;
        if (u0Var != null) {
            return u0Var.f5645a.h();
        }
        return H.c.f2913e;
    }

    private H.c w(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!f5619i) {
                y();
            }
            Method method = j;
            if (method != null && f5620k != null && f5621l != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f5621l.get(f5622m.get(invoke));
                    if (rect != null) {
                        return H.c.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                } catch (ReflectiveOperationException e8) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    @SuppressLint({"PrivateApi"})
    private static void y() {
        try {
            j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f5620k = cls;
            f5621l = cls.getDeclaredField("mVisibleInsets");
            f5622m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f5621l.setAccessible(true);
            f5622m.setAccessible(true);
        } catch (ReflectiveOperationException e8) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
        }
        f5619i = true;
    }

    @Override // P.r0
    public void d(View view) {
        H.c w7 = w(view);
        if (w7 == null) {
            w7 = H.c.f2913e;
        }
        z(w7);
    }

    @Override // P.r0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (!Objects.equals(this.f5627g, l0Var.f5627g) || !A(this.f5628h, l0Var.f5628h)) {
            return false;
        }
        return true;
    }

    @Override // P.r0
    public H.c f(int i9) {
        return t(i9, false);
    }

    @Override // P.r0
    public final H.c j() {
        if (this.f5625e == null) {
            WindowInsets windowInsets = this.f5623c;
            this.f5625e = H.c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f5625e;
    }

    @Override // P.r0
    public u0 l(int i9, int i10, int i11, int i12) {
        k0 g0Var;
        u0 g9 = u0.g(null, this.f5623c);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 34) {
            g0Var = new j0(g9);
        } else if (i13 >= 30) {
            g0Var = new i0(g9);
        } else if (i13 >= 29) {
            g0Var = new h0(g9);
        } else {
            g0Var = new g0(g9);
        }
        g0Var.g(u0.e(j(), i9, i10, i11, i12));
        g0Var.e(u0.e(h(), i9, i10, i11, i12));
        return g0Var.b();
    }

    @Override // P.r0
    public boolean n() {
        return this.f5623c.isRound();
    }

    @Override // P.r0
    @SuppressLint({"WrongConstant"})
    public boolean o(int i9) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i9 & i10) != 0 && !x(i10)) {
                return false;
            }
        }
        return true;
    }

    @Override // P.r0
    public void p(H.c[] cVarArr) {
        this.f5624d = cVarArr;
    }

    @Override // P.r0
    public void q(u0 u0Var) {
        this.f5626f = u0Var;
    }

    @Override // P.r0
    public void s(int i9) {
        this.f5628h = i9;
    }

    public H.c u(int i9, boolean z9) {
        int i10;
        C0308i e8;
        int i11;
        int i12;
        int i13;
        H.c cVar = H.c.f2913e;
        int i14 = 0;
        if (i9 != 1) {
            H.c cVar2 = null;
            if (i9 != 2) {
                if (i9 != 8) {
                    if (i9 != 16) {
                        if (i9 != 32) {
                            if (i9 != 64) {
                                if (i9 == 128) {
                                    u0 u0Var = this.f5626f;
                                    if (u0Var != null) {
                                        e8 = u0Var.f5645a.e();
                                    } else {
                                        e8 = e();
                                    }
                                    if (e8 != null) {
                                        int i15 = Build.VERSION.SDK_INT;
                                        if (i15 >= 28) {
                                            i11 = F.a.h(e8.f5611a);
                                        } else {
                                            i11 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i12 = F.a.j(e8.f5611a);
                                        } else {
                                            i12 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i13 = F.a.i(e8.f5611a);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i15 >= 28) {
                                            i14 = F.a.g(e8.f5611a);
                                        }
                                        return H.c.b(i11, i12, i13, i14);
                                    }
                                }
                            } else {
                                return k();
                            }
                        } else {
                            return g();
                        }
                    } else {
                        return i();
                    }
                } else {
                    H.c[] cVarArr = this.f5624d;
                    if (cVarArr != null) {
                        cVar2 = cVarArr[AbstractC1570b.j(8)];
                    }
                    if (cVar2 != null) {
                        return cVar2;
                    }
                    H.c j4 = j();
                    H.c v8 = v();
                    int i16 = j4.f2917d;
                    if (i16 > v8.f2917d) {
                        return H.c.b(0, 0, 0, i16);
                    }
                    H.c cVar3 = this.f5627g;
                    if (cVar3 != null && !cVar3.equals(cVar) && (i10 = this.f5627g.f2917d) > v8.f2917d) {
                        return H.c.b(0, 0, 0, i10);
                    }
                }
            } else {
                if (z9) {
                    H.c v9 = v();
                    H.c h7 = h();
                    return H.c.b(Math.max(v9.f2914a, h7.f2914a), 0, Math.max(v9.f2916c, h7.f2916c), Math.max(v9.f2917d, h7.f2917d));
                }
                if ((this.f5628h & 2) == 0) {
                    H.c j9 = j();
                    u0 u0Var2 = this.f5626f;
                    if (u0Var2 != null) {
                        cVar2 = u0Var2.f5645a.h();
                    }
                    int i17 = j9.f2917d;
                    if (cVar2 != null) {
                        i17 = Math.min(i17, cVar2.f2917d);
                    }
                    return H.c.b(j9.f2914a, 0, j9.f2916c, i17);
                }
            }
        } else {
            if (z9) {
                return H.c.b(0, Math.max(v().f2915b, j().f2915b), 0, 0);
            }
            if ((this.f5628h & 4) == 0) {
                return H.c.b(0, j().f2915b, 0, 0);
            }
        }
        return cVar;
    }

    public boolean x(int i9) {
        if (i9 != 1 && i9 != 2) {
            if (i9 == 4) {
                return false;
            }
            if (i9 != 8 && i9 != 128) {
                return true;
            }
        }
        return !u(i9, false).equals(H.c.f2913e);
    }

    public void z(H.c cVar) {
        this.f5627g = cVar;
    }
}
