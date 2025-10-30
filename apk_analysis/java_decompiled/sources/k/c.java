package k;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import com.google.android.gms.internal.measurement.Y1;

/* loaded from: classes.dex */
public final class c extends Y1 {

    /* renamed from: n, reason: collision with root package name */
    public final ObjectAnimator f19841n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f19842o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [k.d, android.animation.TimeInterpolator, java.lang.Object] */
    public c(AnimationDrawable animationDrawable, boolean z9, boolean z10) {
        int i9;
        int i10;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i11 = z9 ? numberOfFrames - 1 : 0;
        if (z9) {
            i9 = 0;
        } else {
            i9 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f19844b = numberOfFrames2;
        int[] iArr = obj.f19843a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f19843a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f19843a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            if (z9) {
                i10 = (numberOfFrames2 - i13) - 1;
            } else {
                i10 = i13;
            }
            int duration = animationDrawable.getDuration(i10);
            iArr2[i13] = duration;
            i12 += duration;
        }
        obj.f19845c = i12;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i9);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(obj.f19845c);
        ofInt.setInterpolator(obj);
        this.f19842o = z10;
        this.f19841n = ofInt;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void C() {
        this.f19841n.reverse();
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void G() {
        this.f19841n.start();
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void H() {
        this.f19841n.cancel();
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final boolean d() {
        return this.f19842o;
    }
}
