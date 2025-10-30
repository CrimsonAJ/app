package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.AbstractC1260a;
import java.lang.ref.WeakReference;
import p.e1;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f9523a;

    /* renamed from: b, reason: collision with root package name */
    public int f9524b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f9525c;

    /* renamed from: d, reason: collision with root package name */
    public LayoutInflater f9526d;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f9523a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1260a.f17804A, 0, 0);
        this.f9524b = obtainStyledAttributes.getResourceId(2, -1);
        this.f9523a = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f9523a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f9526d;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f9523a, viewGroup, false);
                int i9 = this.f9524b;
                if (i9 != -1) {
                    inflate.setId(i9);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f9525c = new WeakReference(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f9524b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f9526d;
    }

    public int getLayoutResource() {
        return this.f9523a;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i9) {
        this.f9524b = i9;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f9526d = layoutInflater;
    }

    public void setLayoutResource(int i9) {
        this.f9523a = i9;
    }

    @Override // android.view.View
    public void setVisibility(int i9) {
        WeakReference weakReference = this.f9525c;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i9);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i9);
        if (i9 != 0 && i9 != 4) {
            return;
        }
        a();
    }

    public void setOnInflateListener(e1 e1Var) {
    }
}
