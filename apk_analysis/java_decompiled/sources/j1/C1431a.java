package j1;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1431a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19186a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19187b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19188c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19189d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1431a)) {
            return false;
        }
        C1431a c1431a = (C1431a) obj;
        if (this.f19186a == c1431a.f19186a && this.f19187b == c1431a.f19187b && this.f19188c == c1431a.f19188c && this.f19189d == c1431a.f19189d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int, boolean] */
    public final int hashCode() {
        boolean z9 = this.f19187b;
        ?? r1 = this.f19186a;
        int i9 = r1;
        if (z9) {
            i9 = r1 + 16;
        }
        int i10 = i9;
        if (this.f19188c) {
            i10 = i9 + 256;
        }
        if (this.f19189d) {
            return i10 + 4096;
        }
        return i10;
    }

    public final String toString() {
        return "[ Connected=" + this.f19186a + " Validated=" + this.f19187b + " Metered=" + this.f19188c + " NotRoaming=" + this.f19189d + " ]";
    }
}
