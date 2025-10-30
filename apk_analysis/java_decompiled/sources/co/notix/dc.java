package co.notix;

import co.notix.interstitial.InterstitialData;

/* loaded from: classes.dex */
public final class dc implements InterstitialData, e3 {

    /* renamed from: a, reason: collision with root package name */
    public final g f12086a;

    public dc(g model) {
        kotlin.jvm.internal.h.e(model, "model");
        this.f12086a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dc) && kotlin.jvm.internal.h.a(this.f12086a, ((dc) obj).f12086a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f12086a.hashCode();
    }

    public final String toString() {
        return "InterstitialDataImpl(model=" + this.f12086a + ')';
    }
}
