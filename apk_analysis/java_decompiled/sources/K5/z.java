package K5;

import P.Q;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import b5.G1;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class z extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f4431a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f4432b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f4433c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f4434d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f4435e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f4436f;

    /* renamed from: g, reason: collision with root package name */
    public int f4437g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView.ScaleType f4438h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f4439i;
    public boolean j;

    public z(TextInputLayout textInputLayout, G1 g12) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f4431a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f4434d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f4432b = appCompatTextView;
        if (D1.C(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f4439i;
        checkableImageButton.setOnClickListener(null);
        O4.h.G(checkableImageButton, onLongClickListener);
        this.f4439i = null;
        checkableImageButton.setOnLongClickListener(null);
        O4.h.G(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) g12.f10718c;
        if (typedArray.hasValue(69)) {
            this.f4435e = D1.q(getContext(), g12, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f4436f = w5.p.k(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(g12.o(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize >= 0) {
            if (dimensionPixelSize != this.f4437g) {
                this.f4437g = dimensionPixelSize;
                checkableImageButton.setMinimumWidth(dimensionPixelSize);
                checkableImageButton.setMinimumHeight(dimensionPixelSize);
            }
            if (typedArray.hasValue(68)) {
                ImageView.ScaleType m9 = O4.h.m(typedArray.getInt(68, -1));
                this.f4438h = m9;
                checkableImageButton.setScaleType(m9);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(R.id.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = Q.f5546a;
            appCompatTextView.setAccessibilityLiveRegion(1);
            appCompatTextView.setTextAppearance(typedArray.getResourceId(60, 0));
            if (typedArray.hasValue(61)) {
                appCompatTextView.setTextColor(g12.n(61));
            }
            CharSequence text2 = typedArray.getText(59);
            this.f4433c = TextUtils.isEmpty(text2) ? null : text2;
            appCompatTextView.setText(text2);
            e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        int i9;
        CheckableImageButton checkableImageButton = this.f4434d;
        if (checkableImageButton.getVisibility() == 0) {
            i9 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i9 = 0;
        }
        WeakHashMap weakHashMap = Q.f5546a;
        return this.f4432b.getPaddingStart() + getPaddingStart() + i9;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4434d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f4435e;
            PorterDuff.Mode mode = this.f4436f;
            TextInputLayout textInputLayout = this.f4431a;
            O4.h.c(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            O4.h.E(textInputLayout, checkableImageButton, this.f4435e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f4439i;
        checkableImageButton.setOnClickListener(null);
        O4.h.G(checkableImageButton, onLongClickListener);
        this.f4439i = null;
        checkableImageButton.setOnLongClickListener(null);
        O4.h.G(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z9) {
        boolean z10;
        CheckableImageButton checkableImageButton = this.f4434d;
        int i9 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z9) {
            if (!z9) {
                i9 = 8;
            }
            checkableImageButton.setVisibility(i9);
            d();
            e();
        }
    }

    public final void d() {
        int paddingStart;
        EditText editText = this.f4431a.f16203d;
        if (editText == null) {
            return;
        }
        if (this.f4434d.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = Q.f5546a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = Q.f5546a;
        this.f4432b.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i9;
        int i10 = 8;
        if (this.f4433c != null && !this.j) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        if (this.f4434d.getVisibility() == 0 || i9 == 0) {
            i10 = 0;
        }
        setVisibility(i10);
        this.f4432b.setVisibility(i9);
        this.f4431a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        d();
    }
}
