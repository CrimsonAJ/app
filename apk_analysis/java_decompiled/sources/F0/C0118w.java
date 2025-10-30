package F0;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import h5.AbstractC1281a;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: F0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2254b;

    public /* synthetic */ C0118w(int i9, Object obj) {
        this.f2253a = i9;
        this.f2254b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i9 = 0;
        Object obj = this.f2254b;
        switch (this.f2253a) {
            case 0:
                int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                C0119x c0119x = (C0119x) obj;
                c0119x.f2262c.setAlpha(floatValue);
                c0119x.f2263d.setAlpha(floatValue);
                c0119x.f2277s.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                H5.d dVar = (H5.d) obj;
                ArrayList arrayList = dVar.f3157l;
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    N5.b bVar = (N5.b) obj2;
                    bVar.f5227l0 = 1.2f;
                    bVar.f5225j0 = floatValue2;
                    bVar.f5226k0 = floatValue2;
                    bVar.f5228m0 = AbstractC1281a.b(0.0f, 1.0f, 0.19f, 1.0f, floatValue2);
                    bVar.invalidateSelf();
                }
                WeakHashMap weakHashMap = P.Q.f5546a;
                dVar.postInvalidateOnAnimation();
                return;
            case 2:
                ((TabLayout) obj).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                return;
            case 3:
                ((TextInputLayout) obj).f16193T0.p(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                ((View) obj).setX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                ((CollapsingToolbarLayout) obj).setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 6:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                F5.h hVar = ((BottomSheetBehavior) obj).f15875i;
                if (hVar != null) {
                    F5.g gVar = hVar.f2483a;
                    if (gVar.f2474i != floatValue3) {
                        gVar.f2474i = floatValue3;
                        hVar.f2487e = true;
                        hVar.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = (TextView) obj;
                textView.setScaleX(floatValue4);
                textView.setScaleY(floatValue4);
                return;
        }
    }
}
