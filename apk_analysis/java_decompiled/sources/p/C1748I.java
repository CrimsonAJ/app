package p;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import co.notix.R;
import o.ViewTreeObserverOnGlobalLayoutListenerC1663d;

/* renamed from: p.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1748I extends C1733A0 implements InterfaceC1752K {

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f21818D;

    /* renamed from: X, reason: collision with root package name */
    public C1744G f21819X;
    public final Rect Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f21820Z;

    /* renamed from: f0, reason: collision with root package name */
    public final /* synthetic */ C1754L f21821f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1748I(C1754L c1754l, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f21821f0 = c1754l;
        this.Y = new Rect();
        this.f21784o = c1754l;
        this.f21794y = true;
        this.f21795z.setFocusable(true);
        this.f21785p = new K5.v(1, this);
    }

    @Override // p.InterfaceC1752K
    public final void f(CharSequence charSequence) {
        this.f21818D = charSequence;
    }

    @Override // p.InterfaceC1752K
    public final void j(int i9) {
        this.f21820Z = i9;
    }

    @Override // p.InterfaceC1752K
    public final void l(int i9, int i10) {
        ViewTreeObserver viewTreeObserver;
        C1829x c1829x = this.f21795z;
        boolean isShowing = c1829x.isShowing();
        s();
        this.f21795z.setInputMethodMode(2);
        d();
        C1812o0 c1812o0 = this.f21773c;
        c1812o0.setChoiceMode(1);
        c1812o0.setTextDirection(i9);
        c1812o0.setTextAlignment(i10);
        C1754L c1754l = this.f21821f0;
        int selectedItemPosition = c1754l.getSelectedItemPosition();
        C1812o0 c1812o02 = this.f21773c;
        if (c1829x.isShowing() && c1812o02 != null) {
            c1812o02.setListSelectionHidden(false);
            c1812o02.setSelection(selectedItemPosition);
            if (c1812o02.getChoiceMode() != 0) {
                c1812o02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = c1754l.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC1663d viewTreeObserverOnGlobalLayoutListenerC1663d = new ViewTreeObserverOnGlobalLayoutListenerC1663d(3, this);
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1663d);
            this.f21795z.setOnDismissListener(new C1746H(this, viewTreeObserverOnGlobalLayoutListenerC1663d));
        }
    }

    @Override // p.InterfaceC1752K
    public final CharSequence o() {
        return this.f21818D;
    }

    @Override // p.C1733A0, p.InterfaceC1752K
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.f21819X = (C1744G) listAdapter;
    }

    public final void s() {
        int i9;
        int i10;
        C1829x c1829x = this.f21795z;
        Drawable background = c1829x.getBackground();
        C1754L c1754l = this.f21821f0;
        if (background != null) {
            background.getPadding(c1754l.f21848h);
            boolean z9 = g1.f21992a;
            int layoutDirection = c1754l.getLayoutDirection();
            Rect rect = c1754l.f21848h;
            if (layoutDirection == 1) {
                i9 = rect.right;
            } else {
                i9 = -rect.left;
            }
        } else {
            Rect rect2 = c1754l.f21848h;
            rect2.right = 0;
            rect2.left = 0;
            i9 = 0;
        }
        int paddingLeft = c1754l.getPaddingLeft();
        int paddingRight = c1754l.getPaddingRight();
        int width = c1754l.getWidth();
        int i11 = c1754l.f21847g;
        if (i11 == -2) {
            int a5 = c1754l.a(this.f21819X, c1829x.getBackground());
            int i12 = c1754l.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c1754l.f21848h;
            int i13 = (i12 - rect3.left) - rect3.right;
            if (a5 > i13) {
                a5 = i13;
            }
            r(Math.max(a5, (width - paddingLeft) - paddingRight));
        } else if (i11 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i11);
        }
        boolean z10 = g1.f21992a;
        if (c1754l.getLayoutDirection() == 1) {
            i10 = (((width - paddingRight) - this.f21775e) - this.f21820Z) + i9;
        } else {
            i10 = paddingLeft + this.f21820Z + i9;
        }
        this.f21776f = i10;
    }
}
