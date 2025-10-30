package I1;

import android.os.Bundle;
import co.notix.R;
import u0.D;

/* loaded from: classes.dex */
public final class p implements D {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3442a;

    public p(boolean z9) {
        this.f3442a = z9;
    }

    @Override // u0.D
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isPin", this.f3442a);
        return bundle;
    }

    @Override // u0.D
    public final int b() {
        return R.id.showMyListAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof p) && this.f3442a == ((p) obj).f3442a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3442a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return "ShowMyListAction(isPin=" + this.f3442a + ")";
    }
}
