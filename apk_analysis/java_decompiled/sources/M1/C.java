package M1;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class C implements E {

    /* renamed from: a, reason: collision with root package name */
    public final String f4703a;

    public C(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        this.f4703a = value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C) && kotlin.jvm.internal.h.a(this.f4703a, ((C) obj).f4703a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4703a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("Text(value="), this.f4703a, ")");
    }
}
