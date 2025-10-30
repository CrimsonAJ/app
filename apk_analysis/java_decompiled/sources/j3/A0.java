package j3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class A0 extends v0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f19227b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19228c;

    public A0() {
        this.f19227b = false;
        this.f19228c = false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A0) {
            A0 a02 = (A0) obj;
            if (this.f19228c == a02.f19228c && this.f19227b == a02.f19227b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f19227b), Boolean.valueOf(this.f19228c)});
    }

    public A0(boolean z9) {
        this.f19227b = true;
        this.f19228c = z9;
    }
}
