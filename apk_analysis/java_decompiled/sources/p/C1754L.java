package p;

import F0.C0096b;
import a.AbstractC0485a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import o.ViewTreeObserverOnGlobalLayoutListenerC1663d;

/* renamed from: p.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1754L extends Spinner {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f21840i = {R.attr.spinnerMode};

    /* renamed from: a, reason: collision with root package name */
    public final C0096b f21841a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f21842b;

    /* renamed from: c, reason: collision with root package name */
    public final C1738D f21843c;

    /* renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f21844d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21845e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1752K f21846f;

    /* renamed from: g, reason: collision with root package name */
    public int f21847g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f21848h;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1754L(android.content.Context r12, android.util.AttributeSet r13, int r14) {
        /*
            r11 = this;
            r0 = 2130969661(0x7f04043d, float:1.754801E38)
            r11.<init>(r12, r13, r0)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r11.f21848h = r1
            android.content.Context r1 = r11.getContext()
            p.AbstractC1761O0.a(r11, r1)
            int[] r1 = h.AbstractC1260a.f17824u
            b5.G1 r2 = b5.G1.w(r12, r13, r1, r0)
            F0.b r3 = new F0.b
            r3.<init>(r11)
            r11.f21841a = r3
            java.lang.Object r3 = r2.f10718c
            android.content.res.TypedArray r3 = (android.content.res.TypedArray) r3
            r4 = 4
            r5 = 0
            int r4 = r3.getResourceId(r4, r5)
            if (r4 == 0) goto L35
            n.c r6 = new n.c
            r6.<init>(r12, r4)
            r11.f21842b = r6
            goto L37
        L35:
            r11.f21842b = r12
        L37:
            r4 = -1
            r6 = 0
            if (r14 != r4) goto L69
            int[] r4 = p.C1754L.f21840i     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            android.content.res.TypedArray r4 = r12.obtainStyledAttributes(r13, r4, r0, r5)     // Catch: java.lang.Throwable -> L55 java.lang.Exception -> L57
            boolean r7 = r4.hasValue(r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            if (r7 == 0) goto L51
            int r14 = r4.getInt(r5, r5)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            goto L51
        L4c:
            r12 = move-exception
            r6 = r4
            goto L63
        L4f:
            r7 = move-exception
            goto L59
        L51:
            r4.recycle()
            goto L69
        L55:
            r12 = move-exception
            goto L63
        L57:
            r7 = move-exception
            r4 = r6
        L59:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L69
            goto L51
        L63:
            if (r6 == 0) goto L68
            r6.recycle()
        L68:
            throw r12
        L69:
            r4 = 2
            r7 = 1
            if (r14 == 0) goto La3
            if (r14 == r7) goto L70
            goto Lb0
        L70:
            p.I r14 = new p.I
            android.content.Context r8 = r11.f21842b
            r14.<init>(r11, r8, r13)
            android.content.Context r8 = r11.f21842b
            b5.G1 r1 = b5.G1.w(r8, r13, r1, r0)
            r8 = -2
            java.lang.Object r9 = r1.f10718c
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            r10 = 3
            int r8 = r9.getLayoutDimension(r10, r8)
            r11.f21847g = r8
            android.graphics.drawable.Drawable r8 = r1.o(r7)
            r14.g(r8)
            java.lang.String r4 = r3.getString(r4)
            r14.f21818D = r4
            r1.y()
            r11.f21846f = r14
            p.D r1 = new p.D
            r1.<init>(r11, r11, r14)
            r11.f21843c = r1
            goto Lb0
        La3:
            p.F r14 = new p.F
            r14.<init>(r11)
            r11.f21846f = r14
            java.lang.String r1 = r3.getString(r4)
            r14.f21809c = r1
        Lb0:
            java.lang.CharSequence[] r14 = r3.getTextArray(r5)
            if (r14 == 0) goto Lc7
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r12, r3, r14)
            r12 = 2131558625(0x7f0d00e1, float:1.8742571E38)
            r1.setDropDownViewResource(r12)
            r11.setAdapter(r1)
        Lc7:
            r2.y()
            r11.f21845e = r7
            android.widget.SpinnerAdapter r12 = r11.f21844d
            if (r12 == 0) goto Ld5
            r11.setAdapter(r12)
            r11.f21844d = r6
        Ld5:
            F0.b r12 = r11.f21841a
            r12.k(r13, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1754L.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i9 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i10 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i10 = Math.max(i10, view.getMeasuredWidth());
        }
        if (drawable != null) {
            Rect rect = this.f21848h;
            drawable.getPadding(rect);
            return rect.left + rect.right + i10;
        }
        return i10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0096b c0096b = this.f21841a;
        if (c0096b != null) {
            c0096b.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null) {
            return interfaceC1752K.b();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null) {
            return interfaceC1752K.m();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f21846f != null) {
            return this.f21847g;
        }
        return super.getDropDownWidth();
    }

    public final InterfaceC1752K getInternalPopup() {
        return this.f21846f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null) {
            return interfaceC1752K.c();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f21842b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null) {
            return interfaceC1752K.o();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0096b c0096b = this.f21841a;
        if (c0096b != null) {
            return c0096b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0096b c0096b = this.f21841a;
        if (c0096b != null) {
            return c0096b.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null && interfaceC1752K.a()) {
            interfaceC1752K.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        if (this.f21846f != null && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i9)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1750J c1750j = (C1750J) parcelable;
        super.onRestoreInstanceState(c1750j.getSuperState());
        if (c1750j.f21831a && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1663d(2, this));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, p.J] */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z9;
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null && interfaceC1752K.a()) {
            z9 = true;
        } else {
            z9 = false;
        }
        baseSavedState.f21831a = z9;
        return baseSavedState;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C1738D c1738d = this.f21843c;
        if (c1738d != null && c1738d.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null) {
            if (!interfaceC1752K.a()) {
                this.f21846f.l(getTextDirection(), getTextAlignment());
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0096b c0096b = this.f21841a;
        if (c0096b != null) {
            c0096b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C0096b c0096b = this.f21841a;
        if (c0096b != null) {
            c0096b.n(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i9) {
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null) {
            interfaceC1752K.j(i9);
            interfaceC1752K.k(i9);
        } else {
            super.setDropDownHorizontalOffset(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i9) {
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null) {
            interfaceC1752K.i(i9);
        } else {
            super.setDropDownVerticalOffset(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i9) {
        if (this.f21846f != null) {
            this.f21847g = i9;
        } else {
            super.setDropDownWidth(i9);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null) {
            interfaceC1752K.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i9) {
        setPopupBackgroundDrawable(AbstractC0485a.q(getPopupContext(), i9));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != null) {
            interfaceC1752K.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0096b c0096b = this.f21841a;
        if (c0096b != null) {
            c0096b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0096b c0096b = this.f21841a;
        if (c0096b != null) {
            c0096b.t(mode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.widget.ListAdapter, p.G, java.lang.Object] */
    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f21845e) {
            this.f21844d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1752K interfaceC1752K = this.f21846f;
        if (interfaceC1752K != 0) {
            Context context = this.f21842b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ?? obj = new Object();
            obj.f21813a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.f21814b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC1740E.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1752K.p(obj);
        }
    }
}
