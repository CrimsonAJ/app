package L1;

import com.anilab.domain.model.LatestVersion;

/* loaded from: classes.dex */
public final class G implements H {

    /* renamed from: a, reason: collision with root package name */
    public final LatestVersion f4463a;

    public G(LatestVersion latestVersion) {
        this.f4463a = latestVersion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof G) && kotlin.jvm.internal.h.a(this.f4463a, ((G) obj).f4463a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4463a.hashCode();
    }

    public final String toString() {
        return "Update(latestVersion=" + this.f4463a + ")";
    }
}
