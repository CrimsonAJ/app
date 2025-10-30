package b5;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import co.notix.lsi.LsiInterval;

/* loaded from: classes.dex */
public final /* synthetic */ class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S0 f10771b;

    public /* synthetic */ K0(S0 s02, int i9) {
        this.f10770a = i9;
        this.f10771b = s02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f10770a) {
            case 0:
                S0 s02 = this.f10771b;
                s02.l0();
                C0650n0 c0650n0 = (C0650n0) s02.f1707a;
                C0623e0 c0623e0 = c0650n0.f11228h;
                C0650n0.d(c0623e0);
                boolean b9 = c0623e0.f11101u.b();
                V v8 = c0650n0.f11229i;
                if (!b9) {
                    C0623e0 c0623e02 = c0650n0.f11228h;
                    C0650n0.d(c0623e02);
                    C0617c0 c0617c0 = c0623e02.f11102v;
                    long f9 = c0617c0.f();
                    c0617c0.g(1 + f9);
                    if (f9 >= 5) {
                        C0650n0.f(v8);
                        v8.f10974i.b("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        c0623e02.f11101u.a(true);
                        return;
                    } else {
                        if (s02.f10959t == null) {
                            s02.f10959t = new M0(s02, c0650n0, 3);
                        }
                        s02.f10959t.c(0L);
                        return;
                    }
                }
                C0650n0.f(v8);
                v8.f10977m.b("Deferred Deep Link already retrieved. Not fetching again.");
                return;
            case 1:
                this.f10771b.t0();
                return;
            case 2:
                s4.i iVar = this.f10771b.f10957r;
                C0650n0 c0650n02 = (C0650n0) iVar.f22734a;
                C0647m0 c0647m0 = c0650n02.j;
                C0650n0.f(c0647m0);
                c0647m0.l0();
                if (iVar.a0()) {
                    boolean b02 = iVar.b0();
                    S0 s03 = c0650n02.f11235p;
                    C0623e0 c0623e03 = c0650n02.f11228h;
                    if (b02) {
                        C0650n0.d(c0623e03);
                        c0623e03.f11104x.n(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        C0650n0.e(s03);
                        s03.w0("auto", "_cmpx", bundle);
                    } else {
                        C0650n0.d(c0623e03);
                        A6.t tVar = c0623e03.f11104x;
                        String m9 = tVar.m();
                        if (TextUtils.isEmpty(m9)) {
                            V v9 = c0650n02.f11229i;
                            C0650n0.f(v9);
                            v9.f10972g.b("Cache still valid but referrer not found");
                        } else {
                            long f10 = c0623e03.f11105y.f() / LsiInterval.LSI_FALLBACK_INTERVAL;
                            Uri parse = Uri.parse(m9);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str2 : parse.getQueryParameterNames()) {
                                bundle2.putString(str2, parse.getQueryParameter(str2));
                            }
                            ((Bundle) pair.second).putLong("_cc", (f10 - 1) * LsiInterval.LSI_FALLBACK_INTERVAL);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            C0650n0.e(s03);
                            s03.w0(str, "_cmp", (Bundle) pair.second);
                        }
                        tVar.n(null);
                    }
                    C0650n0.d(c0623e03);
                    c0623e03.f11105y.g(0L);
                    return;
                }
                return;
            default:
                this.f10771b.t0();
                return;
        }
    }
}
