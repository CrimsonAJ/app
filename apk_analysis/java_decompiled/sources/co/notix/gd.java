package co.notix;

import Y7.InterfaceC0484z;
import co.notix.lsi.LockScreenInterstitialWorker;

/* loaded from: classes.dex */
public final class gd extends ap {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0484z f12311b;

    /* renamed from: c, reason: collision with root package name */
    public final ed f12312c;

    /* renamed from: d, reason: collision with root package name */
    public final mq f12313d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f12314e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12315f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(d9 contextProvider, InterfaceC0484z coroutineScope, ed lockScreenInterstitialStorage, mq settingsRepository) {
        super(contextProvider);
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.h.e(lockScreenInterstitialStorage, "lockScreenInterstitialStorage");
        kotlin.jvm.internal.h.e(settingsRepository, "settingsRepository");
        this.f12311b = coroutineScope;
        this.f12312c = lockScreenInterstitialStorage;
        this.f12313d = settingsRepository;
        this.f12314e = LockScreenInterstitialWorker.class;
        this.f12315f = "notix_lsi";
    }

    @Override // co.notix.ap
    public final String a() {
        return this.f12315f;
    }

    @Override // co.notix.ap
    public final Class b() {
        return this.f12314e;
    }
}
