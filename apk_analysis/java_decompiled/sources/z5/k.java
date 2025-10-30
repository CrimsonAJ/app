package z5;

import F5.m;
import P.Q;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import b5.G1;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.messaging.u;
import g5.AbstractC1254a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import o.x;
import o.z;
import w5.p;

/* loaded from: classes.dex */
public abstract class k extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final d f25495a;

    /* renamed from: b, reason: collision with root package name */
    public final l5.b f25496b;

    /* renamed from: c, reason: collision with root package name */
    public final g f25497c;

    /* renamed from: d, reason: collision with root package name */
    public n.h f25498d;

    /* renamed from: e, reason: collision with root package name */
    public i f25499e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [o.x, java.lang.Object, z5.g] */
    public k(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        ?? obj = new Object();
        obj.f25492b = false;
        this.f25497c = obj;
        Context context2 = getContext();
        G1 j = p.j(context2, attributeSet, AbstractC1254a.f17721F, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 12, 10);
        d dVar = new d(context2, getClass(), getMaxItemCount());
        this.f25495a = dVar;
        l5.b bVar = new l5.b(context2);
        this.f25496b = bVar;
        obj.f25491a = bVar;
        obj.f25493c = 1;
        bVar.setPresenter(obj);
        dVar.b(obj, dVar.f21375a);
        getContext();
        obj.f25491a.f25469f0 = dVar;
        TypedArray typedArray = (TypedArray) j.f10718c;
        if (typedArray.hasValue(6)) {
            bVar.setIconTintList(j.n(6));
        } else {
            bVar.setIconTintList(bVar.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(j.n(13));
        }
        Drawable background = getBackground();
        ColorStateList u9 = O4.h.u(background);
        if (background == null || u9 != null) {
            F5.h hVar = new F5.h(m.b(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (u9 != null) {
                hVar.k(u9);
            }
            hVar.i(context2);
            WeakHashMap weakHashMap = Q.f5546a;
            setBackground(hVar);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(D1.q(context2, j, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            bVar.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(D1.q(context2, j, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC1254a.f17720E);
            setItemActiveIndicatorWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(obtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(obtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(D1.p(context2, obtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(m.a(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new F5.a(0)).a());
            obtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            int resourceId3 = typedArray.getResourceId(15, 0);
            obj.f25492b = true;
            getMenuInflater().inflate(resourceId3, dVar);
            obj.f25492b = false;
            obj.f(true);
        }
        j.y();
        addView(bVar);
        dVar.f21379e = new u((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f25498d == null) {
            this.f25498d = new n.h(getContext());
        }
        return this.f25498d;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f25496b.getActiveIndicatorLabelPadding();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f25496b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f25496b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f25496b.getItemActiveIndicatorMarginHorizontal();
    }

    public m getItemActiveIndicatorShapeAppearance() {
        return this.f25496b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f25496b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f25496b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f25496b.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f25496b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f25496b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f25496b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f25496b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f25496b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f25496b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f25496b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f25496b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f25496b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f25495a;
    }

    public z getMenuView() {
        return this.f25496b;
    }

    public g getPresenter() {
        return this.f25497c;
    }

    public int getSelectedItemId() {
        return this.f25496b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1002u1.c0(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f7246a);
        Bundle bundle = jVar.f25494c;
        d dVar = this.f25495a;
        dVar.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = dVar.f21394u;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    x xVar = (x) weakReference.get();
                    if (xVar == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        int id = xVar.getId();
                        if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                            xVar.b(parcelable2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, U.b, z5.j] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable k5;
        ?? bVar = new U.b(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bVar.f25494c = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f25495a.f21394u;
        if (copyOnWriteArrayList.isEmpty()) {
            return bVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = xVar.getId();
                if (id > 0 && (k5 = xVar.k()) != null) {
                    sparseArray.put(id, k5);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return bVar;
    }

    public void setActiveIndicatorLabelPadding(int i9) {
        this.f25496b.setActiveIndicatorLabelPadding(i9);
    }

    @Override // android.view.View
    public void setElevation(float f9) {
        super.setElevation(f9);
        AbstractC1002u1.a0(this, f9);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f25496b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z9) {
        this.f25496b.setItemActiveIndicatorEnabled(z9);
    }

    public void setItemActiveIndicatorHeight(int i9) {
        this.f25496b.setItemActiveIndicatorHeight(i9);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i9) {
        this.f25496b.setItemActiveIndicatorMarginHorizontal(i9);
    }

    public void setItemActiveIndicatorShapeAppearance(m mVar) {
        this.f25496b.setItemActiveIndicatorShapeAppearance(mVar);
    }

    public void setItemActiveIndicatorWidth(int i9) {
        this.f25496b.setItemActiveIndicatorWidth(i9);
    }

    public void setItemBackground(Drawable drawable) {
        this.f25496b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i9) {
        this.f25496b.setItemBackgroundRes(i9);
    }

    public void setItemIconSize(int i9) {
        this.f25496b.setItemIconSize(i9);
    }

    public void setItemIconSizeRes(int i9) {
        setItemIconSize(getResources().getDimensionPixelSize(i9));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f25496b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i9) {
        this.f25496b.setItemPaddingBottom(i9);
    }

    public void setItemPaddingTop(int i9) {
        this.f25496b.setItemPaddingTop(i9);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f25496b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i9) {
        this.f25496b.setItemTextAppearanceActive(i9);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z9) {
        this.f25496b.setItemTextAppearanceActiveBoldEnabled(z9);
    }

    public void setItemTextAppearanceInactive(int i9) {
        this.f25496b.setItemTextAppearanceInactive(i9);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f25496b.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i9) {
        l5.b bVar = this.f25496b;
        if (bVar.getLabelVisibilityMode() != i9) {
            bVar.setLabelVisibilityMode(i9);
            this.f25497c.f(false);
        }
    }

    public void setOnItemSelectedListener(i iVar) {
        this.f25499e = iVar;
    }

    public void setSelectedItemId(int i9) {
        d dVar = this.f25495a;
        MenuItem findItem = dVar.findItem(i9);
        if (findItem != null && !dVar.q(findItem, this.f25497c, 0)) {
            findItem.setChecked(true);
        }
    }

    public void setOnItemReselectedListener(h hVar) {
    }
}
