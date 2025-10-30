package L1;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.lifecycle.Y;
import com.anilab.android.ui.activity.MainActivity;

/* renamed from: L1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224f extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4522a;

    public C0224f(MainActivity mainActivity) {
        this.f4522a = mainActivity;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        kotlin.jvm.internal.h.e(network, "network");
        super.onAvailable(network);
        MainActivity mainActivity = this.f4522a;
        androidx.lifecycle.r f9 = Y.f(mainActivity);
        f8.e eVar = Y7.K.f8773a;
        Y7.B.r(f9, d8.o.f17003a, new C0222d(mainActivity, network, null), 2);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        kotlin.jvm.internal.h.e(network, "network");
        kotlin.jvm.internal.h.e(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        MainActivity mainActivity = this.f4522a;
        androidx.lifecycle.r f9 = Y.f(mainActivity);
        f8.e eVar = Y7.K.f8773a;
        Y7.B.r(f9, d8.o.f17003a, new C0223e(mainActivity, network, null), 2);
    }
}
