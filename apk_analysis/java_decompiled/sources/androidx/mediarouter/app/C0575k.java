package androidx.mediarouter.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* renamed from: androidx.mediarouter.app.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0575k extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10099b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10100c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f10101d;

    public /* synthetic */ C0575k(int i9, int i10, int i11, View view) {
        this.f10098a = i11;
        this.f10099b = i9;
        this.f10100c = i10;
        this.f10101d = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f9, Transformation transformation) {
        int i9 = this.f10100c;
        int i10 = this.f10099b;
        View view = this.f10101d;
        switch (this.f10098a) {
            case 0:
                s.n(view, i10 - ((int) ((i10 - i9) * f9)));
                return;
            case 1:
                int i11 = i9 + ((int) ((i10 - i9) * f9));
                int i12 = N.r0;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.height = i11;
                view.setLayoutParams(layoutParams);
                return;
            default:
                ((SwipeRefreshLayout) view).f10390z.setAlpha((int) (((i9 - i10) * f9) + i10));
                return;
        }
    }

    public C0575k(SwipeRefreshLayout swipeRefreshLayout, int i9, int i10) {
        this.f10098a = 2;
        this.f10101d = swipeRefreshLayout;
        this.f10099b = i9;
        this.f10100c = i10;
    }
}
