package e2;

import android.os.Bundle;
import u0.InterfaceC2036g;

/* loaded from: classes.dex */
public final class f implements InterfaceC2036g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17107a;

    public f(boolean z9) {
        this.f17107a = z9;
    }

    public static final f fromBundle(Bundle bundle) {
        boolean z9;
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(f.class.getClassLoader());
        if (bundle.containsKey("isPin")) {
            z9 = bundle.getBoolean("isPin");
        } else {
            z9 = false;
        }
        return new f(z9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && this.f17107a == ((f) obj).f17107a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f17107a) {
            return 1231;
        }
        return 1237;
    }

    public final String toString() {
        return "MyListActionBottomSheetArgs(isPin=" + this.f17107a + ")";
    }
}
