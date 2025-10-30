package p;

import F0.C0096b;
import a.AbstractC0485a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import b5.G1;
import com.google.android.gms.internal.measurement.AbstractC1002u1;

/* renamed from: p.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1827w extends MultiAutoCompleteTextView implements S.l {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f22084d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final C0096b f22085a;

    /* renamed from: b, reason: collision with root package name */
    public final C1769T f22086b;

    /* renamed from: c, reason: collision with root package name */
    public final C1831y f22087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1827w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, co.notix.R.attr.autoCompleteTextViewStyle);
        AbstractC1763P0.a(context);
        AbstractC1761O0.a(this, getContext());
        G1 w7 = G1.w(getContext(), attributeSet, f22084d, co.notix.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) w7.f10718c).hasValue(0)) {
            setDropDownBackgroundDrawable(w7.o(0));
        }
        w7.y();
        C0096b c0096b = new C0096b(this);
        this.f22085a = c0096b;
        c0096b.k(attributeSet, co.notix.R.attr.autoCompleteTextViewStyle);
        C1769T c1769t = new C1769T(this);
        this.f22086b = c1769t;
        c1769t.f(attributeSet, co.notix.R.attr.autoCompleteTextViewStyle);
        c1769t.b();
        C1831y c1831y = new C1831y(this);
        this.f22087c = c1831y;
        c1831y.b(attributeSet, co.notix.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener a5 = c1831y.a(keyListener);
            if (a5 != keyListener) {
                super.setKeyListener(a5);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0096b c0096b = this.f22085a;
        if (c0096b != null) {
            c0096b.a();
        }
        C1769T c1769t = this.f22086b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0096b c0096b = this.f22085a;
        if (c0096b != null) {
            return c0096b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0096b c0096b = this.f22085a;
        if (c0096b != null) {
            return c0096b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22086b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22086b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1002u1.N(editorInfo, onCreateInputConnection, this);
        return this.f22087c.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0096b c0096b = this.f22085a;
        if (c0096b != null) {
            c0096b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C0096b c0096b = this.f22085a;
        if (c0096b != null) {
            c0096b.n(i9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f22086b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f22086b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i9) {
        setDropDownBackgroundDrawable(AbstractC0485a.q(getContext(), i9));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f22087c.d(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f22087c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0096b c0096b = this.f22085a;
        if (c0096b != null) {
            c0096b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0096b c0096b = this.f22085a;
        if (c0096b != null) {
            c0096b.t(mode);
        }
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1769T c1769t = this.f22086b;
        c1769t.l(colorStateList);
        c1769t.b();
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1769T c1769t = this.f22086b;
        c1769t.m(mode);
        c1769t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C1769T c1769t = this.f22086b;
        if (c1769t != null) {
            c1769t.g(context, i9);
        }
    }
}
