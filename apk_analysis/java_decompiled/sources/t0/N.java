package t0;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import co.notix.R;
import f5.C1183o;
import java.util.ArrayList;
import java.util.Locale;
import l1.C1535g;

/* loaded from: classes.dex */
public class N extends O {

    /* renamed from: s, reason: collision with root package name */
    public static final ArrayList f22883s;

    /* renamed from: t, reason: collision with root package name */
    public static final ArrayList f22884t;

    /* renamed from: i, reason: collision with root package name */
    public final C1971e f22885i;
    public final MediaRouter j;

    /* renamed from: k, reason: collision with root package name */
    public final G f22886k;

    /* renamed from: l, reason: collision with root package name */
    public final H f22887l;

    /* renamed from: m, reason: collision with root package name */
    public final MediaRouter.RouteCategory f22888m;

    /* renamed from: n, reason: collision with root package name */
    public int f22889n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f22890o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f22891p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f22892q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f22893r;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        f22883s = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        f22884t = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public N(Context context, C1971e c1971e) {
        super(context, new C1183o(16, new ComponentName("android", O.class.getName())));
        this.f22892q = new ArrayList();
        this.f22893r = new ArrayList();
        this.f22885i = c1971e;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.j = mediaRouter;
        this.f22886k = new G(this);
        this.f22887l = new H(this);
        this.f22888m = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(R.string.mr_user_route_category_name), false);
        s();
    }

    public static M m(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof M) {
            return (M) tag;
        }
        return null;
    }

    public static void t(M m9) {
        int i9;
        MediaRouter.UserRouteInfo userRouteInfo = m9.f22882b;
        C c3 = m9.f22881a;
        userRouteInfo.setName(c3.f22843d);
        userRouteInfo.setPlaybackType(c3.f22850l);
        userRouteInfo.setPlaybackStream(c3.f22851m);
        userRouteInfo.setVolume(c3.f22854p);
        userRouteInfo.setVolumeMax(c3.f22855q);
        if (c3.e() && !D.g()) {
            i9 = 0;
        } else {
            i9 = c3.f22853o;
        }
        userRouteInfo.setVolumeHandling(i9);
        userRouteInfo.setDescription(c3.f22844e);
    }

    @Override // t0.AbstractC1986u
    public final AbstractC1984s b(String str) {
        int j = j(str);
        if (j >= 0) {
            return new K(((L) this.f22892q.get(j)).f22878a);
        }
        return null;
    }

    @Override // t0.AbstractC1986u
    public final void e(C1981o c1981o) {
        boolean z9;
        int i9 = 0;
        if (c1981o != null) {
            c1981o.a();
            ArrayList c3 = c1981o.f23017b.c();
            int size = c3.size();
            int i10 = 0;
            while (i9 < size) {
                String str = (String) c3.get(i9);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i10 |= 1;
                } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    i10 |= 2;
                } else {
                    i10 |= 8388608;
                }
                i9++;
            }
            z9 = c1981o.b();
            i9 = i10;
        } else {
            z9 = false;
        }
        if (this.f22889n == i9 && this.f22890o == z9) {
            return;
        }
        this.f22889n = i9;
        this.f22890o = z9;
        s();
    }

    public final boolean h(MediaRouter.RouteInfo routeInfo) {
        String format;
        String str;
        if (m(routeInfo) != null || i(routeInfo) >= 0) {
            return false;
        }
        if (this.j.getDefaultRoute() == routeInfo) {
            format = "DEFAULT_ROUTE";
        } else {
            format = String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(l(routeInfo).hashCode()));
        }
        String str2 = format;
        if (j(str2) >= 0) {
            int i9 = 2;
            while (true) {
                Locale locale = Locale.US;
                str = str2 + "_" + i9;
                if (j(str) < 0) {
                    break;
                }
                i9++;
            }
            str2 = str;
        }
        L l9 = new L(routeInfo, str2);
        C1535g c1535g = new C1535g(str2, l(routeInfo));
        n(l9, c1535g);
        l9.f22880c = c1535g.f();
        this.f22892q.add(l9);
        return true;
    }

    public final int i(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.f22892q;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((L) arrayList.get(i9)).f22878a == routeInfo) {
                return i9;
            }
        }
        return -1;
    }

    public final int j(String str) {
        ArrayList arrayList = this.f22892q;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((L) arrayList.get(i9)).f22879b.equals(str)) {
                return i9;
            }
        }
        return -1;
    }

    public final int k(C c3) {
        ArrayList arrayList = this.f22893r;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (((M) arrayList.get(i9)).f22881a == c3) {
                return i9;
            }
        }
        return -1;
    }

    public final String l(MediaRouter.RouteInfo routeInfo) {
        int i9;
        int i10;
        Context context = this.f23035a;
        CharSequence name = routeInfo.getName(context);
        if (!TextUtils.isEmpty(name)) {
            return name.toString();
        }
        if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
            if (Build.VERSION.SDK_INT >= 24) {
                i9 = routeInfo.getDeviceType();
            } else {
                i9 = 0;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        i10 = R.string.mr_route_name_unknown;
                    } else {
                        i10 = R.string.mr_route_name_bluetooth;
                    }
                } else {
                    i10 = R.string.mr_route_name_speaker;
                }
            } else {
                i10 = R.string.mr_route_name_tv;
            }
            return context.getString(i10);
        }
        return "";
    }

    public void n(L l9, C1535g c1535g) {
        boolean z9;
        int supportedTypes = l9.f22878a.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            c1535g.a(f22883s);
        }
        if ((supportedTypes & 2) != 0) {
            c1535g.a(f22884t);
        }
        MediaRouter.RouteInfo routeInfo = l9.f22878a;
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = (Bundle) c1535g.f20182a;
        bundle.putInt("playbackType", playbackType);
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
        if ((supportedTypes & 8388608) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        bundle.putBoolean("isSystemRoute", z9);
        if (!routeInfo.isEnabled()) {
            bundle.putBoolean("enabled", false);
        }
        if (routeInfo.isConnecting()) {
            bundle.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle.putString("status", description.toString());
        }
    }

    public final void o(C c3) {
        AbstractC1986u c9 = c3.c();
        MediaRouter mediaRouter = this.j;
        if (c9 != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f22888m);
            M m9 = new M(c3, createUserRoute);
            createUserRoute.setTag(m9);
            createUserRoute.setVolumeCallback(this.f22887l);
            t(m9);
            this.f22893r.add(m9);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int i9 = i(mediaRouter.getSelectedRoute(8388611));
        if (i9 >= 0 && ((L) this.f22892q.get(i9)).f22879b.equals(c3.f22841b)) {
            c3.l(false);
        }
    }

    public final void p(C c3) {
        int k5;
        if (c3.c() != this && (k5 = k(c3)) >= 0) {
            M m9 = (M) this.f22893r.remove(k5);
            m9.f22882b.setTag(null);
            MediaRouter.UserRouteInfo userRouteInfo = m9.f22882b;
            userRouteInfo.setVolumeCallback(null);
            try {
                this.j.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e8) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e8);
            }
        }
    }

    public final void q(C c3) {
        if (c3.g()) {
            AbstractC1986u c9 = c3.c();
            MediaRouter mediaRouter = this.j;
            if (c9 != this) {
                int k5 = k(c3);
                if (k5 >= 0) {
                    mediaRouter.selectRoute(8388611, ((M) this.f22893r.get(k5)).f22882b);
                    return;
                }
                return;
            }
            int j = j(c3.f22841b);
            if (j >= 0) {
                mediaRouter.selectRoute(8388611, ((L) this.f22892q.get(j)).f22878a);
            }
        }
    }

    public final void r() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f22892q;
        int size = arrayList2.size();
        for (int i9 = 0; i9 < size; i9++) {
            C1980n c1980n = ((L) arrayList2.get(i9)).f22880c;
            if (c1980n != null) {
                if (!arrayList.contains(c1980n)) {
                    arrayList.add(c1980n);
                } else {
                    throw new IllegalArgumentException("route descriptor already added");
                }
            } else {
                throw new IllegalArgumentException("route must not be null");
            }
        }
        f(new C1987v(arrayList, false));
    }

    public final void s() {
        boolean z9 = this.f22891p;
        MediaRouter mediaRouter = this.j;
        G g9 = this.f22886k;
        if (z9) {
            mediaRouter.removeCallback(g9);
        }
        this.f22891p = true;
        mediaRouter.addCallback(this.f22889n, g9, (this.f22890o ? 1 : 0) | 2);
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i9 = 0; i9 < routeCount; i9++) {
            arrayList.add(mediaRouter.getRouteAt(i9));
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z10 |= h((MediaRouter.RouteInfo) obj);
        }
        if (z10) {
            r();
        }
    }
}
