package com.google.android.material.button;

import F5.l;
import F5.m;
import M5.a;
import P.Q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import co.notix.R;
import com.google.firebase.messaging.u;
import g5.AbstractC1254a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import n5.d;
import n5.e;
import n5.f;
import s4.i;
import w5.p;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f15907k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15908a;

    /* renamed from: b, reason: collision with root package name */
    public final u f15909b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f15910c;

    /* renamed from: d, reason: collision with root package name */
    public final d f15911d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f15912e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15913f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15914g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15915h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15916i;
    public HashSet j;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f15908a = new ArrayList();
        this.f15909b = new u(this);
        this.f15910c = new LinkedHashSet();
        this.f15911d = new d(this);
        this.f15913f = false;
        this.j = new HashSet();
        TypedArray i9 = p.i(getContext(), attributeSet, AbstractC1254a.f17756v, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(i9.getBoolean(3, false));
        this.f15916i = i9.getResourceId(1, -1);
        this.f15915h = i9.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(i9.getBoolean(0, true));
        i9.recycle();
        WeakHashMap weakHashMap = Q.f5546a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            if (c(i9)) {
                return i9;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && c(i10)) {
                i9++;
            }
        }
        return i9;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = Q.f5546a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f15909b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i9 = firstVisibleChildIndex + 1; i9 < getChildCount(); i9++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i9);
                int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i9 - 1)).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                } else {
                    layoutParams3.setMarginEnd(0);
                    layoutParams3.setMarginStart(0);
                    layoutParams3.leftMargin = 0;
                    layoutParams3.rightMargin = 0;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i9, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f15904o);
        m shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f15908a.add(new e(shapeAppearanceModel.f2523e, shapeAppearanceModel.f2526h, shapeAppearanceModel.f2524f, shapeAppearanceModel.f2525g));
        materialButton.setEnabled(isEnabled());
        Q.m(materialButton, new I5.e(3, this));
    }

    public final void b(int i9, boolean z9) {
        if (i9 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i9);
            return;
        }
        HashSet hashSet = new HashSet(this.j);
        if (z9 && !hashSet.contains(Integer.valueOf(i9))) {
            if (this.f15914g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i9));
        } else if (!z9 && hashSet.contains(Integer.valueOf(i9))) {
            if (!this.f15915h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i9));
            }
        } else {
            return;
        }
        d(hashSet);
    }

    public final boolean c(int i9) {
        if (getChildAt(i9).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d(Set set) {
        HashSet hashSet = this.j;
        this.j = new HashSet(set);
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            int id = ((MaterialButton) getChildAt(i9)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f15913f = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f15913f = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean contains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.f15910c.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).a(id, contains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f15911d);
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            treeMap.put((MaterialButton) getChildAt(i9), Integer.valueOf(i9));
        }
        this.f15912e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        boolean z9;
        e eVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i9 = 0; i9 < childCount; i9++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i9);
            if (materialButton.getVisibility() != 8) {
                l e8 = materialButton.getShapeAppearanceModel().e();
                e eVar2 = (e) this.f15908a.get(i9);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    if (getOrientation() == 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    F5.a aVar = e.f21238e;
                    if (i9 == firstVisibleChildIndex) {
                        if (z9) {
                            if (p.h(this)) {
                                eVar = new e(aVar, aVar, eVar2.f21240b, eVar2.f21241c);
                            } else {
                                eVar = new e(eVar2.f21239a, eVar2.f21242d, aVar, aVar);
                            }
                        } else {
                            eVar = new e(eVar2.f21239a, aVar, eVar2.f21240b, aVar);
                        }
                    } else if (i9 == lastVisibleChildIndex) {
                        if (z9) {
                            if (p.h(this)) {
                                eVar = new e(eVar2.f21239a, eVar2.f21242d, aVar, aVar);
                            } else {
                                eVar = new e(aVar, aVar, eVar2.f21240b, eVar2.f21241c);
                            }
                        } else {
                            eVar = new e(aVar, eVar2.f21242d, aVar, eVar2.f21241c);
                        }
                    } else {
                        eVar2 = null;
                    }
                    eVar2 = eVar;
                }
                if (eVar2 == null) {
                    e8.f2512e = new F5.a(0.0f);
                    e8.f2513f = new F5.a(0.0f);
                    e8.f2514g = new F5.a(0.0f);
                    e8.f2515h = new F5.a(0.0f);
                } else {
                    e8.f2512e = eVar2.f21239a;
                    e8.f2515h = eVar2.f21242d;
                    e8.f2513f = eVar2.f21240b;
                    e8.f2514g = eVar2.f21241c;
                }
                materialButton.setShapeAppearanceModel(e8.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (this.f15914g && !this.j.isEmpty()) {
            return ((Integer) this.j.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            int id = ((MaterialButton) getChildAt(i9)).getId();
            if (this.j.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i9, int i10) {
        Integer[] numArr = this.f15912e;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i9 = this.f15916i;
        if (i9 != -1) {
            d(Collections.singleton(Integer.valueOf(i9)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f15914g) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) i.L(1, visibleButtonCount, i9).f22734a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        e();
        a();
        super.onMeasure(i9, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f15908a.remove(indexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            ((MaterialButton) getChildAt(i9)).setEnabled(z9);
        }
    }

    public void setSelectionRequired(boolean z9) {
        this.f15915h = z9;
    }

    public void setSingleSelection(boolean z9) {
        if (this.f15914g != z9) {
            this.f15914g = z9;
            d(new HashSet());
        }
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            ((MaterialButton) getChildAt(i9)).setA11yClassName((this.f15914g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i9) {
        setSingleSelection(getResources().getBoolean(i9));
    }
}
