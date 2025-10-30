package A6;

import u0.z;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static final j f510c = new j(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f511a;

    /* renamed from: b, reason: collision with root package name */
    public final int f512b;

    public j(int i9, int i10) {
        this.f511a = i9;
        this.f512b = i10;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(j.class.getSimpleName());
        sb.append("[position = ");
        sb.append(this.f511a);
        sb.append(", length = ");
        return z.g(sb, this.f512b, "]");
    }
}
