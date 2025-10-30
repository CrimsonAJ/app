package w1;

import android.graphics.drawable.Drawable;
import u1.EnumC2057e;

/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2133d extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f24008a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24009b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC2057e f24010c;

    public C2133d(Drawable drawable, boolean z9, EnumC2057e enumC2057e) {
        this.f24008a = drawable;
        this.f24009b = z9;
        this.f24010c = enumC2057e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2133d) {
            C2133d c2133d = (C2133d) obj;
            if (kotlin.jvm.internal.h.a(this.f24008a, c2133d.f24008a) && this.f24009b == c2133d.f24009b && this.f24010c == c2133d.f24010c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = this.f24008a.hashCode() * 31;
        if (this.f24009b) {
            i9 = 1231;
        } else {
            i9 = 1237;
        }
        return this.f24010c.hashCode() + ((hashCode + i9) * 31);
    }
}
