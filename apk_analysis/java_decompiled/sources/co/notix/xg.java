package co.notix;

import Y7.B;
import a.AbstractC0485a;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import b8.C0718Q;
import co.notix.domain.RequestVars;
import co.notix.p000native.NativeData;
import co.notix.p000native.NativeLoader;
import co.notix.p000native.NotixNative;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xg implements NotixNative {

    /* renamed from: a, reason: collision with root package name */
    public final j3 f13526a;

    /* renamed from: b, reason: collision with root package name */
    public final ia f13527b;

    /* renamed from: c, reason: collision with root package name */
    public final y8 f13528c;

    public xg(j3 adLoaderDelegateFactory, d9 contextProvider, ia eventReporter) {
        kotlin.jvm.internal.h.e(adLoaderDelegateFactory, "adLoaderDelegateFactory");
        kotlin.jvm.internal.h.e(eventReporter, "eventReporter");
        kotlin.jvm.internal.h.e(contextProvider, "contextProvider");
        this.f13526a = adLoaderDelegateFactory;
        this.f13527b = eventReporter;
        this.f13528c = contextProvider;
    }

    @Override // co.notix.p000native.NotixNative
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ke createLoader(long j, RequestVars requestVars, Integer num) {
        j3 j3Var = this.f13526a;
        if (requestVars == null) {
            requestVars = new RequestVars(null, null, null, null, null, 31, null);
        }
        return new ke(j3Var.a(new w8(j, requestVars, num)));
    }

    @Override // co.notix.p000native.NotixNative
    public final void click(NativeData nativeData) {
        Object obj;
        kotlin.jvm.internal.h.e(nativeData, "nativeData");
        y8 y8Var = this.f13528c;
        f state = f.RESUMED;
        d9 d9Var = (d9) y8Var;
        d9Var.getClass();
        kotlin.jvm.internal.h.e(state, "state");
        Activity a5 = d9.a((WeakHashMap) ((C0718Q) d9Var.f12078b).h(), state);
        if (a5 != null) {
            String url = ((je) nativeData).f12547a.f12422g;
            kotlin.jvm.internal.h.e(url, "url");
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                a5.startActivity(intent);
                obj = intent;
            } catch (Throwable th) {
                obj = AbstractC0485a.h(th);
            }
            Throwable a9 = A7.j.a(obj);
            if (a9 == null) {
                md.f12779a.b("successfully started activity with url: ".concat(url));
            } else {
                kd kdVar = md.f12779a;
                StringBuilder r5 = AbstractC0953k1.r("couldn't start activity with url=", url, ", error=");
                r5.append(a9.getMessage());
                kdVar.a(r5.toString(), a9);
            }
        }
    }

    @Override // co.notix.p000native.NotixNative
    public final NativeLoader createLoader(long j) {
        return createLoader(j, null, null);
    }

    @Override // co.notix.p000native.NotixNative
    public final void trackImpression(NativeData nativeData) {
        kotlin.jvm.internal.h.e(nativeData, "nativeData");
        String data = ((je) nativeData).f12547a.f12423h;
        ia iaVar = this.f13527b;
        iaVar.getClass();
        kotlin.jvm.internal.h.e(data, "data");
        B.r(iaVar.f12446c, null, new fa(iaVar, data, null), 3);
    }

    @Override // co.notix.p000native.NotixNative
    public final NativeLoader createLoader(long j, RequestVars requestVars) {
        return createLoader(j, requestVars, null);
    }

    @Override // co.notix.p000native.NotixNative
    public final NativeLoader createLoader(long j, Integer num) {
        return createLoader(j, null, num);
    }
}
