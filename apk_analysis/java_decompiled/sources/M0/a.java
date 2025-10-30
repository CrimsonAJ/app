package M0;

import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public final class a implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4675a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4676b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4677c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4678d;

    public a(String from, int i9, int i10, String to) {
        h.e(from, "from");
        h.e(to, "to");
        this.f4675a = i9;
        this.f4676b = i10;
        this.f4677c = from;
        this.f4678d = to;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a other = (a) obj;
        h.e(other, "other");
        int i9 = this.f4675a - other.f4675a;
        if (i9 == 0) {
            return this.f4676b - other.f4676b;
        }
        return i9;
    }
}
