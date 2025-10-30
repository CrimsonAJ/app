package H2;

import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f3004a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3005b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3006c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3007d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3008e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3009f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f3010g;

    public e(int i9, int i10, int i11, long j, List list, List list2, List list3) {
        this.f3004a = i9;
        this.f3005b = i10;
        this.f3006c = i11;
        this.f3007d = j;
        this.f3008e = list;
        this.f3009f = list2;
        this.f3010g = list3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f3004a != eVar.f3004a || this.f3005b != eVar.f3005b || this.f3006c != eVar.f3006c || this.f3007d != eVar.f3007d || !this.f3008e.equals(eVar.f3008e) || !this.f3009f.equals(eVar.f3009f) || !this.f3010g.equals(eVar.f3010g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9 = ((((this.f3004a * 31) + this.f3005b) * 31) + this.f3006c) * 31;
        long j = this.f3007d;
        return this.f3010g.hashCode() + ((this.f3009f.hashCode() + ((this.f3008e.hashCode() + ((i9 + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommentList(page=" + this.f3004a + ", limit=" + this.f3005b + ", totalPages=" + this.f3006c + ", count=" + this.f3007d + ", result=" + this.f3008e + ", users=" + this.f3009f + ", votes=" + this.f3010g + ")";
    }
}
