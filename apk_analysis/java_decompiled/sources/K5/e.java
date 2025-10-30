package K5;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import co.notix.R;
import com.google.android.material.internal.CheckableImageButton;
import h5.AbstractC1281a;

/* loaded from: classes.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    public final int f4320e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4321f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f4322g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f4323h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f4324i;
    public final ViewOnClickListenerC0215a j;

    /* renamed from: k, reason: collision with root package name */
    public final ViewOnFocusChangeListenerC0216b f4325k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f4326l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f4327m;

    public e(q qVar) {
        super(qVar);
        this.j = new ViewOnClickListenerC0215a(0, this);
        this.f4325k = new ViewOnFocusChangeListenerC0216b(this, 0);
        this.f4320e = Z0.a.y(qVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f4321f = Z0.a.y(qVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f4322g = Z0.a.z(qVar.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1281a.f17925a);
        this.f4323h = Z0.a.z(qVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1281a.f17928d);
    }

    @Override // K5.r
    public final void a() {
        if (this.f4379b.f4371p != null) {
            return;
        }
        t(u());
    }

    @Override // K5.r
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // K5.r
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // K5.r
    public final View.OnFocusChangeListener e() {
        return this.f4325k;
    }

    @Override // K5.r
    public final View.OnClickListener f() {
        return this.j;
    }

    @Override // K5.r
    public final View.OnFocusChangeListener g() {
        return this.f4325k;
    }

    @Override // K5.r
    public final void m(EditText editText) {
        this.f4324i = editText;
        this.f4378a.setEndIconVisible(u());
    }

    @Override // K5.r
    public final void p(boolean z9) {
        if (this.f4379b.f4371p == null) {
            return;
        }
        t(z9);
    }

    @Override // K5.r
    public final void r() {
        final int i9 = 1;
        final int i10 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f4323h);
        ofFloat.setDuration(this.f4321f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K5.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f4317b;

            {
                this.f4317b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        e eVar = this.f4317b;
                        eVar.getClass();
                        eVar.f4381d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        e eVar2 = this.f4317b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.f4381d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f4322g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f4320e;
        ofFloat2.setDuration(i11);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K5.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f4317b;

            {
                this.f4317b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        e eVar = this.f4317b;
                        eVar.getClass();
                        eVar.f4381d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        e eVar2 = this.f4317b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.f4381d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4326l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f4326l.addListener(new C0218d(this, i10));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i11);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: K5.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f4317b;

            {
                this.f4317b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i10) {
                    case 0:
                        e eVar = this.f4317b;
                        eVar.getClass();
                        eVar.f4381d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    default:
                        e eVar2 = this.f4317b;
                        eVar2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = eVar2.f4381d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                }
            }
        });
        this.f4327m = ofFloat3;
        ofFloat3.addListener(new C0218d(this, i9));
    }

    @Override // K5.r
    public final void s() {
        EditText editText = this.f4324i;
        if (editText != null) {
            editText.post(new A6.s(4, this));
        }
    }

    public final void t(boolean z9) {
        boolean z10;
        if (this.f4379b.d() == z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && !this.f4326l.isRunning()) {
            this.f4327m.cancel();
            this.f4326l.start();
            if (z10) {
                this.f4326l.end();
                return;
            }
            return;
        }
        if (!z9) {
            this.f4326l.cancel();
            this.f4327m.start();
            if (z10) {
                this.f4327m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f4324i;
        if (editText != null) {
            if ((editText.hasFocus() || this.f4381d.hasFocus()) && this.f4324i.getText().length() > 0) {
                return true;
            }
            return false;
        }
        return false;
    }
}
