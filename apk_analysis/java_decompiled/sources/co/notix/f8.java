package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class f8 implements u8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12233a;

    public f8(String clickData) {
        kotlin.jvm.internal.h.e(clickData, "clickData");
        this.f12233a = clickData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f8) && kotlin.jvm.internal.h.a(this.f12233a, ((f8) obj).f12233a);
    }

    public final int hashCode() {
        return this.f12233a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.p(new StringBuilder("Params(clickData="), this.f12233a, ')');
    }
}
