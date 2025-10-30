package F5;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f2461a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2462b;

    public b(float f9, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f2461a;
            f9 += ((b) cVar).f2462b;
        }
        this.f2461a = cVar;
        this.f2462b = f9;
    }

    @Override // F5.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f2461a.a(rectF) + this.f2462b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2461a.equals(bVar.f2461a) && this.f2462b == bVar.f2462b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2461a, Float.valueOf(this.f2462b)});
    }
}
