package co.notix;

import android.graphics.Bitmap;
import co.notix.p000native.NativeData;

/* loaded from: classes.dex */
public final class je implements NativeData, e3 {

    /* renamed from: a, reason: collision with root package name */
    public final i f12547a;

    public je(i model) {
        kotlin.jvm.internal.h.e(model, "model");
        this.f12547a = model;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof je) && kotlin.jvm.internal.h.a(this.f12547a, ((je) obj).f12547a)) {
            return true;
        }
        return false;
    }

    @Override // co.notix.p000native.NativeData
    public final String getDescription() {
        return this.f12547a.f12417b;
    }

    @Override // co.notix.p000native.NativeData
    public final Bitmap getIcon() {
        return this.f12547a.f12420e;
    }

    @Override // co.notix.p000native.NativeData
    public final Bitmap getImage() {
        return this.f12547a.f12418c;
    }

    @Override // co.notix.p000native.NativeData
    public final String getTitle() {
        return this.f12547a.f12416a;
    }

    public final int hashCode() {
        return this.f12547a.hashCode();
    }

    public final String toString() {
        return "NativeDataImpl(model=" + this.f12547a + ')';
    }
}
