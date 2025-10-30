package Q3;

import N3.d0;
import j3.M;
import l4.y;

/* loaded from: classes.dex */
public final class m implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final M f6412a;

    /* renamed from: c, reason: collision with root package name */
    public long[] f6414c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6415d;

    /* renamed from: e, reason: collision with root package name */
    public R3.g f6416e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6417f;

    /* renamed from: g, reason: collision with root package name */
    public int f6418g;

    /* renamed from: b, reason: collision with root package name */
    public final A1.g f6413b = new A1.g(15, (byte) 0);

    /* renamed from: h, reason: collision with root package name */
    public long f6419h = -9223372036854775807L;

    public m(R3.g gVar, M m9, boolean z9) {
        this.f6412a = m9;
        this.f6416e = gVar;
        this.f6414c = gVar.f6612b;
        a(gVar, z9);
    }

    public final void a(R3.g gVar, boolean z9) {
        long j;
        int i9 = this.f6418g;
        long j4 = -9223372036854775807L;
        if (i9 == 0) {
            j = -9223372036854775807L;
        } else {
            j = this.f6414c[i9 - 1];
        }
        this.f6415d = z9;
        this.f6416e = gVar;
        long[] jArr = gVar.f6612b;
        this.f6414c = jArr;
        long j9 = this.f6419h;
        if (j9 != -9223372036854775807L) {
            int b9 = y.b(jArr, j9, true);
            this.f6418g = b9;
            if (this.f6415d && b9 == this.f6414c.length) {
                j4 = j9;
            }
            this.f6419h = j4;
            return;
        }
        if (j != -9223372036854775807L) {
            this.f6418g = y.b(jArr, j, false);
        }
    }

    @Override // N3.d0
    public final int d(O0.c cVar, m3.f fVar, int i9) {
        boolean z9;
        int i10 = this.f6418g;
        if (i10 == this.f6414c.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && !this.f6415d) {
            fVar.f6039b = 4;
            return -4;
        }
        if ((i9 & 2) == 0 && this.f6417f) {
            if (z9) {
                return -3;
            }
            if ((i9 & 1) == 0) {
                this.f6418g = i10 + 1;
            }
            if ((i9 & 4) == 0) {
                byte[] q9 = this.f6413b.q(this.f6416e.f6611a[i10]);
                fVar.t(q9.length);
                fVar.f20704d.put(q9);
            }
            fVar.f20706f = this.f6414c[i10];
            fVar.f6039b = 1;
            return -4;
        }
        cVar.f5264c = this.f6412a;
        this.f6417f = true;
        return -5;
    }

    @Override // N3.d0
    public final boolean j() {
        return true;
    }

    @Override // N3.d0
    public final int m(long j) {
        int max = Math.max(this.f6418g, y.b(this.f6414c, j, true));
        int i9 = max - this.f6418g;
        this.f6418g = max;
        return i9;
    }

    @Override // N3.d0
    public final void b() {
    }
}
