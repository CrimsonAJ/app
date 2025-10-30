package P;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import co.notix.R;
import java.util.List;
import k0.C1478a;

/* loaded from: classes.dex */
public final class b0 extends e0 {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f5575e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C1478a f5576f = new C1478a(0);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f5577g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f5578h = new AccelerateInterpolator(1.5f);

    public static void e(View view) {
        com.google.firebase.messaging.n j = j(view);
        if (j != null) {
            ((View) j.f16491d).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                e(viewGroup.getChildAt(i9));
            }
        }
    }

    public static void f(View view, u0 u0Var, boolean z9) {
        com.google.firebase.messaging.n j = j(view);
        if (j != null) {
            j.f16490c = u0Var;
            if (!z9) {
                View view2 = (View) j.f16491d;
                int[] iArr = (int[]) j.f16492e;
                view2.getLocationOnScreen(iArr);
                z9 = true;
                j.f16488a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                f(viewGroup.getChildAt(i9), u0Var, z9);
            }
        }
    }

    public static void g(View view, u0 u0Var, List list) {
        com.google.firebase.messaging.n j = j(view);
        if (j != null) {
            j.f(u0Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                g(viewGroup.getChildAt(i9), u0Var, list);
            }
        }
    }

    public static void h(View view, O0.c cVar) {
        com.google.firebase.messaging.n j = j(view);
        if (j != null) {
            View view2 = (View) j.f16491d;
            int[] iArr = (int[]) j.f16492e;
            view2.getLocationOnScreen(iArr);
            int i9 = j.f16488a - iArr[1];
            j.f16489b = i9;
            view2.setTranslationY(i9);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), cVar);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static com.google.firebase.messaging.n j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof a0) {
            return ((a0) tag).f5570a;
        }
        return null;
    }
}
