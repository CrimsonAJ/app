package z5;

import F5.m;
import P.Q;
import Q2.U;
import X0.C0426a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import h5.AbstractC1281a;
import i5.C1380a;
import java.util.HashSet;
import java.util.WeakHashMap;
import o.l;
import o.n;
import o.z;

/* loaded from: classes.dex */
public abstract class e extends ViewGroup implements z {

    /* renamed from: g0, reason: collision with root package name */
    public static final int[] f25457g0 = {R.attr.state_checked};

    /* renamed from: h0, reason: collision with root package name */
    public static final int[] f25458h0 = {-16842910};

    /* renamed from: A, reason: collision with root package name */
    public m f25459A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f25460B;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f25461C;

    /* renamed from: D, reason: collision with root package name */
    public g f25462D;

    /* renamed from: a, reason: collision with root package name */
    public final C0426a f25463a;

    /* renamed from: b, reason: collision with root package name */
    public final U f25464b;

    /* renamed from: c, reason: collision with root package name */
    public final O.d f25465c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray f25466d;

    /* renamed from: e, reason: collision with root package name */
    public int f25467e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC2250c[] f25468f;

    /* renamed from: f0, reason: collision with root package name */
    public l f25469f0;

    /* renamed from: g, reason: collision with root package name */
    public int f25470g;

    /* renamed from: h, reason: collision with root package name */
    public int f25471h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f25472i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f25473k;

    /* renamed from: l, reason: collision with root package name */
    public final ColorStateList f25474l;

    /* renamed from: m, reason: collision with root package name */
    public int f25475m;

    /* renamed from: n, reason: collision with root package name */
    public int f25476n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f25477o;

    /* renamed from: p, reason: collision with root package name */
    public Drawable f25478p;

    /* renamed from: q, reason: collision with root package name */
    public ColorStateList f25479q;

    /* renamed from: r, reason: collision with root package name */
    public int f25480r;

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f25481s;

    /* renamed from: t, reason: collision with root package name */
    public int f25482t;

    /* renamed from: u, reason: collision with root package name */
    public int f25483u;

    /* renamed from: v, reason: collision with root package name */
    public int f25484v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f25485w;

    /* renamed from: x, reason: collision with root package name */
    public int f25486x;

    /* renamed from: y, reason: collision with root package name */
    public int f25487y;

    /* renamed from: z, reason: collision with root package name */
    public int f25488z;

    public e(Context context) {
        super(context);
        this.f25465c = new O.d(5);
        this.f25466d = new SparseArray(5);
        this.f25470g = 0;
        this.f25471h = 0;
        this.f25481s = new SparseArray(5);
        this.f25482t = -1;
        this.f25483u = -1;
        this.f25484v = -1;
        this.f25460B = false;
        this.f25474l = c();
        if (isInEditMode()) {
            this.f25463a = null;
        } else {
            C0426a c0426a = new C0426a();
            this.f25463a = c0426a;
            c0426a.O(0);
            c0426a.D(Z0.a.y(getContext(), co.notix.R.attr.motionDurationMedium4, getResources().getInteger(co.notix.R.integer.material_motion_duration_long_1)));
            c0426a.F(Z0.a.z(getContext(), co.notix.R.attr.motionEasingStandard, AbstractC1281a.f17926b));
            c0426a.L(new X0.m());
        }
        this.f25464b = new U(6, (l5.b) this);
        WeakHashMap weakHashMap = Q.f5546a;
        setImportantForAccessibility(1);
    }

    private AbstractC2250c getNewItem() {
        AbstractC2250c abstractC2250c = (AbstractC2250c) this.f25465c.a();
        if (abstractC2250c == null) {
            return new AbstractC2250c(getContext());
        }
        return abstractC2250c;
    }

    private void setBadgeIfNeeded(AbstractC2250c abstractC2250c) {
        C1380a c1380a;
        int id = abstractC2250c.getId();
        if (id != -1 && (c1380a = (C1380a) this.f25481s.get(id)) != null) {
            abstractC2250c.setBadge(c1380a);
        }
    }

    public final void a() {
        boolean z9;
        removeAllViews();
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                if (abstractC2250c != null) {
                    this.f25465c.c(abstractC2250c);
                    if (abstractC2250c.f25436g0 != null) {
                        ImageView imageView = abstractC2250c.f25442n;
                        if (imageView != null) {
                            abstractC2250c.setClipChildren(true);
                            abstractC2250c.setClipToPadding(true);
                            C1380a c1380a = abstractC2250c.f25436g0;
                            if (c1380a != null) {
                                if (c1380a.d() != null) {
                                    c1380a.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c1380a);
                                }
                            }
                        }
                        abstractC2250c.f25436g0 = null;
                    }
                    abstractC2250c.f25448t = null;
                    abstractC2250c.f25454z = 0.0f;
                    abstractC2250c.f25428a = false;
                }
            }
        }
        if (this.f25469f0.f21380f.size() == 0) {
            this.f25470g = 0;
            this.f25471h = 0;
            this.f25468f = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < this.f25469f0.f21380f.size(); i9++) {
            hashSet.add(Integer.valueOf(this.f25469f0.getItem(i9).getItemId()));
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f25481s;
            if (i10 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i10);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i10++;
        }
        this.f25468f = new AbstractC2250c[this.f25469f0.f21380f.size()];
        int i11 = this.f25467e;
        int size = this.f25469f0.l().size();
        if (i11 != -1 ? i11 == 0 : size > 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        for (int i12 = 0; i12 < this.f25469f0.f21380f.size(); i12++) {
            this.f25462D.f25492b = true;
            this.f25469f0.getItem(i12).setCheckable(true);
            this.f25462D.f25492b = false;
            AbstractC2250c newItem = getNewItem();
            this.f25468f[i12] = newItem;
            newItem.setIconTintList(this.f25472i);
            newItem.setIconSize(this.j);
            newItem.setTextColor(this.f25474l);
            newItem.setTextAppearanceInactive(this.f25475m);
            newItem.setTextAppearanceActive(this.f25476n);
            newItem.setTextAppearanceActiveBoldEnabled(this.f25477o);
            newItem.setTextColor(this.f25473k);
            int i13 = this.f25482t;
            if (i13 != -1) {
                newItem.setItemPaddingTop(i13);
            }
            int i14 = this.f25483u;
            if (i14 != -1) {
                newItem.setItemPaddingBottom(i14);
            }
            int i15 = this.f25484v;
            if (i15 != -1) {
                newItem.setActiveIndicatorLabelPadding(i15);
            }
            newItem.setActiveIndicatorWidth(this.f25486x);
            newItem.setActiveIndicatorHeight(this.f25487y);
            newItem.setActiveIndicatorMarginHorizontal(this.f25488z);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.f25460B);
            newItem.setActiveIndicatorEnabled(this.f25485w);
            Drawable drawable = this.f25478p;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.f25480r);
            }
            newItem.setItemRippleColor(this.f25479q);
            newItem.setShifting(z9);
            newItem.setLabelVisibilityMode(this.f25467e);
            n nVar = (n) this.f25469f0.getItem(i12);
            newItem.a(nVar);
            newItem.setItemPosition(i12);
            SparseArray sparseArray2 = this.f25466d;
            int i16 = nVar.f21404a;
            newItem.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i16));
            newItem.setOnClickListener(this.f25464b);
            int i17 = this.f25470g;
            if (i17 != 0 && i16 == i17) {
                this.f25471h = i12;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.f25469f0.f21380f.size() - 1, this.f25471h);
        this.f25471h = min;
        this.f25469f0.getItem(min).setChecked(true);
    }

    @Override // o.z
    public final void b(l lVar) {
        this.f25469f0 = lVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            ColorStateList c3 = E.d.c(getContext(), typedValue.resourceId);
            if (!getContext().getTheme().resolveAttribute(co.notix.R.attr.colorPrimary, typedValue, true)) {
                return null;
            }
            int i9 = typedValue.data;
            int defaultColor = c3.getDefaultColor();
            int[] iArr = f25458h0;
            return new ColorStateList(new int[][]{iArr, f25457g0, ViewGroup.EMPTY_STATE_SET}, new int[]{c3.getColorForState(iArr, defaultColor), i9, defaultColor});
        }
        return null;
    }

    public final F5.h d() {
        if (this.f25459A != null && this.f25461C != null) {
            F5.h hVar = new F5.h(this.f25459A);
            hVar.k(this.f25461C);
            return hVar;
        }
        return null;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f25484v;
    }

    public SparseArray<C1380a> getBadgeDrawables() {
        return this.f25481s;
    }

    public ColorStateList getIconTintList() {
        return this.f25472i;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f25461C;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f25485w;
    }

    public int getItemActiveIndicatorHeight() {
        return this.f25487y;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f25488z;
    }

    public m getItemActiveIndicatorShapeAppearance() {
        return this.f25459A;
    }

    public int getItemActiveIndicatorWidth() {
        return this.f25486x;
    }

    public Drawable getItemBackground() {
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null && abstractC2250cArr.length > 0) {
            return abstractC2250cArr[0].getBackground();
        }
        return this.f25478p;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f25480r;
    }

    public int getItemIconSize() {
        return this.j;
    }

    public int getItemPaddingBottom() {
        return this.f25483u;
    }

    public int getItemPaddingTop() {
        return this.f25482t;
    }

    public ColorStateList getItemRippleColor() {
        return this.f25479q;
    }

    public int getItemTextAppearanceActive() {
        return this.f25476n;
    }

    public int getItemTextAppearanceInactive() {
        return this.f25475m;
    }

    public ColorStateList getItemTextColor() {
        return this.f25473k;
    }

    public int getLabelVisibilityMode() {
        return this.f25467e;
    }

    public l getMenu() {
        return this.f25469f0;
    }

    public int getSelectedItemId() {
        return this.f25470g;
    }

    public int getSelectedItemPosition() {
        return this.f25471h;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) s4.i.L(1, this.f25469f0.l().size(), 1).f22734a);
    }

    public void setActiveIndicatorLabelPadding(int i9) {
        this.f25484v = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setActiveIndicatorLabelPadding(i9);
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f25472i = colorStateList;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f25461C = colorStateList;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z9) {
        this.f25485w = z9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setActiveIndicatorEnabled(z9);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i9) {
        this.f25487y = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setActiveIndicatorHeight(i9);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i9) {
        this.f25488z = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setActiveIndicatorMarginHorizontal(i9);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z9) {
        this.f25460B = z9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setActiveIndicatorResizeable(z9);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(m mVar) {
        this.f25459A = mVar;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i9) {
        this.f25486x = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setActiveIndicatorWidth(i9);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.f25478p = drawable;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i9) {
        this.f25480r = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setItemBackground(i9);
            }
        }
    }

    public void setItemIconSize(int i9) {
        this.j = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setIconSize(i9);
            }
        }
    }

    public void setItemPaddingBottom(int i9) {
        this.f25483u = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setItemPaddingBottom(i9);
            }
        }
    }

    public void setItemPaddingTop(int i9) {
        this.f25482t = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setItemPaddingTop(i9);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f25479q = colorStateList;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i9) {
        this.f25476n = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setTextAppearanceActive(i9);
                ColorStateList colorStateList = this.f25473k;
                if (colorStateList != null) {
                    abstractC2250c.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z9) {
        this.f25477o = z9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setTextAppearanceActiveBoldEnabled(z9);
            }
        }
    }

    public void setItemTextAppearanceInactive(int i9) {
        this.f25475m = i9;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setTextAppearanceInactive(i9);
                ColorStateList colorStateList = this.f25473k;
                if (colorStateList != null) {
                    abstractC2250c.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f25473k = colorStateList;
        AbstractC2250c[] abstractC2250cArr = this.f25468f;
        if (abstractC2250cArr != null) {
            for (AbstractC2250c abstractC2250c : abstractC2250cArr) {
                abstractC2250c.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i9) {
        this.f25467e = i9;
    }

    public void setPresenter(g gVar) {
        this.f25462D = gVar;
    }
}
