package j3;

/* renamed from: j3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1461l implements InterfaceC1453f {

    /* renamed from: a, reason: collision with root package name */
    public final int f19663a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19664b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19665c;

    public C1461l(int i9, int i10, int i11) {
        this.f19663a = i9;
        this.f19664b = i10;
        this.f19665c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1461l)) {
            return false;
        }
        C1461l c1461l = (C1461l) obj;
        if (this.f19663a == c1461l.f19663a && this.f19664b == c1461l.f19664b && this.f19665c == c1461l.f19665c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((527 + this.f19663a) * 31) + this.f19664b) * 31) + this.f19665c;
    }
}
