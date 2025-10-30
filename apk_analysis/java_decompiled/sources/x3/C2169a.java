package x3;

import q3.q;
import q3.r;
import q3.s;

/* renamed from: x3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2169a implements InterfaceC2174f, r {

    /* renamed from: a, reason: collision with root package name */
    public final long f24560a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24561b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24562c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24563d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24564e;

    /* renamed from: f, reason: collision with root package name */
    public final long f24565f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24566g;

    public C2169a(long j, long j4, int i9, int i10, boolean z9) {
        this.f24560a = j;
        this.f24561b = j4;
        this.f24562c = i10 == -1 ? 1 : i10;
        this.f24564e = i9;
        this.f24566g = z9;
        if (j == -1) {
            this.f24563d = -1L;
            this.f24565f = -9223372036854775807L;
        } else {
            long j9 = j - j4;
            this.f24563d = j9;
            this.f24565f = (Math.max(0L, j9) * 8000000) / i9;
        }
    }

    @Override // x3.InterfaceC2174f
    public final long c(long j) {
        return (Math.max(0L, j - this.f24561b) * 8000000) / this.f24564e;
    }

    @Override // x3.InterfaceC2174f
    public final long d() {
        return -1L;
    }

    @Override // q3.r
    public final boolean e() {
        if (this.f24563d == -1 && !this.f24566g) {
            return false;
        }
        return true;
    }

    @Override // q3.r
    public final q g(long j) {
        long j4 = this.f24563d;
        long j9 = this.f24561b;
        if (j4 == -1 && !this.f24566g) {
            s sVar = new s(0L, j9);
            return new q(sVar, sVar);
        }
        int i9 = this.f24564e;
        long j10 = this.f24562c;
        long j11 = (((i9 * j) / 8000000) / j10) * j10;
        if (j4 != -1) {
            j11 = Math.min(j11, j4 - j10);
        }
        long max = Math.max(j11, 0L) + j9;
        long max2 = (Math.max(0L, max - j9) * 8000000) / i9;
        s sVar2 = new s(max2, max);
        if (j4 != -1 && max2 < j) {
            long j12 = max + j10;
            if (j12 < this.f24560a) {
                return new q(sVar2, new s((Math.max(0L, j12 - j9) * 8000000) / i9, j12));
            }
        }
        return new q(sVar2, sVar2);
    }

    @Override // q3.r
    public final long h() {
        return this.f24565f;
    }
}
