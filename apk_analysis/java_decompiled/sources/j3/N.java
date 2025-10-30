package j3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class N extends v0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19450b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19451c;

    public N() {
        this.f19450b = false;
        this.f19451c = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof N) {
            N n7 = (N) obj;
            if (this.f19451c == n7.f19451c && this.f19450b == n7.f19450b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19450b), Boolean.valueOf(this.f19451c)});
    }

    public N(boolean z9) {
        this.f19450b = true;
        this.f19451c = z9;
    }
}
