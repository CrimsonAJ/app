package androidx.mediarouter.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: androidx.mediarouter.app.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0576l implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashMap f10102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HashMap f10103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f10104c;

    public ViewTreeObserverOnGlobalLayoutListenerC0576l(s sVar, HashMap hashMap, HashMap hashMap2) {
        this.f10104c = sVar;
        this.f10102a = hashMap;
        this.f10103b = hashMap2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        HashMap hashMap;
        HashMap hashMap2;
        O o9;
        int i9;
        t0.C c3;
        s sVar = this.f10104c;
        sVar.f10141X.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = sVar.f10143f0;
        if (hashSet != null && sVar.f10145g0 != null) {
            int size = hashSet.size() - sVar.f10145g0.size();
            AnimationAnimationListenerC0577m animationAnimationListenerC0577m = new AnimationAnimationListenerC0577m(0, sVar);
            int firstVisiblePosition = sVar.f10141X.getFirstVisiblePosition();
            int i10 = 0;
            boolean z9 = false;
            while (true) {
                int childCount = sVar.f10141X.getChildCount();
                hashMap = this.f10102a;
                hashMap2 = this.f10103b;
                if (i10 >= childCount) {
                    break;
                }
                View childAt = sVar.f10141X.getChildAt(i10);
                t0.C c9 = (t0.C) sVar.Y.getItem(firstVisiblePosition + i10);
                Rect rect = (Rect) hashMap.get(c9);
                int top = childAt.getTop();
                if (rect != null) {
                    i9 = rect.top;
                } else {
                    i9 = (sVar.f10156m0 * size) + top;
                }
                AnimationSet animationSet = new AnimationSet(true);
                HashSet hashSet2 = sVar.f10143f0;
                if (hashSet2 != null && hashSet2.contains(c9)) {
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                    c3 = c9;
                    alphaAnimation.setDuration(sVar.f10134G0);
                    animationSet.addAnimation(alphaAnimation);
                    i9 = top;
                } else {
                    c3 = c9;
                }
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, i9 - top, 0.0f);
                translateAnimation.setDuration(sVar.f10133F0);
                animationSet.addAnimation(translateAnimation);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                animationSet.setInterpolator(sVar.f10136I0);
                if (!z9) {
                    animationSet.setAnimationListener(animationAnimationListenerC0577m);
                    z9 = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
                t0.C c10 = c3;
                hashMap.remove(c10);
                hashMap2.remove(c10);
                i10++;
            }
            for (Map.Entry entry : hashMap2.entrySet()) {
                t0.C c11 = (t0.C) entry.getKey();
                BitmapDrawable bitmapDrawable = (BitmapDrawable) entry.getValue();
                Rect rect2 = (Rect) hashMap.get(c11);
                if (sVar.f10145g0.contains(c11)) {
                    o9 = new O(bitmapDrawable, rect2);
                    o9.f10054h = 0.0f;
                    o9.f10051e = sVar.f10135H0;
                    o9.f10050d = sVar.f10136I0;
                } else {
                    int i11 = sVar.f10156m0 * size;
                    O o10 = new O(bitmapDrawable, rect2);
                    o10.f10053g = i11;
                    o10.f10051e = sVar.f10133F0;
                    o10.f10050d = sVar.f10136I0;
                    o10.f10057l = new O0.c(sVar, c11, 11, false);
                    sVar.f10147h0.add(c11);
                    o9 = o10;
                }
                sVar.f10141X.f10058a.add(o9);
            }
        }
    }
}
