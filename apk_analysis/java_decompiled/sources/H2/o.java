package H2;

import java.util.List;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3038a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3039b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3040c;

    /* renamed from: d, reason: collision with root package name */
    public final List f3041d;

    public o(boolean z9, int i9, boolean z10, List players) {
        kotlin.jvm.internal.h.e(players, "players");
        this.f3038a = z9;
        this.f3039b = i9;
        this.f3040c = z10;
        this.f3041d = players;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f3038a == oVar.f3038a && this.f3039b == oVar.f3039b && this.f3040c == oVar.f3040c && kotlin.jvm.internal.h.a(this.f3041d, oVar.f3041d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10 = 1237;
        if (this.f3038a) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        int i11 = ((i9 * 31) + this.f3039b) * 31;
        if (this.f3040c) {
            i10 = 1231;
        }
        return this.f3041d.hashCode() + ((i11 + i10) * 31);
    }

    public final String toString() {
        return "ListPlayer(allowed=" + this.f3038a + ", percentShow=" + this.f3039b + ", force=" + this.f3040c + ", players=" + this.f3041d + ")";
    }
}
