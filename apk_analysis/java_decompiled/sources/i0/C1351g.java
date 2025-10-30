package i0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: i0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1351g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1353i f18324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f18325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f18326c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Z f18327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1349e f18328e;

    public C1351g(C1353i c1353i, View view, boolean z9, Z z10, C1349e c1349e) {
        this.f18324a = c1353i;
        this.f18325b = view;
        this.f18326c = z9;
        this.f18327d = z10;
        this.f18328e = c1349e;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        kotlin.jvm.internal.h.e(anim, "anim");
        ViewGroup viewGroup = this.f18324a.f18333a;
        View viewToAnimate = this.f18325b;
        viewGroup.endViewTransition(viewToAnimate);
        Z z9 = this.f18327d;
        if (this.f18326c) {
            int i9 = z9.f18274a;
            kotlin.jvm.internal.h.d(viewToAnimate, "viewToAnimate");
            AbstractC0953k1.b(viewToAnimate, i9);
        }
        this.f18328e.e();
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + z9 + " has ended.");
        }
    }
}
