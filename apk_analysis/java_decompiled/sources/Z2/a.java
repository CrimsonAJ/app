package Z2;

import w.AbstractC2128h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8948a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8949b;

    public a(long j, int i9) {
        if (i9 != 0) {
            this.f8948a = i9;
            this.f8949b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (AbstractC2128h.a(this.f8948a, aVar.f8948a) && this.f8949b == aVar.f8949b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b9 = (AbstractC2128h.b(this.f8948a) ^ 1000003) * 1000003;
        long j = this.f8949b;
        return b9 ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i9 = this.f8948a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        str = "null";
                    } else {
                        str = "INVALID_PAYLOAD";
                    }
                } else {
                    str = "FATAL_ERROR";
                }
            } else {
                str = "TRANSIENT_ERROR";
            }
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return A0.a.o(sb, this.f8949b, "}");
    }
}
