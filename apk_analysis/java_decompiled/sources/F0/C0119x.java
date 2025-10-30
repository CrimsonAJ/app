package F0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: F0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0119x extends AbstractC0095a0 {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f2256C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f2257D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f2258A;

    /* renamed from: B, reason: collision with root package name */
    public final A4.e f2259B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2260a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2261b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2262c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f2263d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2264e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2265f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2266g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f2267h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2268i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public int f2269k;

    /* renamed from: l, reason: collision with root package name */
    public int f2270l;

    /* renamed from: m, reason: collision with root package name */
    public float f2271m;

    /* renamed from: n, reason: collision with root package name */
    public int f2272n;

    /* renamed from: o, reason: collision with root package name */
    public int f2273o;

    /* renamed from: p, reason: collision with root package name */
    public float f2274p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f2277s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2284z;

    /* renamed from: q, reason: collision with root package name */
    public int f2275q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2276r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2278t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2279u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f2280v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f2281w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f2282x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f2283y = new int[2];

    public C0119x(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i9, int i10, int i11) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f2284z = ofFloat;
        this.f2258A = 0;
        A4.e eVar = new A4.e(4, this);
        this.f2259B = eVar;
        C0116u c0116u = new C0116u(this);
        this.f2262c = stateListDrawable;
        this.f2263d = drawable;
        this.f2266g = stateListDrawable2;
        this.f2267h = drawable2;
        this.f2264e = Math.max(i9, stateListDrawable.getIntrinsicWidth());
        this.f2265f = Math.max(i9, drawable.getIntrinsicWidth());
        this.f2268i = Math.max(i9, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i9, drawable2.getIntrinsicWidth());
        this.f2260a = i10;
        this.f2261b = i11;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C0117v(this));
        ofFloat.addUpdateListener(new C0118w(0, this));
        RecyclerView recyclerView2 = this.f2277s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                androidx.recyclerview.widget.a aVar = recyclerView2.f10291n;
                if (aVar != null) {
                    aVar.c("Cannot remove item decoration during a scroll  or layout");
                }
                ArrayList arrayList = recyclerView2.f10295p;
                arrayList.remove(this);
                if (arrayList.isEmpty()) {
                    recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
                }
                recyclerView2.S();
                recyclerView2.requestLayout();
                RecyclerView recyclerView3 = this.f2277s;
                recyclerView3.f10297q.remove(this);
                if (recyclerView3.f10299r == this) {
                    recyclerView3.f10299r = null;
                }
                ArrayList arrayList2 = this.f2277s.f10252H0;
                if (arrayList2 != null) {
                    arrayList2.remove(c0116u);
                }
                this.f2277s.removeCallbacks(eVar);
            }
            this.f2277s = recyclerView;
            if (recyclerView != null) {
                recyclerView.i(this);
                this.f2277s.f10297q.add(this);
                this.f2277s.j(c0116u);
            }
        }
    }

    public static int e(float f9, float f10, int[] iArr, int i9, int i10, int i11) {
        int i12 = iArr[1] - iArr[0];
        if (i12 != 0) {
            int i13 = i9 - i11;
            int i14 = (int) (((f10 - f9) / i12) * i13);
            int i15 = i10 + i14;
            if (i15 < i13 && i15 >= 0) {
                return i14;
            }
        }
        return 0;
    }

    @Override // F0.AbstractC0095a0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        if (this.f2275q == this.f2277s.getWidth() && this.f2276r == this.f2277s.getHeight()) {
            if (this.f2258A != 0) {
                if (this.f2278t) {
                    int i9 = this.f2275q;
                    int i10 = this.f2264e;
                    int i11 = i9 - i10;
                    int i12 = this.f2270l;
                    int i13 = this.f2269k;
                    int i14 = i12 - (i13 / 2);
                    StateListDrawable stateListDrawable = this.f2262c;
                    stateListDrawable.setBounds(0, 0, i10, i13);
                    int i15 = this.f2276r;
                    int i16 = this.f2265f;
                    Drawable drawable = this.f2263d;
                    drawable.setBounds(0, 0, i16, i15);
                    if (this.f2277s.getLayoutDirection() == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i10, i14);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i10, -i14);
                    } else {
                        canvas.translate(i11, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i14);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i11, -i14);
                    }
                }
                if (this.f2279u) {
                    int i17 = this.f2276r;
                    int i18 = this.f2268i;
                    int i19 = i17 - i18;
                    int i20 = this.f2273o;
                    int i21 = this.f2272n;
                    int i22 = i20 - (i21 / 2);
                    StateListDrawable stateListDrawable2 = this.f2266g;
                    stateListDrawable2.setBounds(0, 0, i21, i18);
                    int i23 = this.f2275q;
                    int i24 = this.j;
                    Drawable drawable2 = this.f2267h;
                    drawable2.setBounds(0, 0, i23, i24);
                    canvas.translate(0.0f, i19);
                    drawable2.draw(canvas);
                    canvas.translate(i22, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i22, -i19);
                    return;
                }
                return;
            }
            return;
        }
        this.f2275q = this.f2277s.getWidth();
        this.f2276r = this.f2277s.getHeight();
        f(0);
    }

    public final boolean c(float f9, float f10) {
        if (f10 >= this.f2276r - this.f2268i) {
            int i9 = this.f2273o;
            int i10 = this.f2272n;
            if (f9 >= i9 - (i10 / 2) && f9 <= (i10 / 2) + i9) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d(float f9, float f10) {
        boolean z9;
        if (this.f2277s.getLayoutDirection() == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i9 = this.f2264e;
        if (!z9 ? f9 >= this.f2275q - i9 : f9 <= i9) {
            int i10 = this.f2270l;
            int i11 = this.f2269k / 2;
            if (f10 >= i10 - i11 && f10 <= i11 + i10) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i9) {
        A4.e eVar = this.f2259B;
        StateListDrawable stateListDrawable = this.f2262c;
        if (i9 == 2 && this.f2280v != 2) {
            stateListDrawable.setState(f2256C);
            this.f2277s.removeCallbacks(eVar);
        }
        if (i9 == 0) {
            this.f2277s.invalidate();
        } else {
            g();
        }
        if (this.f2280v == 2 && i9 != 2) {
            stateListDrawable.setState(f2257D);
            this.f2277s.removeCallbacks(eVar);
            this.f2277s.postDelayed(eVar, 1200);
        } else if (i9 == 1) {
            this.f2277s.removeCallbacks(eVar);
            this.f2277s.postDelayed(eVar, 1500);
        }
        this.f2280v = i9;
    }

    public final void g() {
        int i9 = this.f2258A;
        ValueAnimator valueAnimator = this.f2284z;
        if (i9 != 0) {
            if (i9 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f2258A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
