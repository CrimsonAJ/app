package m4;

import java.util.Arrays;

/* renamed from: m4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1592c {

    /* renamed from: a, reason: collision with root package name */
    public long f20728a;

    /* renamed from: b, reason: collision with root package name */
    public long f20729b;

    /* renamed from: c, reason: collision with root package name */
    public long f20730c;

    /* renamed from: d, reason: collision with root package name */
    public long f20731d;

    /* renamed from: e, reason: collision with root package name */
    public long f20732e;

    /* renamed from: f, reason: collision with root package name */
    public long f20733f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f20734g = new boolean[15];

    /* renamed from: h, reason: collision with root package name */
    public int f20735h;

    public final boolean a() {
        if (this.f20731d > 15 && this.f20735h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j) {
        long j4 = this.f20731d;
        if (j4 == 0) {
            this.f20728a = j;
        } else if (j4 == 1) {
            long j9 = j - this.f20728a;
            this.f20729b = j9;
            this.f20733f = j9;
            this.f20732e = 1L;
        } else {
            long j10 = j - this.f20730c;
            int i9 = (int) (j4 % 15);
            long abs = Math.abs(j10 - this.f20729b);
            boolean[] zArr = this.f20734g;
            if (abs <= 1000000) {
                this.f20732e++;
                this.f20733f += j10;
                if (zArr[i9]) {
                    zArr[i9] = false;
                    this.f20735h--;
                }
            } else if (!zArr[i9]) {
                zArr[i9] = true;
                this.f20735h++;
            }
        }
        this.f20731d++;
        this.f20730c = j;
    }

    public final void c() {
        this.f20731d = 0L;
        this.f20732e = 0L;
        this.f20733f = 0L;
        this.f20735h = 0;
        Arrays.fill(this.f20734g, false);
    }
}
