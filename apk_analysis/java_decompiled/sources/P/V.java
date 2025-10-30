package P;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class V implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5558b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5559c;

    public /* synthetic */ V(Object obj, int i9, Object obj2) {
        this.f5557a = i9;
        this.f5558b = obj;
        this.f5559c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object obj = this.f5558b;
        switch (this.f5557a) {
            case 0:
                ((View) ((i.I) ((i.G) obj).f17990b).j.getParent()).invalidate();
                return;
            default:
                int i9 = AppBarLayout.f15721z;
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((F5.h) this.f5559c).j(floatValue);
                Drawable drawable = appBarLayout.f15742v;
                if (drawable instanceof F5.h) {
                    ((F5.h) drawable).j(floatValue);
                }
                Iterator it = appBarLayout.f15738r.iterator();
                if (!it.hasNext()) {
                    return;
                } else {
                    throw A0.a.h(it);
                }
        }
    }
}
