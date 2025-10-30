package d2;

import android.os.Bundle;
import android.os.Parcelable;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Serializable;
import u0.InterfaceC2036g;

/* loaded from: classes.dex */
public final class x implements InterfaceC2036g {

    /* renamed from: a, reason: collision with root package name */
    public final Movie f16822a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16823b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16824c;

    public x(Movie movie, String str, String str2) {
        this.f16822a = movie;
        this.f16823b = str;
        this.f16824c = str2;
    }

    public static final x fromBundle(Bundle bundle) {
        String str;
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(x.class.getClassLoader());
        if (bundle.containsKey("movie")) {
            if (!Parcelable.class.isAssignableFrom(Movie.class) && !Serializable.class.isAssignableFrom(Movie.class)) {
                throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Movie movie = (Movie) bundle.get("movie");
            if (movie != null) {
                String str2 = null;
                if (bundle.containsKey("parentId")) {
                    str = bundle.getString("parentId");
                } else {
                    str = null;
                }
                if (bundle.containsKey("childId")) {
                    str2 = bundle.getString("childId");
                }
                return new x(movie, str, str2);
            }
            throw new IllegalArgumentException("Argument \"movie\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (kotlin.jvm.internal.h.a(this.f16822a, xVar.f16822a) && kotlin.jvm.internal.h.a(this.f16823b, xVar.f16823b) && kotlin.jvm.internal.h.a(this.f16824c, xVar.f16824c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f16822a.hashCode() * 31;
        int i9 = 0;
        String str = this.f16823b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        String str2 = this.f16824c;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovieDetailFragmentArgs(movie=");
        sb.append(this.f16822a);
        sb.append(", parentId=");
        sb.append(this.f16823b);
        sb.append(", childId=");
        return AbstractC0953k1.q(sb, this.f16824c, ")");
    }
}
