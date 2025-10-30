package co.notix;

import co.notix.banner.NotixBannerLoader;

/* loaded from: classes.dex */
public final class sf extends h3 implements NotixBannerLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(i3 adLoaderDelegate) {
        super(adLoaderDelegate, 1);
        kotlin.jvm.internal.h.e(adLoaderDelegate, "adLoaderDelegate");
    }

    @Override // co.notix.h3
    public final e3 a(g gVar) {
        if (gVar != null) {
            return new k7(gVar);
        }
        return null;
    }
}
