package p;

import F0.C0096b;
import a.AbstractC0485a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.google.android.gms.internal.measurement.AbstractC1002u1;

/* renamed from: p.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1819s extends CheckedTextView implements S.l {

    /* renamed from: a, reason: collision with root package name */
    public final N0.f f22073a;

    /* renamed from: b, reason: collision with root package name */
    public final C0096b f22074b;

    /* renamed from: c, reason: collision with root package name */
    public final C1769T f22075c;

    /* renamed from: d, reason: collision with root package name */
    public C1825v f22076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[Catch: all -> 0x0064, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: all -> 0x0064, TRY_LEAVE, TryCatch #1 {all -> 0x0064, blocks: (B:3:0x004b, B:5:0x0052, B:8:0x0058, B:9:0x007e, B:11:0x0085, B:12:0x008c, B:14:0x0093, B:21:0x0067, B:23:0x006d, B:25:0x0073), top: B:2:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1819s(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            p.AbstractC1763P0.a(r8)
            r6 = 2130968808(0x7f0400e8, float:1.754628E38)
            r7.<init>(r8, r9, r6)
            android.content.Context r8 = r7.getContext()
            p.AbstractC1761O0.a(r7, r8)
            p.T r8 = new p.T
            r8.<init>(r7)
            r7.f22075c = r8
            r8.f(r9, r6)
            r8.b()
            F0.b r8 = new F0.b
            r8.<init>(r7)
            r7.f22074b = r8
            r8.k(r9, r6)
            N0.f r8 = new N0.f
            r8.<init>(r7)
            r7.f22073a = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = h.AbstractC1260a.f17815l
            b5.G1 r8 = b5.G1.w(r8, r9, r3, r6)
            java.lang.Object r0 = r8.f10718c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            android.content.Context r2 = r7.getContext()
            java.lang.Object r1 = r8.f10718c
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r7
            r4 = r9
            P.Q.l(r1, r2, r3, r4, r5, r6)
            r9 = 1
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            r3 = 0
            if (r2 == 0) goto L67
            int r9 = r0.getResourceId(r9, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L67
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            android.graphics.drawable.Drawable r9 = a.AbstractC0485a.q(r2, r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64 android.content.res.Resources.NotFoundException -> L67
            goto L7e
        L64:
            r0 = move-exception
            r9 = r0
            goto Lab
        L67:
            boolean r9 = r0.hasValue(r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            int r9 = r0.getResourceId(r3, r3)     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto L7e
            android.content.Context r2 = r7.getContext()     // Catch: java.lang.Throwable -> L64
            android.graphics.drawable.Drawable r9 = a.AbstractC0485a.q(r2, r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkDrawable(r9)     // Catch: java.lang.Throwable -> L64
        L7e:
            r9 = 2
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L8c
            android.content.res.ColorStateList r9 = r8.n(r9)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintList(r9)     // Catch: java.lang.Throwable -> L64
        L8c:
            r9 = 3
            boolean r2 = r0.hasValue(r9)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto La0
            r2 = -1
            int r9 = r0.getInt(r9, r2)     // Catch: java.lang.Throwable -> L64
            r0 = 0
            android.graphics.PorterDuff$Mode r9 = p.AbstractC1800i0.c(r9, r0)     // Catch: java.lang.Throwable -> L64
            r7.setCheckMarkTintMode(r9)     // Catch: java.lang.Throwable -> L64
        La0:
            r8.y()
            p.v r8 = r7.getEmojiTextViewHelper()
            r8.b(r4, r6)
            return
        Lab:
            r8.y()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1819s.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C1825v getEmojiTextViewHelper() {
        if (this.f22076d == null) {
            this.f22076d = new C1825v(this);
        }
        return this.f22076d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1769T c1769t = this.f22075c;
        if (c1769t != null) {
            c1769t.b();
        }
        C0096b c0096b = this.f22074b;
        if (c0096b != null) {
            c0096b.a();
        }
        N0.f fVar = this.f22073a;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return O4.h.M(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0096b c0096b = this.f22074b;
        if (c0096b != null) {
            return c0096b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0096b c0096b = this.f22074b;
        if (c0096b != null) {
            return c0096b.i();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        N0.f fVar = this.f22073a;
        if (fVar != null) {
            return (ColorStateList) fVar.f4824e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        N0.f fVar = this.f22073a;
        if (fVar != null) {
            return (PorterDuff.Mode) fVar.f4825f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f22075c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f22075c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1002u1.N(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0096b c0096b = this.f22074b;
        if (c0096b != null) {
            c0096b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C0096b c0096b = this.f22074b;
        if (c0096b != null) {
            c0096b.n(i9);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        N0.f fVar = this.f22073a;
        if (fVar != null) {
            if (fVar.f4822c) {
                fVar.f4822c = false;
            } else {
                fVar.f4822c = true;
                fVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f22075c;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1769T c1769t = this.f22075c;
        if (c1769t != null) {
            c1769t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(O4.h.N(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0096b c0096b = this.f22074b;
        if (c0096b != null) {
            c0096b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0096b c0096b = this.f22074b;
        if (c0096b != null) {
            c0096b.t(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        N0.f fVar = this.f22073a;
        if (fVar != null) {
            fVar.f4824e = colorStateList;
            fVar.f4820a = true;
            fVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        N0.f fVar = this.f22073a;
        if (fVar != null) {
            fVar.f4825f = mode;
            fVar.f4821b = true;
            fVar.b();
        }
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1769T c1769t = this.f22075c;
        c1769t.l(colorStateList);
        c1769t.b();
    }

    @Override // S.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1769T c1769t = this.f22075c;
        c1769t.m(mode);
        c1769t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        C1769T c1769t = this.f22075c;
        if (c1769t != null) {
            c1769t.g(context, i9);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i9) {
        setCheckMarkDrawable(AbstractC0485a.q(getContext(), i9));
    }
}
