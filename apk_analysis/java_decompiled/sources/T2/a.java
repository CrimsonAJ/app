package T2;

import F0.C0106j;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public FrameLayout f7050a;

    /* renamed from: b, reason: collision with root package name */
    public U2.a f7051b;

    /* renamed from: c, reason: collision with root package name */
    public d f7052c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f7053d;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f7054e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7055f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7056g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f7057h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7058i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7059k;

    public final void a(int i9, boolean z9) {
        int left;
        boolean z10;
        float d9;
        if (this.f7056g) {
            d dVar = this.f7052c;
            int max = dVar.getMax();
            if (max == 0) {
                left = 0;
            } else {
                ViewGroup viewGroup = (ViewGroup) this.f7050a.getParent();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7050a.getLayoutParams();
                float f9 = i9 / max;
                left = this.f7050a.getLeft();
                int width = (viewGroup.getWidth() - viewGroup.getPaddingRight()) - marginLayoutParams.rightMargin;
                float thumbOffset = dVar.getThumbOffset();
                float left2 = dVar.getLeft() + thumbOffset;
                float right = ((((dVar.getRight() - thumbOffset) - left2) * f9) + left2) - (this.f7050a.getWidth() / 2.0f);
                float width2 = this.f7050a.getWidth() + right;
                float f10 = left;
                if (right >= f10 && width2 <= width) {
                    left = (int) right;
                } else if (right >= f10) {
                    left = width - this.f7050a.getWidth();
                }
            }
            this.f7050a.setX(left);
            if (this.f7058i) {
                U2.a aVar = this.f7051b;
                FrameLayout frameLayout = this.f7050a;
                U2.d dVar2 = (U2.d) aVar;
                if (dVar2.f7293d || dVar2.f7292c) {
                    View f11 = U2.d.f(frameLayout, dVar);
                    if (dVar2.f7292c) {
                        d9 = U2.d.c(frameLayout, dVar);
                    } else {
                        d9 = U2.d.d(dVar, U2.d.e(dVar));
                    }
                    ValueAnimator valueAnimator = dVar2.f7297h;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        dVar2.f7297h.cancel();
                    }
                    f11.setX(d9);
                }
            }
            if (!this.f7059k && z9 && (z10 = this.f7057h)) {
                this.f7059k = true;
                if (!this.f7055f && this.f7056g && z10) {
                    if (this.f7058i) {
                        U2.a aVar2 = this.f7051b;
                        FrameLayout frameLayout2 = this.f7050a;
                        U2.d dVar3 = (U2.d) aVar2;
                        dVar3.getClass();
                        if (dVar.getMax() != 0 && !dVar3.f7290a) {
                            dVar3.f7291b = false;
                            dVar3.f7290a = true;
                            View g9 = U2.d.g(frameLayout2);
                            View f12 = U2.d.f(frameLayout2, dVar);
                            dVar3.b(frameLayout2, g9, f12);
                            if (!dVar3.f7293d && !dVar3.f7295f) {
                                U2.d.j(dVar, f12, g9);
                                f12.setY(dVar.getY() + dVar.getThumbOffset());
                                f12.setX(U2.d.d(dVar, U2.d.e(dVar)));
                                f12.setScaleX(0.0f);
                                f12.setScaleY(0.0f);
                                f12.setAlpha(1.0f);
                                dVar3.f7292c = true;
                                float height = frameLayout2.getHeight() / f12.getLayoutParams().height;
                                g9.setVisibility(4);
                                frameLayout2.setVisibility(4);
                                f12.setVisibility(0);
                                dVar3.a(f12, U2.d.c(frameLayout2, dVar));
                                f12.animate().y(((int) ((frameLayout2.getHeight() / 2.0f) + frameLayout2.getY())) - (f12.getHeight() / 2.0f)).scaleY(height).scaleX(height).setDuration(100L).setInterpolator(new AccelerateInterpolator()).setListener(new C0106j(dVar3, g9, frameLayout2, f12)).start();
                            } else {
                                dVar3.f7293d = false;
                                dVar3.f7295f = false;
                                dVar3.h(frameLayout2, g9, f12);
                            }
                        }
                    } else {
                        U2.a aVar3 = this.f7051b;
                        FrameLayout frameLayout3 = this.f7050a;
                        U2.d dVar4 = (U2.d) aVar3;
                        dVar4.getClass();
                        View g10 = U2.d.g(frameLayout3);
                        View f13 = U2.d.f(frameLayout3, dVar);
                        g10.setVisibility(4);
                        f13.setVisibility(4);
                        dVar4.b(frameLayout3, g10, f13);
                        this.f7050a.setVisibility(0);
                    }
                    this.f7055f = true;
                    Iterator it = this.f7054e.iterator();
                    if (it.hasNext()) {
                        throw A0.a.h(it);
                    }
                }
            }
            Iterator it2 = this.f7053d.iterator();
            if (!it2.hasNext()) {
            } else {
                throw A0.a.h(it2);
            }
        }
    }
}
