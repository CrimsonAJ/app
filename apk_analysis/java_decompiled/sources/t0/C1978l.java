package t0;

import P.x0;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: t0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1978l extends MediaRouter2$TransferCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1979m f23004a;

    public C1978l(C1979m c1979m) {
        this.f23004a = c1979m;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        C1979m c1979m = this.f23004a;
        AbstractC1984s abstractC1984s = (AbstractC1984s) c1979m.f23007k.remove(routingController);
        if (abstractC1984s != null) {
            C1971e c1971e = (C1971e) c1979m.j.f16512a;
            if (abstractC1984s == c1971e.f22967e) {
                C c3 = c1971e.c();
                if (c1971e.g() != c3) {
                    c1971e.k(c3, 2, true);
                    return;
                }
                return;
            }
            int i9 = C1971e.f22957F;
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        MediaRouter2.RoutingController systemController;
        List selectedRoutes;
        String id;
        C c3;
        this.f23004a.f23007k.remove(routingController);
        systemController = this.f23004a.f23006i.getSystemController();
        if (routingController2 != systemController) {
            selectedRoutes = routingController2.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
                return;
            }
            int i9 = 0;
            id = x0.h(selectedRoutes.get(0)).getId();
            this.f23004a.f23007k.put(routingController2, new C1975i(this.f23004a, routingController2, id));
            C1971e c1971e = (C1971e) this.f23004a.j.f16512a;
            ArrayList arrayList = c1971e.f22971i;
            int size = arrayList.size();
            while (true) {
                if (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    c3 = (C) obj;
                    if (c3.c() == c1971e.f22979r && TextUtils.equals(id, c3.f22841b)) {
                        break;
                    }
                } else {
                    c3 = null;
                    break;
                }
            }
            if (c3 == null) {
                Log.w("AxMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
            } else {
                c1971e.k(c3, 3, true);
            }
            this.f23004a.j(routingController2);
            return;
        }
        C1971e c1971e2 = (C1971e) this.f23004a.j.f16512a;
        C c9 = c1971e2.c();
        if (c1971e2.g() != c9) {
            c1971e2.k(c9, 3, true);
        }
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
