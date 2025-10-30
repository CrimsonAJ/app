package n2;

import android.os.Bundle;
import android.os.Parcelable;
import com.anilab.domain.model.MovieDownload;
import java.io.Serializable;
import u0.InterfaceC2036g;

/* renamed from: n2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1617c implements InterfaceC2036g {

    /* renamed from: a, reason: collision with root package name */
    public final MovieDownload f21053a;

    public C1617c(MovieDownload movieDownload) {
        this.f21053a = movieDownload;
    }

    public static final C1617c fromBundle(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(C1617c.class.getClassLoader());
        if (bundle.containsKey("movieDownload")) {
            if (!Parcelable.class.isAssignableFrom(MovieDownload.class) && !Serializable.class.isAssignableFrom(MovieDownload.class)) {
                throw new UnsupportedOperationException(MovieDownload.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            MovieDownload movieDownload = (MovieDownload) bundle.get("movieDownload");
            if (movieDownload != null) {
                return new C1617c(movieDownload);
            }
            throw new IllegalArgumentException("Argument \"movieDownload\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"movieDownload\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1617c) && kotlin.jvm.internal.h.a(this.f21053a, ((C1617c) obj).f21053a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21053a.hashCode();
    }

    public final String toString() {
        return "BottomSheetSelectSubtitleArgs(movieDownload=" + this.f21053a + ")";
    }
}
