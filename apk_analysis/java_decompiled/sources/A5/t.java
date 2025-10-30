package A5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import i.G;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f463b;

    public /* synthetic */ t(int i9, Object obj) {
        this.f462a = i9;
        this.f463b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f462a) {
            case 8:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f463b;
                actionBarOverlayLayout.f9418w = null;
                actionBarOverlayLayout.j = false;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        G g9;
        switch (this.f462a) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f463b;
                sideSheetBehavior.x(5);
                WeakReference weakReference = sideSheetBehavior.f16105p;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) sideSheetBehavior.f16105p.get()).requestLayout();
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(animator);
                H5.d dVar = (H5.d) this.f463b;
                ViewGroup f9 = w5.p.f(dVar);
                if (f9 == null) {
                    g9 = null;
                } else {
                    g9 = new G(f9);
                }
                ArrayList arrayList = dVar.f3157l;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    ((ViewOverlay) g9.f17990b).remove((N5.b) obj);
                }
                return;
            case 3:
                K5.l lVar = (K5.l) this.f463b;
                lVar.q();
                lVar.f4348r.start();
                return;
            case 4:
                ((X0.m) this.f463b).o();
                animator.removeListener(this);
                return;
            case 5:
                Y0.f fVar = (Y0.f) this.f463b;
                ArrayList arrayList2 = new ArrayList(fVar.f8507e);
                int size2 = arrayList2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((c) arrayList2.get(i10)).a(fVar);
                }
                return;
            case 6:
                ((HideBottomViewOnScrollBehavior) this.f463b).f15829h = null;
                return;
            case 7:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f463b;
                bottomSheetBehavior.J(5);
                WeakReference weakReference2 = bottomSheetBehavior.f15857U;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) bottomSheetBehavior.f15857U.get()).requestLayout();
                    return;
                }
                return;
            case 8:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f463b;
                actionBarOverlayLayout.f9418w = null;
                actionBarOverlayLayout.j = false;
                return;
            case 9:
                y5.f fVar2 = (y5.f) this.f463b;
                fVar2.f25006b.setTranslationY(0.0f);
                fVar2.b(0.0f);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f462a) {
            case 0:
                super.onAnimationRepeat(animator);
                u uVar = (u) this.f463b;
                uVar.f468f = (uVar.f468f + 1) % uVar.f467e.f402c.length;
                uVar.f469g = true;
                return;
            default:
                super.onAnimationRepeat(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f462a) {
            case 5:
                Y0.f fVar = (Y0.f) this.f463b;
                ArrayList arrayList = new ArrayList(fVar.f8507e);
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((c) arrayList.get(i9)).b(fVar);
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
