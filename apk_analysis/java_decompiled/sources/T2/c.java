package T2;

import Q2.Q;
import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7060a;

    public c(d dVar) {
        this.f7060a = dVar;
    }

    @Override // Q2.Q
    public final void c(long j) {
        d dVar = this.f7060a;
        dVar.f7063w0 = (int) j;
        Iterator it = dVar.f7062v0.f7053d.iterator();
        if (!it.hasNext()) {
        } else {
            throw A0.a.h(it);
        }
    }

    @Override // Q2.Q
    public final void e(long j, boolean z9) {
        d dVar = this.f7060a;
        dVar.f7063w0 = (int) j;
        a aVar = dVar.f7062v0;
        aVar.f7059k = false;
        if (aVar.j && aVar.f7055f && aVar.f7056g) {
            if (aVar.f7058i) {
                U2.a aVar2 = aVar.f7051b;
                FrameLayout frameLayout = aVar.f7050a;
                U2.d dVar2 = (U2.d) aVar2;
                if (!dVar2.f7291b) {
                    dVar2.f7290a = false;
                    dVar2.f7291b = true;
                    d dVar3 = aVar.f7052c;
                    View f9 = U2.d.f(frameLayout, dVar3);
                    View g9 = U2.d.g(frameLayout);
                    dVar2.b(frameLayout, g9, f9);
                    if (dVar2.f7292c) {
                        dVar2.f7292c = false;
                        dVar2.i(frameLayout, dVar3, g9, f9);
                    } else if (dVar2.f7294e) {
                        dVar2.f7294e = false;
                        dVar2.i(frameLayout, dVar3, g9, f9);
                    } else {
                        U2.d.j(dVar3, f9, g9);
                        g9.setVisibility(0);
                        frameLayout.setVisibility(0);
                        float height = frameLayout.getHeight() / f9.getLayoutParams().height;
                        f9.setX(U2.d.c(frameLayout, dVar3));
                        f9.setY(((int) ((frameLayout.getHeight() / 2.0f) + frameLayout.getY())) - (f9.getHeight() / 2.0f));
                        f9.setScaleX(height);
                        f9.setScaleY(height);
                        f9.setVisibility(4);
                        if (frameLayout.isAttachedToWindow()) {
                            dVar2.f7295f = true;
                            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(frameLayout, frameLayout.getWidth() / 2, frameLayout.getHeight() / 2, (float) Math.hypot(frameLayout.getWidth() / 2.0f, frameLayout.getHeight() / 2.0f), frameLayout.getHeight() / 2.0f);
                            dVar2.f7296g = createCircularReveal;
                            createCircularReveal.setDuration(125L);
                            dVar2.f7296g.setInterpolator(new AccelerateInterpolator());
                            dVar2.f7296g.setTarget(frameLayout);
                            dVar2.f7296g.addListener(new U2.c(dVar2, frameLayout, dVar3, g9, f9));
                            g9.setVisibility(0);
                            g9.animate().alpha(1.0f).setDuration(62L).setInterpolator(new AccelerateInterpolator()).start();
                            dVar2.f7296g.start();
                        }
                    }
                }
            } else {
                U2.a aVar3 = aVar.f7051b;
                FrameLayout frameLayout2 = aVar.f7050a;
                d dVar4 = aVar.f7052c;
                U2.d dVar5 = (U2.d) aVar3;
                dVar5.getClass();
                View g10 = U2.d.g(frameLayout2);
                View f10 = U2.d.f(frameLayout2, dVar4);
                g10.setVisibility(4);
                f10.setVisibility(4);
                dVar5.b(frameLayout2, g10, f10);
                aVar.f7050a.setVisibility(4);
            }
            aVar.f7055f = false;
            Iterator it = aVar.f7054e.iterator();
            if (it.hasNext()) {
                throw A0.a.h(it);
            }
        }
        Iterator it2 = aVar.f7053d.iterator();
        if (!it2.hasNext()) {
        } else {
            throw A0.a.h(it2);
        }
    }

    @Override // Q2.Q
    public final void h(long j) {
        int i9 = (int) j;
        d dVar = this.f7060a;
        dVar.f7063w0 = i9;
        dVar.f7062v0.a(i9, true);
    }
}
