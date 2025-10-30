package X0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final B f8229a;

    /* renamed from: b, reason: collision with root package name */
    public static final A5.h f8230b;

    /* JADX WARN: Type inference failed for: r0v1, types: [X0.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X0.B, java.lang.Object] */
    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f8229a = new Object();
        } else {
            f8229a = new Object();
        }
        f8230b = new A5.h(Float.class, "translationAlpha", 10);
        new A5.h(Rect.class, "clipBounds", 11);
    }

    public static void a(View view, int i9, int i10, int i11, int i12) {
        f8229a.a0(view, i9, i10, i11, i12);
    }

    public static void b(View view, int i9) {
        f8229a.J(view, i9);
    }
}
