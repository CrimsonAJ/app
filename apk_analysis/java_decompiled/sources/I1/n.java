package I1;

import android.os.Bundle;
import android.os.Parcelable;
import co.notix.R;
import com.anilab.domain.model.Movie;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.io.Serializable;
import u0.D;

/* loaded from: classes.dex */
public final class n implements D {

    /* renamed from: a, reason: collision with root package name */
    public final Movie f3438a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3439b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3440c;

    public n(Movie movie, String str, String str2) {
        kotlin.jvm.internal.h.e(movie, "movie");
        this.f3438a = movie;
        this.f3439b = str;
        this.f3440c = str2;
    }

    @Override // u0.D
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Movie.class);
        Parcelable parcelable = this.f3438a;
        if (isAssignableFrom) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("movie", parcelable);
        } else if (Serializable.class.isAssignableFrom(Movie.class)) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("movie", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(Movie.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putString("parentId", this.f3439b);
        bundle.putString("childId", this.f3440c);
        return bundle;
    }

    @Override // u0.D
    public final int b() {
        return R.id.goToDetail;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (kotlin.jvm.internal.h.a(this.f3438a, nVar.f3438a) && kotlin.jvm.internal.h.a(this.f3439b, nVar.f3439b) && kotlin.jvm.internal.h.a(this.f3440c, nVar.f3440c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f3438a.hashCode() * 31;
        int i9 = 0;
        String str = this.f3439b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = (hashCode2 + hashCode) * 31;
        String str2 = this.f3440c;
        if (str2 != null) {
            i9 = str2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GoToDetail(movie=");
        sb.append(this.f3438a);
        sb.append(", parentId=");
        sb.append(this.f3439b);
        sb.append(", childId=");
        return AbstractC0953k1.q(sb, this.f3440c, ")");
    }
}
