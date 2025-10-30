package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class va extends xa {

    /* renamed from: b, reason: collision with root package name */
    public final String f13349b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(String token) {
        super("Success", 0);
        kotlin.jvm.internal.h.e(token, "token");
        this.f13349b = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof va) && kotlin.jvm.internal.h.a(this.f13349b, ((va) obj).f13349b);
    }

    public final int hashCode() {
        return this.f13349b.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.p(new StringBuilder("Success(token="), this.f13349b, ')');
    }
}
