package D5;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1910a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1911b = {R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1912c = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1913d = {R.attr.state_selected};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1914e = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final String f1915f = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        int[] iArr = f1911b;
        return new ColorStateList(new int[][]{f1913d, iArr, StateSet.NOTHING}, new int[]{b(colorStateList, f1912c), b(colorStateList, iArr), b(colorStateList, f1910a)});
    }

    public static int b(ColorStateList colorStateList, int[] iArr) {
        int i9;
        if (colorStateList != null) {
            i9 = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i9 = 0;
        }
        return H.a.h(i9, Math.min(Color.alpha(i9) * 2, 255));
    }

    public static ColorStateList c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f1914e, 0)) != 0) {
                Log.w(f1915f, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean d(int[] iArr) {
        boolean z9 = false;
        boolean z10 = false;
        for (int i9 : iArr) {
            if (i9 == 16842910) {
                z9 = true;
            } else if (i9 == 16842908 || i9 == 16842919 || i9 == 16843623) {
                z10 = true;
            }
        }
        if (!z9 || !z10) {
            return false;
        }
        return true;
    }
}
