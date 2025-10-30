package q3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f22347a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f22348b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22349c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22350d;

    public t(int i9, int i10, int i11, byte[] bArr) {
        this.f22347a = i9;
        this.f22348b = bArr;
        this.f22349c = i10;
        this.f22350d = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t.class == obj.getClass()) {
            t tVar = (t) obj;
            if (this.f22347a == tVar.f22347a && this.f22349c == tVar.f22349c && this.f22350d == tVar.f22350d && Arrays.equals(this.f22348b, tVar.f22348b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f22348b) + (this.f22347a * 31)) * 31) + this.f22349c) * 31) + this.f22350d;
    }
}
