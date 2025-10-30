package co.notix;

import co.notix.domain.RequestVars;
import co.notix.interstitial.InterstitialButton;
import co.notix.interstitial.InterstitialData;
import co.notix.interstitial.InterstitialLoader;
import co.notix.interstitial.NotixInterstitial;

/* loaded from: classes.dex */
public final class tg implements NotixInterstitial {

    /* renamed from: a, reason: collision with root package name */
    public final j3 f13227a;

    /* renamed from: b, reason: collision with root package name */
    public final d f13228b;

    public tg(j3 adLoaderDelegateFactory, d interstitialActivityStartHelper) {
        kotlin.jvm.internal.h.e(adLoaderDelegateFactory, "adLoaderDelegateFactory");
        kotlin.jvm.internal.h.e(interstitialActivityStartHelper, "interstitialActivityStartHelper");
        this.f13227a = adLoaderDelegateFactory;
        this.f13228b = interstitialActivityStartHelper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
    
        r13.f12066b.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d7, code lost:
    
        if (A7.j.a(r0) != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0074, code lost:
    
        if (A7.j.a(r0) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(co.notix.interstitial.InterstitialData r12, co.notix.interstitial.InterstitialButton r13, boolean r14, O7.a r15, O7.a r16, O7.l r17) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.tg.a(co.notix.interstitial.InterstitialData, co.notix.interstitial.InterstitialButton, boolean, O7.a, O7.a, O7.l):void");
    }

    @Override // co.notix.interstitial.NotixInterstitial
    public final InterstitialLoader createLoader(long j) {
        return createLoader(j, null, null);
    }

    @Override // co.notix.interstitial.NotixInterstitial
    public final void show(InterstitialData interstitialData) {
        kotlin.jvm.internal.h.e(interstitialData, "interstitialData");
        a(interstitialData, null, false, null, null, null);
    }

    @Override // co.notix.interstitial.NotixInterstitial
    public final InterstitialLoader createLoader(long j, RequestVars requestVars) {
        return createLoader(j, requestVars, null);
    }

    @Override // co.notix.interstitial.NotixInterstitial
    public final void show(InterstitialData interstitialData, InterstitialButton interstitialButton) {
        kotlin.jvm.internal.h.e(interstitialData, "interstitialData");
        a(interstitialData, interstitialButton, false, null, null, null);
    }

    @Override // co.notix.interstitial.NotixInterstitial
    public final InterstitialLoader createLoader(long j, RequestVars requestVars, Integer num) {
        j3 j3Var = this.f13227a;
        if (requestVars == null) {
            requestVars = new RequestVars(null, null, null, null, null, 31, null);
        }
        return new ec(j3Var.a(new w8(j, requestVars, num)));
    }

    @Override // co.notix.interstitial.NotixInterstitial
    public final void show(InterstitialData interstitialData, InterstitialButton interstitialButton, boolean z9, O7.a aVar, O7.a aVar2, O7.l lVar) {
        kotlin.jvm.internal.h.e(interstitialData, "interstitialData");
        a(interstitialData, interstitialButton, z9, aVar, aVar2, lVar);
    }

    @Override // co.notix.interstitial.NotixInterstitial
    public final InterstitialLoader createLoader(long j, Integer num) {
        return createLoader(j, null, num);
    }

    @Override // co.notix.interstitial.NotixInterstitial
    public final void show(InterstitialData interstitialData, O7.a aVar, O7.a aVar2, O7.l lVar) {
        kotlin.jvm.internal.h.e(interstitialData, "interstitialData");
        a(interstitialData, null, false, aVar, aVar2, lVar);
    }
}
