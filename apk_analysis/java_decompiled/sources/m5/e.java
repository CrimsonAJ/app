package m5;

import F5.h;
import P.H;
import P.Q;
import P.u0;
import P.v0;
import P.y0;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.Window;
import b7.C0701c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import s8.n;

/* loaded from: classes.dex */
public final class e extends AbstractC1593a {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f20842a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f20843b;

    /* renamed from: c, reason: collision with root package name */
    public Window f20844c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20845d;

    public e(View view, u0 u0Var) {
        ColorStateList c3;
        Integer num;
        this.f20843b = u0Var;
        h hVar = BottomSheetBehavior.B(view).f15875i;
        if (hVar != null) {
            c3 = hVar.f2483a.f2468c;
        } else {
            WeakHashMap weakHashMap = Q.f5546a;
            c3 = H.c(view);
        }
        if (c3 != null) {
            this.f20842a = Boolean.valueOf(n.s(c3.getDefaultColor()));
            return;
        }
        ColorStateList u9 = O4.h.u(view.getBackground());
        if (u9 != null) {
            num = Integer.valueOf(u9.getDefaultColor());
        } else {
            num = null;
        }
        if (num != null) {
            this.f20842a = Boolean.valueOf(n.s(num.intValue()));
        } else {
            this.f20842a = null;
        }
    }

    @Override // m5.AbstractC1593a
    public final void a(View view) {
        d(view);
    }

    @Override // m5.AbstractC1593a
    public final void b(View view) {
        d(view);
    }

    @Override // m5.AbstractC1593a
    public final void c(View view, int i9) {
        d(view);
    }

    public final void d(View view) {
        s8.e v0Var;
        boolean booleanValue;
        s8.e v0Var2;
        int top = view.getTop();
        u0 u0Var = this.f20843b;
        if (top < u0Var.d()) {
            Window window = this.f20844c;
            if (window != null) {
                Boolean bool = this.f20842a;
                if (bool == null) {
                    booleanValue = this.f20845d;
                } else {
                    booleanValue = bool.booleanValue();
                }
                C0701c c0701c = new C0701c(window.getDecorView());
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 35) {
                    v0Var2 = new y0(window, c0701c);
                } else if (i9 >= 30) {
                    v0Var2 = new y0(window, c0701c);
                } else if (i9 >= 26) {
                    v0Var2 = new v0(window, c0701c);
                } else {
                    v0Var2 = new v0(window, c0701c);
                }
                v0Var2.Z(booleanValue);
            }
            view.setPadding(view.getPaddingLeft(), u0Var.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (view.getTop() != 0) {
            Window window2 = this.f20844c;
            if (window2 != null) {
                boolean z9 = this.f20845d;
                C0701c c0701c2 = new C0701c(window2.getDecorView());
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 35) {
                    v0Var = new y0(window2, c0701c2);
                } else if (i10 >= 30) {
                    v0Var = new y0(window2, c0701c2);
                } else if (i10 >= 26) {
                    v0Var = new v0(window2, c0701c2);
                } else {
                    v0Var = new v0(window2, c0701c2);
                }
                v0Var.Z(z9);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public final void e(Window window) {
        s8.e v0Var;
        if (this.f20844c != window) {
            this.f20844c = window;
            if (window != null) {
                C0701c c0701c = new C0701c(window.getDecorView());
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 35) {
                    v0Var = new y0(window, c0701c);
                } else if (i9 >= 30) {
                    v0Var = new y0(window, c0701c);
                } else if (i9 >= 26) {
                    v0Var = new v0(window, c0701c);
                } else {
                    v0Var = new v0(window, c0701c);
                }
                this.f20845d = v0Var.J();
            }
        }
    }
}
