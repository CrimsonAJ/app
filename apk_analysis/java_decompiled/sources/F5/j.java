package F5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f2507a;

    public j(float f9) {
        this.f2507a = f9;
    }

    @Override // F5.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f2507a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && this.f2507a == ((j) obj).f2507a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2507a)});
    }
}
