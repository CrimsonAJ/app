package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.ArrayList;

/* renamed from: androidx.mediarouter.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AnimationAnimationListenerC0577m implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10106b;

    public /* synthetic */ AnimationAnimationListenerC0577m(int i9, Object obj) {
        this.f10105a = i9;
        this.f10106b = obj;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.f10105a) {
            case 0:
                return;
            case 1:
                ((s) this.f10106b).j(true);
                return;
            default:
                N n7 = ((L) this.f10106b).f9979m;
                n7.f10045y = false;
                n7.n();
                return;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i9 = this.f10105a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f10105a) {
            case 0:
                s sVar = (s) this.f10106b;
                OverlayListView overlayListView = sVar.f10141X;
                ArrayList arrayList = overlayListView.f10058a;
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    O o9 = (O) obj;
                    if (!o9.j) {
                        o9.f10055i = overlayListView.getDrawingTime();
                        o9.j = true;
                    }
                }
                sVar.f10141X.postDelayed(sVar.f10140M0, sVar.f10133F0);
                return;
            case 1:
                return;
            default:
                ((L) this.f10106b).f9979m.f10045y = true;
                return;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }

    private final void e(Animation animation) {
    }
}
