package U1;

import android.os.Bundle;
import android.os.Parcelable;
import co.notix.R;
import com.anilab.domain.model.FilterConfig;
import com.anilab.domain.model.Genre;
import java.io.Serializable;
import java.util.Arrays;
import u0.D;

/* loaded from: classes.dex */
public final class i implements D {

    /* renamed from: a, reason: collision with root package name */
    public final FilterConfig f7264a;

    /* renamed from: b, reason: collision with root package name */
    public final FilterConfig f7265b;

    /* renamed from: c, reason: collision with root package name */
    public final FilterConfig f7266c;

    /* renamed from: d, reason: collision with root package name */
    public final Genre[] f7267d;

    public i(FilterConfig filterConfig, FilterConfig filterConfig2, FilterConfig filterConfig3, Genre[] genreArr) {
        this.f7264a = filterConfig;
        this.f7265b = filterConfig2;
        this.f7266c = filterConfig3;
        this.f7267d = genreArr;
    }

    @Override // u0.D
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(FilterConfig.class);
        Parcelable parcelable = this.f7264a;
        if (isAssignableFrom) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("type", parcelable);
        } else if (Serializable.class.isAssignableFrom(FilterConfig.class)) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("type", (Serializable) parcelable);
        } else {
            throw new UnsupportedOperationException(FilterConfig.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        boolean isAssignableFrom2 = Parcelable.class.isAssignableFrom(FilterConfig.class);
        Parcelable parcelable2 = this.f7265b;
        if (isAssignableFrom2) {
            kotlin.jvm.internal.h.c(parcelable2, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("status", parcelable2);
        } else if (Serializable.class.isAssignableFrom(FilterConfig.class)) {
            kotlin.jvm.internal.h.c(parcelable2, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("status", (Serializable) parcelable2);
        } else {
            throw new UnsupportedOperationException(FilterConfig.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        boolean isAssignableFrom3 = Parcelable.class.isAssignableFrom(FilterConfig.class);
        Parcelable parcelable3 = this.f7266c;
        if (isAssignableFrom3) {
            kotlin.jvm.internal.h.c(parcelable3, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("order", parcelable3);
        } else if (Serializable.class.isAssignableFrom(FilterConfig.class)) {
            kotlin.jvm.internal.h.c(parcelable3, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("order", (Serializable) parcelable3);
        } else {
            throw new UnsupportedOperationException(FilterConfig.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putParcelableArray("genres", this.f7267d);
        return bundle;
    }

    @Override // u0.D
    public final int b() {
        return R.id.goToFilterResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (kotlin.jvm.internal.h.a(this.f7264a, iVar.f7264a) && kotlin.jvm.internal.h.a(this.f7265b, iVar.f7265b) && kotlin.jvm.internal.h.a(this.f7266c, iVar.f7266c) && kotlin.jvm.internal.h.a(this.f7267d, iVar.f7267d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7266c.hashCode() + ((this.f7265b.hashCode() + (this.f7264a.hashCode() * 31)) * 31)) * 31) + Arrays.hashCode(this.f7267d);
    }

    public final String toString() {
        return "GoToFilterResult(type=" + this.f7264a + ", status=" + this.f7265b + ", order=" + this.f7266c + ", genres=" + Arrays.toString(this.f7267d) + ")";
    }
}
