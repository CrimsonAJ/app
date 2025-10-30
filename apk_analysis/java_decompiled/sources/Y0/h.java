package Y0;

import android.animation.TypeEvaluator;
import u0.z;

/* loaded from: classes.dex */
public final class h implements TypeEvaluator {

    /* renamed from: a, reason: collision with root package name */
    public static final h f8510a = new Object();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f9, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float f11 = ((intValue2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = (float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & 255) / 255.0f, 2.2d);
        float b9 = z.b(f11, f10, f9, f10);
        float b10 = z.b(pow4, pow, f9, pow);
        float b11 = z.b(pow5, pow2, f9, pow2);
        float b12 = z.b(pow6, pow3, f9, pow3);
        float pow7 = ((float) Math.pow(b10, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(b11, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(b12, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(b9 * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
