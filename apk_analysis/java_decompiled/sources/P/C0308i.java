package P;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: P.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0308i {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayCutout f5611a;

    public C0308i(DisplayCutout displayCutout) {
        this.f5611a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0308i.class == obj.getClass()) {
            return Objects.equals(this.f5611a, ((C0308i) obj).f5611a);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f5611a.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f5611a + "}";
    }
}
