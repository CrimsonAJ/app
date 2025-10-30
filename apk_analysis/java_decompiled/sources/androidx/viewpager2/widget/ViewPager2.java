package androidx.viewpager2.widget;

import A4.e;
import D4.s;
import F0.S;
import F0.Z;
import P.Q;
import X1.p;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.lifecycle.C0547h;
import androidx.recyclerview.widget.a;
import b1.AbstractC0587a;
import b7.C0701c;
import c2.C0768n;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import com.google.firebase.messaging.u;
import d1.C1096b;
import d1.C1097c;
import d1.C1098d;
import d1.C1099e;
import d1.C1100f;
import d1.C1102h;
import d1.C1105k;
import d1.InterfaceC1104j;
import d1.l;
import d1.m;
import i0.AbstractC1336M;
import i0.AbstractComponentCallbacksC1366v;
import i0.C1365u;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l1.C1535g;
import s.C1937g;
import s4.i;

/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f10392a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f10393b;

    /* renamed from: c, reason: collision with root package name */
    public final p f10394c;

    /* renamed from: d, reason: collision with root package name */
    public int f10395d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10396e;

    /* renamed from: f, reason: collision with root package name */
    public final C1099e f10397f;

    /* renamed from: g, reason: collision with root package name */
    public final C1102h f10398g;

    /* renamed from: h, reason: collision with root package name */
    public int f10399h;

    /* renamed from: i, reason: collision with root package name */
    public Parcelable f10400i;
    public final l j;

    /* renamed from: k, reason: collision with root package name */
    public final C1105k f10401k;

    /* renamed from: l, reason: collision with root package name */
    public final C1098d f10402l;

    /* renamed from: m, reason: collision with root package name */
    public final p f10403m;

    /* renamed from: n, reason: collision with root package name */
    public final u f10404n;

    /* renamed from: o, reason: collision with root package name */
    public final C1096b f10405o;

    /* renamed from: p, reason: collision with root package name */
    public Z f10406p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10407q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10408r;

    /* renamed from: s, reason: collision with root package name */
    public int f10409s;

    /* renamed from: t, reason: collision with root package name */
    public final C1535g f10410t;

    /* JADX WARN: Type inference failed for: r12v21, types: [java.lang.Object, d1.b] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, l1.g] */
    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10392a = new Rect();
        this.f10393b = new Rect();
        p pVar = new p();
        this.f10394c = pVar;
        int i9 = 0;
        this.f10396e = false;
        this.f10397f = new C1099e(i9, this);
        this.f10399h = -1;
        this.f10406p = null;
        this.f10407q = false;
        int i10 = 1;
        this.f10408r = true;
        this.f10409s = -1;
        ?? obj = new Object();
        obj.f20185d = this;
        obj.f20182a = new i((Object) obj);
        obj.f20183b = new C0701c(26, (Object) obj);
        this.f10410t = obj;
        l lVar = new l(this, context);
        this.j = lVar;
        WeakHashMap weakHashMap = Q.f5546a;
        lVar.setId(View.generateViewId());
        this.j.setDescendantFocusability(131072);
        C1102h c1102h = new C1102h(this);
        this.f10398g = c1102h;
        this.j.setLayoutManager(c1102h);
        this.j.setScrollingTouchSlop(1);
        int[] iArr = AbstractC0587a.f10471a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        Q.l(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            this.j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            l lVar2 = this.j;
            Object obj2 = new Object();
            if (lVar2.f10245C == null) {
                lVar2.f10245C = new ArrayList();
            }
            lVar2.f10245C.add(obj2);
            C1098d c1098d = new C1098d(this);
            this.f10402l = c1098d;
            this.f10404n = new u(c1098d);
            C1105k c1105k = new C1105k(this);
            this.f10401k = c1105k;
            c1105k.a(this.j);
            this.j.j(this.f10402l);
            p pVar2 = new p();
            this.f10403m = pVar2;
            this.f10402l.f16693a = pVar2;
            C1100f c1100f = new C1100f(this, i9);
            C1100f c1100f2 = new C1100f(this, i10);
            ((ArrayList) pVar2.f8284b).add(c1100f);
            ((ArrayList) this.f10403m.f8284b).add(c1100f2);
            C1535g c1535g = this.f10410t;
            l lVar3 = this.j;
            c1535g.getClass();
            lVar3.setImportantForAccessibility(2);
            c1535g.f20184c = new C1099e(i10, c1535g);
            ViewPager2 viewPager2 = (ViewPager2) c1535g.f20185d;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            ((ArrayList) this.f10403m.f8284b).add(pVar);
            ?? obj3 = new Object();
            this.f10405o = obj3;
            ((ArrayList) this.f10403m.f8284b).add(obj3);
            l lVar4 = this.j;
            attachViewToParent(lVar4, 0, lVar4.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void a() {
        S adapter;
        boolean z9;
        AbstractComponentCallbacksC1366v j;
        if (this.f10399h == -1 || (adapter = getAdapter()) == null) {
            return;
        }
        Parcelable parcelable = this.f10400i;
        if (parcelable != null) {
            if (adapter instanceof C0768n) {
                C0768n c0768n = (C0768n) adapter;
                C1937g c1937g = c0768n.f11628g;
                if (c1937g.m() == 0) {
                    C1937g c1937g2 = c0768n.f11627f;
                    if (c1937g2.m() == 0) {
                        Bundle bundle = (Bundle) parcelable;
                        if (bundle.getClassLoader() == null) {
                            bundle.setClassLoader(C0768n.class.getClassLoader());
                        }
                        for (String str : bundle.keySet()) {
                            if (str.startsWith("f#") && str.length() > 2) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                long parseLong = Long.parseLong(str.substring(2));
                                AbstractC1336M abstractC1336M = c0768n.f11626e;
                                abstractC1336M.getClass();
                                String string = bundle.getString(str);
                                if (string == null) {
                                    j = null;
                                } else {
                                    j = abstractC1336M.f18198c.j(string);
                                    if (j == null) {
                                        abstractC1336M.d0(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
                                        throw null;
                                    }
                                }
                                c1937g2.k(parseLong, j);
                            } else if (str.startsWith("s#") && str.length() > 2) {
                                long parseLong2 = Long.parseLong(str.substring(2));
                                C1365u c1365u = (C1365u) bundle.getParcelable(str);
                                if (C0768n.o(parseLong2)) {
                                    c1937g.k(parseLong2, c1365u);
                                }
                            } else {
                                throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                            }
                        }
                        if (c1937g2.m() != 0) {
                            c0768n.f11632l = true;
                            c0768n.f11631k = true;
                            c0768n.p();
                            Handler handler = new Handler(Looper.getMainLooper());
                            e eVar = new e(18, c0768n);
                            c0768n.f11625d.V(new C0547h(handler, 4, eVar));
                            handler.postDelayed(eVar, 10000L);
                        }
                    }
                }
                throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
            }
            this.f10400i = null;
        }
        int max = Math.max(0, Math.min(this.f10399h, adapter.a() - 1));
        this.f10395d = max;
        this.f10399h = -1;
        this.j.h0(max);
        this.f10410t.J();
    }

    public final void b(int i9, boolean z9) {
        Object obj = this.f10404n.f16512a;
        c(i9, z9);
    }

    public final void c(int i9, boolean z9) {
        int i10;
        int i11;
        S adapter = getAdapter();
        boolean z10 = false;
        if (adapter == null) {
            if (this.f10399h != -1) {
                this.f10399h = Math.max(i9, 0);
                return;
            }
            return;
        }
        if (adapter.a() > 0) {
            int min = Math.min(Math.max(i9, 0), adapter.a() - 1);
            int i12 = this.f10395d;
            if (min == i12 && this.f10402l.f16698f == 0) {
                return;
            }
            if (min == i12 && z9) {
                return;
            }
            double d9 = i12;
            this.f10395d = min;
            this.f10410t.J();
            C1098d c1098d = this.f10402l;
            if (c1098d.f16698f != 0) {
                c1098d.f();
                C1097c c1097c = c1098d.f16699g;
                d9 = c1097c.f16691b + c1097c.f16690a;
            }
            C1098d c1098d2 = this.f10402l;
            c1098d2.getClass();
            if (z9) {
                i10 = 2;
            } else {
                i10 = 3;
            }
            c1098d2.f16697e = i10;
            if (c1098d2.f16701i != min) {
                z10 = true;
            }
            c1098d2.f16701i = min;
            c1098d2.d(2);
            if (z10) {
                c1098d2.c(min);
            }
            if (!z9) {
                this.j.h0(min);
                return;
            }
            double d10 = min;
            if (Math.abs(d10 - d9) > 3.0d) {
                l lVar = this.j;
                if (d10 > d9) {
                    i11 = min - 3;
                } else {
                    i11 = min + 3;
                }
                lVar.h0(i11);
                l lVar2 = this.j;
                lVar2.post(new s(min, lVar2));
                return;
            }
            this.j.k0(min);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i9) {
        return this.j.canScrollHorizontally(i9);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i9) {
        return this.j.canScrollVertically(i9);
    }

    public final void d() {
        C1105k c1105k = this.f10401k;
        if (c1105k != null) {
            View e8 = c1105k.e(this.f10398g);
            if (e8 == null) {
                return;
            }
            this.f10398g.getClass();
            int L8 = a.L(e8);
            if (L8 != this.f10395d && getScrollState() == 0) {
                this.f10403m.c(L8);
            }
            this.f10396e = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof m) {
            int i9 = ((m) parcelable).f16711a;
            sparseArray.put(this.j.getId(), (Parcelable) sparseArray.get(i9));
            sparseArray.remove(i9);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.f10410t.getClass();
        this.f10410t.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public S getAdapter() {
        return this.j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f10395d;
    }

    public int getItemDecorationCount() {
        return this.j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f10409s;
    }

    public int getOrientation() {
        if (this.f10398g.f10221p == 1) {
            return 1;
        }
        return 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        l lVar = this.j;
        if (getOrientation() == 0) {
            height = lVar.getWidth() - lVar.getPaddingLeft();
            paddingBottom = lVar.getPaddingRight();
        } else {
            height = lVar.getHeight() - lVar.getPaddingTop();
            paddingBottom = lVar.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f10402l.f16698f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        int i10;
        int a5;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = (ViewPager2) this.f10410t.f20185d;
        if (viewPager2.getAdapter() != null) {
            if (viewPager2.getOrientation() == 1) {
                i9 = viewPager2.getAdapter().a();
                i10 = 1;
            } else {
                i10 = viewPager2.getAdapter().a();
                i9 = 1;
            }
        } else {
            i9 = 0;
            i10 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i.L(i9, i10, 0).f22734a);
        S adapter = viewPager2.getAdapter();
        if (adapter != null && (a5 = adapter.a()) != 0 && viewPager2.f10408r) {
            if (viewPager2.f10395d > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.f10395d < a5 - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.f10392a;
        rect.left = paddingLeft;
        rect.right = (i11 - i9) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i12 - i10) - getPaddingBottom();
        Rect rect2 = this.f10393b;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.j.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.f10396e) {
            d();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        measureChild(this.j, i9, i10);
        int measuredWidth = this.j.getMeasuredWidth();
        int measuredHeight = this.j.getMeasuredHeight();
        int measuredState = this.j.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i9, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.getSuperState());
        this.f10399h = mVar.f16712b;
        this.f10400i = mVar.f16713c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, d1.m, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.f16711a = this.j.getId();
        int i9 = this.f10399h;
        if (i9 == -1) {
            i9 = this.f10395d;
        }
        baseSavedState.f16712b = i9;
        Parcelable parcelable = this.f10400i;
        if (parcelable != null) {
            baseSavedState.f16713c = parcelable;
            return baseSavedState;
        }
        S adapter = this.j.getAdapter();
        if (adapter instanceof C0768n) {
            C0768n c0768n = (C0768n) adapter;
            c0768n.getClass();
            C1937g c1937g = c0768n.f11627f;
            int m9 = c1937g.m();
            C1937g c1937g2 = c0768n.f11628g;
            Bundle bundle = new Bundle(c1937g2.m() + m9);
            for (int i10 = 0; i10 < c1937g.m(); i10++) {
                long j = c1937g.j(i10);
                AbstractComponentCallbacksC1366v abstractComponentCallbacksC1366v = (AbstractComponentCallbacksC1366v) c1937g.f(j);
                if (abstractComponentCallbacksC1366v != null && abstractComponentCallbacksC1366v.y()) {
                    String k5 = AbstractC0953k1.k(j, "f#");
                    AbstractC1336M abstractC1336M = c0768n.f11626e;
                    abstractC1336M.getClass();
                    if (abstractComponentCallbacksC1366v.f18414s == abstractC1336M) {
                        bundle.putString(k5, abstractComponentCallbacksC1366v.f18389e);
                    } else {
                        abstractC1336M.d0(new IllegalStateException(AbstractC0953k1.m("Fragment ", abstractComponentCallbacksC1366v, " is not currently in the FragmentManager")));
                        throw null;
                    }
                }
            }
            for (int i11 = 0; i11 < c1937g2.m(); i11++) {
                long j4 = c1937g2.j(i11);
                if (C0768n.o(j4)) {
                    bundle.putParcelable(AbstractC0953k1.k(j4, "s#"), (Parcelable) c1937g2.f(j4));
                }
            }
            baseSavedState.f16713c = bundle;
        }
        return baseSavedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i9, Bundle bundle) {
        int currentItem;
        this.f10410t.getClass();
        if (i9 != 8192 && i9 != 4096) {
            return super.performAccessibilityAction(i9, bundle);
        }
        C1535g c1535g = this.f10410t;
        c1535g.getClass();
        if (i9 != 8192 && i9 != 4096) {
            throw new IllegalStateException();
        }
        ViewPager2 viewPager2 = (ViewPager2) c1535g.f20185d;
        if (i9 == 8192) {
            currentItem = viewPager2.getCurrentItem() - 1;
        } else {
            currentItem = viewPager2.getCurrentItem() + 1;
        }
        if (viewPager2.f10408r) {
            viewPager2.c(currentItem, true);
        }
        return true;
    }

    public void setAdapter(S s9) {
        S adapter = this.j.getAdapter();
        C1535g c1535g = this.f10410t;
        if (adapter != null) {
            adapter.f2055a.unregisterObserver((C1099e) c1535g.f20184c);
        } else {
            c1535g.getClass();
        }
        C1099e c1099e = this.f10397f;
        if (adapter != null) {
            adapter.f2055a.unregisterObserver(c1099e);
        }
        this.j.setAdapter(s9);
        this.f10395d = 0;
        a();
        C1535g c1535g2 = this.f10410t;
        c1535g2.J();
        if (s9 != null) {
            s9.m((C1099e) c1535g2.f20184c);
        }
        if (s9 != null) {
            s9.m(c1099e);
        }
    }

    public void setCurrentItem(int i9) {
        b(i9, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i9) {
        super.setLayoutDirection(i9);
        this.f10410t.J();
    }

    public void setOffscreenPageLimit(int i9) {
        if (i9 < 1 && i9 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f10409s = i9;
        this.j.requestLayout();
    }

    public void setOrientation(int i9) {
        this.f10398g.l1(i9);
        this.f10410t.J();
    }

    public void setPageTransformer(InterfaceC1104j interfaceC1104j) {
        if (interfaceC1104j != null) {
            if (!this.f10407q) {
                this.f10406p = this.j.getItemAnimator();
                this.f10407q = true;
            }
            this.j.setItemAnimator(null);
        } else if (this.f10407q) {
            this.j.setItemAnimator(this.f10406p);
            this.f10406p = null;
            this.f10407q = false;
        }
        this.f10405o.getClass();
        if (interfaceC1104j == null) {
            return;
        }
        this.f10405o.getClass();
        this.f10405o.getClass();
    }

    public void setUserInputEnabled(boolean z9) {
        this.f10408r = z9;
        this.f10410t.J();
    }
}
