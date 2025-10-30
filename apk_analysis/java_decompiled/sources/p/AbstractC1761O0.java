package p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import b5.G1;
import h.AbstractC1260a;

/* renamed from: p.O0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1761O0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f21895a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f21896b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f21897c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f21898d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f21899e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f21900f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f21901g = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1260a.j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i9) {
        ColorStateList d9 = d(context, i9);
        if (d9 != null && d9.isStateful()) {
            return d9.getColorForState(f21896b, d9.getDefaultColor());
        }
        ThreadLocal threadLocal = f21895a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f9 = typedValue.getFloat();
        return H.a.h(c(context, i9), Math.round(Color.alpha(r4) * f9));
    }

    public static int c(Context context, int i9) {
        int[] iArr = f21901g;
        iArr[0] = i9;
        G1 v8 = G1.v(context, null, iArr);
        try {
            return ((TypedArray) v8.f10718c).getColor(0, 0);
        } finally {
            v8.y();
        }
    }

    public static ColorStateList d(Context context, int i9) {
        int[] iArr = f21901g;
        iArr[0] = i9;
        G1 v8 = G1.v(context, null, iArr);
        try {
            return v8.n(0);
        } finally {
            v8.y();
        }
    }
}
