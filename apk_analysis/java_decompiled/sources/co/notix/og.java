package co.notix;

import Y7.B;
import co.notix.callback.NotixCallback;
import co.notix.callback.NotixCallbackHandler;

/* loaded from: classes.dex */
public final class og {

    /* renamed from: a, reason: collision with root package name */
    public final y8 f12886a;

    /* renamed from: b, reason: collision with root package name */
    public final mg f12887b;

    /* renamed from: c, reason: collision with root package name */
    public NotixCallbackHandler f12888c;

    public og(d9 contextProvider, mg notixCallbackExecutor) {
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(notixCallbackExecutor, "notixCallbackExecutor");
        this.f12886a = contextProvider;
        this.f12887b = notixCallbackExecutor;
    }

    public final void a(NotixCallback callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        B.r(this.f12887b.f12782a, null, new ng(null, this, callback), 3);
    }
}
