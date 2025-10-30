package G5;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class a extends v4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2863h;

    /* renamed from: i, reason: collision with root package name */
    public final SideSheetBehavior f2864i;

    public /* synthetic */ a(SideSheetBehavior sideSheetBehavior, int i9) {
        this.f2863h = i9;
        this.f2864i = sideSheetBehavior;
    }

    @Override // v4.e
    public final int A() {
        switch (this.f2863h) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // v4.e
    public final boolean E(float f9) {
        switch (this.f2863h) {
            case 0:
                return f9 > 0.0f;
            default:
                return f9 < 0.0f;
        }
    }

    @Override // v4.e
    public final boolean G(View view) {
        switch (this.f2863h) {
            case 0:
                if (view.getRight() < (r() - s()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (r() + this.f2864i.f16102m) / 2) {
                    return true;
                }
                return false;
        }
    }

    @Override // v4.e
    public final boolean H(float f9, float f10) {
        switch (this.f2863h) {
            case 0:
                if (Math.abs(f9) > Math.abs(f10)) {
                    float abs = Math.abs(f9);
                    this.f2864i.getClass();
                    if (abs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f9) > Math.abs(f10)) {
                    float abs2 = Math.abs(f9);
                    this.f2864i.getClass();
                    if (abs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // v4.e
    public final boolean M(View view, float f9) {
        switch (this.f2863h) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f2864i;
                float abs = Math.abs((f9 * sideSheetBehavior.f16100k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                    return true;
                }
                return false;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f2864i;
                float abs2 = Math.abs((f9 * sideSheetBehavior2.f16100k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                    return true;
                }
                return false;
        }
    }

    @Override // v4.e
    public final void W(ViewGroup.MarginLayoutParams marginLayoutParams, int i9) {
        switch (this.f2863h) {
            case 0:
                marginLayoutParams.leftMargin = i9;
                return;
            default:
                marginLayoutParams.rightMargin = i9;
                return;
        }
    }

    @Override // v4.e
    public final void X(ViewGroup.MarginLayoutParams marginLayoutParams, int i9, int i10) {
        switch (this.f2863h) {
            case 0:
                if (i9 <= this.f2864i.f16102m) {
                    marginLayoutParams.leftMargin = i10;
                    return;
                }
                return;
            default:
                int i11 = this.f2864i.f16102m;
                if (i9 <= i11) {
                    marginLayoutParams.rightMargin = i11 - i9;
                    return;
                }
                return;
        }
    }

    @Override // v4.e
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2863h) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // v4.e
    public final float d(int i9) {
        switch (this.f2863h) {
            case 0:
                float s9 = s();
                return (i9 - s9) / (r() - s9);
            default:
                float f9 = this.f2864i.f16102m;
                return (f9 - i9) / (f9 - r());
        }
    }

    @Override // v4.e
    public final int q(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2863h) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // v4.e
    public final int r() {
        switch (this.f2863h) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2864i;
                return Math.max(0, sideSheetBehavior.f16103n + sideSheetBehavior.f16104o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f2864i;
                return Math.max(0, (sideSheetBehavior2.f16102m - sideSheetBehavior2.f16101l) - sideSheetBehavior2.f16104o);
        }
    }

    @Override // v4.e
    public final int s() {
        switch (this.f2863h) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f2864i;
                return (-sideSheetBehavior.f16101l) - sideSheetBehavior.f16104o;
            default:
                return this.f2864i.f16102m;
        }
    }

    @Override // v4.e
    public final int t() {
        switch (this.f2863h) {
            case 0:
                return this.f2864i.f16104o;
            default:
                return this.f2864i.f16102m;
        }
    }

    @Override // v4.e
    public final int u() {
        switch (this.f2863h) {
            case 0:
                return -this.f2864i.f16101l;
            default:
                return r();
        }
    }

    @Override // v4.e
    public final int x(View view) {
        switch (this.f2863h) {
            case 0:
                return view.getRight() + this.f2864i.f16104o;
            default:
                return view.getLeft() - this.f2864i.f16104o;
        }
    }

    @Override // v4.e
    public final int y(CoordinatorLayout coordinatorLayout) {
        switch (this.f2863h) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }
}
