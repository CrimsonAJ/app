package android.support.v4.media;

import android.media.Rating;

/* loaded from: classes.dex */
public abstract class e {
    public static float a(Rating rating) {
        return rating.getPercentRating();
    }

    public static int b(Rating rating) {
        return rating.getRatingStyle();
    }

    public static float c(Rating rating) {
        return rating.getStarRating();
    }

    public static boolean d(Rating rating) {
        return rating.hasHeart();
    }

    public static boolean e(Rating rating) {
        return rating.isRated();
    }

    public static boolean f(Rating rating) {
        return rating.isThumbUp();
    }

    public static Rating g(boolean z9) {
        return Rating.newHeartRating(z9);
    }

    public static Rating h(float f9) {
        return Rating.newPercentageRating(f9);
    }

    public static Rating i(int i9, float f9) {
        return Rating.newStarRating(i9, f9);
    }

    public static Rating j(boolean z9) {
        return Rating.newThumbRating(z9);
    }

    public static Rating k(int i9) {
        return Rating.newUnratedRating(i9);
    }
}
