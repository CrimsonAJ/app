package P;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public abstract class M {
    public static View.AccessibilityDelegate a(View view) {
        return view.getAccessibilityDelegate();
    }

    public static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i9, int i10) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i9, i10);
    }
}
