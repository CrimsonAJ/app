package co.notix;

import co.notix.perseverance.worker.PerseveranceWorker;

/* loaded from: classes.dex */
public final class fj extends ap {

    /* renamed from: b, reason: collision with root package name */
    public final Class f12265b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12266c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj(d9 contextProvider) {
        super(contextProvider);
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        this.f12265b = PerseveranceWorker.class;
        this.f12266c = "notix_perseverance";
    }

    @Override // co.notix.ap
    public final String a() {
        return this.f12266c;
    }

    @Override // co.notix.ap
    public final Class b() {
        return this.f12265b;
    }
}
