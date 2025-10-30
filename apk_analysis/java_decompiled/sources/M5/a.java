package M5;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import n.C1597c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4793a = {R.attr.theme, co.notix.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4794b = {co.notix.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i9, int i10) {
        boolean z9;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4794b, i9, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof C1597c) && ((C1597c) context).f20940a == resourceId) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (resourceId != 0 && !z9) {
            C1597c c1597c = new C1597c(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f4793a);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                c1597c.getTheme().applyStyle(resourceId2, true);
            }
            return c1597c;
        }
        return context;
    }
}
