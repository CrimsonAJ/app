package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public final int f12700a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12701b;

    public lb(String text, int i9) {
        kotlin.jvm.internal.h.e(text, "text");
        this.f12700a = i9;
        this.f12701b = text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj;
        return this.f12700a == lbVar.f12700a && kotlin.jvm.internal.h.a(this.f12701b, lbVar.f12701b);
    }

    public final int hashCode() {
        return this.f12701b.hashCode() + (this.f12700a * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HttpResponse(code=");
        sb.append(this.f12700a);
        sb.append(", text=");
        return AbstractC0953k1.p(sb, this.f12701b, ')');
    }
}
