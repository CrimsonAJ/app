package V1;

import android.os.Bundle;
import android.os.Parcelable;
import com.anilab.domain.model.FilterConfig;
import com.anilab.domain.model.Genre;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import u0.InterfaceC2036g;

/* loaded from: classes.dex */
public final class k implements InterfaceC2036g {

    /* renamed from: a, reason: collision with root package name */
    public final FilterConfig f7632a;

    /* renamed from: b, reason: collision with root package name */
    public final FilterConfig f7633b;

    /* renamed from: c, reason: collision with root package name */
    public final FilterConfig f7634c;

    /* renamed from: d, reason: collision with root package name */
    public final Genre[] f7635d;

    public k(FilterConfig filterConfig, FilterConfig filterConfig2, FilterConfig filterConfig3, Genre[] genreArr) {
        this.f7632a = filterConfig;
        this.f7633b = filterConfig2;
        this.f7634c = filterConfig3;
        this.f7635d = genreArr;
    }

    public static final k fromBundle(Bundle bundle) {
        Genre[] genreArr;
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(k.class.getClassLoader());
        if (bundle.containsKey("type")) {
            if (!Parcelable.class.isAssignableFrom(FilterConfig.class) && !Serializable.class.isAssignableFrom(FilterConfig.class)) {
                throw new UnsupportedOperationException(FilterConfig.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            FilterConfig filterConfig = (FilterConfig) bundle.get("type");
            if (filterConfig != null) {
                if (bundle.containsKey("status")) {
                    if (!Parcelable.class.isAssignableFrom(FilterConfig.class) && !Serializable.class.isAssignableFrom(FilterConfig.class)) {
                        throw new UnsupportedOperationException(FilterConfig.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    FilterConfig filterConfig2 = (FilterConfig) bundle.get("status");
                    if (filterConfig2 != null) {
                        if (bundle.containsKey("order")) {
                            if (!Parcelable.class.isAssignableFrom(FilterConfig.class) && !Serializable.class.isAssignableFrom(FilterConfig.class)) {
                                throw new UnsupportedOperationException(FilterConfig.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                            }
                            FilterConfig filterConfig3 = (FilterConfig) bundle.get("order");
                            if (filterConfig3 != null) {
                                if (bundle.containsKey("genres")) {
                                    Parcelable[] parcelableArray = bundle.getParcelableArray("genres");
                                    if (parcelableArray != null) {
                                        ArrayList arrayList = new ArrayList(parcelableArray.length);
                                        for (Parcelable parcelable : parcelableArray) {
                                            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type com.anilab.domain.model.Genre");
                                            arrayList.add((Genre) parcelable);
                                        }
                                        genreArr = (Genre[]) arrayList.toArray(new Genre[0]);
                                    } else {
                                        genreArr = null;
                                    }
                                    if (genreArr != null) {
                                        return new k(filterConfig, filterConfig2, filterConfig3, genreArr);
                                    }
                                    throw new IllegalArgumentException("Argument \"genres\" is marked as non-null but was passed a null value.");
                                }
                                throw new IllegalArgumentException("Required argument \"genres\" is missing and does not have an android:defaultValue");
                            }
                            throw new IllegalArgumentException("Argument \"order\" is marked as non-null but was passed a null value.");
                        }
                        throw new IllegalArgumentException("Required argument \"order\" is missing and does not have an android:defaultValue");
                    }
                    throw new IllegalArgumentException("Argument \"status\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"status\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"type\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"type\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kotlin.jvm.internal.h.a(this.f7632a, kVar.f7632a) && kotlin.jvm.internal.h.a(this.f7633b, kVar.f7633b) && kotlin.jvm.internal.h.a(this.f7634c, kVar.f7634c) && kotlin.jvm.internal.h.a(this.f7635d, kVar.f7635d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7634c.hashCode() + ((this.f7633b.hashCode() + (this.f7632a.hashCode() * 31)) * 31)) * 31) + Arrays.hashCode(this.f7635d);
    }

    public final String toString() {
        return "FilterResultFragmentArgs(type=" + this.f7632a + ", status=" + this.f7633b + ", order=" + this.f7634c + ", genres=" + Arrays.toString(this.f7635d) + ")";
    }
}
