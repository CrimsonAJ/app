package i7;

import android.os.Build;

/* renamed from: i7.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1388c implements L6.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C1388c f18833a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final L6.c f18834b = L6.c.a("packageName");

    /* renamed from: c, reason: collision with root package name */
    public static final L6.c f18835c = L6.c.a("versionName");

    /* renamed from: d, reason: collision with root package name */
    public static final L6.c f18836d = L6.c.a("appBuildVersion");

    /* renamed from: e, reason: collision with root package name */
    public static final L6.c f18837e = L6.c.a("deviceManufacturer");

    /* renamed from: f, reason: collision with root package name */
    public static final L6.c f18838f = L6.c.a("currentProcessDetails");

    /* renamed from: g, reason: collision with root package name */
    public static final L6.c f18839g = L6.c.a("appProcessDetails");

    @Override // L6.a
    public final void a(Object obj, Object obj2) {
        C1386a c1386a = (C1386a) obj;
        L6.e eVar = (L6.e) obj2;
        eVar.a(f18834b, c1386a.f18820a);
        eVar.a(f18835c, c1386a.f18821b);
        eVar.a(f18836d, c1386a.f18822c);
        eVar.a(f18837e, Build.MANUFACTURER);
        eVar.a(f18838f, c1386a.f18823d);
        eVar.a(f18839g, c1386a.f18824e);
    }
}
