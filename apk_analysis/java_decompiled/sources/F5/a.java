package F5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f2460a;

    public a(float f9) {
        this.f2460a = f9;
    }

    @Override // F5.c
    public final float a(RectF rectF) {
        return this.f2460a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f2460a == ((a) obj).f2460a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2460a)});
    }
}
