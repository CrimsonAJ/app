package q3;

import l4.y;

/* renamed from: q3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1897b {

    /* renamed from: a, reason: collision with root package name */
    public final long f22291a;

    /* renamed from: b, reason: collision with root package name */
    public final long f22292b;

    /* renamed from: c, reason: collision with root package name */
    public final long f22293c;

    /* renamed from: d, reason: collision with root package name */
    public long f22294d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f22295e;

    /* renamed from: f, reason: collision with root package name */
    public long f22296f;

    /* renamed from: g, reason: collision with root package name */
    public long f22297g;

    /* renamed from: h, reason: collision with root package name */
    public long f22298h;

    public C1897b(long j, long j4, long j9, long j10, long j11, long j12) {
        this.f22291a = j;
        this.f22292b = j4;
        this.f22295e = j9;
        this.f22296f = j10;
        this.f22297g = j11;
        this.f22293c = j12;
        this.f22298h = a(j4, 0L, j9, j10, j11, j12);
    }

    public static long a(long j, long j4, long j9, long j10, long j11, long j12) {
        if (j10 + 1 < j11 && j4 + 1 < j9) {
            long j13 = ((float) (j - j4)) * (((float) (j11 - j10)) / ((float) (j9 - j4)));
            return y.j(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
        }
        return j10;
    }
}
