package co.notix;

import android.content.res.Resources;
import android.util.TypedValue;

/* loaded from: classes.dex */
public abstract class h9 {
    public static final float a(Number number) {
        kotlin.jvm.internal.h.e(number, "<this>");
        return TypedValue.applyDimension(1, number.floatValue(), Resources.getSystem().getDisplayMetrics());
    }
}
