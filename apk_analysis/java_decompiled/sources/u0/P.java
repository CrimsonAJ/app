package u0;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class P extends T {

    /* renamed from: r, reason: collision with root package name */
    public final Class f23440r;

    public P(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }
        this.f23440r = cls;
    }

    @Override // u0.T
    public final Object a(String str, Bundle bundle) {
        return z.d(bundle, "bundle", str, "key", str);
    }

    @Override // u0.T
    public final String b() {
        return this.f23440r.getName();
    }

    @Override // u0.T
    public final Object d(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // u0.T
    public final void e(Bundle bundle, String key, Object obj) {
        kotlin.jvm.internal.h.e(key, "key");
        this.f23440r.cast(obj);
        if (obj != null && !(obj instanceof Parcelable)) {
            if (obj instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) obj);
                return;
            }
            return;
        }
        bundle.putParcelable(key, (Parcelable) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && P.class.equals(obj.getClass())) {
            return kotlin.jvm.internal.h.a(this.f23440r, ((P) obj).f23440r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23440r.hashCode();
    }
}
