package com.google.android.material.theme;

import K5.x;
import M5.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import g5.AbstractC1254a;
import i.C1312B;
import p.C1813p;
import p.C1815q;
import p.C1817r;
import p.C1833z;
import w5.p;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C1312B {
    @Override // i.C1312B
    public final C1813p a(Context context, AttributeSet attributeSet) {
        return new x(context, attributeSet);
    }

    @Override // i.C1312B
    public final C1815q b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // i.C1312B
    public final C1817r c(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.CompoundButton, B5.a, android.view.View, p.z] */
    @Override // i.C1312B
    public final C1833z d(Context context, AttributeSet attributeSet) {
        ?? c1833z = new C1833z(a.a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c1833z.getContext();
        TypedArray i9 = p.i(context2, attributeSet, AbstractC1254a.f17760z, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (i9.hasValue(0)) {
            c1833z.setButtonTintList(D1.p(context2, i9, 0));
        }
        c1833z.f736f = i9.getBoolean(1, false);
        i9.recycle();
        return c1833z;
    }

    @Override // i.C1312B
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        AppCompatTextView appCompatTextView = new AppCompatTextView(a.a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = appCompatTextView.getContext();
        if (AbstractC1002u1.Y(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC1254a.f17718C;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int[] iArr2 = {1, 2};
            int i9 = -1;
            for (int i10 = 0; i10 < 2 && i9 < 0; i10++) {
                i9 = D1.r(context2, obtainStyledAttributes, iArr2[i10], -1);
            }
            obtainStyledAttributes.recycle();
            if (i9 == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC1254a.f17717B);
                    Context context3 = appCompatTextView.getContext();
                    int[] iArr3 = {1, 2};
                    int i11 = -1;
                    for (int i12 = 0; i12 < 2 && i11 < 0; i12++) {
                        i11 = D1.r(context3, obtainStyledAttributes3, iArr3[i12], -1);
                    }
                    obtainStyledAttributes3.recycle();
                    if (i11 >= 0) {
                        appCompatTextView.setLineHeight(i11);
                    }
                }
            }
        }
        return appCompatTextView;
    }
}
