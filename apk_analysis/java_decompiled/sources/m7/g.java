package m7;

import android.net.Uri;
import i7.C1386a;
import i7.C1387b;
import java.net.URL;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final C1387b f20888a;

    /* renamed from: b, reason: collision with root package name */
    public final E7.i f20889b;

    public g(C1387b appInfo, E7.i blockingDispatcher) {
        kotlin.jvm.internal.h.e(appInfo, "appInfo");
        kotlin.jvm.internal.h.e(blockingDispatcher, "blockingDispatcher");
        this.f20888a = appInfo;
        this.f20889b = blockingDispatcher;
    }

    public static final URL a(g gVar) {
        gVar.getClass();
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        C1387b c1387b = gVar.f20888a;
        Uri.Builder appendPath2 = appendPath.appendPath(c1387b.f18828a).appendPath("settings");
        C1386a c1386a = c1387b.f18829b;
        return new URL(appendPath2.appendQueryParameter("build_version", c1386a.f18822c).appendQueryParameter("display_version", c1386a.f18821b).build().toString());
    }
}
