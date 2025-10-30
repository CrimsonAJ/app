package androidx.appcompat.widget;

import F0.C0096b;
import O4.h;
import P.C0303d;
import P.C0305f;
import P.InterfaceC0302c;
import P.InterfaceC0315p;
import P.Q;
import S.j;
import S.l;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import co.notix.R;
import p.AbstractC1732A;
import p.AbstractC1756M;
import p.AbstractC1761O0;
import p.AbstractC1763P0;
import p.C1769T;
import p.C1823u;
import p.C1831y;
import s4.i;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements InterfaceC0315p, l {

    /* renamed from: a, reason: collision with root package name */
    public final C0096b f9434a;

    /* renamed from: b, reason: collision with root package name */
    public final C1769T f9435b;

    /* renamed from: c, reason: collision with root package name */
    public final C1831y f9436c;

    /* renamed from: d, reason: collision with root package name */
    public final j f9437d;

    /* renamed from: e, reason: collision with root package name */
    public final C1831y f9438e;

    /* renamed from: f, reason: collision with root package name */
    public C1823u f9439f;

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C1823u getSuperCaller() {
        if (this.f9439f == null) {
            this.f9439f = new C1823u(this);
        }
        return this.f9439f;
    }

    @Override // P.InterfaceC0315p
    public final C0305f a(C0305f c0305f) {
        this.f9437d.getClass();
        return j.a(this, c0305f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0096b c0096b = this.f9434a;
        if (c0096b != null) {
            c0096b.a();
        }
        C1769T c1769t = this.f9435b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0096b c0096b = this.f9434a;
        if (c0096b != null) {
            return c0096b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0096b c0096b = this.f9434a;
        if (c0096b != null) {
            return c0096b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f9435b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f9435b.e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1831y c1831y;
        if (Build.VERSION.SDK_INT < 28 && (c1831y = this.f9436c) != null) {
            TextClassifier textClassifier = (TextClassifier) c1831y.f22094c;
            if (textClassifier == null) {
                return AbstractC1756M.a((TextView) c1831y.f22093b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (r1 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006a, code lost:
    
        if (r1 != null) goto L23;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            p.T r1 = r7.f9435b
            r1.getClass()
            p.C1769T.h(r8, r0, r7)
            com.google.android.gms.internal.measurement.AbstractC1002u1.N(r8, r0, r7)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = P.Q.g(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            R.a.a(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            C3.v r2 = new C3.v
            r6 = 6
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4d
            R.d r1 = new R.d
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = R.c.f6460a
            if (r1 < r5) goto L59
            java.lang.String[] r1 = R.a.b(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            R.e r1 = new R.e
            r1.<init>(r0, r2)
            goto L4b
        L77:
            p.y r1 = r7.f9438e
            f0.b r8 = r1.c(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatEditText.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 30 && i9 < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i9 = Build.VERSION.SDK_INT;
        boolean z9 = false;
        if (i9 < 31 && i9 >= 24 && dragEvent.getLocalState() == null && Q.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z9 = AbstractC1732A.a(dragEvent, this, activity);
            }
        }
        if (z9) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i9) {
        ClipData primaryClip;
        InterfaceC0302c interfaceC0302c;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 && Q.g(this) != null && (i9 == 16908322 || i9 == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i11 >= 31) {
                    interfaceC0302c = new i(primaryClip, 1);
                } else {
                    C0303d c0303d = new C0303d();
                    c0303d.f5584b = primaryClip;
                    c0303d.f5585c = 1;
                    interfaceC0302c = c0303d;
                }
                if (i9 == 16908322) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                interfaceC0302c.K(i10);
                Q.i(this, interfaceC0302c.b());
            }
            return true;
        }
        return super.onTextContextMenuItem(i9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0096b c0096b = this.f9434a;
        if (c0096b != null) {
            c0096b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C0096b c0096b = this.f9434a;
        if (c0096b != null) {
            c0096b.n(i9);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f9435b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f9435b;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        this.f9438e.d(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f9438e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0096b c0096b = this.f9434a;
        if (c0096b != null) {
            c0096b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0096b c0096b = this.f9434a;
        if (c0096b != null) {
            c0096b.t(mode);
        }
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1769T c1769t = this.f9435b;
        c1769t.l(colorStateList);
        c1769t.b();
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1769T c1769t = this.f9435b;
        c1769t.m(mode);
        c1769t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C1769T c1769t = this.f9435b;
        if (c1769t != null) {
            c1769t.g(context, i9);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1831y c1831y;
        if (Build.VERSION.SDK_INT < 28 && (c1831y = this.f9436c) != null) {
            c1831y.f22094c = textClassifier;
        } else {
            super.setTextClassifier(textClassifier);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, S.j] */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1763P0.a(context);
        AbstractC1761O0.a(this, getContext());
        C0096b c0096b = new C0096b(this);
        this.f9434a = c0096b;
        c0096b.k(attributeSet, R.attr.editTextStyle);
        C1769T c1769t = new C1769T(this);
        this.f9435b = c1769t;
        c1769t.f(attributeSet, R.attr.editTextStyle);
        c1769t.b();
        C1831y c1831y = new C1831y();
        c1831y.f22093b = this;
        this.f9436c = c1831y;
        this.f9437d = new Object();
        C1831y c1831y2 = new C1831y(this);
        this.f9438e = c1831y2;
        c1831y2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a5 = c1831y2.a(keyListener);
        if (a5 == keyListener) {
            return;
        }
        super.setKeyListener(a5);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }
}
