package t0;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1974h extends MediaRouter2$ControllerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1979m f22989a;

    public C1974h(C1979m c1979m) {
        this.f22989a = c1979m;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.f22989a.j(routingController);
    }
}
