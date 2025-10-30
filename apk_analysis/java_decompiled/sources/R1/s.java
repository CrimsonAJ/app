package R1;

import android.os.Bundle;
import android.os.Parcelable;
import com.anilab.domain.model.Movie;
import java.io.Serializable;
import u0.InterfaceC2036g;

/* loaded from: classes.dex */
public final class s implements InterfaceC2036g {

    /* renamed from: a, reason: collision with root package name */
    public final Movie f6554a;

    public s(Movie movie) {
        this.f6554a = movie;
    }

    public static final s fromBundle(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(s.class.getClassLoader());
        if (bundle.containsKey("movie")) {
            if (!Parcelable.class.isAssignableFrom(Movie.class) && !Serializable.class.isAssignableFrom(Movie.class)) {
                throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Movie movie = (Movie) bundle.get("movie");
            if (movie != null) {
                return new s(movie);
            }
            throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof s) && kotlin.jvm.internal.h.a(this.f6554a, ((s) obj).f6554a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6554a.hashCode();
    }

    public final String toString() {
        return "DownloadFragmentArgs(movie=" + this.f6554a + ")";
    }
}
