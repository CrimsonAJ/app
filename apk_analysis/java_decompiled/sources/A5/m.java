package A5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f435a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f436b;

    public /* synthetic */ m(n nVar, int i9) {
        this.f435a = i9;
        this.f436b = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f435a) {
            case 1:
                super.onAnimationEnd(animator);
                n nVar = this.f436b;
                n.a(nVar);
                ArrayList arrayList = nVar.f443f;
                if (arrayList != null && !nVar.f444g) {
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        ((c) obj).a(nVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f435a) {
            case 0:
                super.onAnimationStart(animator);
                n nVar = this.f436b;
                ArrayList arrayList = nVar.f443f;
                if (arrayList != null && !nVar.f444g) {
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        ((c) obj).b(nVar);
                    }
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
