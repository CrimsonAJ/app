package I1;

import android.os.Bundle;
import android.os.Parcelable;
import co.notix.R;
import com.anilab.domain.model.LatestVersion;
import java.io.Serializable;
import u0.D;

/* loaded from: classes.dex */
public final class o implements D {

    /* renamed from: a, reason: collision with root package name */
    public final LatestVersion f3441a;

    public o(LatestVersion version) {
        kotlin.jvm.internal.h.e(version, "version");
        this.f3441a = version;
    }

    @Override // u0.D
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(LatestVersion.class);
        Parcelable parcelable = this.f3441a;
        if (isAssignableFrom) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("version", parcelable);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(LatestVersion.class)) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("version", (Serializable) parcelable);
            return bundle;
        }
        throw new UnsupportedOperationException(LatestVersion.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    @Override // u0.D
    public final int b() {
        return R.id.gotoUpdate;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o) && kotlin.jvm.internal.h.a(this.f3441a, ((o) obj).f3441a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3441a.hashCode();
    }

    public final String toString() {
        return "GotoUpdate(version=" + this.f3441a + ")";
    }
}
