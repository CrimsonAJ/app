package j3;

import java.util.Arrays;
import l4.AbstractC1566a;

/* loaded from: classes.dex */
public final class y0 extends v0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f19766b;

    /* renamed from: c, reason: collision with root package name */
    public final float f19767c;

    public y0(int i9) {
        AbstractC1566a.g("maxStars must be a positive integer", i9 > 0);
        this.f19766b = i9;
        this.f19767c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        if (this.f19766b != y0Var.f19766b || this.f19767c != y0Var.f19767c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19766b), Float.valueOf(this.f19767c)});
    }

    public y0(int i9, float f9) {
        boolean z9 = false;
        AbstractC1566a.g("maxStars must be a positive integer", i9 > 0);
        if (f9 >= 0.0f && f9 <= i9) {
            z9 = true;
        }
        AbstractC1566a.g("starRating is out of range [0, maxStars]", z9);
        this.f19766b = i9;
        this.f19767c = f9;
    }
}
