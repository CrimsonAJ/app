package I5;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.WindowMetrics;
import w5.p;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f3529b;

    public /* synthetic */ d(j jVar, int i9) {
        this.f3528a = i9;
        this.f3529b = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        WindowMetrics currentWindowMetrics;
        j jVar = this.f3529b;
        int i9 = 1;
        byte b9 = 0;
        switch (this.f3528a) {
            case 0:
                if (jVar.f3561i != null) {
                    Context context = jVar.f3560h;
                    int i10 = p.f24315d;
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (Build.VERSION.SDK_INT >= 30) {
                        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                        rect = currentWindowMetrics.getBounds();
                    } else {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        Point point = new Point();
                        defaultDisplay.getRealSize(point);
                        rect = new Rect();
                        rect.right = point.x;
                        rect.bottom = point.y;
                    }
                    int height = rect.height();
                    int[] iArr = new int[2];
                    i iVar = jVar.f3561i;
                    iVar.getLocationInWindow(iArr);
                    int height2 = (height - (iVar.getHeight() + iArr[1])) + ((int) iVar.getTranslationY());
                    int i11 = jVar.f3568q;
                    if (height2 >= i11) {
                        jVar.f3569r = i11;
                        return;
                    }
                    ViewGroup.LayoutParams layoutParams = iVar.getLayoutParams();
                    if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                        Log.w(j.f3547A, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                        return;
                    }
                    int i12 = jVar.f3568q;
                    jVar.f3569r = i12;
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = (i12 - height2) + marginLayoutParams.bottomMargin;
                    iVar.requestLayout();
                    return;
                }
                return;
            case 1:
                jVar.c();
                return;
            default:
                i iVar2 = jVar.f3561i;
                if (iVar2 != null) {
                    ViewParent parent = iVar2.getParent();
                    i iVar3 = jVar.f3561i;
                    if (parent != null) {
                        iVar3.setVisibility(0);
                    }
                    if (iVar3.getAnimationMode() == 1) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setInterpolator(jVar.f3556d);
                        ofFloat.addUpdateListener(new b(jVar, b9, b9));
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.8f, 1.0f);
                        ofFloat2.setInterpolator(jVar.f3558f);
                        ofFloat2.addUpdateListener(new b(jVar, i9, b9));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ofFloat, ofFloat2);
                        animatorSet.setDuration(jVar.f3553a);
                        animatorSet.addListener(new a(jVar, 3));
                        animatorSet.start();
                        return;
                    }
                    int height3 = iVar3.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = iVar3.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        height3 += ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                    }
                    iVar3.setTranslationY(height3);
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(height3, 0);
                    valueAnimator.setInterpolator(jVar.f3557e);
                    valueAnimator.setDuration(jVar.f3555c);
                    valueAnimator.addListener(new a(jVar, i9));
                    valueAnimator.addUpdateListener(new b(jVar, height3));
                    valueAnimator.start();
                    return;
                }
                return;
        }
    }
}
