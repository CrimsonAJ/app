package G;

import android.content.res.Resources;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f2618a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f2619b;

    public i(Resources resources, Resources.Theme theme) {
        this.f2618a = resources;
        this.f2619b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            if (this.f2618a.equals(iVar.f2618a) && Objects.equals(this.f2619b, iVar.f2619b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f2618a, this.f2619b);
    }
}
