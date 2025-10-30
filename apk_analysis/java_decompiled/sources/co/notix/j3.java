package co.notix;

import Y7.InterfaceC0484z;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final d4 f12505a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0484z f12506b;

    /* renamed from: c, reason: collision with root package name */
    public final tb f12507c;

    /* renamed from: d, reason: collision with root package name */
    public final te f12508d;

    /* renamed from: e, reason: collision with root package name */
    public final b f12509e;

    /* renamed from: f, reason: collision with root package name */
    public final t7 f12510f;

    /* renamed from: g, reason: collision with root package name */
    public final WeakHashMap f12511g;

    public j3(l4 adRepository, InterfaceC0484z csIo, tb notixInitializationStatusProvider, te networkStatusRepository, b activityCreatedProvider, c8 cachingImageLoader) {
        kotlin.jvm.internal.h.e(adRepository, "adRepository");
        kotlin.jvm.internal.h.e(csIo, "csIo");
        kotlin.jvm.internal.h.e(notixInitializationStatusProvider, "notixInitializationStatusProvider");
        kotlin.jvm.internal.h.e(networkStatusRepository, "networkStatusRepository");
        kotlin.jvm.internal.h.e(activityCreatedProvider, "activityCreatedProvider");
        kotlin.jvm.internal.h.e(cachingImageLoader, "cachingImageLoader");
        this.f12505a = adRepository;
        this.f12506b = csIo;
        this.f12507c = notixInitializationStatusProvider;
        this.f12508d = networkStatusRepository;
        this.f12509e = activityCreatedProvider;
        this.f12510f = cachingImageLoader;
        this.f12511g = new WeakHashMap();
    }

    public final i3 a(o4 adRequest) {
        kotlin.jvm.internal.h.e(adRequest, "adRequest");
        i3 i3Var = (i3) this.f12511g.get(adRequest);
        if (i3Var != null) {
            return i3Var;
        }
        c4 c4Var = new c4(adRequest, this.f12505a, this.f12506b, this.f12507c, this.f12508d, this.f12509e, this.f12510f);
        this.f12511g.put(adRequest, c4Var);
        return c4Var;
    }
}
