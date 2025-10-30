package b2;

import android.os.Bundle;
import android.os.Parcelable;
import co.notix.R;
import com.anilab.domain.model.Shortcut;
import java.io.Serializable;
import u0.D;

/* renamed from: b2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595h implements D {

    /* renamed from: a, reason: collision with root package name */
    public final Shortcut f10489a;

    public C0595h(Shortcut shortcut) {
        this.f10489a = shortcut;
    }

    @Override // u0.D
    public final Bundle a() {
        Bundle bundle = new Bundle();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Shortcut.class);
        Parcelable parcelable = this.f10489a;
        if (isAssignableFrom) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("shortcut", parcelable);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(Shortcut.class)) {
            kotlin.jvm.internal.h.c(parcelable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("shortcut", (Serializable) parcelable);
            return bundle;
        }
        throw new UnsupportedOperationException(Shortcut.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
    }

    @Override // u0.D
    public final int b() {
        return R.id.hostToSpotlight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C0595h) && kotlin.jvm.internal.h.a(this.f10489a, ((C0595h) obj).f10489a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10489a.hashCode();
    }

    public final String toString() {
        return "HostToSpotlight(shortcut=" + this.f10489a + ")";
    }
}
