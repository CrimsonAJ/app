package A1;

import android.graphics.Bitmap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f8a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9b;

    public c(Bitmap bitmap, Map map) {
        this.f8a = bitmap;
        this.f9b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (kotlin.jvm.internal.h.a(this.f8a, cVar.f8a) && kotlin.jvm.internal.h.a(this.f9b, cVar.f9b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f9b.hashCode() + (this.f8a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.f8a + ", extras=" + this.f9b + ')';
    }
}
