package com.anilab.android.ui.views;

import B7.r;
import F5.a;
import F5.l;
import V7.f;
import V7.g;
import android.content.Context;
import android.util.AttributeSet;
import co.notix.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import kotlin.jvm.internal.h;
import r2.d;

/* loaded from: classes.dex */
public final class FreakToggleGroup extends MaterialButtonToggleGroup {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreakToggleGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h.e(context, "context");
    }

    @Override // com.google.android.material.button.MaterialButtonToggleGroup, android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        f fVar = new f(new g(new r(1, this), true, d.f22602a));
        while (fVar.hasNext()) {
            MaterialButton materialButton = (MaterialButton) fVar.next();
            if (materialButton.getVisibility() != 8) {
                l e8 = materialButton.getShapeAppearanceModel().e();
                float dimension = getResources().getDimension(R.dimen.dp_10);
                e8.f2512e = new a(dimension);
                e8.f2515h = new a(dimension);
                e8.f2513f = new a(dimension);
                e8.f2514g = new a(dimension);
                materialButton.setShapeAppearanceModel(e8.a());
            }
        }
    }
}
