package i7;

import android.os.Build;

/* renamed from: i7.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1389d implements L6.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1389d f18841a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final L6.c f18842b = L6.c.a("appId");

    /* renamed from: c, reason: collision with root package name */
    public static final L6.c f18843c = L6.c.a("deviceModel");

    /* renamed from: d, reason: collision with root package name */
    public static final L6.c f18844d = L6.c.a("sessionSdkVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final L6.c f18845e = L6.c.a("osVersion");

    /* renamed from: f, reason: collision with root package name */
    public static final L6.c f18846f = L6.c.a("logEnvironment");

    /* renamed from: g, reason: collision with root package name */
    public static final L6.c f18847g = L6.c.a("androidAppInfo");

    @Override // L6.a
    public final void a(Object obj, Object obj2) {
        C1387b c1387b = (C1387b) obj;
        L6.e eVar = (L6.e) obj2;
        eVar.a(f18842b, c1387b.f18828a);
        eVar.a(f18843c, Build.MODEL);
        eVar.a(f18844d, "2.1.2");
        eVar.a(f18845e, Build.VERSION.RELEASE);
        eVar.a(f18846f, C.LOG_ENVIRONMENT_PROD);
        eVar.a(f18847g, c1387b.f18829b);
    }
}
