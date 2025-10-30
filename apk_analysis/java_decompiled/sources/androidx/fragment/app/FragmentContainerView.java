package androidx.fragment.app;

import A0.a;
import P.F;
import P.Q;
import P.u0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import co.notix.R;
import h0.AbstractC1261a;
import i0.AbstractActivityC1369y;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1329F;
import i0.C1343U;
import i0.C1345a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9778a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9779b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f9780c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9781d;

    public FragmentContainerView(Context context) {
        super(context);
        this.f9778a = new ArrayList();
        this.f9779b = new ArrayList();
        this.f9781d = true;
    }

    public final void a(View view) {
        if (this.f9779b.contains(view)) {
            this.f9778a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View child, int i9, ViewGroup.LayoutParams layoutParams) {
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        h.e(child, "child");
        Object tag = child.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof AbstractComponentCallbacksC1366v) {
            abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) tag;
        } else {
            abstractComponentCallbacksC1366v = null;
        }
        if (abstractComponentCallbacksC1366v != null) {
            super.addView(child, i9, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        u0 u0Var;
        h.e(insets, "insets");
        u0 g9 = u0.g(null, insets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f9780c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, insets);
            h.d(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            u0Var = u0.g(null, onApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = Q.f5546a;
            WindowInsets f9 = g9.f();
            if (f9 != null) {
                WindowInsets b9 = F.b(this, f9);
                if (!b9.equals(f9)) {
                    g9 = u0.g(this, b9);
                }
            }
            u0Var = g9;
        }
        if (!u0Var.f5645a.m()) {
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                Q.b(getChildAt(i9), u0Var);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h.e(canvas, "canvas");
        if (this.f9781d) {
            ArrayList arrayList = this.f9778a;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View child, long j) {
        h.e(canvas, "canvas");
        h.e(child, "child");
        if (this.f9781d) {
            ArrayList arrayList = this.f9778a;
            if (!arrayList.isEmpty() && arrayList.contains(child)) {
                return false;
            }
        }
        return super.drawChild(canvas, child, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        h.e(view, "view");
        this.f9779b.remove(view);
        if (this.f9778a.remove(view)) {
            this.f9781d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC1366v> F getFragment() {
        AbstractActivityC1369y abstractActivityC1369y;
        AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v;
        AbstractC1336M P8;
        View view = this;
        while (true) {
            abstractActivityC1369y = null;
            if (view != null) {
                Object tag = view.getTag(R.id.fragment_container_view_tag);
                if (tag instanceof AbstractComponentCallbacksC1366v) {
                    abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) tag;
                } else {
                    abstractComponentCallbacksC1366v = null;
                }
                if (abstractComponentCallbacksC1366v != null) {
                    break;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            } else {
                abstractComponentCallbacksC1366v = null;
                break;
            }
        }
        if (abstractComponentCallbacksC1366v != null) {
            if (abstractComponentCallbacksC1366v.y()) {
                P8 = abstractComponentCallbacksC1366v.l();
            } else {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC1366v + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC1369y) {
                    abstractActivityC1369y = (AbstractActivityC1369y) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC1369y != null) {
                P8 = abstractActivityC1369y.P();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) P8.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        h.e(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View view = getChildAt(childCount);
                h.d(view, "view");
                a(view);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        h.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i9) {
        View view = getChildAt(i9);
        h.d(view, "view");
        a(view);
        super.removeViewAt(i9);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        h.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i9, int i10) {
        int i11 = i9 + i10;
        for (int i12 = i9; i12 < i11; i12++) {
            View view = getChildAt(i12);
            h.d(view, "view");
            a(view);
        }
        super.removeViews(i9, i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i9, int i10) {
        int i11 = i9 + i10;
        for (int i12 = i9; i12 < i11; i12++) {
            View view = getChildAt(i12);
            h.d(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i9, i10);
    }

    public final void setDrawDisappearingViewsLast(boolean z9) {
        this.f9781d = z9;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        h.e(listener, "listener");
        this.f9780c = listener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        h.e(view, "view");
        if (view.getParent() == this) {
            this.f9779b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        h.e(context, "context");
        this.f9778a = new ArrayList();
        this.f9779b = new ArrayList();
        this.f9781d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1261a.f17831b, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, AbstractC1336M fm) {
        super(context, attrs);
        View view;
        h.e(context, "context");
        h.e(attrs, "attrs");
        h.e(fm, "fm");
        this.f9778a = new ArrayList();
        this.f9779b = new ArrayList();
        this.f9781d = true;
        String classAttribute = attrs.getClassAttribute();
        int i9 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, AbstractC1261a.f17831b, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC1366v B9 = fm.B(id);
        if (classAttribute != null && B9 == null) {
            if (id == -1) {
                throw new IllegalStateException(a.n("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C1329F E8 = fm.E();
            context.getClassLoader();
            AbstractComponentCallbacksC1366v a5 = E8.a(classAttribute);
            h.d(a5, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            a5.f18420w = id;
            a5.f18421x = id;
            a5.f18422y = string;
            a5.f18414s = fm;
            a5.f18416t = fm.f18215u;
            a5.M(context, attrs, null);
            C1345a c1345a = new C1345a(fm);
            c1345a.f18296p = true;
            a5.f18383X = this;
            c1345a.g(getId(), a5, string, 1);
            if (!c1345a.f18288g) {
                c1345a.f18289h = false;
                c1345a.f18297q.y(c1345a, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList o9 = fm.f18198c.o();
        int size = o9.size();
        while (i9 < size) {
            Object obj = o9.get(i9);
            i9++;
            C1343U c1343u = (C1343U) obj;
            AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = c1343u.f18251c;
            if (abstractComponentCallbacksC1366v.f18421x == getId() && (view = abstractComponentCallbacksC1366v.Y) != null && view.getParent() == null) {
                abstractComponentCallbacksC1366v.f18383X = this;
                c1343u.b();
            }
        }
    }
}
