package p;

import F0.C0096b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* renamed from: p.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1788c0 extends ToggleButton implements S.l {

    /* renamed from: a, reason: collision with root package name */
    public final C0096b f21973a;

    /* renamed from: b, reason: collision with root package name */
    public final C1769T f21974b;

    /* renamed from: c, reason: collision with root package name */
    public C1825v f21975c;

    public C1788c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC1761O0.a(this, getContext());
        C0096b c0096b = new C0096b(this);
        this.f21973a = c0096b;
        c0096b.k(attributeSet, R.attr.buttonStyleToggle);
        C1769T c1769t = new C1769T(this);
        this.f21974b = c1769t;
        c1769t.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1825v getEmojiTextViewHelper() {
        if (this.f21975c == null) {
            this.f21975c = new C1825v(this);
        }
        return this.f21975c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0096b c0096b = this.f21973a;
        if (c0096b != null) {
            c0096b.a();
        }
        C1769T c1769t = this.f21974b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0096b c0096b = this.f21973a;
        if (c0096b != null) {
            return c0096b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0096b c0096b = this.f21973a;
        if (c0096b != null) {
            return c0096b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f21974b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f21974b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0096b c0096b = this.f21973a;
        if (c0096b != null) {
            c0096b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C0096b c0096b = this.f21973a;
        if (c0096b != null) {
            c0096b.n(i9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f21974b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f21974b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0096b c0096b = this.f21973a;
        if (c0096b != null) {
            c0096b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0096b c0096b = this.f21973a;
        if (c0096b != null) {
            c0096b.t(mode);
        }
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1769T c1769t = this.f21974b;
        c1769t.l(colorStateList);
        c1769t.b();
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1769T c1769t = this.f21974b;
        c1769t.m(mode);
        c1769t.b();
    }
}
