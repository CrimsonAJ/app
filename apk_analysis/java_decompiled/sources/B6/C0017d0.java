package B6;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* renamed from: B6.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0017d0 extends G0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f936a;

    public C0017d0(String str) {
        this.f936a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G0) {
            return this.f936a.equals(((C0017d0) ((G0) obj)).f936a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f936a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("Log{content="), this.f936a, "}");
    }
}
