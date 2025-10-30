package Q2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class H extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f6126b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f6127c;

    public /* synthetic */ H(I i9, D d9, int i10) {
        this.f6125a = i10;
        this.f6127c = i9;
        this.f6126b = d9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6125a) {
            case 0:
                I i9 = this.f6127c;
                i9.i(1);
                if (i9.f6129B) {
                    this.f6126b.post(i9.f6148s);
                    i9.f6129B = false;
                    return;
                }
                return;
            case 1:
                I i10 = this.f6127c;
                i10.i(2);
                if (i10.f6129B) {
                    this.f6126b.post(i10.f6148s);
                    i10.f6129B = false;
                    return;
                }
                return;
            default:
                I i11 = this.f6127c;
                i11.i(2);
                if (i11.f6129B) {
                    this.f6126b.post(i11.f6148s);
                    i11.f6129B = false;
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f6125a) {
            case 0:
                this.f6127c.i(3);
                return;
            case 1:
                this.f6127c.i(3);
                return;
            default:
                this.f6127c.i(3);
                return;
        }
    }
}
