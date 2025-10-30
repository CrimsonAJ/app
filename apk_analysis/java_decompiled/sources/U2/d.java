package U2;

import F0.C0118w;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import co.notix.R;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7290a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7291b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7292c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7293d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7294e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7295f;

    /* renamed from: g, reason: collision with root package name */
    public Animator f7296g;

    /* renamed from: h, reason: collision with root package name */
    public ValueAnimator f7297h;

    public static float c(FrameLayout frameLayout, T2.d dVar) {
        return ((frameLayout.getWidth() / 2.0f) + frameLayout.getX()) - (dVar.getThumbOffset() / 2.0f);
    }

    public static float d(T2.d dVar, float f9) {
        float thumbOffset = dVar.getThumbOffset();
        float left = dVar.getLeft() + thumbOffset;
        return ((((dVar.getRight() - thumbOffset) - left) * f9) + left) - (thumbOffset / 2.0f);
    }

    public static float e(T2.d dVar) {
        if (dVar.getMax() == 0) {
            return 0.0f;
        }
        return dVar.getProgress() / dVar.getMax();
    }

    public static View f(FrameLayout frameLayout, T2.d dVar) {
        ViewGroup viewGroup = (ViewGroup) frameLayout.getParent();
        View findViewById = viewGroup.findViewById(R.id.previewSeekBarMorphViewId);
        if (findViewById != null) {
            return findViewById;
        }
        View view = new View(frameLayout.getContext());
        view.setVisibility(4);
        view.setBackgroundResource(R.drawable.previewseekbar_morph);
        view.setId(R.id.previewSeekBarMorphViewId);
        viewGroup.addView(view, new ViewGroup.LayoutParams(dVar.getThumbOffset(), dVar.getThumbOffset()));
        return view;
    }

    public static View g(FrameLayout frameLayout) {
        View findViewById = frameLayout.findViewById(R.id.previewSeekBarOverlayViewId);
        if (findViewById != null) {
            return findViewById;
        }
        View view = new View(frameLayout.getContext());
        view.setVisibility(4);
        view.setId(R.id.previewSeekBarOverlayViewId);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return view;
    }

    public static void j(T2.d dVar, View view, View view2) {
        int scrubberColor = dVar.getScrubberColor();
        if (view.getBackgroundTintList() != null && view.getBackgroundTintList().getDefaultColor() == scrubberColor) {
            return;
        }
        Drawable background = view.getBackground();
        background.setTint(scrubberColor);
        view.setBackground(background);
        view2.setBackgroundColor(scrubberColor);
    }

    public final void a(View view, float f9) {
        ValueAnimator valueAnimator = this.f7297h;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f7297h.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getX(), f9);
        this.f7297h = ofFloat;
        ofFloat.addUpdateListener(new C0118w(4, view));
        this.f7297h.setDuration(100L);
        this.f7297h.setInterpolator(new AccelerateInterpolator());
        this.f7297h.start();
    }

    public final void b(FrameLayout frameLayout, View view, View view2) {
        Animator animator = this.f7296g;
        if (animator != null) {
            animator.removeAllListeners();
            this.f7296g.cancel();
            this.f7296g = null;
        }
        ValueAnimator valueAnimator = this.f7297h;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.f7297h.cancel();
            this.f7297h = null;
        }
        frameLayout.animate().setListener(null);
        frameLayout.animate().cancel();
        view.animate().setListener(null);
        view.animate().cancel();
        view2.animate().setListener(null);
        view2.animate().cancel();
    }

    public final void h(FrameLayout frameLayout, View view, View view2) {
        this.f7294e = true;
        Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(frameLayout, frameLayout.getWidth() / 2, frameLayout.getHeight() / 2, frameLayout.getHeight() / 2.0f, (float) Math.hypot(frameLayout.getWidth() / 2.0f, frameLayout.getHeight() / 2.0f));
        this.f7296g = createCircularReveal;
        createCircularReveal.setTarget(frameLayout);
        this.f7296g.setInterpolator(new AccelerateInterpolator());
        this.f7296g.setDuration(125L);
        this.f7296g.addListener(new b(this, view, 0));
        this.f7296g.start();
        frameLayout.setVisibility(0);
        view.setVisibility(0);
        view2.setVisibility(4);
        view.animate().alpha(0.0f).setDuration(62L);
    }

    public final void i(FrameLayout frameLayout, T2.d dVar, View view, View view2) {
        this.f7293d = true;
        view.setVisibility(4);
        frameLayout.setVisibility(4);
        view2.setVisibility(0);
        a(view2, d(dVar, e(dVar)));
        view2.animate().y(dVar.getY() + dVar.getThumbOffset()).scaleY(0.0f).scaleX(0.0f).setDuration(100L).setInterpolator(new AccelerateInterpolator()).setListener(new b(this, view2, 1)).start();
    }
}
