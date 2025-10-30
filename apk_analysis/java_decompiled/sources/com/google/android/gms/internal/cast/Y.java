package com.google.android.gms.internal.cast;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class Y {
    public static final y4.b j = new y4.b("ClientCastAnalytics", null);

    /* renamed from: k, reason: collision with root package name */
    public static boolean f14790k = true;

    /* renamed from: a, reason: collision with root package name */
    public final u4.h f14791a;

    /* renamed from: b, reason: collision with root package name */
    public final C0885w f14792b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC0822g f14793c;

    /* renamed from: e, reason: collision with root package name */
    public Long f14795e;

    /* renamed from: g, reason: collision with root package name */
    public Y2.r f14797g;

    /* renamed from: h, reason: collision with root package name */
    public C0897z f14798h;

    /* renamed from: i, reason: collision with root package name */
    public int f14799i = 1;

    /* renamed from: d, reason: collision with root package name */
    public final String f14794d = UUID.randomUUID().toString();

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorService f14796f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public Y(Context context, y4.r rVar, u4.h hVar, C0885w c0885w, BinderC0822g binderC0822g) {
        this.f14791a = hVar;
        this.f14792b = c0885w;
        this.f14793c = binderC0822g;
    }

    public final void a(O0 o02, int i9) {
        this.f14796f.execute(new RunnableC0869s(this, o02, i9, 1));
    }
}
