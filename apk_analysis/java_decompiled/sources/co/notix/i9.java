package co.notix;

/* loaded from: classes.dex */
public final class i9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12441a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12442b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12443c;

    public i9(long j, Object obj, boolean z9) {
        this.f12441a = j;
        this.f12442b = obj;
        this.f12443c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9)) {
            return false;
        }
        i9 i9Var = (i9) obj;
        return this.f12441a == i9Var.f12441a && kotlin.jvm.internal.h.a(this.f12442b, i9Var.f12442b) && this.f12443c == i9Var.f12443c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        long j = this.f12441a;
        int i9 = ((int) (j ^ (j >>> 32))) * 31;
        Object obj = this.f12442b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = (i9 + hashCode) * 31;
        boolean z9 = this.f12443c;
        int i11 = z9;
        if (z9 != 0) {
            i11 = 1;
        }
        return i10 + i11;
    }

    public final String toString() {
        return "DiskEntry(timestamp=" + this.f12441a + ", data=" + this.f12442b + ", error=" + this.f12443c + ')';
    }
}
