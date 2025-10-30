package co.notix;

import co.notix.p000native.NativeLoader;

/* loaded from: classes.dex */
public final class ke extends h3 implements NativeLoader {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(i3 adLoaderDelegate) {
        super(adLoaderDelegate, 1);
        kotlin.jvm.internal.h.e(adLoaderDelegate, "adLoaderDelegate");
    }

    @Override // co.notix.h3
    public final e3 a(g gVar) {
        if (gVar instanceof i) {
            return new je((i) gVar);
        }
        return null;
    }
}
