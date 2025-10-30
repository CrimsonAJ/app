package t0;

import P.x0;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l1.C1535g;

/* renamed from: t0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1979m extends AbstractC1986u {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f23005s = 0;

    /* renamed from: i, reason: collision with root package name */
    public final MediaRouter2 f23006i;
    public final com.google.firebase.messaging.u j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayMap f23007k;

    /* renamed from: l, reason: collision with root package name */
    public final MediaRouter2$RouteCallback f23008l;

    /* renamed from: m, reason: collision with root package name */
    public final C1978l f23009m;

    /* renamed from: n, reason: collision with root package name */
    public final C1974h f23010n;

    /* renamed from: o, reason: collision with root package name */
    public final ExecutorC1973g f23011o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f23012p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f23013q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayMap f23014r;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public C1979m(Context context, com.google.firebase.messaging.u uVar) {
        super(context, null);
        MediaRouter2 mediaRouter2;
        this.f23007k = new ArrayMap();
        this.f23009m = new C1978l(this);
        this.f23010n = new C1974h(this);
        this.f23013q = new ArrayList();
        this.f23014r = new ArrayMap();
        mediaRouter2 = MediaRouter2.getInstance(context);
        this.f23006i = mediaRouter2;
        this.j = uVar;
        this.f23011o = new ExecutorC1973g(new Handler(Looper.getMainLooper()));
        if (Build.VERSION.SDK_INT >= 34) {
            this.f23008l = new C1977k(this, 1);
        } else {
            this.f23008l = new C1977k(this, 0);
        }
    }

    @Override // t0.AbstractC1986u
    public final r a(String str, C1985t c1985t) {
        Iterator it = this.f23007k.entrySet().iterator();
        while (it.hasNext()) {
            C1975i c1975i = (C1975i) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, c1975i.f22990f)) {
                return c1975i;
            }
        }
        return null;
    }

    @Override // t0.AbstractC1986u
    public final AbstractC1984s b(String str) {
        return new C1976j((String) this.f23014r.get(str), null);
    }

    @Override // t0.AbstractC1986u
    public final AbstractC1984s c(String str, String str2) {
        String id;
        String str3 = (String) this.f23014r.get(str);
        for (C1975i c1975i : this.f23007k.values()) {
            C1980n c1980n = c1975i.f22998o;
            if (c1980n == null) {
                id = c1975i.f22991g.getId();
            } else {
                id = c1980n.d();
            }
            if (TextUtils.equals(str2, id)) {
                return new C1976j(str3, c1975i);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new C1976j(str3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012f A[SYNTHETIC] */
    @Override // t0.AbstractC1986u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(t0.C1981o r15) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C1979m.e(t0.o):void");
    }

    public final MediaRoute2Info h(String str) {
        String id;
        if (str != null) {
            ArrayList arrayList = this.f23013q;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                MediaRoute2Info h7 = x0.h(obj);
                id = h7.getId();
                if (TextUtils.equals(id, str)) {
                    return h7;
                }
            }
            return null;
        }
        return null;
    }

    public final void i() {
        List routes;
        Bundle extras;
        String id;
        boolean isSystemRoute;
        String id2;
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        routes = this.f23006i.getRoutes();
        Iterator it = routes.iterator();
        while (it.hasNext()) {
            MediaRoute2Info h7 = x0.h(it.next());
            if (h7 != null && !arraySet.contains(h7)) {
                isSystemRoute = h7.isSystemRoute();
                if (!isSystemRoute) {
                    if (this.f23012p) {
                        id2 = h7.getId();
                        if (!id2.startsWith(this.f23035a.getPackageName() + "/")) {
                        }
                    }
                    arraySet.add(h7);
                    arrayList.add(h7);
                }
            }
        }
        if (arrayList.equals(this.f23013q)) {
            return;
        }
        this.f23013q = arrayList;
        ArrayMap arrayMap = this.f23014r;
        arrayMap.clear();
        ArrayList arrayList2 = this.f23013q;
        int size = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            MediaRoute2Info h9 = x0.h(obj);
            extras = h9.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                id = h9.getId();
                arrayMap.put(id, extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + h9);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.f23013q;
        int size2 = arrayList4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList4.get(i11);
            i11++;
            C1980n g02 = AbstractC1002u1.g0(x0.h(obj2));
            if (g02 != null) {
                arrayList3.add(g02);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i9 < size3) {
                Object obj3 = arrayList3.get(i9);
                i9++;
                C1980n c1980n = (C1980n) obj3;
                if (c1980n != null) {
                    if (!arrayList5.contains(c1980n)) {
                        arrayList5.add(c1980n);
                    } else {
                        throw new IllegalArgumentException("route descriptor already added");
                    }
                } else {
                    throw new IllegalArgumentException("route must not be null");
                }
            }
        }
        f(new C1987v(arrayList5, true));
    }

    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, l1.g] */
    public final void j(MediaRouter2.RoutingController routingController) {
        List selectedRoutes;
        Bundle controlHints;
        C1535g c1535g;
        int volume;
        int volumeMax;
        int volumeHandling;
        List selectableRoutes;
        List deselectableRoutes;
        int i9;
        String id;
        C1975i c1975i = (C1975i) this.f23007k.get(routingController);
        if (c1975i != null) {
            selectedRoutes = routingController.getSelectedRoutes();
            if (selectedRoutes.isEmpty()) {
                Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
                return;
            }
            ArrayList E8 = AbstractC1002u1.E(selectedRoutes);
            int i10 = 0;
            C1980n g02 = AbstractC1002u1.g0(x0.h(selectedRoutes.get(0)));
            controlHints = routingController.getControlHints();
            String string = this.f23035a.getString(R.string.mr_dialog_default_group_name);
            C1980n c1980n = null;
            if (controlHints != null) {
                try {
                    String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                    if (!TextUtils.isEmpty(string2)) {
                        string = string2;
                    }
                    Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                    if (bundle != null) {
                        c1980n = new C1980n(bundle);
                    }
                } catch (Exception e8) {
                    Log.w("MR2Provider", "Exception while unparceling control hints.", e8);
                }
            }
            if (c1980n == null) {
                id = routingController.getId();
                c1535g = new C1535g(id, string);
                Bundle bundle2 = (Bundle) c1535g.f20182a;
                bundle2.putInt("connectionState", 2);
                bundle2.putInt("playbackType", 1);
            } else {
                ?? obj = new Object();
                obj.f20183b = new ArrayList();
                obj.f20184c = new ArrayList();
                obj.f20185d = new HashSet();
                obj.f20182a = new Bundle(c1980n.f23015a);
                obj.f20183b = c1980n.c();
                obj.f20184c = c1980n.b();
                obj.f20185d = c1980n.a();
                c1535g = obj;
            }
            volume = routingController.getVolume();
            Bundle bundle3 = (Bundle) c1535g.f20182a;
            bundle3.putInt("volume", volume);
            volumeMax = routingController.getVolumeMax();
            bundle3.putInt("volumeMax", volumeMax);
            volumeHandling = routingController.getVolumeHandling();
            bundle3.putInt("volumeHandling", volumeHandling);
            ((ArrayList) c1535g.f20184c).clear();
            c1535g.a(g02.b());
            ArrayList arrayList = (ArrayList) c1535g.f20183b;
            arrayList.clear();
            if (!E8.isEmpty()) {
                int size = E8.size();
                while (i10 < size) {
                    Object obj2 = E8.get(i10);
                    i10++;
                    String str = (String) obj2;
                    if (!TextUtils.isEmpty(str)) {
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                }
            }
            C1980n f9 = c1535g.f();
            selectableRoutes = routingController.getSelectableRoutes();
            ArrayList E9 = AbstractC1002u1.E(selectableRoutes);
            deselectableRoutes = routingController.getDeselectableRoutes();
            ArrayList E10 = AbstractC1002u1.E(deselectableRoutes);
            C1987v c1987v = this.f23041g;
            if (c1987v == null) {
                Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            List<C1980n> list = c1987v.f23044b;
            if (!list.isEmpty()) {
                for (C1980n c1980n2 : list) {
                    String d9 = c1980n2.d();
                    if (E8.contains(d9)) {
                        i9 = 3;
                    } else {
                        i9 = 1;
                    }
                    arrayList2.add(new C1983q(c1980n2, i9, E10.contains(d9), E9.contains(d9), true));
                }
            }
            c1975i.f22998o = f9;
            c1975i.l(f9, arrayList2);
            return;
        }
        Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
    }
}
