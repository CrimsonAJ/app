package X0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* renamed from: X0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430e extends m {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f8171A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B, reason: collision with root package name */
    public static final A5.h f8172B = new A5.h(PointF.class, "topLeft", 5);

    /* renamed from: C, reason: collision with root package name */
    public static final A5.h f8173C = new A5.h(PointF.class, "bottomRight", 6);

    /* renamed from: D, reason: collision with root package name */
    public static final A5.h f8174D = new A5.h(PointF.class, "bottomRight", 7);

    /* renamed from: X, reason: collision with root package name */
    public static final A5.h f8175X = new A5.h(PointF.class, "topLeft", 8);
    public static final A5.h Y = new A5.h(PointF.class, "position", 9);

    public static void L(u uVar) {
        View view = uVar.f8227b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap hashMap = uVar.f8226a;
        hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        hashMap.put("android:changeBounds:parent", uVar.f8227b.getParent());
    }

    @Override // X0.m
    public final void e(u uVar) {
        L(uVar);
    }

    @Override // X0.m
    public final void i(u uVar) {
        L(uVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X0.m
    public final Animator m(ViewGroup viewGroup, u uVar, u uVar2) {
        int i9;
        C0430e c0430e;
        ObjectAnimator a5;
        if (uVar != null && uVar2 != null) {
            HashMap hashMap = uVar.f8226a;
            HashMap hashMap2 = uVar2.f8226a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i10 = rect.left;
                int i11 = rect2.left;
                int i12 = rect.top;
                int i13 = rect2.top;
                int i14 = rect.right;
                int i15 = rect2.right;
                int i16 = rect.bottom;
                int i17 = rect2.bottom;
                int i18 = i14 - i10;
                int i19 = i16 - i12;
                int i20 = i15 - i11;
                int i21 = i17 - i13;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i18 != 0 && i19 != 0) || (i20 != 0 && i21 != 0)) {
                    if (i10 == i11 && i12 == i13) {
                        i9 = 0;
                    } else {
                        i9 = 1;
                    }
                    if (i14 != i15 || i16 != i17) {
                        i9++;
                    }
                } else {
                    i9 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i9++;
                }
                if (i9 > 0) {
                    View view = uVar2.f8227b;
                    w.a(view, i10, i12, i14, i16);
                    if (i9 == 2) {
                        if (i18 == i20 && i19 == i21) {
                            c0430e = this;
                            c0430e.f8215v.getClass();
                            a5 = h.a(view, Y, Q6.f.s(i10, i12, i11, i13));
                        } else {
                            c0430e = this;
                            C0429d c0429d = new C0429d(view);
                            c0430e.f8215v.getClass();
                            ObjectAnimator a9 = h.a(c0429d, f8172B, Q6.f.s(i10, i12, i11, i13));
                            c0430e.f8215v.getClass();
                            ObjectAnimator a10 = h.a(c0429d, f8173C, Q6.f.s(i14, i16, i15, i17));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a9, a10);
                            animatorSet.addListener(new C0427b(c0429d));
                            a5 = animatorSet;
                        }
                    } else {
                        c0430e = this;
                        if (i10 == i11 && i12 == i13) {
                            c0430e.f8215v.getClass();
                            a5 = h.a(view, f8174D, Q6.f.s(i14, i16, i15, i17));
                        } else {
                            c0430e.f8215v.getClass();
                            a5 = h.a(view, f8175X, Q6.f.s(i10, i12, i11, i13));
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        v4.e.R(viewGroup4, true);
                        c0430e.q().b(new C0428c(viewGroup4));
                    }
                    return a5;
                }
            }
        }
        return null;
    }

    @Override // X0.m
    public final String[] t() {
        return f8171A;
    }
}
