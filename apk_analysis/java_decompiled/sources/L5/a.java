package L5;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import com.google.android.gms.internal.measurement.D1;
import g5.AbstractC1254a;

/* loaded from: classes.dex */
public final class a extends AppCompatTextView {
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setTextAppearance(Context context, int i9) {
        super.setTextAppearance(context, i9);
        if (AbstractC1002u1.Y(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i9, AbstractC1254a.f17717B);
            Context context2 = getContext();
            int[] iArr = {1, 2};
            int i10 = -1;
            for (int i11 = 0; i11 < 2 && i10 < 0; i11++) {
                i10 = D1.r(context2, obtainStyledAttributes, iArr[i11], -1);
            }
            obtainStyledAttributes.recycle();
            if (i10 >= 0) {
                setLineHeight(i10);
            }
        }
    }
}
