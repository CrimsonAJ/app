package p;

import F0.C0096b;
import a.AbstractC0485a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import co.notix.R;

/* renamed from: p.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1833z extends RadioButton implements S.k, S.l {

    /* renamed from: a, reason: collision with root package name */
    public final N0.f f22096a;

    /* renamed from: b, reason: collision with root package name */
    public final C0096b f22097b;

    /* renamed from: c, reason: collision with root package name */
    public final C1769T f22098c;

    /* renamed from: d, reason: collision with root package name */
    public C1825v f22099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1833z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        AbstractC1763P0.a(context);
        AbstractC1761O0.a(this, getContext());
        N0.f fVar = new N0.f(this);
        this.f22096a = fVar;
        fVar.e(attributeSet, R.attr.radioButtonStyle);
        C0096b c0096b = new C0096b(this);
        this.f22097b = c0096b;
        c0096b.k(attributeSet, R.attr.radioButtonStyle);
        C1769T c1769t = new C1769T(this);
        this.f22098c = c1769t;
        c1769t.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private C1825v getEmojiTextViewHelper() {
        if (this.f22099d == null) {
            this.f22099d = new C1825v(this);
        }
        return this.f22099d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0096b c0096b = this.f22097b;
        if (c0096b != null) {
            c0096b.a();
        }
        C1769T c1769t = this.f22098c;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0096b c0096b = this.f22097b;
        if (c0096b != null) {
            return c0096b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0096b c0096b = this.f22097b;
        if (c0096b != null) {
            return c0096b.i();
        }
        return null;
    }

    @Override // S.k
    public ColorStateList getSupportButtonTintList() {
        N0.f fVar = this.f22096a;
        if (fVar != null) {
            return (ColorStateList) fVar.f4824e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        N0.f fVar = this.f22096a;
        if (fVar != null) {
            return (PorterDuff.Mode) fVar.f4825f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22098c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22098c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0096b c0096b = this.f22097b;
        if (c0096b != null) {
            c0096b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C0096b c0096b = this.f22097b;
        if (c0096b != null) {
            c0096b.n(i9);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        N0.f fVar = this.f22096a;
        if (fVar != null) {
            if (fVar.f4822c) {
                fVar.f4822c = false;
            } else {
                fVar.f4822c = true;
                fVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f22098c;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f22098c;
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
        C0096b c0096b = this.f22097b;
        if (c0096b != null) {
            c0096b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0096b c0096b = this.f22097b;
        if (c0096b != null) {
            c0096b.t(mode);
        }
    }

    @Override // S.k
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        N0.f fVar = this.f22096a;
        if (fVar != null) {
            fVar.f4824e = colorStateList;
            fVar.f4820a = true;
            fVar.a();
        }
    }

    @Override // S.k
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        N0.f fVar = this.f22096a;
        if (fVar != null) {
            fVar.f4825f = mode;
            fVar.f4821b = true;
            fVar.a();
        }
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1769T c1769t = this.f22098c;
        c1769t.l(colorStateList);
        c1769t.b();
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1769T c1769t = this.f22098c;
        c1769t.m(mode);
        c1769t.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i9) {
        setButtonDrawable(AbstractC0485a.q(getContext(), i9));
    }
}
