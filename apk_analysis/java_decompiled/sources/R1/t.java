package R1;

import android.os.Bundle;
import android.os.Parcelable;
import co.notix.R;
import com.anilab.domain.model.MovieDownload;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class t implements u0.D {

    /* renamed from: a, reason: collision with root package name */
    public final MovieDownload f6555a;

    public t(MovieDownload movieDownload) {
        this.f6555a = movieDownload;
    }

    @Override // u0.D
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(MovieDownload.class);
        Parcelable parcelable = this.f6555a;
        if (isAssignableFrom) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("movieDownload", parcelable);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(MovieDownload.class)) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("movieDownload", (Serializable) parcelable);
            return bundle;
        }
        throw new UnsupportedOperationException(MovieDownload.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    @Override // u0.D
    public final int b() {
        return R.id.goToSelectSubtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof t) && kotlin.jvm.internal.h.a(this.f6555a, ((t) obj).f6555a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6555a.hashCode();
    }

    public final String toString() {
        return "GoToSelectSubtitle(movieDownload=" + this.f6555a + ")";
    }
}
