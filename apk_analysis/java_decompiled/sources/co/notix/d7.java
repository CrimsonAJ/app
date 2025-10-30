package co.notix;

import co.notix.appopen.AppOpenLoader;

/* loaded from: classes.dex */
public final class d7 extends h3 implements AppOpenLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(i3 adLoaderDelegate) {
        super(adLoaderDelegate, 1);
        kotlin.jvm.internal.h.e(adLoaderDelegate, "adLoaderDelegate");
    }

    @Override // co.notix.h3
    public final e3 a(g gVar) {
        if (gVar instanceof i) {
            return new c7((i) gVar);
        }
        return null;
    }
}
