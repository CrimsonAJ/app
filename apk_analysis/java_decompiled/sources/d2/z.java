package d2;

import android.os.Bundle;
import android.os.Parcelable;
import co.notix.R;
import com.anilab.domain.model.Movie;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class z implements u0.D {

    /* renamed from: a, reason: collision with root package name */
    public final Movie f16826a;

    public z(Movie movie) {
        this.f16826a = movie;
    }

    @Override // u0.D
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Movie.class);
        Parcelable parcelable = this.f16826a;
        if (isAssignableFrom) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("movie", parcelable);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(Movie.class)) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("movie", (Serializable) parcelable);
            return bundle;
        }
        throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    @Override // u0.D
    public final int b() {
        return R.id.goToRating;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof z) && kotlin.jvm.internal.h.a(this.f16826a, ((z) obj).f16826a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16826a.hashCode();
    }

    public final String toString() {
        return "GoToRating(movie=" + this.f16826a + ")";
    }
}
