package co.notix;

import Y7.B;
import Y7.K;

/* loaded from: classes.dex */
public final class u2 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public final dh f13269a;

    /* renamed from: b, reason: collision with root package name */
    public final ic f13270b;

    public u2(gh notixRestClient, ic json) {
        kotlin.jvm.internal.h.e(notixRestClient, "notixRestClient");
        kotlin.jvm.internal.h.e(json, "json");
        this.f13269a = notixRestClient;
        this.f13270b = json;
    }

    @Override // co.notix.m2
    public final Object a(q4 q4Var, f4 f4Var) {
        return B.C(K.f8774b, new t2(this, "/interstitial/ewant", q4Var, null), f4Var);
    }

    @Override // co.notix.m2
    public final Object b(q4 q4Var, f4 f4Var) {
        return B.C(K.f8774b, new t2(this, "/inapp/bwant", q4Var, null), f4Var);
    }
}
