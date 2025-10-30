package F0;

import android.view.View;
import java.util.concurrent.ExecutorService;

/* renamed from: F0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0098c {

    /* renamed from: b, reason: collision with root package name */
    public static ExecutorService f2081b;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f2080a = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final B.j f2082c = new B.j(2);

    public static int c(n0 n0Var, K k5, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z9) {
        if (aVar.w() != 0 && n0Var.b() != 0 && view != null && view2 != null) {
            if (!z9) {
                return Math.abs(androidx.recyclerview.widget.a.L(view) - androidx.recyclerview.widget.a.L(view2)) + 1;
            }
            return Math.min(k5.n(), k5.d(view2) - k5.g(view));
        }
        return 0;
    }

    public static int d(n0 n0Var, K k5, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z9, boolean z10) {
        int max;
        if (aVar.w() == 0 || n0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(androidx.recyclerview.widget.a.L(view), androidx.recyclerview.widget.a.L(view2));
        int max2 = Math.max(androidx.recyclerview.widget.a.L(view), androidx.recyclerview.widget.a.L(view2));
        if (z10) {
            max = Math.max(0, (n0Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z9) {
            return max;
        }
        return Math.round((max * (Math.abs(k5.d(view2) - k5.g(view)) / (Math.abs(androidx.recyclerview.widget.a.L(view) - androidx.recyclerview.widget.a.L(view2)) + 1))) + (k5.m() - k5.g(view)));
    }

    public static int e(n0 n0Var, K k5, View view, View view2, androidx.recyclerview.widget.a aVar, boolean z9) {
        if (aVar.w() != 0 && n0Var.b() != 0 && view != null && view2 != null) {
            if (!z9) {
                return n0Var.b();
            }
            return (int) (((k5.d(view2) - k5.g(view)) / (Math.abs(androidx.recyclerview.widget.a.L(view) - androidx.recyclerview.widget.a.L(view2)) + 1)) * n0Var.b());
        }
        return 0;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract boolean b(Object obj, Object obj2);
}
