package i0;

import P.ViewTreeObserverOnPreDrawListenerC0316q;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* renamed from: i0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1370z extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18436a;

    /* renamed from: b, reason: collision with root package name */
    public final View f18437b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18438c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18439d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18440e;

    public RunnableC1370z(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f18440e = true;
        this.f18436a = viewGroup;
        this.f18437b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f18440e = true;
        if (this.f18438c) {
            return !this.f18439d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f18438c = true;
            ViewTreeObserverOnPreDrawListenerC0316q.a(this.f18436a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9 = this.f18438c;
        ViewGroup viewGroup = this.f18436a;
        if (!z9 && this.f18440e) {
            this.f18440e = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f18437b);
            this.f18439d = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f9) {
        this.f18440e = true;
        if (this.f18438c) {
            return !this.f18439d;
        }
        if (!super.getTransformation(j, transformation, f9)) {
            this.f18438c = true;
            ViewTreeObserverOnPreDrawListenerC0316q.a(this.f18436a, this);
        }
        return true;
    }
}
