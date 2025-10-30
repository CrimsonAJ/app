package d2;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import u0.InterfaceC2036g;

/* renamed from: d2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1109c implements InterfaceC2036g {

    /* renamed from: a, reason: collision with root package name */
    public final String f16776a;

    public C1109c(String str) {
        this.f16776a = str;
    }

    public static final C1109c fromBundle(Bundle bundle) {
        kotlin.jvm.internal.h.e(bundle, "bundle");
        bundle.setClassLoader(C1109c.class.getClassLoader());
        if (bundle.containsKey("full_detail")) {
            String string = bundle.getString("full_detail");
            if (string != null) {
                return new C1109c(string);
            }
            throw new IllegalArgumentException("Argument \"full_detail\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"full_detail\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1109c) && kotlin.jvm.internal.h.a(this.f16776a, ((C1109c) obj).f16776a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16776a.hashCode();
    }

    public final String toString() {
        return AbstractC0953k1.q(new StringBuilder("FullDetailDialogArgs(fullDetail="), this.f16776a, ")");
    }
}
