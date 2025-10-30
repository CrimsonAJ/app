package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: p.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1787c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f21972b;

    public /* synthetic */ RunnableC1787c(ActionBarOverlayLayout actionBarOverlayLayout, int i9) {
        this.f21971a = i9;
        this.f21972b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21971a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f21972b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f9418w = actionBarOverlayLayout.f9400d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f9419x);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f21972b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f9418w = actionBarOverlayLayout2.f9400d.animate().translationY(-actionBarOverlayLayout2.f9400d.getHeight()).setListener(actionBarOverlayLayout2.f9419x);
                return;
        }
    }
}
