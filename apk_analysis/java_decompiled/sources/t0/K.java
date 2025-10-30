package t0;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class K extends AbstractC1984s {

    /* renamed from: a, reason: collision with root package name */
    public final MediaRouter.RouteInfo f22877a;

    public K(MediaRouter.RouteInfo routeInfo) {
        this.f22877a = routeInfo;
    }

    @Override // t0.AbstractC1984s
    public final void f(int i9) {
        this.f22877a.requestSetVolume(i9);
    }

    @Override // t0.AbstractC1984s
    public final void i(int i9) {
        this.f22877a.requestUpdateVolume(i9);
    }
}
