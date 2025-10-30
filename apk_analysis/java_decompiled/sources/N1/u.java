package N1;

import android.os.Bundle;
import android.os.Parcelable;
import com.anilab.domain.model.Shortcut;
import java.io.Serializable;
import u0.InterfaceC2036g;

/* loaded from: classes.dex */
public final class u implements InterfaceC2036g {

    /* renamed from: a, reason: collision with root package name */
    public final Shortcut f4874a;

    public u(Shortcut shortcut) {
        this.f4874a = shortcut;
    }

    public static final u fromBundle(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(u.class.getClassLoader());
        if (bundle.containsKey("shortcut")) {
            if (!Parcelable.class.isAssignableFrom(Shortcut.class) && !Serializable.class.isAssignableFrom(Shortcut.class)) {
                throw new UnsupportedOperationException(Shortcut.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Shortcut shortcut = (Shortcut) bundle.get("shortcut");
            if (shortcut != null) {
                return new u(shortcut);
            }
            throw new IllegalArgumentException("Argument \"shortcut\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"shortcut\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && kotlin.jvm.internal.h.a(this.f4874a, ((u) obj).f4874a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4874a.hashCode();
    }

    public final String toString() {
        return "MovieListFragmentArgs(shortcut=" + this.f4874a + ")";
    }
}
