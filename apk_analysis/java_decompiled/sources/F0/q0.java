package F0;

import android.os.Build;
import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f2199a;

    /* renamed from: b, reason: collision with root package name */
    public int f2200b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f2201c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f2202d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2203e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f2205g;

    public q0(RecyclerView recyclerView) {
        this.f2205g = recyclerView;
        O o9 = RecyclerView.f10239h1;
        this.f2202d = o9;
        this.f2203e = false;
        this.f2204f = false;
        this.f2201c = new OverScroller(recyclerView.getContext(), o9);
    }

    public final void a(int i9, int i10) {
        RecyclerView recyclerView = this.f2205g;
        recyclerView.setScrollState(2);
        this.f2200b = 0;
        this.f2199a = 0;
        Interpolator interpolator = this.f2202d;
        O o9 = RecyclerView.f10239h1;
        if (interpolator != o9) {
            this.f2202d = o9;
            this.f2201c = new OverScroller(recyclerView.getContext(), o9);
        }
        this.f2201c.fling(0, 0, i9, i10, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.f2203e) {
            this.f2204f = true;
            return;
        }
        RecyclerView recyclerView = this.f2205g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = P.Q.f5546a;
        recyclerView.postOnAnimation(this);
    }

    public final void c(int i9, int i10, int i11, BaseInterpolator baseInterpolator) {
        boolean z9;
        int height;
        RecyclerView recyclerView = this.f2205g;
        if (i11 == Integer.MIN_VALUE) {
            int abs = Math.abs(i9);
            int abs2 = Math.abs(i10);
            if (abs > abs2) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z9) {
                abs = abs2;
            }
            i11 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i12 = i11;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f10239h1;
        }
        if (this.f2202d != interpolator) {
            this.f2202d = interpolator;
            this.f2201c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f2200b = 0;
        this.f2199a = 0;
        recyclerView.setScrollState(2);
        this.f2201c.startScroll(0, 0, i9, i10, i12);
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i9;
        int i10;
        int i11;
        int i12;
        boolean awakenScrollBars;
        boolean z9;
        boolean z10;
        boolean z11;
        int i13;
        RecyclerView recyclerView = this.f2205g;
        if (recyclerView.f10291n == null) {
            recyclerView.removeCallbacks(this);
            this.f2201c.abortAnimation();
            return;
        }
        this.f2204f = false;
        this.f2203e = true;
        recyclerView.p();
        OverScroller overScroller = this.f2201c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i14 = currX - this.f2199a;
            int i15 = currY - this.f2200b;
            this.f2199a = currX;
            this.f2200b = currY;
            int o9 = RecyclerView.o(i14, recyclerView.f10284j0, recyclerView.f10288l0, recyclerView.getWidth());
            int o10 = RecyclerView.o(i15, recyclerView.f10286k0, recyclerView.f10290m0, recyclerView.getHeight());
            int[] iArr = recyclerView.f10262R0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean v8 = recyclerView.v(o9, o10, 1, iArr, null);
            int[] iArr2 = recyclerView.f10262R0;
            if (v8) {
                o9 -= iArr2[0];
                o10 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o9, o10);
            }
            if (recyclerView.f10289m != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.g0(o9, o10, iArr2);
                int i16 = iArr2[0];
                int i17 = iArr2[1];
                int i18 = o9 - i16;
                int i19 = o10 - i17;
                G g9 = recyclerView.f10291n.f10341e;
                if (g9 != null && !g9.f2026d && g9.f2027e) {
                    int b9 = recyclerView.f10250F0.b();
                    if (b9 == 0) {
                        g9.i();
                    } else if (g9.f2023a >= b9) {
                        g9.f2023a = b9 - 1;
                        g9.g(i16, i17);
                    } else {
                        g9.g(i16, i17);
                    }
                }
                i9 = i18;
                i11 = i16;
                i10 = i19;
                i12 = i17;
            } else {
                i9 = o9;
                i10 = o10;
                i11 = 0;
                i12 = 0;
            }
            if (!recyclerView.f10295p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f10262R0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            recyclerView.w(i11, i12, i9, i10, null, 1, iArr3);
            int i20 = i9 - iArr2[0];
            int i21 = i10 - iArr2[1];
            if (i11 != 0 || i12 != 0) {
                recyclerView.x(i11, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!overScroller.isFinished() && ((!z9 && i20 == 0) || (!z10 && i21 == 0))) {
                z11 = false;
            } else {
                z11 = true;
            }
            G g10 = recyclerView.f10291n.f10341e;
            if ((g10 == null || !g10.f2026d) && z11) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i20 < 0) {
                        i13 = -currVelocity;
                    } else if (i20 > 0) {
                        i13 = currVelocity;
                    } else {
                        i13 = 0;
                    }
                    if (i21 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i21 <= 0) {
                        currVelocity = 0;
                    }
                    if (i13 < 0) {
                        recyclerView.z();
                        if (recyclerView.f10284j0.isFinished()) {
                            recyclerView.f10284j0.onAbsorb(-i13);
                        }
                    } else if (i13 > 0) {
                        recyclerView.A();
                        if (recyclerView.f10288l0.isFinished()) {
                            recyclerView.f10288l0.onAbsorb(i13);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.B();
                        if (recyclerView.f10286k0.isFinished()) {
                            recyclerView.f10286k0.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.y();
                        if (recyclerView.f10290m0.isFinished()) {
                            recyclerView.f10290m0.onAbsorb(currVelocity);
                        }
                    }
                    if (i13 != 0 || currVelocity != 0) {
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.f10237f1) {
                    C0120y c0120y = recyclerView.f10249E0;
                    int[] iArr4 = (int[]) c0120y.f2293e;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0120y.f2292d = 0;
                }
            } else {
                b();
                A a5 = recyclerView.f10248D0;
                if (a5 != null) {
                    a5.a(recyclerView, i11, i12);
                }
            }
            if (Build.VERSION.SDK_INT >= 35) {
                V.a(recyclerView, Math.abs(overScroller.getCurrVelocity()));
            }
        }
        G g11 = recyclerView.f10291n.f10341e;
        if (g11 != null && g11.f2026d) {
            g11.g(0, 0);
        }
        this.f2203e = false;
        if (this.f2204f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap = P.Q.f5546a;
            recyclerView.postOnAnimation(this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.o0(1);
        }
    }
}
