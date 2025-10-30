package K5;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import co.notix.R;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.textfield.TextInputLayout;
import g5.AbstractC1254a;
import java.util.List;
import java.util.Locale;
import p.C1733A0;
import p.C1813p;

/* loaded from: classes.dex */
public final class x extends C1813p {

    /* renamed from: e, reason: collision with root package name */
    public final C1733A0 f4421e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f4422f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f4423g;

    /* renamed from: h, reason: collision with root package name */
    public final int f4424h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4425i;
    public ColorStateList j;

    /* renamed from: k, reason: collision with root package name */
    public int f4426k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f4427l;

    public x(Context context, AttributeSet attributeSet) {
        super(M5.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f4423g = new Rect();
        Context context2 = getContext();
        TypedArray i9 = w5.p.i(context2, attributeSet, AbstractC1254a.f17754t, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (i9.hasValue(0) && i9.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f4424h = i9.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f4425i = i9.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (i9.hasValue(2)) {
            this.j = ColorStateList.valueOf(i9.getColor(2, 0));
        }
        this.f4426k = i9.getColor(4, 0);
        this.f4427l = D1.p(context2, i9, 5);
        this.f4422f = (AccessibilityManager) context2.getSystemService("accessibility");
        C1733A0 c1733a0 = new C1733A0(context2, null, R.attr.listPopupWindowStyle);
        this.f4421e = c1733a0;
        c1733a0.f21794y = true;
        c1733a0.f21795z.setFocusable(true);
        c1733a0.f21784o = this;
        c1733a0.f21795z.setInputMethodMode(2);
        c1733a0.p(getAdapter());
        c1733a0.f21785p = new v(0, this);
        if (i9.hasValue(6)) {
            setSimpleItems(i9.getResourceId(6, 0));
        }
        i9.recycle();
    }

    public static void a(x xVar, Object obj) {
        xVar.setText(xVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f4422f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f4421e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.j;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b9 = b();
        if (b9 != null && b9.f16206f0) {
            return b9.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f4425i;
    }

    public int getSimpleItemSelectedColor() {
        return this.f4426k;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f4427l;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b9 = b();
        if (b9 != null && b9.f16206f0 && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f4421e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        int selectedItemPosition;
        super.onMeasure(i9, i10);
        if (View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b9 = b();
            int i11 = 0;
            if (adapter != null && b9 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C1733A0 c1733a0 = this.f4421e;
                if (!c1733a0.f21795z.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = c1733a0.f21773c.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i12 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i11) {
                        view = null;
                        i11 = itemViewType;
                    }
                    view = adapter.getView(max, view, b9);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 = Math.max(i12, view.getMeasuredWidth());
                }
                Drawable background = c1733a0.f21795z.getBackground();
                if (background != null) {
                    Rect rect = this.f4423g;
                    background.getPadding(rect);
                    i12 += rect.left + rect.right;
                }
                i11 = b9.getEndIconView().getMeasuredWidth() + i12;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i11), View.MeasureSpec.getSize(i9)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z9) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z9);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t7) {
        super.setAdapter(t7);
        this.f4421e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C1733A0 c1733a0 = this.f4421e;
        if (c1733a0 != null) {
            c1733a0.g(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i9) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i9));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof F5.h) {
            ((F5.h) dropDownBackground).k(this.j);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f4421e.f21786q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i9) {
        super.setRawInputType(i9);
        TextInputLayout b9 = b();
        if (b9 != null) {
            b9.s();
        }
    }

    public void setSimpleItemSelectedColor(int i9) {
        this.f4426k = i9;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f4427l = colorStateList;
        if (getAdapter() instanceof w) {
            ((w) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i9) {
        setSimpleItems(getResources().getStringArray(i9));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f4421e.d();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new w(this, getContext(), this.f4424h, strArr));
    }
}
