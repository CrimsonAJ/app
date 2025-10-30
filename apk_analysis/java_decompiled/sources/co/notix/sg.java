package co.notix;

import Y7.InterfaceC0484z;
import co.notix.callback.NotixCallbackHandler;
import co.notix.log.LogLevel;

/* loaded from: classes.dex */
public final class sg implements Notix {

    /* renamed from: a, reason: collision with root package name */
    public final xq f13169a;

    /* renamed from: b, reason: collision with root package name */
    public final e9 f13170b;

    /* renamed from: c, reason: collision with root package name */
    public final og f13171c;

    /* renamed from: d, reason: collision with root package name */
    public final tb f13172d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0484z f13173e;

    /* renamed from: f, reason: collision with root package name */
    public final ei f13174f;

    /* renamed from: g, reason: collision with root package name */
    public final eb f13175g;

    /* renamed from: h, reason: collision with root package name */
    public final b f13176h;

    public sg(xq storage, d9 contextProviderInitializer, og notixCallbackReporter, tb notixInitializationStatusProviderInitializer, InterfaceC0484z csIo, ei periodicWorkManager, eb foregroundTimeCounter, b activityCreatedProvider) {
        kotlin.jvm.internal.h.e(storage, "storage");
        kotlin.jvm.internal.h.e(contextProviderInitializer, "contextProviderInitializer");
        kotlin.jvm.internal.h.e(notixCallbackReporter, "notixCallbackReporter");
        kotlin.jvm.internal.h.e(notixInitializationStatusProviderInitializer, "notixInitializationStatusProviderInitializer");
        kotlin.jvm.internal.h.e(csIo, "csIo");
        kotlin.jvm.internal.h.e(periodicWorkManager, "periodicWorkManager");
        kotlin.jvm.internal.h.e(foregroundTimeCounter, "foregroundTimeCounter");
        kotlin.jvm.internal.h.e(activityCreatedProvider, "activityCreatedProvider");
        this.f13169a = storage;
        this.f13170b = contextProviderInitializer;
        this.f13171c = notixCallbackReporter;
        this.f13172d = notixInitializationStatusProviderInitializer;
        this.f13173e = csIo;
        this.f13174f = periodicWorkManager;
        this.f13175g = foregroundTimeCounter;
        this.f13176h = activityCreatedProvider;
    }

    @Override // co.notix.Notix
    public final String getVersion() {
        return "0.1.86";
    }

    @Override // co.notix.Notix
    public final void setCallbackHandler(NotixCallbackHandler handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.f13171c.f12888c = handler;
    }

    @Override // co.notix.Notix
    public final void setLogLevel(LogLevel logLevel) {
        kotlin.jvm.internal.h.e(logLevel, "logLevel");
        kd kdVar = md.f12779a;
        kdVar.getClass();
        kdVar.f12607b.setLogLevel(logLevel);
    }

    @Override // co.notix.Notix
    public final void setUserAgent(String userAgent) {
        kotlin.jvm.internal.h.e(userAgent, "userAgent");
        this.f13169a.getClass();
        xq.a(wq.f13475b.a(), "NOTIX_CUSTOM_USER_AGENT", userAgent);
    }
}
