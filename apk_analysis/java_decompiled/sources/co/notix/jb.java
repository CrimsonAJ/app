package co.notix;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class jb extends kb {

    /* renamed from: b, reason: collision with root package name */
    public final String f12545b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(String body) {
        super("POST", 0);
        kotlin.jvm.internal.h.e(body, "body");
        this.f12545b = body;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jb) && kotlin.jvm.internal.h.a(this.f12545b, ((jb) obj).f12545b);
    }

    public final int hashCode() {
        return this.f12545b.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.p(new StringBuilder("Post(body="), this.f12545b, ')');
    }
}
