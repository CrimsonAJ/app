package m5;

import I5.h;
import P.H;
import P.Q;
import Q2.U;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import co.notix.R;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f5.C1183o;
import i.y;
import java.util.ArrayList;
import java.util.WeakHashMap;
import v4.q;

/* loaded from: classes.dex */
public final class f extends y {

    /* renamed from: f, reason: collision with root package name */
    public BottomSheetBehavior f20846f;

    /* renamed from: g, reason: collision with root package name */
    public FrameLayout f20847g;

    /* renamed from: h, reason: collision with root package name */
    public CoordinatorLayout f20848h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f20849i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f20850k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20851l;

    /* renamed from: m, reason: collision with root package name */
    public e f20852m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20853n;

    /* renamed from: o, reason: collision with root package name */
    public q f20854o;

    /* renamed from: p, reason: collision with root package name */
    public d f20855p;

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (this.f20846f == null) {
            f();
        }
        super.cancel();
    }

    public final void f() {
        if (this.f20847g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.f20847g = frameLayout;
            this.f20848h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.f20847g.findViewById(R.id.design_bottom_sheet);
            this.f20849i = frameLayout2;
            BottomSheetBehavior B9 = BottomSheetBehavior.B(frameLayout2);
            this.f20846f = B9;
            d dVar = this.f20855p;
            ArrayList arrayList = B9.f15859W;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            this.f20846f.G(this.j);
            this.f20854o = new q(this.f20846f, this.f20849i);
        }
    }

    public final FrameLayout g(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        f();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f20847g.findViewById(R.id.coordinator);
        if (i9 != 0 && view == null) {
            view = getLayoutInflater().inflate(i9, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f20853n) {
            FrameLayout frameLayout = this.f20849i;
            C1183o c1183o = new C1183o(9, this);
            WeakHashMap weakHashMap = Q.f5546a;
            H.l(frameLayout, c1183o);
        }
        this.f20849i.removeAllViews();
        if (layoutParams == null) {
            this.f20849i.addView(view);
        } else {
            this.f20849i.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new U(3, this));
        Q.m(this.f20849i, new I5.e(2, this));
        this.f20849i.setOnTouchListener(new h(1));
        return this.f20847g;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        boolean z9;
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            if (this.f20853n && Color.alpha(window.getNavigationBarColor()) < 255) {
                z9 = true;
            } else {
                z9 = false;
            }
            FrameLayout frameLayout = this.f20847g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z9);
            }
            CoordinatorLayout coordinatorLayout = this.f20848h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z9);
            }
            Y1.E(window, !z9);
            e eVar = this.f20852m;
            if (eVar != null) {
                eVar.e(window);
            }
        }
        q qVar = this.f20854o;
        if (qVar != null) {
            boolean z10 = this.j;
            View view = (View) qVar.f23878c;
            y5.c cVar = (y5.c) qVar.f23876a;
            if (z10) {
                if (cVar != null) {
                    cVar.b((y5.b) qVar.f23877b, view, false);
                }
            } else if (cVar != null) {
                cVar.c(view);
            }
        }
    }

    @Override // i.y, d.DialogC1072m, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        y5.c cVar;
        e eVar = this.f20852m;
        if (eVar != null) {
            eVar.e(null);
        }
        q qVar = this.f20854o;
        if (qVar != null && (cVar = (y5.c) qVar.f23876a) != null) {
            cVar.c((View) qVar.f23878c);
        }
    }

    @Override // d.DialogC1072m, android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f20846f;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f15848L == 5) {
            bottomSheetBehavior.I(4);
        }
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z9) {
        q qVar;
        super.setCancelable(z9);
        if (this.j != z9) {
            this.j = z9;
            BottomSheetBehavior bottomSheetBehavior = this.f20846f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.G(z9);
            }
            if (getWindow() != null && (qVar = this.f20854o) != null) {
                boolean z10 = this.j;
                View view = (View) qVar.f23878c;
                y5.c cVar = (y5.c) qVar.f23876a;
                if (z10) {
                    if (cVar != null) {
                        cVar.b((y5.b) qVar.f23877b, view, false);
                    }
                } else if (cVar != null) {
                    cVar.c(view);
                }
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z9) {
        super.setCanceledOnTouchOutside(z9);
        if (z9 && !this.j) {
            this.j = true;
        }
        this.f20850k = z9;
        this.f20851l = true;
    }

    @Override // i.y, d.DialogC1072m, android.app.Dialog
    public final void setContentView(int i9) {
        super.setContentView(g(null, i9, null));
    }

    @Override // i.y, d.DialogC1072m, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(g(view, 0, null));
    }

    @Override // i.y, d.DialogC1072m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(g(view, 0, layoutParams));
    }
}
