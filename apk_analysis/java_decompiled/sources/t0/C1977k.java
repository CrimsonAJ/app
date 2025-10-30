package t0;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* renamed from: t0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1977k extends MediaRouter2$RouteCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1979m f23003b;

    public /* synthetic */ C1977k(C1979m c1979m, int i9) {
        this.f23002a = i9;
        this.f23003b = c1979m;
    }

    public void onRoutesAdded(List list) {
        switch (this.f23002a) {
            case 0:
                this.f23003b.i();
                return;
            default:
                super.onRoutesAdded(list);
                return;
        }
    }

    public void onRoutesChanged(List list) {
        switch (this.f23002a) {
            case 0:
                this.f23003b.i();
                return;
            default:
                super.onRoutesChanged(list);
                return;
        }
    }

    public void onRoutesRemoved(List list) {
        switch (this.f23002a) {
            case 0:
                this.f23003b.i();
                return;
            default:
                super.onRoutesRemoved(list);
                return;
        }
    }

    public void onRoutesUpdated(List list) {
        switch (this.f23002a) {
            case 1:
                this.f23003b.i();
                return;
            default:
                super.onRoutesUpdated(list);
                return;
        }
    }
}
