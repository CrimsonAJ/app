package com.google.android.material.chip;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import i.G;
import java.util.Iterator;
import java.util.List;
import q5.f;
import q5.g;
import q5.h;
import q5.i;
import w5.AbstractC2145e;
import w5.C2141a;

/* loaded from: classes.dex */
public class ChipGroup extends AbstractC2145e {

    /* renamed from: e, reason: collision with root package name */
    public int f15964e;

    /* renamed from: f, reason: collision with root package name */
    public int f15965f;

    /* renamed from: g, reason: collision with root package name */
    public h f15966g;

    /* renamed from: h, reason: collision with root package name */
    public final C2141a f15967h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15968i;
    public final i j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r10, android.util.AttributeSet r11) {
        /*
            r9 = this;
            r3 = 2130968812(0x7f0400ec, float:1.7546288E38)
            r0 = 2132083815(0x7f150467, float:1.9807783E38)
            android.content.Context r10 = M5.a.a(r10, r11, r3, r0)
            r9.<init>(r10, r11, r3)
            r6 = 0
            r9.f24286c = r6
            android.content.res.Resources$Theme r10 = r10.getTheme()
            int[] r0 = g5.AbstractC1254a.f17751q
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r0, r6, r6)
            r7 = 1
            int r0 = r10.getDimensionPixelSize(r7, r6)
            r9.f24284a = r0
            int r0 = r10.getDimensionPixelSize(r6, r6)
            r9.f24285b = r0
            r10.recycle()
            w5.a r10 = new w5.a
            r10.<init>()
            r9.f15967h = r10
            q5.i r8 = new q5.i
            r8.<init>(r9)
            r9.j = r8
            android.content.Context r0 = r9.getContext()
            int[] r2 = g5.AbstractC1254a.f17744i
            r4 = 2132083815(0x7f150467, float:1.9807783E38)
            int[] r5 = new int[r6]
            r1 = r11
            android.content.res.TypedArray r11 = w5.p.i(r0, r1, r2, r3, r4, r5)
            int r0 = r11.getDimensionPixelOffset(r7, r6)
            r1 = 2
            int r1 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingHorizontal(r1)
            r1 = 3
            int r0 = r11.getDimensionPixelOffset(r1, r0)
            r9.setChipSpacingVertical(r0)
            r0 = 5
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleLine(r0)
            r0 = 6
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSingleSelection(r0)
            r0 = 4
            boolean r0 = r11.getBoolean(r0, r6)
            r9.setSelectionRequired(r0)
            r0 = -1
            int r0 = r11.getResourceId(r6, r0)
            r9.f15968i = r0
            r11.recycle()
            com.google.firebase.messaging.u r11 = new com.google.firebase.messaging.u
            r11.<init>(r9)
            r10.f24212c = r11
            super.setOnHierarchyChangeListener(r8)
            java.util.WeakHashMap r10 = P.Q.f5546a
            r9.setImportantForAccessibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getVisibleChipCount() {
        int i9 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof Chip) && getChildAt(i10).getVisibility() == 0) {
                i9++;
            }
        }
        return i9;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof f)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f15967h.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f15967h.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f15964e;
    }

    public int getChipSpacingVertical() {
        return this.f15965f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i9 = this.f15968i;
        if (i9 != -1) {
            C2141a c2141a = this.f15967h;
            w5.h hVar = (w5.h) c2141a.f24210a.get(Integer.valueOf(i9));
            if (hVar != null && c2141a.a(hVar)) {
                c2141a.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i9;
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f24286c) {
            i9 = getVisibleChipCount();
        } else {
            i9 = -1;
        }
        int rowCount = getRowCount();
        if (this.f15967h.f24213d) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) s4.i.L(rowCount, i9, i10).f22734a);
    }

    public void setChipSpacing(int i9) {
        setChipSpacingHorizontal(i9);
        setChipSpacingVertical(i9);
    }

    public void setChipSpacingHorizontal(int i9) {
        if (this.f15964e != i9) {
            this.f15964e = i9;
            setItemSpacing(i9);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i9) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i9));
    }

    public void setChipSpacingResource(int i9) {
        setChipSpacing(getResources().getDimensionPixelOffset(i9));
    }

    public void setChipSpacingVertical(int i9) {
        if (this.f15965f != i9) {
            this.f15965f = i9;
            setLineSpacing(i9);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i9) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i9));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i9) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(g gVar) {
        if (gVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new G(13, this));
        }
    }

    public void setOnCheckedStateChangeListener(h hVar) {
        this.f15966g = hVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.f22427a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z9) {
        this.f15967h.f24214e = z9;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i9) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i9) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // w5.AbstractC2145e
    public void setSingleLine(boolean z9) {
        super.setSingleLine(z9);
    }

    public void setSingleSelection(boolean z9) {
        C2141a c2141a = this.f15967h;
        if (c2141a.f24213d != z9) {
            c2141a.f24213d = z9;
            boolean isEmpty = c2141a.f24211b.isEmpty();
            Iterator it = c2141a.f24210a.values().iterator();
            while (it.hasNext()) {
                c2141a.e((w5.h) it.next(), false);
            }
            if (isEmpty) {
                return;
            }
            c2141a.d();
        }
    }

    public void setSingleLine(int i9) {
        setSingleLine(getResources().getBoolean(i9));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public void setSingleSelection(int i9) {
        setSingleSelection(getResources().getBoolean(i9));
    }
}
