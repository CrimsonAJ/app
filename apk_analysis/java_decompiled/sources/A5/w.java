package A5;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import co.notix.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w extends q {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f473k = {533, 567, 850, 750};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f474l = {1267, 1000, 333, 0};

    /* renamed from: m, reason: collision with root package name */
    public static final h f475m = new h(Float.class, "animationFraction", 4);

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f476c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f477d;

    /* renamed from: e, reason: collision with root package name */
    public final Interpolator[] f478e;

    /* renamed from: f, reason: collision with root package name */
    public final x f479f;

    /* renamed from: g, reason: collision with root package name */
    public int f480g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f481h;

    /* renamed from: i, reason: collision with root package name */
    public float f482i;
    public c j;

    public w(Context context, x xVar) {
        super(2);
        this.f480g = 0;
        this.j = null;
        this.f479f = xVar;
        this.f478e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // A5.q
    public final void c() {
        ObjectAnimator objectAnimator = this.f476c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // A5.q
    public final void l() {
        v();
    }

    @Override // A5.q
    public final void q(c cVar) {
        this.j = cVar;
    }

    @Override // A5.q
    public final void r() {
        ObjectAnimator objectAnimator = this.f477d;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            c();
            if (((r) this.f452a).isVisible()) {
                this.f477d.setFloatValues(this.f482i, 1.0f);
                this.f477d.setDuration((1.0f - this.f482i) * 1800.0f);
                this.f477d.start();
            }
        }
    }

    @Override // A5.q
    public final void t() {
        ObjectAnimator objectAnimator = this.f476c;
        h hVar = f475m;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, hVar, 0.0f, 1.0f);
            this.f476c = ofFloat;
            ofFloat.setDuration(1800L);
            this.f476c.setInterpolator(null);
            this.f476c.setRepeatCount(-1);
            this.f476c.addListener(new v(this, 0));
        }
        if (this.f477d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, hVar, 1.0f);
            this.f477d = ofFloat2;
            ofFloat2.setDuration(1800L);
            this.f477d.setInterpolator(null);
            this.f477d.addListener(new v(this, 1));
        }
        v();
        this.f476c.start();
    }

    @Override // A5.q
    public final void u() {
        this.j = null;
    }

    public final void v() {
        this.f480g = 0;
        ArrayList arrayList = (ArrayList) this.f453b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((o) obj).f449c = this.f479f.f402c[0];
        }
    }
}
