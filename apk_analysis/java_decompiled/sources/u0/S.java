package u0;

import android.os.Bundle;
import java.io.Serializable;

/* loaded from: classes.dex */
public class S extends T {

    /* renamed from: r, reason: collision with root package name */
    public final Class f23442r;

    public S(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (!cls.isEnum()) {
                this.f23442r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }

    @Override // u0.T
    public final Object a(String str, Bundle bundle) {
        return (Serializable) z.d(bundle, "bundle", str, "key", str);
    }

    @Override // u0.T
    public String b() {
        return this.f23442r.getName();
    }

    @Override // u0.T
    public final void e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        kotlin.jvm.internal.h.e(key, "key");
        kotlin.jvm.internal.h.e(value, "value");
        this.f23442r.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        return kotlin.jvm.internal.h.a(this.f23442r, ((S) obj).f23442r);
    }

    @Override // u0.T
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Serializable d(String value) {
        kotlin.jvm.internal.h.e(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f23442r.hashCode();
    }

    public S(int i9, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f23442r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
