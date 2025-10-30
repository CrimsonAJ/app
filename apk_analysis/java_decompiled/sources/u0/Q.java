package u0;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class Q extends T {

    /* renamed from: r, reason: collision with root package name */
    public final Class f23441r;

    public Q(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            try {
                this.f23441r = Class.forName("[L" + cls.getName() + ';');
                return;
            } catch (ClassNotFoundException e8) {
                throw new RuntimeException(e8);
            }
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // u0.T
    public final Object a(String str, Bundle bundle) {
        return (Serializable[]) z.d(bundle, "bundle", str, "key", str);
    }

    @Override // u0.T
    public final String b() {
        return this.f23441r.getName();
    }

    @Override // u0.T
    public final Object d(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
    @Override // u0.T
    public final void e(Bundle bundle, String key, Object obj) {
        ?? r42 = (Serializable[]) obj;
        kotlin.jvm.internal.h.e(key, "key");
        this.f23441r.cast(r42);
        bundle.putSerializable(key, r42);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q.class.equals(obj.getClass())) {
            return kotlin.jvm.internal.h.a(this.f23441r, ((Q) obj).f23441r);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23441r.hashCode();
    }
}
