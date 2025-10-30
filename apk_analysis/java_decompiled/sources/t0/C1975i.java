package t0;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1975i extends r {

    /* renamed from: f, reason: collision with root package name */
    public final String f22990f;

    /* renamed from: g, reason: collision with root package name */
    public final MediaRouter2.RoutingController f22991g;

    /* renamed from: h, reason: collision with root package name */
    public final Messenger f22992h;

    /* renamed from: i, reason: collision with root package name */
    public final Messenger f22993i;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f22994k;

    /* renamed from: o, reason: collision with root package name */
    public C1980n f22998o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1979m f22999p;
    public final SparseArray j = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f22995l = new AtomicInteger(1);

    /* renamed from: m, reason: collision with root package name */
    public final RunnableC1967a f22996m = new RunnableC1967a(1, this);

    /* renamed from: n, reason: collision with root package name */
    public int f22997n = -1;

    public C1975i(C1979m c1979m, MediaRouter2.RoutingController routingController, String str) {
        Bundle controlHints;
        Messenger messenger;
        this.f22999p = c1979m;
        this.f22991g = routingController;
        this.f22990f = str;
        int i9 = C1979m.f23005s;
        controlHints = routingController.getControlHints();
        if (controlHints == null) {
            messenger = null;
        } else {
            messenger = (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        }
        this.f22992h = messenger;
        this.f22993i = messenger != null ? new Messenger(new C3.e(this)) : null;
        this.f22994k = new Handler(Looper.getMainLooper());
    }

    @Override // t0.AbstractC1984s
    public final void d() {
        this.f22991g.release();
    }

    @Override // t0.AbstractC1984s
    public final void f(int i9) {
        MediaRouter2.RoutingController routingController = this.f22991g;
        if (routingController != null) {
            routingController.setVolume(i9);
            this.f22997n = i9;
            Handler handler = this.f22994k;
            RunnableC1967a runnableC1967a = this.f22996m;
            handler.removeCallbacks(runnableC1967a);
            handler.postDelayed(runnableC1967a, 1000L);
        }
    }

    @Override // t0.AbstractC1984s
    public final void i(int i9) {
        int volumeMax;
        MediaRouter2.RoutingController routingController = this.f22991g;
        if (routingController == null) {
            return;
        }
        int i10 = this.f22997n;
        if (i10 < 0) {
            i10 = routingController.getVolume();
        }
        int i11 = i10 + i9;
        volumeMax = this.f22991g.getVolumeMax();
        int max = Math.max(0, Math.min(i11, volumeMax));
        this.f22997n = max;
        this.f22991g.setVolume(max);
        Handler handler = this.f22994k;
        RunnableC1967a runnableC1967a = this.f22996m;
        handler.removeCallbacks(runnableC1967a);
        handler.postDelayed(runnableC1967a, 1000L);
    }

    @Override // t0.r
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info h7 = this.f22999p.h(str);
            if (h7 != null) {
                this.f22991g.selectRoute(h7);
                return;
            } else {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override // t0.r
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info h7 = this.f22999p.h(str);
            if (h7 != null) {
                this.f22991g.deselectRoute(h7);
                return;
            } else {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override // t0.r
    public final void o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
            return;
        }
        String str = (String) arrayList.get(0);
        C1979m c1979m = this.f22999p;
        MediaRoute2Info h7 = c1979m.h(str);
        if (h7 != null) {
            c1979m.f23006i.transferTo(h7);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
    }
}
