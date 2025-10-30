package N3;

import j3.C0;
import j3.D0;
import j3.E0;

/* renamed from: N3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0254e extends AbstractC0264o {

    /* renamed from: c, reason: collision with root package name */
    public final long f5086c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5087d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5088e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5089f;

    public C0254e(E0 e02, long j, long j4) {
        super(e02);
        long max;
        boolean z9 = false;
        if (e02.h() == 1) {
            D0 m9 = e02.m(0, new D0(), 0L);
            long max2 = Math.max(0L, j);
            if (!m9.f19313l && max2 != 0 && !m9.f19310h) {
                throw new C0255f(1);
            }
            if (j4 == Long.MIN_VALUE) {
                max = m9.f19315n;
            } else {
                max = Math.max(0L, j4);
            }
            long j9 = m9.f19315n;
            if (j9 != -9223372036854775807L) {
                max = max > j9 ? j9 : max;
                if (max2 > max) {
                    throw new C0255f(2);
                }
            }
            this.f5086c = max2;
            this.f5087d = max;
            this.f5088e = max != -9223372036854775807L ? max - max2 : -9223372036854775807L;
            if (m9.f19311i && (max == -9223372036854775807L || (j9 != -9223372036854775807L && max == j9))) {
                z9 = true;
            }
            this.f5089f = z9;
            return;
        }
        throw new C0255f(0);
    }

    @Override // N3.AbstractC0264o, j3.E0
    public final C0 f(int i9, C0 c02, boolean z9) {
        this.f5173b.f(0, c02, z9);
        long j = c02.f19239e - this.f5086c;
        long j4 = this.f5088e;
        long j9 = -9223372036854775807L;
        if (j4 != -9223372036854775807L) {
            j9 = j4 - j;
        }
        c02.h(c02.f19235a, c02.f19236b, 0, j9, j, O3.b.f5451f, false);
        return c02;
    }

    @Override // N3.AbstractC0264o, j3.E0
    public final D0 m(int i9, D0 d02, long j) {
        this.f5173b.m(0, d02, 0L);
        long j4 = d02.f19318q;
        long j9 = this.f5086c;
        d02.f19318q = j4 + j9;
        d02.f19315n = this.f5088e;
        d02.f19311i = this.f5089f;
        long j10 = d02.f19314m;
        if (j10 != -9223372036854775807L) {
            long max = Math.max(j10, j9);
            d02.f19314m = max;
            long j11 = this.f5087d;
            if (j11 != -9223372036854775807L) {
                max = Math.min(max, j11);
            }
            d02.f19314m = max - j9;
        }
        long T8 = l4.y.T(j9);
        long j12 = d02.f19307e;
        if (j12 != -9223372036854775807L) {
            d02.f19307e = j12 + T8;
        }
        long j13 = d02.f19308f;
        if (j13 != -9223372036854775807L) {
            d02.f19308f = j13 + T8;
        }
        return d02;
    }
}
