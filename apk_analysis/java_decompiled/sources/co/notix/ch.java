package co.notix;

import Y7.B;
import Y7.InterfaceC0484z;
import android.content.Context;
import co.notix.domain.RequestVars;
import co.notix.push.NotixNotificationModifier;
import co.notix.push.NotixPush;
import co.notix.push.NotixTargetEventHandler;

/* loaded from: classes.dex */
public final class ch implements NotixPush {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0484z f12023a;

    /* renamed from: b, reason: collision with root package name */
    public final xq f12024b;

    /* renamed from: c, reason: collision with root package name */
    public final lf f12025c;

    /* renamed from: d, reason: collision with root package name */
    public final y8 f12026d;

    /* renamed from: e, reason: collision with root package name */
    public final i7 f12027e;

    /* renamed from: f, reason: collision with root package name */
    public final ef f12028f;

    /* renamed from: g, reason: collision with root package name */
    public final fr f12029g;

    /* renamed from: h, reason: collision with root package name */
    public final tb f12030h;

    /* renamed from: i, reason: collision with root package name */
    public final na f12031i;
    public final kl j;

    /* renamed from: k, reason: collision with root package name */
    public final zk f12032k;

    /* renamed from: l, reason: collision with root package name */
    public final mq f12033l;

    public ch(InterfaceC0484z csIo, xq storage, lf notificationsPermissionController, d9 contextProvider, i7 notixAudienceReporter, ef notificationModifierProviderInitializer, fr targetEventHandlerProviderInitializer, tb notixInitializationStatusProvider, ra fcmTokenRepository, kl pushRepository, zk pullWorkManager, mq settingsRepository) {
        kotlin.jvm.internal.h.e(csIo, "csIo");
        kotlin.jvm.internal.h.e(storage, "storage");
        kotlin.jvm.internal.h.e(notificationsPermissionController, "notificationsPermissionController");
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(notixAudienceReporter, "notixAudienceReporter");
        kotlin.jvm.internal.h.e(notificationModifierProviderInitializer, "notificationModifierProviderInitializer");
        kotlin.jvm.internal.h.e(targetEventHandlerProviderInitializer, "targetEventHandlerProviderInitializer");
        kotlin.jvm.internal.h.e(notixInitializationStatusProvider, "notixInitializationStatusProvider");
        kotlin.jvm.internal.h.e(fcmTokenRepository, "fcmTokenRepository");
        kotlin.jvm.internal.h.e(pushRepository, "pushRepository");
        kotlin.jvm.internal.h.e(pullWorkManager, "pullWorkManager");
        kotlin.jvm.internal.h.e(settingsRepository, "settingsRepository");
        this.f12023a = csIo;
        this.f12024b = storage;
        this.f12025c = notificationsPermissionController;
        this.f12026d = contextProvider;
        this.f12027e = notixAudienceReporter;
        this.f12028f = notificationModifierProviderInitializer;
        this.f12029g = targetEventHandlerProviderInitializer;
        this.f12030h = notixInitializationStatusProvider;
        this.f12031i = fcmTokenRepository;
        this.j = pushRepository;
        this.f12032k = pullWorkManager;
        this.f12033l = settingsRepository;
    }

    @Override // co.notix.push.NotixPush
    public final void addAudience(String audience) {
        kotlin.jvm.internal.h.e(audience, "audience");
        i7 i7Var = this.f12027e;
        i7Var.getClass();
        B.r(i7Var.f12437b, null, new g7(i7Var, audience, null), 3);
    }

    @Override // co.notix.push.NotixPush
    public final void deleteAudience(String audience) {
        kotlin.jvm.internal.h.e(audience, "audience");
        i7 i7Var = this.f12027e;
        i7Var.getClass();
        B.r(i7Var.f12437b, null, new h7(i7Var, audience, null), 3);
    }

    @Override // co.notix.push.NotixPush
    public final void init(Context context, String notixAppId, String notixToken) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(notixAppId, "notixAppId");
        kotlin.jvm.internal.h.e(notixToken, "notixToken");
        B.r(this.f12023a, null, new bh(this, notixAppId, notixToken, null, null), 3);
    }

    @Override // co.notix.push.NotixPush
    public final void setNotificationModifier(NotixNotificationModifier modifier) {
        kotlin.jvm.internal.h.e(modifier, "modifier");
        this.f12028f.f12156b = modifier;
    }

    @Override // co.notix.push.NotixPush
    public final void setTargetEventHandler(NotixTargetEventHandler handler) {
        kotlin.jvm.internal.h.e(handler, "handler");
        this.f12029g.f12284b = handler;
    }

    @Override // co.notix.push.NotixPush
    public final void init(Context context, String notixAppId, String notixToken, RequestVars requestVars) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(notixAppId, "notixAppId");
        kotlin.jvm.internal.h.e(notixToken, "notixToken");
        B.r(this.f12023a, null, new bh(this, notixAppId, notixToken, requestVars, null), 3);
    }
}
