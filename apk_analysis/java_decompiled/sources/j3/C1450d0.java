package j3;

import l4.AbstractC1566a;

/* renamed from: j3.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1450d0 {

    /* renamed from: a, reason: collision with root package name */
    public final N3.A f19595a;

    /* renamed from: b, reason: collision with root package name */
    public final long f19596b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19597c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19598d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19599e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19600f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19601g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19602h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f19603i;

    public C1450d0(N3.A a5, long j, long j4, long j9, long j10, boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        boolean z15 = true;
        if (z12 && !z10) {
            z13 = false;
        } else {
            z13 = true;
        }
        AbstractC1566a.h(z13);
        if (z11 && !z10) {
            z14 = false;
        } else {
            z14 = true;
        }
        AbstractC1566a.h(z14);
        if (z9 && (z10 || z11 || z12)) {
            z15 = false;
        }
        AbstractC1566a.h(z15);
        this.f19595a = a5;
        this.f19596b = j;
        this.f19597c = j4;
        this.f19598d = j9;
        this.f19599e = j10;
        this.f19600f = z9;
        this.f19601g = z10;
        this.f19602h = z11;
        this.f19603i = z12;
    }

    public final C1450d0 a(long j) {
        if (j == this.f19597c) {
            return this;
        }
        return new C1450d0(this.f19595a, this.f19596b, j, this.f19598d, this.f19599e, this.f19600f, this.f19601g, this.f19602h, this.f19603i);
    }

    public final C1450d0 b(long j) {
        if (j == this.f19596b) {
            return this;
        }
        return new C1450d0(this.f19595a, j, this.f19597c, this.f19598d, this.f19599e, this.f19600f, this.f19601g, this.f19602h, this.f19603i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1450d0.class == obj.getClass()) {
            C1450d0 c1450d0 = (C1450d0) obj;
            if (this.f19596b == c1450d0.f19596b && this.f19597c == c1450d0.f19597c && this.f19598d == c1450d0.f19598d && this.f19599e == c1450d0.f19599e && this.f19600f == c1450d0.f19600f && this.f19601g == c1450d0.f19601g && this.f19602h == c1450d0.f19602h && this.f19603i == c1450d0.f19603i && l4.y.a(this.f19595a, c1450d0.f19595a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f19595a.hashCode() + 527) * 31) + ((int) this.f19596b)) * 31) + ((int) this.f19597c)) * 31) + ((int) this.f19598d)) * 31) + ((int) this.f19599e)) * 31) + (this.f19600f ? 1 : 0)) * 31) + (this.f19601g ? 1 : 0)) * 31) + (this.f19602h ? 1 : 0)) * 31) + (this.f19603i ? 1 : 0);
    }
}
