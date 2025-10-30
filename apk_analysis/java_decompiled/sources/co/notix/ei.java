package co.notix;

import co.notix.periodicworker.PeriodicWorker;

/* loaded from: classes.dex */
public final class ei extends ap {

    /* renamed from: b, reason: collision with root package name */
    public final Class f12175b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12176c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(d9 contextProvider) {
        super(contextProvider);
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        this.f12175b = PeriodicWorker.class;
        this.f12176c = "notix_periodic";
    }

    @Override // co.notix.ap
    public final String a() {
        return this.f12176c;
    }

    @Override // co.notix.ap
    public final Class b() {
        return this.f12175b;
    }
}
