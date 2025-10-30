package R3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f6581a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6583c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6584d;

    public b(String str, int i9, int i10, String str2) {
        this.f6581a = str;
        this.f6582b = str2;
        this.f6583c = i9;
        this.f6584d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f6583c == bVar.f6583c && this.f6584d == bVar.f6584d && M4.a.l(this.f6581a, bVar.f6581a) && M4.a.l(this.f6582b, bVar.f6582b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6581a, this.f6582b, Integer.valueOf(this.f6583c), Integer.valueOf(this.f6584d)});
    }
}
