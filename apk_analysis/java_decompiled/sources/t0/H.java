package t0;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class H extends MediaRouter.VolumeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final N f22874a;

    public H(N n7) {
        this.f22874a = n7;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i9) {
        this.f22874a.getClass();
        M m9 = N.m(routeInfo);
        if (m9 != null) {
            m9.f22881a.j(i9);
        }
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i9) {
        this.f22874a.getClass();
        M m9 = N.m(routeInfo);
        if (m9 != null) {
            m9.f22881a.k(i9);
        }
    }
}
