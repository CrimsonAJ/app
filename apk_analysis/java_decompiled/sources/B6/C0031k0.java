package B6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: B6.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031k0 extends M0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1002a;

    public C0031k0(String str) {
        this.f1002a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M0) {
            return this.f1002a.equals(((C0031k0) ((M0) obj)).f1002a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1002a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("User{identifier="), this.f1002a, "}");
    }
}
