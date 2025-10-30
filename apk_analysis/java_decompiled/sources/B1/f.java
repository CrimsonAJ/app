package B1;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.support.v4.media.session.y;
import com.google.android.gms.internal.cast.E;
import e1.q;
import java.util.List;
import java.util.Map;
import l1.C1533e;

/* loaded from: classes.dex */
public final class f extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f619b;

    public /* synthetic */ f(int i9, Object obj) {
        this.f618a = i9;
        this.f619b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f618a) {
            case 0:
                y.x((y) this.f619b, network, true);
                return;
            case 1:
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.f618a) {
            case 2:
                q.d().a(C1533e.j, "Network capabilities changed: " + networkCapabilities, new Throwable[0]);
                C1533e c1533e = (C1533e) this.f619b;
                c1533e.c(c1533e.f());
                return;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.f618a) {
            case 1:
                ((E) this.f619b).a(network, linkProperties);
                return;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        List list;
        switch (this.f618a) {
            case 0:
                y.x((y) this.f619b, network, false);
                return;
            case 1:
                E e8 = (E) this.f619b;
                synchronized (e8.f14711h) {
                    try {
                        Map map = e8.f14707d;
                        if (map != null && (list = e8.f14708e) != null) {
                            E.j.b("the network is lost", new Object[0]);
                            if (list.remove(network)) {
                                map.remove(network);
                            }
                            e8.b();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                q.d().a(C1533e.j, "Network connection lost", new Throwable[0]);
                C1533e c1533e = (C1533e) this.f619b;
                c1533e.c(c1533e.f());
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        List list;
        switch (this.f618a) {
            case 1:
                E e8 = (E) this.f619b;
                synchronized (e8.f14711h) {
                    Map map = e8.f14707d;
                    if (map != null && (list = e8.f14708e) != null) {
                        E.j.b("all networks are unavailable.", new Object[0]);
                        map.clear();
                        list.clear();
                        e8.b();
                        return;
                    }
                    return;
                }
            default:
                super.onUnavailable();
                return;
        }
    }

    private final void a(Network network) {
    }
}
