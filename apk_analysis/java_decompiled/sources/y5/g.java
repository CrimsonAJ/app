package y5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f25016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f25018c;

    public g(h hVar, boolean z9, int i9) {
        this.f25018c = hVar;
        this.f25016a = z9;
        this.f25017b = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h hVar = this.f25018c;
        hVar.f25006b.setTranslationX(0.0f);
        hVar.a(0.0f, this.f25016a, this.f25017b);
    }
}
