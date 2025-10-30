package co.notix;

import co.notix.interstitial.InterstitialLoader;

/* loaded from: classes.dex */
public final class ec extends h3 implements InterstitialLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec(i3 adLoaderDelegate) {
        super(adLoaderDelegate, 2);
        kotlin.jvm.internal.h.e(adLoaderDelegate, "adLoaderDelegate");
    }

    @Override // co.notix.h3
    public final e3 a(g gVar) {
        if (gVar != null) {
            return new dc(gVar);
        }
        return null;
    }
}
