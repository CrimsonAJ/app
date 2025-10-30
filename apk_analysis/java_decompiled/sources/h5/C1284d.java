package h5;

import android.animation.TimeInterpolator;
import u0.z;

/* renamed from: h5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1284d {

    /* renamed from: a, reason: collision with root package name */
    public long f17932a;

    /* renamed from: b, reason: collision with root package name */
    public long f17933b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterpolator f17934c;

    /* renamed from: d, reason: collision with root package name */
    public int f17935d;

    /* renamed from: e, reason: collision with root package name */
    public int f17936e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f17934c;
        if (timeInterpolator != null) {
            return timeInterpolator;
        }
        return AbstractC1281a.f17926b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1284d)) {
            return false;
        }
        C1284d c1284d = (C1284d) obj;
        if (this.f17932a != c1284d.f17932a || this.f17933b != c1284d.f17933b || this.f17935d != c1284d.f17935d || this.f17936e != c1284d.f17936e) {
            return false;
        }
        return a().getClass().equals(c1284d.a().getClass());
    }

    public final int hashCode() {
        long j = this.f17932a;
        long j4 = this.f17933b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31)) * 31) + this.f17935d) * 31) + this.f17936e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C1284d.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f17932a);
        sb.append(" duration: ");
        sb.append(this.f17933b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.f17935d);
        sb.append(" repeatMode: ");
        return z.g(sb, this.f17936e, "}\n");
    }
}
