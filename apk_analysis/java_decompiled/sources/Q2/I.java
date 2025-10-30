package Q2;

import K5.ViewOnClickListenerC0215a;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import co.notix.R;
import com.anilab.android.ui.views.FreakIntroButton;
import g2.C1202D;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: A, reason: collision with root package name */
    public boolean f6128A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6129B;

    /* renamed from: a, reason: collision with root package name */
    public final D f6131a;

    /* renamed from: b, reason: collision with root package name */
    public final View f6132b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f6133c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f6134d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f6135e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f6136f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f6137g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f6138h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f6139i;
    public final View j;

    /* renamed from: k, reason: collision with root package name */
    public final View f6140k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f6141l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f6142m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f6143n;

    /* renamed from: o, reason: collision with root package name */
    public final AnimatorSet f6144o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f6145p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f6146q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f6147r;

    /* renamed from: s, reason: collision with root package name */
    public final E f6148s = new E(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final E f6149t = new E(this, 3);

    /* renamed from: u, reason: collision with root package name */
    public final E f6150u = new E(this, 4);

    /* renamed from: v, reason: collision with root package name */
    public final E f6151v = new E(this, 5);

    /* renamed from: w, reason: collision with root package name */
    public final E f6152w = new E(this, 6);

    /* renamed from: x, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC0371n f6153x = new ViewOnLayoutChangeListenerC0371n(1, this);

    /* renamed from: C, reason: collision with root package name */
    public boolean f6130C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f6155z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f6154y = new ArrayList();

    public I(D d9) {
        int i9 = 9;
        final int i10 = 2;
        this.f6131a = d9;
        final int i11 = 0;
        final int i12 = 3;
        final int i13 = 1;
        this.f6132b = d9.findViewById(R.id.exo_controls_background);
        this.f6133c = (ViewGroup) d9.findViewById(R.id.exo_center_controls);
        this.f6135e = (ViewGroup) d9.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) d9.findViewById(R.id.exo_bottom_bar);
        this.f6134d = viewGroup;
        this.f6139i = (ViewGroup) d9.findViewById(R.id.exo_time);
        View findViewById = d9.findViewById(R.id.exo_progress);
        this.j = findViewById;
        this.f6136f = (ViewGroup) d9.findViewById(R.id.exo_basic_controls);
        this.f6137g = (ViewGroup) d9.findViewById(R.id.exo_extra_controls);
        this.f6138h = (ViewGroup) d9.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = d9.findViewById(R.id.exo_overflow_show);
        this.f6140k = findViewById2;
        View findViewById3 = d9.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new ViewOnClickListenerC0215a(i9, this));
            findViewById3.setOnClickListener(new ViewOnClickListenerC0215a(i9, this));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Q2.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f6122b;

            {
                this.f6122b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i12) {
                    case 0:
                        I i14 = this.f6122b;
                        i14.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = i14.f6132b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = i14.f6133c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = i14.f6135e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        I i15 = this.f6122b;
                        i15.getClass();
                        i15.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        I i16 = this.f6122b;
                        i16.getClass();
                        i16.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        I i17 = this.f6122b;
                        i17.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = i17.f6132b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = i17.f6133c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = i17.f6135e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat.addListener(new G(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Q2.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f6122b;

            {
                this.f6122b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        I i14 = this.f6122b;
                        i14.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = i14.f6132b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = i14.f6133c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = i14.f6135e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        I i15 = this.f6122b;
                        i15.getClass();
                        i15.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        I i16 = this.f6122b;
                        i16.getClass();
                        i16.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        I i17 = this.f6122b;
                        i17.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = i17.f6132b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = i17.f6133c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = i17.f6135e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat2.addListener(new G(this, 1));
        Resources resources = d9.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f6141l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new H(this, d9, i11));
        animatorSet.play(ofFloat).with(d(findViewById, 0.0f, dimension)).with(d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f6142m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new H(this, d9, i13));
        animatorSet2.play(d(findViewById, dimension, dimension2)).with(d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f6143n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new H(this, d9, i10));
        animatorSet3.play(ofFloat).with(d(findViewById, 0.0f, dimension2)).with(d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f6144o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new G(this, 2));
        animatorSet4.play(ofFloat2).with(d(findViewById, dimension, 0.0f)).with(d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f6145p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new G(this, 3));
        animatorSet5.play(ofFloat2).with(d(findViewById, dimension2, 0.0f)).with(d(viewGroup, dimension2, 0.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f6146q = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Q2.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f6122b;

            {
                this.f6122b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i13) {
                    case 0:
                        I i14 = this.f6122b;
                        i14.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = i14.f6132b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = i14.f6133c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = i14.f6135e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        I i15 = this.f6122b;
                        i15.getClass();
                        i15.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        I i16 = this.f6122b;
                        i16.getClass();
                        i16.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        I i17 = this.f6122b;
                        i17.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = i17.f6132b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = i17.f6133c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = i17.f6135e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat3.addListener(new G(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f6147r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: Q2.F

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ I f6122b;

            {
                this.f6122b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        I i14 = this.f6122b;
                        i14.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = i14.f6132b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = i14.f6133c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = i14.f6135e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    case 1:
                        I i15 = this.f6122b;
                        i15.getClass();
                        i15.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        I i16 = this.f6122b;
                        i16.getClass();
                        i16.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        I i17 = this.f6122b;
                        i17.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = i17.f6132b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = i17.f6133c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = i17.f6135e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat4.addListener(new G(this, 5));
    }

    public static int c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
        }
        return width;
    }

    public static ObjectAnimator d(View view, float f9, float f10) {
        return ObjectAnimator.ofFloat(view, "translationY", f9, f10);
    }

    public static boolean j(View view) {
        int id = view.getId();
        if (id != R.id.exo_bottom_bar && id != R.id.exo_prev && id != R.id.exo_next && id != R.id.exo_rew && id != R.id.exo_rew_with_amount && id != R.id.exo_ffwd && id != R.id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    public final void a(float f9) {
        ViewGroup viewGroup = this.f6138h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f9) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f6139i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f9);
        }
        ViewGroup viewGroup3 = this.f6136f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f9);
        }
    }

    public final boolean b(View view) {
        if (view != null && this.f6154y.contains(view)) {
            return true;
        }
        return false;
    }

    public final void e(Runnable runnable, long j) {
        if (j >= 0) {
            this.f6131a.postDelayed(runnable, j);
        }
    }

    public final void f() {
        E e8 = this.f6152w;
        D d9 = this.f6131a;
        d9.removeCallbacks(e8);
        d9.removeCallbacks(this.f6149t);
        d9.removeCallbacks(this.f6151v);
        d9.removeCallbacks(this.f6150u);
    }

    public final void g() {
        if (this.f6155z != 3) {
            f();
            int showTimeoutMs = this.f6131a.getShowTimeoutMs();
            if (showTimeoutMs > 0) {
                if (!this.f6130C) {
                    e(this.f6152w, showTimeoutMs);
                } else if (this.f6155z == 1) {
                    e(this.f6150u, 2000L);
                } else {
                    e(this.f6151v, showTimeoutMs);
                }
            }
        }
    }

    public final void h(View view, boolean z9) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f6154y;
        if (!z9) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f6128A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i9) {
        int i10 = this.f6155z;
        this.f6155z = i9;
        D d9 = this.f6131a;
        if (i9 == 2) {
            d9.setVisibility(8);
        } else if (i10 == 2) {
            d9.setVisibility(0);
        }
        InterfaceC0362e controlAction = d9.getControlAction();
        if (controlAction != null && i10 != i9) {
            if (i9 != 4 && i9 != 0) {
                if (i9 == 3 || i9 == 2) {
                    C1202D c1202d = (C1202D) controlAction;
                    FreakIntroButton freakIntroButton = c1202d.f17564b.f13817v0;
                    if (freakIntroButton != null && freakIntroButton.getTranslationY() == (-c1202d.f17563a)) {
                        freakIntroButton.animate().translationY(0.0f).setDuration(200L).start();
                    }
                }
            } else {
                C1202D c1202d2 = (C1202D) controlAction;
                FreakIntroButton freakIntroButton2 = c1202d2.f17564b.f13817v0;
                if (freakIntroButton2 != null && freakIntroButton2.getTranslationY() == 0.0f) {
                    freakIntroButton2.animate().translationY(-c1202d2.f17563a).setDuration(200L).start();
                }
            }
        }
        if (i10 != i9) {
            Iterator it = d9.f6076c.iterator();
            while (it.hasNext()) {
                C c3 = (C) it.next();
                d9.getVisibility();
                K k5 = (K) c3;
                k5.getClass();
                k5.f6159c.j();
            }
        }
    }

    public final void k() {
        if (!this.f6130C) {
            i(0);
            g();
            return;
        }
        int i9 = this.f6155z;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 == 4) {
                        return;
                    }
                } else {
                    this.f6129B = true;
                }
            } else {
                this.f6145p.start();
            }
        } else {
            this.f6144o.start();
        }
        g();
    }
}
