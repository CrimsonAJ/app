package K5;

import P.Q;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.textfield.TextInputLayout;
import h5.AbstractC1281a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f4389A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f4390B;

    /* renamed from: a, reason: collision with root package name */
    public final int f4391a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4392b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4393c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f4394d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f4395e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f4396f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f4397g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f4398h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f4399i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f4400k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f4401l;

    /* renamed from: m, reason: collision with root package name */
    public final float f4402m;

    /* renamed from: n, reason: collision with root package name */
    public int f4403n;

    /* renamed from: o, reason: collision with root package name */
    public int f4404o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f4405p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4406q;

    /* renamed from: r, reason: collision with root package name */
    public AppCompatTextView f4407r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f4408s;

    /* renamed from: t, reason: collision with root package name */
    public int f4409t;

    /* renamed from: u, reason: collision with root package name */
    public int f4410u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f4411v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f4412w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4413x;

    /* renamed from: y, reason: collision with root package name */
    public AppCompatTextView f4414y;

    /* renamed from: z, reason: collision with root package name */
    public int f4415z;

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f4397g = context;
        this.f4398h = textInputLayout;
        this.f4402m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f4391a = Z0.a.y(context, R.attr.motionDurationShort4, 217);
        this.f4392b = Z0.a.y(context, R.attr.motionDurationMedium4, 167);
        this.f4393c = Z0.a.y(context, R.attr.motionDurationShort4, 167);
        this.f4394d = Z0.a.z(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC1281a.f17928d);
        LinearInterpolator linearInterpolator = AbstractC1281a.f17925a;
        this.f4395e = Z0.a.z(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f4396f = Z0.a.z(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(AppCompatTextView appCompatTextView, int i9) {
        if (this.f4399i == null && this.f4400k == null) {
            Context context = this.f4397g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f4399i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f4399i;
            TextInputLayout textInputLayout = this.f4398h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f4400k = new FrameLayout(context);
            this.f4399i.addView(this.f4400k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i9 != 0 && i9 != 1) {
            this.f4399i.addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
        } else {
            this.f4400k.setVisibility(0);
            this.f4400k.addView(appCompatTextView);
        }
        this.f4399i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        if (this.f4399i != null) {
            TextInputLayout textInputLayout = this.f4398h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f4397g;
                boolean C8 = D1.C(context);
                LinearLayout linearLayout = this.f4399i;
                WeakHashMap weakHashMap = Q.f5546a;
                int paddingStart = editText.getPaddingStart();
                if (C8) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (C8) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (C8) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f4401l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z9, AppCompatTextView appCompatTextView, int i9, int i10, int i11) {
        boolean z10;
        float f9;
        long j;
        TimeInterpolator timeInterpolator;
        if (appCompatTextView != null && z9) {
            if (i9 == i11 || i9 == i10) {
                if (i11 == i9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.ALPHA, f9);
                int i12 = this.f4393c;
                if (z10) {
                    j = this.f4392b;
                } else {
                    j = i12;
                }
                ofFloat.setDuration(j);
                if (z10) {
                    timeInterpolator = this.f4395e;
                } else {
                    timeInterpolator = this.f4396f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i9 == i11 && i10 != 0) {
                    ofFloat.setStartDelay(i12);
                }
                arrayList.add(ofFloat);
                if (i11 == i9 && i10 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(appCompatTextView, (Property<AppCompatTextView, Float>) View.TRANSLATION_Y, -this.f4402m, 0.0f);
                    ofFloat2.setDuration(this.f4391a);
                    ofFloat2.setInterpolator(this.f4394d);
                    ofFloat2.setStartDelay(i12);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                return null;
            }
            return this.f4414y;
        }
        return this.f4407r;
    }

    public final void f() {
        this.f4405p = null;
        c();
        if (this.f4403n == 1) {
            if (this.f4413x && !TextUtils.isEmpty(this.f4412w)) {
                this.f4404o = 2;
            } else {
                this.f4404o = 0;
            }
        }
        i(this.f4403n, this.f4404o, h(this.f4407r, ""));
    }

    public final void g(AppCompatTextView appCompatTextView, int i9) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f4399i;
        if (linearLayout != null) {
            if ((i9 == 0 || i9 == 1) && (frameLayout = this.f4400k) != null) {
                frameLayout.removeView(appCompatTextView);
            } else {
                linearLayout.removeView(appCompatTextView);
            }
            int i10 = this.j - 1;
            this.j = i10;
            LinearLayout linearLayout2 = this.f4399i;
            if (i10 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    public final boolean h(AppCompatTextView appCompatTextView, CharSequence charSequence) {
        WeakHashMap weakHashMap = Q.f5546a;
        TextInputLayout textInputLayout = this.f4398h;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            if (this.f4404o != this.f4403n || appCompatTextView == null || !TextUtils.equals(appCompatTextView.getText(), charSequence)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(int i9, int i10, boolean z9) {
        TextView e8;
        TextView e9;
        u uVar = this;
        if (i9 == i10) {
            return;
        }
        if (z9) {
            AnimatorSet animatorSet = new AnimatorSet();
            uVar.f4401l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar.d(arrayList, uVar.f4413x, uVar.f4414y, 2, i9, i10);
            uVar.d(arrayList, uVar.f4406q, uVar.f4407r, 1, i9, i10);
            int size = arrayList.size();
            long j = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Animator animator = (Animator) arrayList.get(i11);
                j = Math.max(j, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            s sVar = new s(this, i10, e(i9), i9, uVar.e(i10));
            uVar = this;
            animatorSet.addListener(sVar);
            animatorSet.start();
        } else if (i9 != i10) {
            if (i10 != 0 && (e9 = uVar.e(i10)) != null) {
                e9.setVisibility(0);
                e9.setAlpha(1.0f);
            }
            if (i9 != 0 && (e8 = e(i9)) != null) {
                e8.setVisibility(4);
                if (i9 == 1) {
                    e8.setText((CharSequence) null);
                }
            }
            uVar.f4403n = i10;
        }
        TextInputLayout textInputLayout = uVar.f4398h;
        textInputLayout.r();
        textInputLayout.u(z9, false);
        textInputLayout.x();
    }
}
