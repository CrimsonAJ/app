package p;

import F0.C0096b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: p.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1815q extends Button implements S.l {

    /* renamed from: a, reason: collision with root package name */
    public final C0096b f22055a;

    /* renamed from: b, reason: collision with root package name */
    public final C1769T f22056b;

    /* renamed from: c, reason: collision with root package name */
    public C1825v f22057c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815q(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        AbstractC1763P0.a(context);
        AbstractC1761O0.a(this, getContext());
        C0096b c0096b = new C0096b(this);
        this.f22055a = c0096b;
        c0096b.k(attributeSet, i9);
        C1769T c1769t = new C1769T(this);
        this.f22056b = c1769t;
        c1769t.f(attributeSet, i9);
        c1769t.b();
        getEmojiTextViewHelper().b(attributeSet, i9);
    }

    private C1825v getEmojiTextViewHelper() {
        if (this.f22057c == null) {
            this.f22057c = new C1825v(this);
        }
        return this.f22057c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0096b c0096b = this.f22055a;
        if (c0096b != null) {
            c0096b.a();
        }
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f21994c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            return Math.round(c1769t.f21913i.f21954e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f21994c) {
            return super.getAutoSizeMinTextSize();
        }
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            return Math.round(c1769t.f21913i.f21953d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f21994c) {
            return super.getAutoSizeStepGranularity();
        }
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            return Math.round(c1769t.f21913i.f21952c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f21994c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            return c1769t.f21913i.f21955f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g1.f21994c) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        C1769T c1769t = this.f22056b;
        if (c1769t == null) {
            return 0;
        }
        return c1769t.f21913i.f21950a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return O4.h.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0096b c0096b = this.f22055a;
        if (c0096b != null) {
            return c0096b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0096b c0096b = this.f22055a;
        if (c0096b != null) {
            return c0096b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22056b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22056b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        C1769T c1769t = this.f22056b;
        if (c1769t != null && !g1.f21994c) {
            c1769t.f21913i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        C1769T c1769t = this.f22056b;
        if (c1769t != null && !g1.f21994c) {
            C1786b0 c1786b0 = c1769t.f21913i;
            if (c1786b0.f()) {
                c1786b0.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i9, int i10, int i11, int i12) {
        if (g1.f21994c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i9, i10, i11, i12);
            return;
        }
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            c1769t.i(i9, i10, i11, i12);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i9) {
        if (g1.f21994c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i9);
            return;
        }
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            c1769t.j(iArr, i9);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i9) {
        if (g1.f21994c) {
            super.setAutoSizeTextTypeWithDefaults(i9);
            return;
        }
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            c1769t.k(i9);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0096b c0096b = this.f22055a;
        if (c0096b != null) {
            c0096b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C0096b c0096b = this.f22055a;
        if (c0096b != null) {
            c0096b.n(i9);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(O4.h.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z9) {
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            c1769t.f21905a.setAllCaps(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0096b c0096b = this.f22055a;
        if (c0096b != null) {
            c0096b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0096b c0096b = this.f22055a;
        if (c0096b != null) {
            c0096b.t(mode);
        }
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1769T c1769t = this.f22056b;
        c1769t.l(colorStateList);
        c1769t.b();
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1769T c1769t = this.f22056b;
        c1769t.m(mode);
        c1769t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C1769T c1769t = this.f22056b;
        if (c1769t != null) {
            c1769t.g(context, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i9, float f9) {
        boolean z9 = g1.f21994c;
        if (z9) {
            super.setTextSize(i9, f9);
            return;
        }
        C1769T c1769t = this.f22056b;
        if (c1769t != null && !z9) {
            C1786b0 c1786b0 = c1769t.f21913i;
            if (!c1786b0.f()) {
                c1786b0.g(i9, f9);
            }
        }
    }
}
