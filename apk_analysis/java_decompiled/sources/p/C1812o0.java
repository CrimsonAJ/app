package p;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import co.notix.R;
import java.lang.reflect.InvocationTargetException;

/* renamed from: p.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1812o0 extends ListView {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f22040a;

    /* renamed from: b, reason: collision with root package name */
    public int f22041b;

    /* renamed from: c, reason: collision with root package name */
    public int f22042c;

    /* renamed from: d, reason: collision with root package name */
    public int f22043d;

    /* renamed from: e, reason: collision with root package name */
    public int f22044e;

    /* renamed from: f, reason: collision with root package name */
    public int f22045f;

    /* renamed from: g, reason: collision with root package name */
    public C1808m0 f22046g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22047h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f22048i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public S.d f22049k;

    /* renamed from: l, reason: collision with root package name */
    public m5.c f22050l;

    public C1812o0(Context context, boolean z9) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f22040a = new Rect();
        this.f22041b = 0;
        this.f22042c = 0;
        this.f22043d = 0;
        this.f22044e = 0;
        this.f22048i = z9;
        setCacheColorHint(0);
    }

    public final int a(int i9, int i10) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i11 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i12 = 0;
        View view = null;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i14 = layoutParams.height;
            if (i14 > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i9, makeMeasureSpec);
            view.forceLayout();
            if (i13 > 0) {
                i11 += dividerHeight;
            }
            i11 += view.getMeasuredHeight();
            if (i11 >= i10) {
                return i10;
            }
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x014a A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1812o0.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f22040a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f22050l == null) {
            super.drawableStateChanged();
            C1808m0 c1808m0 = this.f22046g;
            if (c1808m0 != null) {
                c1808m0.f22032b = true;
            }
            Drawable selector = getSelector();
            if (selector != null && this.j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        if (!this.f22048i && !super.hasFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        if (!this.f22048i && !super.hasWindowFocus()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        if (!this.f22048i && !super.isFocused()) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        if ((this.f22048i && this.f22047h) || super.isInTouchMode()) {
            return true;
        }
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f22050l = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i9 = 2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f22050l == null) {
            m5.c cVar = new m5.c(i9, this);
            this.f22050l = cVar;
            post(cVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return onHoverEvent;
        }
        int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 >= 30 && AbstractC1804k0.f22006d) {
                    try {
                        AbstractC1804k0.f22003a.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1804k0.f22004b.invoke(this, Integer.valueOf(pointToPosition));
                        AbstractC1804k0.f22005c.invoke(this, Integer.valueOf(pointToPosition));
                    } catch (IllegalAccessException e8) {
                        e8.printStackTrace();
                    } catch (InvocationTargetException e9) {
                        e9.printStackTrace();
                    }
                } else {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.j && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f22045f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        m5.c cVar = this.f22050l;
        if (cVar != null) {
            C1812o0 c1812o0 = (C1812o0) cVar.f20840b;
            c1812o0.f22050l = null;
            c1812o0.removeCallbacks(cVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z9) {
        this.f22047h = z9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [p.m0, android.graphics.drawable.Drawable$Callback, android.graphics.drawable.Drawable] */
    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1808m0 c1808m0 = null;
        if (drawable != 0) {
            ?? drawable2 = new Drawable();
            Drawable drawable3 = drawable2.f22031a;
            if (drawable3 != null) {
                drawable3.setCallback(null);
            }
            drawable2.f22031a = drawable;
            drawable.setCallback(drawable2);
            drawable2.f22032b = true;
            c1808m0 = drawable2;
        }
        this.f22046g = c1808m0;
        super.setSelector(c1808m0);
        Rect rect = new Rect();
        if (drawable != 0) {
            drawable.getPadding(rect);
        }
        this.f22041b = rect.left;
        this.f22042c = rect.top;
        this.f22043d = rect.right;
        this.f22044e = rect.bottom;
    }
}
