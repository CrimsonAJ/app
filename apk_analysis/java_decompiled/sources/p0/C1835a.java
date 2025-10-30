package p0;

import android.os.Build;
import android.text.TextUtils;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1835a {

    /* renamed from: a, reason: collision with root package name */
    public d f22101a;

    public C1835a(String str, int i9, int i10) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    d dVar = new d(str, i9, i10);
                    AbstractC1836b.d(str, i9, i10);
                    this.f22101a = dVar;
                    return;
                }
                this.f22101a = new d(str, i9, i10);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1835a)) {
            return false;
        }
        return this.f22101a.equals(((C1835a) obj).f22101a);
    }

    public final int hashCode() {
        return this.f22101a.hashCode();
    }
}
