package t0;

import android.media.MediaRoute2Info;
import android.media.RouteDiscoveryPreference;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1972f {
    public static /* bridge */ /* synthetic */ CharSequence A(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getDescription();
    }

    public static /* bridge */ /* synthetic */ int C(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getVolumeMax();
    }

    public static /* bridge */ /* synthetic */ int D(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getVolume();
    }

    public static /* bridge */ /* synthetic */ int a(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getConnectionState();
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder e(ArrayList arrayList) {
        return new RouteDiscoveryPreference.Builder(arrayList, false);
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder f(ArrayList arrayList, boolean z9) {
        return new RouteDiscoveryPreference.Builder(arrayList, z9);
    }

    public static /* bridge */ /* synthetic */ Uri h(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getIconUri();
    }

    public static /* bridge */ /* synthetic */ Bundle i(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getExtras();
    }

    public static /* bridge */ /* synthetic */ CharSequence k(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getName();
    }

    public static /* bridge */ /* synthetic */ String l(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getId();
    }

    public static /* synthetic */ void o() {
    }

    public static /* bridge */ /* synthetic */ int z(MediaRoute2Info mediaRoute2Info) {
        return mediaRoute2Info.getVolumeHandling();
    }
}
