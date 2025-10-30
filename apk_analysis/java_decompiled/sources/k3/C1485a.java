package k3;

import N3.A;
import j3.E0;
import java.util.Arrays;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485a {

    /* renamed from: a, reason: collision with root package name */
    public final long f19914a;

    /* renamed from: b, reason: collision with root package name */
    public final E0 f19915b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19916c;

    /* renamed from: d, reason: collision with root package name */
    public final A f19917d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19918e;

    /* renamed from: f, reason: collision with root package name */
    public final E0 f19919f;

    /* renamed from: g, reason: collision with root package name */
    public final int f19920g;

    /* renamed from: h, reason: collision with root package name */
    public final A f19921h;

    /* renamed from: i, reason: collision with root package name */
    public final long f19922i;
    public final long j;

    public C1485a(long j, E0 e02, int i9, A a5, long j4, E0 e03, int i10, A a9, long j9, long j10) {
        this.f19914a = j;
        this.f19915b = e02;
        this.f19916c = i9;
        this.f19917d = a5;
        this.f19918e = j4;
        this.f19919f = e03;
        this.f19920g = i10;
        this.f19921h = a9;
        this.f19922i = j9;
        this.j = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1485a.class == obj.getClass()) {
            C1485a c1485a = (C1485a) obj;
            if (this.f19914a == c1485a.f19914a && this.f19916c == c1485a.f19916c && this.f19918e == c1485a.f19918e && this.f19920g == c1485a.f19920g && this.f19922i == c1485a.f19922i && this.j == c1485a.j && M4.a.l(this.f19915b, c1485a.f19915b) && M4.a.l(this.f19917d, c1485a.f19917d) && M4.a.l(this.f19919f, c1485a.f19919f) && M4.a.l(this.f19921h, c1485a.f19921h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f19914a), this.f19915b, Integer.valueOf(this.f19916c), this.f19917d, Long.valueOf(this.f19918e), this.f19919f, Integer.valueOf(this.f19920g), this.f19921h, Long.valueOf(this.f19922i), Long.valueOf(this.j)});
    }
}
