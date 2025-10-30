package F0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class G {

    /* renamed from: a, reason: collision with root package name */
    public int f2023a = -1;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f2024b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.recyclerview.widget.a f2025c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2026d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2027e;

    /* renamed from: f, reason: collision with root package name */
    public View f2028f;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f2029g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2030h;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f2031i;
    public final DecelerateInterpolator j;

    /* renamed from: k, reason: collision with root package name */
    public PointF f2032k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f2033l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2034m;

    /* renamed from: n, reason: collision with root package name */
    public float f2035n;

    /* renamed from: o, reason: collision with root package name */
    public int f2036o;

    /* renamed from: p, reason: collision with root package name */
    public int f2037p;

    /* JADX WARN: Type inference failed for: r1v0, types: [F0.l0, java.lang.Object] */
    public G(Context context) {
        ?? obj = new Object();
        obj.f2149d = -1;
        obj.f2151f = false;
        obj.f2152g = 0;
        obj.f2146a = 0;
        obj.f2147b = 0;
        obj.f2148c = Integer.MIN_VALUE;
        obj.f2150e = null;
        this.f2029g = obj;
        this.f2031i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.f2034m = false;
        this.f2036o = 0;
        this.f2037p = 0;
        this.f2033l = context.getResources().getDisplayMetrics();
    }

    public static int a(int i9, int i10, int i11, int i12, int i13) {
        if (i13 != -1) {
            if (i13 != 0) {
                if (i13 == 1) {
                    return i12 - i10;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i14 = i11 - i9;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i12 - i10;
            if (i15 < 0) {
                return i15;
            }
            return 0;
        }
        return i11 - i9;
    }

    public int b(View view, int i9) {
        androidx.recyclerview.widget.a aVar = this.f2025c;
        if (aVar != null && aVar.e()) {
            C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
            return a(androidx.recyclerview.widget.a.B(view) - ((ViewGroup.MarginLayoutParams) c0099c0).leftMargin, androidx.recyclerview.widget.a.E(view) + ((ViewGroup.MarginLayoutParams) c0099c0).rightMargin, aVar.I(), aVar.f10349n - aVar.J(), i9);
        }
        return 0;
    }

    public int c(View view, int i9) {
        androidx.recyclerview.widget.a aVar = this.f2025c;
        if (aVar != null && aVar.f()) {
            C0099c0 c0099c0 = (C0099c0) view.getLayoutParams();
            return a(androidx.recyclerview.widget.a.F(view) - ((ViewGroup.MarginLayoutParams) c0099c0).topMargin, androidx.recyclerview.widget.a.z(view) + ((ViewGroup.MarginLayoutParams) c0099c0).bottomMargin, aVar.K(), aVar.f10350o - aVar.H(), i9);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i9) {
        float abs = Math.abs(i9);
        if (!this.f2034m) {
            this.f2035n = d(this.f2033l);
            this.f2034m = true;
        }
        return (int) Math.ceil(abs * this.f2035n);
    }

    public PointF f(int i9) {
        Object obj = this.f2025c;
        if (obj instanceof m0) {
            return ((m0) obj).a(i9);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + m0.class.getCanonicalName());
        return null;
    }

    public final void g(int i9, int i10) {
        PointF f9;
        RecyclerView recyclerView = this.f2024b;
        int i11 = -1;
        if (this.f2023a == -1 || recyclerView == null) {
            i();
        }
        if (this.f2026d && this.f2028f == null && this.f2025c != null && (f9 = f(this.f2023a)) != null) {
            float f10 = f9.x;
            if (f10 != 0.0f || f9.y != 0.0f) {
                recyclerView.g0((int) Math.signum(f10), (int) Math.signum(f9.y), null);
            }
        }
        boolean z9 = false;
        this.f2026d = false;
        View view = this.f2028f;
        l0 l0Var = this.f2029g;
        if (view != null) {
            this.f2024b.getClass();
            r0 N8 = RecyclerView.N(view);
            if (N8 != null) {
                i11 = N8.c();
            }
            if (i11 == this.f2023a) {
                View view2 = this.f2028f;
                n0 n0Var = recyclerView.f10250F0;
                h(view2, l0Var);
                l0Var.a(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f2028f = null;
            }
        }
        if (this.f2027e) {
            n0 n0Var2 = recyclerView.f10250F0;
            if (this.f2024b.f10291n.w() == 0) {
                i();
            } else {
                int i12 = this.f2036o;
                int i13 = i12 - i9;
                if (i12 * i13 <= 0) {
                    i13 = 0;
                }
                this.f2036o = i13;
                int i14 = this.f2037p;
                int i15 = i14 - i10;
                if (i14 * i15 <= 0) {
                    i15 = 0;
                }
                this.f2037p = i15;
                if (i13 == 0 && i15 == 0) {
                    PointF f11 = f(this.f2023a);
                    if (f11 != null) {
                        if (f11.x != 0.0f || f11.y != 0.0f) {
                            float f12 = f11.y;
                            float sqrt = (float) Math.sqrt((f12 * f12) + (r10 * r10));
                            float f13 = f11.x / sqrt;
                            f11.x = f13;
                            float f14 = f11.y / sqrt;
                            f11.y = f14;
                            this.f2032k = f11;
                            this.f2036o = (int) (f13 * 10000.0f);
                            this.f2037p = (int) (f14 * 10000.0f);
                            int e8 = e(10000);
                            LinearInterpolator linearInterpolator = this.f2031i;
                            l0Var.f2146a = (int) (this.f2036o * 1.2f);
                            l0Var.f2147b = (int) (this.f2037p * 1.2f);
                            l0Var.f2148c = (int) (e8 * 1.2f);
                            l0Var.f2150e = linearInterpolator;
                            l0Var.f2151f = true;
                        }
                    }
                    l0Var.f2149d = this.f2023a;
                    i();
                }
            }
            if (l0Var.f2149d >= 0) {
                z9 = true;
            }
            l0Var.a(recyclerView);
            if (z9 && this.f2027e) {
                this.f2026d = true;
                recyclerView.f10246C0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.view.View r7, F0.l0 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.f2032k
            r1 = 1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r1
            goto L16
        L13:
            r0 = r3
            goto L16
        L15:
            r0 = r2
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.f2032k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r2 = r1
            goto L2a
        L29:
            r2 = r3
        L2a:
            int r7 = r6.c(r7, r2)
            int r2 = r0 * r0
            int r3 = r7 * r7
            int r3 = r3 + r2
            double r2 = (double) r3
            double r2 = java.lang.Math.sqrt(r2)
            int r2 = (int) r2
            int r2 = r6.e(r2)
            double r2 = (double) r2
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r2 = r2 / r4
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            if (r2 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            android.view.animation.DecelerateInterpolator r3 = r6.j
            r8.f2146a = r0
            r8.f2147b = r7
            r8.f2148c = r2
            r8.f2150e = r3
            r8.f2151f = r1
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.G.h(android.view.View, F0.l0):void");
    }

    public final void i() {
        if (!this.f2027e) {
            return;
        }
        this.f2027e = false;
        this.f2037p = 0;
        this.f2036o = 0;
        this.f2032k = null;
        this.f2024b.f10250F0.f2164a = -1;
        this.f2028f = null;
        this.f2023a = -1;
        this.f2026d = false;
        androidx.recyclerview.widget.a aVar = this.f2025c;
        if (aVar.f10341e == this) {
            aVar.f10341e = null;
        }
        this.f2025c = null;
        this.f2024b = null;
    }
}
