package q2;

import android.os.Bundle;
import android.os.Parcelable;
import com.anilab.domain.model.LatestVersion;
import java.io.Serializable;
import u0.InterfaceC2036g;

/* renamed from: q2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1886o implements InterfaceC2036g {

    /* renamed from: a, reason: collision with root package name */
    public final LatestVersion f22265a;

    public C1886o(LatestVersion latestVersion) {
        this.f22265a = latestVersion;
    }

    public static final C1886o fromBundle(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(C1886o.class.getClassLoader());
        if (bundle.containsKey("version")) {
            if (!Parcelable.class.isAssignableFrom(LatestVersion.class) && !Serializable.class.isAssignableFrom(LatestVersion.class)) {
                throw new UnsupportedOperationException(LatestVersion.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            LatestVersion latestVersion = (LatestVersion) bundle.get("version");
            if (latestVersion != null) {
                return new C1886o(latestVersion);
            }
            throw new IllegalArgumentException("Argument \"version\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"version\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1886o) && kotlin.jvm.internal.h.a(this.f22265a, ((C1886o) obj).f22265a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f22265a.hashCode();
    }

    public final String toString() {
        return "UpdateFragmentArgs(version=" + this.f22265a + ")";
    }
}
