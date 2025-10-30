package n1;

import com.google.android.gms.internal.measurement.AbstractC0953k1;
import d0.o;
import e1.q;
import u0.z;
import w.AbstractC2128h;

/* renamed from: n1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1613j {

    /* renamed from: s, reason: collision with root package name */
    public static final String f21029s = q.j("WorkSpec");

    /* renamed from: t, reason: collision with root package name */
    public static final o f21030t = new o(9);

    /* renamed from: a, reason: collision with root package name */
    public String f21031a;

    /* renamed from: b, reason: collision with root package name */
    public int f21032b = 1;

    /* renamed from: c, reason: collision with root package name */
    public String f21033c;

    /* renamed from: d, reason: collision with root package name */
    public String f21034d;

    /* renamed from: e, reason: collision with root package name */
    public e1.h f21035e;

    /* renamed from: f, reason: collision with root package name */
    public e1.h f21036f;

    /* renamed from: g, reason: collision with root package name */
    public long f21037g;

    /* renamed from: h, reason: collision with root package name */
    public long f21038h;

    /* renamed from: i, reason: collision with root package name */
    public long f21039i;
    public e1.c j;

    /* renamed from: k, reason: collision with root package name */
    public int f21040k;

    /* renamed from: l, reason: collision with root package name */
    public int f21041l;

    /* renamed from: m, reason: collision with root package name */
    public long f21042m;

    /* renamed from: n, reason: collision with root package name */
    public long f21043n;

    /* renamed from: o, reason: collision with root package name */
    public long f21044o;

    /* renamed from: p, reason: collision with root package name */
    public long f21045p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f21046q;

    /* renamed from: r, reason: collision with root package name */
    public int f21047r;

    public C1613j(String str, String str2) {
        e1.h hVar = e1.h.f17049c;
        this.f21035e = hVar;
        this.f21036f = hVar;
        this.j = e1.c.f17030i;
        this.f21041l = 1;
        this.f21042m = 30000L;
        this.f21045p = -1L;
        this.f21047r = 1;
        this.f21031a = str;
        this.f21033c = str2;
    }

    public final long a() {
        int i9;
        long scalb;
        if (this.f21032b == 1 && (i9 = this.f21040k) > 0) {
            if (this.f21041l == 2) {
                scalb = this.f21042m * i9;
            } else {
                scalb = Math.scalb((float) this.f21042m, i9 - 1);
            }
            return Math.min(18000000L, scalb) + this.f21043n;
        }
        long j = 0;
        if (c()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = this.f21043n;
            if (j4 == 0) {
                j4 = this.f21037g + currentTimeMillis;
            }
            long j9 = this.f21039i;
            long j10 = this.f21038h;
            if (j9 != j10) {
                if (j4 == 0) {
                    j = j9 * (-1);
                }
                return j4 + j10 + j;
            }
            if (j4 != 0) {
                j = j10;
            }
            return j4 + j;
        }
        long j11 = this.f21043n;
        if (j11 == 0) {
            j11 = System.currentTimeMillis();
        }
        return j11 + this.f21037g;
    }

    public final boolean b() {
        return !e1.c.f17030i.equals(this.j);
    }

    public final boolean c() {
        if (this.f21038h != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && C1613j.class == obj.getClass()) {
                C1613j c1613j = (C1613j) obj;
                if (this.f21037g == c1613j.f21037g && this.f21038h == c1613j.f21038h && this.f21039i == c1613j.f21039i && this.f21040k == c1613j.f21040k && this.f21042m == c1613j.f21042m && this.f21043n == c1613j.f21043n && this.f21044o == c1613j.f21044o && this.f21045p == c1613j.f21045p && this.f21046q == c1613j.f21046q && this.f21031a.equals(c1613j.f21031a) && this.f21032b == c1613j.f21032b && this.f21033c.equals(c1613j.f21033c)) {
                    String str = this.f21034d;
                    if (str != null) {
                        if (!str.equals(c1613j.f21034d)) {
                            return false;
                        }
                    } else if (c1613j.f21034d != null) {
                        return false;
                    }
                    if (this.f21035e.equals(c1613j.f21035e) && this.f21036f.equals(c1613j.f21036f) && this.j.equals(c1613j.j) && this.f21041l == c1613j.f21041l && this.f21047r == c1613j.f21047r) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int c3 = z.c(this.f21033c, (AbstractC2128h.b(this.f21032b) + (this.f21031a.hashCode() * 31)) * 31, 31);
        String str = this.f21034d;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int hashCode = (this.f21036f.hashCode() + ((this.f21035e.hashCode() + ((c3 + i9) * 31)) * 31)) * 31;
        long j = this.f21037g;
        int i10 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j4 = this.f21038h;
        int i11 = (i10 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j9 = this.f21039i;
        int b9 = (AbstractC2128h.b(this.f21041l) + ((((this.j.hashCode() + ((i11 + ((int) (j9 ^ (j9 >>> 32)))) * 31)) * 31) + this.f21040k) * 31)) * 31;
        long j10 = this.f21042m;
        int i12 = (b9 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f21043n;
        int i13 = (i12 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f21044o;
        int i14 = (i13 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
        long j13 = this.f21045p;
        return AbstractC2128h.b(this.f21047r) + ((((i14 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f21046q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("{WorkSpec: "), this.f21031a, "}");
    }
}
