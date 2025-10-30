package co.notix;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public final class ne extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ te f12817a;

    public ne(te teVar) {
        this.f12817a = teVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        kotlin.jvm.internal.h.e(network, "network");
        this.f12817a.a(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        kotlin.jvm.internal.h.e(network, "network");
        this.f12817a.a(false);
    }
}
