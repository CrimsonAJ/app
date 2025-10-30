package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.internal.measurement.D1;
import h.AbstractC1260a;
import o.AbstractC1662c;
import o.C1661b;
import o.k;
import o.l;
import o.n;
import o.y;
import p.InterfaceC1807m;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements y, View.OnClickListener, InterfaceC1807m {

    /* renamed from: h, reason: collision with root package name */
    public n f9336h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f9337i;
    public Drawable j;

    /* renamed from: k, reason: collision with root package name */
    public k f9338k;

    /* renamed from: l, reason: collision with root package name */
    public C1661b f9339l;

    /* renamed from: m, reason: collision with root package name */
    public AbstractC1662c f9340m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9341n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9342o;

    /* renamed from: p, reason: collision with root package name */
    public final int f9343p;

    /* renamed from: q, reason: collision with root package name */
    public int f9344q;

    /* renamed from: r, reason: collision with root package name */
    public final int f9345r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f9341n = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1260a.f17807c, 0, 0);
        this.f9343p = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f9345r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f9344q = -1;
        setSaveEnabled(false);
    }

    @Override // o.y
    public final void a(n nVar) {
        int i9;
        this.f9336h = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f21404a);
        if (nVar.isVisible()) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        setVisibility(i9);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f9339l == null) {
            this.f9339l = new C1661b(this);
        }
    }

    @Override // p.InterfaceC1807m
    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p.InterfaceC1807m
    public final boolean c() {
        if (!TextUtils.isEmpty(getText()) && this.f9336h.getIcon() == null) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // o.y
    public n getItemData() {
        return this.f9336h;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i9 = configuration.screenWidthDp;
        int i10 = configuration.screenHeightDp;
        if (i9 < 480) {
            if ((i9 < 640 || i10 < 480) && configuration.orientation != 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void i() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z9 = true;
        boolean z10 = !TextUtils.isEmpty(this.f9337i);
        if (this.j != null && ((this.f9336h.f21427y & 4) != 4 || (!this.f9341n && !this.f9342o))) {
            z9 = false;
        }
        boolean z11 = z10 & z9;
        CharSequence charSequence3 = null;
        if (z11) {
            charSequence = this.f9337i;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence4 = this.f9336h.f21419q;
        if (TextUtils.isEmpty(charSequence4)) {
            if (z11) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f9336h.f21408e;
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(charSequence4);
        }
        CharSequence charSequence5 = this.f9336h.f21420r;
        if (TextUtils.isEmpty(charSequence5)) {
            if (!z11) {
                charSequence3 = this.f9336h.f21408e;
            }
            D1.J(this, charSequence3);
            return;
        }
        D1.J(this, charSequence5);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        k kVar = this.f9338k;
        if (kVar != null) {
            kVar.c(this.f9336h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9341n = h();
        i();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i12 = this.f9344q) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i9, i10);
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i9);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f9343p;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(size, i13);
        } else {
            i11 = i13;
        }
        if (mode != 1073741824 && i13 > 0 && measuredWidth < i11) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
        }
        if (isEmpty && this.j != null) {
            super.setPadding((getMeasuredWidth() - this.j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1661b c1661b;
        if (this.f9336h.hasSubMenu() && (c1661b = this.f9339l) != null && c1661b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z9) {
    }

    public void setChecked(boolean z9) {
    }

    public void setExpandedFormat(boolean z9) {
        if (this.f9342o != z9) {
            this.f9342o = z9;
            n nVar = this.f9336h;
            if (nVar != null) {
                l lVar = nVar.f21416n;
                lVar.f21384k = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i9 = this.f9345r;
            if (intrinsicWidth > i9) {
                intrinsicHeight = (int) (intrinsicHeight * (i9 / intrinsicWidth));
                intrinsicWidth = i9;
            }
            if (intrinsicHeight > i9) {
                intrinsicWidth = (int) (intrinsicWidth * (i9 / intrinsicHeight));
            } else {
                i9 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i9);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(k kVar) {
        this.f9338k = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
        this.f9344q = i9;
        super.setPadding(i9, i10, i11, i12);
    }

    public void setPopupCallback(AbstractC1662c abstractC1662c) {
        this.f9340m = abstractC1662c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f9337i = charSequence;
        i();
    }
}
