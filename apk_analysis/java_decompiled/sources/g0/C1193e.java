package g0;

/* renamed from: g0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1193e {

    /* renamed from: a, reason: collision with root package name */
    public final long f17504a;

    /* renamed from: b, reason: collision with root package name */
    public final long f17505b;

    public C1193e(long j, long j4) {
        if (j4 == 0) {
            this.f17504a = 0L;
            this.f17505b = 1L;
        } else {
            this.f17504a = j;
            this.f17505b = j4;
        }
    }

    public final String toString() {
        return this.f17504a + "/" + this.f17505b;
    }
}
