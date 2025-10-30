package androidx.appcompat.widget;

import F0.C0096b;
import H.f;
import M4.a;
import N.c;
import N.d;
import O4.h;
import P.AbstractC0324z;
import S.l;
import a.AbstractC0485a;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.firebase.messaging.u;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p.AbstractC1756M;
import p.AbstractC1761O0;
import p.AbstractC1763P0;
import p.C1769T;
import p.C1773V;
import p.C1775W;
import p.C1786b0;
import p.C1825v;
import p.C1831y;
import p.InterfaceC1771U;
import p.g1;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements l {

    /* renamed from: a, reason: collision with root package name */
    public final C0096b f9447a;

    /* renamed from: b, reason: collision with root package name */
    public final C1769T f9448b;

    /* renamed from: c, reason: collision with root package name */
    public final C1831y f9449c;

    /* renamed from: d, reason: collision with root package name */
    public C1825v f9450d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9451e;

    /* renamed from: f, reason: collision with root package name */
    public u f9452f;

    /* renamed from: g, reason: collision with root package name */
    public Future f9453g;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1825v getEmojiTextViewHelper() {
        if (this.f9450d == null) {
            this.f9450d = new C1825v(this);
        }
        return this.f9450d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0096b c0096b = this.f9447a;
        if (c0096b != null) {
            c0096b.a();
        }
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    public final void g() {
        Future future = this.f9453g;
        if (future != null) {
            try {
                this.f9453g = null;
                if (future.get() == null) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        throw null;
                    }
                    h.y(this);
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f21994c) {
            return super.getAutoSizeMaxTextSize();
        }
        C1769T c1769t = this.f9448b;
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
        C1769T c1769t = this.f9448b;
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
        C1769T c1769t = this.f9448b;
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
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            return c1769t.f21913i.f21955f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (g1.f21994c) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        }
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            return c1769t.f21913i.f21950a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.M(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC1771U getSuperCaller() {
        if (this.f9452f == null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 34) {
                this.f9452f = new C1775W(this);
            } else if (i9 >= 28) {
                this.f9452f = new C1773V(this);
            } else if (i9 >= 26) {
                this.f9452f = new u(this);
            }
        }
        return this.f9452f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0096b c0096b = this.f9447a;
        if (c0096b != null) {
            return c0096b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0096b c0096b = this.f9447a;
        if (c0096b != null) {
            return c0096b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9448b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9448b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1831y c1831y;
        if (Build.VERSION.SDK_INT < 28 && (c1831y = this.f9449c) != null) {
            TextClassifier textClassifier = (TextClassifier) c1831y.f22094c;
            if (textClassifier == null) {
                return AbstractC1756M.a((TextView) c1831y.f22093b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public c getTextMetricsParamsCompat() {
        return h.y(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f9448b.getClass();
        C1769T.h(editorInfo, onCreateInputConnection, this);
        AbstractC1002u1.N(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30 && i9 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        C1769T c1769t = this.f9448b;
        if (c1769t != null && !g1.f21994c) {
            c1769t.f21913i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i9, int i10) {
        g();
        super.onMeasure(i9, i10);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i9, int i10, int i11) {
        super.onTextChanged(charSequence, i9, i10, i11);
        C1769T c1769t = this.f9448b;
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
        C1769T c1769t = this.f9448b;
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
        C1769T c1769t = this.f9448b;
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
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            c1769t.k(i9);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0096b c0096b = this.f9447a;
        if (c0096b != null) {
            c0096b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C0096b c0096b = this.f9447a;
        if (c0096b != null) {
            c0096b.n(i9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().b(i9);
        } else {
            h.F(this, i9);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i9);
        } else {
            h.H(this, i9);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i9) {
        h.I(this, i9);
    }

    public void setPrecomputedText(d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        h.y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0096b c0096b = this.f9447a;
        if (c0096b != null) {
            c0096b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0096b c0096b = this.f9447a;
        if (c0096b != null) {
            c0096b.t(mode);
        }
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1769T c1769t = this.f9448b;
        c1769t.l(colorStateList);
        c1769t.b();
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1769T c1769t = this.f9448b;
        c1769t.m(mode);
        c1769t.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            c1769t.g(context, i9);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1831y c1831y;
        if (Build.VERSION.SDK_INT < 28 && (c1831y = this.f9449c) != null) {
            c1831y.f22094c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    public void setTextFuture(Future<d> future) {
        this.f9453g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.f4806b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i9 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i9 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i9 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i9 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i9 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i9 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i9 = 7;
            }
        }
        setTextDirection(i9);
        getPaint().set(cVar.f4805a);
        setBreakStrategy(cVar.f4807c);
        setHyphenationFrequency(cVar.f4808d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i9, float f9) {
        boolean z9 = g1.f21994c;
        if (z9) {
            super.setTextSize(i9, f9);
            return;
        }
        C1769T c1769t = this.f9448b;
        if (c1769t != null && !z9) {
            C1786b0 c1786b0 = c1769t.f21913i;
            if (!c1786b0.f()) {
                c1786b0.g(i9, f9);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i9) {
        Typeface typeface2;
        if (this.f9451e) {
            return;
        }
        if (typeface != null && i9 > 0) {
            Context context = getContext();
            a aVar = f.f2921a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i9);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f9451e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i9);
        } finally {
            this.f9451e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        AbstractC1763P0.a(context);
        this.f9451e = false;
        this.f9452f = null;
        AbstractC1761O0.a(this, getContext());
        C0096b c0096b = new C0096b(this);
        this.f9447a = c0096b;
        c0096b.k(attributeSet, i9);
        C1769T c1769t = new C1769T(this);
        this.f9448b = c1769t;
        c1769t.f(attributeSet, i9);
        c1769t.b();
        C1831y c1831y = new C1831y();
        c1831y.f22093b = this;
        this.f9449c = c1831y;
        getEmojiTextViewHelper().b(attributeSet, i9);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i9, float f9) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            getSuperCaller().i(i9, f9);
        } else if (i10 >= 34) {
            AbstractC0324z.j(this, i9, f9);
        } else {
            h.I(this, Math.round(TypedValue.applyDimension(i9, f9, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i9 != 0 ? AbstractC0485a.q(context, i9) : null, i10 != 0 ? AbstractC0485a.q(context, i10) : null, i11 != 0 ? AbstractC0485a.q(context, i11) : null, i12 != 0 ? AbstractC0485a.q(context, i12) : null);
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i9, int i10, int i11, int i12) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i9 != 0 ? AbstractC0485a.q(context, i9) : null, i10 != 0 ? AbstractC0485a.q(context, i10) : null, i11 != 0 ? AbstractC0485a.q(context, i11) : null, i12 != 0 ? AbstractC0485a.q(context, i12) : null);
        C1769T c1769t = this.f9448b;
        if (c1769t != null) {
            c1769t.b();
        }
    }
}
