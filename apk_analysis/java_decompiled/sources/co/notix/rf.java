package co.notix;

import Y7.B;
import Y7.InterfaceC0465h0;
import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.app.Activity;
import android.content.Intent;
import b8.C0718Q;
import co.notix.appopen.AppOpenActivity;
import co.notix.appopen.AppOpenData;
import co.notix.appopen.AppOpenLoader;
import co.notix.appopen.NotixAppOpen;
import co.notix.domain.RequestVars;
import java.util.UUID;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class rf implements NotixAppOpen {

    /* renamed from: a, reason: collision with root package name */
    public final j3 f13107a;

    /* renamed from: b, reason: collision with root package name */
    public final d f13108b;

    /* renamed from: c, reason: collision with root package name */
    public final y8 f13109c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0484z f13110d;

    /* renamed from: e, reason: collision with root package name */
    public final mg f13111e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13112f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0465h0 f13113g;

    public rf(j3 adLoaderDelegateFactory, d appOpenActivityStartHelper, d9 contextProvider, InterfaceC0484z cs, mg notixCallbackExecutor) {
        kotlin.jvm.internal.h.e(adLoaderDelegateFactory, "adLoaderDelegateFactory");
        kotlin.jvm.internal.h.e(appOpenActivityStartHelper, "appOpenActivityStartHelper");
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        kotlin.jvm.internal.h.e(cs, "cs");
        kotlin.jvm.internal.h.e(notixCallbackExecutor, "notixCallbackExecutor");
        this.f13107a = adLoaderDelegateFactory;
        this.f13108b = appOpenActivityStartHelper;
        this.f13109c = contextProvider;
        this.f13110d = cs;
        this.f13111e = notixCallbackExecutor;
    }

    public static final boolean a(rf rfVar, Activity activity) {
        rfVar.getClass();
        return (activity instanceof AppOpenActivity) || (activity instanceof zb);
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final AppOpenLoader createLoader(long j) {
        return createLoader(j, null, null);
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final void doOnApplicationOpen(O7.l action) {
        kotlin.jvm.internal.h.e(action, "action");
        doOnApplicationOpen(action, 3000L);
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final void ignoreNextApplicationOpen() {
        this.f13112f = true;
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final void show(AppOpenData appOpenData) {
        kotlin.jvm.internal.h.e(appOpenData, "appOpenData");
        a(appOpenData, null, null, null);
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final void startAutoShow(AppOpenLoader appOpenLoader) {
        kotlin.jvm.internal.h.e(appOpenLoader, "appOpenLoader");
        doOnApplicationOpen(new qf(appOpenLoader, 2000L, null, this, null, null, null), 3000L);
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final void stopAutoShow() {
        InterfaceC0465h0 interfaceC0465h0 = this.f13113g;
        if (interfaceC0465h0 != null) {
            interfaceC0465h0.d(null);
        }
    }

    @Override // co.notix.appopen.NotixAppOpen
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final d7 createLoader(long j, RequestVars requestVars, Integer num) {
        j3 j3Var = this.f13107a;
        if (requestVars == null) {
            requestVars = new RequestVars(null, null, null, null, null, 31, null);
        }
        return new d7(j3Var.a(new w8(j, requestVars, num)));
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final AppOpenLoader createLoader(long j, RequestVars requestVars) {
        return createLoader(j, requestVars, null);
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final void doOnApplicationOpen(O7.l action, long j) {
        kotlin.jvm.internal.h.e(action, "action");
        InterfaceC0465h0 interfaceC0465h0 = this.f13113g;
        if (interfaceC0465h0 != null) {
            interfaceC0465h0.d(null);
        }
        this.f13113g = B.r(this.f13110d, null, new pf(j, this, action, null), 3);
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final void show(AppOpenData appOpenData, O7.a aVar, O7.a aVar2, O7.l lVar) {
        kotlin.jvm.internal.h.e(appOpenData, "appOpenData");
        a(appOpenData, aVar, aVar2, lVar);
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final void startAutoShow(AppOpenLoader appOpenLoader, long j, long j4, O7.a aVar, O7.a aVar2, O7.l lVar) {
        kotlin.jvm.internal.h.e(appOpenLoader, "appOpenLoader");
        doOnApplicationOpen(new qf(appOpenLoader, j4, lVar, this, aVar, aVar2, null), j);
    }

    public final void a(AppOpenData appOpenData, O7.a aVar, O7.a aVar2, O7.l lVar) {
        Object h7;
        Activity a5;
        kotlin.jvm.internal.h.c(appOpenData, "null cannot be cast to non-null type co.notix.appopen.AppOpenDataImpl");
        c7 c7Var = (c7) appOpenData;
        e7 e7Var = new e7(c7Var, aVar, aVar2, lVar);
        d dVar = this.f13108b;
        String uuid = UUID.randomUUID().toString();
        kotlin.jvm.internal.h.d(uuid, "randomUUID().toString()");
        try {
            y8 y8Var = dVar.f12065a;
            f state = f.STARTED;
            d9 d9Var = (d9) y8Var;
            d9Var.getClass();
            kotlin.jvm.internal.h.e(state, "state");
            a5 = d9.a((WeakHashMap) ((C0718Q) d9Var.f12078b).h(), state);
        } catch (Throwable th) {
            h7 = AbstractC0485a.h(th);
        }
        if (a5 == null) {
            throw new IllegalStateException("no STARTED activity");
        }
        dVar.f12066b.put(uuid, e7Var);
        a5.startActivity(new Intent(a5, (Class<?>) AppOpenActivity.class).putExtra("start_id", uuid));
        h7 = uuid;
        if (A7.j.a(h7) != null) {
            dVar.f12066b.remove(uuid);
        }
        if (!(h7 instanceof A7.i)) {
            md.f12779a.b("showing AppOpen title=" + c7Var.f11987a.f12416a);
        }
        Throwable a9 = A7.j.a(h7);
        if (a9 != null) {
            if ((a9 instanceof Exception) && lVar != null) {
                lVar.invoke(a9);
            }
            md.f12779a.a("cannot start AppOpen activity, " + a9.getMessage());
        }
    }

    @Override // co.notix.appopen.NotixAppOpen
    public final AppOpenLoader createLoader(long j, Integer num) {
        return createLoader(j, null, num);
    }
}
