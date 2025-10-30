package i2;

import android.os.Bundle;
import android.os.Parcelable;
import com.anilab.domain.model.Movie;
import java.io.Serializable;
import u0.InterfaceC2036g;

/* loaded from: classes.dex */
public final class g implements InterfaceC2036g {

    /* renamed from: a, reason: collision with root package name */
    public final Movie f18460a;

    public g(Movie movie) {
        this.f18460a = movie;
    }

    public static final g fromBundle(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(g.class.getClassLoader());
        if (bundle.containsKey("movie")) {
            if (!Parcelable.class.isAssignableFrom(Movie.class) && !Serializable.class.isAssignableFrom(Movie.class)) {
                throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Movie movie = (Movie) bundle.get("movie");
            if (movie != null) {
                return new g(movie);
            }
            throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && kotlin.jvm.internal.h.a(this.f18460a, ((g) obj).f18460a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18460a.hashCode();
    }

    public final String toString() {
        return "BottomSheetRatingArgs(movie=" + this.f18460a + ")";
    }
}
