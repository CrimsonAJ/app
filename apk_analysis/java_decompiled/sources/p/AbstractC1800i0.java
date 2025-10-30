package p;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: p.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1800i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f21998a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f21999b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f22000c = new Rect();

    public static void a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 29 && i9 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f21999b);
            } else {
                drawable.setState(f21998a);
            }
            drawable.setState(state);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Rect b(Drawable drawable) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            Insets a5 = AbstractC1798h0.a(drawable);
            i9 = a5.left;
            i10 = a5.top;
            i11 = a5.right;
            i12 = a5.bottom;
            return new Rect(i9, i10, i11, i12);
        }
        boolean z9 = drawable instanceof I.c;
        Object obj = drawable;
        if (z9) {
            ((I.d) ((I.c) drawable)).getClass();
            obj = null;
        }
        if (i13 < 29) {
            if (AbstractC1796g0.f21986a) {
                try {
                    Object invoke = AbstractC1796g0.f21987b.invoke(obj, null);
                    if (invoke != null) {
                        return new Rect(AbstractC1796g0.f21988c.getInt(invoke), AbstractC1796g0.f21989d.getInt(invoke), AbstractC1796g0.f21990e.getInt(invoke), AbstractC1796g0.f21991f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z10 = AbstractC1796g0.f21986a;
        }
        return f22000c;
    }

    public static PorterDuff.Mode c(int i9, PorterDuff.Mode mode) {
        if (i9 != 3) {
            if (i9 != 5) {
                if (i9 != 9) {
                    switch (i9) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
