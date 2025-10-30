package h5;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import k0.C1478a;
import u0.z;

/* renamed from: h5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1281a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f17925a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final C1478a f17926b = new C1478a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final C1478a f17927c = new C1478a(0);

    /* renamed from: d, reason: collision with root package name */
    public static final C1478a f17928d = new k0.b(C1478a.f19867e);

    /* renamed from: e, reason: collision with root package name */
    public static final DecelerateInterpolator f17929e = new DecelerateInterpolator();

    public static float a(float f9, float f10, float f11) {
        return z.b(f10, f9, f11, f9);
    }

    public static float b(float f9, float f10, float f11, float f12, float f13) {
        if (f13 <= f11) {
            return f9;
        }
        if (f13 >= f12) {
            return f10;
        }
        return a(f9, f10, (f13 - f11) / (f12 - f11));
    }

    public static int c(int i9, float f9, int i10) {
        return Math.round(f9 * (i10 - i9)) + i9;
    }
}
