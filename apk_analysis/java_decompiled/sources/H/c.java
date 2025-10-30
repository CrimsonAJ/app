package H;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f2913e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2914a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2915b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2916c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2917d;

    public c(int i9, int i10, int i11, int i12) {
        this.f2914a = i9;
        this.f2915b = i10;
        this.f2916c = i11;
        this.f2917d = i12;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f2914a, cVar2.f2914a), Math.max(cVar.f2915b, cVar2.f2915b), Math.max(cVar.f2916c, cVar2.f2916c), Math.max(cVar.f2917d, cVar2.f2917d));
    }

    public static c b(int i9, int i10, int i11, int i12) {
        if (i9 == 0 && i10 == 0 && i11 == 0 && i12 == 0) {
            return f2913e;
        }
        return new c(i9, i10, i11, i12);
    }

    public static c c(Insets insets) {
        int i9;
        int i10;
        int i11;
        int i12;
        i9 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return b(i9, i10, i11, i12);
    }

    public final Insets d() {
        return b.b(this.f2914a, this.f2915b, this.f2916c, this.f2917d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2917d == cVar.f2917d && this.f2914a == cVar.f2914a && this.f2916c == cVar.f2916c && this.f2915b == cVar.f2915b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f2914a * 31) + this.f2915b) * 31) + this.f2916c) * 31) + this.f2917d;
    }

    public final String toString() {
        return "Insets{left=" + this.f2914a + ", top=" + this.f2915b + ", right=" + this.f2916c + ", bottom=" + this.f2917d + '}';
    }
}
