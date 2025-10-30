package H2;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f2982a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2983b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2984c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2985d;

    public b(int i9, int i10, int i11, String str) {
        this.f2982a = str;
        this.f2983b = i9;
        this.f2984c = i10;
        this.f2985d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (kotlin.jvm.internal.h.a(this.f2982a, bVar.f2982a) && this.f2983b == bVar.f2983b && this.f2984c == bVar.f2984c && this.f2985d == bVar.f2985d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f2982a.hashCode() * 31) + this.f2983b) * 31) + this.f2984c) * 31) + this.f2985d;
    }

    public final String toString() {
        return "CalendarItem(dayOfWeek=" + this.f2982a + ", date=" + this.f2983b + ", month=" + this.f2984c + ", year=" + this.f2985d + ")";
    }
}
