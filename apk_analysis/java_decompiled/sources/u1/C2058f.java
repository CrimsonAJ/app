package u1;

import android.graphics.drawable.BitmapDrawable;

/* renamed from: u1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2058f {

    /* renamed from: a, reason: collision with root package name */
    public final BitmapDrawable f23582a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23583b;

    public C2058f(BitmapDrawable bitmapDrawable, boolean z9) {
        this.f23582a = bitmapDrawable;
        this.f23583b = z9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2058f) {
                C2058f c2058f = (C2058f) obj;
                if (this.f23582a.equals(c2058f.f23582a) && this.f23583b == c2058f.f23583b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f23582a.hashCode() * 31;
        if (this.f23583b) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return hashCode + i9;
    }
}
