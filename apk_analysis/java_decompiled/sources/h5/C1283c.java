package h5;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import s.C1939i;

/* renamed from: h5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1283c {

    /* renamed from: a, reason: collision with root package name */
    public final C1939i f17930a = new C1939i(0);

    /* renamed from: b, reason: collision with root package name */
    public final C1939i f17931b = new C1939i(0);

    public static C1283c a(Context context, int i9) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i9);
            if (loadAnimator instanceof AnimatorSet) {
                return b(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return b(arrayList);
        } catch (Exception e8) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i9), e8);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [h5.d, java.lang.Object] */
    public static C1283c b(ArrayList arrayList) {
        C1283c c1283c = new C1283c();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            Animator animator = (Animator) arrayList.get(i9);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                c1283c.f17931b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = AbstractC1281a.f17927c;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = AbstractC1281a.f17928d;
                    }
                } else {
                    interpolator = AbstractC1281a.f17926b;
                }
                ?? obj = new Object();
                obj.f17935d = 0;
                obj.f17936e = 1;
                obj.f17932a = startDelay;
                obj.f17933b = duration;
                obj.f17934c = interpolator;
                obj.f17935d = objectAnimator.getRepeatCount();
                obj.f17936e = objectAnimator.getRepeatMode();
                c1283c.f17930a.put(propertyName, obj);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return c1283c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1283c)) {
            return false;
        }
        return this.f17930a.equals(((C1283c) obj).f17930a);
    }

    public final int hashCode() {
        return this.f17930a.hashCode();
    }

    public final String toString() {
        return "\n" + C1283c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f17930a + "}\n";
    }
}
