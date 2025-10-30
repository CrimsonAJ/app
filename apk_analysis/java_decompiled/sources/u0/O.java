package u0;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class O extends T {

    /* renamed from: r, reason: collision with root package name */
    public final Class f23439r;

    public O(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls)) {
            try {
                this.f23439r = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException(e8);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
    }

    @Override // u0.T
    public final Object a(String str, Bundle bundle) {
        return (Parcelable[]) z.d(bundle, "bundle", str, "key", str);
    }

    @Override // u0.T
    public final String b() {
        return this.f23439r.getName();
    }

    @Override // u0.T
    public final Object d(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // u0.T
    public final void e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        kotlin.jvm.internal.h.e(key, "key");
        this.f23439r.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && O.class.equals(obj.getClass())) {
            return kotlin.jvm.internal.h.a(this.f23439r, ((O) obj).f23439r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23439r.hashCode();
    }
}
