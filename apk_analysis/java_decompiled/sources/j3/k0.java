package j3;

import java.util.Arrays;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class k0 extends v0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f19662b;

    public k0() {
        this.f19662b = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0)) {
            return false;
        }
        if (this.f19662b != ((k0) obj).f19662b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19662b)});
    }

    public k0(float f9) {
        AbstractC1566a.g("percent must be in the range of [0, 100]", f9 >= 0.0f && f9 <= 100.0f);
        this.f19662b = f9;
    }
}
