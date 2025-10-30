package l3;

import java.util.Arrays;

/* renamed from: l3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1559h {

    /* renamed from: e, reason: collision with root package name */
    public static final C1559h f20402e = new C1559h(-1, -1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f20403a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20404b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20405c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20406d;

    public C1559h(int i9, int i10, int i11) {
        int i12;
        this.f20403a = i9;
        this.f20404b = i10;
        this.f20405c = i11;
        if (l4.y.F(i11)) {
            i12 = l4.y.x(i11, i10);
        } else {
            i12 = -1;
        }
        this.f20406d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559h)) {
            return false;
        }
        C1559h c1559h = (C1559h) obj;
        if (this.f20403a == c1559h.f20403a && this.f20404b == c1559h.f20404b && this.f20405c == c1559h.f20405c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f20403a), Integer.valueOf(this.f20404b), Integer.valueOf(this.f20405c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f20403a + ", channelCount=" + this.f20404b + ", encoding=" + this.f20405c + ']';
    }
}
