package i;

import P.InterfaceC0314o;
import P.Q;
import P.g0;
import P.h0;
import P.i0;
import P.j0;
import P.k0;
import P.u0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import co.notix.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p.f1;
import p.g1;

/* loaded from: classes.dex */
public final class n implements InterfaceC0314o, o.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f18084a;

    public /* synthetic */ n(w wVar) {
        this.f18084a = wVar;
    }

    @Override // o.w
    public void c(o.l lVar, boolean z9) {
        boolean z10;
        int i9;
        v vVar;
        o.l k5 = lVar.k();
        int i10 = 0;
        if (k5 != lVar) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            lVar = k5;
        }
        w wVar = this.f18084a;
        v[] vVarArr = wVar.f18129j0;
        if (vVarArr != null) {
            i9 = vVarArr.length;
        } else {
            i9 = 0;
        }
        while (true) {
            if (i10 < i9) {
                vVar = vVarArr[i10];
                if (vVar != null && vVar.f18103h == lVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                vVar = null;
                break;
            }
        }
        if (vVar != null) {
            if (z10) {
                wVar.o(vVar.f18096a, vVar, k5);
                wVar.q(vVar, true);
            } else {
                wVar.q(vVar, z9);
            }
        }
    }

    @Override // o.w
    public boolean m(o.l lVar) {
        Window.Callback callback;
        if (lVar == lVar.k()) {
            w wVar = this.f18084a;
            if (wVar.Y && (callback = wVar.f18132l.getCallback()) != null && !wVar.f18139o0) {
                callback.onMenuOpened(108, lVar);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // P.InterfaceC0314o
    public u0 t(View view, u0 u0Var) {
        int i9;
        int i10;
        boolean z9;
        u0 u0Var2;
        k0 g0Var;
        boolean z10;
        int b9;
        int c3;
        boolean z11;
        boolean z12;
        int color;
        int d9 = u0Var.d();
        w wVar = this.f18084a;
        wVar.getClass();
        int d10 = u0Var.d();
        ActionBarContextView actionBarContextView = wVar.f18151v;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wVar.f18151v.getLayoutParams();
            if (wVar.f18151v.isShown()) {
                if (wVar.f18115A0 == null) {
                    wVar.f18115A0 = new Rect();
                    wVar.f18117B0 = new Rect();
                }
                Rect rect = wVar.f18115A0;
                Rect rect2 = wVar.f18117B0;
                rect.set(u0Var.b(), u0Var.d(), u0Var.c(), u0Var.a());
                ViewGroup viewGroup = wVar.f18114A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z13 = g1.f21992a;
                    f1.a(viewGroup, rect, rect2);
                } else {
                    if (!g1.f21992a) {
                        g1.f21992a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            g1.f21993b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                g1.f21993b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = g1.f21993b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e8) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e8);
                        }
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                ViewGroup viewGroup2 = wVar.f18114A;
                WeakHashMap weakHashMap = Q.f5546a;
                u0 a5 = P.I.a(viewGroup2);
                if (a5 == null) {
                    b9 = 0;
                } else {
                    b9 = a5.b();
                }
                if (a5 == null) {
                    c3 = 0;
                } else {
                    c3 = a5.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                Context context = wVar.f18130k;
                if (i11 > 0 && wVar.f18118C == null) {
                    View view2 = new View(context);
                    wVar.f18118C = view2;
                    i10 = 8;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b9;
                    layoutParams.rightMargin = c3;
                    wVar.f18114A.addView(wVar.f18118C, -1, layoutParams);
                } else {
                    i10 = 8;
                    View view3 = wVar.f18118C;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b9 || marginLayoutParams2.rightMargin != c3) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b9;
                            marginLayoutParams2.rightMargin = c3;
                            wVar.f18118C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = wVar.f18118C;
                if (view4 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = wVar.f18118C;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        color = context.getColor(R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = context.getColor(R.color.abc_decor_view_status_guard);
                    }
                    view5.setBackgroundColor(color);
                }
                if (!wVar.f18125f0 && z12) {
                    d10 = 0;
                }
                z9 = z12;
                z10 = z11;
                i9 = 0;
            } else {
                i10 = 8;
                i9 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z9 = false;
                    z10 = true;
                } else {
                    z9 = false;
                    z10 = false;
                }
            }
            if (z10) {
                wVar.f18151v.setLayoutParams(marginLayoutParams);
            }
        } else {
            i9 = 0;
            i10 = 8;
            z9 = false;
        }
        View view6 = wVar.f18118C;
        if (view6 != null) {
            if (z9) {
                i10 = i9;
            }
            view6.setVisibility(i10);
        }
        if (d9 != d10) {
            int b10 = u0Var.b();
            int c9 = u0Var.c();
            int a9 = u0Var.a();
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 34) {
                g0Var = new j0(u0Var);
            } else if (i16 >= 30) {
                g0Var = new i0(u0Var);
            } else if (i16 >= 29) {
                g0Var = new h0(u0Var);
            } else {
                g0Var = new g0(u0Var);
            }
            g0Var.g(H.c.b(b10, d10, c9, a9));
            u0Var2 = g0Var.b();
        } else {
            u0Var2 = u0Var;
        }
        WeakHashMap weakHashMap2 = Q.f5546a;
        WindowInsets f9 = u0Var2.f();
        if (f9 != null) {
            WindowInsets b11 = P.F.b(view, f9);
            if (!b11.equals(f9)) {
                return u0.g(view, b11);
            }
            return u0Var2;
        }
        return u0Var2;
    }
}
