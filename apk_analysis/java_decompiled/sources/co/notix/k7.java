package co.notix;

import co.notix.banner.BannerData;

/* loaded from: classes.dex */
public final class k7 implements BannerData, e3 {

    /* renamed from: a, reason: collision with root package name */
    public final g f12597a;

    public k7(g model) {
        kotlin.jvm.internal.h.e(model, "model");
        this.f12597a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k7) && kotlin.jvm.internal.h.a(this.f12597a, ((k7) obj).f12597a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12597a.hashCode();
    }

    public final String toString() {
        return "BannerDataImpl(model=" + this.f12597a + ')';
    }
}
