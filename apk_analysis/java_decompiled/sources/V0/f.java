package V0;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeRefreshLayout f7613b;

    public /* synthetic */ f(SwipeRefreshLayout swipeRefreshLayout, int i9) {
        this.f7612a = i9;
        this.f7613b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        i iVar;
        switch (this.f7612a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.f7613b;
                if (swipeRefreshLayout.f10362c) {
                    swipeRefreshLayout.f10390z.setAlpha(255);
                    swipeRefreshLayout.f10390z.start();
                    if (swipeRefreshLayout.f10366f0 && (iVar = swipeRefreshLayout.f10361b) != null) {
                        iVar.b();
                    }
                    swipeRefreshLayout.f10378n = swipeRefreshLayout.f10384t.getTop();
                    return;
                }
                swipeRefreshLayout.l();
                return;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.f7613b;
                swipeRefreshLayout2.getClass();
                g gVar = new g(swipeRefreshLayout2, 1);
                swipeRefreshLayout2.f10357B = gVar;
                gVar.setDuration(150L);
                a aVar = swipeRefreshLayout2.f10384t;
                aVar.f7577a = null;
                aVar.clearAnimation();
                swipeRefreshLayout2.f10384t.startAnimation(swipeRefreshLayout2.f10357B);
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i9 = this.f7612a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i9 = this.f7612a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
