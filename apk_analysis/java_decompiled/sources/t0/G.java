package t0;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
import l1.C1535g;

/* loaded from: classes.dex */
public final class G extends MediaRouter.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final N f22873a;

    public G(N n7) {
        this.f22873a = n7;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        N n7 = this.f22873a;
        if (n7.h(routeInfo)) {
            n7.r();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i9;
        N n7 = this.f22873a;
        n7.getClass();
        if (N.m(routeInfo) == null && (i9 = n7.i(routeInfo)) >= 0) {
            L l9 = (L) n7.f22892q.get(i9);
            C1535g c1535g = new C1535g(l9.f22879b, n7.l(l9.f22878a));
            n7.n(l9, c1535g);
            l9.f22880c = c1535g.f();
            n7.r();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i9) {
        this.f22873a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i9;
        N n7 = this.f22873a;
        int i10 = n7.i(routeInfo);
        if (i10 >= 0) {
            L l9 = (L) n7.f22892q.get(i10);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i9 = presentationDisplay.getDisplayId();
            } else {
                i9 = -1;
            }
            if (i9 != l9.f22880c.f23015a.getInt("presentationDisplayId", -1)) {
                C1980n c1980n = l9.f22880c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (c1980n != null) {
                    Bundle bundle = new Bundle(c1980n.f23015a);
                    ArrayList c3 = c1980n.c();
                    ArrayList b9 = c1980n.b();
                    HashSet a5 = c1980n.a();
                    bundle.putInt("presentationDisplayId", i9);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b9));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c3));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a5));
                    l9.f22880c = new C1980n(bundle);
                    n7.r();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i9;
        N n7 = this.f22873a;
        n7.getClass();
        if (N.m(routeInfo) == null && (i9 = n7.i(routeInfo)) >= 0) {
            n7.f22892q.remove(i9);
            n7.r();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i9, MediaRouter.RouteInfo routeInfo) {
        C a5;
        N n7 = this.f22873a;
        if (routeInfo == n7.j.getSelectedRoute(8388611)) {
            M m9 = N.m(routeInfo);
            if (m9 != null) {
                m9.f22881a.l(false);
                return;
            }
            int i10 = n7.i(routeInfo);
            if (i10 >= 0) {
                String str = ((L) n7.f22892q.get(i10)).f22879b;
                C1971e c1971e = n7.f22885i;
                c1971e.f22963a.removeMessages(262);
                C1966B d9 = c1971e.d(c1971e.f22980s);
                if (d9 != null && (a5 = d9.a(str)) != null) {
                    a5.l(false);
                }
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f22873a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i9, MediaRouter.RouteInfo routeInfo) {
        this.f22873a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i9;
        N n7 = this.f22873a;
        n7.getClass();
        if (N.m(routeInfo) == null && (i9 = n7.i(routeInfo)) >= 0) {
            L l9 = (L) n7.f22892q.get(i9);
            int volume = routeInfo.getVolume();
            if (volume != l9.f22880c.f23015a.getInt("volume")) {
                C1980n c1980n = l9.f22880c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (c1980n != null) {
                    Bundle bundle = new Bundle(c1980n.f23015a);
                    ArrayList c3 = c1980n.c();
                    ArrayList b9 = c1980n.b();
                    HashSet a5 = c1980n.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b9));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c3));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a5));
                    l9.f22880c = new C1980n(bundle);
                    n7.r();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
