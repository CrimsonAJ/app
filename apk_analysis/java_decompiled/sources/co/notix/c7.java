package co.notix;

import co.notix.appopen.AppOpenData;

/* loaded from: classes.dex */
public final class c7 implements AppOpenData, e3 {

    /* renamed from: a, reason: collision with root package name */
    public final i f11987a;

    public c7(i model) {
        kotlin.jvm.internal.h.e(model, "model");
        this.f11987a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c7) && kotlin.jvm.internal.h.a(this.f11987a, ((c7) obj).f11987a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11987a.hashCode();
    }

    public final String toString() {
        return "AppOpenDataImpl(model=" + this.f11987a + ')';
    }
}
